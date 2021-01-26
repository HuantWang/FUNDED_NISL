package sevenEdges.nodeTraversal;

import org.eclipse.cdt.core.dom.ast.*;
import org.eclipse.cdt.core.dom.ast.c.ICASTDesignator;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTCapture;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTNamespaceDefinition;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTTemplateParameter;
import org.eclipse.cdt.internal.core.dom.parser.ASTAmbiguousNode;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBinaryExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIfStatement;

import java.util.*;

public class MyVisitor extends ASTVisitor {
    private int num = 0;
    private ArrayList<String> ast_node = new ArrayList<>();
    private StringBuilder nodeType = new StringBuilder();
    private ArrayList<String> children = new ArrayList<>();
    private ArrayList<String> computedFrom = new ArrayList<>();
    private ArrayList<Integer> nextToken = new ArrayList<>();
    private ArrayList<String> guardedBy = new ArrayList<>();
    private ArrayList<String> guardedByNegation = new ArrayList<>();
    private ArrayList<String> lastLexicalUse = new ArrayList<>();

    //getter
    public ArrayList<String> getChildren() {
        return children;
    }

    public ArrayList<Integer> getNextToken() {
        return nextToken;
    }

    public ArrayList<String> getComputedFrom() {
        return computedFrom;
    }

    public ArrayList<String> getGuardedBy() {
        return guardedBy;
    }

    public ArrayList<String> getGuardedByNegation() {
        return guardedByNegation;
    }

    public ArrayList<String> getLastLexicalUse() {
        return lastLexicalUse;
    }

    public ArrayList<String> getAst_node() {
        return ast_node;
    }

    public StringBuilder getNodeType() {
        return nodeType;
    }


    public MyVisitor() {
        this.shouldVisitNames = true;
        this.shouldVisitDeclarations = true;
        this.shouldVisitInitializers = true;
        this.shouldVisitParameterDeclarations = true;
        this.shouldVisitDeclarators = true;
        this.shouldVisitDeclSpecifiers = true;
        this.shouldVisitArrayModifiers = true;
        this.shouldVisitPointerOperators = true;
        this.shouldVisitAttributes = true;
        this.shouldVisitTokens = true;
        this.shouldVisitExpressions = true;
        this.shouldVisitStatements = true;
        this.shouldVisitTypeIds = true;
        this.shouldVisitEnumerators = true;
        this.shouldVisitTranslationUnit = true;
        this.shouldVisitProblems = true;
        this.shouldVisitDesignators = true;
        this.shouldVisitBaseSpecifiers = true;
        this.shouldVisitNamespaces = true;
        this.shouldVisitTemplateParameters = true;
        this.shouldVisitCaptures = true;
        this.includeInactiveNodes = true;
        this.shouldVisitAmbiguousNodes = true;
        this.shouldVisitImplicitNames = true;
        this.shouldVisitImplicitNameAlternates = true;

    }

    @Override
    public int visit(IASTTranslationUnit tu) {
       return 3;
    }

    //all variables are in name.
    @Override
    public int visit(IASTName name) {

        ast_node.add(name.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(name.getClass().toString().split("\\.")[name.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = name;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }

        return 3;
    }

    @Override
    public int visit(IASTDeclaration declaration) {

        ast_node.add(declaration.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(declaration.getClass().toString().split("\\.")[declaration.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");
        String str2 = declaration.getRawSignature();
        num++;
        //children
        IASTNode iastNode = declaration;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }

        return 3;
    }


    @Override
    public int visit(IASTInitializer initializer) {

        ast_node.add(initializer.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(initializer.getClass().toString().split("\\.")[initializer.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = initializer;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }

        return 3;
    }

    @Override
    public int visit(IASTParameterDeclaration parameterDeclaration) {

        ast_node.add(parameterDeclaration.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(parameterDeclaration.getClass().toString().split("\\.")[parameterDeclaration.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = parameterDeclaration;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTDeclarator declarator) {

        ast_node.add(declarator.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(declarator.getClass().toString().split("\\.")[declarator.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = declarator;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTDeclSpecifier declSpec) {

        ast_node.add(declSpec.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(declSpec.getClass().toString().split("\\.")[declSpec.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = declSpec;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTArrayModifier arrayModifier) {

        ast_node.add(arrayModifier.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(arrayModifier.getClass().toString().split("\\.")[arrayModifier.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = arrayModifier;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTPointerOperator ptrOperator) {

        ast_node.add(ptrOperator.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(ptrOperator.getClass().toString().split("\\.")[ptrOperator.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = ptrOperator;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTAttribute attribute) {

        ast_node.add(attribute.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(attribute.getClass().toString().split("\\.")[attribute.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = attribute;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTToken token) {

        ast_node.add(token.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(token.getClass().toString().split("\\.")[token.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = token;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTExpression expression) {

        ast_node.add(expression.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(expression.getClass().toString().split("\\.")[expression.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = expression;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }

        //ComputeFrom 待改进

        if (expression instanceof CPPASTBinaryExpression) {

            if (iastNode.getChildren().length <= 2) {
                for (int i = 0; i < iastNode.getChildren().length; i++) {
                    computedFrom.add(num + "," + (num + i + 1));
                }
            }
        }


        return 3;
    }

    @Override
    public int visit(IASTStatement statement) {

        ast_node.add(statement.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(statement.getClass().toString().split("\\.")[statement.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = statement;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }


        //guardedBy and guardedByNegation and lastLexicalUse
        if (statement instanceof CPPASTIfStatement) {
            int conditionAll = 0;
            int thenAll = 0;
            int elseAll = 0;
            HashMap<String, Integer> conditionVariables = new HashMap<>();
            HashMap<String, Integer> thenVariables = new HashMap<>();
            HashMap<String, Integer> elseVariables = new HashMap<>();

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
                conditionAll = visitor0.getNum1() - 1;
                for (String s : visitor0.getVariables().keySet()) {
                    if(s != null){
                    conditionVariables.put(s, (visitor0.getVariables().get(s) + conditionOfNum - 1));
                    }
                }
            }

            //then
//            System.out.println("---then---");
            if (((CPPASTIfStatement) statement).getThenClause() != null) {
                ThenVisitor visitor2 = new ThenVisitor();
                ((CPPASTIfStatement) statement).getThenClause().accept(visitor2);
                thenAll = visitor2.getNum1();
                for (String s : visitor2.getVariables().keySet()) {
                    if(s != null){
                    thenVariables.put(s, (visitor2.getVariables().get(s) + conditionOfNum + conditionAll));
                }}

            }
//            System.out.println("---else---");

            //else
            if (((CPPASTIfStatement) statement).getElseClause() != null) {
                ElseVisitor visitor3 = new ElseVisitor();
                ((CPPASTIfStatement) statement).getElseClause().accept(visitor3);
                elseAll = visitor3.getNum1();
                for (String s : visitor3.getVariables().keySet()) {
                    if(s != null){
                    elseVariables.put(s, (visitor3.getVariables().get(s) + conditionOfNum + conditionAll
                            + thenAll));
                }}
            }

            //guardedBy : compare condition with then
            if (conditionVariables.size() != 0 && thenVariables.size() != 0) {
                for (String conditionVariable : conditionVariables.keySet()) {
                    for (String thenVariable : thenVariables.keySet()) {
                        if (conditionVariable.equals(thenVariable)) {
//                            System.out.println("---guardedBy---");
//                            System.out.println(conditionVariables.get(conditionVariable) + "," +
//                                    thenVariables.get(thenVariable));
                            guardedBy.add(conditionVariables.get(conditionVariable) + "," +
                                    thenVariables.get(thenVariable));
                        }
                    }
                }

            }

            //guardedByNegation : compare condition with else

            if (conditionVariables.size() != 0 && elseVariables.size() != 0) {
                for (String conditionVariable : conditionVariables.keySet()) {
                    for (String elseVariable : elseVariables.keySet()) {
                        if (conditionVariable.equals(elseVariable)) {
//                            System.out.println("---guardedByNegation---");
//                            System.out.println(conditionVariables.get(conditionVariable) + "," +
//                                    elseVariables.get(elseVariable));
                            guardedByNegation.add(conditionVariables.get(conditionVariable) + "," +
                                    elseVariables.get(elseVariable));
                        }
                    }
                }

            }

            //lastLexicalUse : compare then with else

            if (thenVariables.size() != 0 && elseVariables.size() != 0) {
                for (String thenVariable : thenVariables.keySet()) {
                    for (String elseVariable : elseVariables.keySet()) {
                        if (thenVariable.equals(elseVariable)) {
//                            System.out.println("---lastLexicalUse---");
//                            System.out.println(thenVariables.get(thenVariable) + "," +
//                                    elseVariables.get(elseVariable));
                            lastLexicalUse.add(conditionVariables.get(thenVariable) + "," +
                                    elseVariables.get(elseVariable));
                        }
                    }
                }

            }

            //jump todo
        }
        return 3;
    }

    @Override
    public int visit(IASTTypeId typeId) {

        ast_node.add(typeId.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(typeId.getClass().toString().split("\\.")[typeId.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = typeId;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }

        return 3;
    }

    @Override
    public int visit(IASTEnumerationSpecifier.IASTEnumerator enumerator) {

        ast_node.add(enumerator.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(enumerator.getClass().toString().split("\\.")[enumerator.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = enumerator;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(IASTProblem problem) {
//        nodes.add(problem.getRawSignature());
        return 3;
    }

    @Override
    public int visit(ICPPASTCompositeTypeSpecifier.ICPPASTBaseSpecifier baseSpecifier) {

        ast_node.add(baseSpecifier.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(baseSpecifier.getClass().toString().split("\\.")[baseSpecifier.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = baseSpecifier;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(ICPPASTNamespaceDefinition namespaceDefinition) {

        ast_node.add(namespaceDefinition.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(namespaceDefinition.getClass().toString().split("\\.")[namespaceDefinition.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = namespaceDefinition;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }

        return 3;
    }

    @Override
    public int visit(ICPPASTTemplateParameter templateParameter) {

        ast_node.add(templateParameter.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(templateParameter.getClass().toString().split("\\.")[templateParameter.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = templateParameter;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(ICPPASTCapture capture) {

        ast_node.add(capture.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(capture.getClass().toString().split("\\.")[capture.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = capture;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(ICASTDesignator designator) {

        ast_node.add(designator.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(designator.getClass().toString().split("\\.")[designator.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = designator;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }
        return 3;
    }

    @Override
    public int visit(ASTAmbiguousNode astAmbiguousNode) {

        ast_node.add(astAmbiguousNode.getRawSignature().replaceAll("\n", "").replaceAll("\r", ""));
        nodeType.append(astAmbiguousNode.getClass().toString().split("\\.")[astAmbiguousNode.getClass().toString().split("\\.").length - 1].replaceAll("CPPAST", "") + ";");

        num++;
        //children
        IASTNode iastNode = astAmbiguousNode;
        if (iastNode.getChildren() != null && iastNode.getChildren().length != 0) {
            for (int i = 0; i < iastNode.getChildren().length; i++) {
                children.add(num + "," + (num + i + 1));
            }
        }
        //nextToken
        if (iastNode.getChildren() == null || iastNode.getChildren().length == 0) {
            nextToken.add(num);
        }

        return 3;
    }
}
