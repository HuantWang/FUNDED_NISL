"""
java数据预处理，输入为类似joern的ast、cpg
"""
import gzip
import warnings
import jsonlines
from gensim.models import word2vec, Word2Vec
import re
import numpy as np
import os
warnings.filterwarnings("ignore")

# 存储边信息
adj_zc = []

# cdfg边信息
adj_cdfg_a = []
adj_cdfg_c = []
adj_cdfg_p = []


# 获得AST或CDFG的图信息
def w2v(filename,cwetype):
    if os.path.exists(os.path.split(filename)[0]+"/" + "word2vec_" + str(cwetype) + ".pkl"):
        print("Word2Vec ready !")
        return
    words = []
    for root, dirs, files in os.walk(filename):  # os.walk()返回一个三元组,
        # 随机打乱文件
        np.random.shuffle(files)
        for file in files:
            flag_vec = 0
            word = []
            with open(os.path.join(root + "/" + file), "r") as f:
                for line in f.readlines():
                    if "-" * 20 in line:
                        flag_vec = 1

                    if flag_vec == 1:  # 处理特征矩阵
                        if "^" * 20 in line:
                            for i in word:
                                words.append(i)
                            # continue
                        if re.search('(?<=,).*', line):
                            # print(a.group().split(')')[0])
                            # 去除空的情况
                            # if a.group().split(')')[0] != '':
                            word.append(re.search('(?<=,).*', line).group().split(')')[0].split(" "))  # 将token加入数组
    model = Word2Vec(words, min_count=1, size=100, sg=1, window=5,
                     negative=3, sample=0.001, hs=1, workers=4)

    # a=model.wv.vocab
    # for k in a:
    #     print(k)
    model.save(os.path.split(filename)[0]+"/"+ "word2vec_" + str(cwetype) + ".pkl")
    print("Word2Vec ready")

def GetInfor(filename):
    import gzip
    for root, dirs, files in os.walk(filename):  # os.walk()返回一个三元组,
        np.random.shuffle(files)
        filenum = len(files)
        count = 0
        save = 0
        for fname in files:
            # ast边信息
            # cdfg边信息
            adj_cdfg_a = []
            adj_cdfg_c = []
            adj_cdfg_p = []
            # 针对每个文件的初始化
            label_joern = True  # cdfg
            label_joern_word = False # joern_word
            label_joern_label = False # label
            count += 1
            joern_word = []

            with open(root +'/'+ fname, "r") as f:
                listnum = []
                listnew = []
                data = f.readlines()
                for line in data:
                    if (label_joern):
                        if line.find("-----------------------------------") >= 0:
                            label_joern = False
                        else:
                            threedot = line.strip().split(",")  # 分割成三元组
                            listnum.append(int(threedot[0]))
                            listnum.append(int(threedot[1]))
                # 过滤重复项
                for item in listnum:
                    if not item in listnew:
                        listnew.append(item)
                listnew.sort()
                f.seek(0)

                data = f.readlines()
                label_joern = True
                for line in data:
                    if (label_joern):
                        if line.find("-----------------------------------") >= 0:
                            label_joern = False
                        else:
                            threedot = line.strip().split(",")  # 分割成三元组

                            try:
                                adj_single = (listnew.index(int(threedot[0])), listnew.index(int(threedot[1])))

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
                                print(e)
                                continue  # 大于100直接跳过
                    if line.find("-----------------------------------") >= 0:
                        label_joern_word = True
                        continue
                    if (label_joern_word):
                        if line.find("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^") >= 0:
                            label_joern_word = False
                        if re.search('(?<=,).*', line):
                            joern_word.append(re.search('(?<=,).*', line).group().split(')')[0])
                    if line.find("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^") >= 0:
                        label_joern_label = True
                        continue
                    if (label_joern_label):
                        label_single = line.strip()

            label = int(label_single) + 0.0

            #处理CDFG的特征向量
            random_use = np.random.rand(100)
            vectors_cdfg = []
            model = word2vec.Word2Vec.load(os.path.split(filename)[0]+"/word2vec_" + str(os.path.split(filename)[1]) + '.pkl')
            for i in range(len(joern_word)):
                word_single1 = joern_word[i].split(" ")
                try:
                    vector = model.wv[word_single1]  # 查词
                except:
                    vector = np.reshape(random_use, (1, 100))

                vector = vector[-1, 0:100]
                vectors_cdfg.append(vector.tolist())

            # 处理AST的特征向量
            # java里面就用cdfg即可

            adj_singel = [adj_cdfg_a]
            adj_ast_total = []
            adj_ast_total.append(adj_singel)
            adj_singel = [adj_cdfg_c, adj_cdfg_p]
            adj_cdfg_total = []
            adj_cdfg_total.append(adj_singel)
            # 存储AST文件
            with jsonlines.open(os.path.split(filename)[0]+'/'+str(os.path.split(filename)[1])+'_ast.jsonl', mode='a') as writer:
                writer.write(
                            {"Property": label, "graph": {"node_features": vectors_cdfg, "adjacency_lists": adj_ast_total[0]}})
            with jsonlines.open(os.path.split(filename)[0]+'/'+str(os.path.split(filename)[1])+'_cdfg.jsonl', mode='a') as writer:
                writer.write(
                            {"Property": label, "graph": {"node_features": vectors_cdfg, "adjacency_lists": adj_cdfg_total[0]}})

def mkdir(path):
    # 引入模块
    import os
    # 去除首位空格
    path = path.strip()
    # 去除尾部 \ 符号
    path = path.rstrip("\\")
    # 判断路径是否存在
    # 存在     True
    # 不存在   False
    isExists = os.path.exists(path)
    # 判断结果
    if not isExists:
        # 如果不存在则创建目录
        # 创建目录操作函数
        os.makedirs(path)
        print(path + ' ready now')
        return True
    else:
        # 如果目录存在则不创建，并提示目录已存在
        print(path + ' ready')
        return False
#spilt and zip
def Split(train,valid,test,path):

    tem_ast=[]
    tem_cdfg=[]
    mkdir(os.path.split(path)[0]+'/'+'tem_'+os.path.split(path)[1]+'/ast')
    mkdir(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg')


    #ast+cdfg
    with open(os.path.split(path)[0]+'/'+str(os.path.split(path)[1])+'_ast.jsonl', "r+", encoding="utf8") as f:
        for item in jsonlines.Reader(f):
            tem_ast.append(item)
    with open(os.path.split(path)[0]+'/'+str(os.path.split(path)[1])+'_cdfg.jsonl', "r+", encoding="utf8") as f:
        for item in jsonlines.Reader(f):
            tem_cdfg.append(item)
    randomtem=np.arange(len(tem_ast))
    np.random.shuffle(randomtem)
    for step,i in enumerate(randomtem):
        ast=tem_ast[i]
        cdfg=tem_cdfg[i]
        # a=len(tem_ast)*train
        if step+1<int(len(tem_ast)*train):
            with jsonlines.open(os.path.split(path)[0]+'/'+'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl', mode='a') as writer:
                writer.write(ast)
            with jsonlines.open(os.path.split(path)[0]+'/'+'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl', mode='a') as writer:
                writer.write(cdfg)
            continue
        if step+1 == int(len(tem_ast)*train):
            # zip
            f_in = open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl', 'rb')
            # print(os.getcwd())
            f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/train.jsonl.gz', 'wb')
            f_out.writelines(f_in)
            f_out.close()
            f_in.close()
            os.remove(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl')
            f_in = open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl', 'rb')
            # print(os.getcwd())
            f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/train.jsonl.gz', 'wb')
            f_out.writelines(f_in)
            f_out.close()
            f_in.close()
            os.remove(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl')
            print("train ready")
            continue
        if step+1>int(len(tem_ast)*train) and step+1<int(len(tem_ast)*(train+valid)):
            with jsonlines.open(os.path.split(path)[0]+'/'+'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl', mode='a') as writer:
                writer.write(ast)
            with jsonlines.open(os.path.split(path)[0]+'/'+'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl', mode='a') as writer:
                writer.write(cdfg)
            continue
        if step+1 == int(len(tem_ast)*(train+valid)):
            # zip
            f_in = open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl', 'rb')
            # print(os.getcwd())
            f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/valid.jsonl.gz', 'wb')
            f_out.writelines(f_in)
            f_out.close()
            f_in.close()
            os.remove(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl')
            f_in = open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl', 'rb')
            # print(os.getcwd())
            f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/valid.jsonl.gz', 'wb')
            f_out.writelines(f_in)
            f_out.close()
            f_in.close()
            os.remove(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl')
            print("valid ready")
            continue
        if step + 1 > int(len(tem_ast) * (train + valid)) and step + 1 < int(len(tem_ast)) :
            with jsonlines.open(os.path.split(path)[0]+'/'+'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl', mode='a') as writer:
                writer.write(ast)
            with jsonlines.open(os.path.split(path)[0]+'/'+'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl', mode='a') as writer:
                writer.write(cdfg)
            continue
        if step + 1 == int(len(tem_ast)) :
            # zip
            f_in = open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl', 'rb')
            # print(os.getcwd())
            f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/test.jsonl.gz', 'wb')
            f_out.writelines(f_in)
            f_out.close()
            f_in.close()
            os.remove(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/ast/ast.jsonl')
            f_in = open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl', 'rb')
            # print(os.getcwd())
            f_out = gzip.open(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/test.jsonl.gz', 'wb')
            f_out.writelines(f_in)
            f_out.close()
            f_in.close()
            os.remove(os.path.split(path)[0] + '/' + 'tem_'+os.path.split(path)[1]+'/cdfg/cdfg.jsonl')
            print("test ready")

def Preprocess(path):
    cwetype = os.path.split(path)[1]
    #检测是否有字典如果没有就训练
    w2v(path,cwetype)
    #进行jsonal的提取
    if os.path.exists(os.path.split(path)[0]+'/'+str(os.path.split(path)[1])+'_ast.jsonl') and os.path.exists(os.path.split(path)[0]+'/'+str(os.path.split(path)[1])+"_cdfg.jsonl"):
        Split(0.8,0.1,0.1,path)
    else:
        GetInfor(path)
        Split(0.8, 0.1, 0.1, path)
# Preprocess(r"D:\CWE-JAVA\final\CWE-601")