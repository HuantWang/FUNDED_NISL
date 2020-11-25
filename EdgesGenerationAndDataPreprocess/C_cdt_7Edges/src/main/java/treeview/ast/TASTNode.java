package treeview.ast;

import org.eclipse.cdt.core.dom.ast.ASTNodeProperty;
import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.ExpansionOverlapsBoundaryException;
import org.eclipse.cdt.core.dom.ast.IASTFileLocation;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTNodeLocation;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.parser.IToken;

public class TASTNode
        implements IASTNode {
    private IASTNode node;

    public TASTNode(IASTNode node) {
        this.node = node;
    }

    public String toString() {
        return this.node.getClass().getSimpleName();
    }

    public IASTNode[] getChildren() {
        IASTNode[] children = this.node.getChildren();
        if ((children != null) && (children.length > 0)) {
            IASTNode[] nodes = new IASTNode[children.length];
            for (int i = 0; i < children.length; i++) {
                nodes[i] = new TASTNode(children[i]);
            }
            return nodes;
        }
        return children;
    }

    public IASTNode getOriginalNode() {
        return this.node;
    }

    public boolean accept(ASTVisitor arg0) {
        return this.node.accept(arg0);
    }

    public boolean contains(IASTNode arg0) {
        return this.node.contains(arg0);
    }

    public IASTNode copy() {
        return this.node.copy();
    }

    public IASTNode copy(IASTNode.CopyStyle arg0) {
        return this.node.copy(arg0);
    }

    public String getContainingFilename() {
        return this.node.getContainingFilename();
    }

    public IASTFileLocation getFileLocation() {
        return this.node.getFileLocation();
    }

    public IToken getLeadingSyntax() throws ExpansionOverlapsBoundaryException, UnsupportedOperationException {
        return this.node.getLeadingSyntax();
    }

    public IASTNodeLocation[] getNodeLocations() {
        return this.node.getNodeLocations();
    }

    public IASTNode getParent() {
        return this.node.getParent();
    }

    public ASTNodeProperty getPropertyInParent() {
        return this.node.getPropertyInParent();
    }

    public String getRawSignature() {
        return this.node.getRawSignature();
    }

    public IToken getSyntax() throws ExpansionOverlapsBoundaryException {
        return this.node.getSyntax();
    }

    public IToken getTrailingSyntax() throws ExpansionOverlapsBoundaryException, UnsupportedOperationException {
        return this.node.getTrailingSyntax();
    }

    public IASTTranslationUnit getTranslationUnit() {
        return this.node.getTranslationUnit();
    }

    public boolean isActive() {
        return this.node.isActive();
    }

    public boolean isFrozen() {
        return this.node.isFrozen();
    }

    public boolean isPartOfTranslationUnitFile() {
        return this.node.isPartOfTranslationUnitFile();
    }

    public void setParent(IASTNode arg0) {
        this.node.setParent(arg0);
    }

    public void setPropertyInParent(ASTNodeProperty arg0) {
        this.node.setPropertyInParent(arg0);
    }
}

