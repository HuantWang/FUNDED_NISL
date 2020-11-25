package yoshikihigo.tinypdg.pe;

public class VariableInfo extends ProgramElementInfo {

	private CATEGORY category;
	final public TypeInfo type;
	final public String name;

	public VariableInfo(final CATEGORY category, final TypeInfo type,
			final String name, final int startLine, final int endLine) {
		super(startLine, endLine);
		this.category = category;
		this.type = type;
		this.name = name;
	}

	public void setCategory(final CATEGORY category) {
		assert null != category : "\"category\" is null.";
		this.category = category;
	}

	public CATEGORY getCategory() {
		return this.category;
	}

	public enum CATEGORY {
		FIELD, LOCAL, PARAMETER;
	}
}
