package funcblock;

import com.github.javaparser.ast.Node;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteToSomeWhere {
    public static void WriteToFile(Node node, String storeFilePath, int label,String name) {
        try {
            String savepath = storeFilePath + "//" + name + ".txt";
            if (!new File(storeFilePath).exists()) {
                new File(storeFilePath).mkdirs();
            }

            if (!new File(savepath).exists()) {
                new File(savepath).createNewFile();
            }

            FileWriter fw = new FileWriter(new File(savepath));//append:true表示追加.
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(node.toString() + "\n");
            bw.write(label + "");
            bw.write("\n------------------------------------");
            bw.flush();
            bw.close();

        } catch (Exception e) {
            System.out.println("Error in WriteToFile eventually.");
            e.printStackTrace();
        }
    }
}

