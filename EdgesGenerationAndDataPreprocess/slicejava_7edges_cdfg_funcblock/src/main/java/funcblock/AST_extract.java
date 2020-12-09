package funcblock;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.Comment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class AST_extract {
    /**
     * 说明：
     * 处理github上下载的java file以及changeline_new.txt
     * new file 和  new_changeline能对应上，函数块切片，标记0
     * old file 和 new_changeline 能对应，函数块切片，标记1
     * 代码行小于100的才处理，并且保证新旧函数块内容不相等，用equals判断。但不是百分百准确，因为可能一次commit只是对
     * 某个函数块加了注释。
     */
    public void AST_GitHub_ChangeLine(String oldFilePath, String newFilePath, String storeFilePath, Map<String, List<String>> map, int batchsize, int batchnum_lastrun) {


        // old file
        File file_old = new File(oldFilePath);
        File[] fs_old = file_old.listFiles();

        HashMap<String, String> map_old = new HashMap();
        for (File f : fs_old) {
            map_old.put(f.getName(), f.toString());
        }

        // 以newfilew为准
        File file_new = new File(newFilePath);
        File[] fs_new = file_new.listFiles();

        int count = 0;
        for (File f : fs_new) {
            count++;
        }

        int line_count = 0;
        int batchnum_now = 0;

        for (File f : fs_new) {
            line_count = line_count + 1;
            if (!(batchnum_now == ((line_count - 1) / batchsize + 1))) {
                batchnum_now = (line_count / batchsize + 1);
                double c = ((batchnum_now - 1) * batchsize / (count * 1.0)) * 100;
                System.out.printf("%s%.2f%s%s%d\n", "已完成:", c, "%", "   Batch ", batchnum_now);
            }
            if (batchnum_now <= batchnum_lastrun) {
                continue;
            } else {
                // 确保一致
                if (map_old.containsKey(f.getName())) {
                    try {
                        //new file的ast
                        CompilationUnit cu = JavaParser.parse(new File(f.toString()));
                        List<Comment> comments = cu.getAllContainedComments();
                        List<Comment> unwantedComments = comments
                                .stream()
                                .filter(p -> !p.getCommentedNode().isPresent() || p instanceof Comment)
                                .collect(Collectors.toList());
                        unwantedComments.forEach(Node::remove);

                        //old file的ast
                        CompilationUnit cu1 = JavaParser.parse(new File(map_old.get(f.getName())));
                        List<Comment> comments1 = cu1.getAllContainedComments();
                        List<Comment> unwantedComments1 = comments1
                                .stream()
                                .filter(p -> !p.getCommentedNode().isPresent() || p instanceof Comment)
                                .collect(Collectors.toList());
                        unwantedComments.forEach(Node::remove);

                        String fileName = f.getName().split(".txt")[0];

                        if (map.containsKey(fileName)) {//确保当前文件名和map中的一致
                            //arrayList中存放当前文件的修改行号
                            ArrayList<String> arrayList = (ArrayList<String>) map.get(fileName);

                            /**
                             * ---------- FunctionDeclaration -------------
                             */
                            //new部分
                            int c_new = 1;
                            int c_old = 1;
                            for (MethodDeclaration methodDeclaration : cu.findAll(MethodDeclaration.class)) {
                                //old 部分
                                for (MethodDeclaration methodDeclaration1 : cu1.findAll(MethodDeclaration.class)) {
                                    //body不相等，函数名相等时才处理
                                    if (!methodDeclaration.getBody().equals(methodDeclaration1.getBody())
                                            && methodDeclaration.getName().equals(methodDeclaration1.getName())) {
                                        //new
                                        int begin = methodDeclaration.getBegin().get().line;
                                        int end = methodDeclaration.getEnd().get().line;
                                        //old
                                        int begin1 = methodDeclaration1.getBegin().get().line;
                                        int end1 = methodDeclaration1.getEnd().get().line;
                                        if (end-begin <= 100 && end1-begin <= 100) {
                                            Iterator iterator = arrayList.iterator();
                                            while (iterator.hasNext()) {
                                                int temp = Integer.valueOf((String) (iterator.next()));
                                                if (temp >= begin && temp <= end && temp >= begin1 && temp <= end1) {
                                                    int label = 0;
                                                    int label1 = 1;
                                                    WriteToSomeWhere.WriteToFile(methodDeclaration, storeFilePath + "/new", label, fileName + "_new_func" + (c_new++));
                                                    WriteToSomeWhere.WriteToFile(methodDeclaration1, storeFilePath + "/old", label1, fileName + "_old_func" + (c_old++));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //对来自sard的good/bad数据切成函数块。
    public void AST_Sard_GoodBad(String sourceFilePath, String storeFilePath, int batchnum_lastrun, int batchsize) {
        //创建存储路径
        if (!new File(storeFilePath).exists()) {
            new File(storeFilePath).mkdirs();
        }

        File file = new File(sourceFilePath);
        File[] fs = file.listFiles();    //遍历path下的文件和目录，放在File数组中

        //遍历得到count,方便查看处理速度
        if (fs != null) {
            int count = 0;
            for (File f : fs) {
                count++;
            }

            //控制遍历过的文件.
            int line_count = 0;
            int batchnum_now = 0;

            for (File f : fs) {
                line_count = line_count + 1;
                if (!(batchnum_now == ((line_count - 1) / batchsize + 1))) {
                    batchnum_now = (line_count / batchsize + 1);
                    double c = ((batchnum_now - 1) * batchsize / (count * 1.0)) * 100;
                    System.out.printf("%s%.2f%s%s%d\n", "已完成:", c, "%", "   Batch ", batchnum_now);
                }
                if (batchnum_now <= batchnum_lastrun) {
                    continue;
                } else {
                    if (!f.isDirectory()) {
                        try {
                            //读入内容
                            CompilationUnit cu = JavaParser.parse(new File(f.toString()));
                            List<Comment> comments = cu.getAllContainedComments();
                            List<Comment> unwantedComments = comments
                                    .stream()
                                    .filter(p -> !p.getCommentedNode().isPresent() || p instanceof Comment)
                                    .collect(Collectors.toList());
                            unwantedComments.forEach(Node::remove);

                            for (MethodDeclaration methodDeclaration : cu.findAll(MethodDeclaration.class)) {

                                String funcName = methodDeclaration.getNameAsString().split("\n")[0].replaceAll("\r", "")
                                        .replaceAll("\n", "");
//                                System.out.println(funcName);
                                Pattern good = Pattern.compile(".*[Gg][Oo][Oo][Dd].*");
                                Pattern bad = Pattern.compile(".*[Bb][Aa][Dd].*");


                                if ((good.matcher(funcName).matches()) && (!bad.matcher(funcName).matches())) {
                                    String funContent = methodDeclaration.toString();
                                    //文件的存储路径.
                                    String savepath = storeFilePath + "\\" + "good" + "\\" + UUID.randomUUID() + ".txt";
                                    if (!new File(storeFilePath + "\\" + "good").exists()) {
                                        new File(storeFilePath + "\\" + "good").mkdirs();
                                    }
                                    if (!new File(savepath).exists()) { //文件不存在,new一个文件
                                        new File(savepath).createNewFile();
                                    }

                                    FileWriter fw = new FileWriter(new File(savepath));//append:true表示追加.
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(funContent);
                                    bw.write("\n" + 0 + "\n");
                                    bw.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");
                                    bw.flush();
                                }

                                if ((bad.matcher(funcName).matches()) && (!good.matcher(funcName).matches())) {
                                    String funContent = methodDeclaration.toString();
                                    //文件的存储路径.
                                    String savepath = storeFilePath + "\\" + "bad" + "\\" + UUID.randomUUID() + ".txt";

                                    if (!new File(storeFilePath + "\\" + "bad").exists()) {
                                        new File(storeFilePath + "\\" + "bad").mkdirs();
                                    }
                                    if (!new File(savepath).exists()) { //文件不存在,new一个文件
                                        new File(savepath).createNewFile();
                                    }

                                    FileWriter fw = new FileWriter(new File(savepath));//append:true表示追加.
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(funContent);
                                    bw.write("\n" + 1 + "\n");
                                    bw.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");
                                    bw.flush();

                                }
                            }
                        } catch (Exception e) {
//                            e.printStackTrace();
                            System.out.println(f.getName());
                            continue;
                        }
//                 finally {
//                    //
//
////                    System.out.println(f.getName());
//                    continue; //部分c文件格式有问题导致的错误, 跳过这个文件,继续执行for (File f : fs) { xxx }
//                }
                    }
                }
            }
        }
    }


}