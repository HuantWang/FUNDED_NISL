# joern-cli
We use joern to parse AST, CFG, PDG for C/C++.
## Usage
### 1) Parse code and generate CPG by joern-parse.sh

    $ cd joern-cli
    $ mkdir parse_result
    $ sh joern-parse data/good --out parse_result/good.bin
### 2) Load CPG graph

    $ sh joern
    $ loadCpg("parse_result/good.bin")
### 3) Modify the generated result path in graph/all.sc and run the script to generate AST, CFG, PDG

    $ cpg.runScript("graph/all.sc")
 
### 4) Use [joern_relation.py](https://github.com/HuantWang/FUNDED_NISL/blob/main/Edge_processing/joern-cli/joern_relation.py) to extract node information and purify
Part of the result is shown below:

    ...
    (14,16,2)                           <- Graph edge relations
    (2,5,2)
    -----------------------------------
    (0,a)
    (1,strcmp(c,"dateadded")            <- Graph nodes
    ...
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    1                                   <- Sample label

Click [here](https://github.com/HuantWang/FUNDED_NISL/tree/main/Edge_processing/joern-cli/result) to view the full result.
