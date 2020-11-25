import os

import tensorflow as tf
from dpu_utils.utils import run_and_debug
# import sys
# sys.path.append('/home/wangzheng/nisl/xrz/CCS2/tf2-gnn-master/tf2-gnn-master')
from tf2_gnn.cli_utils import get_train_cli_arg_parser, run_train_from_args

gpus = tf.config.experimental.list_physical_devices(device_type='GPU')
for gpu in gpus:
    tf.config.experimental.set_memory_growth(gpu, True)

def run():
    parser = get_train_cli_arg_parser()
    args, potential_hyperdrive_args = parser.parse_known_args()

    hyperdrive_hyperparameter_overrides = None
    if args.hyperdrive_arg_parse and len(potential_hyperdrive_args) % 2 == 0:
        # Allow parsing params specified as "--key value" as well as "key value"
        hyperdrive_hyperparameter_overrides = {
            param.replace("--", ""): value
            for param, value in zip(potential_hyperdrive_args[::2], potential_hyperdrive_args[1::2])
        }
    elif len(potential_hyperdrive_args) > 0:
        # Reparse to throw standard error message:
        args = parser.parse_args()

    # Make TF less noisy:
    os.environ["TF_CPP_MIN_LOG_LEVEL"] = "1"
    tf.get_logger().setLevel("ERROR")

    run_and_debug(
        lambda: run_train_from_args(args, hyperdrive_hyperparameter_overrides), args.debug
    )


if __name__ == "__main__":
    run()
