package yoshikihigo.tinypdg.cfg.node;

import yoshikihigo.tinypdg.pe.VariableInfo;

public class CFGParameterNode extends CFGNode<VariableInfo> {

	private CFGParameterNode(final VariableInfo variable) {
		super(variable);
	}
}
