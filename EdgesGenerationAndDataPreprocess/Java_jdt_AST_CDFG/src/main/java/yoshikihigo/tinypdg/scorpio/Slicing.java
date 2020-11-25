package yoshikihigo.tinypdg.scorpio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

import yoshikihigo.tinypdg.pdg.edge.PDGEdge;
import yoshikihigo.tinypdg.pdg.node.PDGNode;
import yoshikihigo.tinypdg.scorpio.data.ClonePairInfo;
import yoshikihigo.tinypdg.scorpio.data.NodePairInfo;

public class Slicing {

	final static private AtomicLong NUMBER_OF_COMPARISON = new AtomicLong(0);

	public static long getNumberOfComparison() {
		return NUMBER_OF_COMPARISON.get();
	}

	final private SortedSet<NodePairInfo> checkedNodepairs;
	final private SortedMap<PDGNode<?>, PDGNode<?>[]> mappingPDGNodeToPDGNodes;
	final private SortedMap<PDGEdge, PDGEdge[]> mappingPDGEdgeToPDGEdges;
	final public String pathA;
	final public String pathB;
	final public PDGNode<?> startNodeA;
	final public PDGNode<?> startNodeB;

	private ClonePairInfo clonepair;

	public Slicing(final String pathA, final String pathB,
			final PDGNode<?> startNodeA, final PDGNode<?> startNodeB,
			final SortedMap<PDGNode<?>, PDGNode<?>[]> mappingPDGNodeToPDGNodes,
			final SortedMap<PDGEdge, PDGEdge[]> mappingPDGEdgeToPDGEdges,
			final SortedSet<NodePairInfo> checkedNodepairs) {
		this.checkedNodepairs = checkedNodepairs;
		this.pathA = pathA;
		this.pathB = pathB;
		this.startNodeA = startNodeA;
		this.startNodeB = startNodeB;
		this.mappingPDGNodeToPDGNodes = mappingPDGNodeToPDGNodes;
		this.mappingPDGEdgeToPDGEdges = mappingPDGEdgeToPDGEdges;
		this.clonepair = null;
	}

	public ClonePairInfo perform() {
		if (null == this.clonepair) {
			final SortedSet<PDGNode<?>> checkedNodesA = new TreeSet<PDGNode<?>>();
			final SortedSet<PDGNode<?>> checkedNodesB = new TreeSet<PDGNode<?>>();
			this.clonepair = this.perform(this.startNodeA, this.startNodeB,
					checkedNodesA, checkedNodesB);
		}
		return this.clonepair;
	}

	private ClonePairInfo perform(final PDGNode<?> nodeA,
			final PDGNode<?> nodeB, final SortedSet<PDGNode<?>> checkedNodesA,
			final SortedSet<PDGNode<?>> checkedNodesB) {

		final NodePairInfo nodepair = new NodePairInfo(nodeA, nodeB);
		if (this.checkedNodepairs.contains(nodepair)) {
			return new ClonePairInfo(this.pathA, this.pathB);
		}

		checkedNodesA.add(nodeA);
		checkedNodesB.add(nodeB);

		final SortedSet<PDGEdge> bEdgesA = nodeA.getBackwardEdges();
		final SortedSet<PDGEdge> bEdgesB = nodeB.getBackwardEdges();
		final SortedSet<PDGEdge> fEdgesA = nodeA.getForwardEdges();
		final SortedSet<PDGEdge> fEdgesB = nodeB.getForwardEdges();

		final PDGEdgeComparator comparator = new PDGEdgeComparator(
				this.mappingPDGEdgeToPDGEdges);
		final SortedSet<PDGEdge> bSortedEdgesA = new TreeSet<PDGEdge>(
				comparator);
		bSortedEdgesA.addAll(bEdgesA);
		final SortedSet<PDGEdge> bSortedEdgesB = new TreeSet<PDGEdge>(
				comparator);
		bSortedEdgesB.addAll(bEdgesB);
		final SortedSet<PDGEdge> fSortedEdgesA = new TreeSet<PDGEdge>(
				comparator);
		fSortedEdgesA.addAll(fEdgesA);
		final SortedSet<PDGEdge> fSortedEdgesB = new TreeSet<PDGEdge>(
				comparator);
		fSortedEdgesB.addAll(fEdgesB);

		final List<ClonePairInfo> bClonepairs = this.enlargeBackwardClonePair(
				bSortedEdgesA, bSortedEdgesB, checkedNodesA, checkedNodesB);
		final List<ClonePairInfo> fClonepairs = this.enlargeForwardClonePair(
				fSortedEdgesA, fSortedEdgesB, checkedNodesA, checkedNodesB);

		final List<ClonePairInfo> candidates = new ArrayList<ClonePairInfo>();
		this.makeCandidates(candidates, bClonepairs);
		this.makeCandidates(candidates, fClonepairs);

		ClonePairInfo clonepair = new ClonePairInfo(this.pathA, this.pathB);
		for (final ClonePairInfo candidate : candidates) {
			if (clonepair.size() < candidate.size()) {
				clonepair = candidate;
			}
		}

		this.checkedNodepairs.add(nodepair);
		clonepair.addNodePair(nodepair);
		return clonepair;
	}

	private void makeCandidates(final List<ClonePairInfo> candidates,
			final List<ClonePairInfo> clonepairs) {

		assert null != candidates : "\"candidates\" is null.";
		assert null != clonepairs : "\"clonepairs\" is null.";

		for (final ClonePairInfo clonepair : clonepairs) {
			for (final ClonePairInfo candidate : candidates) {
				if (!candidate.conflict(clonepair)) {
					candidate.merge(clonepair);
				}
			}
			final ClonePairInfo newCandidate = new ClonePairInfo(this.pathA,
					this.pathB);
			newCandidate.merge(clonepair);
			candidates.add(newCandidate);
		}
	}

	private List<ClonePairInfo> enlargeBackwardClonePair(
			final SortedSet<PDGEdge> edgesA, final SortedSet<PDGEdge> edgesB,
			final Set<PDGNode<?>> checkedNodesA,
			final Set<PDGNode<?>> checkedNodesB) {

		final List<ClonePairInfo> clonepairs = new ArrayList<ClonePairInfo>();

		EDGEA: for (final PDGEdge edgeA : edgesA) {

			if (checkedNodesA.contains(edgeA.fromNode)
					|| checkedNodesB.contains(edgeA.fromNode)) {
				continue EDGEA;
			}

			final PDGNode<?>[] equivalentNodesA = this.mappingPDGNodeToPDGNodes
					.get(edgeA.fromNode);
			if (null == equivalentNodesA) {
				continue EDGEA;
			}

			EDGEB: for (final PDGEdge edgeB : edgesB) {

				if (checkedNodesB.contains(edgeB.fromNode)
						|| checkedNodesA.contains(edgeB.fromNode)) {
					continue EDGEB;
				}

				final PDGNode<?>[] equivalentNodesB = this.mappingPDGNodeToPDGNodes
						.get(edgeB.fromNode);
				if (null == equivalentNodesB) {
					continue EDGEB;
				}

				if (edgeA == edgeB) {
					continue EDGEB;
				}

				NUMBER_OF_COMPARISON.incrementAndGet();
				if (equivalentNodesA == equivalentNodesB) {

					if (edgeA.fromNode == edgeB.fromNode) {
						continue EDGEB;
					}

					final SortedSet<PDGNode<?>> newCheckedNodesA = new TreeSet<PDGNode<?>>(
							checkedNodesA);
					final SortedSet<PDGNode<?>> newCheckedNodesB = new TreeSet<PDGNode<?>>(
							checkedNodesB);
					final ClonePairInfo clonepair = this.perform(
							edgeA.fromNode, edgeB.fromNode, newCheckedNodesA,
							newCheckedNodesB);
					clonepairs.add(clonepair);
				}
			}
		}

		return clonepairs;
	}

	private List<ClonePairInfo> enlargeForwardClonePair(
			final SortedSet<PDGEdge> edgesA, final SortedSet<PDGEdge> edgesB,
			final Set<PDGNode<?>> checkedNodesA,
			final Set<PDGNode<?>> checkedNodesB) {

		final List<ClonePairInfo> clonepairs = new ArrayList<ClonePairInfo>();

		EDGEA: for (final PDGEdge edgeA : edgesA) {

			if (checkedNodesA.contains(edgeA.toNode)
					|| checkedNodesB.contains(edgeA.toNode)) {
				continue EDGEA;
			}

			final PDGNode<?>[] equivalentNodesA = this.mappingPDGNodeToPDGNodes
					.get(edgeA.toNode);
			if (null == equivalentNodesA) {
				continue EDGEA;
			}

			EDGEB: for (final PDGEdge edgeB : edgesB) {

				if (checkedNodesB.contains(edgeB.toNode)
						|| checkedNodesA.contains(edgeB.toNode)) {
					continue EDGEB;
				}

				final PDGNode<?>[] equivalentNodesB = this.mappingPDGNodeToPDGNodes
						.get(edgeB.toNode);
				if (null == equivalentNodesB) {
					continue EDGEB;
				}

				if (edgeA == edgeB) {
					continue EDGEB;
				}

				NUMBER_OF_COMPARISON.incrementAndGet();
				if (equivalentNodesA == equivalentNodesB) {

					if (edgeA.toNode == edgeB.toNode) {
						continue EDGEB;
					}

					final SortedSet<PDGNode<?>> newCheckedNodesA = new TreeSet<PDGNode<?>>(
							checkedNodesA);
					final SortedSet<PDGNode<?>> newCheckedNodesB = new TreeSet<PDGNode<?>>(
							checkedNodesB);
					final ClonePairInfo clonepair = this.perform(edgeA.toNode,
							edgeB.toNode, newCheckedNodesA, newCheckedNodesB);
					clonepairs.add(clonepair);
				}
			}
		}

		return clonepairs;
	}

	class PDGEdgeComparator implements Comparator<PDGEdge> {

		final private SortedMap<PDGEdge, PDGEdge[]> mappingPDGEdgeToPDFEdge;

		PDGEdgeComparator(
				final SortedMap<PDGEdge, PDGEdge[]> mappingPDGEdgeToPDGEdges) {
			this.mappingPDGEdgeToPDFEdge = mappingPDGEdgeToPDGEdges;
		}

		@Override
		public int compare(final PDGEdge o1, final PDGEdge o2) {

			PDGEdge[] edgesA = this.mappingPDGEdgeToPDFEdge.get(o1);
			PDGEdge[] edgesB = this.mappingPDGEdgeToPDFEdge.get(o2);

			if (null == edgesA) {
				edgesA = new PDGEdge[0];
			}
			if (null == edgesB) {
				edgesB = new PDGEdge[0];
			}

			if (edgesA.length < edgesB.length) {
				return -1;
			} else if (edgesA.length > edgesB.length) {
				return 1;
			} else {
				return o1.compareTo(o2);
			}
		}
	}
}
