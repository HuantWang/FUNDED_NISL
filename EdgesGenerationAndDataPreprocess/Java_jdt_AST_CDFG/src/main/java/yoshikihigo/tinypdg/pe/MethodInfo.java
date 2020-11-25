package yoshikihigo.tinypdg.pe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class MethodInfo extends ProgramElementInfo implements BlockInfo {

	final public String path;
	final public String name;
	final private List<VariableInfo> parameters;
	final private List<StatementInfo> statements;

	public MethodInfo(final String path, final String name,
			final int startLine, final int endLine) {

		super(startLine, endLine);

		this.path = path;
		this.name = name;
		this.parameters = new ArrayList<VariableInfo>();
		this.statements = new ArrayList<StatementInfo>();
	}

	public void addParameter(final VariableInfo parameter) {
		assert null != parameter : "\"variable\" is null.";
		this.parameters.add(parameter);
	}

	public SortedSet<VariableInfo> getParameters() {
		final SortedSet<VariableInfo> parameters = new TreeSet<VariableInfo>();
		parameters.addAll(this.parameters);
		return parameters;
	}

	@Override
	public void setStatement(final StatementInfo statement) {
		assert null != statement : "\"statement\" is null.";
		this.statements.clear();
		if (StatementInfo.CATEGORY.SimpleBlock == statement.getCategory()) {
			this.statements.addAll(statement.getStatements());
		} else {
			this.statements.add(statement);
		}
	}

	@Override
	public void addStatement(final StatementInfo statement) {
		assert null != statement : "\"statement\" is null.";
		this.statements.add(statement);
	}

	@Override
	public void addStatements(final Collection<StatementInfo> statements) {
		assert null != statements : "\"statements\" is null.";
		this.statements.addAll(statements);
	}

	@Override
	public List<StatementInfo> getStatements() {
		return Collections.unmodifiableList(this.statements);
	}

	@Override
	public SortedSet<String> getAssignedVariables() {
		final SortedSet<String> variables = new TreeSet<String>();
		for (final StatementInfo statement : this.statements) {
			variables.addAll(statement.getAssignedVariables());
		}
		return variables;
	}

	@Override
	public SortedSet<String> getReferencedVariables() {
		final SortedSet<String> variables = new TreeSet<String>();
		for (final StatementInfo statement : this.statements) {
			variables.addAll(statement.getReferencedVariables());
		}
		return variables;
	}

}
