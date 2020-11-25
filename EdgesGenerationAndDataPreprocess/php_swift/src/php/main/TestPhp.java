package php.main; /***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import php.gen.PhpLexer;
import php.gen.PhpParser;

import java.io.*;
import java.util.ArrayList;
import java.util.UUID;

public class TestPhp {
    public static String filterHtml(String s) {
        return s.replaceAll("<!DOCTYPE html>", "")
                .replaceAll("<html>", "").replaceAll("</html>", "")
                .replaceAll("<html/>", "").replaceAll("<head>", "")
                .replaceAll("</head>", "").replaceAll("<head/>", "")
                .replaceAll("<body>", "").replaceAll("</body>", "")
                .replaceAll("<body/>", "").replaceAll("<script>", "")
                .replaceAll("</script>", "").replaceAll("<script/>", "")
                .replaceAll("<h1>", "").replaceAll("</h1>", "")
                .replaceAll("<h1/>", "").replaceAll("<h2>", "")
                .replaceAll("</h2>", "").replaceAll("<h2/>", "")
                .replaceAll("Hello World!", "")
                .replaceAll("Hello World", "").replaceAll("<style>", "")
                .replaceAll("</style>", "").replaceAll("<style/>", "");
    }

    public static void main(String[] args) throws IOException {
        // 074 078 079 089 090 091 601
        String[] s = {"074", "078", "079", "089", "090", "091", "601"};
        for (String cwe : s) {

//            String sourceFilePath = "E:\\CCS_DATA\\php\\bad_deal\\CWE-" + cwe;
        String sourceFilePath = "E:\\CCS_DATA\\php\\good\\CWE-" + cwe;
//        String out = "E:\\CCS_DATA\\php\\out\\CWE-601\\bad";
//        String out = "E:\\CCS_DATA\\php\\out\\CWE-601\\good";
//        String sourceFilePath = "E:\\CCS_DATA\\php\\test";
            String out = "E:\\CCS_DATA\\php\\out\\CWE-" + cwe;
            String label = "0";
            if (!new File(out).exists()) {
                new File(out).mkdirs();
            }
            File file = new File(sourceFilePath);
            File[] fs = file.listFiles();
            //遍历得到count,方便查看处理速度
            if (fs != null) {
                int count = 0;
                for (File f : fs) {
                    count++;
                }

                //控制遍历过的文件.
                int lineCount = 0;
                int batchnumNow = 0;
                int batchsize = 1;
                int batchnumLastrun = 0;
                for (File f : fs) {
                    lineCount = lineCount + 1;
                    if (!(batchnumNow == ((lineCount - 1) / batchsize + 1))) {
                        batchnumNow = (lineCount / batchsize + 1);
                        double c = ((batchnumNow - 1) * batchsize / (count * 1.0)) * 100;
                        System.out.printf("%s%.2f%s%s%d\n", "已完成:", c, "%", "   Batch ", batchnumNow);
                    }
                    if (batchnumNow <= batchnumLastrun) {
                        continue;
                    } else {
                        if (!f.isDirectory()) {
                            try {
                                FileReader f1 = new FileReader(f);
                                BufferedReader bre = new BufferedReader(f1);
                                String str = "";
                                String temp = "";
                                while ((str = bre.readLine()) != null) {
                                    str = str.replaceAll("//[0-9a-zA-Z\\w\\s]+", "");
                                    temp += str;
                                }

                                temp = filterHtml(temp);
                                ANTLRInputStream input = new ANTLRInputStream(temp);

                                PhpLexer lexer = new PhpLexer(input);
                                CommonTokenStream tokens = new CommonTokenStream(lexer);
                                PhpParser parser = new PhpParser(tokens);
                                ParseTree tree = parser.phpBlock();
//                            System.out.println(tree.getText());
                                PhpListener extractor = new PhpListener(parser);
                                String name = UUID.randomUUID() + ".txt";
                                ParseTreeWalker.DEFAULT.walk(extractor, tree);
                                ArrayList<String> nodeMapping = extractor.nodeMapping;
                                ArrayList<String> contentMapping = extractor.contentMapping;
                                String nextToken = extractor.nextToken;
                                String attribute = extractor.attribute;
                                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                                        new File(out + "/" + name)));
                                bufferedWriter.write("-----label-----\n");
                                bufferedWriter.write(label + "\n");
//
//                            bufferedWriter.write("-----code-----\n");
//                            bufferedWriter.write(ctx.getText() + "\n");

                                bufferedWriter.write("-----children-----\n");
                                for (String child : nodeMapping) {
                                    bufferedWriter.write(child + "\n");
                                }


                                bufferedWriter.write("-----nextToken-----\n");
                                bufferedWriter.write(nextToken);
                                bufferedWriter.write("\n----------computeFrom----------\n");

                                bufferedWriter.write("----------attribute----------\n");
                                bufferedWriter.write(attribute + "\n");
                                bufferedWriter.write("----------ast_node----------\n");
                                for (int i = 0; i < contentMapping.size(); i++) {
                                    bufferedWriter.write(contentMapping.get(i) + "\n");
                                }


                                bufferedWriter.write("-----joern-----\n");
                                for (String nodemap : nodeMapping) {
                                    bufferedWriter.write(nodemap + "\n");
                                }
                                bufferedWriter.write("-----------------------------------\n");
                                for (int i = 0; i < contentMapping.size(); i++) {
                                    bufferedWriter.write("(" + i + "," + contentMapping.get(i) + ")\n");
                                }

                                bufferedWriter.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                                bufferedWriter.write(label + "\n");
//                            bufferedWriter.write(f.toString());
                                bufferedWriter.close();
                            } catch (IOException | RecognitionException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
