"""Gated graph neural network layer."""
from typing import Dict, List, Any

import tensorflow as tf

from .message_passing import MessagePassing, MessagePassingInput, register_message_passing_implementation
from .gnn_edge_mlp import GNN_Edge_MLP
from tf2_gnn.utils.constants import SMALL_NUMBER


@register_message_passing_implementation
class GGNN(GNN_Edge_MLP):

    @classmethod
    def get_default_hyperparameters(cls):
        these_hypers = {
            "use_target_state_as_input": False,
            "normalize_by_num_incoming": True,
            "num_edge_MLP_hidden_layers": 0,
        }
        mp_hypers = super().get_default_hyperparameters()
        mp_hypers.update(these_hypers)
        return mp_hypers

    def __init__(self, params: Dict[str, Any], **kwargs):
        super().__init__(params, **kwargs)
        self._recurrent_unit: tf.keras.layers.GRUCell = None

    def build(self, input_shapes: MessagePassingInput):
        node_embedding_shapes = input_shapes.node_embeddings
        self._recurrent_unit = tf.keras.layers.GRUCell(units=self._hidden_dim)
        self._recurrent_unit.build(tf.TensorShape((None, node_embedding_shapes[-1])))
        super().build(input_shapes)

    def _compute_new_node_embeddings(
        self,
        cur_node_embeddings: tf.Tensor,
        messages_per_type: List[tf.Tensor],
        edge_type_to_message_targets: List[tf.Tensor],
        num_nodes: tf.Tensor,
        training: bool,
    ):
        # Let M be the number of messages (sum of all E):
        message_targets = tf.concat(edge_type_to_message_targets, axis=0)  # Shape [M]
        messages = tf.concat(messages_per_type, axis=0)  # Shape [M, H]

        aggregated_messages = self._aggregation_fn(
            data=messages, segment_ids=message_targets, num_segments=num_nodes
        )

        new_node_embeddings, _ = self._recurrent_unit(
            inputs=aggregated_messages,
            states=[cur_node_embeddings],
            training=training)

        return new_node_embeddings

if __name__ == "__main__":
    import doctest

    doctest.testmod(optionflags=doctest.ELLIPSIS)
