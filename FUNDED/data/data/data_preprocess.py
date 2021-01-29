import gzip
import jsonlines
from gensim.models import word2vec, Word2Vec
import re
import numpy as np
import json
from sklearn import decomposition
import os


def filterNodes(list, num):
    list_new = []
    if len(list) == 0:
        return list_new
    for i in range(len(list)):
        l1 = list[i][0]
        l2 = list[i][1]
        if l1 < num & l2 < num:
            list_new.append(list[i])

    return list_new


def mkdir(path):
    import os
    path = path.strip()
    path = path.rstrip("\\")

    isExists = os.path.exists(path)
    if not isExists:
        os.makedirs(path)
        print(path + ' is ready now')
        return True
    else:
        print(path + ' already exists')
        return False

def w2v(filename, cwetype):
    # check if '../data/data/word2vec_CWE-399.pkl' already exists.
    if os.path.exists(os.path.split(filename)[0] + "/" + "word2vec_" + str(cwetype) + ".pkl"):
        print("Word2Vec already exists.")
        return
    # if not,...
    print("generating word2vec...")
    words = []
    for root, dirs, files in os.walk(filename):
        # shuffle files randomly
        np.random.shuffle(files)
        for file in files:
            flag_vec = 0
            word = []
            with open(os.path.join(root + "/" + file), "r") as f:
                for line in f.readlines():
                    if "-" * 20 in line:
                        flag_vec = 1

                    if flag_vec == 1:
                        if "^" * 20 in line:
                            for i in word:
                                words.append(i)
                        # if not None
                        if re.search('(?<=,).*', line):
                            word.append(re.search('(?<=,).*', line).group().split(')')[0].split(" "))  # 将token加入数组
    model = Word2Vec(words, min_count=1, size=100, sg=1, window=5,
                     negative=3, sample=0.001, hs=1, workers=4)

    # a=model.wv.vocab
    # for k in a:
    #     print(k)
    model.save(os.path.split(filename)[0] + "/" + "word2vec_" + str(cwetype) + ".pkl")
    print("Word2Vec is ready")


def GetInfor(filename):
    print("\ngenerating vectors files...")
    random_use = np.random.rand(100)

    for root, dirs, files in os.walk(filename):
        count = 0
        np.random.shuffle(files)
        for fname in files:
            # ast
            adj_child = []
            adj_next = []
            adj_com = []
            adj_guared = []
            adj_lexical = []
            adj_jump = []

            # cdfg
            adj_cdfg_a = []
            adj_cdfg_c = []
            adj_cdfg_p = []

            # initialize
            label_label = False  # label
            label_child = False  # child
            label_next = False  # next_token
            label_from = False  # compute_form
            label_by = False  # garde_by
            label_negation = False  # garde_negation
            label_att = False  # node_attribute
            label_use = False  # Lexical_use
            label_jump = False  # jump
            label_joern = False  # cdfg
            label_joern_word = False  # joern_word
            joern_word = []

            with open(root + '/' + fname, "r") as f:
                data = f.readlines()
                for line in data:
                    if (line.strip().find("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^") >= 0):  # end of lines
                        break
                    nodes = line.split('\n')[0].split(',')
                    if (line.find("-----label-----") >= 0):
                        label_label = True
                        continue
                    if (label_label):
                        label_single = line.strip()
                        label_label = False
                        continue

                    if (line.find("-----children-----") >= 0):
                        label_child = True
                        continue
                    if (label_child):
                        if line.find("-----nextToken-----") >= 0:
                            label_child = False
                        else:
                            adj_child.append((int(nodes[0]), int(nodes[1])))

                    if (line.find("-----nextToken-----") >= 0):
                        label_next = True
                        continue
                    if (label_next):
                        if line.find("-----computeFrom-----") >= 0:
                            label_next = False
                        else:
                            for i in range(len(nodes)):
                                if i != len(nodes) - 1:
                                    adj_next.append((int(nodes[i]), int(nodes[i + 1])))

                    if (line.find("-----computeFrom-----") >= 0):
                        label_from = True
                        continue
                    if (label_from):
                        if line.find("-----guardedBy-----") >= 0:
                            label_from = False
                        else:
                            adj_com.append((int(nodes[0]), int(nodes[1])))

                    if (line.find("-----guardedBy-----") >= 0):
                        label_by = True
                        continue
                    if (label_by):
                        if line.find("-----guardedByNegation-----") >= 0:
                            label_by = False
                        else:
                            adj_guared.append((int(nodes[0]), int(nodes[1])))

                    if (line.find("-----guardedByNegation-----") >= 0):
                        label_negation = True
                        continue
                    if (label_negation):
                        if line.find("-----lastLexicalUse-----") >= 0:
                            label_negation = False
                        else:
                            adj_guared.append((int(nodes[0]), int(nodes[1])))

                    if (line.find("-----lastLexicalUse-----") >= 0):
                        label_use = True
                        continue
                    if (label_use):
                        if line.find("-----jump-----") >= 0:
                            label_use = False
                        else:
                            adj_lexical.append((int(nodes[0]), int(nodes[1])))

                    if (line.find("-----jump-----") >= 0):
                        label_jump = True
                        continue
                    if (label_jump):
                        if line.find("-----attribute-----") >= 0:
                            label_jump = False
                        else:
                            adj_jump.append((int(nodes[0]), int(nodes[1])))

                    if (line.find("-----attribute-----") >= 0):
                        label_att = True
                        continue
                    if (label_att):
                        if line.find("-----ast_node-----") >= 0:
                            label_att = False
                        else:
                            num = line.strip().split(';')
                            for x in num:
                                if (x == "" or x == '\n'):
                                    num.remove(x)

                    if (line.find("-----joern-----") >= 0):
                        label_joern = True
                        continue
                    if (label_joern):
                        if line.find("-----------------------------------") >= 0:
                            label_joern = False
                        else:
                            threedot = line.strip().split("(")[1].split(")")[0].split(",")  # 分割成三元组

                            try:
                                adj_single = (int(threedot[0]), int(threedot[1]))
                                if int(threedot[2]) == 0:
                                    adj_cdfg_a.append(adj_single)
                                    continue
                                if int(threedot[2]) == 1:
                                    adj_cdfg_c.append(adj_single)
                                    continue
                                if int(threedot[2]) == 2:
                                    adj_cdfg_p.append(adj_single)
                                    continue
                            except Exception as e:
                                print("joern nodes occur errors")
                                print(e)
                                continue
                    if line.find("-----------------------------------") >= 0:
                        label_joern_word = True
                        continue
                    if (label_joern_word):
                        if re.search('(?<=,).*', line):
                            joern_word.append(re.search('(?<=,).*', line).group().split(')')[0])

            # nodes of ast need to be smaller than len(attribute)
            adj_len = len(num)
            adj_child = filterNodes(adj_child, adj_len)
            adj_next = filterNodes(adj_next, adj_len)
            adj_com = filterNodes(adj_com, adj_len)
            adj_guared = filterNodes(adj_guared, adj_len)
            adj_lexical = filterNodes(adj_lexical, adj_len)
            adj_jump = filterNodes(adj_jump, adj_len)

            # vectors of cdfg
            vectors_cdfg = []
            model = word2vec.Word2Vec.load(
                os.path.split(filename)[0] + "/word2vec_" + str(os.path.split(filename)[1]) + '.pkl')

            for i in range(len(joern_word)):
                word_single = joern_word[i].split(" ")
                try:
                    vector = model.wv[word_single]
                except:
                    vector = np.reshape(random_use, (1, 100))
                if np.size(vector) > 100:
                    vector = vector.T
                    kpca = decomposition.KernelPCA(kernel='rbf', gamma=10, n_components=1)
                    vector = kpca.fit_transform(vector).T
                vector = vector[-1, 0:100]
                vectors_cdfg.append(vector.tolist())

            # vectors of ast
            vectors_ast = []
            with open(os.path.split(filename)[0] + "/our_map_all.txt", "r") as f:
                s = f.read()
                s = s.replace('\'', '\"')
                mapping = json.loads(json.dumps(eval(s)))
            for i in range(len(num)):
                word_single = num[i]
                try:
                    vector = mapping[word_single]
                except:
                    vector = random_use.tolist()
                # vector = vector[-1, 0:99]
                vectors_ast.append(vector)
            label = int(label_single) + 0.0

            # add edges
            adj_ast_total = []
            adj_single = [adj_child, adj_com, adj_next, adj_jump, adj_guared, adj_lexical]
            adj_ast_total.append(adj_single)

            adj_cdfg_total = []
            adj_single = [adj_cdfg_a, adj_cdfg_c, adj_cdfg_p]
            adj_cdfg_total.append(adj_single)

            adj_auxiliaryInput_total = []
            adj_single = [adj_cdfg_a, adj_cdfg_c, adj_cdfg_p]
            adj_auxiliaryInput_total.append(adj_single)

            # store
            with jsonlines.open(os.path.split(filename)[0] + '/' + str(os.path.split(filename)[1]) + '_ast.jsonl',
                                mode='a') as writer:
                writer.write(
                    {"Property": label, "graph": {"node_features": vectors_ast, "adjacency_lists": adj_ast_total[0]}})
            with jsonlines.open(os.path.split(filename)[0] + '/' + str(os.path.split(filename)[1]) + '_cdfg.jsonl',
                                mode='a') as writer:
                writer.write(
                    {"Property": label, "graph": {"node_features": vectors_cdfg, "adjacency_lists": adj_cdfg_total[0]}})

            # show process
            count = count + 1
            print("\rprocess : {:.2f}".format((count / (1.0 * files.__len__()) * 100)) + "%",end=' ')

# spilt and zip
# warning: samples cant be less than 200, otherwise spliting process will occur errors.
def Split(train, valid, test, path):
    print("\nbegin to split files...")

    """
    -------------AST---------------
    """
    tem_ast = []
    mkdir(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/ast')
    with open(os.path.split(path)[0] + '/' + str(os.path.split(path)[1]) + '_ast.jsonl', "r+", encoding="utf8") as f:
        for item in jsonlines.Reader(f):
            tem_ast.append(item)
    # 1:1
    # randomtem=np.arange(len(tem_ast))
    randomtem = np.arange(len(tem_ast))
    pos_tem = []
    neg_tem = []

    for step, i in enumerate(randomtem):
        ast = tem_ast[i]
        if ast['Property'] == 0:
            neg_tem.append(ast)
        else:
            pos_tem.append(ast)
    length = min(len(pos_tem), len(neg_tem))
    neg_tem = neg_tem[:length]
    pos_tem = pos_tem[:length]

    tem_train = neg_tem[:int(length * train)] + pos_tem[:int(length * train)]
    np.random.shuffle(tem_train)
    tem_valid = (neg_tem[int(length * train):int(length * (train + valid))]) + (
        pos_tem[int(length * train):int(length * (train + valid))])
    np.random.shuffle(tem_valid)
    tem_test = (neg_tem[int(length * (train + valid)):]) + (pos_tem[int(length * (train + valid)):])
    np.random.shuffle(tem_test)
    # tem=tem_train+tem_valid+tem_test
    path_tem = os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/ast/ast.jsonl'
    for i in tem_train:
        with jsonlines.open(path_tem,
                            mode='a') as writer:
            writer.write(i)
    f_in = open(path_tem, 'rb')
    # print(os.getcwd())
    f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/ast/train.jsonl.gz', 'wb')
    f_out.writelines(f_in)
    f_out.close()
    f_in.close()
    os.remove(path_tem)
    # print("train ready")

    for i in tem_valid:
        with jsonlines.open(path_tem,
                            mode='a') as writer:
            writer.write(i)
    f_in = open(path_tem, 'rb')
    # print(os.getcwd())
    f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/ast/valid.jsonl.gz', 'wb')
    f_out.writelines(f_in)
    f_out.close()
    f_in.close()
    os.remove(path_tem)
    # print("valid ready")

    for i in tem_test:
        with jsonlines.open(path_tem,
                            mode='a') as writer:
            writer.write(i)

    # zip
    f_in = open(path_tem, 'rb')
    # print(os.getcwd())
    f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/ast/test.jsonl.gz', 'wb')
    f_out.writelines(f_in)
    f_out.close()
    f_in.close()
    os.remove(path_tem)
    # print("test ready")

    """
    -------------CDFG---------------
    """

    tem_cdfg = []
    mkdir(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/cdfg')

    with open(os.path.split(path)[0] + '/' + str(os.path.split(path)[1]) + '_cdfg.jsonl', "r+", encoding="utf8") as f:
        for item in jsonlines.Reader(f):
            tem_cdfg.append(item)
    # 1:1
    randomtem = np.arange(len(tem_cdfg))
    pos_tem = []
    neg_tem = []

    for step, i in enumerate(randomtem):
        ast = tem_cdfg[i]
        if ast['Property'] == 0:
            neg_tem.append(ast)
        else:
            pos_tem.append(ast)
    length = min(len(pos_tem), len(neg_tem))
    neg_tem = neg_tem[:length]
    pos_tem = pos_tem[:length]

    tem_train = neg_tem[:int(length * train)] + pos_tem[:int(length * train)]
    np.random.shuffle(tem_train)
    tem_valid = (neg_tem[int(length * train):int(length * (train + valid))]) + (
        pos_tem[int(length * train):int(length * (train + valid))])
    np.random.shuffle(tem_valid)
    tem_test = (neg_tem[int(length * (train + valid)):]) + (pos_tem[int(length * (train + valid)):])
    np.random.shuffle(tem_test)
    path_tem = os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/cdfg/cdfg.jsonl'
    for i in tem_train:
        with jsonlines.open(path_tem,
                            mode='a') as writer:
            writer.write(i)
    f_in = open(path_tem, 'rb')
    # print(os.getcwd())
    f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/cdfg/train.jsonl.gz', 'wb')
    f_out.writelines(f_in)
    f_out.close()
    f_in.close()
    os.remove(path_tem)
    # print("train ready")

    for i in tem_valid:
        with jsonlines.open(path_tem,
                            mode='a') as writer:
            writer.write(i)
    f_in = open(path_tem, 'rb')
    # print(os.getcwd())
    f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/cdfg/valid.jsonl.gz', 'wb')
    f_out.writelines(f_in)
    f_out.close()
    f_in.close()
    os.remove(path_tem)
    # print("valid ready")

    for i in tem_test:
        with jsonlines.open(path_tem,
                            mode='a') as writer:
            writer.write(i)

    # zip
    f_in = open(path_tem, 'rb')
    # print(os.getcwd())
    f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_' + os.path.split(path)[1] + '/cdfg/test.jsonl.gz', 'wb')
    f_out.writelines(f_in)
    f_out.close()
    f_in.close()
    os.remove(path_tem)

    print("data ready")


def Preprocess(path):
    # os.path.split() return path and file's name. remember to use '/' rather than '\'
    cwetype = os.path.split(path)[1]
    # check if vocabulary exists
    w2v(path, cwetype)

    # split
    astJsonl = os.path.split(path)[0] + '/' + str(os.path.split(path)[1]) + '_ast.jsonl'
    cdfgJsonl = os.path.split(path)[0] + '/' + str(os.path.split(path)[1]) + '_cdfg.jsonl'
    # auxiliaryInputJsonl = os.path.split(path)[0] + '/' + str(os.path.split(path)[1]) + '_auxiliaryInput.jsonl'

    if os.path.exists(astJsonl) and os.path.exists(cdfgJsonl) :
        Split(0.8, 0.1, 0.1, path)
    else:
        GetInfor(path)
        Split(0.8, 0.1, 0.1, path)
