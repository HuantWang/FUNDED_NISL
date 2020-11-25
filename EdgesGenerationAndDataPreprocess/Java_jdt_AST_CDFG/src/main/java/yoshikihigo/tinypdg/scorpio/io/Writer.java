package yoshikihigo.tinypdg.scorpio.io;

import java.util.SortedSet;

import yoshikihigo.tinypdg.scorpio.data.ClonePairInfo;

abstract public class Writer {

	final protected String path;
	final protected SortedSet<ClonePairInfo> clonepairs;

	protected Writer(final String path,
			final SortedSet<ClonePairInfo> clonepairs) {
		this.path = path;
		this.clonepairs = clonepairs;
	}

	abstract public void write();
}
