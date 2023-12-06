[![Maintenance](https://img.shields.io/badge/Maintained%3F-YES-green.svg)](https://github.com/HuantWang/SUPERSONIC/graphs/commit-activity)  [![License CC-BY-4.0](https://img.shields.io/badge/License-CC%20BY%204.0-blue.svg)](https://github.com/HuantWang/SUPERSONIC/blob/master/LICENSE)  [![Documentation Status](https://readthedocs.org/projects/supersonic/badge/?version=latest)](https://supersonic.readthedocs.io/en/latest/?badge=latest)

<p align=center>
<img src="./logo.jpg" alt="1683381967744" width=40% height=20% />
</p>

<p align="center">
  <i>Novel learning framework for building vulnerability detection models</i>
</p>



# Introduction

Using graph neural networks and open-source repositories to detect code vulnerabilities. This is an implementation of the model described in:
["Combining Graph-based Learning with Automated Data Collection for Code Vulnerability Detection"](https://ieeexplore.ieee.org/document/9293321)

FUNDED is a novel learning framework for building vulnerability detection models, which leverages the advances in graph neural networks (GNNs) to develop a novel graph-based learning method to capture and reason about the program’s control, data, and call dependencies.

**November 2020** - The paper was accepted to [IEEE TIFS](https://ieeexplore.ieee.org/document/9293321)!

**Dataset** are available at [here](https://drive.google.com/drive/folders/1WFFV8uGi8oXpzYORyiqRCYyqJGiHSbZL?usp=sharing), include C, Java and Php! 
As shown in [Lili's work](https://peerj.com/articles/cs-975/), our dataset had the highest complexity, the largest sample size, and the most subroutine calls compared to other public vulnerability datasets.





## Contents

* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
    * [Software](#software)
    * [Python Libraries](#python-libraries)
  * [Setup](#setup)
* [GNN Detection module](#gnn-detection-module)

  * [Detection Structure](#detection-structure)
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

* [Joern](https://joern.io/)
* [Python (==3.7)](https://www.python.org/)
* [Soot](https://soot-oss.github.io/soot/)
* [Antlr](https://github.com/antlr/antlr4)

##### Python Libraries:

* [TensorFlow (>=2.0.0)](https://tensorflow.google.cn/)
* [NNI](https://github.com/Microsoft/nni)

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
$ CUDA_VISIBLE_DEVICES=2 python train.py GGNN GraphBinaryClassification ../data/data/CWE-77
```

#### 4) load trained model and predict

``` console
$ cd NISL_TIFS2021/FUNDED/cli
$ CUDA_VISIBLE_DEVICES=2 python test.py GGNN GraphBinaryClassification ../data/data/data/cve/badall --storedModel_path "./trained_model/GGNN_GraphBinaryClassification__2023-02-01_05-36-00_f1 = 0.800_best.pkl"
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
│   │   │   ├── GraphBinaryClassification_GGNN.json
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

For c/c++, we download different CWE types' datasets from [SARD](https://samate.nist.gov/SARD/search.php), [CVE](https://cve.mitre.org/) and Github.

The specific steps of data preprocessing are as follows：

> Warning: Modify the path with your own data in code.

1. **Slicing data**

``` console
$ cd FUNDED_NISL/Edge_processing/slicec_7edges_funcblock/src/main/java/slice
```

   - Run ClassifyFileOfProject.java to extract all the C file.
   - Run Main.java to slice data in function level.

2. **Extracting different edge relationship**

Then we traverse all the source codes' AST nodes,which have been parsed by [cdt](http://www.eclipse.org/cdt/).While traversing, all nodes are numbered in sequence, and the relationship between different edges is obtained according to specific rules.

``` console
$ cd FUNDED_NISL/Edge_processing/slicec_7edges_funcblock/src/main/java/sevenEdges
```

   - Use joern to get all the control flows and data flows in the source code, specific reference: [joern](https://github.com/HuantWang/FUNDED_NISL/tree/main/Edge_processing/joern-cli).
   - Run Main.java to extrace others.
   - Run concateJoern.java to concate all edges.

We provide a demo [dataset](https://drive.google.com/file/d/1rB4d8sJS9dz0fts6UXj1M4vJ5NDwtet4/view?usp=sharing) for data preprocess.

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

The datasets can be collected [here](https://drive.google.com/drive/folders/1WFFV8uGi8oXpzYORyiqRCYyqJGiHSbZL?usp=sharing).
<br/>
The edges dataset contains 44 different types of C language CWE data. Through script processing,we can get the final inputs.
For example, under ```data/data/CWE-399``` and ```data/data/CWE-400``` are available the test datasets with the graphs consisting of ast, cfg and pdg.

#### Fields

| cwe  | file_id                                    | target | contents                                |
| ---- | ------------------------------------------ | ------ | --------------------------------------- |
| 399  | 0a2a9a6f-779e-47b4-823e-43eccd125b4f.c$$$0 | 0      | 1,2 1,3 2,7,9 (1,9,0)(2,8,1)(3,7,2) ... |
| 399  | 1b733c0b-30d5-4cc2-9431-8695795abfed.c$$$1 | 1      | 6,7 4,5 1,4,9 (2,7,0)(3,5,1)(4,2,2) ... |
| 399  | 3e9bebda-cef3-4988-9543-a5e5473849c2.c$$$0 | 0      | 1,2 3,5 3,5,8 (1,2,0)(2,6,1)(4,8,2) ... |
| 399  | 8bcbb6c4-3f3f-471c-b2dc-ab9151bb22f8.c$$$2 | 1      | 2,7 2,9 2,3,7 (6,7,0)(1,5,1)(6,9,2) ... |
| 399  | 53ee12a1-ba49-41f2-a163-c2b662a4db27.c$$$0 | 0      | 4,5 7,8 3,6,8 (5,8,0)(3,6,1)(7,8,2) ... |
|      | ...                                        | ...    | ...                                     |
| 400  | 8388fdcf-40cf-4e59-9f11-17d9e320efd8.c$$$4 | 0      | 1,7 2,5 3,4,8 (4,7,0)(5,8,1)(2,9,2) ... |
| 400  | 91978dee-4ee4-428b-8576-ffb49e8dc12a.c$$$6 | 1      | 2,3 3,8 3,7,9 (3,6,0)(4,6,1)(2,8,2) ... |
| 400  | 113353a8-f804-4aff-a81a-15f20e638d4b.c$$$1 | 1      | 4,6 4,7 5,6,7 (3,7,0)(4,5,1)(8,9,2) ... |
| 400  | b7b5ae35-d478-4c51-96c2-8f107fc08fde.c$$$3 | 1      | 2,5 7,8 1,7,8 (5,8,0)(3,6,1)(2,8,2) ... |
| 400  | e831aff3-bd88-4ef7-a5b0-2d87e1b20fbe.c$$$0 | 0      | 6,8 2,8 4,6,9 (6,9,0)(1,5,1)(1,4,2) ... |
|      | ...                                        | ...    | ...                                     |

### Results

Example results of training  on the sample dataset CWE-400.
Saved Model checkpoint at 60 epochs.

Dataset parameters: {

```
 "max_nodes_per_batch": 128,
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
Loading data from ../data/data/tem_CWE-77/ast.
Loading data from ../data/data/tem_CWE-77/cdfg.
Restoring best model state from trained_model/GGNN_GraphBinaryClassification__2020-11-30_10-41-23_best.pkl.
NoneCP_test  Accuracy = 0.915|precision = 0.846 | recall = 1.000 | f1 = 0.917
```

```
== Running on test dataset
Loading data from ../data/data/tem_CWE-77/new/ast.
Loading data from ../data/data/tem_CWE-77/new/cdfg.
Restoring best model state from trained_model/GGNN_GraphBinaryClassification__2020-11-30_10-44-23_best.pkl.
CP_test  Accuracy = 0.942|precision = 0.893 | recall = 1.000 | f1 = 0.943
```

### Tuning

We use [NNI(Neural Network Intelligence)](https://github.com/Microsoft/nni) for tuning in this project.

``` console
$ pip install nni
```

Add a search_space.json file under the work directory and write the parameters to be configured,which we have configured in the project.
</br></br>
search_space.json

```
{
 "max_nodes_per_batch":{ "_type": "choice", "_value": [32,64,128]},
 "gnn_hidden_dim":{ "_type": "choice", "_value": [4,8,16,...]},
 "gnn_num_layers": { "_type": "choice", "_value": [2,4,8,...] },
 "graph_aggregation_num_heads":{ "_type": "choice", "_value": [4,8,16,32,...]
},
 "graph_aggregation_hidden_layers":{ "_type": "choice", "_value": [32,64,128,256,...] },
 "graph_aggregation_dropout_rate":{ "_type": "choice", "_value": [0.1,0.2,0.5,...] },
 "learning_rate": { "_type": "choice", "_value": [0.01,0.001,0.0001,...] }
}
```

Define the configuration file in YAML format, which declares the search space and the path of the trial file. It also provides other information, such as the parameters of the whole algorithm, the maximum number of trials and the maximum duration.
</br></br>
config.yml

``` 
authorName: NNI Example
experimentName: CWE-77
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
    command: python3 train.py GGNN GraphBinaryClassification ../data/data/CWE-77 --patience 100 # execute commands
    codeDir: .
    gpuNum: 0
logDir: ~/nni # log directory
localConfig:
    gpuIndices: "0" # specify GPU number
    useActiveGpu: true
```

Run NNI

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


## License

Distributed under the NISL License. See LICENSE for more information.

## Contact

Huanting Wang - schwa@leeds.ac.uk

## Citation

~~~
@ARTICLE{Wang2020FUNDED,
  author = {H. {Wang} and G. {Ye} and Z. {Tang} and S. H. {Tan} and S. {Huang} and D. {Fang} and Y. {Feng} and L. {Bian} and Z. {Wang}},
  journal = {IEEE Transactions on Information Forensics and Security}, 
  title = {Combining Graph-Based Learning With Automated Data Collection for Code Vulnerability Detection}, 
  year = {2021},
  volume = {16},
  pages = {1943-1958},
  doi = {10.1109/TIFS.2020.3044773},
  ieeeid = {9293321},
  publisher = {IEEE},
  keywords = {Software Vulnerability, Code Vulnerability Detection, Deep Learning, Deep Graph Neural Networks},}
~~~
