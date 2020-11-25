package yoshikihigo.tinypdg.cfg.node;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import yoshikihigo.tinypdg.pe.ExpressionInfo;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.pe.StatementInfo;

public class CFGNodeFactory {

	private final ConcurrentMap<ProgramElementInfo, CFGNode<? extends ProgramElementInfo>> elementToNodeMap;

	public CFGNodeFactory() {
		this.elementToNodeMap = new ConcurrentHashMap<ProgramElementInfo, CFGNode<? extends ProgramElementInfo>>();
	}

	public synchronized CFGNode<? extends ProgramElementInfo> makeNormalNode(
			final ProgramElementInfo element) {

		if (null == element) {
			return new CFGPseudoNode();
		}

		CFGNormalNode<?> node = (CFGNormalNode<?>) this.elementToNodeMap
				.get(element);
		if (null == node) {
			if (element instanceof StatementInfo) {
				switch (((StatementInfo) element).getCategory()) {
				case Break:
					node = new CFGBreakStatementNode((StatementInfo) element);
					break;
				case Continue:
					node = new CFGContinueStatementNode((StatementInfo) element);
					break;
				case Case:
					node = new CFGSwitchCaseNode((StatementInfo) element);
					break;
				default:
					node = new CFGStatementNode((StatementInfo) element);
					break;
				}
				this.elementToNodeMap.put(element, node);
			}

			else if (element instanceof ExpressionInfo) {
				node = new CFGExpressionNode((ExpressionInfo) element);
			}

			else {
				assert false : "\"element\" must be StatementInfo.";
				return null;
			}
		}

		return node;
	}

	public synchronized CFGNode<? extends ProgramElementInfo> makeControlNode(
			final ProgramElementInfo expression) {

		if (null == expression) {
			return new CFGPseudoNode();
		}

		CFGControlNode node = (CFGControlNode) this.elementToNodeMap
				.get(expression);
		if (null == node) {
			node = new CFGControlNode(expression);
			this.elementToNodeMap.put(expression, node);
		}
		return node;
	}

	public CFGNode<? extends ProgramElementInfo> getNode(
			final ProgramElementInfo element) {
		assert null != element : "\"element\" is null.";
		return this.elementToNodeMap.get(element);
	}

	public synchronized boolean removeNode(final ProgramElementInfo element) {
		return null != this.elementToNodeMap.remove(element) ? true : false;
	}

	public SortedSet<CFGNode<? extends ProgramElementInfo>> getAllNodes() {
		final SortedSet<CFGNode<? extends ProgramElementInfo>> nodes = new TreeSet<CFGNode<? extends ProgramElementInfo>>();
		nodes.addAll(this.elementToNodeMap.values());
		return nodes;
	}
}
