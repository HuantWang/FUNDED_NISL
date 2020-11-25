package yoshikihigo.tinypdg.scorpio.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SortedSet;

import yoshikihigo.tinypdg.pdg.node.PDGNode;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.scorpio.data.ClonePairInfo;
import yoshikihigo.tinypdg.scorpio.data.NodePairInfo;
import yoshikihigo.tinypdg.scorpio.pdg.PDGMergedNode;

public class CSVNodeWriter extends Writer {

	public CSVNodeWriter(final String path,
			final SortedSet<ClonePairInfo> clonepairs) {
		super(path, clonepairs);
	}

	@Override
	public void write() {

		try {

			final BufferedWriter writer = new BufferedWriter(new FileWriter(
					this.path));

			int identifier = 0;
			for (final ClonePairInfo clonepair : this.clonepairs) {
				writer.write(Integer.toString(identifier++));
				writer.write(", ");
				writer.write(clonepair.pathA);
				writer.write(", ");
				writer.write(clonepair.pathB);
				writer.newLine();

				for (final NodePairInfo nodepair : clonepair.getNodePairs()) {
					final String pairText = this.generateNodePairText(nodepair);
					writer.write(pairText);
					writer.newLine();
				}
			}

			writer.close();

		} catch (final IOException e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	private String generateNodePairText(final NodePairInfo nodepair) {
		final StringBuilder text = new StringBuilder();
		text.append(",");
		text.append(this.generateNodeText(nodepair.nodeA));
		text.append(",");
		text.append(this.generateNodeText(nodepair.nodeB));
		return text.toString();
	}

	private String generateNodeText(final PDGNode<?> node) {

		final StringBuilder text = new StringBuilder();
		if (node instanceof PDGMergedNode) {
			for (final PDGNode<?> originalNode : ((PDGMergedNode) node)
					.getOriginalNodes()) {
				text.append(this.generateProgramElementText(originalNode.core));
				text.append(":");
			}
			text.deleteCharAt(text.length() - 1);
		} else {
			text.append(this.generateProgramElementText(node.core));
		}
		return text.toString();
	}

	private String generateProgramElementText(final ProgramElementInfo element) {

		final StringBuilder text = new StringBuilder();
		if (element.startLine == element.endLine) {
			text.append(Integer.toString(element.startLine));
		} else {
			text.append(Integer.toString(element.startLine));
			text.append("-");
			text.append(Integer.toString(element.endLine));
		}
		return text.toString();
	}
}
