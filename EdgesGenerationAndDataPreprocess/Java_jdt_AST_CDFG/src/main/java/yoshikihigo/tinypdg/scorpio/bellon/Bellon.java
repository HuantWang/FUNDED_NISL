package yoshikihigo.tinypdg.scorpio.bellon;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Bellon {

	final float threshold;
	final String oracle;
	final String detectionResult;

	public static void main(final String[] args) {

		if (4 != args.length) {
			System.err.println("the number of command opetions must be four.");
			System.err
					.println("the first one is a threshold for matching with oracle.");
			System.err.println("the second one is minimum length of clones.");
			System.err.println("the thrid one is file of oracle.");
			System.err.println("the fourth one is file of detection result.");
			System.exit(0);
		}

		final float threshold = Float.parseFloat(args[0]);
		final int minimum = Integer.parseInt(args[1]);
		final String oracle = args[2];
		final String detectionResult = args[3];
		final Bellon bellon = new Bellon(threshold, oracle, detectionResult);

		final List<ClonePairInfo> references = ClonePairInfo.getClonepairs(
				new File(oracle), minimum, true);
		final List<ClonePairInfo> candidates = ClonePairInfo.getClonepairs(
				new File(detectionResult), minimum, false);

		final Set<ClonePairInfo> okReferences = bellon.getOKDetectedReferences(
				candidates, references);
		final Set<ClonePairInfo> goodReferences = bellon
				.getGoodDetectedReferences(candidates, references);

		final Set<ClonePairInfo> okCandidates = bellon.getOKDetectedReferences(
				references, candidates);
		final Set<ClonePairInfo> goodCandidates = bellon
				.getGoodDetectedReferences(references, candidates);

		final int numberOfOKContiguousReferences = bellon
				.getNumberOfContiguousClone(okReferences);
		final int numberOfOKNoncontiguousReferences = bellon
				.getNumberOfNoncontiguousClone(okReferences);
		final int numberOfGOODContiguousReferences = bellon
				.getNumberOfContiguousClone(goodReferences);
		final int numberOfGOODNoncontiguousReferences = bellon
				.getNumberOfNoncontiguousClone(goodReferences);

		final int numberOfOKReferences = okReferences.size();
		final int numberOfGOODReferences = goodReferences.size();

		final int numberOfOKCandidates = okCandidates.size();
		final int numberOfGOODCandidates = goodCandidates.size();

		System.out.print("\"detected configuous references with OK\"");
		System.out.print(", ");
		System.out.print("\"detected non-configuous references with OK\"");
		System.out.print(", ");
		System.out.print("\"detected configuous references with GOOD\"");
		System.out.print(", ");
		System.out.print("\"detected non-configuous references with GOOD\"");
		System.out.print(", ");
		System.out.print("\"ok recall\"");
		System.out.print(", ");
		System.out.print("\"good recall\"");
		System.out.print(", ");
		System.out.print("\"ok precision\"");
		System.out.print(", ");
		System.out.println("\"good precision\"");

		System.out.print(Integer.toString(numberOfOKContiguousReferences));
		System.out.print(", ");
		System.out.print(Integer.toString(numberOfOKNoncontiguousReferences));
		System.out.print(", ");
		System.out.print(Integer.toString(numberOfGOODContiguousReferences));
		System.out.print(", ");
		System.out.print(Integer.toString(numberOfGOODNoncontiguousReferences));
		System.out.print(", ");

		System.out.print(Float.toString((float) numberOfOKReferences
				/ (float) references.size()));
		System.out.print(", ");
		System.out.print(Float.toString((float) numberOfGOODReferences
				/ (float) references.size()));
		System.out.print(", ");
		System.out.print(Float.toString((float) numberOfOKCandidates
				/ (float) candidates.size()));
		System.out.print(", ");
		System.out.println(Float.toString((float) numberOfGOODCandidates
				/ (float) candidates.size()));
	}

	Bellon(final float threshold, final String oracle,
			final String detectionResult) {
		this.threshold = threshold;
		this.oracle = oracle;
		this.detectionResult = detectionResult;
	}

	private boolean isOKClone(final ClonePairInfo candidate,
			final List<ClonePairInfo> references) {

		for (final ClonePairInfo reference : references) {

			if (candidate.left.path.equals(reference.left.path)
					&& candidate.right.path.equals(reference.right.path)) {

				final SortedSet<Integer> leftIntersection = new TreeSet<Integer>();
				leftIntersection.addAll(candidate.left);
				leftIntersection.retainAll(reference.left);

				final SortedSet<Integer> rightIntersection = new TreeSet<Integer>();
				rightIntersection.addAll(candidate.right);
				rightIntersection.retainAll(reference.right);

				final float ok = Math.min(Math.max(
						(float) leftIntersection.size()
								/ (float) candidate.left.size(),
						(float) leftIntersection.size()
								/ (float) reference.left.size()), Math.max(
						(float) rightIntersection.size()
								/ (float) candidate.right.size(),
						(float) rightIntersection.size()
								/ (float) reference.right.size()));

				if (this.threshold <= ok) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean isGoodClone(final ClonePairInfo candidate,
			final List<ClonePairInfo> references) {

		for (final ClonePairInfo reference : references) {

			if (candidate.left.path.equals(reference.left.path)
					&& candidate.right.path.equals(reference.right.path)) {

				final SortedSet<Integer> leftIntersection = new TreeSet<Integer>();
				leftIntersection.addAll(candidate.left);
				leftIntersection.retainAll(reference.left);

				final SortedSet<Integer> leftUnion = new TreeSet<Integer>();
				leftUnion.addAll(candidate.left);
				leftUnion.addAll(reference.left);

				final SortedSet<Integer> rightIntersection = new TreeSet<Integer>();
				rightIntersection.addAll(candidate.right);
				rightIntersection.retainAll(reference.right);

				final SortedSet<Integer> rightUnion = new TreeSet<Integer>();
				rightUnion.addAll(candidate.right);
				rightUnion.addAll(reference.right);

				final float good = Math.min(
						(float) leftIntersection.size()
								/ (float) leftUnion.size(),
						(float) rightIntersection.size()
								/ (float) rightUnion.size());

				if (this.threshold <= good) {
					return true;
				}
			}
		}

		return false;
	}

	private Set<ClonePairInfo> getOKDetectedReferences(
			final List<ClonePairInfo> candidates,
			final List<ClonePairInfo> references) {

		final Set<ClonePairInfo> detectedReferences = new HashSet<ClonePairInfo>();
		for (final ClonePairInfo reference : references) {
			if (this.isOKClone(reference, candidates)) {
				detectedReferences.add(reference);
			}
		}
		return detectedReferences;
	}

	private Set<ClonePairInfo> getGoodDetectedReferences(
			final List<ClonePairInfo> candidates,
			final List<ClonePairInfo> references) {

		final Set<ClonePairInfo> detectedReferences = new HashSet<ClonePairInfo>();
		for (final ClonePairInfo reference : references) {
			if (this.isGoodClone(reference, candidates)) {
				detectedReferences.add(reference);
			}
		}
		return detectedReferences;
	}

	private int getNumberOfContiguousClone(final Set<ClonePairInfo> pairs) {
		int number = 0;
		for (final ClonePairInfo pair : pairs) {
			if ((1 == pair.type) || (2 == pair.type)) {
				number++;
			}
		}
		return number;
	}

	private int getNumberOfNoncontiguousClone(final Set<ClonePairInfo> pairs) {
		int number = 0;
		for (final ClonePairInfo pair : pairs) {
			if (3 == pair.type) {
				number++;
			}
		}
		return number;
	}
}
