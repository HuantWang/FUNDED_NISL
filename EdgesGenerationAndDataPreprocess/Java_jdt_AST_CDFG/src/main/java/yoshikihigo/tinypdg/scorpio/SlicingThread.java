package yoshikihigo.tinypdg.scorpio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

import yoshikihigo.tinypdg.pdg.PDG;
import yoshikihigo.tinypdg.pdg.edge.PDGEdge;
import yoshikihigo.tinypdg.pdg.node.PDGNode;
import yoshikihigo.tinypdg.scorpio.data.ClonePairInfo;
import yoshikihigo.tinypdg.scorpio.data.EdgePairInfo;
import yoshikihigo.tinypdg.scorpio.data.NodePairInfo;
import yoshikihigo.tinypdg.scorpio.data.PDGPairInfo;

public class SlicingThread implements Runnable {

	final static private AtomicInteger PAIRINDEX = new AtomicInteger(0);
	final static private AtomicInteger SINGLEINDEX = new AtomicInteger(0);

	final private PDGPairInfo[] pdgpairs;
	final private PDG[] pdgs;

	final private SortedMap<PDG, SortedMap<PDGNode<?>, Integer>> mapPDGToPDGNodes;
	final private SortedMap<PDG, SortedMap<PDGEdge, Integer>> mapPDGToPDGEdges;
	final private SortedSet<ClonePairInfo> clonepairs;
	final private int SIZE_THRESHOLD;

	SlicingThread(
			final PDGPairInfo[] pdgpairs,
			final PDG[] pdgs,
			final SortedMap<PDG, SortedMap<PDGNode<?>, Integer>> mapPDGToPDGNodes,
			final SortedMap<PDG, SortedMap<PDGEdge, Integer>> mapPDGToPDGEdges,
			final SortedSet<ClonePairInfo> clonepairs, final int SIZE_THRESHOLD) {
		assert null != pdgpairs : "\"pdgpairs\" is null.";
		assert null != pdgs : "\"pdgs\" is null.";
		assert null != mapPDGToPDGNodes : "\"mapPDGToPDGNodes\"";
		assert null != mapPDGToPDGEdges : "\"mapPDGToPDGEdges\" is null.";
		assert null != clonepairs : "\"clonepairs\" is null.";
		assert 0 < SIZE_THRESHOLD : "\"THRESHOLD\" must be greater than 0.";
		this.pdgpairs = pdgpairs;
		this.pdgs = pdgs;
		this.mapPDGToPDGNodes = mapPDGToPDGNodes;
		this.mapPDGToPDGEdges = mapPDGToPDGEdges;
		this.clonepairs = clonepairs;
		this.SIZE_THRESHOLD = SIZE_THRESHOLD;
	}

	@Override
	public void run() {

		final SortedSet<ClonePairInfo> clonepairs = new TreeSet<ClonePairInfo>();

		for (int index = PAIRINDEX.getAndIncrement(); index < this.pdgpairs.length; index = PAIRINDEX
				.getAndIncrement()) {

			final PDG pdgA = this.pdgpairs[index].left;
			final PDG pdgB = this.pdgpairs[index].right;
			final String pathA = pdgA.unit.path;
			final String pathB = pdgB.unit.path;

			try {

				final SortedMap<PDGNode<?>, Integer> mappingPDGNodeToHashA = this.mapPDGToPDGNodes
						.get(pdgA);
				final SortedMap<PDGNode<?>, Integer> mappingPDGNodeToHashB = this.mapPDGToPDGNodes
						.get(pdgB);
				final SortedMap<Integer, List<PDGNode<?>>> mappingHashToPDGNodes = new TreeMap<Integer, List<PDGNode<?>>>();
				this.registerNodes(mappingHashToPDGNodes, mappingPDGNodeToHashA);
				this.registerNodes(mappingHashToPDGNodes, mappingPDGNodeToHashB);
				final SortedMap<PDGNode<?>, PDGNode<?>[]> mappingPDGNodeToPDGNodes = new TreeMap<PDGNode<?>, PDGNode<?>[]>();
				for (final List<PDGNode<?>> list : mappingHashToPDGNodes
						.values()) {
					if (1 < list.size()) {
						final PDGNode<?>[] nodes = list
								.toArray(new PDGNode<?>[0]);
						for (final PDGNode<?> node : nodes) {
							mappingPDGNodeToPDGNodes.put(node, nodes);
						}
					}
				}

				final SortedMap<PDGEdge, Integer> mappingPDGEdgeToHashA = this.mapPDGToPDGEdges
						.get(pdgA);
				final SortedMap<PDGEdge, Integer> mappingPDGEdgeToHashB = this.mapPDGToPDGEdges
						.get(pdgB);

				final SortedSet<PDGEdge> edgesA = pdgA.getAllEdges();
				final SortedSet<PDGEdge> edgesB = pdgB.getAllEdges();

				final SortedMap<Integer, List<PDGEdge>> mappingHashToPDGEdges = new TreeMap<Integer, List<PDGEdge>>();
				this.registerEdges(mappingHashToPDGEdges, mappingPDGEdgeToHashA);
				this.registerEdges(mappingHashToPDGEdges, mappingPDGEdgeToHashB);

				final SortedMap<PDGEdge, PDGEdge[]> mappingPDGEdgeToPDGEdges = new TreeMap<PDGEdge, PDGEdge[]>();
				for (final List<PDGEdge> list : mappingHashToPDGEdges.values()) {
					if (1 < list.size()) {
						final PDGEdge[] edges = list.toArray(new PDGEdge[0]);
						for (final PDGEdge edge : edges) {
							mappingPDGEdgeToPDGEdges.put(edge, edges);
						}
					}
				}

				final SortedSet<PDGEdge[]> sortedPDGEdges = new TreeSet<PDGEdge[]>(
						new PDGEdgesComparator());
				for (final List<PDGEdge> list : mappingHashToPDGEdges.values()) {
					if (1 < list.size()) {
						final PDGEdge[] edges = list.toArray(new PDGEdge[0]);
						sortedPDGEdges.add(edges);
					}
				}

				final SortedSet<NodePairInfo> checkedNodepairs = new TreeSet<NodePairInfo>();
				for (final PDGEdge[] edges : sortedPDGEdges) {
					for (int x = 0; x < edges.length; x++) {
						for (int y = 0; y < edges.length; y++) {

							if (x == y) {
								continue;
							}

							final PDGEdge edgeA = edges[x];
							final PDGEdge edgeB = edges[y];

							if (!(edgesA.contains(edgeA) && edgesB
									.contains(edgeB))) {
								continue;
							}

							final NodePairInfo nodepair = new NodePairInfo(
									edgeA.fromNode, edgeB.fromNode);
							if (checkedNodepairs.contains(nodepair)) {
								continue;
							}

							if (edgeA.connectedWith(edgeB)) {
								continue;
							}

							final Slicing slicing = new Slicing(pathA, pathB,
									edgeA.fromNode, edgeB.fromNode,
									mappingPDGNodeToPDGNodes,
									mappingPDGEdgeToPDGEdges, checkedNodepairs);
							final ClonePairInfo clonepair = slicing.perform();
							if (this.SIZE_THRESHOLD <= clonepair.size()) {
								clonepairs.add(clonepair);
							}
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.err
						.println("ERROR: failed to detect clones between the method "
								+ pdgA.unit.name
								+ " in "
								+ pathA
								+ " and the method"
								+ pdgB.unit.name
								+ " in "
								+ pathB);
			}
		}

		for (int index = SINGLEINDEX.getAndIncrement(); index < this.pdgs.length; index = SINGLEINDEX
				.getAndIncrement()) {

			final PDG pdg = this.pdgs[index];
			final String path = pdg.unit.path;

			try {

				final SortedMap<PDGNode<?>, Integer> mappingPDGNodeToHash = this.mapPDGToPDGNodes
						.get(pdg);
				final SortedMap<Integer, List<PDGNode<?>>> mappingHashToPDGNodes = new TreeMap<Integer, List<PDGNode<?>>>();
				this.registerNodes(mappingHashToPDGNodes, mappingPDGNodeToHash);
				final SortedMap<PDGNode<?>, PDGNode<?>[]> mappingPDGNodeToPDGNodes = new TreeMap<PDGNode<?>, PDGNode<?>[]>();
				for (final List<PDGNode<?>> list : mappingHashToPDGNodes
						.values()) {
					if (1 < list.size()) {
						final PDGNode<?>[] nodes = list
								.toArray(new PDGNode<?>[0]);
						for (final PDGNode<?> node : nodes) {
							mappingPDGNodeToPDGNodes.put(node, nodes);
						}
					}
				}

				final SortedMap<PDGEdge, Integer> mappingPDGEdgeToHash = this.mapPDGToPDGEdges
						.get(pdg);
				final SortedMap<Integer, List<PDGEdge>> mappingHashToPDGEdges = new TreeMap<Integer, List<PDGEdge>>();
				this.registerEdges(mappingHashToPDGEdges, mappingPDGEdgeToHash);
				final SortedMap<PDGEdge, PDGEdge[]> mappingPDGEdgeToPDGEdges = new TreeMap<PDGEdge, PDGEdge[]>();
				for (final List<PDGEdge> list : mappingHashToPDGEdges.values()) {
					if (1 < list.size()) {
						final PDGEdge[] edges = list.toArray(new PDGEdge[0]);
						for (final PDGEdge edge : edges) {
							mappingPDGEdgeToPDGEdges.put(edge, edges);
						}
					}
				}

				final SortedSet<PDGEdge[]> sortedPDGEdges = new TreeSet<PDGEdge[]>(
						new PDGEdgesComparator());
				for (final List<PDGEdge> list : mappingHashToPDGEdges.values()) {
					if (1 < list.size()) {
						final PDGEdge[] edges = list.toArray(new PDGEdge[0]);
						sortedPDGEdges.add(edges);
					}
				}

				final SortedSet<NodePairInfo> checkedNodepairs = new TreeSet<NodePairInfo>();
				for (final PDGEdge[] edges : sortedPDGEdges) {
					for (int x = 0; x < edges.length; x++) {
						for (int y = x + 1; y < edges.length; y++) {

							final PDGEdge edgeA = edges[x];
							final PDGEdge edgeB = edges[y];

							final NodePairInfo nodepair = new NodePairInfo(
									edgeA.fromNode, edgeB.fromNode);
							if (checkedNodepairs.contains(nodepair)) {
								continue;
							}

							if (edgeA.connectedWith(edgeB)) {
								continue;
							}

							final Slicing slicing = new Slicing(path, path,
									edgeA.fromNode, edgeB.fromNode,
									mappingPDGNodeToPDGNodes,
									mappingPDGEdgeToPDGEdges, checkedNodepairs);
							final ClonePairInfo clonepair = slicing.perform();
							if (this.SIZE_THRESHOLD <= clonepair.size()) {
								clonepairs.add(clonepair);
							}
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.err
						.println("ERROR: failed to detect clones in the method "
								+ pdg.unit.name + " in " + path);
			}
		}

		{
			final ClonePairInfo[] pairs = clonepairs
					.toArray(new ClonePairInfo[0]);
			for (int i = 0; i < pairs.length; i++) {
				for (int j = i + 1; j < pairs.length; j++) {
					if (this.sameOnOkValue(pairs[i], pairs[j], 0.7f)) {
						if (pairs[i].size() <= pairs[j].size()) {
							clonepairs.remove(pairs[i]);
						}
					}
				}
			}
		}

		this.clonepairs.addAll(clonepairs);
	}

	private void registerNodes(
			final SortedMap<Integer, List<PDGNode<?>>> mappingHashToPDGNodes,
			final SortedMap<PDGNode<?>, Integer> mappingPDGNodeToHash) {

		assert null != mappingHashToPDGNodes : "\"mappingHashToPDGNodes\" is null.";
		assert null != mappingPDGNodeToHash : "\"mappingPDGNodeToHash\" is null.";

		for (final Entry<PDGNode<?>, Integer> entry : mappingPDGNodeToHash
				.entrySet()) {
			final Integer hash = entry.getValue();
			final PDGNode<?> node = entry.getKey();
			List<PDGNode<?>> nodes = mappingHashToPDGNodes.get(hash);
			if (null == nodes) {
				nodes = new ArrayList<PDGNode<?>>();
				mappingHashToPDGNodes.put(hash, nodes);
			}
			nodes.add(node);
		}
	}

	private void registerEdges(
			final SortedMap<Integer, List<PDGEdge>> mappingHashToPDGEdges,
			final SortedMap<PDGEdge, Integer> mappingPDGEdgeToHash) {

		assert null != mappingHashToPDGEdges : "\"mappingHashToPDGEdges\" is null.";
		assert null != mappingPDGEdgeToHash : "\"mappingPDGEdgeToHash\" is null.";

		for (final Entry<PDGEdge, Integer> entry : mappingPDGEdgeToHash
				.entrySet()) {
			final Integer hash = entry.getValue();
			final PDGEdge edge = entry.getKey();
			List<PDGEdge> edges = mappingHashToPDGEdges.get(hash);
			if (null == edges) {
				edges = new ArrayList<PDGEdge>();
				mappingHashToPDGEdges.put(hash, edges);
			}
			edges.add(edge);
		}
	}

	private boolean sameOnGoodValue(final ClonePairInfo pair1,
			final ClonePairInfo pair2, final float threshold) {

		final SortedSet<PDGNode<?>> nodes1A = pair1.getLeftNodes();
		final SortedSet<PDGNode<?>> nodes2A = pair2.getLeftNodes();
		final SortedSet<PDGNode<?>> intersectionA = new TreeSet<PDGNode<?>>();
		intersectionA.addAll(nodes1A);
		intersectionA.retainAll(nodes2A);
		final SortedSet<PDGNode<?>> unionA = new TreeSet<PDGNode<?>>();
		unionA.addAll(nodes1A);
		unionA.addAll(nodes2A);

		final SortedSet<PDGNode<?>> nodes1B = pair1.getRightNodes();
		final SortedSet<PDGNode<?>> nodes2B = pair2.getRightNodes();
		final SortedSet<PDGNode<?>> intersectionB = new TreeSet<PDGNode<?>>();
		intersectionB.addAll(nodes1B);
		intersectionB.retainAll(nodes2B);
		final SortedSet<PDGNode<?>> unionB = new TreeSet<PDGNode<?>>();
		unionB.addAll(nodes1B);
		unionB.addAll(nodes2B);

		final float good = Math.min((float) intersectionA.size()
				/ (float) unionA.size(), (float) intersectionB.size()
				/ (float) unionB.size());

		return threshold <= good;
	}

	private boolean sameOnOkValue(final ClonePairInfo pair1,
			final ClonePairInfo pair2, final float threshold) {

		final SortedSet<PDGNode<?>> edges1A = pair1.getLeftNodes();
		final SortedSet<PDGNode<?>> edges2A = pair2.getLeftNodes();
		final SortedSet<PDGNode<?>> intersectionA = new TreeSet<PDGNode<?>>();
		intersectionA.addAll(edges1A);
		intersectionA.retainAll(edges2A);

		final SortedSet<PDGNode<?>> edges1B = pair1.getRightNodes();
		final SortedSet<PDGNode<?>> edges2B = pair2.getRightNodes();
		final SortedSet<PDGNode<?>> intersectionB = new TreeSet<PDGNode<?>>();
		intersectionB.addAll(edges1B);
		intersectionB.retainAll(edges2B);

		final float ok = Math.min(Math.max((float) intersectionA.size()
				/ (float) edges1A.size(), (float) intersectionA.size()
				/ (float) edges2A.size()), Math.max(
				(float) intersectionB.size() / (float) edges1B.size(),
				(float) intersectionB.size() / (float) edges2B.size()));

		return threshold <= ok;
	}

	class PDGEdgesComparator implements Comparator<PDGEdge[]> {

		@Override
		public int compare(final PDGEdge[] o1, final PDGEdge[] o2) {

			if (o1.length < o2.length) {
				return -1;
			} else if (o1.length > o2.length) {
				return 1;
			} else {
				return o1[0].compareTo(o2[0]);
			}
		}

	}
}
