"""Graph neural network layer using feature-wise linear modulation to compute edge messages."""
from typing import Dict, List, Any

import tensorflow as tf
from dpu_utils.tf2utils import MLP

from .gnn_edge_mlp import GNN_Edge_MLP
from .message_passing import MessagePassing, MessagePassingInput,register_message_passing_implementation
from tf2_gnn.utils.constants import SMALL_NUMBER


@register_message_passing_implementation
class GNN_FiLM(GNN_Edge_MLP):

    @classmethod
    def get_default_hyperparameters(cls):
        these_hypers = {
            "use_target_state_as_input": False,
            "normalize_by_num_incoming": False,
            "num_edge_MLP_hidden_layers": 0,
            "film_parameter_MLP_hidden_layers": [],
        }
        mp_hypers = super().get_default_hyperparameters()
        mp_hypers.update(these_hypers)
        return mp_hypers

    def __init__(self, params: Dict[str, Any], **kwargs):
        super().__init__(params, **kwargs)
        self._film_parameter_MLP_hidden_layers = params["film_parameter_MLP_hidden_layers"]

        self._edge_type_film_layer_computations: List[tf.keras.layers.Layer] = []

    def build(self, input_shapes: MessagePassingInput):
        node_embedding_shapes = input_shapes.node_embeddings
        adjacency_list_shapes = input_shapes.adjacency_lists
        num_edge_types = len(adjacency_list_shapes)

        with tf.name_scope(self._name):
            for i in range(num_edge_types):
                with tf.name_scope(f"edge_type_{i}-FiLM"):
                    film_mlp = MLP(
                        out_size=2 * self._hidden_dim,
                        hidden_layers=self._film_parameter_MLP_hidden_layers,
                    )
                    film_mlp.build(tf.TensorShape((None, node_embedding_shapes[-1])))
                    self._edge_type_film_layer_computations.append(film_mlp)

        super().build(input_shapes)

    def _message_function(
        self,
        edge_source_states: tf.Tensor,
        edge_target_states: tf.Tensor,
        num_incoming_to_node_per_message: tf.Tensor,
        edge_type_idx: int,
        training: bool,
    ) -> tf.Tensor:
        messages = super()._message_function(
            edge_source_states,
            edge_target_states,
            num_incoming_to_node_per_message,
            edge_type_idx,
            training,
        )

        film_weights = self._edge_type_film_layer_computations[edge_type_idx](
            edge_target_states, training
        )
        per_message_film_gamma_weights = film_weights[:, : self._hidden_dim]  # Shape [E, D]
        per_message_film_beta_weights = film_weights[:, self._hidden_dim :]  # Shape [E, D]

        modulated_messages = (
            per_message_film_gamma_weights * messages + per_message_film_beta_weights
        )
        return modulated_messages


if __name__ == "__main__":
    import doctest

    doctest.testmod(optionflags=doctest.ELLIPSIS)
