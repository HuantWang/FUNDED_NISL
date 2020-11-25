package yoshikihigo.tinypdg.pe;

public class TypeInfo extends ProgramElementInfo {

	final public String name;

	public TypeInfo(final String name, final int startLine, final int endLine) {
		super(startLine, endLine);
		this.name = name;
		this.setText(name);
	}
}
