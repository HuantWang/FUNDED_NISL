package yoshikihigo.tinypdg.scorpio.data;

import yoshikihigo.tinypdg.pdg.edge.PDGEdge;

public class EdgePairInfo implements Comparable<EdgePairInfo> {

	public final PDGEdge edgeA;
	public final PDGEdge edgeB;

	public EdgePairInfo(final PDGEdge edgeA, final PDGEdge edgeB) {

		assert null != edgeA : "\"edgeA\" is null.";
		assert null != edgeB : "\"edgeB\" is null.";

		this.edgeA = edgeA;
		this.edgeB = edgeB;
	}

	@Override
	public int compareTo(final EdgePairInfo o) {

		final int edgeAOrder = this.edgeA.compareTo(o.edgeA);
		if (0 != edgeAOrder) {
			return edgeAOrder;
		}

		final int edgeBOrder = this.edgeB.compareTo(o.edgeB);
		if (0 != edgeBOrder) {
			return edgeBOrder;
		}

		return 0;
	}
}
