package java_e.examples; /***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import java_e.Grammar.JavaLexer;
import java_e.Grammar.JavaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestJava {
    public static void main(String[] args) throws IOException {
        // oldfiles 和 new changelines
//        String sourceFilePath = "src/swift3/examples/CodeSamples";
//        String changelines = "src/swift3/examples/changeline.txt";
//        String out = "src/swift3/examples\\test";
        String[] strings = {"74", "77", "78", "79", "89", "90", "91", "190", "191", "369", "400", "404", "573"};
        for (String s : strings) {
            String cwe = "CWE-" + s;

            String base = "D:\\CWE-JAVA\\java_source\\";
            String sourceFilePath = base + cwe + "\\" + cwe;
            String out = base + cwe + "\\out";


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
                                String fileName = f.getName().split(".txt")[0];

                                FileReader f1 = new FileReader(f);
                                BufferedReader bre = new BufferedReader(f1);
                                String str = "";
                                String temp = "";
                                while ((str = bre.readLine()) != null) {
//                                str = str.replaceAll("//[0-9a-zA-Z\\w\\s]+", "");
                                    temp += str + "\n";
                                }
//                                System.out.println(new BufferedReader(new FileReader(f)).readLine());

                                String fName = f.toString().split("\\\\")
                                        [f.toString().split("\\\\").length - 1]
                                        .replaceAll(".txt", "");

                                // enter listener
                                ANTLRInputStream input = new ANTLRInputStream(temp);

                                JavaLexer lexer = new JavaLexer(input);
                                CommonTokenStream tokens = new CommonTokenStream(lexer);
                                JavaParser parser = new JavaParser(tokens);
                                ParseTree tree = parser.compilationUnit();
                                JavaListener extractor = new JavaListener(parser, fName, out);
                                ParseTreeWalker.DEFAULT.walk(extractor, tree);

                            } catch (Exception e) {
//                            e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
