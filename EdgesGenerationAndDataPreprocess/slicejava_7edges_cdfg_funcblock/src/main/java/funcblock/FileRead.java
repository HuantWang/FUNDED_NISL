package funcblock;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiao_
 * @data 2019/11/15 21:52
 * @description read conponents in changeline.txt to Map<String fileName,List<String lineCounter>>.
 */
public class FileRead {

    /**
     * @param changeLine ?
     * @return Map<String, List < String>> map
     */
    public Map<String, List<String>> readFile(String changeLine) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> arrayList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(changeLine);
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
                    arrayList = new ArrayList<>();
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
//        String changeLine = "F:\\python\\hh\\downloadSourceCode\\Bufferoverflow\\code\\2018/changeline.txt";
//        Map<String, List<String>> map = new FileRead().readFile(changeLine);
//        Collection arrayList = map.values();
//        System.out.println(arrayList.size());
//        Iterator iterator = arrayList.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }

}
