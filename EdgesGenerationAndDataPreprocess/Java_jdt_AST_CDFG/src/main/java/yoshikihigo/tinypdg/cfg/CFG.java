package yoshikihigo.tinypdg.cfg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import yoshikihigo.tinypdg.cfg.edge.CFGControlEdge;
import yoshikihigo.tinypdg.cfg.edge.CFGEdge;
import yoshikihigo.tinypdg.cfg.node.CFGBreakStatementNode;
import yoshikihigo.tinypdg.cfg.node.CFGContinueStatementNode;
import yoshikihigo.tinypdg.cfg.node.CFGJumpStatementNode;
import yoshikihigo.tinypdg.cfg.node.CFGNode;
import yoshikihigo.tinypdg.cfg.node.CFGNodeFactory;
import yoshikihigo.tinypdg.cfg.node.CFGPseudoNode;
import yoshikihigo.tinypdg.cfg.node.CFGSwitchCaseNode;
import yoshikihigo.tinypdg.pe.BlockInfo;
import yoshikihigo.tinypdg.pe.ExpressionInfo;
import yoshikihigo.tinypdg.pe.MethodInfo;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.pe.StatementInfo;

public class CFG {

	final public ProgramElementInfo core;

	final private CFGNodeFactory nodeFactory;

	final protected SortedSet<CFGNode<? extends ProgramElementInfo>> nodes;

	protected CFGNode<? extends ProgramElementInfo> enterNode;

	final protected Set<CFGNode<? extends ProgramElementInfo>> exitNodes;

	final protected LinkedList<CFGBreakStatementNode> unhandledBreakStatementNodes;

	final protected LinkedList<CFGContinueStatementNode> unhandledContinueStatementNodes;

	protected boolean built;

	public CFG(final ProgramElementInfo core, final CFGNodeFactory nodeFactory) {
		assert null != nodeFactory : "\"nodeFactory\" is null.";
		this.core = core;
		this.nodeFactory = nodeFactory;
		this.nodes = new TreeSet<CFGNode<? extends ProgramElementInfo>>();
		this.enterNode = null;
		this.exitNodes = new TreeSet<CFGNode<? extends ProgramElementInfo>>();
		this.built = false;

		this.unhandledBreakStatementNodes = new LinkedList<CFGBreakStatementNode>();
		this.unhandledContinueStatementNodes = new LinkedList<CFGContinueStatementNode>();
	}

	public boolean isEmpty() {
		return 0 == this.nodes.size();
	}

	public CFGNode<? extends ProgramElementInfo> getEnterNode() {
		return this.enterNode;
	}

	public SortedSet<CFGNode<? extends ProgramElementInfo>> getExitNodes() {
		final SortedSet<CFGNode<? extends ProgramElementInfo>> nodes = new TreeSet<CFGNode<? extends ProgramElementInfo>>();
		nodes.addAll(this.exitNodes);
		return nodes;
	}

	public SortedSet<CFGNode<? extends ProgramElementInfo>> getAllNodes() {
		final SortedSet<CFGNode<? extends ProgramElementInfo>> nodes = new TreeSet<CFGNode<? extends ProgramElementInfo>>();
		nodes.addAll(this.nodes);
		return nodes;
	}

	public void removeSwitchCases() {
		final Iterator<CFGNode<? extends ProgramElementInfo>> iterator = this.nodes
				.iterator();
		while (iterator.hasNext()) {
			final CFGNode<? extends ProgramElementInfo> node = iterator.next();
			if (node instanceof CFGSwitchCaseNode) {

				for (final CFGEdge edge : node.getBackwardEdges()) {
					final CFGNode<?> fromNode = edge.fromNode;

					for (final CFGNode<?> toNode : node.getForwardNodes()) {
						final CFGEdge newEdge;
						if (edge instanceof CFGControlEdge) {
							newEdge = CFGEdge.makeEdge(fromNode, toNode,
									((CFGControlEdge) edge).control);
						} else {
							newEdge = CFGEdge.makeEdge(fromNode, toNode);
						}
						fromNode.addForwardEdge(newEdge);
						toNode.addBackwardEdge(newEdge);
					}
				}

				node.remove();
				iterator.remove();
			}
		}
	}

	public void removeJumpStatements() {
		final Iterator<CFGNode<? extends ProgramElementInfo>> iterator = this.nodes
				.iterator();
		while (iterator.hasNext()) {
			final CFGNode<? extends ProgramElementInfo> node = iterator.next();
			if (node instanceof CFGJumpStatementNode) {

				for (final CFGNode<?> fromNode : node.getBackwardNodes()) {
					for (final CFGNode<?> toNode : node.getForwardNodes()) {

						final CFGEdge newEdge = CFGEdge.makeJumpEdge(fromNode,
								toNode);
						fromNode.addForwardEdge(newEdge);
						toNode.addBackwardEdge(newEdge);
					}
				}

				node.remove();
				iterator.remove();
			}
		}
	}

	public void build() {

		assert !this.built : "this CFG has already built.";
		this.built = true;

		if (null == this.core) {
			final CFGNode<? extends ProgramElementInfo> node = nodeFactory
					.makeNormalNode(null);
			this.nodes.add(node);
			this.enterNode = node;
			this.exitNodes.add(node);
		}

		else if (this.core instanceof StatementInfo) {
			final StatementInfo coreStatement = (StatementInfo) this.core;
			switch (coreStatement.getCategory()) {
			case Catch:
				this.buildConditionalBlockCFG(coreStatement, false);
				break;
			case Do:
				this.buildDoBlockCFG(coreStatement);
				break;
			case For:
				this.buildForBlockCFG(coreStatement);
				break;
			case Foreach:
				this.buildConditionalBlockCFG(coreStatement, true);
				break;
			case If:
				this.buildIfBlockCFG(coreStatement);
				break;
			case Switch:
				this.buildSwitchBlockCFG(coreStatement);
				break;
			case Synchronized:
				this.buildConditionalBlockCFG(coreStatement, false);
				break;
			case TypeDeclaration:
				break;
			case Try:
				this.buildTryBlockCFG(coreStatement);
				break;
			case While:
				this.buildConditionalBlockCFG(coreStatement, true);
				break;
			default:
				final CFGNode<? extends ProgramElementInfo> node = this.nodeFactory
						.makeNormalNode(coreStatement);
				this.enterNode = node;
				if (StatementInfo.CATEGORY.Break == coreStatement.getCategory()) {
					this.unhandledBreakStatementNodes
							.addFirst((CFGBreakStatementNode) node);
				} else if (StatementInfo.CATEGORY.Continue == coreStatement
						.getCategory()) {
					this.unhandledContinueStatementNodes
							.addFirst((CFGContinueStatementNode) node);
				} else {
					this.exitNodes.add(node);
				}
				this.nodes.add(node);
				break;
			}
		}

		else if (this.core instanceof ExpressionInfo) {
			final ProgramElementInfo coreExpression = (ProgramElementInfo) this.core;
			final CFGNode<? extends ProgramElementInfo> node = this.nodeFactory
					.makeNormalNode(coreExpression);
			this.enterNode = node;
			this.exitNodes.add(node);
			this.nodes.add(node);
		}

		else if (this.core instanceof MethodInfo) {
			final MethodInfo coreMethod = (MethodInfo) this.core;
			this.buildSimpleBlockCFG(coreMethod);
		}

		else {
			assert false : "unexpected state.";
		}

		if (null != this.core) {
			this.removePseudoNodes();
		}
	}

	private void buildDoBlockCFG(final StatementInfo statement) {

		final SequentialCFGs sequentialCFGs = new SequentialCFGs(
				statement.getStatements());
		sequentialCFGs.build();
		final ProgramElementInfo condition = statement.getCondition();
		final CFGNode<? extends ProgramElementInfo> conditionNode = this.nodeFactory
				.makeControlNode(condition);

		this.enterNode = sequentialCFGs.enterNode;
		this.nodes.addAll(sequentialCFGs.nodes);
		this.nodes.add(conditionNode);
		this.exitNodes.add(conditionNode);
		this.unhandledBreakStatementNodes
				.addAll(sequentialCFGs.unhandledBreakStatementNodes);
		this.unhandledContinueStatementNodes
				.addAll(sequentialCFGs.unhandledContinueStatementNodes);

		for (final CFGNode<?> exitNode : sequentialCFGs.exitNodes) {
			final CFGEdge edge = CFGEdge.makeEdge(exitNode, conditionNode);
			exitNode.addForwardEdge(edge);
			conditionNode.addBackwardEdge(edge);
		}
		final CFGEdge edge = CFGEdge.makeEdge(conditionNode,
				sequentialCFGs.enterNode, true);
		conditionNode.addForwardEdge(edge);
		sequentialCFGs.enterNode.addBackwardEdge(edge);

		this.connectCFGBreakStatementNode(statement);
		this.connectCFGContinueStatementNode(statement, this.enterNode);
	}

	private void buildForBlockCFG(final StatementInfo statement) {

		final SequentialCFGs sequentialCFGs = new SequentialCFGs(
				statement.getStatements());
		sequentialCFGs.build();

		final List<ProgramElementInfo> initializers = statement
				.getInitializers();
		final ProgramElementInfo condition = statement.getCondition();
		final List<ProgramElementInfo> updaters = statement.getUpdaters();

		final SequentialCFGs initializerCFGs = new SequentialCFGs(initializers);
		initializerCFGs.build();
		final CFGNode<? extends ProgramElementInfo> conditionNode = this.nodeFactory
				.makeControlNode(condition);
		final SequentialCFGs updaterCFGs = new SequentialCFGs(updaters);
		updaterCFGs.build();

		this.enterNode = initializerCFGs.enterNode;
		this.exitNodes.add(conditionNode);
		this.nodes.addAll(sequentialCFGs.nodes);
		this.nodes.addAll(initializerCFGs.nodes);
		this.nodes.add(conditionNode);
		this.nodes.addAll(updaterCFGs.nodes);
		this.unhandledBreakStatementNodes
				.addAll(sequentialCFGs.unhandledBreakStatementNodes);
		this.unhandledContinueStatementNodes
				.addAll(sequentialCFGs.unhandledContinueStatementNodes);

		for (final CFGNode<? extends ProgramElementInfo> initializerExitNode : initializerCFGs.exitNodes) {
			final CFGEdge edge = CFGEdge.makeEdge(initializerExitNode,
					conditionNode);
			initializerExitNode.addForwardEdge(edge);
			conditionNode.addBackwardEdge(edge);
		}
		{
			final CFGEdge controlEdge = CFGEdge.makeEdge(conditionNode,
					sequentialCFGs.enterNode, true);
			conditionNode.addForwardEdge(controlEdge);
			sequentialCFGs.enterNode.addBackwardEdge(controlEdge);
		}

		for (final CFGNode<? extends ProgramElementInfo> sequentialExitNode : sequentialCFGs.exitNodes) {
			final CFGEdge edge = CFGEdge.makeEdge(sequentialExitNode,
					updaterCFGs.enterNode);
			sequentialExitNode.addForwardEdge(edge);
			updaterCFGs.enterNode.addBackwardEdge(edge);
		}

		for (final CFGNode<? extends ProgramElementInfo> updaterExitNode : updaterCFGs.exitNodes) {
			final CFGEdge edge = CFGEdge.makeEdge(updaterExitNode,
					conditionNode);
			updaterExitNode.addForwardEdge(edge);
			conditionNode.addBackwardEdge(edge);
		}

		this.connectCFGBreakStatementNode(statement);
		this.connectCFGContinueStatementNode(statement, conditionNode);
	}

	private void buildConditionalBlockCFG(final StatementInfo statement,
			final boolean loop) {

		final List<StatementInfo> substatements = statement.getStatements();
		final SequentialCFGs sequentialCFGs = new SequentialCFGs(substatements);
		sequentialCFGs.build();
		final ProgramElementInfo condition = statement.getCondition();
		final CFGNode<? extends ProgramElementInfo> conditionNode = this.nodeFactory
				.makeControlNode(condition);

		this.enterNode = conditionNode;
		this.nodes.addAll(sequentialCFGs.nodes);
		this.nodes.add(conditionNode);
		if (loop) {
			this.exitNodes.add(conditionNode);
		} else {
			this.exitNodes.addAll(sequentialCFGs.exitNodes);
			if (0 == substatements.size()) {
				this.exitNodes.add(conditionNode);
			}
		}
		this.unhandledBreakStatementNodes
				.addAll(sequentialCFGs.unhandledBreakStatementNodes);
		this.unhandledContinueStatementNodes
				.addAll(sequentialCFGs.unhandledContinueStatementNodes);

		{
			final CFGEdge edge = CFGEdge.makeEdge(conditionNode,
					sequentialCFGs.enterNode, true);
			conditionNode.addForwardEdge(edge);
			sequentialCFGs.enterNode.addBackwardEdge(edge);
		}

		if (loop) {
			for (final CFGNode<?> exitNode : sequentialCFGs.exitNodes) {
				if (exitNode instanceof CFGBreakStatementNode) {
					this.exitNodes.add(exitNode);
				} else {
					final CFGEdge edge = CFGEdge.makeEdge(exitNode,
							conditionNode);
					exitNode.addForwardEdge(edge);
					conditionNode.addBackwardEdge(edge);
				}
			}

			this.connectCFGBreakStatementNode(statement);
			this.connectCFGContinueStatementNode(statement, conditionNode);
		}
	}

	private void buildIfBlockCFG(final StatementInfo statement) {

		this.buildConditionalBlockCFG(statement, false);

		final ProgramElementInfo condition = statement.getCondition();
		final CFGNode<? extends ProgramElementInfo> conditionNode = this.nodeFactory
				.makeControlNode(condition);

		if (null != statement.getElseStatements()) {
			final List<StatementInfo> elseStatements = statement
					.getElseStatements();
			final SequentialCFGs elseCFG = new SequentialCFGs(elseStatements);
			elseCFG.build();

			this.nodes.addAll(elseCFG.nodes);
			this.exitNodes.addAll(elseCFG.exitNodes);
			if (0 == elseStatements.size()) {
				this.exitNodes.add(conditionNode);
			}

			{
				final CFGEdge edge = CFGEdge.makeEdge(conditionNode,
						elseCFG.enterNode, false);
				conditionNode.addForwardEdge(edge);
				elseCFG.enterNode.addBackwardEdge(edge);
			}
			this.unhandledBreakStatementNodes
					.addAll(elseCFG.unhandledBreakStatementNodes);
			this.unhandledContinueStatementNodes
					.addAll(elseCFG.unhandledContinueStatementNodes);
		}

		else {
			this.exitNodes.add(conditionNode);
		}
	}

	private void buildSimpleBlockCFG(final BlockInfo statement) {
		final List<StatementInfo> substatements = statement.getStatements();
		final SequentialCFGs sequentialCFGs = new SequentialCFGs(substatements);
		sequentialCFGs.build();

		this.enterNode = sequentialCFGs.enterNode;
		this.exitNodes.addAll(sequentialCFGs.exitNodes);
		this.nodes.addAll(sequentialCFGs.nodes);
		this.unhandledBreakStatementNodes
				.addAll(sequentialCFGs.unhandledBreakStatementNodes);
		this.unhandledContinueStatementNodes
				.addAll(sequentialCFGs.unhandledContinueStatementNodes);
	}

	private void buildSwitchBlockCFG(final StatementInfo statement) {

		final ProgramElementInfo condition = statement.getCondition();
		final CFGNode<? extends ProgramElementInfo> conditionNode = this.nodeFactory
				.makeControlNode(condition);
		this.enterNode = conditionNode;
		this.nodes.add(conditionNode);

		final List<StatementInfo> substatements = statement.getStatements();
		final List<CFG> sequentialCFGs = new ArrayList<CFG>();
		for (final StatementInfo substatement : substatements) {
			final CFG subCFG = new CFG(substatement, this.nodeFactory);
			subCFG.build();
			sequentialCFGs.add(subCFG);
			this.nodes.addAll(subCFG.nodes);
			this.unhandledBreakStatementNodes
					.addAll(subCFG.unhandledBreakStatementNodes);
			this.unhandledContinueStatementNodes
					.addAll(subCFG.unhandledContinueStatementNodes);

			switch (substatement.getCategory()) {
			case Case: {
				final CFGEdge edge = CFGEdge.makeEdge(conditionNode,
						subCFG.enterNode, true);
				conditionNode.addForwardEdge(edge);
				subCFG.enterNode.addBackwardEdge(edge);
				break;
			}
			case Break:
			case Continue: {
				this.exitNodes.addAll(subCFG.exitNodes);
				break;
			}
			default:
			}
		}

		CFG: for (int index = 1; index < sequentialCFGs.size(); index++) {
			final CFG anteriorCFG = sequentialCFGs.get(index - 1);
			final CFG posteriorCFG = sequentialCFGs.get(index);

			final ProgramElementInfo anteriorCore = anteriorCFG.core;
			if (anteriorCore instanceof StatementInfo) {
				switch (((StatementInfo) anteriorCore).getCategory()) {
				case Break:
				case Continue:
					continue CFG;
				default:
				}
			}

			for (final CFGNode<? extends ProgramElementInfo> anteriorExitNode : anteriorCFG.exitNodes) {
				final CFGEdge edge = CFGEdge.makeEdge(anteriorExitNode,
						posteriorCFG.enterNode);
				anteriorExitNode.addForwardEdge(edge);
				posteriorCFG.enterNode.addBackwardEdge(edge);
			}
		}

		this.exitNodes
				.addAll(sequentialCFGs.get(sequentialCFGs.size() - 1).exitNodes);

		this.connectCFGBreakStatementNode(statement);
	}

	private void buildTryBlockCFG(final StatementInfo statement) {

		final List<StatementInfo> statements = statement.getStatements();
		final SequentialCFGs sequentialCFGs = new SequentialCFGs(statements);
		sequentialCFGs.build();

		final StatementInfo finallyBlock = statement.getFinallyStatement();
		final CFG finallyCFG = new CFG(finallyBlock, this.nodeFactory);
		finallyCFG.build();

		this.enterNode = sequentialCFGs.enterNode;
		this.nodes.addAll(sequentialCFGs.nodes);
		this.nodes.addAll(finallyCFG.exitNodes);
		this.exitNodes.addAll(finallyCFG.exitNodes);
		this.unhandledBreakStatementNodes
				.addAll(sequentialCFGs.unhandledBreakStatementNodes);
		this.unhandledContinueStatementNodes
				.addAll(sequentialCFGs.unhandledContinueStatementNodes);

		for (final CFGNode<? extends ProgramElementInfo> sequentialExitNode : sequentialCFGs.exitNodes) {
			final CFGEdge edge = CFGEdge.makeEdge(sequentialExitNode,
					finallyCFG.enterNode);
			sequentialExitNode.addForwardEdge(edge);
			finallyCFG.enterNode.addBackwardEdge(edge);
		}

		for (final StatementInfo catchStatement : statement
				.getCatchStatements()) {

			final CFG catchCFG = new CFG(catchStatement, this.nodeFactory);
			catchCFG.build();

			this.nodes.addAll(catchCFG.nodes);
			for (final CFGNode<? extends ProgramElementInfo> catchExitNode : catchCFG.exitNodes) {
				final CFGEdge edge = CFGEdge.makeEdge(catchExitNode,
						finallyCFG.enterNode);
				catchExitNode.addForwardEdge(edge);
				finallyCFG.enterNode.addBackwardEdge(edge);
			}
		}
	}

	private void removePseudoNodes() {

		final Iterator<CFGNode<? extends ProgramElementInfo>> iterator = this.nodes
				.iterator();
		while (iterator.hasNext()) {

			final CFGNode<? extends ProgramElementInfo> node = iterator.next();
			if (node instanceof CFGPseudoNode) {

				iterator.remove();

				if (0 == node.compareTo(this.enterNode)) {
					if (0 < this.enterNode.getForwardEdges().size()) {
						this.enterNode = this.enterNode.getForwardNodes()
								.first();
					} else {
						this.enterNode = null;
					}
				}

				if (this.exitNodes.contains(node)) {
					this.exitNodes.addAll(node.getBackwardNodes());
					this.exitNodes.remove(node);
				}

				final SortedSet<CFGNode<? extends ProgramElementInfo>> backwardNodes = node
						.getBackwardNodes();
				final SortedSet<CFGNode<? extends ProgramElementInfo>> forwardNodes = node
						.getForwardNodes();
				for (final CFGNode<? extends ProgramElementInfo> backwardNode : backwardNodes) {
					backwardNode.removeForwardNode(node);
				}
				for (final CFGNode<? extends ProgramElementInfo> forwardNode : forwardNodes) {
					forwardNode.removeBackwardNode(node);
				}
				for (final CFGNode<? extends ProgramElementInfo> backwardNode : backwardNodes) {
					for (final CFGNode<? extends ProgramElementInfo> forwardNode : forwardNodes) {
						final CFGEdge edge = CFGEdge.makeEdge(backwardNode,
								forwardNode);
						backwardNode.addForwardEdge(edge);
						forwardNode.addBackwardEdge(edge);
					}
				}
			}
		}
	}

	private void connectCFGBreakStatementNode(final StatementInfo statement) {

		final Iterator<CFGBreakStatementNode> iterator = this.unhandledBreakStatementNodes
				.iterator();
		while (iterator.hasNext()) {
			final CFGBreakStatementNode node = iterator.next();
			final StatementInfo breakStatement = (StatementInfo) node.core;
			final String label = breakStatement.getJumpToLabel();

			if (null == label) {
				this.exitNodes.add(node);
				iterator.remove();
			}

			else {

				if (label.equals(statement.getLabel())) {
					this.exitNodes.add(node);
					iterator.remove();
				}
			}
		}
	}

	private void connectCFGContinueStatementNode(final StatementInfo statement,
			final CFGNode<? extends ProgramElementInfo> distinationNode) {

		final Iterator<CFGContinueStatementNode> iterator = this.unhandledContinueStatementNodes
				.iterator();
		while (iterator.hasNext()) {
			final CFGContinueStatementNode node = iterator.next();
			final StatementInfo continueStatement = (StatementInfo) node.core;
			final String label = continueStatement.getJumpToLabel();

			if (null == label) {
				final CFGEdge edge = CFGEdge.makeEdge(node, distinationNode);
				node.addForwardEdge(edge);
				distinationNode.addBackwardEdge(edge);
				iterator.remove();
			}

			else {

				if (label.equals(statement.getLabel())) {
					final CFGEdge edge = CFGEdge
							.makeEdge(node, distinationNode);
					node.addForwardEdge(edge);
					distinationNode.addBackwardEdge(edge);
					iterator.remove();
				}
			}
		}

	}

	private class SequentialCFGs extends CFG {

		final List<? extends ProgramElementInfo> elements;

		SequentialCFGs(final List<? extends ProgramElementInfo> elements) {

			super(null, CFG.this.nodeFactory);
			this.elements = elements;
		}

		@Override
		public void build() {

			assert !this.built : "this CFG has already built.";
			this.built = true;

			final LinkedList<CFG> sequencialCFGs = new LinkedList<CFG>();
			for (final ProgramElementInfo element : this.elements) {
				final CFG blockCFG = new CFG(element, CFG.this.nodeFactory);
				blockCFG.build();
				if (!blockCFG.isEmpty()) {
					sequencialCFGs.add(blockCFG);
				}
			}
			for (int index = 1; index < sequencialCFGs.size(); index++) {
				final CFG anteriorCFG = sequencialCFGs.get(index - 1);
				final CFG posteriorCFG = sequencialCFGs.get(index);
				for (final CFGNode<?> exitNode : anteriorCFG.exitNodes) {
					final CFGEdge edge = CFGEdge.makeEdge(exitNode,
							posteriorCFG.enterNode);
					exitNode.addForwardEdge(edge);
					posteriorCFG.enterNode.addBackwardEdge(edge);
				}
			}
			if (0 == sequencialCFGs.size()) {
				final CFG pseudoCFG = new CFG(null, CFG.this.nodeFactory);
				pseudoCFG.build();
				sequencialCFGs.add(pseudoCFG);
			}

			this.enterNode = sequencialCFGs.getFirst().enterNode;
			this.exitNodes.addAll(sequencialCFGs.getLast().exitNodes);
			for (final CFG cfg : sequencialCFGs) {
				this.nodes.addAll(cfg.nodes);
				this.unhandledBreakStatementNodes
						.addAll(cfg.unhandledBreakStatementNodes);
				this.unhandledContinueStatementNodes
						.addAll(cfg.unhandledContinueStatementNodes);
			}
		}
	}

	public final SortedSet<CFGNode<? extends ProgramElementInfo>> getReachableNodes(
			final CFGNode<? extends ProgramElementInfo> startNode) {
		assert null != startNode : "\"startNode\" is null.";
		final SortedSet<CFGNode<? extends ProgramElementInfo>> nodes = new TreeSet<CFGNode<? extends ProgramElementInfo>>();
		this.getReachableNodes(startNode, nodes);
		return nodes;
	}

	private final void getReachableNodes(
			final CFGNode<? extends ProgramElementInfo> startNode,
			final SortedSet<CFGNode<? extends ProgramElementInfo>> nodes) {
		assert null != startNode : "\"startNode\" is null.";
		assert null != nodes : "\"nodes\" is null.";

		if (nodes.contains(startNode)) {
			return;
		}

		nodes.add(startNode);
		for (final CFGNode<? extends ProgramElementInfo> node : startNode
				.getForwardNodes()) {
			this.getReachableNodes(node, nodes);
		}
	}
}
