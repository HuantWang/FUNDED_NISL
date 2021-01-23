# FUNDED

Using graph neural networks and open-source repositories to detect code vulnerabilities. This is an official implementation of the model described in:

[Huanting Wang](https://scholar.google.com.hk/citations?user=inrTk6cAAAAJ&hl=zh-CN&oi=sra), [Guixin Ye](https://dblp.uni-trier.de/pid/125/3245.html), [Zhanyong Tang](https://scholar.google.com.hk/citations?user=SgNEtJwAAAAJ&hl=zh-CN&oi=sra), [Shin Hwei Tan](https://scholar.google.com.hk/citations?user=1eFjFs8AAAAJ&hl=zh-CN&oi=ao), [Songfang Huang](https://dblp.uni-trier.de/pid/05/4919.html), [Dingyi Fang](https://dblp.uni-trier.de/pid/80/3909.html), [Yansong Feng](https://scholar.google.com.hk/citations?user=67qAw_wAAAAJ&hl=zh-CN), Lizhong Bian and [Zheng Wang](https://scholar.google.com.hk/citations?user=qJ7ZKG8AAAAJ&hl=zh-CN) "Combining Graph-based Learning with Automated Data Collection for Code Vulnerability Detection" [Preprint](https://www.nwu.edu.cn/)

**November 2020** - The paper was accepted to [IEEE TIFS](https://ieeexplore.ieee.org/xpl/RecentIssue.jsp?punumber=10206)!

**Online Tools** and **Dataset** are available at our [website]()(preparing) .

FUNDED is a novel learning framework for building vulnerability detection models, which leverages the advances in graph neural networks (GNNs) to develop a novel graph-based learning method to capture and reason about the program’s control, data, and call dependencies.


## Contents

* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
     * [Software](#software)
     * [Python Libraries](#python-libraries)
  * [Setup](#setup)
* [GNN Detection module](#gnn-detection-module)
  
  * [Dection Structure](#dection-structure)
  * [Data Preprocessing](#data-preprocessing)
  * [Dataset](#dataset)
  * [Results](#results)
  * [Tuning](#Tuning)
* [Data collection module](#data-collection-module)
  * [Collection Structure](#structure1)
  * [Data Preprocessing](#prepare-data)
  * [Train your own ensemble classifier](#train-your-own-ensemble-classifier)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Install the necessary dependencies before running the project,the part of SoftWare is related to data preprocess while Python Libraries are the environment we have tested.
For more details, please reference requirements.txt:
<br/>
##### Software:
* [joern](https://joern.io/)
* [Python (==3.7)](https://www.python.org/)
* [Soot](https://soot-oss.github.io/soot/)
* [Antlr](https://github.com/antlr/antlr4)
##### Python Libraries:
* [tensorflow (>=2.0.0)](https://tensorflow.google.cn/)
* [nni](https://github.com/Microsoft/nni)
### Setup

---
This section gives the steps, explanations and examples for getting the project running.
#### 1) Clone this repo

``` console
$ git clone git@github.com:HuantWang/FUNDED_NISL.git
```

#### 2) Install Prerequisites
``` console
$ pip install -r requirements.txt
```

#### 3) Run the testcase
``` console
$ cd NISL_TIFS2021/FUNDED/cli
$ CUDA_VISIBLE_DEVICES=2 python train.py GGNN GraphBinaryClassification ../data/data/CWE-400
```
<br/><br/>
## GNN Detection module

This part contains GNN Detection model' relevant source code structure and partial sample data set.

### Detection Structure
``` 
├── LICENSE
├── README.md                       <- The top-level README for developers using this project.
├── requirements.txt                <- The python environment for developers using this project.
├── FUNDED
│   ├── cli     
│   │   ├── train.py		    <- the entrance of training models.	
│   │   ├── test.py		     <- testing the specified model using data.
│   │   ├── __init__.py
│   ├── cli_utils     
│   │   ├── default_hypers	
│   │   │   ├── GraphBinaryClassification_RGIN.json
│   │   ├── dataset_utils.py	
│   │   ├── model_utils.py	
│   │   ├── param_helpers.py	
│   │   ├── task_utils.py
│   │   ├── training_utils.py
│   │   ├── __init__.py	
│   ├── data                       
│   │   ├── data	
│   │   │   ├── data_preprocess.py
│   │   │   ├── our_map_all.txt
│   │   │   ├── __init__.py
│   │   ├── graph_dataset.py	
│   │   ├── jsonl_graph_dataset.py	
│   │   ├── jsonl_graph_property_dataset.py	
│   │   ├── __init__.py	
│   ├── layers                      
│   │   ├── message_passing	
│   │   │   ├── ggnn.py
│   │   │   ├── gnn_edge_mlp.py
│   │   │   ├── gnn_film.py
│   │   │   ├── message_passing.py
│   │   │   ├── __init__.py
│   │   ├── gnn.py
│   │   ├── graph_global_exchange.py	
│   │   ├── nodes_to_graph_representation.py
│   │   ├── __init__.py	
│   ├── models   
│   │   ├── graph_binary_classification_task.py
│   │   ├── graph_regression_task.py
│   │   ├── graph_task_model.py 
│   │   ├── node_multiclass_task.py
│   │   ├── __init__.py	
│   ├── utils                          
│   │   ├── activation.py
│   │   ├── constants.py
│   │   ├── gather_dense_gradient.py
│   │   ├── param_helpers.py
│   └── └── __init__.py	
└────── __init__.py
```
### Data Preprocessing

To construct the AST, we use Soot for Java, ANTLR for Swift, PHP and joern for C/C++.
#### c/c++

---
For c/c++,we download different CWE types' datasets from [SARD](https://samate.nist.gov/SARD/search.php), [CVE](https://cve.mitre.org/) and Github.

Then we traverse all the source codes' AST nodes,which have been parsed by [cdt](http://www.eclipse.org/cdt/).While traversing, all nodes are numbered in sequence, and the relationship between different edges is obtained according to specific rules.

With [joern](https://joern.io/), we can get all the control flows and data flows in the source code.

Finally,connect the two parts.

> Warning: Modify the path with your own data
``` console
$ cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/C_cdt_7Edges_cdt/src/main/java/nodeTraversal
$ java ParserExample.java sourceFilePath savafilePath

$ cd ../concateEgeAndJoern
$ java concateJoern.java sourceFilePath savafilePath
```

#### java 

---
For java,We download data from [SARD](https://samate.nist.gov/SARD/search.php), [CVE](https://cve.mitre.org/) and Github.

With the same idea like parsing c/c++ above,we construct all relationships in different edges using [soot](https://soot-oss.github.io/soot/) and [jdt](https://www.eclipse.org/jdt/).

> Warning: Modify the path with your own data
``` console
$ cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/Java_jdt_AST_CDFG/src/main/java/yoshikihigo/tinypdg/
$ java Main.java sourceFilePath savafilePath
```

#### PHP and Swift

---
For PHP and Swift,We collect datasets from [SARD](https://samate.nist.gov/SARD/search.php), [CVE](https://cve.mitre.org/) and Github.

Then extracting edge nodes from AST constructed with [Antlr](https://github.com/antlr/antlr4).

``` console
$ cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/php_swift/src/php/main
$ java TestPhp.java sourceFilePath savafilePath

$ cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/php_swift/src/swift3/main
$ java TestSwift3.java sourceFilePath savafilePath
```


### Dataset

---
The datasets used are [HERE](http://www.leogoat.site/).
<br/>
The edges dataset contains 44 different types of C language CWE data. Through script processing,we can get the final inputs.
For example, under ```data/data/CWE-399``` and ```data/data/CWE-400``` are available the test datasets with the graphs consisting of ast, cfg and pdg.

#### Fields

|cwe|               file_id                  | target |                           contents                    |
|------|----------------------------------------|------| -------------------------------------------------|
|399 | 0a2a9a6f-779e-47b4-823e-43eccd125b4f.c$$$0 |    0   | 1,2 1,3 2,7,9 (1,9,0)(2,8,1)(3,7,2) ... |
|399 | 1b733c0b-30d5-4cc2-9431-8695795abfed.c$$$1 |    1   | 6,7 4,5 1,4,9 (2,7,0)(3,5,1)(4,2,2) ... |
|399 | 3e9bebda-cef3-4988-9543-a5e5473849c2.c$$$0 |    0   | 1,2 3,5 3,5,8 (1,2,0)(2,6,1)(4,8,2) ... |
|399 | 8bcbb6c4-3f3f-471c-b2dc-ab9151bb22f8.c$$$2 |    1   | 2,7 2,9 2,3,7 (6,7,0)(1,5,1)(6,9,2) ... |
|399 | 53ee12a1-ba49-41f2-a163-c2b662a4db27.c$$$0 |    0   | 4,5 7,8 3,6,8 (5,8,0)(3,6,1)(7,8,2) ... |
|  | ...|    ...   | ... |
|400 | 8388fdcf-40cf-4e59-9f11-17d9e320efd8.c$$$4 |    0   | 1,7 2,5 3,4,8 (4,7,0)(5,8,1)(2,9,2) ... |
|400 | 91978dee-4ee4-428b-8576-ffb49e8dc12a.c$$$6 |    1   | 2,3 3,8 3,7,9 (3,6,0)(4,6,1)(2,8,2) ... |
|400 | 113353a8-f804-4aff-a81a-15f20e638d4b.c$$$1 |    1   | 4,6 4,7 5,6,7 (3,7,0)(4,5,1)(8,9,2) ... |
|400 | b7b5ae35-d478-4c51-96c2-8f107fc08fde.c$$$3 |    1   | 2,5 7,8 1,7,8 (5,8,0)(3,6,1)(2,8,2) ... |
|400 | e831aff3-bd88-4ef7-a5b0-2d87e1b20fbe.c$$$0 |    0   | 6,8 2,8 4,6,9 (6,9,0)(1,5,1)(1,4,2) ... |
|  | ...|    ...   | ... |

### Results
Example results of training  on the sample dataset CWE-400.
Saved Model checkpoint at 60 epochs.

Dataset parameters: {
```
 "max_nodes_per_batch": 16,
 "num_fwd_edge_types": 7, 
 "add_self_loop_edges": true, 
 "tie_fwd_bkwd_edges": true,
 "threshold_for_classification": 0.5
```
 }

Model parameters: {
```
 "gnn_aggregation_function": "sum", 
 "gnn_message_activation_function": "ReLU", 
 "gnn_hidden_dim": 256, 
 "gnn_use_target_state_as_input": false, 
 "gnn_normalize_by_num_incoming": true, 
 "gnn_num_edge_MLP_hidden_layers": 1, 
 "gnn_num_aggr_MLP_hidden_layers": null, 
 "gnn_message_calculation_class": "RGIN", 
 "gnn_initial_node_representation_activation": "tanh", 
 "gnn_dense_intermediate_layer_activation": "tanh", 
 "gnn_num_layers": 5, "gnn_dense_every_num_layers": 10000, 
 "gnn_residual_every_num_layers": 2, 
 "gnn_use_inter_layer_layernorm": true, 
 "gnn_layer_input_dropout_rate": 0.2, 
 "gnn_global_exchange_mode": "gru", 
 "gnn_global_exchange_every_num_layers": 10000, 
 "gnn_global_exchange_weighting_fun": "softmax", 
 "gnn_global_exchange_num_heads": 4, 
 "gnn_global_exchange_dropout_rate": 0.2, 
 "optimizer": "Adam", "learning_rate": 0.001, 
 "learning_rate_decay": 0.98, "momentum": 0.85, 
 "gradient_clip_value": 1.0, 
 "use_intermediate_gnn_results": false, 
 "graph_aggregation_num_heads": 16, 
 "graph_aggregation_hidden_layers": [128], 
 "graph_aggregation_dropout_rate": 0.2
```
 }

```
== Running on test dataset
Loading data from ../data/data/tem_CWE-400/ast.
Loading data from ../data/data/tem_CWE-400/cdfg.
Restoring best model state from trained_model/GGNN_GraphBinaryClassification__2020-11-30_10-41-23_best.pkl.
NoneCP_test  Accuracy = 0.915|precision = 0.846 | recall = 1.000 | f1 = 0.917 |TPR = 1.000 | FPR = 0.160 | TNR = 0.840 | FNR = 0.000 |
```

```
== Running on test dataset
Loading data from ../data/data/tem_CWE-400/new/ast.
Loading data from ../data/data/tem_CWE-400/new/cdfg.
Restoring best model state from trained_model/GGNN_GraphBinaryClassification__2020-11-30_10-44-23_best.pkl.
CP_test  Accuracy = 0.942|precision = 0.893 | recall = 1.000 | f1 = 0.943 |TPR = 1.000 | FPR = 0.111 | TNR = 0.889 | FNR = 0.000 |
```

### Tuning
We use [nni(Neural Network Intelligence)](https://github.com/Microsoft/nni) for tuning in this project.
``` console
$ pip install nni
```

Add a search_space.json file under the work directory and write the parameters to be configured,which we have configured in the project.
</br></br>
search_space.json
```
{
 "gnn_hidden_dim":{ "_type": "choice", "_value": [4,8,16]},
 "gnn_num_layers": { "_type": "choice", "_value": [2,4,8] },
 "graph_aggregation_num_heads":{ "_type": "choice", "_value": [4,8,16,32]
},
 "graph_aggregation_hidden_layers":{ "_type": "choice", "_value": [32,64,128,256] },
 "graph_aggregation_dropout_rate":{ "_type": "choice", "_value": [
0.1,0.2,0.5] },
 "learning_rate": { "_type": "choice", "_value": [0.01,0.001,0.0001] }
}
```
Define the configuration file in YAML format, which declares the search space and the path of the trial file. It also provides other information, such as the parameters of the whole algorithm, the maximum number of trials and the maximum duration.
</br></br>
config.yml
``` 
authorName: NNI Example
experimentName: tf2-nn TF v2.x
trialConcurrency: 1
maxExecDuration: 110h # max executable time
maxTrialNum: 500 # max trial num
trainingServicePlatform: local
searchSpacePath: search_space.json # path of search space
useAnnotation: false
tuner:
    builtinTunerName: TPE
    classArgs:
        optimize_mode: maximize # choices: maximize, minimize
    gpuIndices: "1" # specify GPUof optimizer
trial:
    command: python3 train.py GGNN GraphBinaryClassification ../data/data/ssrf --patience 100 # execute commands
    codeDir: .
    gpuNum: 0
logDir: /home/nisl1/nisl8121/hh/nni # log
localConfig:
    gpuIndices: "0" # specify GPU number
    useActiveGpu: true
```

Run nni

```
nnictl create --config config.yml --port 8080
```
Wait for the output INFO: Successfully started experiment! in the command line. This message indicates that the experiment has been successfully started.

For more details,reference https://github.com/Microsoft/nni
<br/><br/>


## Data collection module

### Collection Structure

~~~
├── EnsembleLearning.py
├── InputData_New.py                       
├── stopwords.txt
├── sample.zip
~~~
### Ready for training
- Download our pretrained w2v model [here](https://drive.google.com/file/d/118EDwayV9Kqsf3ik5of7UErl0_WW73Qk/view?usp=sharing)
- We also provide a dataset sample.zip, unzip and make it work

### Prepare data

- You can extract features from commits, or just use our sample.zip

### Train your own ensemble classifier

- Use ***EnsembleLearning.py*** to train your own ensemble model

> Warning: Replace the path with your own data path.

~~~
python EnsembleLearning.py 
~~~


## Authors
* **Huanting Wang**, **Guixin Ye**, **Zhanyong Tang**, **Songfang Huang**, **Dingyi Fang**, **Yansong Feng**, **Lizhong Bian**, **Zheng Wang**
* *Initial work* - [Paper](https://www.nwu.edu.cn/), [Datasets](http://www.leogoat.site/)

## License
Distributed under the NISL License. See LICENSE for more information.

## Contact

Huanting Wang - wanghuanting@stumail.nwu.edu.cn

## Citation

Combining Graph-based Learning with Automated Data Collection for Code Vulnerability Detection" [Preprint](https://www.nwu.edu.cn/)
