package cdfg.cfg.node;

import cdfg.pe.StatementInfo;

public class CFGBreakStatementNode extends CFGJumpStatementNode {

	public CFGBreakStatementNode(final StatementInfo breakStatement) {
		super(breakStatement);
	}
}
