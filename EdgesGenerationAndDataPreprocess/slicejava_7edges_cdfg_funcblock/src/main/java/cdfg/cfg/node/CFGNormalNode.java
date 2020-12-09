package cdfg.cfg.node;

import cdfg.pe.ProgramElementInfo;

public class CFGNormalNode<T extends ProgramElementInfo> extends CFGNode<T> {

	public CFGNormalNode(final T element) {
		super(element);
	}
}
