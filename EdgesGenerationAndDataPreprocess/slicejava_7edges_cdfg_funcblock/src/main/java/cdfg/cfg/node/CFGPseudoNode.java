package cdfg.cfg.node;

import cdfg.pe.ProgramElementInfo;
import cdfg.cfg.node.CFGPseudoNode.PseudoElement;

public class CFGPseudoNode extends CFGNode<PseudoElement> {

	public static class PseudoElement extends ProgramElementInfo {
		PseudoElement() {
			super(0, 0);
		}
	}

	public CFGPseudoNode() {
		super(new PseudoElement());
	}
}
