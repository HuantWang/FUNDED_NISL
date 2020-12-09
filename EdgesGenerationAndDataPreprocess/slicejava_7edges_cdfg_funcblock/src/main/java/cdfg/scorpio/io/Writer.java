package cdfg.scorpio.io;

import cdfg.scorpio.data.ClonePairInfo;

import java.util.SortedSet;

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
