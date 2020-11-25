package yoshikihigo.tinypdg.cfg.node;

import yoshikihigo.tinypdg.pe.StatementInfo;

public class CFGBreakStatementNode extends CFGJumpStatementNode {

	public CFGBreakStatementNode(final StatementInfo breakStatement) {
		super(breakStatement);
	}
}
