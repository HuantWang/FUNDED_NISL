package cdfg.pdg.node;

import cdfg.pe.ProgramElementInfo;

public abstract class PDGNormalNode<T extends ProgramElementInfo> extends
		PDGNode<T> {

	protected PDGNormalNode(final T element) {
		super(element);
	}
}
