import os
import sys
sys.path.append("/home/xiao1i/FUNDED_NISL_nni/")
import tensorflow as tf
from dpu_utils.utils import run_and_debug
from tf2_gnn.cli_utils import get_train_cli_arg_parser, run_train_from_args
# import nni

gpus = tf.config.experimental.list_physical_devices(device_type='GPU')
for gpu in gpus:
    tf.config.experimental.set_memory_growth(gpu, True)

def run():
    # nni_config()
    parser = get_train_cli_arg_parser()
    args, potential_hyperdrive_args = parser.parse_known_args()

    hyperdrive_hyperparameter_overrides = None
    if args.hyperdrive_arg_parse and len(potential_hyperdrive_args) % 2 == 0:

        hyperdrive_hyperparameter_overrides = {
            param.replace("--", ""): value
            for param, value in zip(potential_hyperdrive_args[::2], potential_hyperdrive_args[1::2])
        }
    elif len(potential_hyperdrive_args) > 0:

        args = parser.parse_args()

    os.environ["TF_CPP_MIN_LOG_LEVEL"] = "1"
    tf.get_logger().setLevel("ERROR")

    run_and_debug(
        lambda: run_train_from_args(args, hyperdrive_hyperparameter_overrides), args.debug
    )

def nni_config():
    json_file = "/home/nisl1/nisl8121/hf/GNN/hh/tf2-gnn-master-nni/tf2_gnn/cli_utils/default_hypers/GraphBinaryClassification_RGIN.json"

    params = {"model_params":{\
     "gnn_aggregation_function": "sum",\
     "gnn_message_activation_function": "relu",\
     "gnn_hidden_dim": 16
     }}
    try:
        model_params = nni.get_next_parameter()
        params["model_params"].update(model_params)
        if "graph_aggregation_hidden_layers" in model_params.keys():
            params["model_params"]["graph_aggregation_hidden_layers"] = \
                [model_params["graph_aggregation_hidden_layers"]]
    except Warning:
        pass

    with open(json_file, 'w') as f:
        json.dump(params, f)
        print("参数配置", params)

if __name__ == "__main__":
    run()
