package yoshikihigo.tinypdg.pe;

public class OperatorInfo extends ProgramElementInfo {

	final public String name;

	public OperatorInfo(final String name, final int startLine,
			final int endLine) {
		super(startLine, endLine);
		this.name = name;
		this.setText(name);
	}
}
