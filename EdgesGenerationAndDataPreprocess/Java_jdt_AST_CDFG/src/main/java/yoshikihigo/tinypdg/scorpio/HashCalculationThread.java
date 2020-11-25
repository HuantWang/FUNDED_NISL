package yoshikihigo.tinypdg.scorpio;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

import yoshikihigo.tinypdg.pdg.PDG;
import yoshikihigo.tinypdg.pdg.edge.PDGEdge;
import yoshikihigo.tinypdg.pdg.node.PDGNode;

public class HashCalculationThread implements Runnable {

	final static private AtomicInteger INDEX = new AtomicInteger(0);

	final private PDG[] pdgs;
	final private SortedMap<PDG, SortedMap<PDGNode<?>, Integer>> mappingPDGToPDGNodes;
	final private SortedMap<PDG, SortedMap<PDGEdge, Integer>> mappingPDGToPDGEdges;

	public HashCalculationThread(
			final PDG[] pdgs,
			final SortedMap<PDG, SortedMap<PDGNode<?>, Integer>> mappingPDGToPDGNodes,
			final SortedMap<PDG, SortedMap<PDGEdge, Integer>> mappingPDGToPDGEdges) {

		assert null != pdgs : "\"pdgs\" is null.";
		assert null != mappingPDGToPDGNodes : "\"mappingPDGToPDGNodes\" is null.";
		assert null != mappingPDGToPDGEdges : "\"mappingPDGToPDGEdges\" is null.";

		this.pdgs = pdgs;
		this.mappingPDGToPDGNodes = mappingPDGToPDGNodes;
		this.mappingPDGToPDGEdges = mappingPDGToPDGEdges;
	}

	@Override
	public void run() {

		for (int index = INDEX.getAndIncrement(); index < this.pdgs.length; index = INDEX
				.getAndIncrement()) {

			final PDG pdg = this.pdgs[index];

			try {

				final SortedMap<PDGNode<?>, Integer> mappingPDGNodeToHash = new TreeMap<PDGNode<?>, Integer>();
				for (final PDGNode<?> node : pdg.getAllNodes()) {

					final NormalizedText t1 = new NormalizedText(node.core);
					final String t2 = NormalizedText.normalize(t1.getText());
					final int hash = t2.hashCode();

					mappingPDGNodeToHash.put(node, hash);
				}
				this.mappingPDGToPDGNodes.put(pdg, mappingPDGNodeToHash);

				final SortedMap<PDGEdge, Integer> mappingPDGEdgeToHash = new TreeMap<PDGEdge, Integer>();
				for (final PDGEdge edge : pdg.getAllEdges()) {

					final NormalizedText t1 = new NormalizedText(
							edge.fromNode.core);
					final String fromNodeText = NormalizedText.normalize(t1
							.getText());
					final NormalizedText t2 = new NormalizedText(
							edge.toNode.core);
					final String toNodeText = NormalizedText.normalize(t2
							.getText());
					final StringBuilder edgeText = new StringBuilder();
					edgeText.append(fromNodeText);
					edgeText.append("-");
					edgeText.append(edge.type.toString());
					edgeText.append("->");
					edgeText.append(toNodeText);
					final int hash = edgeText.toString().hashCode();

					mappingPDGEdgeToHash.put(edge, hash);
				}
				this.mappingPDGToPDGEdges.put(pdg, mappingPDGEdgeToHash);

			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR: failed to process the method "
						+ pdg.unit.name + " in " + pdg.unit.path);
			}
		}
	}
}
