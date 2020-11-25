package yoshikihigo.tinypdg.scorpio.data;

import java.util.SortedSet;
import java.util.TreeSet;

import yoshikihigo.tinypdg.pdg.node.PDGNode;

public class ClonePairInfo implements Comparable<ClonePairInfo> {

	final public String pathA;
	final public String pathB;
	final private SortedSet<NodePairInfo> nodePairs;

	public ClonePairInfo(final String pathA, final String pathB) {
		this.pathA = pathA;
		this.pathB = pathB;
		this.nodePairs = new TreeSet<NodePairInfo>();
	}

	public void addNodePair(final NodePairInfo nodePair) {
		assert null != nodePair : "\"nodePair\" is null.";
		this.nodePairs.add(nodePair);
	}

	public void merge(final ClonePairInfo merged) {
		assert null != merged : "\"merged\" is null.";
		this.nodePairs.addAll(merged.nodePairs);
	}

	public CodeFragmentInfo getLeftCodeFragment() {
		final CodeFragmentInfo codefragment = new CodeFragmentInfo();
		for (final NodePairInfo pair : this.nodePairs) {
			codefragment.merge(new CodeFragmentInfo(pair.nodeA));
		}
		return codefragment;
	}

	public CodeFragmentInfo getRightCodeFragment() {
		final CodeFragmentInfo codefragment = new CodeFragmentInfo();
		for (final NodePairInfo edgepair : this.nodePairs) {
			codefragment.merge(new CodeFragmentInfo(edgepair.nodeB));
		}
		return codefragment;
	}

	public SortedSet<PDGNode<?>> getLeftNodes() {
		final SortedSet<PDGNode<?>> nodes = new TreeSet<PDGNode<?>>();
		for (final NodePairInfo pair : this.nodePairs) {
			nodes.add(pair.nodeA);
		}
		return nodes;
	}

	public SortedSet<PDGNode<?>> getRightNodes() {
		final SortedSet<PDGNode<?>> nodes = new TreeSet<PDGNode<?>>();
		for (final NodePairInfo pair : this.nodePairs) {
			nodes.add(pair.nodeB);
		}
		return nodes;
	}

	public int compareTo(final ClonePairInfo clonepair) {

		final int leftOrder = this.getLeftCodeFragment().compareTo(
				clonepair.getLeftCodeFragment());
		if (0 != leftOrder) {
			return leftOrder;
		}

		final int rightOrder = this.getRightCodeFragment().compareTo(
				clonepair.getRightCodeFragment());
		if (0 != rightOrder) {
			return rightOrder;
		}

		return 0;
	}

	public int size() {
		final CodeFragmentInfo left = this.getLeftCodeFragment();
		final CodeFragmentInfo right = this.getRightCodeFragment();
		return Math.min(left.size(), right.size());
	}

	public boolean conflict(final ClonePairInfo clonepair) {
		assert null != clonepair : "\"clonepair\" is null.";
		return this.getLeftCodeFragment().conflict(
				clonepair.getLeftCodeFragment())
				|| this.getRightCodeFragment().conflict(
						clonepair.getRightCodeFragment())
				|| this.getLeftCodeFragment().conflict(
						clonepair.getRightCodeFragment())
				|| this.getRightCodeFragment().conflict(
						clonepair.getLeftCodeFragment());

	}

	public SortedSet<NodePairInfo> getNodePairs() {
		final SortedSet<NodePairInfo> nodepairs = new TreeSet<NodePairInfo>();
		nodepairs.addAll(this.nodePairs);
		return nodepairs;
	}
}
