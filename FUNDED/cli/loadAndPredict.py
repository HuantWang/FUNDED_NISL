import os
import sys
path = os.path.abspath(os.path.join(os.getcwd(),"../../"))
sys.path.append(path)
import json
import tensorflow as tf
from dpu_utils.utils import run_and_debug
from FUNDED.cli_utils import get_train_cli_arg_parser, run_train_from_args,loadModuleAndPredict
import nni
import warnings
warnings.filterwarnings("ignore")

gpus = tf.config.experimental.list_physical_devices(device_type='GPU')
for gpu in gpus:
    tf.config.experimental.set_memory_growth(gpu, True)

def run():
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
        lambda: loadModuleAndPredict(args, hyperdrive_hyperparameter_overrides), args.debug
    )


if __name__ == "__main__":
    run()
