"""Graph neural network layer using MLPs to compute edge messages."""
from typing import Dict, List, Any

import tensorflow as tf
from dpu_utils.tf2utils import MLP

from .message_passing import MessagePassing, MessagePassingInput, register_message_passing_implementation
from tf2_gnn.utils.constants import SMALL_NUMBER


@register_message_passing_implementation
class GNN_Edge_MLP(MessagePassing):

    @classmethod
    def get_default_hyperparameters(cls):
        these_hypers = {
            "use_target_state_as_input": True,
            "normalize_by_num_incoming": False,
            "num_edge_MLP_hidden_layers": 1,
        }
        mp_hypers = super().get_default_hyperparameters()
        mp_hypers.update(these_hypers)
        return mp_hypers

    def __init__(self, params: Dict[str, Any], **kwargs):
        super().__init__(params, **kwargs)
        self._use_target_state_as_input = params["use_target_state_as_input"]
        self._normalize_by_num_incoming = params["normalize_by_num_incoming"]
        self._num_edge_MLP_hidden_layers = params["num_edge_MLP_hidden_layers"]
        self._edge_type_mlps: List[tf.keras.layers.Layer] = []

    def build(self, input_shapes: MessagePassingInput):
        node_embedding_shapes = input_shapes.node_embeddings
        adjacency_list_shapes = input_shapes.adjacency_lists
        num_edge_types = len(adjacency_list_shapes)

        if self._use_target_state_as_input:
            edge_layer_input_size = 2 * node_embedding_shapes[-1]
        else:
            edge_layer_input_size = node_embedding_shapes[-1]

        for i in range(num_edge_types):
            with tf.name_scope(f"edge_type_{i}"):
                mlp = MLP(
                    out_size=self._hidden_dim, hidden_layers=self._num_edge_MLP_hidden_layers
                )
                mlp.build(tf.TensorShape((None, edge_layer_input_size)))
            self._edge_type_mlps.append(mlp)

        super().build(input_shapes)

    def _message_function(
        self,
        edge_source_states: tf.Tensor,
        edge_target_states: tf.Tensor,
        num_incoming_to_node_per_message: tf.Tensor,
        edge_type_idx: int,
        training: bool,
    ) -> tf.Tensor:
        if self._use_target_state_as_input:
            edge_mlp_inputs = tf.concat(
                [edge_source_states, edge_target_states], axis=1
            )  # Shape [E, 2*D]
        else:
            edge_mlp_inputs = edge_source_states

        # Actually do the message calculation:
        messages = self._edge_type_mlps[edge_type_idx](edge_mlp_inputs, training)

        if self._normalize_by_num_incoming:
            messages = (
                tf.expand_dims(1.0 / (num_incoming_to_node_per_message + SMALL_NUMBER), axis=-1)
                * messages
            )
        return messages


if __name__ == "__main__":
    import doctest

    doctest.testmod(optionflags=doctest.ELLIPSIS)
