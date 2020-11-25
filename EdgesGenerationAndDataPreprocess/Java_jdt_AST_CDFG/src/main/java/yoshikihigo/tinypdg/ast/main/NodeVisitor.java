package yoshikihigo.tinypdg.ast.main;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;

public class NodeVisitor extends ASTVisitor {

	public List<ASTNode> nodeList = new ArrayList<ASTNode>();

	@Override
	public void preVisit(ASTNode node) {
		nodeList.add(node);
	}

	public List<ASTNode> getASTNodes() {
		return nodeList;
	}
}
