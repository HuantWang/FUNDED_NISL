package sevenEdges.nodeTraversal;

import org.eclipse.cdt.core.dom.ast.*;
import org.eclipse.cdt.core.dom.ast.c.ICASTDesignator;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTCapture;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTNamespaceDefinition;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTTemplateParameter;
import org.eclipse.cdt.internal.core.dom.parser.ASTAmbiguousNode;

import java.util.HashMap;

public class ConditionVisitor extends ASTVisitor {
    private int num1 = 0;
    private HashMap<String,Integer> variables = new HashMap<>();

    public ConditionVisitor() {
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
        this.shouldVisitTranslationUnit = false;
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

    public int getNum1(){
        return num1;
    }
    public HashMap<String,Integer> getVariables(){
        return variables;
    }
    public int visit(IASTTranslationUnit tu) {
        return 3;
    }

    public int visit(IASTName name) {
        num1++;
        variables.put(name.getRawSignature(),num1);
//        System.out.println(name + "," + num1);
//        IASTNode name1 = name;
//        while(!name1.getClass().toString().split("\\.")[name.getClass().toString().split("\\.").length - 1].equals("CPPASTIfStatement")){
//            if(name1.getParent() != null){
//                name1 = name1.getParent();
//            }else{
//                break;
//            }
//        }
//        if(name1 instanceof CPPASTIfStatement){
//            System.out.println(((CPPASTIfStatement)name1).getConditionExpression().getRawSignature());
//        }

        return 3;
    }

    public int visit(IASTDeclaration declaration) {
        num1++;
        return 3;
    }

    public int visit(IASTInitializer initializer) {
        num1++;
        return 3;
    }

    public int visit(IASTParameterDeclaration parameterDeclaration) {
        num1++;
        return 3;
    }

    public int visit(IASTDeclarator declarator) {
        num1++;
        return 3;
    }

    public int visit(IASTDeclSpecifier declSpec) {
        num1++;
        return 3;
    }

    public int visit(IASTArrayModifier arrayModifier) {
        num1++;
        return 3;
    }

    public int visit(IASTPointerOperator ptrOperator) {
        num1++;
        return 3;
    }

    public int visit(IASTAttribute attribute) {
        num1++;
        return 3;
    }

    public int visit(IASTToken token) {
        num1++;
        return 3;
    }

    public int visit(IASTExpression expression) {
        num1++;
        return 3;
    }

    public int visit(IASTStatement statement) {
        num1++;
        return 3;
    }

    public int visit(IASTTypeId typeId) {
        num1++;
        return 3;
    }

    public int visit(IASTEnumerationSpecifier.IASTEnumerator enumerator) {
        num1++;
        return 3;
    }

    public int visit(IASTProblem problem) {
        return 3;
    }

    public int visit(ICPPASTCompositeTypeSpecifier.ICPPASTBaseSpecifier baseSpecifier) {
        num1++;
        return 3;
    }

    public int visit(ICPPASTNamespaceDefinition namespaceDefinition) {
        num1++;
        return 3;
    }

    public int visit(ICPPASTTemplateParameter templateParameter) {
        num1++;
        return 3;
    }

    public int visit(ICPPASTCapture capture) {
        num1++;
        return 3;
    }

    public int visit(ICASTDesignator designator) {
        num1++;
        return 3;
    }

    public int visit(ASTAmbiguousNode astAmbiguousNode) {
        num1++;
        return 3;
    }
}
