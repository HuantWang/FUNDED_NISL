"""Graph representation aggregation layer."""
from abc import abstractmethod
from typing import Dict, List, NamedTuple

import tensorflow as tf
from dpu_utils.tf2utils import MLP, get_activation_function_by_name, unsorted_segment_softmax


class NodesToGraphRepresentationInput(NamedTuple):
    """A named tuple to hold input to layers computing graph representations from nodes
    representations."""

    node_embeddings: tf.Tensor
    node_to_graph_map: tf.Tensor
    num_graphs: tf.Tensor


class NodesToGraphRepresentation(tf.keras.layers.Layer):
    """Abstract class to compute graph representations from node representations.

    Throughout we use the following abbreviations in shape descriptions:
        * V: number of nodes (across all graphs)
        * VD: node representation dimension
        * G: number of graphs
        * GD: graph representation dimension
    """

    def __init__(self, graph_representation_size: int, **kwargs):
        super().__init__(**kwargs)
        self._graph_representation_size = graph_representation_size

    @abstractmethod
    def call(self, inputs: NodesToGraphRepresentationInput, training: bool = False):
        """Call the layer.

        Args:
            inputs: A tuple containing two items:
                node_embeddings: float32 tensor of shape [V, VD], the representation of each
                    node in all graphs.
                node_to_graph_map: int32 tensor of shape [V] with values in range [0, G-1],
                    mapping each node to a graph ID.
                num_graphs: int32 scalar, specifying the number G of graphs.
            training: A bool that denotes whether we are in training mode.

        Returns:
            float32 tensor of shape [G, GD]
        """
        pass


class WeightedSumGraphRepresentation(NodesToGraphRepresentation):
    """Layer computing graph representations as weighted sum of node representations.
    The weights are either computed from the original node representations ("self-attentional")
    or by a softmax across the nodes of a graph.
    Supports splitting operation into parallely computed independent "heads" which can focus
    on different aspects.

    Throughout we use the following abbreviations in shape descriptions:
        * V: number of nodes (across all graphs)
        * VD: node representation dimension
        * G: number of graphs
        * GD: graph representation dimension
        * H: number of heads
    """

    def __init__(
        self,
        graph_representation_size: int,
        num_heads: int,
        weighting_fun: str = "softmax",  # One of {"softmax", "sigmoid"}
        scoring_mlp_layers: List[int] = [128],
        scoring_mlp_activation_fun: str = "ReLU",
        scoring_mlp_dropout_rate: float = 0.2,
        transformation_mlp_layers: List[int] = [128],
        transformation_mlp_activation_fun: str = "ReLU",
        transformation_mlp_dropout_rate: float = 0.2,
        **kwargs,
    ):
        """
        Args:
            graph_representation_size: Size of the computed graph representation.
            num_heads: Number of independent heads to use to compute weights.
            weighting_fun: "sigmoid" ([0, 1] weights for each node computed from its
                representation) or "softmax" ([0, 1] weights for each node computed
                from all nodes in same graph).
            scoring_mlp_layers: MLP layer structure for computing raw scores turned into
                weights.
            scoring_mlp_activation_fun: MLP activcation function for computing raw scores
                turned into weights.
            scoring_mlp_dropout_rate: MLP inter-layer dropout rate for computing raw scores
                turned into weights.
            transformation_mlp_layers: MLP layer structure for computing graph representations.
            transformation_mlp_activation_fun: MLP activcation function for computing graph
                representations.
            transformation_mlp_dropout_rate: MLP inter-layer dropout rate for computing graph
                representations.
        """
        super().__init__(graph_representation_size, **kwargs)
        assert (
            graph_representation_size % num_heads == 0
        ), f"Number of heads {num_heads} needs to divide final representation size {graph_representation_size}!"
        assert weighting_fun.lower() in {
            "softmax",
            "sigmoid",
        }, f"Weighting function {weighting_fun} unknown, {{'softmax', 'sigmoid'}} supported."

        self._num_heads = num_heads
        self._weighting_fun = weighting_fun
        self._scoring_mlp_layers = scoring_mlp_layers
        self._scoring_mlp_activation_fun = get_activation_function_by_name(
            scoring_mlp_activation_fun
        )
        self._scoring_mlp_dropout_rate = scoring_mlp_dropout_rate
        self._transformation_mlp_layers = transformation_mlp_layers
        self._transformation_mlp_activation_fun = get_activation_function_by_name(
            transformation_mlp_activation_fun
        )
        self._transformation_mlp_dropout_rate = transformation_mlp_dropout_rate

    def build(self, input_shapes: NodesToGraphRepresentationInput):
        with tf.name_scope("WeightedSumGraphRepresentation"):
            self._scoring_mlp = MLP(
                out_size=self._num_heads,
                hidden_layers=self._scoring_mlp_layers,
                activation_fun=self._scoring_mlp_activation_fun,
                dropout_rate=self._scoring_mlp_dropout_rate,
                name="ScoringMLP",
            )
            self._scoring_mlp.build(tf.TensorShape((None, input_shapes.node_embeddings[-1])))

            self._transformation_mlp = MLP(
                out_size=self._graph_representation_size,
                hidden_layers=self._transformation_mlp_layers,
                activation_fun=self._transformation_mlp_activation_fun,
                dropout_rate=self._transformation_mlp_dropout_rate,
                name="TransformationMLP",
            )
            self._transformation_mlp.build(tf.TensorShape((None, input_shapes.node_embeddings[-1])))

            super().build(input_shapes)

    @tf.function(
        input_signature=(
            NodesToGraphRepresentationInput(
                node_embeddings=tf.TensorSpec(shape=tf.TensorShape((None, None)), dtype=tf.float32),
                node_to_graph_map=tf.TensorSpec(shape=tf.TensorShape((None,)), dtype=tf.int32),
                num_graphs=tf.TensorSpec(shape=(), dtype=tf.int32),
            ),
            tf.TensorSpec(shape=(), dtype=tf.bool),
        )
    )
    def call(self, inputs: NodesToGraphRepresentationInput, training: bool = False):
        # (1) compute weights for each node/head pair:
        scores = self._scoring_mlp(inputs.node_embeddings, training=training)  # Shape [V, H]
        if self._weighting_fun.lower() == "sigmoid":
            weights = tf.nn.sigmoid(scores)  # Shape [V, H]
        elif self._weighting_fun.lower() == "softmax":
            weights_per_head = []
            for head_idx in range(self._num_heads):
                head_scores = scores[:, head_idx]  # Shape [V]
                head_weights = unsorted_segment_softmax(
                    logits=head_scores,
                    segment_ids=inputs.node_to_graph_map,
                    num_segments=inputs.num_graphs,
                )  # Shape [V]
                weights_per_head.append(tf.expand_dims(head_weights, -1))
            weights = tf.concat(weights_per_head, axis=1)  # Shape [V, H]
        else:
            raise ValueError()

        # (2) compute representations for each node/head pair:
        node_reprs = self._transformation_mlp(
            inputs.node_embeddings, training=training
        )  # Shape [V, GD]
        node_reprs = tf.reshape(
            node_reprs,
            shape=(-1, self._num_heads, self._graph_representation_size // self._num_heads),
        )  # Shape [V, H, GD//H]

        # (3) weight representations and aggregate by graph:
        weights = tf.expand_dims(weights, -1)  # Shape [V, H, 1]
        weighted_node_reprs = weights * node_reprs  # Shape [V, H, GD//H]
        weighted_node_reprs = tf.reshape(
            weighted_node_reprs, shape=(-1, self._graph_representation_size)
        )  # Shape [V, GD]
        graph_reprs = tf.math.segment_sum(
            data=weighted_node_reprs, segment_ids=inputs.node_to_graph_map
        )  # Shape [G, GD]

        return graph_reprs
