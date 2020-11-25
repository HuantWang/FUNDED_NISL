package yoshikihigo.tinypdg;

import yoshikihigo.tinypdg.writer.DigitalWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //deal with datas from sard
//        String[] strings = {"74", "77", "78", "79", "89", "90", "91", "190", "191", "369", "400", "404", "573", "601", "665",
//                "668", "704"};
//        for (String s : strings) {
//            String type1 = "CWE-" + s;
//            String FilePath = "D:\\CWE-JAVA\\OUT\\" + type1 + "/" + type1;
//            String storeFilePath = "D:\\CWE-JAVA\\final/" + type1;
        int batchsize = 1;
        int batchnum_lastrun = 0;

        //for test.
        String[] strings = {"001"};
        for (String s : strings) {
            String cwe = "CWE-" + s;
            String base = "case\\";
            String FilePath = base + cwe;
            String storeFilePath = base + "\\out";

            try {
                DigitalWriter.sard(FilePath, storeFilePath, batchsize, batchnum_lastrun);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

