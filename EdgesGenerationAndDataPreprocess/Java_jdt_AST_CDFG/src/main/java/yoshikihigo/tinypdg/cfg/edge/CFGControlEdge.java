package yoshikihigo.tinypdg.cfg.edge;

import yoshikihigo.tinypdg.cfg.node.CFGNode;

public class CFGControlEdge extends CFGEdge {

	final public boolean control;

	CFGControlEdge(CFGNode<?> fromNode, final CFGNode<?> toNode,
			final boolean control) {
		super(fromNode, toNode);
		this.control = control;
	}

	@Override
	public String getDependenceString() {
		return Boolean.toString(this.control);
	}

	@Override
	public String getDependenceTypeString() {
		return "control";
	}
}
