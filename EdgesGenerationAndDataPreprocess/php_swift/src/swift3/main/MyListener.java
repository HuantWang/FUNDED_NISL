package swift3.main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import swift3.gen.Swift3BaseListener;
import swift3.gen.Swift3Parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class MyListener extends Swift3BaseListener {

    private int nodeNumbers;

    public int nextNumbers;
    String code = "";
    public ArrayList<String> children = new ArrayList<>();
    public String nextToken = "";
    public String attribute = "";
    public ArrayList<String> ast_node = new ArrayList<>();
    public ArrayList<String> nodeMapping = new ArrayList<>();
    public ArrayList<String> contentMapping = new ArrayList<>();
    public ArrayList changelines;
    public String out;
    int label = 0;

    public MyListener(Swift3Parser parser, ArrayList changelines, String out) {
        this.changelines = changelines;
        this.out = out;
    }

    @Override
    public void enterFunction_declaration(Swift3Parser.Function_declarationContext ctx) {
        //每次进入都初始化所有变量
        nodeNumbers = -1;
        label = 0;
        nodeMapping = new ArrayList<>();
        contentMapping = new ArrayList<>();
        nextNumbers = -1;
        code = "";
        children = new ArrayList<>();
        nextToken = "";
        attribute = "";
        ast_node = new ArrayList<>();
        System.out.println("next Func...");
    }

    @Override
    public void exitFunction_declaration(Swift3Parser.Function_declarationContext ctx) {

        // 函数块行号起始与结束，用于和changeline比较，决定label
        int FuncLineStart = ctx.getStart().getLine();
        int FuncLineStop = ctx.getStop().getLine();
//        System.out.println(ctx.getText());

        //将list中的值和begin,end比较,介于其中则label=1,同时退出循环.否则为0
        Iterator iterator = changelines.iterator();

        while (iterator.hasNext()) {
            int temp = Integer.valueOf((String) (iterator.next()));
            if (temp >= FuncLineStart && temp <= FuncLineStop) {
                label = 1;
                break;
            }
        }

        if (label == 1) {
            // 每次退出时把数据写入文件。
            try {
                String name = UUID.randomUUID() + ".txt";
                if (!new File(out + "/bad").exists()) {
                    new File(out + "/bad").mkdirs();
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                        new File(out + "/bad/" + name)));

                bufferedWriter.write("-----label-----\n");
                bufferedWriter.write(label + "\n");


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
                bufferedWriter.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }

        if (label == 0) {
            // 每次退出时把数据写入文件。
            try {
                String name = UUID.randomUUID() + ".txt";
                if (!new File(out + "/good").exists()) {
                    new File(out + "/good").mkdirs();
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                        new File(out + "/good/" + name)));

                bufferedWriter.write("-----label-----\n");
                bufferedWriter.write(label + "\n");


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
                bufferedWriter.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }

    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (!node.getText().equals("<EOF>")) {
            //nextToken
            nextNumbers++;
            String temp = nextNumbers + ",";
            nextToken += temp;

            //
            nodeNumbers++;
            contentMapping.add(node.getParent().getText().replaceAll("\n", "")
                    .replaceAll("\r", "").replaceAll("\n\r", "")
                    .replaceAll("\r\n", ""));
            contentMapping.add(node.getText().replaceAll("\n", "")
                    .replaceAll("\r", "").replaceAll("\n\r", "")
                    .replaceAll("\r\n", ""));
            String str = nodeNumbers + ",";
//            System.out.println("Parent: " + nodeNumbers + " " + node.getParent().getText());
            nodeNumbers++;
//            System.out.println("Child: " + nodeNumbers + " " + node.getText());
            str += nodeNumbers + "," + 0;
            nodeMapping.add(str);
        }
        System.out.println("gogogo...");
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        //attribute
        String attribute1 = parserRuleContext.getClass().toString().split("\\$")[1];
        attribute += attribute1 + ";";
    }


}
