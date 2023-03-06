# #!/usr/bin/env python3
# import os
# from typing import Callable
#
# import tensorflow as tf
# from dpu_utils.utils import run_and_debug, RichPath
#
# import sys
# sys.path.append('/home/garyhu/gnn_web_cp/FUNDED')
# import FUNDED.data.data.data_preprocess as DataSplit
# import numpy as np
#
# from FUNDED import DataFold, GraphDataset, GraphTaskModel
# from FUNDED.cli_utils.training_utils import get_model_and_dataset
#
#
# def test(
#     model: GraphTaskModel,
#     dataset: GraphDataset,
#     dataset2: GraphDataset,
#     files_test,
#     log_fun: Callable[[str], None],
#     quiet: bool = False,
# ):
#     log_fun("== Running on test dataset")
#     test_data = dataset.get_tensorflow_dataset(DataFold.TEST)
#     test_data2 = dataset2.get_tensorflow_dataset(DataFold.TEST)
#     _, _, test_results = model.run_one_epoch_new_test(test_data, test_data2, training=False, quiet=quiet)
#     log_fun(str(test_results))
#     log_fun(files_test)
#     log_fun(str(np.argmax(test_results, axis=-1)))
#     # l = np.argmax(test_results, axis=-1)
#     print("prediction-start")
#     for i in zip(files_test, np.argmax(test_results, axis=-1).tolist()[0]):
#         filename = i[0]
#         label = i[1]
#         print(filename+"-"+str(label))
#
#
# def run_from_args(args) -> None:
#     files_test = DataSplit.Preprocess_test(args.DATA_PATH)
#     data_path = RichPath.create(os.path.split(args.DATA_PATH)[0] + '/tem_' + os.path.split(args.DATA_PATH)[1] + '/ast',
#                                 args.azure_info)
#     # second path
#     data_path_2 = RichPath.create(
#         os.path.split(args.DATA_PATH)[0] + '/tem_' + os.path.split(args.DATA_PATH)[1] + '/cdfg', args.azure_info)
#     dataset, model = get_model_and_dataset(
#         msg_passing_implementation=None,
#         task_name=None,
#         data_path=data_path,
#         trained_model_file=args.TRAINED_MODEL,
#         cli_data_hyperparameter_overrides=args.data_param_override,
#         cli_model_hyperparameter_overrides=args.model_param_override,
#         folds_to_load={DataFold.TEST},
#     )
#     dataset2, model2 = get_model_and_dataset(
#         msg_passing_implementation=None,
#         task_name=None,
#         data_path=data_path_2,
#         trained_model_file=args.TRAINED_MODEL,
#         cli_data_hyperparameter_overrides=args.data_param_override,
#         cli_model_hyperparameter_overrides=args.model_param_override,
#         folds_to_load={DataFold.TEST},
#     )
#     test(model, dataset, dataset2, files_test, lambda msg: print(msg), quiet=args.quiet)
#
#
# def run():
#     import argparse
#
#     parser = argparse.ArgumentParser(description="Test a GNN model.")
#     parser.add_argument(
#         "TRAINED_MODEL",
#         type=str,
#         help="File to load model from (determines model architecture & task).",
#     )
#     parser.add_argument("DATA_PATH", type=str, help="Directory containing the task data.")
#     parser.add_argument(
#         "--model-params-override",
#         dest="model_param_override",
#         type=str,
#         help="JSON dictionary overriding model hyperparameter values.",
#     )
#     parser.add_argument(
#         "--data-params-override",
#         dest="data_param_override",
#         type=str,
#         help="JSON dictionary overriding data hyperparameter values.",
#     )
#     parser.add_argument(
#         "--azure-info",
#         dest="azure_info",
#         type=str,
#         default="azure_auth.json",
#         help="Azure authentication information file (JSON).",
#     )
#     parser.add_argument(
#         "--quiet", dest="quiet", action="store_true", help="Generate less output during testing.",
#     )
#     parser.add_argument("--debug", dest="debug", action="store_true", help="Enable debug routines")
#     args = parser.parse_args()
#
#     # Shut up tensorflow:
#     os.environ['TF_CPP_MIN_LOG_LEVEL'] = '1'
#     tf.get_logger().setLevel("ERROR")
#     import warnings
#     warnings.simplefilter("ignore")
#
#     run_and_debug(lambda: run_from_args(args), args.debug)
#
#
# if __name__ == "__main__":
#     run()

import pickle

# 重点是rb和r的区别，rb是打开2进制文件，文本文件用r
f = open('./trained_model/GGNN_GraphBinaryClassification__2023-02-01_05-36-00_f1 = 0.656_best.pkl','rb')
data = pickle.load(f)
print(data)