# FUNDED

This is a code repository for the paper "Combining Graph-based Learning with Automated Data Collection for Code Vulnerability Detection" [arxiv](https://www.nwu.edu.cn/)

FUNDED__a novel learning framework for building vulnerability detection models, which leverages the advances in graph neural networks (GNNs) to develop a novel graph-based learning method to capture and reason about the program’s control, data, and call dependencies.


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
* [Data collection module](#data-collection-module)
  * [Structure1](#structure1)
  * [Prepare data](#prepare-data)
  * [Train your own ensemble classifier](#train-your-own-ensemble-classifier)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Install the necessary dependencies before running the project:
<br/>
##### Software:
* [joern](https://joern.io/)
* [Python (==3.7)](https://www.python.org/)
* [Soot](https://soot-oss.github.io/soot/)
* [Antlr](https://github.com/antlr/antlr4)
##### Python Libraries:
* [tensorflow (>=2.0.0)](https://tensorflow.google.cn/)
* [numpy](https://numpy.org/)
* [docopt](http://docopt.org/)
* [dpu-utils (>=0.2.7)](https://pypi.org/project/dpu-utils/)
* [h5py](https://pypi.org/project/h5py/)

### Setup

---
This section gives the steps, explanations and examples for getting the project running.
#### 1) Clone this repo

``` console
$ git clone git@github.com:FrancisWangH/NISL_TIFS2021.git
```

#### 2) Install Prerequisites
``` console
$ pip install -r requirements.txt
```

#### 3) Run the testcase
``` console
$ cd NISL_TIFS2021/FUNDED/cli
$ CUDA_VISIBLE_DEVICES=2 python train.py RGIN GraphBinaryClassification ../data/data/CWE-399
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
│   │   ├── train.py		    <- the entrance of training models	
│   │   ├── test.py		     <- testing the specified model using data
│   │   ├── __init__.py
│   ├── cli_utils     
│   │   ├── default_hypers	
│   │   │   ├── GraphBinaryClassification_RGIN.json
│   │   │   ├── GraphRegression_GNN_Edge_MLP.json
│   │   │   ├── PPI_GGNN.json
│   │   │   ├── PPI_GNN_Edge_MLP.json
│   │   │   ├── PPI_GNN_FiLM.json
│   │   │   ├── PPI_RGAT.json
│   │   │   ├── PPI_RGCN.json
│   │   │   ├── PPI_RGIN.json
│   │   │   ├── QM9_RGCN.json
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
│   │   ├── ppi_dataset.py
│   │   ├── qm9_dataset.py
│   │   ├── __init__.py	
│   ├── layers                      
│   │   ├── message_passing	
│   │   │   ├── ggnn.py
│   │   │   ├── gnn_edge_mlp.py
│   │   │   ├── gnn_film.py
│   │   │   ├── message_passing.py
│   │   │   ├── rgat.py
│   │   │   ├── rgcn.py
│   │   │   ├── rgin.py
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
│   ├── test   
│   │   ├── data	
│   │   │   ├── test_jsonl_graph_dataset.py
│   │   ├── layers	
│   │   │   ├── test_message_passing.py
│   │   │   ├── test_RGAT.py
│   │   │   ├── test_RGCN.py
│   │   ├── models	
│   │   │   ├── test_graph_regression_task.py
│   │   ├── test_datasets
│   │   │   ├── train.jsonl.gz
│   │   │   ├── valid.jsonl.gz
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
For c/c++,we download different CWE types' datasets from [SARD](https://samate.nist.gov/SARD/search.php).

Then we traverse all the source codes' AST nodes,which have been parsed by [cdt](http://www.eclipse.org/cdt/).While traversing, all nodes are numbered in sequence, and the relationship between different edges is obtained according to specific rules.

With [joern](https://joern.io/), we can get all the control flows and data flows in the source code.

Finally,connect the two parts.

> Warning: Modify the path with your own data
~~~
cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/C_cdt_7Edges_cdt/src/main/java/nodeTraversal
java ParserExample.java sourceFilePath savafilePath

cd ../concateEgeAndJoern
java concateJoern.java sourceFilePath savafilePath
~~~

#### java 

---
For java,We download data from [SARD](https://samate.nist.gov/SARD/search.php) as well.

With the same idea like parsing c/c++ above,we construct all relationships in different edges using [soot](https://soot-oss.github.io/soot/) and [jdt](https://www.eclipse.org/jdt/).

> Warning: Modify the path with your own data
~~~
cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/Java_jdt_AST_CDFG/src/main/java/yoshikihigo/tinypdg/
java Main.java sourceFilePath savafilePath
~~~

#### PHP and Swift

---
For PHP and Swift,We collect datasets from github using our pre-trained "mixture of experts" model.

Then extracting edge nodes from AST constructed with [Antlr](https://github.com/antlr/antlr4).

~~~
cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/php_swift/src/php/main
java TestPhp.java sourceFilePath savafilePath

cd NISL_TIFS2021/EdgesGenerationAndDataPreprocess/php_swift/src/swift3/main
java TestSwift3.java sourceFilePath savafilePath
~~~


### Dataset

---
The dataset used is [HERE](http://10.15.14.199:10010/file/download/176).
<br/>
<br/>
The edges dataset contains 44 different types of C language CWE data, which are both from [sard](https://samate.nist.gov/SARD/). Through script processing,we can get the final inputs.
For example, under ```data/data/CWE-399``` and ```data/data/CWE-362``` are available the test datasets with the graphs consisting of ast、cfg and pdg.

#### Fields

|cwe|               file_id                  | target |                           contents                    |
|------|----------------------------------------|------| -------------------------------------------------|
|399 | 0a2a9a6f-779e-47b4-823e-43eccd125b4f.c$$$0 |    0   | 1,2 1,3 2,7,9 (1,9,0)(2,8,1)(3,7,2) ... |
|399 | 1b733c0b-30d5-4cc2-9431-8695795abfed.c$$$1 |    1   | 6,7 4,5 1,4,9 (2,7,0)(3,5,1)(4,2,2) ... |
|399 | 3e9bebda-cef3-4988-9543-a5e5473849c2.c$$$0 |    0   | 1,2 3,5 3,5,8 (1,2,0)(2,6,1)(4,8,2) ... |
|399 | 8bcbb6c4-3f3f-471c-b2dc-ab9151bb22f8.c$$$2 |    1   | 2,7 2,9 2,3,7 (6,7,0)(1,5,1)(6,9,2) ... |
|399 | 53ee12a1-ba49-41f2-a163-c2b662a4db27.c$$$0 |    0   | 4,5 7,8 3,6,8 (5,8,0)(3,6,1)(7,8,2) ... |
|  | ...|    ...   | ... |
|362 | 8388fdcf-40cf-4e59-9f11-17d9e320efd8.c$$$4 |    0   | 1,7 2,5 3,4,8 (4,7,0)(5,8,1)(2,9,2) ... |
|362 | 91978dee-4ee4-428b-8576-ffb49e8dc12a.c$$$6 |    1   | 2,3 3,8 3,7,9 (3,6,0)(4,6,1)(2,8,2) ... |
|362 | 113353a8-f804-4aff-a81a-15f20e638d4b.c$$$1 |    1   | 4,6 4,7 5,6,7 (3,7,0)(4,5,1)(8,9,2) ... |
|362 | b7b5ae35-d478-4c51-96c2-8f107fc08fde.c$$$3 |    1   | 2,5 7,8 1,7,8 (5,8,0)(3,6,1)(2,8,2) ... |
|362 | e831aff3-bd88-4ef7-a5b0-2d87e1b20fbe.c$$$0 |    0   | 6,8 2,8 4,6,9 (6,9,0)(1,5,1)(1,4,2) ... |
|  | ...|    ...   | ... |

### Results
Example results of training  on the sample dataset CWE-399.
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
== Running on test dataset without cp
Loading data from ../data/data/tem_CWE-399/ast.
Loading data from ../data/data/tem_CWE-399/cdfg.
Restoring best model state from trained_model/RGIN_GraphBinaryClassification__2020-10-21_15-08-32_best.pkl.
NoneCP  | Accuracy = 0.786 | precision = 0.778 | recall = 0.875 | f1 = 0.824 |TPR = 0.875 | FPR = 0.333 | TNR = 0.667 | FNR = 0.125 | 0.26 graphs/s
```

```
== Running on test dataset with cp
Loading data from ../data/data/tem_CWE-399/new/ast.
Loading data from ../data/data/tem_CWE-399/new/cdfg.
Restoring best model state from trained_model/RGIN_GraphBinaryClassification__2020-10-21_15-08-32_best.pkl.
CP  | Accuracy = 0.857 | precision = 0.875 | recall = 0.875 | f1 = 0.875 |TPR = 0.875 | FPR = 0.167 | TNR = 0.833 | FNR = 0.125 | 0.29 graphs/s
```
<br/><br/>
## Data collection module

### Structure1

~~~
├── EnsembleLearning.py
├── InputData_New.py                       
├── stopwords.txt
~~~

### Prepare data

- extract features from commit,then 

### Train your own ensemble classifier

- use ***InputData_New.py*** to train your own ensemble model

> Warning: Replace the path with your own data

~~~
python InputData_New.py 
~~~


## Authors
* **Huanting Wang**, **Guixin Ye**, **Zhanyong Tang**, **Songfang Huang**, **Dingyi Fang**, **Yansong Feng**, **Lizhong Bian**, **Zheng Wang**
* *Initial work* - [TIFS Paper](https://www.nwu.edu.cn/), [Datasets](https://www.nwu.edu.cn/)

## License
Distributed under the NISL License. See LICENSE for more information.

## Contact

Huanting Wang - wanghuanting@stumail.nwu.edu.cn
## Acknowledgments
Guidance and ideas for some parts from:

* [LEARNING TO REPRESENT PROGRAMS WITH GRAPHS](https://arxiv.org/pdf/1711.00740.pdf)
