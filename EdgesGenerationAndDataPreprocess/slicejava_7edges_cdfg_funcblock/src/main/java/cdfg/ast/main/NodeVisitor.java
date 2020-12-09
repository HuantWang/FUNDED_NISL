package cdfg.ast.main;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

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
