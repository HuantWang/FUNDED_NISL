import json
import re
import numpy as np
import os
from gensim.models import Word2Vec, word2vec
from sklearn.decomposition import PCA
from sklearn.feature_selection import VarianceThreshold
from sklearn.linear_model import RandomizedLasso
from sklearn.datasets import load_boston

def isContainChinese(s):
    for c in s:
        if ('\u4e00' <= c <= '\u9fa5'):
            return True
    return False
def check(str):
    file_all=[]
    for fpathe, dirs, files in os.walk(str):
        for file in files:
            f = open(os.path.join(fpathe, file),
                     encoding='utf-8')
            setting = json.load(f)
            feature_logsingle = []
            for (key, value) in setting.items():
                if value == []:
                    file_all.append(file)
                    continue
    file_all=set(file_all)
    for i in file_all:
        os.remove(str + '\\' + i)


def fla(arr):
    b = np.zeros((1, 1000))
    arr = np.array(arr).flatten()
    arr = arr.reshape(1, arr.size)
    arr = np.column_stack((arr, b))
    if arr.size >= 1000:
        arr = arr[:, 0:1000]
    return arr
def feature_pre(str,model,num):
    punctuation = '0-9’!"#$%&\'()*+,-./:;<=>?@，。?★、…【】《》？“”‘’！[\\]^_`{|}~#!@/,;:?"\''
    # 停用词
    stopwords = []
    with open(r'E:\Pycharm\PyProject\6_4\6_4\stopwords.txt', 'r') as f:
        for line in f:
            stopwords.append(line.strip())
        # 整行读取数据
    f.close()
    # word2vec模型
    model = Word2Vec.load("./" + model + ".pkl")

    feature_all=[]
    feature_tmp = []
    feature_url_tmp = []
    feature_label_tmp = []
    flag_feature = 0
    for fpathe, dirs, files in os.walk(str):
        for file in files:

            log_single = []
            edit_single=[]
            static_single=[]
            url_single=[]
            label_single=[]
            f = open(os.path.join(fpathe, file),
                     encoding='utf-8')
            setting = json.load(f)

            for (key, value) in setting.items():
                value = "".join(value).replace("\n", " ")


                if key in ['commit_message','commitmessage']:
                    value = re.sub(r'[{}]+'.format(punctuation), ' ', value)
                    if (isContainChinese(value) == True):
                        continue
                    elif (isContainChinese(value) == False):
                        log_single.append(value)
                elif key == 'edit':
                    value = re.sub(r'[{}]+'.format(punctuation), ' ', value)
                    pattern = re.compile(r"(\w+)")
                    ferature_tem = pattern.findall(value)
                    for element in ferature_tem:
                        if (element not in edit_single and element not in stopwords):
                            edit_single.append(element)
                elif key == 'new_feature':
                    value = value.split(",")
                    static_single = np.array(value[0:6])
                elif key == "url":
                    url_single=value
            #log feature to vec
            word = "".join(log_single).split()
            log_feature_single = []
            for word_single in word:
                if word_single in stopwords:
                    continue
                else:
                    try:
                        log_feature_single.append(model[word_single])
                    except:
                        continue
            # patch feature to vec
            edit_feature_single = []
            for word_single in edit_single:
                if word_single in stopwords:
                    continue
                else:
                    try:
                        edit_feature_single.append(model[word_single])
                    except:
                        continue
            #平铺并变成一维
            static_single_tmp=[]
            static_single=static_single.reshape(1,6)

            for i in static_single[0:1] [0]:
                static_single_tmp.append(float(i))

            static_single=np.array(static_single_tmp)
            static_single = static_single.reshape(1, 6)
            log_feature_single=fla(log_feature_single)
            edit_feature_single=fla(edit_feature_single)
            #合并特征
            feature_single=np.hstack((log_feature_single,edit_feature_single))
            # feature_single=np.hstack((feature_single,static_single))


            if flag_feature == 0:
                feature_tmp=feature_single
                feature_url_tmp=url_single
                feature_label_tmp.append(num)
                flag_feature = 1
            elif flag_feature == 1:
                feature_tmp=np.vstack((feature_tmp,feature_single))
                feature_url_tmp = np.vstack((feature_url_tmp, url_single))
                feature_label_tmp.append(num)

    feature_all.append(feature_tmp)
    feature_all.append(feature_url_tmp)
    feature_all.append(np.array(feature_label_tmp))
    return feature_all

def InputData(negstr,posstr,model):
    feature_all=[]
    #检查数据
    check(negstr)
    check(posstr)
    #获取特征
    neg_feature=feature_pre(negstr, model,0)
    pos_feature=feature_pre(posstr, model,1)
    feature=np.vstack((neg_feature[0],pos_feature[0]))
    url=np.vstack((neg_feature[1],pos_feature[1]))
    label=np.hstack((neg_feature[2],pos_feature[2]))
    #特征选择

    # X = feature
    # Y = label
    #
    # sel = VarianceThreshold()  # 表示剔除特征的方差大于阈值的特征Removing features with low variance
    # a=sel.fit_transform(X)
    # sel = VarianceThreshold(np.sort(sel.variances_)[1005])  # 表示剔除特征的方差大于阈值的特征Removing features with low variance
    # feature = sel.fit_transform(X)
    feature_all.append(feature)
    feature_all.append(url)
    feature_all.append(label)
    return feature_all





# estimator = PCA(n_components=1)
# log_feature_single = np.transpose(estimator.fit_transform(np.transpose(np.array(log_feature_single))))
# edit_feature_single = np.transpose(estimator.fit_transform(np.transpose(np.array(edit_feature_single))))
#     print("a")

# InputData(r"F:\Github\CCS19\Curre\New_system\6_4\data_new\ours\neg",
#                                   r"F:\Github\CCS19\Curre\New_system\6_4\data_new\ours\pos","w2v_model")
# print("a")