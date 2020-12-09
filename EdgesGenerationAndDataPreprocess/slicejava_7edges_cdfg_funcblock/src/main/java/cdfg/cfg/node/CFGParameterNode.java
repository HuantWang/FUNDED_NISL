package cdfg.cfg.node;

import cdfg.pe.VariableInfo;

public class CFGParameterNode extends CFGNode<VariableInfo> {

	private CFGParameterNode(final VariableInfo variable) {
		super(variable);
	}
}
