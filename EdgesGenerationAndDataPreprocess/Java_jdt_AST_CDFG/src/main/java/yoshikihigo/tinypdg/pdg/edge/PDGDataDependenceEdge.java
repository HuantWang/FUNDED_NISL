package yoshikihigo.tinypdg.pdg.edge;

import yoshikihigo.tinypdg.pdg.node.PDGNode;

public class PDGDataDependenceEdge extends PDGEdge {

	final public String data;

	public PDGDataDependenceEdge(final PDGNode<?> fromNode,
			final PDGNode<?> toNode, final String data) {
		super(PDGEdge.TYPE.DATA, fromNode, toNode);
		this.data = data;
	}

	@Override
	public PDGEdge replaceFromNode(final PDGNode<?> fromNode) {
		assert null != fromNode : "\"fromNode\" is null.";
		return new PDGDataDependenceEdge(fromNode, this.toNode, this.data);
	}

	@Override
	public PDGEdge replaceToNode(final PDGNode<?> toNode) {
		assert null != fromNode : "\"toNode\" is null.";
		return new PDGDataDependenceEdge(this.fromNode, toNode, this.data);
	}

	@Override
	public String getDependenceString() {
		return this.data;
	}
}
