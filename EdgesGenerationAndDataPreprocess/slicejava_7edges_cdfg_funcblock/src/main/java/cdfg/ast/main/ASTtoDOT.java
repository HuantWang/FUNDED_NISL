package cdfg.ast.main;

import cdfg.ast.structure.MyMethodNode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ASTtoDOT {

    public static Map<String, Integer> ASTtoDotParser(MyMethodNode m, BufferedWriter writer, int label) throws IOException {

//        writer.write(m.methodNode.toString());
//        writer.write(label + "\n");
//        writer.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");

        //mapping中存放了节点关系.
        ArrayList<String[]> arrayList = (ArrayList<String[]>) m.mapping;

        //存放每个节点，设置唯一编号，以便构建节点关系。
        Map<String, Integer> mapId = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).length; j++) {
                if (!mapId.containsKey(arrayList.get(i)[j])) {
                    mapId.put(arrayList.get(i)[j].replace("\"", "\\\"")
                            .replace("\\\\\"", "\\\\\\\""), count++);
                }

            }
        }

        String str = "";
        //和mapping中对应起来.
        for (String[] k : m.mapping) {
            int pHashcodenum = 0;
            int hashcodenum = 0;
            //下面一句可以不要,因为k[0],k[1]一定是在mapId里的.加上判断一下也无妨
            if (mapId.containsKey(k[0].replace("\"", "\\\"")
                    .replace("\\\\\"", "\\\\\\\""))
                    &&
                    mapId.containsKey(k[1].replace("\"", "\\\"")
                            .replace("\\\\\"", "\\\\\\\""))) {

                pHashcodenum = mapId.get(k[0].replace("\"", "\\\"")
                        .replace("\\\\\"", "\\\\\\\""));
                hashcodenum = mapId.get(k[1].replace("\"", "\\\"")
                        .replace("\\\\\"", "\\\\\\\""));

//                str += ("\"" + pHashcodenum + "\" -> \"" + hashcodenum + "\"\n");
                str += pHashcodenum + "," + hashcodenum + "," + "0\n"; //表示ast关系。
            }
            else {
                System.out.println("mapId 中不包含某些节点!");
                break;
            }
        }
        writer.write(str);
        writer.flush();
        return mapId;
    }

    public static Map<String, Integer> AST(MyMethodNode m, BufferedWriter writer) throws IOException {

//        writer.write(m.methodNode.toString());
//        writer.write(label + "\n");
//        writer.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");

        //mapping中存放了节点关系.
        ArrayList<String[]> arrayList = (ArrayList<String[]>) m.mapping;

        //存放每个节点，设置唯一编号，以便构建节点关系。
        Map<String, Integer> mapId = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).length; j++) {
                if (!mapId.containsKey(arrayList.get(i)[j])) {
                    mapId.put(arrayList.get(i)[j].replace("\"", "\\\"")
                            .replace("\\\\\"", "\\\\\\\""), count++);
                }

            }
        }

        String str = "";
        //和mapping中对应起来.
        for (String[] k : m.mapping) {
            int pHashcodenum = 0;
            int hashcodenum = 0;
            //下面一句可以不要,因为k[0],k[1]一定是在mapId里的.加上判断一下也无妨
            if (mapId.containsKey(k[0].replace("\"", "\\\"")
                    .replace("\\\\\"", "\\\\\\\""))
                    &&
                    mapId.containsKey(k[1].replace("\"", "\\\"")
                            .replace("\\\\\"", "\\\\\\\""))) {

                pHashcodenum = mapId.get(k[0].replace("\"", "\\\"")
                        .replace("\\\\\"", "\\\\\\\""));
                hashcodenum = mapId.get(k[1].replace("\"", "\\\"")
                        .replace("\\\\\"", "\\\\\\\""));

//                str += ("\"" + pHashcodenum + "\" -> \"" + hashcodenum + "\"\n");
                str += pHashcodenum + "," + hashcodenum + "\n"; //表示ast关系。
            }
            else {
                System.out.println("mapId 中不包含某些节点!");
                break;
            }
        }
        writer.write(str);
        writer.flush();
        return mapId;
    }
}
