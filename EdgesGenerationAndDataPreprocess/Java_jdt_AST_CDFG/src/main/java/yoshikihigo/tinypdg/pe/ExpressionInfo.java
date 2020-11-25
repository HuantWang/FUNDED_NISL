package yoshikihigo.tinypdg.pe;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExpressionInfo extends ProgramElementInfo {

	final public CATEGORY category;
	private ProgramElementInfo qualifier;
	final private List<ProgramElementInfo> expressions;
	private ClassInfo anonymousClassDeclaration;

	public ExpressionInfo(final CATEGORY category, final int startLine,
			final int endLine) {
		super(startLine, endLine);
		this.category = category;
		this.qualifier = null;
		this.expressions = new ArrayList<ProgramElementInfo>();
		this.anonymousClassDeclaration = null;
	}

	public enum CATEGORY {

		ArrayAccess("ARRAYACCESS"), ArrayCreation("ARRAYCREATION"), ArrayInitializer(
				"ARRAYINITIALIZER"), Assignment("ASSIGNMENT"), Boolean(
				"BOOLEAN"), Cast("CAST"), Character("CHARACTER"), ClassInstanceCreation(
				"CLASSINSTANCECREATION"), ConstructorInvocation(
				"CONSTRUCTORINVOCATION"), FieldAccess("FIELDACCESS"), Infix(
				"INFIX"), Instanceof("INSTANCEOF"), MethodInvocation(
				"METHODINVOCATION"), Null("NULL"), Number("NUMBER"), Parenthesized(
				"PARENTHESIZED"), Postfix("POSTFIX"), Prefix("PREFIX"), QualifiedName(
				"QUALIFIEDNAME"), SimpleName("SIMPLENAME"), String("STRING"), SuperConstructorInvocation(
				"SUPERCONSTRUCTORINVOCATION"), SuperFieldAccess(
				"SUPERFIELDACCESS"), SuperMethodInvocation(
				"SUPERMETHODINVOCATION"), This("THIS"), Trinomial("TRINOMIAL"), TypeLiteral(
				"TYPELITERAL"), VariableDeclarationExpression(
				"VARIABLEDECLARATIONEXPRESSION"), VariableDeclarationFragment(
				"VARIABLEDECLARATIONFRAGMENT"), MethodEnter("METHODENTER");

		final public String id;

		CATEGORY(final String id) {
			this.id = id;
		}
	}

	public void setQualifier(final ProgramElementInfo qualifier) {
		assert null != qualifier : "\"qualifier\" is null.";
		this.qualifier = qualifier;
	}

	public ProgramElementInfo getQualifier() {
		return this.qualifier;
	}

	public void addExpression(final ProgramElementInfo expression) {
		assert null != expression : "\"expression\" is null.";
		this.expressions.add(expression);
	}

	public List<ProgramElementInfo> getExpressions() {
		final List<ProgramElementInfo> expressions = new ArrayList<ProgramElementInfo>();
		expressions.addAll(this.expressions);
		return expressions;
	}

	public void setAnonymousClassDeclaration(
			final ClassInfo anonymousClassDeclaration) {
		assert null != anonymousClassDeclaration : "\"anonymousClassDeclaration\" is null.";
		this.anonymousClassDeclaration = anonymousClassDeclaration;
	}

	public ClassInfo getAnonymousClassDeclaration() {
		return this.anonymousClassDeclaration;
	}

	@Override
	public SortedSet<String> getAssignedVariables() {

		final SortedSet<String> variables = new TreeSet<String>();
		switch (this.category) {
		case Assignment:
			final ProgramElementInfo left = this.expressions.get(0);
			variables.addAll(left.getReferencedVariables());
			final ProgramElementInfo right = this.expressions.get(2);
			variables.addAll(right.getAssignedVariables());
			break;
		case VariableDeclarationFragment:
			variables.add(this.getExpressions().get(0).getText());
			break;
		case Postfix:
		case Prefix:
			final ProgramElementInfo operand = this.expressions.get(0);
			variables.addAll(operand.getReferencedVariables());
			break;
		default:
			for (final ProgramElementInfo expression : this.expressions) {
				variables.addAll(expression.getAssignedVariables());
			}
			if (null != this.getAnonymousClassDeclaration()) {
				for (final MethodInfo method : this
						.getAnonymousClassDeclaration().getMethods()) {
					variables.addAll(method.getAssignedVariables());
				}
			}
			break;
		}
		return variables;
	}

	@Override
	public SortedSet<String> getReferencedVariables() {
		final SortedSet<String> variables = new TreeSet<String>();
		switch (this.category) {
		case Assignment:
			final ProgramElementInfo right = this.expressions.get(2);
			variables.addAll(right.getReferencedVariables());
			break;
		case VariableDeclarationFragment:
			if (1 < this.getExpressions().size()) {
				variables.addAll(this.getExpressions().get(1)
						.getReferencedVariables());
			}
			break;
		case Postfix:
		case Prefix:
			final ProgramElementInfo operand = this.expressions.get(0);
			variables.addAll(operand.getReferencedVariables());
			break;
		case SimpleName:
			variables.add(this.getText());
			break;
		default:
			for (final ProgramElementInfo expression : this.expressions) {
				variables.addAll(expression.getReferencedVariables());
			}
			if (null != this.getAnonymousClassDeclaration()) {
				for (final MethodInfo method : this
						.getAnonymousClassDeclaration().getMethods()) {
					variables.addAll(method.getReferencedVariables());
				}
			}
			break;
		}
		return variables;
	}
}
