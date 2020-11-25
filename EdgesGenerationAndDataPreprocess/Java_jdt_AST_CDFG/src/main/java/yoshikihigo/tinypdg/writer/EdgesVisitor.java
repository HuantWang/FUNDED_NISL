package yoshikihigo.tinypdg.writer;

import org.eclipse.jdt.core.dom.*;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EdgesVisitor extends ASTVisitor {

    public static List<String> attributes = new ArrayList<>();
    public static List<String> nextTokens = new ArrayList<>();
    public static int ID = 0; //用来编号
    BufferedWriter writer;

    public EdgesVisitor(BufferedWriter writer) {
        this.writer = writer;
    }

    // 输入的是MethodDeclaration, label为0
    public static void getDirectChildren(ASTNode node, int id) {

        //nextToken
        List listProperty = node.structuralPropertiesForType();
        boolean hasChildren = false;
        for (int i = 0; i < listProperty.size(); i++) {
            StructuralPropertyDescriptor propertyDescriptor = (StructuralPropertyDescriptor) listProperty.get(i);
            if (propertyDescriptor instanceof ChildListPropertyDescriptor) {//ASTNode列表
                ChildListPropertyDescriptor childListPropertyDescriptor = (ChildListPropertyDescriptor) propertyDescriptor;
                Object children = node.getStructuralProperty(childListPropertyDescriptor);
                List<ASTNode> childrenNodes = (List<ASTNode>) children;
                for (ASTNode childNode : childrenNodes) {
                    //获取所有节点
                    if (childNode == null)
                        continue;
                    hasChildren = true;
                    attributes.add(childNode.getClass().toString().split("\\.")
                            [childNode.getClass().toString().split("\\.").length - 1]);
                    getDirectChildren(childNode, ID++);//继续递归
                    //System.out.println("childrenList:   "+childNode+"   "+childNode.getClass());
                }

            } else if (propertyDescriptor instanceof ChildPropertyDescriptor) {
                ChildPropertyDescriptor childPropertyDescriptor = (ChildPropertyDescriptor) propertyDescriptor;
                Object child = node.getStructuralProperty(childPropertyDescriptor);
                ASTNode childNode = (ASTNode) child;
                if (childNode == null)
                    continue;
                hasChildren = true;
                //获取了这个节点
                nextTokens.add(childNode.toString());
//                System.out.println(childNode.toString());
                attributes.add(childNode.getClass().toString().split("\\.")
                        [childNode.getClass().toString().split("\\.").length - 1]);
                getDirectChildren(childNode, ID++);//继续递归
            }
        }
    }

    @Override
    public void preVisit(ASTNode node) {
    }

    @Override
    public boolean visit(MethodDeclaration node) {
        return true;
    }

    public static String getNextTokens() {
        String nextTokens1 = "";
        for (int i = 0; i < nextTokens.size() ; i++) {
            nextTokens1 += i + ",";
        }
        return nextTokens1.substring(0, nextTokens1.length() - 1);
    }

    public static String getAttributes() {
        String attributes1 = "";
        for (String s : attributes) {
            attributes1 += s + ",";
        }
//        return attributes1.substring(0, attributes1.length() -1);
        // The following code can be replaced by the above line
        char[] temp = new char[attributes1.toCharArray().length - 1];
        for (int j = 0; j < attributes1.toCharArray().length - 1; j++) {
            temp[j] = attributes1.toCharArray()[j];
        }
        return String.valueOf(temp);
    }
}
