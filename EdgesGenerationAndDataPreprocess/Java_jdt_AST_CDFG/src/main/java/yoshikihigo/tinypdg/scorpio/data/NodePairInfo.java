package yoshikihigo.tinypdg.scorpio.data;

import yoshikihigo.tinypdg.pdg.node.PDGNode;

public class NodePairInfo implements Comparable<NodePairInfo> {

	public final PDGNode<?> nodeA;
	public final PDGNode<?> nodeB;

	public NodePairInfo(final PDGNode<?> nodeA, final PDGNode<?> nodeB) {
		this.nodeA = nodeA;
		this.nodeB = nodeB;
	}

	@Override
	public int compareTo(final NodePairInfo o) {

		if (this.nodeA.core.id < o.nodeA.core.id) {
			return -1;
		} else if (this.nodeA.core.id > o.nodeA.core.id) {
			return 1;
		} else if (this.nodeB.core.id < o.nodeB.core.id) {
			return -1;
		} else if (this.nodeB.core.id > o.nodeB.core.id) {
			return 1;
		} else {
			return 0;
		}
	}
}
