# 1. 导入数据
import numpy

import numpy as np
import pandas as pd
from sklearn import metrics
from nonconformist.base import ClassifierAdapter
from nonconformist.icp import IcpClassifier
from nonconformist.nc import ClassifierNc
from sklearn.externals import joblib
from sklearn.model_selection import train_test_split
from sklearn.datasets import make_moons
import warnings
import numpy as np
import matplotlib.pyplot as plt
from sklearn.neighbors import KNeighborsClassifier
from sklearn.tree import DecisionTreeClassifier
import _pickle
warnings.filterwarnings("ignore")
from sklearn.ensemble import RandomForestClassifier, VotingClassifier, GradientBoostingClassifier, AdaBoostClassifier, \
    BaggingClassifier
from sklearn.linear_model import LogisticRegression
from sklearn.svm import SVC
from sklearn.metrics import accuracy_score, precision_score, recall_score, confusion_matrix, classification_report, \
    f1_score, precision_recall_curve
import InputData_New
for saveplot in range(1):
    flag_data = 0
    data_all=[]
    for plot_num in range (100):
        thres = 0.5
        posstr=r'data\train\json\pos'
        negstr=r'data\train\json\neg'

        # #提取特征 路径 600：维度 model名称

        feature=InputData_New.InputData(negstr,posstr,"w2v_model")

        feature_log=feature[0]
        labela_log=feature[2]
        feature_log, feature_log_test, labela_log, labela_log_test = train_test_split(feature_log,
                                                            labela_log,
                                                                test_size=0.3,
                                                                random_state=None)

        train_X, train_y = feature_log, np.array(labela_log)
        train_y=train_y.reshape(np.size(train_y), 1)
        for i, y_ in enumerate(np.unique(train_y)):
            train_y[train_y == y_] = i
        n_instances = train_y.size
        idx = np.random.permutation(n_instances)
        trainX_idx = idx[:int(n_instances / 2)]
        trainy_idx = idx[:int(n_instances / 2)]
        traincalX_idx = idx[int(n_instances / 2):]
        traincaly_idx = idx[int(n_instances / 2):]

        test_X,test_y=feature_log_test,np.array(labela_log_test)
        test_y=test_y.reshape(np.size(test_y), 1)


        for i, y_ in enumerate(np.unique(test_y)):
            test_y[test_y == y_] = i
        # shuffle
        n_instances = test_y.size
        idx = np.random.permutation(n_instances)

        testX1_idx = idx[:]
        testy1_idx = idx[:]

        # 2. 训练个体分类器：
        log_clf = LogisticRegression(solver="liblinear")
        rnd_clf = RandomForestClassifier()
        svm_clf = SVC(gamma="auto", probability=True)
        gbc_clf = GradientBoostingClassifier()
        knn_clf = KNeighborsClassifier()
        ada_clf = AdaBoostClassifier()
        # 3. 导入软投票分类器并拟合：
        voting_clf = VotingClassifier(
            estimators=[
                ('lr', log_clf),
                ('rf', rnd_clf),
                ('gbc', gbc_clf),
                ('svm',svm_clf),
                ('knn',knn_clf),
                ('ada',ada_clf)],
            voting='soft')

        classifier=[log_clf,rnd_clf,gbc_clf,svm_clf,knn_clf,ada_clf, voting_clf]
        classifier_name=["KNN_clf","rnd_clf","gbc_clf","svm_clf","knn_clf","ada_clf","voting_clf"]
        
        for i in range(len(classifier)):
            clf=classifier[i]

            color=['black','y','m','b','g','c','grey']
            classifier_name=['I','II','III','IV','V','VI','VII']
            
            plt.figure(1)  # 创建图表1
            plt.title('classifier+Precision/Recall Curve'+str(plot_num))  # give plot a title
            plt.xlabel('recall')  # make axis labels
            plt.ylabel('precision')
            probas_ = clf.fit(train_X[trainX_idx, :], train_y[trainy_idx,0]).predict_proba(test_X[testX1_idx, :])
            precision, recall, thresholds = precision_recall_curve(test_y[testy1_idx], probas_[:, 1])
            # fpr, tpr, thresholds = metrics.roc_curve(test_y[testy1_idx], probas_[:, 1], pos_label=1)
            # precision=(-np.sort(-fpr))
            # recall = np.sort(tpr)
            precision = (-np.sort(-precision))
            recall = np.sort(recall)

            ax = plt.gca()
            ax.invert_xaxis()
            data=np.vstack((precision,recall))
            data_all.append(data)
            data=[]

            plt.figure(1)
            plt.plot(recall, precision, color=color[i], label=classifier_name[i], linewidth=2)

        plt.show()
        numpy.savetxt(str(plot_num) + "data_coms.csv", data_all[0], delimiter=',')
        import csv
         # 处理csv读写时不同换行符  linux:\n    windows:\r\n    mac:\r
        with open(str(plot_num) + "data_coms.csv", "a+",
                  newline='') as file: 
            csv_file = csv.writer(file)
            csv_file.writerows(data_all[1])
            csv_file.writerows(data_all[2])
            csv_file.writerows(data_all[3])
            csv_file.writerows(data_all[4])
            csv_file.writerows(data_all[5])
            csv_file.writerows(data_all[6])
        data_all=[]
        print("over")
