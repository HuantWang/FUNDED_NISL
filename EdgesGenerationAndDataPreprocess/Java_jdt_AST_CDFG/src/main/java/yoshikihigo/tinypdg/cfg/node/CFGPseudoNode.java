package yoshikihigo.tinypdg.cfg.node;

import yoshikihigo.tinypdg.cfg.node.CFGPseudoNode.PseudoElement;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;

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
