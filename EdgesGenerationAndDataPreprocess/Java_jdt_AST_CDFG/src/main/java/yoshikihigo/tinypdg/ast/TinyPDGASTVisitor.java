package yoshikihigo.tinypdg.ast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Stack;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CharacterLiteral;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.InstanceofExpression;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperFieldAccess;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclarationStatement;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.internal.core.dom.NaiveASTFlattener;

import yoshikihigo.tinypdg.pe.BlockInfo;
import yoshikihigo.tinypdg.pe.ClassInfo;
import yoshikihigo.tinypdg.pe.ExpressionInfo;
import yoshikihigo.tinypdg.pe.MethodInfo;
import yoshikihigo.tinypdg.pe.OperatorInfo;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.pe.StatementInfo;
import yoshikihigo.tinypdg.pe.TypeInfo;
import yoshikihigo.tinypdg.pe.VariableInfo;

public class TinyPDGASTVisitor extends NaiveASTFlattener {

	static public CompilationUnit createAST(final File file) {

		final String lineSeparator = System.getProperty("line.separator");
		final StringBuffer text = new StringBuffer();
		final BufferedReader reader;

		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(file), "JISAutoDetect"));

			while (reader.ready()) {
				final String line = reader.readLine();
				text.append(line);
				text.append(lineSeparator);
			}
			reader.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		final ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(text.toString().toCharArray());
		return (CompilationUnit) parser.createAST(null);
	}

	final private String path;
	final private CompilationUnit root;
	final private List<MethodInfo> methods;
	final private Stack<ProgramElementInfo> stack;

	public TinyPDGASTVisitor(final String path, final CompilationUnit root,
							 final List<MethodInfo> methods) {
		this.path = path;
		this.root = root;
		this.methods = methods;
		this.stack = new Stack<ProgramElementInfo>();
	}

	@Override
	public boolean visit(final TypeDeclaration node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ClassInfo typeDeclaration = new ClassInfo(this.path, node
				.getName().toString(), startLine, endLine);
		this.stack.push(typeDeclaration);

		final StringBuilder text = new StringBuilder();
		text.append("class ");
		text.append(node.getName().toString());
		text.append("{");
		text.append(System.getProperty("line.separator"));
		for (final Object o : node.bodyDeclarations()) {
			if (o instanceof MethodDeclaration) {
				((ASTNode) o).accept(this);
				final ProgramElementInfo method = this.stack.pop();
				this.methods.add((MethodInfo) method);
				typeDeclaration.addMethod((MethodInfo) method);
				text.append(method.getText());
				text.append(System.getProperty("line.separator"));
			}
		}
		text.append("}");
		typeDeclaration.setText(text.toString());
		typeDeclaration.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final TypeDeclarationStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo statement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.TypeDeclaration, startLine, endLine);
			this.stack.push(statement);

			node.getDeclaration().accept(this);
			final ProgramElementInfo typeDeclaration = this.stack.pop();
			statement.addExpression(typeDeclaration);

			statement.setText(typeDeclaration.getText());
			statement.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final AnnotationTypeDeclaration node) {

		for (final Object o : node.bodyDeclarations()) {
			((ASTNode) o).accept(this);
			final ProgramElementInfo method = this.stack.pop();
		}

		return false;
	}

	@Override
	public boolean visit(final AnonymousClassDeclaration node) {

		final StringBuilder text = new StringBuilder();
		text.append("{");
		text.append(System.getProperty("line.separator"));

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ClassInfo anonymousClass = new ClassInfo(this.path, null,
				startLine, endLine);
		this.stack.push(anonymousClass);

		for (final Object o : node.bodyDeclarations()) {
			if (o instanceof MethodDeclaration) {
				((ASTNode) o).accept(this);
				final ProgramElementInfo method = this.stack.pop();
				anonymousClass.addMethod((MethodInfo) method);
				text.append(method.getText());
			}
		}

		text.append("}");
		anonymousClass.setText(text.toString());
		anonymousClass.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final MethodDeclaration node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final String name = node.getName().getIdentifier();
		final MethodInfo method = new MethodInfo(this.path, name, startLine,
				endLine);
		this.stack.push(method);

		final StringBuilder text = new StringBuilder();
		for (final Object modifier : node.modifiers()) {
			method.addModifier(modifier.toString());
			text.append(modifier.toString());
			text.append(" ");
		}
		if (null != node.getReturnType2()) {
			text.append(node.getReturnType2().toString());
			text.append(" ");
		}
		text.append(name);
		text.append("(");

		for (final Object o : node.parameters()) {
			((ASTNode) o).accept(this);
			final VariableInfo parameter = (VariableInfo) this.stack.pop();
			parameter.setCategory(VariableInfo.CATEGORY.PARAMETER);
			method.addParameter(parameter);
			text.append(parameter.getText());
			text.append(",");
		}
		if (0 < node.parameters().size()) {
			text.deleteCharAt(text.length() - 1);
		}
		text.append(")");

		if (null != node.getBody()) {

			//信息发生变化的位置。
			node.getBody().accept(this);
			final ProgramElementInfo body = this.stack.pop();
			method.setStatement((StatementInfo) body);
			text.append(body.getText());
		}
		method.setText(text.toString());
		method.setText(node.toString());

		return false;
	}

	private int getStartLineNumber(final ASTNode node) {
		return root.getLineNumber(node.getStartPosition());
	}

	private int getEndLineNumber(final ASTNode node) {
		if (node instanceof IfStatement) {
			final ASTNode elseStatement = ((IfStatement) node)
					.getElseStatement();
			final int thenEnd = (elseStatement == null) ? node
					.getStartPosition() + node.getLength() : elseStatement
					.getStartPosition() - 1;
			return root.getLineNumber(thenEnd);
		} else if (node instanceof TryStatement) {
			final TryStatement tryStatement = (TryStatement) node;
			int tryEnd = 0;
			for (Object obj : tryStatement.catchClauses()) {
				CatchClause catchClause = (CatchClause) obj;
				tryEnd = catchClause.getStartPosition() - 1;
				break;
			}
			if (tryEnd == 0) {
				final Block finallyBlock = tryStatement.getFinally();
				if (finallyBlock != null) {
					tryEnd = finallyBlock.getStartPosition() - 1;
				}
			}
			if (tryEnd == 0) {
				tryEnd = node.getStartPosition() + node.getLength();
			}
			return root.getLineNumber(tryEnd);
		} else {
			return root.getLineNumber(node.getStartPosition()
					+ node.getLength());
		}
	}

	@Override
	public boolean visit(final AssertStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			node.getExpression().accept(this);
			final ProgramElementInfo expression = (ProgramElementInfo) this.stack
					.pop();

			node.getMessage().accept(this);
			final ProgramElementInfo message = (ProgramElementInfo) this.stack
					.pop();

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo statement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Assert, startLine, endLine);
			statement.addExpression(expression);
			statement.addExpression(message);
			this.stack.push(statement);
		}

		return false;
	}

	@Override
	public boolean visit(final ArrayAccess node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.ArrayAccess, startLine, endLine);
		this.stack.push(expression);

		node.getArray().accept(this);
		final ProgramElementInfo array = this.stack.pop();
		expression.addExpression((ProgramElementInfo) array);

		node.getIndex().accept(this);
		final ProgramElementInfo index = this.stack.pop();
		expression.addExpression((ProgramElementInfo) index);

		final StringBuilder text = new StringBuilder();
		text.append(array.getText());
		text.append("[");
		text.append(index.getText());
		text.append("]");
		expression.setText(text.toString());
		expression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ArrayType node) {

		final StringBuffer text = new StringBuffer();
		text.append(node.getElementType().toString());
		for (int i = 0; i < node.getDimensions(); i++) {
			text.append("[]");
		}
		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final TypeInfo type = new TypeInfo(text.toString(), startLine, endLine);
		this.stack.push(type);

		return false;
	}

	@Override
	public boolean visit(final NullLiteral node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Null, startLine, endLine);
		expression.setText("null");
		expression.setText(node.toString());
		this.stack.push(expression);

		return false;
	}

	@Override
	public boolean visit(final NumberLiteral node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Number, startLine, endLine);
		expression.setText(node.getToken());
		expression.setText(node.toString());
		this.stack.push(expression);

		return false;
	}

	@Override
	public boolean visit(final PostfixExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo postfixExpression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Postfix, startLine, endLine);
		this.stack.push(postfixExpression);

		node.getOperand().accept(this);
		final ProgramElementInfo operand = this.stack.pop();
		postfixExpression.addExpression((ProgramElementInfo) operand);

		final OperatorInfo operator = new OperatorInfo(node.getOperator()
				.toString(), startLine, endLine);
		postfixExpression.addExpression(operator);

		final StringBuilder text = new StringBuilder();
		text.append(operand.getText());
		text.append(operator.getText());
		postfixExpression.setText(text.toString());
		postfixExpression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final PrefixExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo prefixExpression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Prefix, startLine, endLine);
		this.stack.push(prefixExpression);

		final OperatorInfo operator = new OperatorInfo(node.getOperator()
				.toString(), startLine, endLine);
		prefixExpression.addExpression(operator);

		node.getOperand().accept(this);
		final ProgramElementInfo operand = this.stack.pop();
		prefixExpression.addExpression((ProgramElementInfo) operand);

		final StringBuilder text = new StringBuilder();
		text.append(operator.getText());
		text.append(operand.getText());
		prefixExpression.setText(text.toString());
		prefixExpression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final StringLiteral node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.String, startLine, endLine);
		expression.setText("\"" + node.getLiteralValue() + "\"");
		expression.setText(node.toString());
		this.stack.push(expression);

		return false;
	}

	@Override
	public boolean visit(final SuperFieldAccess node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo superFieldAccess = new ExpressionInfo(
				ExpressionInfo.CATEGORY.SuperFieldAccess, startLine, endLine);
		this.stack.push(superFieldAccess);

		node.getName().accept(this);
		final ProgramElementInfo name = this.stack.pop();
		superFieldAccess.addExpression(name);

		final StringBuilder text = new StringBuilder();
		text.append("super.");
		text.append(name.getText());
		superFieldAccess.setText(text.toString());
		superFieldAccess.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final SuperMethodInvocation node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo superMethodInvocation = new ExpressionInfo(
				ExpressionInfo.CATEGORY.SuperMethodInvocation, startLine,
				endLine);
		this.stack.push(superMethodInvocation);

		node.getName().accept(this);
		final ProgramElementInfo name = this.stack.pop();
		superMethodInvocation.addExpression(name);

		final StringBuilder text = new StringBuilder();
		text.append("super.");
		text.append(name);
		for (final Object argument : node.arguments()) {
			((ASTNode) argument).accept(this);
			final ProgramElementInfo argumentExpression = this.stack.pop();
			superMethodInvocation.addExpression(argumentExpression);
			text.append(argumentExpression.getText());
		}
		superMethodInvocation.setText(text.toString());
		superMethodInvocation.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final TypeLiteral node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.TypeLiteral, startLine, endLine);
		this.stack.push(expression);

		return false;
	}

	@Override
	public boolean visit(final QualifiedName node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo qualifiedName = new ExpressionInfo(
				ExpressionInfo.CATEGORY.QualifiedName, startLine, endLine);
		this.stack.push(qualifiedName);

		node.getQualifier().accept(this);
		final ProgramElementInfo qualifier = this.stack.pop();
		qualifiedName.setQualifier(qualifier);

		node.getName().accept(this);
		final ProgramElementInfo name = this.stack.pop();
		qualifiedName.addExpression((ProgramElementInfo) name);

		final StringBuilder text = new StringBuilder();
		text.append(qualifier.getText());
		text.append(".");
		text.append(name.getText());
		qualifiedName.setText(text.toString());
		qualifiedName.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final SimpleName node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo simpleName = new ExpressionInfo(
				ExpressionInfo.CATEGORY.SimpleName, startLine, endLine);
		simpleName.setText(node.getIdentifier());
		simpleName.setText(node.toString());
		this.stack.push(simpleName);

		return false;
	}

	@Override
	public boolean visit(final CharacterLiteral node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Character, startLine, endLine);
		expression.setText("\'" + node.charValue() + "\'");
		expression.setText(node.toString());
		this.stack.push(expression);

		return false;
	}

	@Override
	public boolean visit(final FieldAccess node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo fieldAccess = new ExpressionInfo(
				ExpressionInfo.CATEGORY.FieldAccess, startLine, endLine);
		this.stack.push(fieldAccess);

		node.getExpression().accept(this);
		final ProgramElementInfo expression = this.stack.pop();
		fieldAccess.addExpression((ProgramElementInfo) expression);

		node.getName().accept(this);
		final ProgramElementInfo name = this.stack.pop();
		fieldAccess.addExpression((ProgramElementInfo) name);

		final StringBuilder text = new StringBuilder();
		text.append(expression.getText());
		text.append(".");
		text.append(name.getText());
		fieldAccess.setText(text.toString());
		fieldAccess.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final InfixExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo infixExpression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Infix, startLine, endLine);
		this.stack.push(infixExpression);

		node.getLeftOperand().accept(this);
		final ProgramElementInfo left = this.stack.pop();
		infixExpression.addExpression(left);

		final OperatorInfo operator = new OperatorInfo(node.getOperator()
				.toString(), startLine, endLine);
		infixExpression.addExpression(operator);

		node.getRightOperand().accept(this);
		final ProgramElementInfo right = this.stack.pop();
		infixExpression.addExpression(right);

		final StringBuilder text = new StringBuilder();
		text.append(left.getText());
		text.append(" ");
		text.append(operator.getText());
		text.append(" ");
		text.append(right.getText());

		if (node.hasExtendedOperands()) {
			for (final Object operand : node.extendedOperands()) {
				((ASTNode) operand).accept(this);
				final ProgramElementInfo operandExpression = this.stack.pop();
				infixExpression.addExpression(operator);
				infixExpression.addExpression(operandExpression);

				text.append(" ");
				text.append(operator.getText());
				text.append(" ");
				text.append(operandExpression.getText());
			}
		}
		infixExpression.setText(text.toString());
		infixExpression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ArrayCreation node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo arrayCreation = new ExpressionInfo(
				ExpressionInfo.CATEGORY.ArrayCreation, startLine, endLine);
		this.stack.push(arrayCreation);

		node.getType().accept(this);
		final ProgramElementInfo type = this.stack.pop();
		//内层处理数组有点问题，直接不做处理了，将node内容写进去。
		type.setText(node.toString().split("new ")[1]);
		arrayCreation.addExpression(type);

		final StringBuilder text = new StringBuilder();
		text.append("new ");
		text.append(type.getText());
//		text.append("[]");

		if (null != node.getInitializer()) {
			node.getInitializer().accept(this);
			final ProgramElementInfo initializer = this.stack.pop();
			arrayCreation.addExpression((ProgramElementInfo) initializer);
			text.append(arrayCreation);
		}
		arrayCreation.setText(text.toString());
		arrayCreation.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ArrayInitializer node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo initializer = new ExpressionInfo(
				ExpressionInfo.CATEGORY.ArrayInitializer, startLine, endLine);
		this.stack.push(initializer);

		final StringBuilder text = new StringBuilder();
		text.append("{");
		for (final Object expression : node.expressions()) {
			((ASTNode) expression).accept(this);
			final ProgramElementInfo subexpression = this.stack.pop();
			initializer.addExpression(subexpression);
			text.append(subexpression.getText());
			text.append(",");
		}
		if (0 < node.expressions().size()) {
			text.deleteCharAt(text.length() - 1);
		}
		text.append("}");
		initializer.setText(text.toString());
		initializer.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final BooleanLiteral node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Boolean, startLine, endLine);
		this.stack.push(expression);
		expression.setText(node.toString());
		expression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final Assignment node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo assignment = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Assignment, startLine, endLine);
		this.stack.push(assignment);

		node.getLeftHandSide().accept(this);
		final ProgramElementInfo left = this.stack.pop();
		assignment.addExpression(left);

		final OperatorInfo operator = new OperatorInfo(node.getOperator()
				.toString(), startLine, endLine);
		assignment.addExpression(operator);

		node.getRightHandSide().accept(this);
		final ProgramElementInfo right = this.stack.pop();
		assignment.addExpression(right);

		final StringBuilder text = new StringBuilder();
		text.append(left.getText());
//		text.append(" ");
		text.append(operator.getText());
//		text.append(" ");
		text.append(right.getText());
		assignment.setText(text.toString());
		assignment.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final CastExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo cast = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Cast, startLine, endLine);
		this.stack.push(cast);

		final TypeInfo type = new TypeInfo(node.getType().toString(),
				startLine, endLine);
		cast.addExpression(type);

		node.getExpression().accept(this);
		final ProgramElementInfo expression = this.stack.pop();
		cast.addExpression(expression);

		final StringBuilder text = new StringBuilder();
		text.append("(");
		text.append(type.getText());
		text.append(")");
		text.append(expression.getText());
		cast.setText(text.toString());
		cast.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ClassInstanceCreation node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo classInstanceCreation = new ExpressionInfo(
				ExpressionInfo.CATEGORY.ClassInstanceCreation, startLine,
				endLine);
		this.stack.push(classInstanceCreation);

		final TypeInfo type = new TypeInfo(node.getType().toString(),
				startLine, endLine);
		classInstanceCreation.addExpression(type);

		final StringBuilder text = new StringBuilder();
		text.append("new ");
		text.append(type.getText());
		text.append("(");
		for (final Object argument : node.arguments()) {
			((ASTNode) argument).accept(this);
			final ProgramElementInfo argumentExpression = this.stack.pop();
			classInstanceCreation
					.addExpression((ProgramElementInfo) argumentExpression);

			text.append(argumentExpression.getText());
			text.append(",");
		}
		if (0 < node.arguments().size()) {
			text.deleteCharAt(text.length() - 1);
		}
		text.append(")");

		if (null != node.getExpression()) {
			node.getExpression().accept(this);
			final ProgramElementInfo expression = this.stack.pop();
			classInstanceCreation
					.addExpression((ProgramElementInfo) expression);
			text.append(expression.getText());
		}

		if (null != node.getAnonymousClassDeclaration()) {
			node.getAnonymousClassDeclaration().accept(this);
			final ProgramElementInfo anonymousClass = this.stack.pop();
			classInstanceCreation
					.setAnonymousClassDeclaration((ClassInfo) anonymousClass);
			text.append(anonymousClass.getText());
		}

		classInstanceCreation.setText(text.toString());
		classInstanceCreation.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ConditionalExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo trinomial = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Trinomial, startLine, endLine);
		this.stack.push(trinomial);

		node.getExpression().accept(this);
		final ProgramElementInfo expression = this.stack.pop();
		trinomial.addExpression((ProgramElementInfo) expression);

		node.getThenExpression().accept(this);
		final ProgramElementInfo thenExpression = this.stack.pop();
		trinomial.addExpression((ProgramElementInfo) thenExpression);

		node.getElseExpression().accept(this);
		final ProgramElementInfo elseExpression = this.stack.pop();
		trinomial.addExpression((ProgramElementInfo) elseExpression);

		final StringBuilder text = new StringBuilder();
		text.append(expression.getText());
		text.append("? ");
		text.append(thenExpression.getText());
		text.append(": ");
		text.append(elseExpression.getText());
		trinomial.setText(text.toString());
		trinomial.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ConstructorInvocation node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo invocation = new ExpressionInfo(
				ExpressionInfo.CATEGORY.ConstructorInvocation, startLine,
				endLine);
		this.stack.push(invocation);

		final StringBuilder text = new StringBuilder();
		text.append("this(");
		for (final Object argument : node.arguments()) {
			((ASTNode) argument).accept(this);
			final ProgramElementInfo argumentExpression = this.stack.pop();
			invocation.addExpression((ProgramElementInfo) argumentExpression);
			text.append(argumentExpression.getText());
			text.append(",");
		}
		if (0 < node.arguments().size()) {
			text.deleteCharAt(text.length() - 1);
		}
		text.append(")");
		invocation.setText(text.toString());
		invocation.setText(node.toString());

		this.stack.pop();
		final ProgramElementInfo ownerBlock = this.stack.peek();
		final StatementInfo statement = new StatementInfo(ownerBlock,
				StatementInfo.CATEGORY.Expression, startLine, endLine);
		this.stack.push(statement);

		statement.addExpression(invocation);
		text.append(";");
		statement.setText(text.toString());
		statement.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ExpressionStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo statement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Expression, startLine, endLine);
			this.stack.push(statement);

			node.getExpression().accept(this);
			final ProgramElementInfo expression = (ProgramElementInfo) this.stack
					.pop();
			statement.addExpression(expression);

			final StringBuilder text = new StringBuilder();
			text.append(expression.getText());
			text.append(";");
			statement.setText(text.toString());
			statement.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final InstanceofExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo instanceofExpression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Instanceof, startLine, endLine);
		this.stack.push(instanceofExpression);

		node.getLeftOperand().accept(this);
		final ProgramElementInfo left = this.stack.pop();
		instanceofExpression.addExpression(left);

		node.getRightOperand().accept(this);
		final ProgramElementInfo right = this.stack.pop();
		instanceofExpression.addExpression(right);

		final StringBuilder text = new StringBuilder();
		text.append(left.getText());
		text.append(" instanceof ");
		text.append(right.getText());
		instanceofExpression.setText(text.toString());
		instanceofExpression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final MethodInvocation node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo methodInvocation = new ExpressionInfo(
				ExpressionInfo.CATEGORY.MethodInvocation, startLine, endLine);
		this.stack.push(methodInvocation);

		final StringBuilder text = new StringBuilder();

		if (null != node.getExpression()) {
			node.getExpression().accept(this);
			final ProgramElementInfo expression = this.stack.pop();
			methodInvocation.setQualifier(expression);

			text.append(expression.getText());
			text.append(".");
		}

		node.getName().accept(this);
		final ProgramElementInfo name = this.stack.pop();
		methodInvocation.addExpression(name);

		text.append(name.getText());
		text.append("(");
		for (final Object argument : node.arguments()) {
			((ASTNode) argument).accept(this);
			final ProgramElementInfo argumentExpression = this.stack.pop();
			methodInvocation
					.addExpression((ProgramElementInfo) argumentExpression);

			text.append(argumentExpression.getText());
			text.append(",");
		}
		if (0 < node.arguments().size()) {
			text.deleteCharAt(text.length() - 1);
		}
		text.append(")");
		methodInvocation.setText(text.toString());
		methodInvocation.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ParenthesizedExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo parenthesizedExpression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.Parenthesized, startLine, endLine);
		this.stack.push(parenthesizedExpression);

		node.getExpression().accept(this);
		final ProgramElementInfo expression = this.stack.pop();
		parenthesizedExpression.addExpression(expression);

		final StringBuilder text = new StringBuilder();
		text.append("(");
		text.append(expression.getText());
		text.append(")");
		parenthesizedExpression.setText(text.toString());
		parenthesizedExpression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ReturnStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo returnStatement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Return, startLine, endLine);
			this.stack.push(returnStatement);

			final StringBuilder text = new StringBuilder();
			text.append("return");

			if (null != node.getExpression()) {
				node.getExpression().accept(this);
				final ProgramElementInfo expression = this.stack.pop();
				returnStatement.addExpression((ProgramElementInfo) expression);
				text.append(" ");
				text.append(expression.getText());
			}

			text.append(";");
			returnStatement.setText(text.toString());
			returnStatement.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final SuperConstructorInvocation node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo superConstructorInvocation = new ExpressionInfo(
				ExpressionInfo.CATEGORY.SuperConstructorInvocation, startLine,
				endLine);
		this.stack.push(superConstructorInvocation);

		final StringBuilder text = new StringBuilder();

		if (null != node.getExpression()) {
			node.getExpression().accept(this);
			final ProgramElementInfo qualifier = this.stack.pop();
			superConstructorInvocation.setQualifier(qualifier);
			text.append(qualifier.getText());
			text.append(".super(");
		} else {
			text.append("super(");
		}

		for (final Object argument : node.arguments()) {
			((ASTNode) argument).accept(this);
			final ProgramElementInfo argumentExpression = this.stack.pop();
			superConstructorInvocation
					.addExpression((ProgramElementInfo) argumentExpression);
			text.append(argumentExpression.getText());
			text.append(",");
		}
		if (0 < node.arguments().size()) {
			text.deleteCharAt(text.length() - 1);
		}
		text.append(")");
		superConstructorInvocation.setText(text.toString());
		superConstructorInvocation.setText(node.toString());

		this.stack.pop();
		final ProgramElementInfo ownerBlock = this.stack.peek();
		final StatementInfo statement = new StatementInfo(ownerBlock,
				StatementInfo.CATEGORY.Expression, startLine, endLine);
		this.stack.push(statement);

		statement.addExpression(superConstructorInvocation);
		text.append(";");
		statement.setText(text.toString());
		statement.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final ThisExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ProgramElementInfo expression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.This, startLine, endLine);
		this.stack.push(expression);
		expression.setText("this");
		expression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final VariableDeclarationExpression node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo vdExpression = new ExpressionInfo(
				ExpressionInfo.CATEGORY.VariableDeclarationExpression,
				startLine, endLine);
		this.stack.push(vdExpression);

		final TypeInfo type = new TypeInfo(node.getType().toString(),
				startLine, endLine);
		vdExpression.addExpression(type);

		final StringBuilder text = new StringBuilder();
		text.append(type.getText());
		text.append(" ");

		for (final Object fragment : node.fragments()) {
			((ASTNode) fragment).accept(this);
			final ProgramElementInfo fragmentExpression = this.stack.pop();
			vdExpression.addExpression((ProgramElementInfo) fragmentExpression);
			text.append(fragmentExpression.getText());
		}

		vdExpression.setText(text.toString());
		vdExpression.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final VariableDeclarationStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo vdStatement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.VariableDeclaration, startLine,
					endLine);
			this.stack.push(vdStatement);

			final StringBuilder text = new StringBuilder();
			for (final Object modifier : node.modifiers()) {
				text.append(modifier.toString());
				text.append(" ");
			}

			final ProgramElementInfo type = new TypeInfo(node.getType()
					.toString(), startLine, endLine);
			vdStatement.addExpression(type);

			text.append(node.getType().toString());
			text.append(" ");

			boolean anyExpression = false;
			for (final Object fragment : node.fragments()) {
				anyExpression = true;
				((ASTNode) fragment).accept(this);
				final ProgramElementInfo fragmentExpression = this.stack.pop();
				vdStatement
						.addExpression((ProgramElementInfo) fragmentExpression);
				text.append(fragmentExpression.getText() + ",");
			}
			if (anyExpression) {
				text.deleteCharAt(text.length() - 1);
			}

			text.append(";");
			vdStatement.setText(text.toString());
			vdStatement.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final VariableDeclarationFragment node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final ExpressionInfo vdFragment = new ExpressionInfo(
				ExpressionInfo.CATEGORY.VariableDeclarationFragment, startLine,
				endLine);
		this.stack.push(vdFragment);

		node.getName().accept(this);
		final ProgramElementInfo name = (ProgramElementInfo) this.stack.pop();
		vdFragment.addExpression(name);

		final StringBuilder text = new StringBuilder();
		text.append(name.getText());

		if (null != node.getInitializer()) {
			node.getInitializer().accept(this);
			final ProgramElementInfo expression = this.stack.pop();
			vdFragment.addExpression((ProgramElementInfo) expression);

			text.append(" = ");
			text.append(expression.getText());
		}

		vdFragment.setText(text.toString());
		vdFragment.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final DoStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo doBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Do, startLine, endLine);
			this.stack.push(doBlock);

			node.getBody().accept(this);
			final StatementInfo body = (StatementInfo) this.stack.pop();
			doBlock.setStatement(body);

			node.getExpression().accept(this);
			final ProgramElementInfo condition = (ProgramElementInfo) this.stack
					.pop();
			doBlock.setCondition(condition);
			condition.setOwnerConditinalBlock(doBlock);

			final StringBuilder text = new StringBuilder();
			text.append("do ");
			text.append(body.getText());
			text.append("while (");
			text.append(condition.getText());
			text.append(");");
		}

		return false;
	}

	@Override
	public boolean visit(final EnhancedForStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			node.getParameter().accept(this);
			final ProgramElementInfo parameter = this.stack.pop();

			node.getExpression().accept(this);
			final ProgramElementInfo expression = this.stack.pop();

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo foreachBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Foreach, startLine, endLine);
			foreachBlock.addInitializer(parameter);
			foreachBlock.addInitializer(expression);
			this.stack.push(foreachBlock);

			node.getBody().accept(this);
			final StatementInfo body = (StatementInfo) this.stack.pop();
			foreachBlock.setStatement(body);

			final StringBuilder text = new StringBuilder();
			text.append("for (");
			text.append(parameter.getText());
			text.append(" : ");
			text.append(expression.getText());
			text.append(")");
			text.append(body.getText());
			foreachBlock.setText(text.toString());
			foreachBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final ForStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo forBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.For, startLine, endLine);
			this.stack.push(forBlock);

			final StringBuilder text = new StringBuilder();
			text.append("for (");

			for (final Object o : node.initializers()) {
				((ASTNode) o).accept(this);
				final ExpressionInfo initializer = (ExpressionInfo) this.stack
						.pop();
				forBlock.addInitializer(initializer);
				text.append(initializer.getText());
				text.append(",");
			}
			if (0 < node.initializers().size()) {
				text.deleteCharAt(text.length() - 1);
			}

			text.append("; ");

			if (null != node.getExpression()) {
				node.getExpression().accept(this);
				final ProgramElementInfo condition = (ProgramElementInfo) this.stack
						.pop();
				forBlock.setCondition(condition);
				condition.setOwnerConditinalBlock(forBlock);
				text.append(condition.getText());
			}

			text.append("; ");

			for (final Object o : node.updaters()) {
				((ASTNode) o).accept(this);
				final ExpressionInfo updater = (ExpressionInfo) this.stack
						.pop();
				forBlock.addUpdater(updater);
				text.append(updater.getText());
				text.append(",");
			}
			if (0 < node.updaters().size()) {
				text.deleteCharAt(text.length() - 1);
			}

			text.append(")");

			node.getBody().accept(this);
			final StatementInfo body = (StatementInfo) this.stack.pop();
			forBlock.setStatement(body);
			text.append(body.getText());
			forBlock.setText(text.toString());
			forBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final IfStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo ifBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.If, startLine, endLine);
			this.stack.push(ifBlock);

			node.getExpression().accept(this);
			final ProgramElementInfo condition = (ProgramElementInfo) this.stack
					.pop();
			ifBlock.setCondition(condition);
			condition.setOwnerConditinalBlock(ifBlock);

			final StringBuilder text = new StringBuilder();
			text.append("if (");
			text.append(condition.getText());
			text.append(") ");

			if (null != node.getThenStatement()) {
				node.getThenStatement().accept(this);
				final StatementInfo thenBody = (StatementInfo) this.stack.pop();
				ifBlock.setStatement(thenBody);

				text.append(thenBody.getText());

			}

			if (null != node.getElseStatement()) {
				node.getElseStatement().accept(this);
				final StatementInfo elseBody = (StatementInfo) this.stack.pop();
				ifBlock.setElseStatement(elseBody);
				text.append("else ");
				text.append(elseBody.getText());
			}

			ifBlock.setText(text.toString());
			ifBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final SwitchStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo switchBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Switch, startLine, endLine);
			this.stack.push(switchBlock);

			node.getExpression().accept(this);
			final ProgramElementInfo condition = (ProgramElementInfo) this.stack
					.pop();
			switchBlock.setCondition(condition);
			condition.setOwnerConditinalBlock(switchBlock);

			final StringBuilder text = new StringBuilder();
			text.append("switch (");
			text.append(condition.getText());
			text.append(") {");
			text.append(System.getProperty("line.separator"));

			for (final Object o : node.statements()) {
				((ASTNode) o).accept(this);
				final StatementInfo statement = (StatementInfo) this.stack
						.pop();
				switchBlock.addStatement(statement);
				text.append(statement.getText());
				text.append(System.getProperty("line.separator"));
			}

			switchBlock.setText(text.toString());
			switchBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final SynchronizedStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo synchronizedBlock = new StatementInfo(
					ownerBlock, StatementInfo.CATEGORY.Synchronized, startLine,
					endLine);
			this.stack.push(synchronizedBlock);

			node.getExpression().accept(this);
			final ProgramElementInfo condition = (ProgramElementInfo) this.stack
					.pop();
			synchronizedBlock.setCondition(condition);
			condition.setOwnerConditinalBlock(synchronizedBlock);

			node.getBody().accept(this);
			final StatementInfo body = (StatementInfo) this.stack.pop();
			synchronizedBlock.setStatement(body);

			final StringBuilder text = new StringBuilder();
			text.append("synchronized (");
			text.append(condition.getText());
			text.append(") ");
			text.append(body.getText());
			synchronizedBlock.setText(text.toString());
			synchronizedBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final ThrowStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {
			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo throwStatement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Throw, startLine, endLine);
			this.stack.push(throwStatement);

			node.getExpression().accept(this);
			final ProgramElementInfo expression = (ProgramElementInfo) this.stack
					.pop();
			throwStatement.addExpression(expression);

			final StringBuilder text = new StringBuilder();
			text.append("throw ");
			text.append(expression.getText());
			text.append(";");
			throwStatement.setText(text.toString());
			throwStatement.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final TryStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo tryBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Try, startLine, endLine);
			this.stack.push(tryBlock);

			node.getBody().accept(this);
			final StatementInfo body = (StatementInfo) this.stack.pop();
			tryBlock.setStatement(body);

			final StringBuilder text = new StringBuilder();
			text.append("try ");
			text.append(body.getText());

			for (final Object o : node.catchClauses()) {
				((ASTNode) o).accept(this);
				final StatementInfo catchBlock = (StatementInfo) this.stack
						.pop();
				tryBlock.addCatchStatement(catchBlock);
				text.append(catchBlock.getText());
			}

			if (null != node.getFinally()) {
				node.getFinally().accept(this);
				final StatementInfo finallyBlock = (StatementInfo) this.stack
						.pop();
				tryBlock.setFinallyStatement(finallyBlock);
				text.append(finallyBlock.getText());
			}

			tryBlock.setText(text.toString());
			tryBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final WhileStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo whileBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.While, startLine, endLine);
			this.stack.push(whileBlock);

			node.getExpression().accept(this);
			final ProgramElementInfo condition = (ProgramElementInfo) this.stack
					.pop();
			whileBlock.setCondition(condition);
			condition.setOwnerConditinalBlock(whileBlock);

			node.getBody().accept(this);
			StatementInfo body = (StatementInfo) this.stack.pop();
			whileBlock.setStatement(body);

			final StringBuilder text = new StringBuilder();
			text.append("while (");
			text.append(condition.getText());
			text.append(") ");
			text.append(body.getText());
			whileBlock.setText(text.toString());
			whileBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final SwitchCase node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {
			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo switchCase = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Case, startLine, endLine);
			this.stack.push(switchCase);

			final StringBuilder text = new StringBuilder();

			if (null != node.getExpression()) {
				node.getExpression().accept(this);
				final ProgramElementInfo expression = this.stack.pop();
				switchCase.addExpression((ProgramElementInfo) expression);

				text.append("case ");
				text.append(expression.getText());
			} else {
				text.append("default");
			}

			text.append(":");
			switchCase.setText(text.toString());
			switchCase.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final BreakStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo breakStatement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Break, startLine, endLine);
			this.stack.push(breakStatement);

			final StringBuilder text = new StringBuilder();
			text.append("break");

			if (null != node.getLabel()) {
				node.getLabel().accept(this);
				final ProgramElementInfo label = this.stack.pop();
				breakStatement.addExpression((ProgramElementInfo) label);

				text.append(" ");
				text.append(label.getText());
			}

			text.append(";");
			breakStatement.setText(text.toString());
			breakStatement.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final ContinueStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo continuekStatement = new StatementInfo(
					ownerBlock, StatementInfo.CATEGORY.Continue, startLine,
					endLine);
			this.stack.push(continuekStatement);

			final StringBuilder text = new StringBuilder();
			text.append("continue");

			if (null != node.getLabel()) {
				node.getLabel().accept(this);
				final ProgramElementInfo label = this.stack.pop();
				continuekStatement.addExpression((ProgramElementInfo) label);

				text.append(" ");
				text.append(label.getText());
			}

			text.append(";");
			continuekStatement.setText(text.toString());
			continuekStatement.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final LabeledStatement node) {

		node.getBody().accept(this);
		final StatementInfo statement = (StatementInfo) this.stack.peek();

		final String label = node.getLabel().toString();
		statement.setLabel(label);

		return false;
	}

	@Override
	public boolean visit(final Block node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo simpleBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.SimpleBlock, startLine, endLine);
			this.stack.push(simpleBlock);

			final StringBuilder text = new StringBuilder();
			text.append("{");
			text.append(System.getProperty("line.separator"));

			for (final Object o : node.statements()) {
				((ASTNode) o).accept(this);
				final ProgramElementInfo statement = this.stack.pop();
				simpleBlock.addStatement((StatementInfo) statement);
				text.append(statement.getText());
				text.append(System.getProperty("line.separator"));
			}

			text.append("}");
			simpleBlock.setText(text.toString());
			simpleBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final CatchClause node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo catchBlock = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Catch, startLine, endLine);
			this.stack.push(catchBlock);

			node.getException().accept(this);
			final ProgramElementInfo exception = this.stack.pop();
			exception.setOwnerConditinalBlock(catchBlock);
			catchBlock.setCondition(exception);

			node.getBody().accept(this);
			final StatementInfo body = (StatementInfo) this.stack.pop();
			catchBlock.setStatement(body);

			final StringBuilder text = new StringBuilder();
			text.append("catch (");
			text.append(exception.getText());
			text.append(") ");
			text.append(catchBlock.getText());
			catchBlock.setText(text.toString());
			catchBlock.setText(node.toString());
		}

		return false;
	}

	@Override
	public boolean visit(final SingleVariableDeclaration node) {

		final int startLine = this.getStartLineNumber(node);
		final int endLine = this.getEndLineNumber(node);
		final TypeInfo type = new TypeInfo(node.getType().toString(),
				startLine, endLine);
		final String name = node.getName().toString();
		final VariableInfo variable = new VariableInfo(
				VariableInfo.CATEGORY.LOCAL, type, name, startLine, endLine);
		this.stack.push(variable);

		final StringBuilder text = new StringBuilder();
		for (final Object modifier : node.modifiers()) {
			variable.addModifier(modifier.toString());
			text.append(modifier.toString());
			text.append(" ");
		}
		text.append(type.getText());
		text.append(" ");
		text.append(name);
		variable.setText(text.toString());
		variable.setText(node.toString());

		return false;
	}

	@Override
	public boolean visit(final EmptyStatement node) {

		if (!this.stack.isEmpty() && this.stack.peek() instanceof BlockInfo) {

			final int startLine = this.getStartLineNumber(node);
			final int endLine = this.getEndLineNumber(node);
			final ProgramElementInfo ownerBlock = this.stack.peek();
			final StatementInfo emptyStatement = new StatementInfo(ownerBlock,
					StatementInfo.CATEGORY.Empty, startLine, endLine);
			this.stack.push(emptyStatement);
			emptyStatement.setText(";");
			emptyStatement.setText(node.toString());
		}

		return false;
	}

}
