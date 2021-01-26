package sevenEdges.test;

import sevenEdges.nodeTraversal.ConditionVisitor;
import sevenEdges.nodeTraversal.ElseVisitor;
import sevenEdges.nodeTraversal.ThenVisitor;
import sevenEdges.nodeTraversal.TravesalIf;
import org.eclipse.cdt.core.dom.ast.*;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBinaryExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIfStatement;

import java.util.ArrayList;
import java.util.HashMap;

public class testVisitor extends ASTVisitor {
    private int num = 0;

    public ArrayList<String> getChildren() {
        return children;
    }

    public ArrayList<Integer> getNextToken() {
        return nextToken;
    }

    public ArrayList<String> getComputedFrom() {
        return computedFrom;
    }

    private ArrayList<String> children = new ArrayList<>();
    private ArrayList<Integer> nextToken = new ArrayList<>();
    private ArrayList<String> computedFrom = new ArrayList<>();
    private ArrayList<String> guardedBy = new ArrayList<>();
    private ArrayList<String> guardedByNegation = new ArrayList<>();
    private ArrayList<String> lastLexicalUse = new ArrayList<>();

    public testVisitor() {
        this.shouldVisitNames = true;
        this.shouldVisitDeclarations = true;
        this.shouldVisitInitializers = true;
        this.shouldVisitParameterDeclarations = true;
        this.shouldVisitDeclarators = true;
        this.shouldVisitDeclSpecifiers = true;
        this.shouldVisitExpressions = true;
        this.shouldVisitStatements = true;
    }


    public int visit(IASTName name) {
        num++;
        //children
//        IASTNode iastNode = name;
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }
//
//        System.out.println("name: " + name.getRawSignature() + "," + num);
        return 3;
    }

    public int visit(IASTDeclaration declaration) {
        num++;
        IASTNode iastNode = declaration;
        //children
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }
//        System.out.println("declaration: " + declaration.getRawSignature() + "," + num);
        return 3;
    }

    public int visit(IASTInitializer initializer) {
        num++;
        IASTNode iastNode = initializer;
        //children
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }

//        System.out.println("initializer: " + initializer.getRawSignature() + "," + num);
        return 3;
    }

    public int visit(IASTParameterDeclaration parameterDeclaration) {
        num++;
        IASTNode iastNode = parameterDeclaration;
        //children
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }

//        System.out.println("parameterDeclaration: " + parameterDeclaration.getRawSignature() + "," + num);
        return 3;
    }

    public int visit(IASTDeclarator declarator) {
        num++;
//        IASTNode iastNode = declarator;
        //children
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }

//        System.out.println("declarator: " + declarator.getRawSignature() + "," + num);
        return 3;
    }

    public int visit(IASTDeclSpecifier declSpec) {
        num++;
//        IASTNode iastNode = declSpec;
//        //children
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }

//        System.out.println("declSpec: " + declSpec.getRawSignature() + "," + num);
        return 3;
    }


    public int visit(IASTExpression expression) {
        num++;
        IASTNode iastNode = expression;

        //children
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }


        //computedFrom
        if (iastNode instanceof CPPASTBinaryExpression) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                computedFrom.add(num + "," + (num + (i + 1) * 2));
            }

        }
//        System.out.println("expression: " + expression.getRawSignature() + "," + num);
        return 3;
    }

    public int visit(IASTStatement statement) {
        num++;
//        IASTNode iastNode = statement;
//
//        //children
//        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
//            for (int i = 0; i < iastNode.getChildren().length; i++) {
//                children.add(num + "," + (num + i + 1));
//            }
//        }
//
//        //nextToken
//        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
//            nextToken.add(num);
//        }

        //guardedBy and guardedByNegation and lastLexicalUse
        if (statement instanceof CPPASTIfStatement) {
            int conditionAll = 0;
            int thenAll = 0;
            int elseAll = 0;
            HashMap<String,Integer> conditionVariables = new HashMap<>();
            HashMap<String,Integer> thenVariables = new HashMap<>();
            HashMap<String,Integer> elseVariables = new HashMap<>();

            /**
             * 先处理完if句中的节点编号，condition,then,else,再处理边关系
             */
            //condition
            int conditionOfNum = 0;
//            System.out.println("---condition---");
            IASTNode icondition;
            if ((icondition = ((CPPASTIfStatement) statement).getConditionExpression())
                    instanceof CPPASTBinaryExpression) {
                ConditionVisitor visitor0 = new ConditionVisitor();
                icondition.accept(visitor0);
                conditionOfNum = num + 1;
                conditionAll = visitor0.getNum1()-1;
                for(String s :  visitor0.getVariables().keySet()){
                    conditionVariables.put(s,(visitor0.getVariables().get(s) + conditionOfNum -1));
                }
            }

            //then
//            System.out.println("---then---");
            if (((CPPASTIfStatement) statement).getThenClause() != null) {
                ThenVisitor visitor2 = new ThenVisitor();
                ((CPPASTIfStatement) statement).getThenClause().accept(visitor2);
                thenAll = visitor2.getNum1();
                for(String s :  visitor2.getVariables().keySet()){
                    thenVariables.put(s,(visitor2.getVariables().get(s) + conditionOfNum + conditionAll));
                }

            }
//            System.out.println("---else---");

            //else
            if (((CPPASTIfStatement) statement).getElseClause() != null) {
                ElseVisitor visitor3 = new ElseVisitor();
                ((CPPASTIfStatement) statement).getElseClause().accept(visitor3);
                elseAll = visitor3.getNum1();
                for(String s :  visitor3.getVariables().keySet()){
                    elseVariables.put(s,(visitor3.getVariables().get(s) + conditionOfNum + conditionAll
                    +thenAll));
                }
            }

            //guardedBy : compare condition with then
            if(conditionVariables.size() != 0 && thenVariables.size() != 0) {
                for (String conditionVariable : conditionVariables.keySet()){
                    for(String thenVariable : thenVariables.keySet()){
                        if(conditionVariable.equals(thenVariable)){
                            System.out.println("---guardedBy---");
                            System.out.println(conditionVariables.get(conditionVariable) + "," +
                                    thenVariables.get(thenVariable));
                            guardedBy.add(conditionVariables.get(conditionVariable) + "," +
                                    thenVariables.get(thenVariable));
                        }
                    }
                }

            }

            //guardedByNegation : compare condition with else

            if(conditionVariables.size() != 0 && elseVariables.size() != 0) {
                for (String conditionVariable : conditionVariables.keySet()){
                    for(String elseVariable : elseVariables.keySet()){
                        if(conditionVariable.equals(elseVariable)){
                            System.out.println("---guardedByNegation---");
                            System.out.println(conditionVariables.get(conditionVariable) + "," +
                                    elseVariables.get(elseVariable));
                            guardedByNegation.add(conditionVariables.get(conditionVariable) + "," +
                                    elseVariables.get(elseVariable));
                        }
                    }
                }

            }

            //lastLexicalUse : compare then with else

            if(thenVariables.size() != 0 && elseVariables.size() != 0) {
                for (String thenVariable : thenVariables.keySet()){
                    for(String elseVariable : elseVariables.keySet()){
                        if(thenVariable.equals(elseVariable)){
                            System.out.println("---lastLexicalUse---");
                            System.out.println(thenVariables.get(thenVariable) + "," +
                                    elseVariables.get(elseVariable));
                            lastLexicalUse.add(conditionVariables.get(thenVariable) + "," +
                                    elseVariables.get(elseVariable));
                        }
                    }
                }

            }

            //jump what?
        }

//        System.out.println("statement: " + statement.getRawSignature() + "," + num);
        return 3;
    }

}
