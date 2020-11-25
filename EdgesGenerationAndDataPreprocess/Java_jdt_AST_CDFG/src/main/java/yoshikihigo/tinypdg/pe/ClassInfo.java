package yoshikihigo.tinypdg.pe;

import java.util.ArrayList;
import java.util.List;

public class ClassInfo extends ProgramElementInfo {

	final public String path;
	final public String name;
	final private List<MethodInfo> methods;

	public ClassInfo(final String path, final String name, final int startLine,
			final int endLine) {
		super(startLine, endLine);
		assert null != path : "\"path\" is null";
		this.path = path;
		this.name = name;
		this.methods = new ArrayList<MethodInfo>();
	}

	public boolean isAnonymous() {
		return null == this.name;
	}

	public void addMethod(final MethodInfo method) {
		assert null != method : "\"method\" is null.";
		this.methods.add(method);
	}

	public List<MethodInfo> getMethods() {
		final List<MethodInfo> methods = new ArrayList<MethodInfo>();
		methods.addAll(this.methods);
		return methods;
	}
}
