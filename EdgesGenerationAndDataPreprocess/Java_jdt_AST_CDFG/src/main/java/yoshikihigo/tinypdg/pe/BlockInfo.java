package yoshikihigo.tinypdg.pe;

import java.util.Collection;
import java.util.List;

public interface BlockInfo {

	void setStatement(StatementInfo statement);

	void addStatement(StatementInfo statement);

	void addStatements(Collection<StatementInfo> statements);

	List<StatementInfo> getStatements();
}
