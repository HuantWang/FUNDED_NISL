package yoshikihigo.tinypdg.cfg.node;

import yoshikihigo.tinypdg.pe.StatementInfo;

public class CFGContinueStatementNode extends CFGJumpStatementNode {

	public CFGContinueStatementNode(final StatementInfo continueStatement) {
		super(continueStatement);
	}
}
