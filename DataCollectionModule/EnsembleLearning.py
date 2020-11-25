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

        print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%")
        print("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%")
        thres = 0.5
        # print(thres)
        # print("ours-SAPdataset")
        # pos_train=r'F:\Github\CCS19\Curre\New_system\6_4\ML_double_url\our_byyear\year\our_byyear\5\pos'
        # neg_train=r'F:\Github\CCS19\Curre\New_system\6_4\ML_double_url\our_byyear\year\our_byyear\5\neg'
        # posstr=r'F:\Github\CCS19\Curre\New_system\6_4\ML_double_url\our_byyear\year\our_byyear\test\pos'
        # negstr=r'F:\Github\CCS19\Curre\New_system\6_4\ML_double_url\our_byyear\year\our_byyear\test\neg'
        # print("ours-OURSsdataset")
        posstr=r'data_new\train\sap\json\pos'
        negstr=r'data_new\train\sap\json\neg'
        # print("ours-ZVDdataset")
        # posstr=r'F:\Github\CCS19\Curre\New_system\6_4\data_new\train\Detect0_commits\neg_new'
        # negstr=r'F:\Github\CCS19\Curre\New_system\6_4\data_new\train\Detect0_commits\pos_new'
        # word2vec.word2vec_log(negstr,posstr,"w2v_model")
        # p_set=0.4
        # for nn in range(30):

        # #提取特征 路径 600：维度 model名称

        feature=InputData_New.InputData(negstr,posstr,"w2v_model")

        feature_log=feature[0]
        labela_log=feature[2]
        # feature_log, labela_log=InputData.InputData_log(negstr, posstr,600,"w2v_model")
        feature_log, feature_log_test, labela_log, labela_log_test = train_test_split(feature_log,
                                                            labela_log,
                                                                test_size=0.3,# 1
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
        # 打乱测试集
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
        # voting_clf.fit(train_X, train_y)

        #
        # train_X=train_X[trainX_idx, :]
        # train_y=train_y[trainy_idx, 0]
        # test_X=test_X[testX1_idx, :]
        # test_y=test_y[testy1_idx, 0]

        # train_y = np.array(train_y).reshape(1, -1)
        # test_y = np.array(test_y).reshape(1, -1)

        # for i in range(5):
        # flag=0
        classifier=[knn_clf]
        classifier_name=["knn_clf"]
        # classifier=[log_clf,rnd_clf,gbc_clf,svm_clf,knn_clf,ada_clf, voting_clf]
        # classifier_name=["KNN_clf","rnd_clf","gbc_clf","svm_clf","knn_clf","ada_clf","voting_clf"]
        for i in range(len(classifier)):
            clf=classifier[i]
            # clf.fit(train_X, train_y)
            # y_pred = clf.predict(test_X[testX1_idx, :])
            # pred_proba = clf.predict_proba(test_X[testX1_idx, :])[:, 1]
            # # thres=0.4
            # y_pred_new = pred_proba > thres
            # a = confusion_matrix(test_y[testy1_idx], y_pred_new)
            # print(classifier_name[i],"precision",clf.__class__.__name__, precision_score(test_y[testy1_idx], y_pred_new))
            # print(classifier_name[i],"recall",clf.__class__.__name__, recall_score(test_y[testy1_idx], y_pred_new))
            # print(classifier_name[i],"f1",clf.__class__.__name__, f1_score(test_y[testy1_idx], y_pred_new))
            # print(classifier_name[i],"TPR=", a[0:2][0][1] / (a[0:2][0][0] + a[0:2][0][1]))
            # print(classification_report(test_y[testy1_idx], y_pred))
            # print(confusion_matrix(test_y[testy1_idx], y_pred))
            #plotttttttttttttttttttttttttttttttt
            color=['black','y','m','b','g','c','grey']
            classifier_name=['I','II','III','IV','V','VI','VII']

            # classifier_name=["OURS","SAP"]
            # if flag==0:
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
            # import matplotlib.pyplot as plt
            # ax = plt.gca()
            # ax.invert_xaxis()
            # fig, ax = plt.subplots(figsize=(16, 10), dpi=80)
            # import numpy
            ax = plt.gca()
            ax.invert_xaxis()
            data=np.vstack((precision,recall))
            data_all.append(data)
            data=[]


                # csv_file.writerows(data_all[6])

            # numpy.savetxt(str(plot_num) + "detect.csv", data, delimiter=',')
            # numpy.savetxt("precision.csv", precision, delimiter=',')
            # numpy.savetxt("recall.csv", recall, delimiter=',')
                    #
                    #
                        # precision=np.array(precision.tolist().sort(reverse=True))
            # recall = np.array(recall.tolist().sort(reverse=False))
            plt.figure(1)
            plt.plot(recall, precision, color=color[i], label=classifier_name[i], linewidth=2)
            plt.legend()
            #         #
        plt.show()
        numpy.savetxt(str(plot_num) + "data_coms.csv", data_all[0], delimiter=',')
        # data_all=[]
        import csv
        with open(str(plot_num) + "data_coms.csv", "a+",
                  newline='') as file:  # 处理csv读写时不同换行符  linux:\n    windows:\r\n    mac:\r
            csv_file = csv.writer(file)
            csv_file.writerows(data_all[1])
            csv_file.writerows(data_all[2])
            csv_file.writerows(data_all[3])
            csv_file.writerows(data_all[4])
            csv_file.writerows(data_all[5])
            csv_file.writerows(data_all[6])
        data_all=[]
        print("over")
            # nc = ClassifierNc(ClassifierAdapter(clf))
            # icp = IcpClassifier(nc)
            # icp.fit(train_X[trainX_idx, :], train_y[trainy_idx, 0])
            # icp.calibrate(train_X[traincalX_idx, :], train_y[traincalX_idx])
            #
            # p = pd.DataFrame(icp.predict_conf(test_X[testX1_idx, :]))
            # p_sort = np.squeeze(np.sort(p.values[:, 2]))
            # p_sort = p_sort.reshape(1, p_sort.size)
            # # 淘汰10%
            #
            # value = int(p_sort.size * p_set)
            # p_value = p_sort[0, value]
            #
            # i = 0
            # delete_p = []
            # delete_old = []
            # alldeletenum = 0
            # rightdeletenum = 0
            # # 不过滤：
            # print("不过滤")
            # pred_label = clf.predict(test_X[testy1_idx, :])
            # print(confusion_matrix(test_y[testy1_idx].ravel(), pred_label))
            # print(classification_report(test_y[testy1_idx].ravel(), pred_label))
            #
            # # 筛选p-value小于阈值的样本
            # for i in range(len(p.values[:, 0])):
            #     if p.values[i, 2] < p_value:
            #         # print (testX1_idx[i]) #淘汰的在testy中的位置
            #         # print(p.values[i, 0])
            #         # print(test_y[testX1_idx[i]])
            #         alldeletenum += 1
            #         if (p.values[i, 0] == test_y[testX1_idx[i]]):
            #             rightdeletenum += 1
            #         delete_old.append(i)  # 淘汰的在testX1中的位置
            #         delete_p.append(testX1_idx[i])  # 淘汰的在testy总中的位置
            #
            # delete_p.sort(reverse=True)
            # delete_old.sort(reverse=True)
            #
            # print("过滤了" + str(alldeletenum) + "个")
            # # deleteaccuracy=rightdeletenum/alldeletenum
            # # print("过滤掉的数据标签正确的准确率："+"%.2f%%" % (deleteaccuracy * 100))
            # # np.delete(testy1_idx, 0)
            # # print(testX1_idx[0:3])
            # # np.delete(testX1_idx,0)
            # # print("ok")
            # # print(testX1_idx[0:3])
            # test_newindex = []
            # for i in range(testX1_idx.size):
            #     if i in delete_old:
            #         continue
            #     else:
            #         test_newindex.append(testX1_idx[i])
            #
            # # clf.fit(train_X, train_y.ravel())
            # # pred_label = knn.predict(test_X)
            # # print(knn.predict(test_X))
            # pred_label = clf.predict(test_X[test_newindex, :])
            # print(confusion_matrix(test_y[test_newindex].ravel(), pred_label))
            # print(classification_report(test_y[test_newindex].ravel(), pred_label))
            # a = confusion_matrix(test_y[test_newindex].ravel(), pred_label)[0:2][1]

            # print("______________________________________________________________")
        # #plotttttttttttttttttttttttttttttttt
        #     color=['black','y','m','b','g','c']
        #     classifier_name=['I','II','III','IV','V','VI']
        #
        #     # classifier_name=["OURS","SAP"]
        #     # if flag==0:
        #     plt.figure(1)  # 创建图表1
        #     plt.title('Precision/Recall Curve')  # give plot a title
        #     plt.xlabel('precision')  # make axis labels
        #     plt.ylabel('recall')
        #     probas_ = clf.fit(train_X[trainX_idx, :], train_y[trainy_idx,0]).predict_proba(test_X[testX1_idx, :])
        #     precision, recall, thresholds = precision_recall_curve(test_y[testy1_idx], probas_[:, 1])
        #     # fpr, tpr, thresholds = metrics.roc_curve(test_y[testy1_idx], probas_[:, 1], pos_label=1)
        #     # precision=(-np.sort(-fpr))
        #     # recall = np.sort(tpr)
        #     precision = (-np.sort(-precision))
        #     recall = np.sort(recall)
        #     # import matplotlib.pyplot as plt
        #     # ax = plt.gca()
        #     # ax.invert_xaxis()
        #     # fig, ax = plt.subplots(figsize=(16, 10), dpi=80)
        #     # import numpy
        #     ax = plt.gca()
        #     ax.invert_xaxis()
        #     data=np.vstack((precision,recall))
        #     data_all.append(data)
        #
        #     numpy.savetxt(str(plot_num) + "data_21.csv",data_all[0], delimiter=',')
        #     data_all=[]
            # import csv
            # with open(str(plot_num) + "data.csv", "a+",
            #           newline='') as file:  # 处理csv读写时不同换行符  linux:\n    windows:\r\n    mac:\r
            #     csv_file = csv.writer(file)
            #     csv_file.writerows(data[1])
                        # csv_file.writerows(data_all[2])
                        # csv_file.writerows(data_all[3])
                        # csv_file.writerows(data_all[4])
            #             csv_file.writerows(data_all[5])
            #             csv_file.writerows(data_all[6])
            # data_all.append(data)
            # numpy.savetxt(str(plot_num) + "detect.csv", data, delimiter=',')
        # numpy.savetxt("precision.csv", precision, delimiter=',')
        # numpy.savetxt("recall.csv", recall, delimiter=',')
#         #
#         #
#             precision=np.array(precision.tolist().sort(reverse=True))
        # recall = np.array(recall.tolist().sort(reverse=False))
#             plt.figure(1)
#             plt.plot(precision, recall, color=color[i], label=classifier_name[i], linewidth=2)
#             plt.legend()
# #         #
#             plt.show()
#         # print("a")
#         #     flag=1
#         # elif flag==1:
#         #     probas_ = clf.fit(train_X[trainX_idx, :], train_y[trainy_idx, 0]).predict_proba(test_X[testX1_idx, :])
#         #     precision, recall, thresholds = precision_recall_curve(test_y[testy1_idx], probas_[:, 1])
#         #     plt.figure(1)
#         #     plt.plot(precision, recall,color=color[i], label =classifier_name[i],linewidth=2)
#         #     plt.legend()
#         # plt.savefig(str(num) + '.pdf')
#
#     negstr = r'F:\Github\CCS19\Curre\New_system\6_4\data_new\train\sap\json\neg'
#     posstr = r'F:\Github\CCS19\Curre\New_system\6_4\data_new\train\sap\json\pos'
#     # word2vec.word2vec_log(negstr,posstr,"w2v_model")
#     p_set=0.4
#     # for nn in range(30):
#
#     # #提取特征 路径 600：维度 model名称
#
#     feature=InputData_New.InputData(negstr,posstr,"w2v_model")
#
#     feature_log=feature[0]
#     labela_log=feature[2]
#     # feature_log, labela_log=InputData.InputData_log(negstr, posstr,600,"w2v_model")
#     feature_log, feature_log_test, labela_log, labela_log_test = train_test_split(feature_log,
#                                                         labela_log,
#                                                             test_size=0.2,# 1
#                                                             random_state=None)
#
#     train_X, train_y = feature_log, np.array(labela_log)
#     train_y=train_y.reshape(np.size(train_y), 1)
#     for i, y_ in enumerate(np.unique(train_y)):
#         train_y[train_y == y_] = i
#     n_instances = train_y.size
#     idx = np.random.permutation(n_instances)
#     trainX_idx = idx[:int(n_instances / 2)]
#     trainy_idx = idx[:int(n_instances / 2)]
#     traincalX_idx = idx[int(n_instances / 2):]
#     traincaly_idx = idx[int(n_instances / 2):]
#
#     test_X,test_y=feature_log_test,np.array(labela_log_test)
#     test_y=test_y.reshape(np.size(test_y), 1)
#
#
#     for i, y_ in enumerate(np.unique(test_y)):
#         test_y[test_y == y_] = i
#     # 打乱测试集
#     n_instances = test_y.size
#     idx = np.random.permutation(n_instances)
#
#     testX1_idx = idx[:]
#     testy1_idx = idx[:]
#
#     # 2. 训练个体分类器：
#     log_clf = LogisticRegression(solver="liblinear")
#     rnd_clf = RandomForestClassifier()
#     svm_clf = SVC(gamma="auto", probability=True)
#     gbc_clf = GradientBoostingClassifier()
#     knn_clf = KNeighborsClassifier()
#     ada_clf = AdaBoostClassifier()
#     # 3. 导入软投票分类器并拟合：
#     voting_clf = VotingClassifier(
#         estimators=[
#             ('lr', log_clf),
#             ('rf', rnd_clf),
#             ('gbc', gbc_clf),
#             ('svm',svm_clf),
#             ('knn',knn_clf),
#             ('ada',ada_clf)],
#         voting='soft')
#     voting_clf.fit(train_X, train_y)
#
#     #
#     # train_X=train_X[trainX_idx, :]
#     # train_y=train_y[trainy_idx, 0]
#     # test_X=test_X[testX1_idx, :]
#     # test_y=test_y[testy1_idx, 0]
#
#     # train_y = np.array(train_y).reshape(1, -1)
#     # test_y = np.array(test_y).reshape(1, -1)
#
#     # for i in range(5):
#     flag=0
#     classifier=[voting_clf]
#     classifier_name=["voting_clf"]
#     # classifier=[log_clf,rnd_clf,gbc_clf,svm_clf,knn_clf,ada_clf, voting_clf]
#     # classifier_name=["log_clf","rnd_clf","gbc_clf","svm_clf","knn_clf","ada_clf","voting_clf"]
#     # for i in range(len(classifier)):
#     clf=voting_clf
#     # clf.fit(train_X[trainX_idx, :], train_y[trainy_idx,0])
#     # y_pred = clf.predict(test_X[testX1_idx, :])
#     # pred_proba = clf.predict_proba(test_X[testX1_idx, :])[:, 1]
#     # thres = 0.6
#     # y_pred_new = pred_proba > thres
#     # print(clf.__class__.__name__, precision_score(test_y[testy1_idx], y_pred))
#     # print(clf.__class__.__name__, recall_score(test_y[testy1_idx], y_pred))
#     # print(clf.__class__.__name__, f1_score(test_y[testy1_idx], y_pred))
#     #plotttttttttttttttttttttttttttttttt
#     # color=['black','r','y','m','b','g','c']
#     # classifier_name=["OURS","SAP"]
#     if flag==0:
#         plt.figure(1)  # 创建图表1
#         plt.title('Precision/Recall Curve')  # give plot a title
#         plt.xlabel('Precision')  # make axis labels
#         plt.ylabel('Recall')
#         probas_ = clf.fit(train_X[trainX_idx, :], train_y[trainy_idx,0]).predict_proba(test_X[testX1_idx, :])
#         precision, recall, thresholds = precision_recall_curve(test_y[testy1_idx], probas_[:, 1])
#         precision = (-np.sort(-precision))
#         recall = np.sort(recall)
#         data = np.vstack((precision, recall))
#         ax = plt.gca()
#         ax.invert_xaxis()
#         data_all.append(data)
#         # if flag_data == 0:
#         #     data_all = data
#         #     flag_data = 1
#         # elif flag_data == 1:
#         # data_all = np.vstack((data_all, data))
#         plt.figure(1)
#         plt.plot(precision, recall,color='red', label  ="VIIl" ,linewidth=2)
#         plt.legend()
#         plt.savefig(str(saveplot)+'_pvalue.pdf')
#
#         numpy.savetxt(str(saveplot)+"data.csv", data_all[0], delimiter=',')
#
#         import csv
#
#         with open(str(saveplot)+"data.csv", "a+", newline='') as file:  # 处理csv读写时不同换行符  linux:\n    windows:\r\n    mac:\r
#             csv_file = csv.writer(file)
#             csv_file.writerows(data_all[1])
#             csv_file.writerows(data_all[2])
#             csv_file.writerows(data_all[3])
#             csv_file.writerows(data_all[4])
#             csv_file.writerows(data_all[5])
#             csv_file.writerows(data_all[6])
#         # numpy.savetxt(str(saveplot) + "data_sap.csv", data_all, delimiter=',')
#     plt.show()
#
# # print("___________________________________________________")
# #
#
# #

# #
# # print("总召回率",a[0:2][1]/(test_y.tolist().count([1])))
# # p_set=p_set+0.025
# # test_url = list(url_static[:, 0])
# #     # test_word = list(url_log[:, 1])
# #     test_var = list(url_static[:, 1])
# #     y_true = test_y[test_newindex, :]
# #     pred_label = pred_label.tolist()
# #     pos = []
# #     pos_feature = []
# #     pos_var = []
# #     flag = 0
# #     # for pos_num in range(len(pred_label)):
# #     #     if pred_label[pos_num]==y_true[0:] [pos_num]:
# #     #         if pred_label[pos_num] ==1:
# #     #             # print(pred_label[pos_num])
# #     #             # print(y_true[0:] [pos_num])
# #     #             # print(test_newindex[pos_num])
# #     #             pos.append(test_newindex[pos_num])
# #     #             if flag==0:
# #     #                 pos_feature=test_X[test_newindex[pos_num],:]
# #     #                 pos_var=np.var(test_X[test_newindex[pos_num],:])
# #     #                 flag=1
# #     #             elif flag==1:
# #     #                 pos_feature = np.vstack((pos_feature,test_X[test_newindex[pos_num],:]))
# #     #                 pos_var = np.vstack((pos_var,np.var(test_X[test_newindex[pos_num],:])))
# #     right_num = 0
# #     wrong_num = 0
# #     pos_ana = []
# #     flag_ana = 0
# #     for pos_num in range(len(pred_label)):
# #         if pred_label[pos_num] == 1:
# #             # print(pred_label[pos_num])
# #             # print(y_true[0:] [pos_num])
# #             # print(test_newindex[pos_num])
# #             pos.append(test_newindex[pos_num])
# #             if flag == 0:
# #                 pos_feature = test_X[test_newindex[pos_num], :]
# #                 pos_var = test_X[test_newindex[pos_num], -1]
# #                 flag = 1
# #             elif flag == 1:
# #                 pos_feature = np.vstack((pos_feature, test_X[test_newindex[pos_num], :]))
# #                 pos_var = np.vstack((pos_var, test_X[test_newindex[pos_num], -1]))
# #
# #         if pred_label[pos_num] == 1:
# #             if pred_label[pos_num] == y_true[0:][pos_num]:
# #                 right_num=right_num+1
# #                 # 抓预测正确的url
# #                 if flag_ana == 0:
# #                     pos_ana = test_X[test_newindex[pos_num], -1]
# #                     flag_ana = 1
# #                 elif flag_ana == 1:
# #                     pos_ana = np.vstack((pos_ana, test_X[test_newindex[pos_num], -1]))
# #             else:
# #                 wrong_num=wrong_num+1
# #
# #     # print(right_num,wrong_num)
# #
# #     pos_var = pos_var.tolist()
# #     pos_var_float=[]
# #     pos_var_all=[]
# #     pos_var_ana=[]
# #     #pos的
# #     for i in range(len(pos_var)):
# #         pos_var_float.append(float(pos_var[i][0]))
# #     #test_var:全部的
# #     for i in range(len(test_var)):
# #         pos_var_all.append(float(test_var[i]))
# #
#     for num in pos_var_float:
#         if num in pos_var_all:
#             idx=pos_var_all.index(num)
#             # print(test_url[idx])
#             url_all.append(test_url[idx])
#         elif num not in pos_var_all:
#             print("no")
#             # print(test_newindex[pos_num])
#             # print(test_newindex[pos_num])
#
#         # pos_ana预测为1正确的
#     url_ana = []
#     for i in range(len(pos_ana)):
#         pos_var_ana.append(float(pos_ana[i][0]))
#     for num in pos_ana:
#         if num in pos_var_all:
#             idx = pos_var_all.index(num)
#             # print(test_url[idx])
#             url_ana.append(test_url[idx])
