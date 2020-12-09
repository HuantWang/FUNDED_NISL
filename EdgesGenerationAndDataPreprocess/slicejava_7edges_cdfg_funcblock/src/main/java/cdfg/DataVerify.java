package cdfg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DataVerify {
    static Set<String> nullFileSet = new HashSet<>();
    private static Set<String> verify(String sourcePath) throws Exception {
        File file = new File(sourcePath);
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                verify(f.getAbsolutePath()); // 如果是文件夹,递归(注意要绝对路径);直到f.isFile()为true为止
            }

            // 这里修改文件类型后缀
            if (f.isFile() && f.toString().endsWith(".txt")) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("null")) {
                        nullFileSet.add(f.toString());
                    }
                }
            }
        }
       return nullFileSet;
    }

    public static void main(String[] args) {
        String sourcePath = "F:\\data\\raw_file\\output";
        try {
            Set<String> nullDataSet = DataVerify.verify(sourcePath);
            System.out.println("containing null data as follows:");
            for(String s : nullDataSet){
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
