package sevenEdges;

import java.io.*;
import java.util.UUID;

/**
 * 将一个project中的文件分类,比如全部的c语言文件,被放到该项目下一个新建的文件夹里(基本不会和项目中已有的重名).
 *
 * @author xiaoH  2019/11/4  20:40
 */
public class ClassifyFileOfProject {

    private static void del(String sourcePath, String storePath) throws Exception {
        File file = new File(sourcePath);
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                del(f.getAbsolutePath(), storePath); // 如果是文件夹,递归(注意要绝对路径);直到f.isFile()为true为止
            }

            // 这里修改文件类型后缀
            if (f.isFile() && f.toString().endsWith(".java")) {
                String store = storePath + "\\" + UUID.randomUUID() + ".txt";

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
        String[] strings = {"74","77","78","79","89","90","91","190","191","369","400","404","573","601","665",
                            "668","704"};
        for (String s : strings) {
            String type1 = "CWE-" + s;

            String sourcePath = "D:\\CWE-JAVA\\CWE/" + type1 + "/testcases";
            String storePath = "D:\\CWE-JAVA\\OUT/" + type1 + "/" + type1;
            try {
                ClassifyFileOfProject.del(sourcePath, storePath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
