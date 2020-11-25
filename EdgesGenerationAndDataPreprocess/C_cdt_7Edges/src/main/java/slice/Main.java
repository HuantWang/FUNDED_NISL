package slice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String path = "docs/122";
        File file = new File(path);
        File[] fs = file.listFiles();
        if (fs != null) {
            for (File f : fs) {
                try {
                    FileInputStream fis = new FileInputStream(f);
                    InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                    BufferedReader br = new BufferedReader(isr);
                    String line;

                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
