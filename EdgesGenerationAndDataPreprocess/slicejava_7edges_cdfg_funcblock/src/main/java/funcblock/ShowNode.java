package funcblock;

import com.github.javaparser.ast.Node;

import java.util.List;

/**
 * @author xiao_
 * @data 2019/11/16 10:34
 */
public class ShowNode {

    /**
     * @param list ?
     * @description show node like:com.github.javaparser.ast.stmt.BlockStmt--->
     *                              {
     *                                    return charset;
     *                              }
     */
    public static void show(List<Node> list) {
        for (Node node : list) {
            System.out.println(node.getClass().getName() + "--->");
            System.out.println(node.toString() + "\n");
            if (node.getChildNodes() != null) {
                show(node.getChildNodes());
            }
        }
    }

    /**
     *  TODO: 2019/11/16
     *  @description  show node as tree.(similar to the paper:Modeling and Discovering Vulnerabilities
     *                                   with Code Property Graphs)
     */
    public static void showAsTree(){}
}
