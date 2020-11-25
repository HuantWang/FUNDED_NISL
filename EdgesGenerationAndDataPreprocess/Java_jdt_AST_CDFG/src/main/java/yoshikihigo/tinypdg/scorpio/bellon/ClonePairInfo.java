package yoshikihigo.tinypdg.scorpio.bellon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ClonePairInfo {

	final CodeFragmentInfo left;
	final CodeFragmentInfo right;
	final int type;

	ClonePairInfo(final CodeFragmentInfo left, final CodeFragmentInfo right,
			final int type) {
		this.left = left;
		this.right = right;
		this.type = type;
	}

	ClonePairInfo(final CodeFragmentInfo left, final CodeFragmentInfo right) {
		this(left, right, 0);
	}

	int size() {
		return Math.min(this.left.size(), this.right.size());
	}
	
	@Override
	public String toString(){
		final StringBuilder text = new StringBuilder();
		text.append(this.left.toString());
		text.append("\t");
		text.append(this.right.toString());
		return text.toString();
}

	static public List<ClonePairInfo> getClonepairs(final File file,
			final int minimum, final boolean oracle) {

		final List<ClonePairInfo> clonepairs = new ArrayList<ClonePairInfo>();

		try {
			final BufferedReader reader = new BufferedReader(new FileReader(
					file));
			while (reader.ready()) {
				final String line = reader.readLine();
				final ClonePairInfo pair = ClonePairInfo.getClonepair(line,
						oracle);
				if (minimum <= pair.size()) {
					clonepairs.add(pair);
				}
			}

			reader.close();

		} catch (final Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		return clonepairs;
	}

	static private ClonePairInfo getClonepair(final String line,
			final boolean oracle) {

		final StringTokenizer lineTokenizer = new StringTokenizer(line, "\t");
		final String leftPath = lineTokenizer.nextToken();
		final String leftStartLine = lineTokenizer.nextToken();
		final String leftEndLine = lineTokenizer.nextToken();
		final String rightPath = lineTokenizer.nextToken();
		final String rightStartLine = lineTokenizer.nextToken();
		final String rightEndLine = lineTokenizer.nextToken();
		final int type;
		if (oracle) {
			type = Integer.parseInt(lineTokenizer.nextToken());
		} else {
			type = 0;
		}
		final String leftGaps = lineTokenizer.nextToken();
		final String rightGaps = lineTokenizer.nextToken();

		final CodeFragmentInfo leftFragment = new CodeFragmentInfo(leftPath,
				Integer.parseInt(leftStartLine), Integer.parseInt(leftEndLine));
		final CodeFragmentInfo rightFragment = new CodeFragmentInfo(rightPath,
				Integer.parseInt(rightStartLine),
				Integer.parseInt(rightEndLine));

		if (!leftGaps.equals("-")) {
			final StringTokenizer gapTokenizer = new StringTokenizer(leftGaps,
					", ");
			while (gapTokenizer.hasMoreTokens()) {
				final String gap = gapTokenizer.nextToken();
				leftFragment.remove(Integer.parseInt(gap));
			}
		}

		if (!rightGaps.equals("-")) {
			final StringTokenizer gapTokenizer = new StringTokenizer(rightGaps,
					", ");
			while (gapTokenizer.hasMoreTokens()) {
				final String gap = gapTokenizer.nextToken();
				rightFragment.remove(Integer.parseInt(gap));
			}
		}

		return new ClonePairInfo(leftFragment, rightFragment, type);
	}
}
