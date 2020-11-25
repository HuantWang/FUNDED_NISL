package yoshikihigo.tinypdg.pdg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import yoshikihigo.tinypdg.cfg.CFG;
import yoshikihigo.tinypdg.cfg.edge.CFGEdge;
import yoshikihigo.tinypdg.cfg.node.CFGNode;
import yoshikihigo.tinypdg.cfg.node.CFGNodeFactory;
import yoshikihigo.tinypdg.pdg.edge.PDGControlDependenceEdge;
import yoshikihigo.tinypdg.pdg.edge.PDGDataDependenceEdge;
import yoshikihigo.tinypdg.pdg.edge.PDGEdge;
import yoshikihigo.tinypdg.pdg.edge.PDGExecutionDependenceEdge;
import yoshikihigo.tinypdg.pdg.node.PDGControlNode;
import yoshikihigo.tinypdg.pdg.node.PDGMethodEnterNode;
import yoshikihigo.tinypdg.pdg.node.PDGNode;
import yoshikihigo.tinypdg.pdg.node.PDGNodeFactory;
import yoshikihigo.tinypdg.pdg.node.PDGParameterNode;
import yoshikihigo.tinypdg.pe.BlockInfo;
import yoshikihigo.tinypdg.pe.MethodInfo;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.pe.StatementInfo;
import yoshikihigo.tinypdg.pe.VariableInfo;

public class PDG implements Comparable<PDG> {

	final private PDGNodeFactory pdgNodeFactory;
	final private CFGNodeFactory cfgNodeFactory;

	final public PDGMethodEnterNode enterNode;
	final private SortedSet<PDGNode<?>> exitNodes;
	final private List<PDGParameterNode> parameterNodes;

	final public MethodInfo unit;

	final public boolean buildControlDependence;
	final public boolean buildDataDependence;
	final public boolean buildExecutionDependence;

	final public int controlDependencyDistance;
	final public int dataDependencyDistance;
	final public int executionDependencyDistance;

	private CFG cfg;

	public PDG(final MethodInfo unit, final PDGNodeFactory pdgNodeFactory,
			final CFGNodeFactory cfgNodeFactory,
			final boolean buildControlDependence,
			final boolean buildDataDependence,
			final boolean buildExecutionDependence,
			final int controlDependencyDistance,
			final int dataDependencyDistance,
			final int executionDependencyDistance) {

		assert null != unit : "\"unit\" is null";
		assert null != pdgNodeFactory : "\"pdgNodeFactory\" is null";
		assert null != cfgNodeFactory : "\"cfgNodeFactory\" is null";

		this.unit = unit;
		this.pdgNodeFactory = pdgNodeFactory;
		this.cfgNodeFactory = cfgNodeFactory;

		this.enterNode = (PDGMethodEnterNode) this.pdgNodeFactory
				.makeControlNode(unit);
		this.exitNodes = new TreeSet<PDGNode<?>>();
		this.parameterNodes = new ArrayList<PDGParameterNode>();
		for (final VariableInfo variable : unit.getParameters()) {
			final PDGParameterNode parameterNode = (PDGParameterNode) this.pdgNodeFactory
					.makeNormalNode(variable);
			this.parameterNodes.add(parameterNode);
		}

		this.buildControlDependence = buildControlDependence;
		this.buildDataDependence = buildDataDependence;
		this.buildExecutionDependence = buildExecutionDependence;

		this.controlDependencyDistance = controlDependencyDistance;
		this.dataDependencyDistance = dataDependencyDistance;
		this.executionDependencyDistance = executionDependencyDistance;
	}

	public PDG(final MethodInfo unit, final PDGNodeFactory pdgNodeFactory,
			final CFGNodeFactory cfgNodeFactory,
			final boolean buildControlDependency,
			final boolean buildDataDependency,
			final boolean buildExecutionDependency) {

		this(unit, pdgNodeFactory, cfgNodeFactory, buildControlDependency,
				buildDataDependency, buildExecutionDependency,
				Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	public PDG(final MethodInfo unit, final PDGNodeFactory pdgNodeFactory,
			final CFGNodeFactory cfgNodeFactory) {
		this(unit, pdgNodeFactory, cfgNodeFactory, true, true, true);
	}

	public PDG(final MethodInfo unit) {
		this(unit, new PDGNodeFactory(), new CFGNodeFactory());
	}

	public PDG(final MethodInfo unit, final boolean buildControlDependency,
			final boolean buildDataDependencey,
			final boolean buildExecutionDependency) {
		this(unit, new PDGNodeFactory(), new CFGNodeFactory(),
				buildControlDependency, buildDataDependencey,
				buildExecutionDependency);
	}

	@Override
	public int compareTo(final PDG o) {
		assert null != o : "\"o\" is null.";
		return this.unit.compareTo(o.unit);
	}

	public final SortedSet<PDGNode<?>> getExitNodes() {
		final SortedSet<PDGNode<?>> nodes = new TreeSet<PDGNode<?>>();
		nodes.addAll(this.exitNodes);
		return nodes;
	}

	public final List<PDGParameterNode> getParameterNodes() {
		final List<PDGParameterNode> parameters = new ArrayList<PDGParameterNode>();
		parameters.addAll(this.parameterNodes);
		return parameters;
	}

	public final SortedSet<PDGNode<?>> getAllNodes() {
		final SortedSet<PDGNode<?>> nodes = new TreeSet<PDGNode<?>>();
		this.getAllNodes(this.enterNode, nodes);
		return nodes;
	}

	private void getAllNodes(final PDGNode<?> node,
			final SortedSet<PDGNode<?>> nodes) {

		assert null != node : "\"node\" is null.";
		assert null != nodes : "\"nodes\" is null.";

		if (nodes.contains(node)) {
			return;
		}

		nodes.add(node);
		for (final PDGEdge edge : node.getBackwardEdges()) {
			this.getAllNodes(edge.fromNode, nodes);
		}
		for (final PDGEdge edge : node.getForwardEdges()) {
			this.getAllNodes(edge.toNode, nodes);
		}
	}

	public final SortedSet<PDGEdge> getAllEdges() {
		final SortedSet<PDGEdge> edges = new TreeSet<PDGEdge>();
//		for (final PDGEdge edge : this.enterNode.getForwardEdges()) {
//			this.getAllEdges(edge, edges);
//		}
		
		final SortedSet<PDGNode<?>> nodes = this.getAllNodes();
		for (final PDGNode<?> node : nodes) {
			edges.addAll(node.getForwardEdges());
			edges.addAll(node.getBackwardEdges());
		}
		
		return edges;
	}

	private void getAllEdges(final PDGEdge edge, final SortedSet<PDGEdge> edges) {

		assert null != edge : "\"edge\" is null.";
		assert null != edges : "\"edges\" is null.";

		if (edges.contains(edge)) {
			return;
		}

		edges.add(edge);
		for (final PDGEdge backwardEdge : edge.fromNode.getBackwardEdges()) {
			this.getAllEdges(backwardEdge, edges);
		}
		for (final PDGEdge forwardEdge : edge.fromNode.getForwardEdges()) {
			this.getAllEdges(forwardEdge, edges);
		}
		for (final PDGEdge backwardEdge : edge.toNode.getBackwardEdges()) {
			this.getAllEdges(backwardEdge, edges);
		}
		for (final PDGEdge forwardEdge : edge.toNode.getForwardEdges()) {
			this.getAllEdges(forwardEdge, edges);
		}
	}

	public void build() {

		this.cfg = new CFG(this.unit, this.cfgNodeFactory);
		this.cfg.build();
		this.cfg.removeSwitchCases();
		this.cfg.removeJumpStatements();

		if (this.buildControlDependence) {
			this.buildControlDependence(this.enterNode, unit);
			for (final PDGParameterNode parameterNode : this.parameterNodes) {
				final PDGControlDependenceEdge edge = new PDGControlDependenceEdge(
						this.enterNode, parameterNode, true);
				this.enterNode.addForwardEdge(edge);
				parameterNode.addBackwardEdge(edge);
			}
		}

		if (this.buildExecutionDependence) {
			if (!this.cfg.isEmpty()) {
				final PDGNode<?> node = this.pdgNodeFactory.makeNode(this.cfg
						.getEnterNode());
				final PDGExecutionDependenceEdge edge = new PDGExecutionDependenceEdge(
						this.enterNode, node);
				this.enterNode.addForwardEdge(edge);
				node.addBackwardEdge(edge);
			}
		}

		if (this.buildDataDependence) {
			for (final PDGParameterNode parameterNode : this.parameterNodes) {
				if (!this.cfg.isEmpty()) {
					this.buildDataDependence(this.cfg.getEnterNode(),
							parameterNode, parameterNode.core.name,
							new HashSet<CFGNode<?>>());
				}
			}
		}

		final Set<CFGNode<?>> checkedNodes = new HashSet<CFGNode<?>>();
		if (!this.cfg.isEmpty()) {
			this.buildDependence(this.cfg.getEnterNode(), checkedNodes);
		}

		for (final CFGNode<?> cfgExitNode : this.cfg.getExitNodes()) {
			final PDGNode<?> pdgExitNode = this.pdgNodeFactory
					.makeNode(cfgExitNode);
			this.exitNodes.add(pdgExitNode);
		}

		if (!this.cfg.isEmpty()) {
			final Set<CFGNode<?>> unreachableNodes = new HashSet<CFGNode<?>>();
			unreachableNodes.addAll(this.cfg.getAllNodes());
			unreachableNodes.removeAll(this.cfg.getReachableNodes(this.cfg
					.getEnterNode()));
			for (final CFGNode<?> unreachableNode : unreachableNodes) {
				this.buildDependence(unreachableNode, checkedNodes);
			}
		}
	}

	private void buildDependence(final CFGNode<?> cfgNode,
			final Set<CFGNode<?>> checkedNodes) {

		assert null != cfgNode : "\"cfgNode\" is null.";
		assert null != checkedNodes : "\"checkedNodes\" is null.";

		if (checkedNodes.contains(cfgNode)) {
			return;
		} else {
			checkedNodes.add(cfgNode);
		}

		final PDGNode<?> pdgNode = this.pdgNodeFactory.makeNode(cfgNode);
		if (this.buildDataDependence) {
			for (final String variable : pdgNode.core.getAssignedVariables()) {
				for (final CFGEdge edge : cfgNode.getForwardEdges()) {
					final Set<CFGNode<?>> checkedNodesForDefinedVariables = new HashSet<CFGNode<?>>();
					this.buildDataDependence(edge.toNode, pdgNode, variable,
							checkedNodesForDefinedVariables);
				}
			}
		}
		if (this.buildControlDependence) {
			if (pdgNode instanceof PDGControlNode) {
				final ProgramElementInfo condition = ((PDGControlNode) pdgNode).core;
				this.buildControlDependence((PDGControlNode) pdgNode,
						condition.getOwnerConditionalBlock());
			}
		}

		if (this.buildExecutionDependence) {
			for (final CFGNode<?> toCFGNode : cfgNode.getForwardNodes()) {
				final PDGNode<?> toPDGNode = this.pdgNodeFactory
						.makeNode(toCFGNode);
				final int distance = Math.abs(toPDGNode.core.startLine
						- pdgNode.core.startLine) + 1;
				if (distance <= this.executionDependencyDistance) {
					final PDGExecutionDependenceEdge edge = new PDGExecutionDependenceEdge(
							pdgNode, toPDGNode);
					pdgNode.addForwardEdge(edge);
					toPDGNode.addBackwardEdge(edge);
				}

			}
		}

		for (final CFGNode<?> forwardNode : cfgNode.getForwardNodes()) {
			this.buildDependence(forwardNode, checkedNodes);
		}
	}

	private void buildDataDependence(final CFGNode<?> cfgNode,
			final PDGNode<?> fromPDGNode, final String variable,
			final Set<CFGNode<?>> checkedCFGNodes) {

		assert null != cfgNode : "\"cfgNode\" is null.";
		assert null != fromPDGNode : "\"fromPDGNode\" is null.";
		assert null != variable : "\"variable\" is null.";
		assert null != checkedCFGNodes : "\"checkedCFGnodes\" is null.";

		if (checkedCFGNodes.contains(cfgNode)) {
			return;
		} else {
			checkedCFGNodes.add(cfgNode);
		}

		if (cfgNode.core.getReferencedVariables().contains(variable)) {

			final PDGNode<?> toPDGNode = this.pdgNodeFactory.makeNode(cfgNode);
			final int distance = Math.abs(toPDGNode.core.startLine
					- fromPDGNode.core.startLine) + 1;
			if (distance <= this.dataDependencyDistance) {
				final PDGDataDependenceEdge edge = new PDGDataDependenceEdge(
						fromPDGNode, toPDGNode, variable);
				fromPDGNode.addForwardEdge(edge);
				toPDGNode.addBackwardEdge(edge);
			}
		}

		if (cfgNode.core.getAssignedVariables().contains(variable)) {
			return;
		}

		for (final CFGNode<?> forwardNode : cfgNode.getForwardNodes()) {
			this.buildDataDependence(forwardNode, fromPDGNode, variable,
					checkedCFGNodes);
		}
	}

	private void buildControlDependence(final PDGControlNode fromPDGNode,
			final BlockInfo block) {

		for (final StatementInfo statement : block.getStatements()) {
			this.buildControlDependence(fromPDGNode, statement, true);
		}

		if (block instanceof StatementInfo) {
			for (final StatementInfo statement : ((StatementInfo) block)
					.getElseStatements()) {
				this.buildControlDependence(fromPDGNode, statement, false);
			}

			for (final ProgramElementInfo updater : ((StatementInfo) block)
					.getUpdaters()) {
				final PDGNode<?> toPDGNode = this.pdgNodeFactory
						.makeNormalNode(updater);
				final PDGControlDependenceEdge edge = new PDGControlDependenceEdge(
						fromPDGNode, toPDGNode, true);
				fromPDGNode.addForwardEdge(edge);
				toPDGNode.addBackwardEdge(edge);
			}
		}
	}

	private void buildControlDependence(final PDGControlNode fromPDGNode,
			final StatementInfo statement, final boolean type) {

		switch (statement.getCategory()) {
		case Catch:
		case Do:
		case For:
		case Foreach:
		case If:
		case SimpleBlock:
		case Synchronized:
		case Switch:
		case Try:
		case While: {
			final ProgramElementInfo condition = statement.getCondition();
			if (null != condition) {
				final PDGNode<?> toPDGNode = this.pdgNodeFactory
						.makeControlNode(condition);
				final PDGControlDependenceEdge edge = new PDGControlDependenceEdge(
						fromPDGNode, toPDGNode, type);
				fromPDGNode.addForwardEdge(edge);
				toPDGNode.addBackwardEdge(edge);
			} else {
				this.buildControlDependence(fromPDGNode, statement);
			}

			for (final ProgramElementInfo initializer : statement
					.getInitializers()) {
				final PDGNode<?> toPDGNode = this.pdgNodeFactory
						.makeNormalNode(initializer);
				final PDGControlDependenceEdge edge = new PDGControlDependenceEdge(
						fromPDGNode, toPDGNode, type);
				fromPDGNode.addForwardEdge(edge);
				toPDGNode.addBackwardEdge(edge);
			}
			break;
		}
		case Assert:
		case Break:
		case Case:
		case Continue:
		case Expression:
		case Return:
		case Throw:
		case VariableDeclaration: {
			final CFGNode<?> cfgNode = this.cfgNodeFactory.getNode(statement);
			if ((null != cfgNode) && (this.cfg.getAllNodes().contains(cfgNode))) {

				final PDGNode<?> toPDGNode = this.pdgNodeFactory
						.makeNormalNode(statement);
				final PDGControlDependenceEdge edge = new PDGControlDependenceEdge(
						fromPDGNode, toPDGNode, type);
				fromPDGNode.addForwardEdge(edge);
				toPDGNode.addBackwardEdge(edge);
			}
			break;
		}
		default:
		}
	}
}
