package php.main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import php.gen.PhpParser;
import php.gen.PhpParserBaseListener;
import php.gen.PhpParserListener;

import java.util.ArrayList;

public class PhpListener extends PhpParserBaseListener {

    private int nodeNumbers;

    public PhpListener(PhpParser parser) {
        this.nodeNumbers = -1;
    }

    public int nextNumbers;
    String code = "";
    public ArrayList<String> children = new ArrayList<>();
    public String nextToken = "";
    public String attribute = "";
    public ArrayList<String> ast_node = new ArrayList<>();
    public ArrayList<String> nodeMapping = new ArrayList<>();
    public ArrayList<String> contentMapping = new ArrayList<>();

    @Override
    public void visitTerminal(TerminalNode terminalNode) {    //nextToken
        //nextToken
        nextNumbers++;
        String temp = nextNumbers + ",";
        nextToken += temp;

        //children 和 joern
        nodeNumbers++;
        contentMapping.add(terminalNode.getParent().getText().replaceAll("\n","")
                .replaceAll("\r","").replaceAll("\n\r","")
                .replaceAll("\r\n",""));
        contentMapping.add(terminalNode.getText().replaceAll("\n","")
                .replaceAll("\r","").replaceAll("\n\r","")
                .replaceAll("\r\n",""));
        String str =  nodeNumbers + ",";
//        System.out.println("Parent: " + nodeNumbers +" " + terminalNode.getParent().getText());
        nodeNumbers++;
        str += nodeNumbers + "," + 0;
        nodeMapping.add(str);
        children.add(str);

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        //attribute
        String attribute1 = parserRuleContext.getClass().toString().split("\\$")[1];
        attribute += attribute1+";";
    }

}
