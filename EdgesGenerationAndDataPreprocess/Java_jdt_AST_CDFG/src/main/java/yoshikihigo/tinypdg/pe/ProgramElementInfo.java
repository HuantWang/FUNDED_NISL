package yoshikihigo.tinypdg.pe;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

abstract public class ProgramElementInfo implements
		Comparable<ProgramElementInfo> {

	final static private AtomicInteger ID_GENERATOR = new AtomicInteger(0);

	final public int startLine;
	final public int endLine;
	final public int id;
	private String text;

	final private List<String> modifiers;

	protected BlockInfo ownerConditionalBlock;

	public ProgramElementInfo(final int startLine, final int endLine) {
		this.startLine = startLine;
		this.endLine = endLine;
		this.id = ID_GENERATOR.getAndIncrement();
		this.text = "";

		this.modifiers = new ArrayList<String>();

		this.ownerConditionalBlock = null;
	}

	@Override
	final public int hashCode() {
		return this.id;
	}

	@Override
	final public boolean equals(final Object o) {

		if (!(o instanceof ProgramElementInfo)) {
			return false;
		}

		final ProgramElementInfo target = (ProgramElementInfo) o;
		return this.id == target.id;
	}

	final public String getText() {
		return this.text;
	}

	final public void setText(final String text) {
		assert null != text : "\"text\" is null.";
		this.text = text;
	}

	@Override
	final public int compareTo(final ProgramElementInfo element) {
		assert null != element : "\"element\" is null.";
		if (this.id < element.id) {
			return -1;
		} else if (this.id > element.id) {
			return 1;
		} else {
			return 0;
		}
	}

	final public void addModifier(final String modifier) {
		assert null != modifier : "\"modifier\" is null.";
		this.modifiers.add(modifier);
	}

	final public List<String> getModifiers() {
		final List<String> modifiers = new ArrayList<String>();
		modifiers.addAll(this.modifiers);
		return modifiers;
	}

	public SortedSet<String> getAssignedVariables() {
		return new TreeSet<String>();
	}

	public SortedSet<String> getReferencedVariables() {
		return new TreeSet<String>();
	}

	public void setOwnerConditinalBlock(final BlockInfo ownerConditionalBlock) {
		assert null != ownerConditionalBlock : "\"ownerConditionalBlock\" is null.";
		this.ownerConditionalBlock = ownerConditionalBlock;
	}

	public BlockInfo getOwnerConditionalBlock() {
		return this.ownerConditionalBlock;
	}
}
