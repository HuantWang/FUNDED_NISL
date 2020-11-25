package concateEgeAndJoern;

import java.io.*;

public class concateJoern {

    static void concate(String Edge, String Joern) {
        File fileEdge = new File(Edge);
        File[] fsEdge = fileEdge.listFiles();

        File fileJoern = new File(Joern);
        File[] fsJoern = fileJoern.listFiles();

        if (fsEdge != null && fsJoern != null) {
            for (File fE : fsEdge) {
                //joern和edge中文件个数不同，是single的删掉。
                boolean isSingle = true;
                // c
//                String varE = fE.toString().split("\\\\")[fE.toString()
//                        .split("\\\\").length - 1]
//                        .split("\\.c")[0];
//                for (File fJ : fsJoern) {
//                    String varJ = fJ.toString().split("\\\\")[fJ.toString()
//                            .split("\\\\").length - 1]
//                            .split("\\.c")[0];
                // java
                String varE = fE.toString().split("\\\\")[fE.toString()
                            .split("\\\\").length - 1].split("\\.txt")[0];
//                System.out.println(varE);

                for (File fJ : fsJoern) {
                    String varJ = fJ.toString().split("\\\\")[fJ.toString()
                            .split("\\\\").length - 1].split("\\.txt")[0];
//                    System.out.println(varJ);
                    if (varE.equals(varJ)) {
                        isSingle = false;
                        try {
                            //reader of Joern.
                            FileInputStream fis = new FileInputStream(fJ);
                            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                            BufferedReader br = new BufferedReader(isr);

                            //writer of edgs.
                            FileWriter fwEdg = new FileWriter(fE, true);
                            BufferedWriter bwEdg = new BufferedWriter(fwEdg);
                            String line;
//                            bwEdg.write("-----joern-----\n");
                            while ((line = br.readLine()) != null) {
                                if (line.contains("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")) {
                                    bwEdg.write(line + "\n");
                                    break;
                                }
                                bwEdg.write(line + "\n");
                            }
                            bwEdg.flush();
                            bwEdg.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    }
                }
                if (isSingle) {
                    fE.delete();
//                    System.out.println(fE.toString().split("\\\\")[fE.toString()
//                            .split("\\\\").length - 1]);
                }
            }
        }
    }

    public static void main(String[] args) {

        // ast数据路径, joern加到ast后面
        String[] strings = {"74", "77", "78", "79", "89", "90", "91", "190", "191", "369", "400", "404", "573","601"};
        for (String s : strings) {
            String cwe = "CWE-" + s;
            String base = "D:\\CWE-JAVA\\java_source\\";
            String pathEge = base + cwe + "\\" + "out";
            // joern数据路径
            String pathJoern = base + cwe + "\\" + "joern";
            concate(pathEge, pathJoern);
        }
    }
}