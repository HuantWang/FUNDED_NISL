package yoshikihigo.tinypdg.scorpio.data;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import yoshikihigo.tinypdg.pdg.node.PDGMethodEnterNode;
import yoshikihigo.tinypdg.pdg.node.PDGNode;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.scorpio.pdg.PDGMergedNode;

public class CodeFragmentInfo implements Comparable<CodeFragmentInfo> {

	final private SortedSet<ProgramElementInfo> elements;

	public CodeFragmentInfo() {
		this.elements = new TreeSet<ProgramElementInfo>();
	}

	public CodeFragmentInfo(final PDGNode<?> node) {
		this();
		assert null != node : "\"node\" is null.";
		if (node instanceof PDGMergedNode) {
			for (final PDGNode<?> originalNode : ((PDGMergedNode) node)
					.getOriginalNodes()) {
				this.addElement(originalNode.core);
			}
		}

		else if (node instanceof PDGMethodEnterNode) {
		}

		else {
			this.addElement(node.core);
		}
	}

	public void addElement(final ProgramElementInfo element) {
		assert null != element : "\"element\" is null.";
		this.elements.add(element);
	}

	public void merge(final CodeFragmentInfo codefragment) {
		assert null != codefragment : "\"codefragment\" is null.";
		this.elements.addAll(codefragment.elements);
	}

	public SortedSet<ProgramElementInfo> getElements() {
		final SortedSet<ProgramElementInfo> e = new TreeSet<ProgramElementInfo>();
		e.addAll(this.elements);
		return e;
	}

	public int size() {
		return this.elements.size();
	}

	public boolean conflict(final CodeFragmentInfo codefragment) {
		assert null != codefragment : "\"codefragment\" is null.";
		for (final ProgramElementInfo element : this.elements) {
			if (codefragment.elements.contains(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(final CodeFragmentInfo o) {
		assert null != o : "\"o\" is null.";
		final Iterator<ProgramElementInfo> iterator1 = this.elements.iterator();
		final Iterator<ProgramElementInfo> iterator2 = o.elements.iterator();

		while (true) {

			if (!iterator1.hasNext() && !iterator2.hasNext()) {
				return 0;
			}

			else if (!iterator1.hasNext()) {
				return -1;
			}

			else if (!iterator2.hasNext()) {
				return 1;
			}

			final ProgramElementInfo element1 = iterator1.next();
			final ProgramElementInfo element2 = iterator2.next();
			final int elementOrder = element1.compareTo(element2);
			if (0 != elementOrder) {
				return elementOrder;
			}
		}
	}
}
