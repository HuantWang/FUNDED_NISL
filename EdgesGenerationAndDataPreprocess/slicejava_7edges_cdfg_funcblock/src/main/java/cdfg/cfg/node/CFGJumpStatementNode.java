package cdfg.cfg.node;

import cdfg.pe.StatementInfo;

abstract public class CFGJumpStatementNode extends CFGStatementNode {

	CFGJumpStatementNode(final StatementInfo jumpStatement) {
		super(jumpStatement);
	}
}
