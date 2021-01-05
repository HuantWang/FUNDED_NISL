import pandas as pd
from sklearn import metrics
from nonconformist.base import ClassifierAdapter
from nonconformist.icp import IcpClassifier
from nonconformist.nc import ClassifierNc
from sklearn.model_selection import train_test_split
import warnings
import numpy as np
from sklearn.neighbors import KNeighborsClassifier
from sklearn.tree import DecisionTreeClassifier
warnings.filterwarnings("ignore")
from sklearn.ensemble import RandomForestClassifier, VotingClassifier, GradientBoostingClassifier, AdaBoostClassifier, \
    BaggingClassifier
from sklearn.linear_model import LogisticRegression
from sklearn.svm import SVC
from sklearn.metrics import accuracy_score, precision_score, recall_score, confusion_matrix, classification_report, \
    f1_score, precision_recall_curve
import InputData_New

# set threshold value of p-value
p_set = 0.3

# set data path
posstr=r'samples\pos'
negstr=r'samples\neg'

# extract feature
feature=InputData_New.InputData(negstr,posstr,"w2v_model")
print("data ready")

# you could get any feature as your input to the classifier, such as log, code and others
feature_log=feature[0]
labela_log=feature[2]
feature_log, feature_log_test, labela_log, labela_log_test = train_test_split(feature_log,
                                                    labela_log,
                                                        test_size=0.1,
                                                        random_state=None)
train_X, train_y = feature_log, np.array(labela_log)
train_y= train_y.reshape(np.size(train_y), 1)
for i, y_ in enumerate(np.unique(train_y)):
    train_y[train_y == y_] = i
n_instances = train_y.size
idx = np.random.permutation(n_instances)

# split the dataset to train, valid, test set
trainX_idx = idx[:int(n_instances / 2)]
trainy_idx = idx[:int(n_instances / 2)]
traincalX_idx = idx[int(n_instances / 2):]
traincaly_idx = idx[int(n_instances / 2):]
test_X,test_y=feature_log_test,np.array(labela_log_test)
test_y=test_y.reshape(np.size(test_y), 1)

for i, y_ in enumerate(np.unique(test_y)):
    test_y[test_y == y_] = i

n_instances = test_y.size
idx = np.random.permutation(n_instances)
testX1_idx = idx[:]
testy1_idx = idx[:]

# single classifier, easily supplement
log_clf = LogisticRegression(solver="liblinear")
rnd_clf = RandomForestClassifier()
svm_clf = SVC(gamma="auto", probability=True)
gbc_clf = GradientBoostingClassifier()
knn_clf = KNeighborsClassifier()
ada_clf = AdaBoostClassifier()

# soft ensemble classifier
voting_clf = VotingClassifier(
    estimators=[
        ('lr', log_clf),
        ('rf', rnd_clf),
        ('gbc', gbc_clf),
        ('svm',svm_clf),
        ('knn',knn_clf),
        ('ada',ada_clf)],
    voting='soft')
classifier=[voting_clf]
classifier_name=["voting_clf"]
clf=classifier[0]

# Evaluation of soft voting classifier
probas_ = clf.fit(train_X[trainX_idx, :], train_y[trainy_idx,0]).predict_proba(test_X[testX1_idx, :])
precision, recall, thresholds = precision_recall_curve(test_y[testy1_idx], probas_[:, 1])
fpr, tpr, thresholds = metrics.roc_curve(test_y[testy1_idx], probas_[:, 1], pos_label=1)

# nonconformist classifier
nc = ClassifierNc(ClassifierAdapter(clf))
icp = IcpClassifier(nc)
icp.fit(train_X[trainX_idx, :], train_y[trainy_idx, 0])
icp.calibrate(train_X[traincalX_idx, :], train_y[traincalX_idx])
p = pd.DataFrame(icp.predict_conf(test_X[testX1_idx, :]))
p_sort = np.squeeze(np.sort(p.values[:, 2]))
p_sort = p_sort.reshape(1, p_sort.size)


value = int(p_sort.size * p_set)
p_value = p_sort[0, value]

i = 0
delete_p = []
delete_old = []
alldeletenum = 0
rightdeletenum = 0

# without nonconformist
print("without nonconformist:")
pred_label = clf.predict(test_X[testy1_idx, :])
print(confusion_matrix(test_y[testy1_idx].ravel(), pred_label))
print(classification_report(test_y[testy1_idx].ravel(), pred_label))

# p-value work
for i in range(len(p.values[:, 0])):
    if p.values[i, 2] < p_value:
        alldeletenum += 1
        if (p.values[i, 0] == test_y[testX1_idx[i]]):
            rightdeletenum += 1
        delete_old.append(i)  # 淘汰的在testX1中的位置
        delete_p.append(testX1_idx[i])  # 淘汰的在testy总中的位置
delete_p.sort(reverse=True)
delete_old.sort(reverse=True)

# Evaluation of nonconcormist model
test_newindex = []
for i in range(testX1_idx.size):
    if i in delete_old:
        continue
    else:
        test_newindex.append(testX1_idx[i])

print("nonconformist:")
pred_label = clf.predict(test_X[test_newindex, :])
print(confusion_matrix(test_y[test_newindex].ravel(), pred_label))
print(classification_report(test_y[test_newindex].ravel(), pred_label))
