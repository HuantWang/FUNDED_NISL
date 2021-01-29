"""Message passing layer."""
from abc import abstractmethod
from typing import Dict, List, NamedTuple, Tuple, Any

import tensorflow as tf

from tf2_gnn.utils.param_helpers import get_activation_function, get_aggregation_function


class MessagePassingInput(NamedTuple):
    """A named tuple to hold input to the message passing layer."""

    node_embeddings: tf.Tensor
    adjacency_lists: Tuple[tf.Tensor, ...]


class MessagePassing(tf.keras.layers.Layer):

    @classmethod
    def get_default_hyperparameters(cls):
        return {
            "aggregation_function": "sum",  # One of sum, mean, max, sqrt_n
            "message_activation_function": "relu",  # One of relu, leaky_relu, elu, gelu, tanh
            "hidden_dim": 7,
        }

    def __init__(self, params: Dict[str, Any], **kwargs):
        super().__init__(**kwargs)
        self._hidden_dim = int(params["hidden_dim"])

        aggregation_fn_name = params["aggregation_function"]
        self._aggregation_fn = get_aggregation_function(aggregation_fn_name)

        activation_fn_name = params["message_activation_function"]
        self._activation_fn = get_activation_function(activation_fn_name)

    @abstractmethod
    def _message_function(
        self,
        edge_source_states: tf.Tensor,
        edge_target_states: tf.Tensor,
        num_incoming_to_node_per_message: tf.Tensor,
        edge_type_idx: int,
        training: bool,
    ) -> tf.Tensor:
        pass

    def call(self, inputs: MessagePassingInput, training: bool = False):

        node_embeddings, adjacency_lists = inputs.node_embeddings, inputs.adjacency_lists
        num_nodes = tf.shape(node_embeddings)[0]

        messages_per_type = self._calculate_messages_per_type(
            adjacency_lists, node_embeddings, training
        )

        edge_type_to_message_targets = [
            adjacency_list_for_edge_type[:, 1] for adjacency_list_for_edge_type in adjacency_lists
        ]

        new_node_states = self._compute_new_node_embeddings(
            node_embeddings, messages_per_type, edge_type_to_message_targets, num_nodes, training,
        )  # Shape [V, H]

        return new_node_states

    def _compute_new_node_embeddings(
        self,
        cur_node_embeddings: tf.Tensor,
        messages_per_type: List[tf.Tensor],
        edge_type_to_message_targets: List[tf.Tensor],
        num_nodes: tf.Tensor,
        training: bool,
    ):

        message_targets = tf.concat(edge_type_to_message_targets, axis=0)  # Shape [M]
        messages = tf.concat(messages_per_type, axis=0)  # Shape [M, H]

        aggregated_messages = self._aggregation_fn(
            data=messages, segment_ids=message_targets, num_segments=num_nodes
        )
        return self._activation_fn(aggregated_messages)

    def _calculate_messages_per_type(
        self,
        adjacency_lists: Tuple[tf.Tensor, ...],
        node_embeddings: tf.Tensor,
        training: bool = False,
    ) -> List[tf.Tensor]:
        messages_per_type = []  # list of tensors of messages of shape [E, H]

        # Calculate this once.
        type_to_num_incoming_edges = calculate_type_to_num_incoming_edges(
            node_embeddings, adjacency_lists
        )
        # Collect incoming messages per edge type
        for edge_type_idx, adjacency_list_for_edge_type in enumerate(adjacency_lists):
            edge_sources = adjacency_list_for_edge_type[:, 0]
            edge_targets = adjacency_list_for_edge_type[:, 1]
            edge_source_states = tf.nn.embedding_lookup(
                params=node_embeddings, ids=edge_sources
            )  # Shape [E, H]
            edge_target_states = tf.nn.embedding_lookup(
                params=node_embeddings, ids=edge_targets
            )  # Shape [E, H]

            num_incoming_to_node_per_message = tf.nn.embedding_lookup(
                params=type_to_num_incoming_edges[edge_type_idx, :], ids=edge_targets
            )  # Shape [E, H]

            # Calculate the messages themselves:
            messages = self._message_function(
                edge_source_states,
                edge_target_states,
                num_incoming_to_node_per_message,
                edge_type_idx,
                training,
            )

            messages_per_type.append(messages)
        return messages_per_type


MESSAGE_PASSING_IMPLEMENTATIONS: Dict[str, MessagePassing] = {}

def register_message_passing_implementation(cls):
    """Decorator used to register a message passing class implementation"""
    MESSAGE_PASSING_IMPLEMENTATIONS[cls.__name__.lower()] = cls
    return cls


def calculate_type_to_num_incoming_edges(node_embeddings, adjacency_lists):

    type_to_num_incoming_edges = []
    for edge_type_adjacency_list in adjacency_lists:
        targets = edge_type_adjacency_list[:, 1]
        indices = tf.expand_dims(targets, axis=-1)
        num_incoming_edges = tf.scatter_nd(
            indices=indices,
            updates=tf.ones_like(targets, dtype=tf.float32),
            shape=(tf.shape(node_embeddings)[0],),
        )
        type_to_num_incoming_edges.append(num_incoming_edges)

    return tf.stack(type_to_num_incoming_edges)


if __name__ == "__main__":
    import doctest

    doctest.testmod(optionflags=doctest.ELLIPSIS)
