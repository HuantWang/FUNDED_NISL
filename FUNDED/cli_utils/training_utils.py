import json
import os
import random
import re
import sys
import psutil
import time
from typing import Dict, Optional, Callable, Any
import nni
import jsonlines
import numpy as np
import tensorflow as tf
from tensorflow.python.training.tracking import data_structures as tf_data_structures
from dpu_utils.utils import RichPath
from tensorflow_core.python.keras import Sequential
from tensorflow_core.python.keras.layers import Dense

from ..data import DataFold, GraphDataset
from ..layers import get_known_message_passing_classes
from ..models import GraphTaskModel
from .model_utils import save_model, load_weights_verbosely, get_model_and_dataset,get_model_and_dataset_predic
from .task_utils import get_known_tasks
import FUNDED.data.data.data_preprocess as DataSplit

def make_run_id(model_name: str, task_name: str, run_name: Optional[str] = None) -> str:
    """Choose a run ID, based on the --run-name parameter and the current time."""
    if run_name is not None:
        return run_name
    else:
        return "%s_%s__%s" % (model_name, task_name, time.strftime("%Y-%m-%d_%H-%M-%S"))


def log_line(log_file: str, msg: str):
    with open(log_file, "a") as log_fh:
        log_fh.write(msg + "\n")
    print(msg)


 

def train(
    model: GraphTaskModel,
    dataset: GraphDataset,
    dataset2:GraphDataset,
    log_fun: Callable[[str], None],
    run_id: str,
    max_epochs: int,
    patience: int,
    save_dir: str,
    quiet: bool = False,
    aml_run=None,
):
    train_data = dataset.get_tensorflow_dataset(DataFold.TRAIN).prefetch(3)
    valid_data = dataset.get_tensorflow_dataset(DataFold.VALIDATION).prefetch(3)

    train_data_2 = dataset2.get_tensorflow_dataset(DataFold.TRAIN).prefetch(3)
    valid_data_2 = dataset2.get_tensorflow_dataset(DataFold.VALIDATION).prefetch(3)

    # save_file = os.path.join(save_dir, f"{run_id}_best.pkl")

    _, _, initial_valid_results = model.run_one_epoch_new(train_data,train_data_2, training=False, quiet=quiet)
    best_valid_ACC, best_val_stracc,\
        best_valid_Pre, best_val_strpre,\
        best_valid_metric_RE, best_val_strre,\
        best_valid_metric_f1, best_val_strf1,\
        best_valid_metric_TPR, best_val_strtpr,\
        best_valid_metric_FPR, best_val_strfpr,\
        best_valid_metric_TNR, best_val_strtnr,\
        best_valid_metric_FNR, best_val_strfnr,= model.compute_epoch_metrics(initial_valid_results)
    log_fun(f"Initial valid acc: {best_val_stracc}."
            f"Initial valid pre: {best_val_strpre}."
            f"Initial valid re: {best_val_strpre}."
            f"Initial valid f1: {best_val_strf1}."
            f"Initial valid TPR: {best_val_strtpr}."
            f"Initial valid FPR: {best_val_strfpr}."
            f"Initial valid TNR: {best_val_strtnr}."
            f"Initial valid FNR: {best_val_strfnr}.")
    BestValidf1=best_val_strf1
    save_file = os.path.join(save_dir, f"{run_id}_{best_val_strf1}_best.pkl")
    save_model(save_file, model, dataset)
    best_valid_epoch = 0
    train_time_start = time.time()
    for epoch in range(1, 100):
        log_fun(f"== Epoch {epoch}")
        train_loss, train_speed, train_results = model.run_one_epoch_new(
            train_data,train_data_2, training=True, quiet=quiet
        )
        #
        best_TRAIN_ACC, best_TRAIN_stracc, \
        best_TRAIN_Pre, best_TRAIN_strpre, \
        best_TRAIN_metric_RE, best_TRAIN_strre, \
        best_TRAIN_metric_f1, best_TRAIN_strf1, \
        best_TRAIN_metric_TPR, best_TRAIN_strtpr, \
        best_TRAIN_metric_FPR, best_TRAIN_strfpr, \
        best_TRAIN_metric_TNR, best_TRAIN_strtnr, \
        best_TRAIN_metric_FNR, best_TRAIN_strfnr, = model.compute_epoch_metrics(train_results)
        # train_metric, train_metric_string = model.compute_epoch_metrics(train_results)
        log_fun(
            f" Train:  {train_loss:.4f} loss | {best_TRAIN_stracc} | {best_TRAIN_strpre} | {best_TRAIN_strre} | {best_TRAIN_strf1} |"
            f"{best_TRAIN_strtpr} | {best_TRAIN_strfpr} | {best_TRAIN_strtnr} | {best_TRAIN_strfnr} | {train_speed:.2f} graphs/s",
        )
        valid_loss, valid_speed, valid_results = model.run_one_epoch_new(
            valid_data,valid_data_2, training=False, quiet=quiet
        )
        #
        valid_ACC, val_stracc, \
        best_valid_Pre, best_val_strpre, \
        best_valid_metric_RE, best_val_strre, \
        best_valid_metric_f1, best_val_strf1, \
        best_valid_metric_TPR, best_val_strtpr, \
        best_valid_metric_FPR, best_val_strfpr, \
        best_valid_metric_TNR, best_val_strtnr, \
        best_valid_metric_FNR, best_val_strfnr, = model.compute_epoch_metrics(valid_results)

        nni.report_intermediate_result(-valid_ACC)

        log_fun(
            f" Valid:  {valid_loss:.4f} loss | {val_stracc} | {best_val_strpre} | {best_val_strre} | {best_val_strf1} |"
            f"{best_val_strtpr} | {best_val_strfpr} | {best_val_strtnr} | {best_val_strfnr} | {valid_speed:.2f} graphs/s",
        )

        if aml_run is not None:
            aml_run.log("task_train_metric", float(best_TRAIN_ACC))
            aml_run.log("train_speed", float(train_speed))
            aml_run.log("task_valid_metric", float(valid_ACC))
            aml_run.log("valid_speed", float(valid_speed))

        # Save if good enough.
        if best_val_strf1 > BestValidf1:
            log_fun(
                f"  (Best epoch so far, target metric decreased to {best_val_strf1} from {BestValidf1}.)",
            )
            save_file = os.path.join(save_dir, f"{run_id}_{best_val_strf1}_best.pkl")
            save_model(save_file, model, dataset)
            BestValidf1 = best_val_strf1
            best_valid_epoch = epoch
        elif epoch - best_valid_epoch >= patience:
            total_time = time.time() - train_time_start
            log_fun(
                f"Stopping training after {patience} epochs without "
                f"improvement on validation metric.",
            )
            log_fun(f"Training took {total_time}s. Best validation metric: {best_valid_ACC}", )
            break
    return save_file


def unwrap_tf_tracked_data(data: Any) -> Any:
    if isinstance(data, (tf_data_structures.ListWrapper, list)):
        return [unwrap_tf_tracked_data(e) for e in data]
    elif isinstance(data, (tf_data_structures._DictWrapper, dict)):
        return {k: unwrap_tf_tracked_data(v) for k, v in data.items()}
    else:
        return data

def loadModuleAndPredict(args, hyperdrive_hyperparameter_overrides: Dict[str, str] = {}) -> None:
    print(f"this is loadModuleAndPredict-----")
    #loadmoduel地址
    trained_model_path=args.storedModel_path
    args.load_saved_model=trained_model_path
    print(f"thia is trained_model_path :{trained_model_path}")
    os.makedirs(args.save_dir, exist_ok=True)
    run_id = make_run_id(args.model, args.task)
    log_file = os.path.join(args.save_dir, f"{run_id}.log")
    def log(msg):
        log_line(log_file, msg)

    log(f"Setting random seed {args.random_seed}.")
    random.seed(args.random_seed)
    np.random.seed(args.random_seed)
    tf.random.set_seed(args.random_seed)
    #data split
    DataSplit.Preprocess_predict(args.data_path)
    data_path = RichPath.create(os.path.split(args.data_path)[0]+'/tem_'+os.path.split(args.data_path)[1]+'/ast', args.azure_info)
    #second path
    data_path_2 = RichPath.create(os.path.split(args.data_path)[0]+'/tem_'+os.path.split(args.data_path)[1]+'/cdfg', args.azure_info)
    print(f"this is args.load_saved_model:{args.load_saved_model} ")
    print(f"this is data_path:{data_path},data_path_2:{data_path_2}")
    print(f"this is args.model:{args.model}")
    try:
        dataset, model = get_model_and_dataset_predic(
            msg_passing_implementation=args.model,
            task_name=args.task,
            data_path=data_path,
            trained_model_file=args.load_saved_model,
            cli_data_hyperparameter_overrides=args.data_param_override,
            cli_model_hyperparameter_overrides=args.model_param_override,
            task_model_default_hypers_filePath=args.task_model_default_hypers_filePath,
            hyperdrive_hyperparameter_overrides=hyperdrive_hyperparameter_overrides,
            folds_to_load={DataFold.TRAIN, DataFold.VALIDATION,DataFold.TEST},
            load_weights_only=args.load_weights_only,
        )
        #second
        dataset2, model_2 = get_model_and_dataset_predic(
            msg_passing_implementation=args.model,
            task_name=args.task,
            data_path=data_path_2,
            trained_model_file=args.load_saved_model,
            cli_data_hyperparameter_overrides=args.data_param_override,
            cli_model_hyperparameter_overrides=args.model_param_override,
            task_model_default_hypers_filePath=args.task_model_default_hypers_filePath,
            hyperdrive_hyperparameter_overrides=hyperdrive_hyperparameter_overrides,
            folds_to_load={DataFold.TRAIN, DataFold.VALIDATION,DataFold.TEST},
            load_weights_only=args.load_weights_only,
        )
    except ValueError as err:
        print("error! in traububg_utils.py line199")
        print(err.args)
    log(f"Restoring best model state from {trained_model_path}.")
    load_weights_verbosely(trained_model_path, model)
    
    data_path = RichPath.create(
            os.path.split(args.data_path)[0] + '/tem_' + os.path.split(args.data_path)[1] + '/ast', args.azure_info)
    data_path_2 = RichPath.create(
            os.path.split(args.data_path)[0] + '/tem_' + os.path.split(args.data_path)[1] + '/cdfg', args.azure_info)
    print(f"this is data_path:{data_path},data_path_2:{data_path_2} ")
    log("== Running on test dataset")
    log(f"Loading data from {data_path}.")
    results=[]

#在data_preprocess.py中数据处理将输入的全部数据都放入test.json中,所以只需要对DataFold.TEST 预测
    dataset.load_data(data_path, {DataFold.TEST})
    dataset2.load_data(data_path_2, {DataFold.TEST})
    test_data_1 = dataset.get_tensorflow_dataset(DataFold.TEST)
    test_data_2 = dataset2.get_tensorflow_dataset(DataFold.TEST)
    model.prediction(
        test_data_1, test_data_2
    )





def run_train_from_args(args, hyperdrive_hyperparameter_overrides: Dict[str, str] = {}) -> None:
    # Get the housekeeping going and start logging:
    os.makedirs(args.save_dir, exist_ok=True)
    run_id = make_run_id(args.model, args.task)
    log_file = os.path.join(args.save_dir, f"{run_id}.log")
    
    def log(msg):
        log_line(log_file, msg)

    log(f"Setting random seed {args.random_seed}.")
    random.seed(args.random_seed)
    np.random.seed(args.random_seed)
    tf.random.set_seed(args.random_seed)
    #data split

    DataSplit.Preprocess(args.data_path)
    data_path = RichPath.create(os.path.split(args.data_path)[0]+'/tem_'+os.path.split(args.data_path)[1]+'/ast', args.azure_info)
    #second path
    data_path_2 = RichPath.create(os.path.split(args.data_path)[0]+'/tem_'+os.path.split(args.data_path)[1]+'/cdfg', args.azure_info)

    try:
        dataset, model = get_model_and_dataset(
            msg_passing_implementation=args.model,
            task_name=args.task,
            data_path=data_path,
            trained_model_file=args.load_saved_model,
            cli_data_hyperparameter_overrides=args.data_param_override,
            cli_model_hyperparameter_overrides=args.model_param_override,
            hyperdrive_hyperparameter_overrides=hyperdrive_hyperparameter_overrides,
            folds_to_load={DataFold.TRAIN, DataFold.VALIDATION},
            load_weights_only=args.load_weights_only,
        )
        #second
        dataset2, model_2 = get_model_and_dataset(
            msg_passing_implementation=args.model,
            task_name=args.task,
            data_path=data_path_2,
            trained_model_file=args.load_saved_model,
            cli_data_hyperparameter_overrides=args.data_param_override,
            cli_model_hyperparameter_overrides=args.model_param_override,
            hyperdrive_hyperparameter_overrides=hyperdrive_hyperparameter_overrides,
            folds_to_load={DataFold.TRAIN, DataFold.VALIDATION},
            load_weights_only=args.load_weights_only,
        )
    except ValueError as err:
        print(err.args)

    log(f"Dataset parameters: {json.dumps(unwrap_tf_tracked_data(dataset._params))}")
    log(f"Model parameters: {json.dumps(unwrap_tf_tracked_data(model._params))}")

    if args.azureml_logging:
        from azureml.core.run import Run

        aml_run = Run.get_context()
    else:
        aml_run = None

    print(f"this is args.save_dir:{args.save_dir}")
    print(f"this is dataset:{dataset}")
    print(f"this is dataset2:{dataset2}")
    trained_model_path = train(
        model,
        dataset,
        dataset2,
        log_fun=log,
        run_id=run_id,
        max_epochs=args.max_epochs,
        patience=args.patience,
        save_dir=args.save_dir,
        quiet=args.quiet,
        aml_run=aml_run,
    )
    if args.run_test:
        data_path = RichPath.create(
            os.path.split(args.data_path)[0] + '/tem_' + os.path.split(args.data_path)[1] + '/ast', args.azure_info)
        data_path_2 = RichPath.create(
            os.path.split(args.data_path)[0] + '/tem_' + os.path.split(args.data_path)[1] + '/cdfg', args.azure_info)
        print(f"in run_test this is data_path:{data_path},data_path_2:{data_path_2} ")
        log("== Running on test dataset")
        log(f"Loading data from {data_path}.")
        dataset.load_data(data_path, {DataFold.TEST})
        dataset2.load_data(data_path_2, {DataFold.TEST})
        log(f"Restoring best model state from {trained_model_path}.")
        load_weights_verbosely(trained_model_path, model)
        test_data_1 = dataset.get_tensorflow_dataset(DataFold.TEST)
        test_data_2 = dataset2.get_tensorflow_dataset(DataFold.TEST)
        index = model.run_one_epoch_cp(test_data_1,test_data_2, training=False, quiet=args.quiet)
        _, _, test_results = model.run_one_epoch_new(test_data_1, test_data_2, training=False, quiet=args.quiet)


        valid_ACC, val_stracc, \
        best_valid_Pre, best_val_strpre, \
        best_valid_metric_RE, best_val_strre, \
        best_valid_metric_f1, best_val_strf1, \
        best_valid_metric_TPR, best_val_strtpr, \
        best_valid_metric_FPR, best_val_strfpr, \
        best_valid_metric_TNR, best_val_strtnr, \
        best_valid_metric_FNR, best_val_strfnr, = model.compute_epoch_metrics(test_results)

        nni.report_final_result(-valid_ACC)

        log(
            f"NoneCP_test  {val_stracc}|{best_val_strpre} | {best_val_strre} | {best_val_strf1} |"
            f"{best_val_strtpr} | {best_val_strfpr} | {best_val_strtnr} | {best_val_strfnr} |",
        )

        if aml_run is not None:
            aml_run.log("task_test_metric", float(valid_ACC))

        import gzip
        def un_gz(file_name):


            f_name = file_name.replace(".gz", "")

            g_file = gzip.GzipFile(file_name)

            open(f_name, "wb+").write(g_file.read())
            g_file.close()

        un_gz(str(data_path) + '/train.jsonl.gz')
        un_gz(str(data_path) + '/test.jsonl.gz')
        un_gz(str(data_path) + '/valid.jsonl.gz')
        train_flies = []
        test_flies = []


        with open(str(data_path) + '/train.jsonl', "r+", encoding="utf8") as f:
            for step, item in enumerate(jsonlines.Reader(f)):
                    train_flies.append(item)

        with open(str(data_path) + '/test.jsonl', "r+", encoding="utf8") as f:
            for step, item in enumerate(jsonlines.Reader(f)):
                if step not in index:
                    test_flies.append(item)
                elif step in index:
                    train_flies.append(item)

        def mkdir(path):
            import os
            path = path.strip()
            path = path.rstrip("\\")
            isExists = os.path.exists(path)
            if not isExists:
                os.makedirs(path)
                print(path + ' ready now')
                return True
            else:
                print(path + ' already')
                return False

        mkdir(str(os.path.split(str(data_path))[0]) + '/new/ast')
        ast_path=str(os.path.split(str(data_path))[0]) + '/new/ast'
        os.remove(str(data_path) + '/train.jsonl')

        os.remove(str(data_path) + '/test.jsonl')
        for i in train_flies:
            with jsonlines.open(str(data_path) + '/train.jsonl',
                                mode='a') as writer:
                writer.write(i)
        for i in test_flies:
            with jsonlines.open(str(data_path) + '/test.jsonl',
                                mode='a') as writer:
                writer.write(i)

        f_in = open(str(data_path) + '/train.jsonl', 'rb')

        f_out = gzip.open(ast_path+'/train.jsonl.gz', 'wb')
        f_out.writelines(f_in)
        f_out.close()
        f_in.close()
        os.remove(str(data_path) + '/train.jsonl')

        f_in = open(str(data_path) + '/valid.jsonl', 'rb')

        f_out = gzip.open(ast_path+'/valid.jsonl.gz', 'wb')
        f_out.writelines(f_in)
        f_out.close()
        f_in.close()
        os.remove(str(data_path) + '/valid.jsonl')

        f_in = open(str(data_path) + '/test.jsonl', 'rb')

        f_out = gzip.open(ast_path+'/test.jsonl.gz', 'wb')
        f_out.writelines(f_in)
        f_out.close()
        f_in.close()
        os.remove(str(data_path) + '/test.jsonl')

        un_gz(str(data_path_2) + '/train.jsonl.gz')
        un_gz(str(data_path_2) + '/test.jsonl.gz')
        un_gz(str(data_path_2) + '/valid.jsonl.gz')
        train_flies = []
        test_flies = []


        with open(str(data_path_2) + '/train.jsonl', "r+", encoding="utf8") as f:
            for step, item in enumerate(jsonlines.Reader(f)):
                    train_flies.append(item)

        with open(str(data_path_2) + '/test.jsonl', "r+", encoding="utf8") as f:
            for step, item in enumerate(jsonlines.Reader(f)):
                if step not in index:
                    test_flies.append(item)
                elif step in index:
                    train_flies.append(item)


        mkdir(str(os.path.split(str(data_path_2))[0]) + '/new/cdfg')
        cdfg_path=str(os.path.split(str(data_path_2))[0]) + '/new/cdfg'
        os.remove(str(data_path_2) + '/train.jsonl')

        os.remove(str(data_path_2) + '/test.jsonl')
        for i in train_flies:
            with jsonlines.open(str(data_path_2) + '/train.jsonl',
                                mode='a') as writer:
                writer.write(i)
        for i in test_flies:
            with jsonlines.open(str(data_path_2) + '/test.jsonl',
                                mode='a') as writer:
                writer.write(i)

        f_in = open(str(data_path_2) + '/train.jsonl', 'rb')

        f_out = gzip.open(cdfg_path+'/train.jsonl.gz', 'wb')
        f_out.writelines(f_in)
        f_out.close()
        f_in.close()
        os.remove(str(data_path_2) + '/train.jsonl')

        f_in = open(str(data_path_2) + '/valid.jsonl', 'rb')

        f_out = gzip.open(cdfg_path+'/valid.jsonl.gz', 'wb')
        f_out.writelines(f_in)
        f_out.close()
        f_in.close()
        os.remove(str(data_path_2) + '/valid.jsonl')

        f_in = open(str(data_path_2) + '/test.jsonl', 'rb')

        f_out = gzip.open(cdfg_path+'/test.jsonl.gz', 'wb')
        f_out.writelines(f_in)
        f_out.close()
        f_in.close()
        os.remove(str(data_path_2) + '/test.jsonl')

        data_path = RichPath.create(
            os.path.split(args.data_path)[0] + '/tem_' + os.path.split(args.data_path)[1] + '/new/ast', args.azure_info)
        # second path
        data_path_2 = RichPath.create(
            os.path.split(args.data_path)[0] + '/tem_' + os.path.split(args.data_path)[1] + '/new/cdfg', args.azure_info)

        try:
            dataset, model = get_model_and_dataset(
                msg_passing_implementation=args.model,
                task_name=args.task,
                data_path=data_path,
                trained_model_file=args.load_saved_model,
                cli_data_hyperparameter_overrides=args.data_param_override,
                cli_model_hyperparameter_overrides=args.model_param_override,
                hyperdrive_hyperparameter_overrides=hyperdrive_hyperparameter_overrides,
                folds_to_load={DataFold.TRAIN, DataFold.VALIDATION},
                load_weights_only=args.load_weights_only,
            )
            # second
            dataset2, model_2 = get_model_and_dataset(
                msg_passing_implementation=args.model,
                task_name=args.task,
                data_path=data_path_2,
                trained_model_file=args.load_saved_model,
                cli_data_hyperparameter_overrides=args.data_param_override,
                cli_model_hyperparameter_overrides=args.model_param_override,
                hyperdrive_hyperparameter_overrides=hyperdrive_hyperparameter_overrides,
                folds_to_load={DataFold.TRAIN, DataFold.VALIDATION},
                load_weights_only=args.load_weights_only,
            )
        except ValueError as err:
            print(err.args)

        log(f"Dataset parameters: {json.dumps(unwrap_tf_tracked_data(dataset._params))}")
        log(f"Model parameters: {json.dumps(unwrap_tf_tracked_data(model._params))}")

        if args.azureml_logging:
            from azureml.core.run import Run

            aml_run = Run.get_context()
        else:
            aml_run = None

        trained_model_path = train(
            model,
            dataset,
            dataset2,
            log_fun=log,
            run_id=run_id,
            max_epochs=args.max_epochs,
            patience=args.patience,
            save_dir=args.save_dir,
            quiet=args.quiet,
            aml_run=aml_run,
        )

        if args.run_test:
            log("== Running on test dataset")
            log(f"Loading data from {data_path}.")
            dataset.load_data(data_path, {DataFold.TEST})
            dataset2.load_data(data_path_2, {DataFold.TEST})
            log(f"Restoring best model state from {trained_model_path}.")
            load_weights_verbosely(trained_model_path, model)
            test_data_1 = dataset.get_tensorflow_dataset(DataFold.TEST)
            test_data_2 = dataset2.get_tensorflow_dataset(DataFold.TEST)
            _, _, test_results = model.run_one_epoch_new(test_data_1, test_data_2, training=False, quiet=args.quiet)
         
            valid_ACC, val_stracc, \
            best_valid_Pre, best_val_strpre, \
            best_valid_metric_RE, best_val_strre, \
            best_valid_metric_f1, best_val_strf1, \
            best_valid_metric_TPR, best_val_strtpr, \
            best_valid_metric_FPR, best_val_strfpr, \
            best_valid_metric_TNR, best_val_strtnr, \
            best_valid_metric_FNR, best_val_strfnr, = model.compute_epoch_metrics(test_results)
            # valid_metric, valid_metric_string = model.compute_epoch_metrics(valid_results)
            log(
                f"CP_test  {val_stracc}|{best_val_strpre} | {best_val_strre} | {best_val_strf1} |"
                f"{best_val_strtpr} | {best_val_strfpr} | {best_val_strtnr} | {best_val_strfnr} |",
            )

            if aml_run is not None:
                aml_run.log("task_test_metric", float(valid_ACC))

def get_train_cli_arg_parser():
    import argparse

    parser = argparse.ArgumentParser(description="Train a GNN model.")
    if "--model" in sys.argv:
        model_param_name, task_param_name, data_path_param_name = "--model", "--task", "--data_path"
    else:
        model_param_name, task_param_name, data_path_param_name = "model", "task", "data_path"

    parser.add_argument(
        "--task_model_default_hypers_filePath",
        dest="task_model_default_hypers_filePath",
        type=str,
        default="../default_hypers/GraphBinaryClassification_GGNN.json",
        help="load the task_model_default_hypers",
    )
    parser.add_argument(
        "--storedModel_path",
        dest="storedModel_path",
        type=str,
        default="../cli/trained_model/GGNN_GraphBinaryClassification__2023-02-01_05-36-00_f1 = 0.800_best.pkl",
        help="load the model which is trained before",
    )
    parser.add_argument(
        model_param_name,
        type=str,
        choices=sorted(get_known_message_passing_classes()),
        help="GNN model type to train.",
    )
    parser.add_argument(
        task_param_name,
        type=str,
        choices=sorted(get_known_tasks()),
        help="Task to train model for.",
    )
    parser.add_argument(data_path_param_name, type=str, help="Directory containing the task data.")
    parser.add_argument(
        "--save-dir",
        dest="save_dir",
        type=str,
        default="trained_model",
        help="Path in which to store the trained model and log.",
    )
    parser.add_argument(
        "--model-params-override",
        dest="model_param_override",
        type=str,
        help="JSON dictionary overriding model hyperparameter values.",
    )
    parser.add_argument(
        "--data-params-override",
        dest="data_param_override",
        type=str,
        help="JSON dictionary overriding data hyperparameter values.",
    )
    parser.add_argument(
        "--max-epochs",
        dest="max_epochs",
        type=int,
        default=10000,
        help="Maximal number of epochs to train for.",
    )
    parser.add_argument(
        "--patience",
        dest="patience",
        type=int,
        default=25,
        help="Maximal number of epochs to continue training without improvement.",
    )
    parser.add_argument(
        "--seed", dest="random_seed", type=int, default=0, help="Random seed to use.",
    )
    parser.add_argument(
        "--run-name", dest="run_name", type=str, help="A human-readable name for this run.",
    )
    parser.add_argument(
        "--azure-info",
        dest="azure_info",
        type=str,
        default="azure_auth.json",
        help="Azure authentication information file (JSON).",
    )
    parser.add_argument(
        "--load-saved-model",
        dest="load_saved_model",
        help="Optional location to load initial model weights from. Should be model stored in earlier run.",
    )
    parser.add_argument(
        "--load-weights-only",
        dest="load_weights_only",
        action="store_true",
        help="Optional to only load the weights of the model rather than class and dataset for further training (used in fine-tuning on pretrained network). Should be model stored in earlier run.",
    )
    parser.add_argument(
        "--quiet", dest="quiet", action="store_true", help="Generate less output during training.",
    )
    parser.add_argument(
        "--run-test",
        dest="run_test",
        action="store_true",
        default=True,
        help="Run on testset after training.",
    )
    parser.add_argument(
        "--azureml_logging",
        dest="azureml_logging",
        action="store_true",
        help="Log task results using AML run context.",
    )
    parser.add_argument("--debug", dest="debug", action="store_true", help="Enable debug routines")

    parser.add_argument(
        "--hyperdrive-arg-parse",
        dest="hyperdrive_arg_parse",
        action="store_true",
        help='Enable hyperdrive argument parsing, in which unknown options "--key val" are interpreted as hyperparameter "key" with value "val".',
    )

    return parser
