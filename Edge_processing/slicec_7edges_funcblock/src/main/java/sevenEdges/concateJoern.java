package sevenEdges;

import java.io.*;

public class concateJoern {

    static void concate(String Edge, String Joern) {
        File fileEdge = new File(Edge);
        File[] fsEdge = fileEdge.listFiles();

        File fileJoern = new File(Joern);
        File[] fsJoern = fileJoern.listFiles();

        if (fsEdge != null && fsJoern != null) {
            for (File fE : fsEdge) {
                //Delete inconsistent files
                boolean isSingle = true;
                String varE = fE.toString().split("\\\\")[fE.toString()
                        .split("\\\\").length - 1]
                        .split("\\.c")[0];
                for (File fJ : fsJoern) {
                    String varJ = fJ.toString().split("\\\\")[fJ.toString()
                            .split("\\\\").length - 1]
                            .split("\\.c")[0];
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
                            bwEdg.write("-----joern-----\n");
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
                }
            }
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("please input parameters");
            return;
        }
        
        //Seven Edges Path
        String pathEge = args[0];
        //joern Result Path
        String pathJoern = args[1];
        //Note:
        //2SevenEdges put the result of concat =>4concat
        concate(pathEge, pathJoern);
    }
}
