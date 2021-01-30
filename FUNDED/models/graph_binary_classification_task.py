"""General task for graph binary classification."""
from typing import Any, Dict, List, Tuple, Optional

import numpy as np
import tensorflow as tf

from FUNDED.data import GraphDataset
from FUNDED.models import GraphTaskModel
from FUNDED.layers import WeightedSumGraphRepresentation, NodesToGraphRepresentationInput
from sklearn.metrics import f1_score, precision_score, recall_score, accuracy_score


class GraphBinaryClassificationTask(GraphTaskModel):
    @classmethod
    def get_default_hyperparameters(cls, mp_style: Optional[str] = None) -> Dict[str, Any]:
        super_params = super().get_default_hyperparameters(mp_style)
        these_hypers: Dict[str, Any] = {
            "graph_aggregation_num_heads": 128,
            "graph_aggregation_hidden_layers": [4],
            "graph_aggregation_dropout_rate": 0.1,
        }
        super_params.update(these_hypers)
        return super_params

    def __init__(self, params: Dict[str, Any], dataset: GraphDataset, name: str = None):
        super().__init__(params, dataset=dataset, name=name)
        self._node_to_graph_aggregation = None

    def build(self, input_shapes):
        with tf.name_scope(self.__class__.__name__):
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
                units=2, activation=tf.nn.sigmoid, use_bias=True
            )
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

        return per_graph_results
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

        return per_graph_results

    def compute_task_metrics(
        self,
        batch_features: Dict[str, tf.Tensor],
        task_output: Any,
        batch_labels: Dict[str, tf.Tensor],
    ) -> Dict[str, tf.Tensor]:
        a=batch_labels["target_value"]
        b=task_output
        ce = tf.reduce_mean(
            tf.keras.losses.binary_crossentropy(
                y_true=batch_labels["target_value"], y_pred=task_output, from_logits=False
            )
        )


        targets = tf.math.argmax(batch_labels["target_value"], 1)
        results = tf.math.argmax(task_output, 1)
        accuracy = accuracy_score(targets,results)
        precision = precision_score(targets,results)
        recall = recall_score(targets,results)
        f1 = f1_score(targets,results)
        tnr = float((accuracy*(recall+precision-recall*precision)-precision*recall)/(recall-2*recall*precision+accuracy*precision))
        fpr = 1- tnr
        tpr = recall
        fnr = 1-recall

        if accuracy==0:
            print(accuracy)

            # accuracy
        num_correct = tf.reduce_sum(
            tf.cast(
                tf.math.equal( tf.math.argmax(batch_labels["target_value"], 1), tf.math.argmax(task_output, 1)), tf.int32
            )
        )
        num_graphs = tf.cast(batch_features["num_graphs_in_batch"], tf.float32)


        return {
            "loss": ce,
            "batch_acc": accuracy,
            "batch_precision": precision,
            "batch_recall": recall,
            "batch_f1": f1,
            "batch_TPR": tpr,
            "batch_FPR": fpr,
            "batch_TNR": tnr,
            "batch_FNR": fnr,
            "num_correct": num_correct,
            "num_graphs": num_graphs,
        }


    def compute_task_metrics_cp(
            self,
            batch_features: Dict[str, tf.Tensor],
            task_output: Any,
            batch_labels: Dict[str, tf.Tensor],
    ) -> Dict[str, tf.Tensor]:

        # clacuilate p-value
        true_label = tf.math.argmax(batch_labels["target_value"])

        num_graphs = tf.cast(batch_features["num_graphs_in_batch"], tf.float32)
        # pvalue
        task_output_cp = tf.zeros([task_output.shape[0], 1])
        for i in range(batch_labels["target_value"].shape[1]):
            label = np.zeros(batch_labels["target_value"].shape[1])
            label[i] = 1
            indices_tem = tf.where(tf.equal(batch_labels["target_value"], label)[:, 0])
            # get probability
            tem = tf.gather(tf.constant(task_output), indices_tem)[:, 0][:, 0]
            #
            for j, tem_pro in zip(indices_tem, tem):
                num = tf.gather_nd(tem, tf.where(tem > tem_pro))
                a = j.numpy()[0] + 1
                p_tem = tf.reshape(tf.cast(tf.subtract(1, tf.size(num) / tf.size(tem), name=None), dtype=tf.float32),
                                   (1, 1))
                part1 = task_output_cp[:int(j.numpy()[0])]
                part2 = task_output_cp[int(j.numpy()[0]) + 1:]
                task_output_cp = tf.concat([part1, p_tem, part2], axis=0)
        # a=tf.reshape(task_output_cp,(1,-1))
        min = tf.nn.top_k(-tf.reshape(task_output_cp,(1,-1)), tf.size(task_output_cp))
        # value = min[1].numpy()[0].reshape(1,-1)
        pindex=min[1].numpy()[0].reshape(1,-1)[:,:int(np.size(task_output_cp)/10)]
        # pindex = tf.reshape(tf.where(condition=task_output_cp < value)[:, 0], (-1, 1))

        return pindex



    def compute_epoch_metrics(self, task_results: List[Any]) -> Tuple[float, str]:
        total_num_graphs = np.sum(
            batch_task_result["num_graphs"] for batch_task_result in task_results
        )
        total_num_correct = np.sum(
            batch_task_result["num_correct"] for batch_task_result in task_results
        )

        epoch_Acc = tf.cast(total_num_correct, tf.float32) / total_num_graphs
        epoch_acc = task_results[-1]["batch_acc"]
        epoch_precision = task_results[-1]["batch_precision"]
        epoch_recall = task_results[-1]["batch_recall"]
        epoch_f1 = task_results[-1]["batch_f1"]
        epoch_TPR = task_results[-1]["batch_TPR"]
        epoch_FPR = task_results[-1]["batch_FPR"]
        epoch_TNR = task_results[-1]["batch_TNR"]
        epoch_FNR = task_results[-1]["batch_FNR"]

        return -epoch_Acc.numpy(), f"Accuracy = {epoch_acc:.3f}",\
               epoch_precision, f"precision = {epoch_precision:.3f}",epoch_recall, f"recall = {epoch_recall:.3f}"\
            ,epoch_f1, f"f1 = {epoch_f1:.3f}",epoch_TPR, f"TPR = {epoch_TPR:.3f}",epoch_FPR, f"FPR = {epoch_FPR:.3f}",\
               epoch_TNR, f"TNR = {epoch_TNR:.3f}",epoch_FNR, f"FNR = {epoch_FNR:.3f}"
