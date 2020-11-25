package java_e.examples;

import java_e.Grammar.JavaParser;
import java_e.Grammar.JavaParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Pattern;

public class JavaListener extends JavaParserBaseListener {

    private int nodeNumbers;
    private int nextNumbers;
    int label = 0;
    String code = "";
    public ArrayList<String> children = new ArrayList<>();
    String nextToken = "";
    String attribute = "";
    public ArrayList<String> ast_node = new ArrayList<>();
    public String out;
    public String fName;
    boolean isMethod;

    Pattern good = Pattern.compile(".*[Gg][Oo][Oo][Dd].*");
    Pattern bad = Pattern.compile(".*[Bb][Aa][Dd].*");


    public JavaListener(JavaParser parser, String fName, String out) {
        this.fName = fName;
        this.out = out;
        this.isMethod = false;
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        //每次进入都初始化所有变量
        nodeNumbers = -1;
        nextNumbers = -1;
        label = 0;
        children = new ArrayList<>();
        attribute = "";
        ast_node = new ArrayList<>();
        isMethod = true;
        nextToken = "";
//        System.out.println("enter------------------------------------------");
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {

        String funcName = ctx.getText().split("\n")[0].split("\\(")[0]
                .replaceAll(ctx.typeTypeOrVoid().getText(), "");
        String name = fName + "$" + funcName + ".txt";
//        System.out.println(name);


        if ((bad.matcher(funcName).matches()) && (!good.matcher(funcName).matches())) {
            // 每次退出时把数据写入文件。
            try {
//                if (!new File(out + "/bad").exists()) {
//                    new File(out + "/bad").mkdirs();
//                }
                label = 1;
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                        new File(out + "/" + name)));
                bufferedWriter.write("-----label-----\n");
                bufferedWriter.write(label + "\n");

                bufferedWriter.write("-----code-----\n");
                bufferedWriter.write(ctx.getText() + "\n");

                bufferedWriter.write("-----children-----\n");
                for (String child : children) {
                    bufferedWriter.write(child + "\n");
                }


                bufferedWriter.write("-----nextToken-----\n");
                bufferedWriter.write(nextToken);
                bufferedWriter.write("\n----------computeFrom----------\n");

                bufferedWriter.write("----------attribute----------\n");
                bufferedWriter.write(attribute+"\n");
                bufferedWriter.write("----------ast_node----------\n");
                for (int i = 0; i < ast_node.size(); i++) {
                    bufferedWriter.write(ast_node.get(i) + "\n");
                }

                bufferedWriter.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }

        if ((good.matcher(funcName).matches()) && (!bad.matcher(funcName).matches())) {
            // 每次退出时把数据写入文件。
            try {

//                if (!new File(out + "/good").exists()) {
//                    new File(out + "/good").mkdirs();
//                }
                label = 0;
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                        new File(out + "/" + name)));

                bufferedWriter.write("-----label-----\n");
                bufferedWriter.write(label + "\n");

                bufferedWriter.write("-----code-----\n");
                bufferedWriter.write(ctx.getText() + "\n");

                bufferedWriter.write("-----children-----\n");
                for (String child : children) {
                    bufferedWriter.write(child + "\n");
                }


                bufferedWriter.write("-----nextToken-----\n");
                bufferedWriter.write(nextToken);
                bufferedWriter.write("\n----------computeFrom----------\n");

                bufferedWriter.write("----------attribute----------\n");
                bufferedWriter.write(attribute+"\n");
                bufferedWriter.write("----------ast_node----------\n");
                for (int i = 0; i < ast_node.size(); i++) {
                    bufferedWriter.write(ast_node.get(i) + "\n");
                }

                bufferedWriter.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
        isMethod = false;
//        System.out.println(nextToken);

    }

    @Override
    public void visitTerminal(TerminalNode node) {

        //nextToken
        if (isMethod) {
            nextNumbers++;
            String temp = nextNumbers + ",";
            nextToken += temp;
        }

        //children
        nodeNumbers++;
        ast_node.add(node.getParent().getText());
        ast_node.add(node.getText());
        String str = nodeNumbers + ",";
        nodeNumbers++;
        str += nodeNumbers;
        children.add(str);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        //attribute
        if (isMethod) {
            String attribute1 = ctx.getClass().toString().split("\\$")[1];
            attribute += attribute1+";";
        }
    }
}
