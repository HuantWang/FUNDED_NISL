package yoshikihigo.tinypdg.scorpio;

import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicInteger;

import yoshikihigo.tinypdg.cfg.node.CFGNodeFactory;
import yoshikihigo.tinypdg.pdg.PDG;
import yoshikihigo.tinypdg.pdg.node.PDGNodeFactory;
import yoshikihigo.tinypdg.pe.MethodInfo;
import yoshikihigo.tinypdg.scorpio.pdg.PDGMergedNode;

public class PDGGenerationThread implements Runnable {

	final static private AtomicInteger INDEX = new AtomicInteger(0);

	final private List<MethodInfo> methods;
	final private SortedSet<PDG> pdgs;
	final private CFGNodeFactory cfgNodeFactory;
	final private PDGNodeFactory pdgNodeFactory;
	final private boolean useOfControl;
	final private boolean useOfData;
	final private boolean useOfExecution;
	final private boolean useOfMerging;
	final private int threshold;

	public PDGGenerationThread(final List<MethodInfo> methods,
			final SortedSet<PDG> pdgs, final CFGNodeFactory cfgNodeFactory,
			final PDGNodeFactory pdgNodeFactory, final boolean useOfControl,
			final boolean useOfData, final boolean useOfExecution,
			final boolean useOfMerging, final int threshold) {
		assert null != methods : "\"methods\" is null.";
		assert null != pdgs : "\"pdgs\" is null.";
		assert null != cfgNodeFactory : "\"cfgNodeFactory\" is null.";
		assert null != pdgNodeFactory : "\"pdgNodeFactory\" is null.";
		this.methods = methods;
		this.pdgs = pdgs;
		this.cfgNodeFactory = cfgNodeFactory;
		this.pdgNodeFactory = pdgNodeFactory;
		this.useOfControl = useOfControl;
		this.useOfData = useOfData;
		this.useOfExecution = useOfExecution;
		this.useOfMerging = useOfMerging;
		this.threshold = threshold;
	}

	@Override
	public void run() {
		for (int index = INDEX.getAndIncrement(); index < this.methods.size(); index = INDEX
				.getAndIncrement()) {
			final MethodInfo method = this.methods.get(index);

			try {

				final PDG pdg = new PDG(method, this.pdgNodeFactory,
						this.cfgNodeFactory, this.useOfControl, this.useOfData,
						this.useOfExecution, Integer.MAX_VALUE,
						Integer.MAX_VALUE, Integer.MAX_VALUE);

				pdg.build();
				if (pdg.getAllNodes().size() < this.threshold) {
					continue;
				}

				if (this.useOfMerging) {
					PDGMergedNode.mergeNodes(pdg);
				}
				this.pdgs.add(pdg);

			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("ERROR: failed to process the method "
						+ method.name + " in " + method.path);
			}
		}
	}
}
