import os

"""
过滤节点数大于attribute总数的部分
"""
def filterNodeNumbers(source,out):
    if not os.path.exists(out):
        os.makedirs(out)
    for root, dirs, files in os.walk(source):  # os.walk()返回一个三元组,
        # np.random.shuffle(files)
        filenum = len(files)
        count = 0
        save = 0
        for fname in files:
            name = fname.split(".txt")[0]
            # ast边信息
            all = []

            # 针对每个文件的初始化
            label_label = False
            label_code = False
            label_child = False  # child
            label_next = False  # next_token\
            label_from = False  # compute_form
            label_by = False  # garde_by
            label_negation = False  # garde_negation
            label_use = False  # Lexical_use
            label_jump = False  # jump
            label_att = False  # node_attribute
            label_astNode = False  # ast_node
            label_joern = False  # cdfg
            label_joern_word = False  # joern_word
            nodeNum = 0

            with open(root + "/" +fname, "r") as f:
                data = f.readlines()
                for line in data:
                    if (line.strip().find("-----ast_node-----") >= 0):  # 跳出文件处理
                        break
                    if (line.find("-----attribute-----") >= 0):
                        label_att = True
                        continue
                    if (label_att):
                        if line.find("-----ast_node-----") >= 0:
                            label_att = False
                        else:
                            num = line.split(';')
                            for x in num:
                                if (x == "" or x == '\n'):
                                    num.remove(x)
                            nodeNum = len(num)
                            continue


                f.seek(0)
                data = f.readlines()
                for line in data:
                    if (line.strip().find("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^") >= 0):  # 跳出文件处理
                        all.append("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
                        break
                    if (line.find("-----label-----") >= 0):
                        label_label = True
                        all.append(line)
                        continue
                    if (label_label):
                        all.append(line)
                        label_label = False
                        continue
                    if (line.find("-----code-----") >= 0):
                        label_code = True
                        all.append(line)
                        continue
                    if (label_code):
                        all.append(line)
                        label_code = False
                        continue

                    if (line.find("-----children-----") >= 0):
                        label_child = True
                        all.append(line)
                        continue
                    if (label_child):
                        if line.find("-----nextToken-----") >= 0:
                            label_child = False
                        else:
                            all.append(line)
                            for item in line.strip().split(","):
                                if int(item) > nodeNum:
                                    all.remove(line)
                            continue

                    if (line.find("-----nextToken-----") >= 0):
                        label_next = True
                        all.append(line)
                        continue
                    if (label_next):
                        if line.find("-----computeFrom-----") >= 0:
                            label_next = False
                        else:
                            all.append(line)
                            rem = False
                            for item in line.strip().split(","):
                                if int(item) > nodeNum:
                                    rem = True
                                    break
                            if rem:
                                all.remove(line)
                            continue

                    if (line.find("-----computeFrom-----") >= 0):
                        label_from = True
                        all.append(line)
                        continue
                    if (label_from):
                        if line.find("-----guardedBy-----") >= 0:
                            label_from = False
                        else:
                            all.append(line)
                            for item in line.strip().split(","):
                                if int(item) > nodeNum:
                                    all.remove(line)
                            continue

                    if (line.find("-----guardedBy-----") >= 0):
                        label_by = True
                        all.append(line)
                        continue
                    if (label_by):
                        if line.find("-----guardedByNegation-----") >= 0:
                            label_by = False
                        else:
                            all.append(line)
                            for item in line.strip().split(","):
                                if int(item) > nodeNum:
                                    all.remove(line)
                            continue

                    if (line.find("-----guardedByNegation-----") >= 0):
                        label_negation = True
                        all.append(line)
                        continue
                    if (label_negation):
                        if line.find("-----lastLexicalUse-----") >= 0:
                            label_negation = False
                        else:
                            all.append(line)
                            for item in line.strip().split(","):
                                if int(item) > nodeNum:
                                    all.remove(line)
                            continue

                    if (line.find("-----lastLexicalUse-----") >= 0):
                        label_use = True
                        all.append(line)
                        continue
                    if (label_use):
                        if line.find("-----jump-----") >= 0:
                            label_use = False
                        else:
                            all.append(line)
                            for item in line.strip().split(","):
                                if int(item) > nodeNum:
                                    all.remove(line)
                            continue
                    if (line.find("-----jump-----") >= 0):
                        label_jump = True
                        all.append(line)
                        continue
                    if (label_jump):
                        if line.find("-----attribute-----") >= 0:
                            label_jump = False
                        else:
                            all.append(line)
                            for item in line.strip().split(","):
                                if int(item) > nodeNum:
                                    all.remove(line)
                            continue

                    if (line.find("-----attribute-----") >= 0):
                        label_att = True
                        all.append(line)
                        continue
                    if (label_att):
                        if line.find("-----ast_node-----") >= 0:
                            label_att = False
                        else:
                            all.append(line)
                            continue
                    if (line.find("-----ast_node-----") >= 0):
                        label_astNode = True
                        all.append(line)
                        continue
                    if (label_astNode):
                        if line.find("-----joern-----") >= 0 >= 0:
                            label_astNode = False
                        else:
                            all.append(line)
                            continue

                    if (line.find("-----joern-----") >= 0):
                        label_joern = True
                        all.append(line)
                        continue
                    if (label_joern):
                        if line.find("-----------------------------------") >= 0:
                            label_joern = False
                        else:
                            all.append(line)
                            rem = False
                            for item in line.strip().split("(")[1].split(")")[0].split(","):
                                if int(item) > nodeNum:
                                    rem = True
                                    break
                            if rem:
                                all.remove(line)
                            continue
                    if line.find("-----------------------------------") >= 0:
                        label_joern_word = True
                        all.append(line)
                        continue
                    if (label_joern_word):
                        all.append(line)
                        # print(int(line.strip().split(",")[0].split("(")[1]))
                        if int(line.strip().split(",")[0].split("(")[1]) > nodeNum:
                            all.remove(line)


            f = open(out + name + ".txt" ,"w")
            for i in range(len(all)):
                # print(all[i])
                f.write(all[i])
if __name__ == '__main__':
    source = r"D:\jjj\ast_out\CWE-20"  # directory of source
    out = "D:/jjj/ast_out/out/CWE-20/" # directory of result
    filterNodeNumbers(source,out)

