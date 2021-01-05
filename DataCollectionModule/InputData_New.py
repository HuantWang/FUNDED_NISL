import json
import re
import numpy as np
import os
from gensim.models import Word2Vec

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
            for (key, value) in setting.items():
                if value == []:
                    file_all.append(file)
                    continue
    file_all=set(file_all)
    for i in file_all:
        os.remove(str + '\\' + i)


def fla(arr):
    # save same vector length
    b = np.zeros((1, 1000))
    arr = np.array(arr).flatten()
    arr = arr.reshape(1, arr.size)
    arr = np.column_stack((arr, b))
    if arr.size >= 1000:
        arr = arr[:, 0:1000]
    return arr

def feature_pre(str,model,num):
    # data preprocess
    punctuation = '0-9’!"#$%&\'()*+,-./:;<=>?@，。?★、…【】《》？“”‘’！[\\]^_`{|}~#!@/,;:?"\''
    # stopwords
    stopwords = []
    # load stopwords.txt
    with open('stopwords.txt', 'r') as f:
        for line in f:
            stopwords.append(line.strip())
    f.close()
    # load pre-trained Word2vec model
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
            #concat vector
            static_single_tmp=[]
            static_single=static_single.reshape(1,6)

            for i in static_single[0:1] [0]:
                static_single_tmp.append(float(i))

            static_single=np.array(static_single_tmp)
            static_single = static_single.reshape(1, 6)
            log_feature_single=fla(log_feature_single)
            edit_feature_single=fla(edit_feature_single)
            feature_single=np.hstack((log_feature_single,edit_feature_single))

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
    #check
    check(negstr)
    check(posstr)
    #extract feature to vector
    neg_feature=feature_pre(negstr, model,0)
    pos_feature=feature_pre(posstr, model,1)
    feature=np.vstack((neg_feature[0],pos_feature[0]))
    url=np.vstack((neg_feature[1],pos_feature[1]))
    label=np.hstack((neg_feature[2],pos_feature[2]))
    feature_all.append(feature)
    feature_all.append(url)
    feature_all.append(label)
    return feature_all
