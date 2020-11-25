"""General task for graph binary classification."""
from typing import Any, Dict, List, Tuple, Optional

import numpy as np
import tensorflow as tf

from tf2_gnn.data import GraphDataset
from tf2_gnn.models import GraphTaskModel
from tf2_gnn.layers import WeightedSumGraphRepresentation, NodesToGraphRepresentationInput


class GraphBinaryClassificationTask(GraphTaskModel):
    @classmethod
    def get_default_hyperparameters(cls, mp_style: Optional[str] = None) -> Dict[str, Any]:
        super_params = super().get_default_hyperparameters(mp_style)
        these_hypers: Dict[str, Any] = {
            "graph_aggregation_num_heads": 16,
            "graph_aggregation_hidden_layers": [128],
            "graph_aggregation_dropout_rate": 0.2,
        }
        super_params.update(these_hypers)
        return super_params

    def __init__(self, params: Dict[str, Any], dataset: GraphDataset, name: str = None):
        super().__init__(params, dataset=dataset, name=name)
        self._node_to_graph_aggregation = None

    def build(self, input_shapes):
        with tf.name_scope(self._name):
            self._node_to_graph_repr_layer = WeightedSumGraphRepresentation(
                graph_representation_size=self._params["graph_aggregation_num_heads"],
                num_heads=self._params["graph_aggregation_num_heads"],
                scoring_mlp_layers=self._params["graph_aggregation_hidden_layers"],
                scoring_mlp_dropout_rate=self._params["graph_aggregation_dropout_rate"],
                transformation_mlp_layers=self._params["graph_aggregation_hidden_layers"],
                transformation_mlp_dropout_rate=self._params["graph_aggregation_dropout_rate"],
            )
            self._node_to_graph_repr_layer.build(
                NodesToGraphRepresentationInput(
                    node_embeddings=tf.TensorShape(
                        (None, input_shapes["node_features"][-1] + self._params["gnn_hidden_dim"])
                    ),
                    node_to_graph_map=tf.TensorShape((None)),
                    num_graphs=tf.TensorShape(()),
                )
            )

            self._graph_repr_to_classification_layer = tf.keras.layers.Dense(
                units=1, activation=tf.nn.sigmoid, use_bias=True
            )
            #change the  self._params["graph_aggregation_num_heads"] to yours
            self._graph_repr_to_classification_layer.build(
                tf.TensorShape((None, self._params["graph_aggregation_num_heads"]*2))
            )
        super().build(input_shapes)

    def compute_task_output(
        self,
        batch_features: Dict[str, tf.Tensor],
        final_node_representations: tf.Tensor,
        training: bool,
    ) -> Any:
        per_graph_results = self._node_to_graph_repr_layer(
            NodesToGraphRepresentationInput(
                node_embeddings=tf.concat(
                    [batch_features["node_features"], final_node_representations], axis=-1
                ),
                node_to_graph_map=batch_features["node_to_graph_map"],
                num_graphs=batch_features["num_graphs_in_batch"],
            )
        )  # Shape [G, graph_aggregation_num_heads]
        per_graph_results = self._graph_repr_to_classification_layer(
            per_graph_results
        )  # Shape [G, 1]

        return tf.squeeze(per_graph_results, axis=-1)

    #New COMPUTE
    def compute_task_output_new(
        self,
        batch_features: Dict[str, tf.Tensor],
        final_node_representations: tf.Tensor,
        batch_features_2: Dict[str, tf.Tensor],
        final_node_representations_2:tf.Tensor,
        training: bool,
    ) -> Any:
        per_graph_results_1 = self._node_to_graph_repr_layer(
            NodesToGraphRepresentationInput(
                node_embeddings=tf.concat(
                    [batch_features["node_features"], final_node_representations], axis=-1
                ),
                node_to_graph_map=batch_features["node_to_graph_map"],
                num_graphs=batch_features["num_graphs_in_batch"],
            )
        )  # Shape [G, graph_aggregation_num_heads]
        #second
        per_graph_results_2 = self._node_to_graph_repr_layer(
            NodesToGraphRepresentationInput(
                node_embeddings=tf.concat(
                    [batch_features_2["node_features"], final_node_representations_2], axis=-1
                ),
                node_to_graph_map=batch_features_2["node_to_graph_map"],
                num_graphs=batch_features_2["num_graphs_in_batch"],
            )
        )  # Shape [G, graph_aggregation_num_heads]
        #concat
        per_graph_results_all=tf.concat([per_graph_results_1, per_graph_results_2], axis=1)

        per_graph_results = self._graph_repr_to_classification_layer(
            per_graph_results_all
        )  # Shape [G, 1]

        return tf.squeeze(per_graph_results, axis=-1)

    def compute_task_metrics(
        self,
        batch_features: Dict[str, tf.Tensor],
        task_output: Any,
        batch_labels: Dict[str, tf.Tensor],
    ) -> Dict[str, tf.Tensor]:
        ce = tf.reduce_mean(
            tf.keras.losses.binary_crossentropy(
                y_true=batch_labels["target_value"], y_pred=task_output, from_logits=False
            )
        )
        TP=0
        FP=0
        TN=0
        FN=0
        for (i,j) in zip(batch_labels["target_value"],tf.math.round(task_output)):
            if i==1:
                if i==j:
                    TP +=1
                    continue
                if i!=j:
                    FP +=1
                    continue
            if i==0:
                if i==j:
                    TN+=1
                    continue
                if i!=j:
                    FN+=1
                    continue

            # accuracy
        num_correct = tf.reduce_sum(
            tf.cast(
                tf.math.equal(batch_labels["target_value"], tf.math.round(task_output)), tf.int32
            )
        )
        num_graphs = tf.cast(batch_features["num_graphs_in_batch"], tf.float32)

        try:
            ACC = (TP + TN) /num_graphs
            Precision = TP / (TP + FP)
            Recall = TP / (TP + FN)
            F1= 2*TP/ (2*TP + FN + FP )
            TPR=TP / (TP + FN)
            FPR= FP / (FP + TN)
            TNR=TN/(FP+TN)
            FNR =FN/(FN+TP)
        except:
            ACC = 0
            Precision = 0
            Recall = 0
            F1= 0
            TPR= 0
            FPR= 0
            TNR= 0
            FNR = 0
            print("Lucky next,go ahead")

        return {
            "loss": ce,
            "batch_acc": tf.cast(num_correct, tf.float32) / num_graphs,
            "batch_precision": Precision,
            "batch_recall": Recall,
            "batch_f1": F1,
            "batch_TPR": TPR,
            "batch_FPR": FPR,
            "batch_TNR": TNR,
            "batch_FNR": FNR,
            "num_correct": num_correct,
            "num_graphs": num_graphs,

        }

    def compute_epoch_metrics(self, task_results: List[Any]) -> Tuple[float, str]:
        total_num_graphs = np.sum(
            batch_task_result["num_graphs"] for batch_task_result in task_results
        )
        total_num_correct = np.sum(
            batch_task_result["num_correct"] for batch_task_result in task_results
        )
        epoch_acc = tf.cast(total_num_correct, tf.float32) / total_num_graphs
        epoch_precision=task_results[0]["batch_precision"]
        epoch_recall=task_results[0]["batch_recall"]
        epoch_f1=task_results[0]["batch_f1"]
        epoch_TPR=task_results[0]["batch_TPR"]
        epoch_FPR=task_results[0]["batch_FPR"]
        epoch_TNR=task_results[0]["batch_TNR"]
        epoch_FNR=task_results[0]["batch_FNR"]

        return -epoch_acc.numpy(), f"Accuracy = {epoch_acc.numpy():.3f}",\
               epoch_precision, f"precision = {epoch_precision:.3f}",epoch_recall, f"recall = {epoch_recall:.3f}"\
            ,epoch_f1, f"f1 = {epoch_f1:.3f}",epoch_TPR, f"TPR = {epoch_TPR:.3f}",epoch_FPR, f"FPR = {epoch_FPR:.3f}",\
               epoch_TNR, f"TNR = {epoch_TNR:.3f}",epoch_FNR, f"FNR = {epoch_FNR:.3f}"
