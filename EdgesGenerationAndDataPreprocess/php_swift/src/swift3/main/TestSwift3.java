package swift3.main; /***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import swift3.gen.Swift3Lexer;
import swift3.gen.Swift3Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class TestSwift3 {
    public static void main(String[] args) throws IOException {

        // oldfiles 和 new changelines
//        String sourceFilePath = "src/swift3/examples/CodeSamples";
//        String changelines = "src/swift3/examples/changeline.txt";
//        String out = "src/swift3/examples\\test";
        String basePath = "E:\\CCS_DATA\\swift\\resource\\resource";
        String sourceFilePath = basePath + "\\old_files";
        String changelines = basePath + "\\resource-new.txt";
        String out = basePath + "\\out";
        Map map = new FileRead().readFile(changelines);

        if (!new File(out).exists()) {
            new File(out).mkdirs();
        }
        File file = new File(sourceFilePath);
        File[] files = file.listFiles();
        for (File f : files) {

            try {

                String fileName = f.getName().split(".txt")[0];

                if (map.containsKey(fileName)) {

                    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss ");
                    LocalDateTime dateTime = LocalDateTime.now(); // get the current date and time
                    System.out.println(dateTime.format(formatter));
                    System.out.println(f);
                    // map
                    ArrayList<String> arrayList = (ArrayList<String>) map.get(fileName);
//
                    // enter listener
                    Swift3Lexer lexer = new Swift3Lexer(CharStreams.fromFileName(String.valueOf(f)));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);

                    Swift3Parser parser = new Swift3Parser(tokens);
                    ParseTree tree = parser.top_level();
                    MyListener extractor = new MyListener(parser, arrayList, out);
                    ParseTreeWalker.DEFAULT.walk(extractor, tree);
                    f.delete();
                    //通知JVM进行gc
//                                runtime.gc();
//                                System.gc();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("wrong.");
//                            e.printStackTrace();
            }
        }
    }
}
