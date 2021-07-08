import os
import re
import numpy as np

"""
After joern processes the c code, use this code;
0 represents AST, 1 represents CFG, 2 represents PDG
"""

def graphRelation(rootpath,pathdir,tag):
    files = os.listdir(rootpath)
    for file in files:
        nodeRelation = []
        nodeInformation = []
        path = rootpath + '//' + file
        try:
            with open(path, 'r', encoding='utf-8') as f:
                lines = str(f.read())
                alllist = lines.split("),List(")
                # Determine whether the data is empty
                node1 = []
                node2 = []
                relation = []
                if (alllist[1] != ""):
                    filename = alllist[0].split("/")[-1]
                    # add edge
                    nodeRelation.append(alllist[1])
                    nodeRelation.append(alllist[3])
                    nodeRelation.append(alllist[5])
                    # add node
                    nodeInformation.append(alllist[2])
                    nodeInformation.append(alllist[4])
                    nodeInformation.append(alllist[6])
                    # Regular processing
                    nodeRelation = re.findall(r"\(\d*,\d*,\d*\)", str(nodeRelation))
                    nodeInformation = re.findall(r"\(\d*,.*?\)", str(nodeInformation))
                    # Remove duplicate nodes
                    nodeInformation = list(set(nodeInformation))

                    # Extract the contents of each column into list => batch processing
                    nodeRelation = ' '.join(nodeRelation)
                    b = re.findall('\d+', nodeRelation)
                    for i in range(0, len(b), 3):
                        node1.append(b[i])
                        node2.append(b[i + 1])
                        relation.append(b[i + 2])
                    # relation_matrix = np.vstack([node1, node2, relation]).T

                    nodes = []
                    means = []
                    for i in nodeInformation:
                        node = re.search('\d+(?=,)', i)
                        mean = re.search('(?<=,).*', i)
                        nodes.append(node.group())
                        means.append(mean.group())
                    # feature_matrix = np.vstack([nodes,means]).T

                    # Replace node numbers
                    new_node1 = []
                    new_node2 = []
                    new_nodes = list(range(0, len(nodes)))
                    for x in node1:
                        for i in range(len(nodes)):
                            if x == nodes[i]:
                                # new_node1.append(x.replace(str(x), str(i)))
                                new_node1.append(str(i))
                                break
                    for x in node2:
                        for i in range(len(nodes)):
                            if x == nodes[i]:
                                # new_node2.append(x.replace(str(x), str(i)))
                                new_node2.append(str(i))
                                break

                    # write to file
                    
        except:
            print(path)

if __name__ == '__main__':
    dataPath = r"raw_result\bad"
    outPath = r"result\bad"
    # bad or good
    dataTag = 'bad'
    graphRelation(dataPath,outPath,dataTag)
    print("ooooooooooooooover")




