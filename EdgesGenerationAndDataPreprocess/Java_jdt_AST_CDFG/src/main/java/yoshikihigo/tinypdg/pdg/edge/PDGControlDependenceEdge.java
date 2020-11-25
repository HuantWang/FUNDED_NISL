package yoshikihigo.tinypdg.pdg.edge;

import yoshikihigo.tinypdg.pdg.node.PDGControlNode;
import yoshikihigo.tinypdg.pdg.node.PDGNode;

public class PDGControlDependenceEdge extends PDGEdge {

	final public boolean trueDependence;

	public PDGControlDependenceEdge(final PDGControlNode fromNode,
			final PDGNode<?> toNode, final boolean trueDependence) {
		super(PDGEdge.TYPE.CONTROL, fromNode, toNode);
		this.trueDependence = trueDependence;
	}

	public boolean isTrueDependence() {
		return this.trueDependence;
	}

	public boolean isFalseDependence() {
		return !this.trueDependence;
	}

	@Override
	public PDGEdge replaceFromNode(final PDGNode<?> fromNode) {
		assert null != fromNode : "\"fromNode\" is null.";
		assert !(fromNode instanceof PDGControlNode) : "\"fromNode\" must be an instanceof PDGControlNode.";
		return new PDGControlDependenceEdge((PDGControlNode) fromNode,
				this.toNode, this.trueDependence);
	}

	@Override
	public PDGEdge replaceToNode(final PDGNode<?> toNode) {
		assert null != fromNode : "\"toNode\" is null.";
		return new PDGControlDependenceEdge((PDGControlNode) this.fromNode,
				toNode, this.trueDependence);
	}

	@Override
	public String getDependenceString() {
		return this.trueDependence ? "true" : "false";
	}
}
