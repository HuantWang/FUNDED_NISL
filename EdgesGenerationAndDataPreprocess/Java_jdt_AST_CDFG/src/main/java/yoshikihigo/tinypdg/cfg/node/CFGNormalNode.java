package yoshikihigo.tinypdg.cfg.node;

import yoshikihigo.tinypdg.pe.ProgramElementInfo;

public class CFGNormalNode<T extends ProgramElementInfo> extends CFGNode<T> {

	public CFGNormalNode(final T element) {
		super(element);
	}
}
