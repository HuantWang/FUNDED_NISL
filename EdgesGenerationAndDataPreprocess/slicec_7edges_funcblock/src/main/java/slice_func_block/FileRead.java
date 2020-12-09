package slice_func_block;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileRead {
    /**
     * changeline中保存了形如:2e7fce1189c13b732bf7cf10021c1b5cfd15f1ba 100 787 1669 1671的文件
     * 前面是文件名,后面是修改的行号
     */
    private String changeline;


    /**
     * @param changeline changeline.txt中保存了形如:2e7fce1189c13b732bf7cf10021c1b5cfd15f1ba 100 787 1669 1671的文件
     *        前面是文件名,后面是修改的行号
     * @return Map<String, List < String>> map,key存文件名,键是行号(全放到一个List里了)
     */
    public Map<String, List<String>> readFile(String changeline) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> arrayList = new ArrayList<String>();
        try {
            FileInputStream fis = new FileInputStream(changeline);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] s1 = line.split(" ");
                if (s1.length > 1) {
                    int fileName = 0, delNum = 1;
                    for (; delNum < s1.length; delNum++) {
                        arrayList.add(s1[delNum]);
                    }
                    map.put(s1[fileName], arrayList);
                    arrayList = new ArrayList<String>();
                }
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

//    public static void main(String[] args) {
//        String changeLine = "F:/slice/src/main/resources/txt/changeline.txt";
//        Map<String, List<String>> map = new FileRead().readFile(changeLine);
//        Set set = map.keySet();
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
}
