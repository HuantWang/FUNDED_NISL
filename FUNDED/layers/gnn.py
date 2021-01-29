"""GNN Encoder class."""
from typing import Any, Dict, NamedTuple, List, Tuple, Optional

import tensorflow as tf

from FUNDED.utils.param_helpers import get_activation_function
from .message_passing import (
    MessagePassing,
    MessagePassingInput,
    get_message_passing_class,
)
from .graph_global_exchange import (
    GraphGlobalExchangeInput,
    GraphGlobalExchange,
    GraphGlobalMeanExchange,
    GraphGlobalGRUExchange,
    GraphGlobalMLPExchange,
)


class GNNInput(NamedTuple):
    """Input named tuple for the GNN."""

    node_features: tf.Tensor
    adjacency_lists: Tuple[tf.Tensor, ...]
    node_to_graph_map: tf.Tensor
    num_graphs: tf.Tensor


class GNN(tf.keras.layers.Layer):

    @classmethod
    def get_default_hyperparameters(cls, mp_style: Optional[str] = None) -> Dict[str, Any]:
        """Get the default hyperparameter dictionary for the  class."""
        these_hypers = {
            "message_calculation_class": "rgcn",
            "initial_node_representation_activation": "tanh",
            "dense_intermediate_layer_activation": "tanh",
            "num_layers": 4,
            "dense_every_num_layers": 2,
            "residual_every_num_layers": 2,
            "use_inter_layer_layernorm": False,
            "hidden_dim": 12,
            "layer_input_dropout_rate": 0.0,
            "global_exchange_mode": "gru",  # One of "mean", "mlp", "gru"
            "global_exchange_every_num_layers": 2,
            "global_exchange_weighting_fun": "softmax",  # One of "softmax", "sigmoid"
            "global_exchange_num_heads": 4,
            "global_exchange_dropout_rate": 0.2,
        }  # type: Dict[str, Any]
        if mp_style is not None:
            these_hypers["message_calculation_class"] = mp_style
        message_passing_class = get_message_passing_class(
            these_hypers["message_calculation_class"]
        )
        message_passing_hypers = message_passing_class.get_default_hyperparameters()
        message_passing_hypers.update(these_hypers)
        return message_passing_hypers

    def __init__(self, params: Dict[str, Any]):
        """Initialise the layer."""
        super().__init__()
        self._params = params
        self._hidden_dim = params["hidden_dim"]
        self._num_layers = params["num_layers"]
        self._dense_every_num_layers = params["dense_every_num_layers"]
        self._residual_every_num_layers = params["residual_every_num_layers"]
        self._use_inter_layer_layernorm = params["use_inter_layer_layernorm"]
        self._initial_node_representation_activation_fn = get_activation_function(
            params["initial_node_representation_activation"]
        )
        self._dense_intermediate_layer_activation_fn = get_activation_function(
            params["dense_intermediate_layer_activation"]
        )
        self._message_passing_class = get_message_passing_class(
            params["message_calculation_class"]
        )

        if not params["global_exchange_mode"].lower() in {"mean", "mlp", "gru"}:
            raise ValueError(
                f"Unknown global_exchange_mode mode {params['global_exchange_mode']} - has to be one of 'mean', 'mlp', 'gru'!"
            )
        self._global_exchange_mode = params["global_exchange_mode"]
        self._global_exchange_every_num_layers = params["global_exchange_every_num_layers"]
        self._global_exchange_weighting_fun = params["global_exchange_weighting_fun"]
        self._global_exchange_num_heads = params["global_exchange_num_heads"]
        self._global_exchange_dropout_rate = params["global_exchange_dropout_rate"]

        # Layer member variables. To be filled in in the `build` method.
        self._initial_projection_layer: tf.keras.layers.Layer = None
        self._mp_layers: List[MessagePassing] = []
        self._inter_layer_layernorms: List[tf.keras.layers.Layer] = []
        self._dense_layers: Dict[str, tf.keras.layers.Layer] = {}
        self._global_exchange_layers: Dict[str, GraphGlobalExchange] = {}

    def build(self, tensor_shapes: GNNInput):

        initial_node_features_shape: tf.TensorShape = tensor_shapes.node_features
        variable_node_features_shape = tf.TensorShape((None, initial_node_features_shape[1]))
        adjacency_list_shapes = tensor_shapes.adjacency_lists
        embedded_shape = tf.TensorShape((None, self._hidden_dim))

        with tf.name_scope(f"{self._message_passing_class.__name__}_GNN"):
            # Then we construct the layers themselves:
            with tf.name_scope("gnn_initial_node_projection"):
                self._initial_projection_layer = tf.keras.layers.Dense(
                    units=self._hidden_dim,
                    use_bias=False,
                    activation=self._initial_node_representation_activation_fn,
                )
                self._initial_projection_layer.build(variable_node_features_shape)

            # Construct the graph message passing layers.
            for layer_idx in range(self._num_layers):
                with tf.name_scope(f"Layer_{layer_idx}"):
                    with tf.name_scope("MessagePassing"):
                        self._mp_layers.append(
                            self._message_passing_class(self._params)
                        )
                        self._mp_layers[-1].build(
                            MessagePassingInput(embedded_shape, adjacency_list_shapes)
                        )

                    # If required, prepare for a LayerNorm:
                    if self._use_inter_layer_layernorm:
                        with tf.name_scope(f"LayerNorm"):
                            self._inter_layer_layernorms.append(
                                tf.keras.layers.LayerNormalization()
                            )
                            self._inter_layer_layernorms[-1].build(embedded_shape)

                    # Construct the per-node dense layers.
                    if layer_idx % self._dense_every_num_layers == 0:
                        with tf.name_scope(f"Dense"):
                            self._dense_layers[str(layer_idx)] = tf.keras.layers.Dense(
                                units=self._hidden_dim,
                                use_bias=False,
                                activation=self._dense_intermediate_layer_activation_fn,
                            )
                            self._dense_layers[str(layer_idx)].build(embedded_shape)

                    if (
                        layer_idx
                        and layer_idx % self._global_exchange_every_num_layers == 0
                    ):
                        with tf.name_scope(f"Global_Exchange"):
                            if self._global_exchange_mode.lower() == "mean":
                                exchange_layer_class = GraphGlobalMeanExchange
                            elif self._global_exchange_mode.lower() == "gru":
                                exchange_layer_class = GraphGlobalGRUExchange
                            elif self._global_exchange_mode.lower() == "mlp":
                                exchange_layer_class = GraphGlobalMLPExchange
                            exchange_layer = exchange_layer_class(
                                hidden_dim=self._hidden_dim,
                                weighting_fun=self._global_exchange_weighting_fun,
                                num_heads=self._global_exchange_num_heads,
                                dropout_rate=self._global_exchange_dropout_rate,
                            )
                            exchange_layer.build(
                                GraphGlobalExchangeInput(
                                    node_embeddings=tf.TensorShape(
                                        (None, self._hidden_dim)
                                    ),
                                    node_to_graph_map=tf.TensorShape((None,)),
                                    num_graphs=tf.TensorShape(()),
                                )
                            )
                            self._global_exchange_layers[
                                str(layer_idx)
                            ] = exchange_layer

        super().build(tensor_shapes)


        internal_call_input_spec = (
            GNNInput(
                node_features=tf.TensorSpec(shape=variable_node_features_shape, dtype=tf.float32),
                adjacency_lists=tuple(
                    tf.TensorSpec(shape=(None, 2), dtype=tf.int32)
                    for _ in range(len(adjacency_list_shapes))
                ),
                node_to_graph_map=tf.TensorSpec(shape=(None,), dtype=tf.int32),
                num_graphs=tf.TensorSpec(shape=(), dtype=tf.int32),
            ),
            tf.TensorSpec(shape=(), dtype=tf.bool)
        )
        setattr(self, "_internal_call", tf.function(func=self._internal_call, input_signature=internal_call_input_spec))

    def call(self, inputs: GNNInput, training: bool = False, return_all_representations: bool = False):

        cur_node_representations, all_node_representations = self._internal_call(inputs, training)

        if return_all_representations:
            return cur_node_representations, all_node_representations

        return cur_node_representations

    def _internal_call(self, inputs: GNNInput, training: bool = False):
        initial_node_features: tf.Tensor = inputs.node_features
        adjacency_lists = inputs.adjacency_lists
        cur_node_representations = self._initial_projection_layer(initial_node_features)

        # Layer loop.
        last_node_representations = cur_node_representations
        all_node_representations = [cur_node_representations]
        for layer_idx, mp_layer in enumerate(self._mp_layers):
            if training:
                cur_node_representations = tf.nn.dropout(
                    cur_node_representations, rate=self._params["layer_input_dropout_rate"]
                )

            # Pass residuals through:
            if layer_idx % self._residual_every_num_layers == 0:
                tmp = cur_node_representations
                if layer_idx > 0:
                    cur_node_representations += last_node_representations
                    cur_node_representations /= 2
                last_node_representations = tmp

            # Apply this message passing layer.
            cur_node_representations = mp_layer(
                MessagePassingInput(
                    node_embeddings=cur_node_representations, adjacency_lists=adjacency_lists
                ),
                training=training,
            )
            all_node_representations.append(cur_node_representations)

            if layer_idx and layer_idx % self._global_exchange_every_num_layers == 0:
                cur_node_representations = self._global_exchange_layers[str(layer_idx)](
                    GraphGlobalExchangeInput(
                        node_embeddings=cur_node_representations,
                        node_to_graph_map=inputs.node_to_graph_map,
                        num_graphs=inputs.num_graphs,
                    ),
                    training=training,
                )

            # If required, apply a LayerNorm:
            if self._use_inter_layer_layernorm:
                cur_node_representations = self._inter_layer_layernorms[layer_idx](
                    cur_node_representations
                )

            # Apply dense layer, if needed.
            if layer_idx % self._dense_every_num_layers == 0:
                cur_node_representations = self._dense_layers[str(layer_idx)](
                    cur_node_representations, training=training
                )

        return cur_node_representations, all_node_representations


if __name__ == "__main__":
    import doctest

    doctest.testmod(optionflags=doctest.ELLIPSIS)
