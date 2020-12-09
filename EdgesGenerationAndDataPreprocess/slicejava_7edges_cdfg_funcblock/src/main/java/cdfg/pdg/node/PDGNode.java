package cdfg.pdg.node;

import cdfg.pe.ProgramElementInfo;
import cdfg.pdg.edge.PDGEdge;

import java.util.SortedSet;
import java.util.TreeSet;

public abstract class PDGNode<T extends ProgramElementInfo> implements
		Comparable<PDGNode<?>> {

	public final T core;
	private final SortedSet<PDGEdge> forwardEdges;
	private final SortedSet<PDGEdge> backwardEdges;

	protected PDGNode(final T core) {
		assert null != core : "\"core\" is null.";
		this.core = core;
		this.forwardEdges = new TreeSet<PDGEdge>();
		this.backwardEdges = new TreeSet<PDGEdge>();
	}

	public SortedSet<String> getDefinedVariables() {
		return this.core.getAssignedVariables();
	}

	public SortedSet<String> getReferencedVariables() {
		return this.core.getReferencedVariables();
	}

	public boolean isDefined(final String variable) {
		return this.getDefinedVariables().contains(variable);
	}

	public boolean isReferenaced(final String variable) {
		return this.getReferencedVariables().contains(variable);
	}

	public boolean addForwardEdge(final PDGEdge edge) {
		assert null != edge : "\"edge\" is null.";
		assert 0 == this.compareTo(edge.fromNode) : "\"edge.fromNode\" must be the same as this object.";
		return this.forwardEdges.add(edge);
	}

	public boolean addBackwardEdge(final PDGEdge edge) {
		assert null != edge : "\"edge\" is null.";
		assert 0 == this.compareTo(edge.toNode) : "\"edge.toNode\" must be the same as this object.";
		return this.backwardEdges.add(edge);
	}

	public boolean removeForwardEdge(final PDGEdge edge) {
		assert null != edge : "\"edge\" is null.";
		assert 0 == this.compareTo(edge.fromNode) : "\"edge.fromNode\" must be the same as this object.";
		return this.forwardEdges.remove(edge);
	}

	public boolean removeBackwardEdge(final PDGEdge edge) {
		assert null != edge : "\"edge\" is null.";
		assert 0 == this.compareTo(edge.toNode) : "\"edge.toNode\" must be the same as this object.";
		return this.backwardEdges.remove(edge);
	}

	public final SortedSet<PDGEdge> getBackwardEdges() {
		final SortedSet<PDGEdge> edges = new TreeSet<PDGEdge>();
		edges.addAll(this.backwardEdges);
		return edges;
	}

	public final SortedSet<PDGEdge> getForwardEdges() {
		final SortedSet<PDGEdge> edges = new TreeSet<PDGEdge>();
		edges.addAll(this.forwardEdges);
		return edges;
	}

	public void remove() {

		for (final PDGEdge edge : this.getBackwardEdges()) {
			final PDGNode<?> backwardNode = edge.fromNode;
			backwardNode.removeForwardEdge(edge);
		}

		for (final PDGEdge edge : this.getForwardEdges()) {
			final PDGNode<?> forwardNode = edge.toNode;
			forwardNode.removeBackwardEdge(edge);
		}

		this.backwardEdges.clear();
		this.forwardEdges.clear();
	}

	@Override
	public int compareTo(final PDGNode<?> node) {
		assert null != node : "\"node\" is null.";
		return this.core.compareTo(node.core);
	}

	public String getText() {
		final StringBuilder text = new StringBuilder();
		text.append(this.core.getText());
//		text.append(" <");
////		if (this.core.startLine == this.core.endLine) {
////			text.append(this.core.startLine);
////		} else {
////			text.append(this.core.startLine);
////			text.append("...");
////			text.append(this.core.endLine);
////		}
////		text.append(">");
		return text.toString();
	}
}
