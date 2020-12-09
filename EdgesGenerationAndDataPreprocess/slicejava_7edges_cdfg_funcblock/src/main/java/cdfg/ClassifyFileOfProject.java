package cdfg;

import java.io.*;
import java.util.UUID;

/**
 * 将一个project中的文件分类,比如全部的c语言文件,被放到该项目下一个新建的文件夹里(基本不会和项目中已有的重名).
 *
 * @author xiaoH  2019/11/4  20:40
 */
public class ClassifyFileOfProject {

    private static void del(String type,String sourcePath, String storePath) throws Exception {
        File file = new File(sourcePath);
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                del(type,f.getAbsolutePath(), storePath); // 如果是文件夹,递归(注意要绝对路径);直到f.isFile()为true为止
            }

            // 这里修改文件类型后缀c
            if (f.isFile() && f.toString().endsWith(type)) {
                String store = storePath + "\\" + UUID.randomUUID() + "." + type;

                if (!new File(storePath).exists()) {
                    new File(storePath).mkdirs();
                }
                if (!new File(store).exists()) {
                    new File(store).createNewFile();
                }

                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(new File(store));//append:true表示追加.
                BufferedWriter bw = new BufferedWriter(fw);

                String in;
                while ((in = br.readLine()) != null) {
                    bw.write(in + "\n");
                    bw.flush();
                }
            }
        }
    }



    public static void main(String[] args) {
        String sourcePath = "C:\\Users\\86153\\Desktop\\蚂蚁用的三类Java数据集_效果测试的三种数据集\\access_control\\testcases";
        String storePath = "C:\\Users\\86153\\Desktop\\蚂蚁用的三类Java数据集_效果测试的三种数据集\\access_control" + "\\" + "access";
        try {
            String  type = "java";
            ClassifyFileOfProject.del(type,sourcePath, storePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
