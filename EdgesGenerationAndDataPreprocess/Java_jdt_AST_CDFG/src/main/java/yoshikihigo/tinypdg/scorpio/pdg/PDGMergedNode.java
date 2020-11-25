package yoshikihigo.tinypdg.scorpio.pdg;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import yoshikihigo.tinypdg.pdg.PDG;
import yoshikihigo.tinypdg.pdg.edge.PDGEdge;
import yoshikihigo.tinypdg.pdg.edge.PDGExecutionDependenceEdge;
import yoshikihigo.tinypdg.pdg.node.PDGNode;
import yoshikihigo.tinypdg.pdg.node.PDGNormalNode;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.scorpio.NormalizedText;

public class PDGMergedNode extends PDGNormalNode<ProgramElementInfo> {

	public static void mergeNodes(final PDG pdg) {

		assert null != pdg : "\"pdg\" is null.";

		MERGE: while (true) {

			final SortedSet<PDGEdge> edges = pdg.getAllEdges();
			for (final PDGEdge edge : edges) {

				if (!(edge instanceof PDGExecutionDependenceEdge)) {
					continue;
				}

				final PDGNode<?> fromNode = edge.fromNode;
				final PDGNode<?> toNode = edge.toNode;

				if (!(fromNode instanceof PDGNormalNode<?>)
						|| !(toNode instanceof PDGNormalNode<?>)) {
					continue;
				}

				final NormalizedText fromNodeText = new NormalizedText(
						fromNode.core);
				final NormalizedText toNodeText = new NormalizedText(
						toNode.core);
				if (NormalizedText.normalize(fromNodeText.getText()).equals(
						NormalizedText.normalize(toNodeText.getText()))) {

					final PDGMergedNode mergedNode = new PDGMergedNode(
							(PDGNormalNode<?>) fromNode,
							(PDGNormalNode<?>) toNode);

					fromNode.removeForwardEdge(edge);
					toNode.removeBackwardEdge(edge);

					replace(fromNode, mergedNode);
					replace(toNode, mergedNode);

					continue MERGE;
				}
			}

			break;
		}
	}

	private static void replace(final PDGNode<?> replacedNode,
			final PDGNode<?> replacingNode) {

		assert null != replacedNode : "\"replacedNode\" is null.";
		assert null != replacingNode : "\"replacingNode\" is null.";

		final SortedSet<PDGEdge> backwardEdges = replacedNode
				.getBackwardEdges();
		for (final PDGEdge backwardEdge : backwardEdges) {
			final boolean b1 = backwardEdge.fromNode
					.removeForwardEdge(backwardEdge);
			final boolean b2 = replacedNode.removeBackwardEdge(backwardEdge);

			assert b1 : "invalid status.";
			assert b2 : "invalid status.";

			final PDGEdge newBackwardEdge = backwardEdge
					.replaceToNode(replacingNode);
			backwardEdge.fromNode.addForwardEdge(newBackwardEdge);
			replacingNode.addBackwardEdge(newBackwardEdge);
		}

		final SortedSet<PDGEdge> forwardEdges = replacedNode.getForwardEdges();
		for (final PDGEdge forwardEdge : forwardEdges) {
			final boolean b1 = forwardEdge.toNode
					.removeBackwardEdge(forwardEdge);
			final boolean b2 = replacedNode.removeForwardEdge(forwardEdge);

			assert b1 : "invalid status.";
			assert b2 : "invalid status.";

			final PDGEdge newForwardEdge = forwardEdge
					.replaceFromNode(replacingNode);
			forwardEdge.toNode.addBackwardEdge(newForwardEdge);
			replacingNode.addForwardEdge(newForwardEdge);
		}
	}

	final private SortedSet<PDGNormalNode<?>> originalNodes;

	public PDGMergedNode(final PDGNormalNode<?> node1,
			final PDGNormalNode<?> node2) {
		super(node1.core);
		this.originalNodes = new TreeSet<PDGNormalNode<?>>(
				new LocationalComparator());
		this.add(node1);
		this.add(node2);
	}

	public SortedSet<PDGNormalNode<?>> getOriginalNodes() {
		final SortedSet<PDGNormalNode<?>> nodes = new TreeSet<PDGNormalNode<?>>(
				new LocationalComparator());
		nodes.addAll(this.originalNodes);
		return nodes;
	}

	@Override
	public String getText() {
		final StringBuilder text = new StringBuilder();
		for (final PDGNode<?> node : this.originalNodes) {
			text.append(node.getText());
			text.append(System.getProperty("line.separator"));
		}
		return text.toString();
	}

	private void add(final PDGNormalNode<?> node) {
		assert null != node : "\"node\" is null.";

		if (node instanceof PDGMergedNode) {
			final SortedSet<PDGNormalNode<?>> originalNodes = ((PDGMergedNode) node)
					.getOriginalNodes();
			for (final PDGNormalNode<?> originalNode : originalNodes) {
				this.add(originalNode);
			}
		}

		else {
			this.originalNodes.add(node);
		}
	}

	class LocationalComparator implements Comparator<PDGNormalNode<?>> {

		@Override
		public int compare(PDGNormalNode<?> o1, PDGNormalNode<?> o2) {

			assert null != o1 : "\"o1\" is null.";
			assert null != o2 : "\"o2\" is null.";

			if (o1.core.startLine < o2.core.startLine) {
				return -1;
			} else if (o1.core.startLine > o2.core.startLine) {
				return 1;
			} else if (o1.core.endLine < o2.core.endLine) {
				return -1;
			} else if (o1.core.endLine > o2.core.endLine) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
