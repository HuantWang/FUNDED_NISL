package yoshikihigo.tinypdg.scorpio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import yoshikihigo.tinypdg.pe.ClassInfo;
import yoshikihigo.tinypdg.pe.ExpressionInfo;
import yoshikihigo.tinypdg.pe.OperatorInfo;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;
import yoshikihigo.tinypdg.pe.StatementInfo;
import yoshikihigo.tinypdg.pe.TypeInfo;
import yoshikihigo.tinypdg.pe.VariableInfo;

public class NormalizedText {

	public static String normalize(final String text) {

//		StringBuilder normalizedText = new StringBuilder(text);
		StringBuilder normalizedText = new StringBuilder(resolveDuplicatedMarkingTokens(text));
		final Map<String, String> mapper = new HashMap<String, String>();

		int startIndex = 0;
		int endIndex = 0;
		while (true) {
			startIndex = normalizedText.indexOf("$$", startIndex);
			if (startIndex < 0) {
				break;
			}
			
			endIndex = normalizedText.indexOf("$$", startIndex + 1);
			final int doubleQuotationStartIndex = normalizedText.indexOf("\"", startIndex);
			final int doubleQuotationEndIndex = normalizedText.indexOf("\"", doubleQuotationStartIndex + 1);
			
			if (doubleQuotationStartIndex < endIndex && endIndex < doubleQuotationEndIndex) {
				endIndex = normalizedText.indexOf("$$", doubleQuotationEndIndex + 1);
			}
			
			assert 0 < endIndex : "invalid state.";

			final String target = normalizedText.substring(startIndex,
					endIndex + 1);
			String value = mapper.get(target);
			if (null == value) {
				value = "$" + Integer.toString(mapper.size() + 1);
				mapper.put(target, value);
			}
			normalizedText.replace(startIndex, endIndex + 2, value);
			startIndex++;
		}

		return normalizedText.toString();
	}
	
	private static String resolveDuplicatedMarkingTokens(final String text) {
		if (!text.contains("$$$")) {
			return text;
		}
		
		String result = text;
		while (result.contains("$$$")) {
			result = result.replace("$$$", "$$");
		}
		
		if (result.isEmpty()) {
			result = text;
		}
		
		return result;
	}

	public final ProgramElementInfo core;
	public String text;

	public NormalizedText(final ProgramElementInfo core) {
		this.core = core;
		this.text = null;
	}

	public String getText() {
		if (null == this.text) {
			this.generateText();
		}
		return this.text;
	}

	private void generateText() {

		if (this.core instanceof StatementInfo) {

			final StringBuilder text = new StringBuilder();
			final StatementInfo core = (StatementInfo) this.core;
			switch (core.getCategory()) {
			case Assert: {
				text.append("assert ");
				final ProgramElementInfo expression = core.getExpressions()
						.get(0);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());
				text.append(" : ");
				final ProgramElementInfo message = core.getExpressions().get(1);
				final NormalizedText messageText = new NormalizedText(message);
				text.append(messageText.getText());
				text.append(";");
				break;
			}
			case Break: {
				text.append("break;");
				break;
			}
			case Case: {
				if (0 < core.getExpressions().size()) {
					text.append("case ");
					final ProgramElementInfo label = core.getExpressions().get(
							0);
					final NormalizedText labelText = new NormalizedText(label);
					text.append(labelText.getText());
					text.append(":");
				} else {
					text.append("default:");
				}
				break;
			}
			case Catch:
				break;
			case Continue: {
				text.append("continue;");
				break;
			}
			case Do:
				break;
			case Empty: {
				text.append(";");
				break;
			}
			case Expression: {
				final ProgramElementInfo expression = core.getExpressions()
						.get(0);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());
				text.append(";");
				break;
			}
			case For:
				break;
			case Foreach:
				break;
			case If:
				break;
			case Return: {
				text.append("return");
				if (0 < core.getExpressions().size()) {
					text.append(" ");
					final ProgramElementInfo expression = core.getExpressions()
							.get(0);
					final NormalizedText expressionText = new NormalizedText(
							expression);
					text.append(expressionText.getText());
				}
				text.append(";");
				break;
			}
			case SimpleBlock:
				break;
			case Switch:
				break;
			case Synchronized:
				break;
			case Throw: {
				text.append("throw ");
				final ProgramElementInfo expression = ((StatementInfo) this.core)
						.getExpressions().get(0);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());
				text.append(";");
				break;
			}
			case Try:
				break;
			case TypeDeclaration: {
				final ClassInfo typeDeclaration = (ClassInfo) ((StatementInfo) this.core)
						.getExpressions().get(0);
				text.append("class ");
				text.append(typeDeclaration.name);
				text.append("{}");
				break;
			}
			case VariableDeclaration: {
				final List<ProgramElementInfo> expressions = ((StatementInfo) this.core)
						.getExpressions();
				final NormalizedText typeText = new NormalizedText(
						expressions.get(0));
				text.append(typeText.getText());
				text.append(" ");
				
				boolean anyExpression = false;
				for (int i = 1; i < expressions.size(); i++) {
					anyExpression = true;
					final NormalizedText fragmentText = new NormalizedText(
							expressions.get(i));
					text.append(fragmentText.getText() + ",");
				}
				if (anyExpression) {
					text.deleteCharAt(text.length() - 1);
				}
				text.append(";");
				break;
			}
			case While:
				break;
			default:
				assert false : "invalide status.";
				break;
			}
			this.text = text.toString();
		}

		else if (this.core instanceof ExpressionInfo) {

			final ExpressionInfo coreExp = (ExpressionInfo) this.core;
			final StringBuilder text = new StringBuilder();
			switch (((ExpressionInfo) this.core).category) {
			case ArrayAccess: {
				final ProgramElementInfo expression = coreExp.getExpressions()
						.get(0);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());
				text.append("[");
				final ProgramElementInfo index = coreExp.getExpressions()
						.get(1);
				final NormalizedText indexText = new NormalizedText(index);
				text.append(indexText.getText());
				text.append("]");
				break;
			}
			case ArrayCreation: {
				text.append("new ");
				final ProgramElementInfo type = coreExp.getExpressions().get(0);
				text.append(type.getText());
				text.append("[]");
				if (1 < coreExp.getExpressions().size()) {
					final ProgramElementInfo initializer = coreExp
							.getExpressions().get(1);
					final NormalizedText initializerText = new NormalizedText(
							initializer);
					text.append(initializerText.getText());
				}
				break;
			}
			case ArrayInitializer: {
				text.append("{");
				for (final ProgramElementInfo expression : coreExp
						.getExpressions()) {
					final NormalizedText expressionText = new NormalizedText(
							expression);
					text.append(expressionText.getText());
					text.append(",");
				}
				text.deleteCharAt(text.length() - 1);
				text.append("}");
				break;
			}
			case Assignment: {
				final ProgramElementInfo left = coreExp.getExpressions().get(0);
				final NormalizedText leftText = new NormalizedText(left);
				text.append(leftText.getText());
				text.append(" ");
				final ProgramElementInfo operator = coreExp.getExpressions()
						.get(1);
				final NormalizedText operatorText = new NormalizedText(operator);
				text.append(operatorText.getText());
				text.append(" ");
				final ProgramElementInfo right = coreExp.getExpressions()
						.get(2);
				final NormalizedText rightText = new NormalizedText(right);
				text.append(rightText.getText());
				break;
			}
			case Boolean: {
				text.append("$$");
				text.append(coreExp.getText());
				text.append("$$");
				break;
			}
			case Cast: {
				text.append("(");
				final ProgramElementInfo type = coreExp.getExpressions().get(0);
				final NormalizedText typeText = new NormalizedText(type);
				text.append(typeText.getText());
				text.append(")");
				final ProgramElementInfo expression = coreExp.getExpressions()
						.get(1);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());
				break;
			}
			case Character: {
				text.append("$$");
				text.append(coreExp.getText());
				text.append("$$");
				break;
			}
			case ClassInstanceCreation: {
				text.append("new ");
				final ProgramElementInfo type = coreExp.getExpressions().get(0);
				text.append(type.getText());
				text.append("(");
				final List<ProgramElementInfo> expressions = coreExp
						.getExpressions();
				expressions.remove(0);
				for (final ProgramElementInfo argument : expressions) {
					final NormalizedText argumentText = new NormalizedText(
							argument);
					text.append(argumentText.getText());
					text.append(",");
				}
				if (0 < expressions.size()) {
					text.deleteCharAt(text.length() - 1);
				}

				text.append(")");
				break;
			}
			case ConstructorInvocation: {
				text.append("this(");

				for (final ProgramElementInfo argument : coreExp
						.getExpressions()) {
					final NormalizedText argumentText = new NormalizedText(
							argument);
					text.append(argumentText.getText());
					text.append(",");
				}
				if (0 < coreExp.getExpressions().size()) {
					text.deleteCharAt(text.length() - 1);
				}

				text.append(")");
				break;
			}
			case FieldAccess: {
				final ProgramElementInfo expression = coreExp.getExpressions()
						.get(0);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());
				text.append(".");
				final ProgramElementInfo name = coreExp.getExpressions().get(1);
				final NormalizedText nameText = new NormalizedText(name);
				text.append(nameText.getText());
				break;
			}
			case Infix: {
				for (final ProgramElementInfo expression : coreExp
						.getExpressions()) {
					final NormalizedText expressionText = new NormalizedText(
							expression);
					text.append(expressionText.getText());
					text.append(" ");
				}
				text.deleteCharAt(text.length() - 1);
				break;
			}
			case Instanceof: {
				final ProgramElementInfo left = coreExp.getExpressions().get(0);
				final NormalizedText leftText = new NormalizedText(left);
				text.append(leftText.getText());
				text.append(" instanceof ");
				final ProgramElementInfo right = coreExp.getExpressions()
						.get(1);
				text.append(right.getText());
				break;
			}
			case MethodEnter: {
				text.append("METHODENTER");
				break;
			}
			case MethodInvocation: {
				if (null != coreExp.getQualifier()) {
					final ProgramElementInfo qualifier = coreExp.getQualifier();
					final NormalizedText qualifierText = new NormalizedText(
							qualifier);
					text.append(qualifierText.getText());
					text.append(".");
				}

				final ProgramElementInfo name = coreExp.getExpressions().get(0);
				text.append(name.getText());

				text.append("(");

				final List<ProgramElementInfo> expressions = coreExp
						.getExpressions();
				expressions.remove(0);
				for (final ProgramElementInfo argument : expressions) {
					final NormalizedText argumentText = new NormalizedText(
							argument);
					text.append(argumentText.getText());
					text.append(",");
				}
				if (1 < coreExp.getExpressions().size()) {
					text.deleteCharAt(text.length() - 1);
				}

				text.append(")");
				break;
			}
			case Null: {
				text.append("null");
				break;
			}
			case Number: {
				text.append("$$");
				text.append(coreExp.getText());
				text.append("$$");
				break;
			}
			case Parenthesized: {
				text.append("(");

				final ProgramElementInfo expression = coreExp.getExpressions()
						.get(0);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());

				text.append(")");
				break;
			}
			case Postfix: {
				final ProgramElementInfo operand = coreExp.getExpressions()
						.get(0);
				final NormalizedText operandText = new NormalizedText(operand);
				text.append(operandText.getText());

				final ProgramElementInfo operator = coreExp.getExpressions()
						.get(1);
				final NormalizedText operatorText = new NormalizedText(operator);
				text.append(operatorText.getText());
				break;
			}
			case Prefix: {
				final ProgramElementInfo operator = coreExp.getExpressions()
						.get(0);
				final NormalizedText operatorText = new NormalizedText(operator);
				text.append(operatorText.getText());

				final ProgramElementInfo operand = coreExp.getExpressions()
						.get(1);
				final NormalizedText operandText = new NormalizedText(operand);
				text.append(operandText.getText());
				break;
			}
			case QualifiedName: {
				final ProgramElementInfo qualifier = coreExp.getQualifier();
				final NormalizedText qualifierText = new NormalizedText(
						qualifier);
				text.append(qualifierText.getText());

				text.append(".");

				final ProgramElementInfo name = coreExp.getExpressions().get(0);
				final NormalizedText nameText = new NormalizedText(name);
				text.append(nameText.getText());
				break;
			}
			case SimpleName: {
				text.append("$$");
				text.append(coreExp.getText());
				text.append("$$");
				break;
			}
			case String: {
				text.append("$$");
				text.append(coreExp.getText());
				text.append("$$");
				break;
			}
			case SuperConstructorInvocation: {

				if (null != coreExp.getQualifier()) {
					final ProgramElementInfo qualifier = coreExp.getQualifier();
					final NormalizedText qualifierText = new NormalizedText(
							qualifier);
					text.append(qualifierText.getText());
					text.append(".");
				}

				text.append("super(");
				for (final ProgramElementInfo argument : coreExp
						.getExpressions()) {
					final NormalizedText argumentText = new NormalizedText(
							argument);
					text.append(argumentText.getText());
					text.append(",");
				}
				if (0 < coreExp.getExpressions().size()) {
					text.deleteCharAt(text.length() - 1);
				}
				text.append(")");
				break;
			}
			case SuperFieldAccess: {
				text.append("super.");
				final ProgramElementInfo name = coreExp.getExpressions().get(0);
				final NormalizedText nameText = new NormalizedText(name);
				text.append(nameText.getText());
				break;
			}
			case SuperMethodInvocation: {
				text.append("super.");
				final ProgramElementInfo name = coreExp.getExpressions().get(0);
				final NormalizedText nameText = new NormalizedText(name);
				text.append(nameText.getText());
				text.append("(");

				final List<ProgramElementInfo> expressions = coreExp
						.getExpressions();
				expressions.remove(0);
				for (final ProgramElementInfo argument : expressions) {
					final NormalizedText argumentText = new NormalizedText(
							argument);
					text.append(argumentText.getText());
					text.append(",");
				}
				if (0 < coreExp.getExpressions().size()) {
					text.deleteCharAt(text.length() - 1);
				}

				text.append(")");
				break;
			}
			case This: {
				text.append("this");
				break;
			}
			case Trinomial: {
				final ProgramElementInfo expression = coreExp.getExpressions()
						.get(0);
				final NormalizedText expressionText = new NormalizedText(
						expression);
				text.append(expressionText.getText());

				text.append("? ");

				final ProgramElementInfo thenExp = coreExp.getExpressions()
						.get(1);
				final NormalizedText thenExpText = new NormalizedText(thenExp);
				text.append(thenExpText.getText());

				text.append(": ");

				final ProgramElementInfo elseExp = coreExp.getExpressions()
						.get(2);
				final NormalizedText elseExpText = new NormalizedText(elseExp);
				text.append(elseExpText.getText());
				break;
			}
			case TypeLiteral:
				break;
			case VariableDeclarationExpression: {
				final List<ProgramElementInfo> expressions = coreExp
						.getExpressions();
				text.append(expressions.get(0).getText());
				text.append(" ");
				final NormalizedText expressionText = new NormalizedText(
						expressions.get(1));
				text.append(expressionText.getText());
				break;
			}
			case VariableDeclarationFragment: {
				final List<ProgramElementInfo> expressions = coreExp
						.getExpressions();
				final ProgramElementInfo left = expressions.get(0);
				final NormalizedText leftText = new NormalizedText(left);
				text.append(leftText.getText());

				if (1 < expressions.size()) {
					text.append(" = ");
					final ProgramElementInfo right = expressions.get(1);
					final NormalizedText rightText = new NormalizedText(right);
					text.append(rightText.getText());
				}
				break;
			}
			default:
				assert false : "invalid status.";
				break;

			}

			this.text = text.toString();
		}

		else if (this.core instanceof TypeInfo) {
			this.text = this.core.getText();
		}

		else if (this.core instanceof OperatorInfo) {
			this.text = this.core.getText();
		}

		else if (this.core instanceof VariableInfo) {
			final StringBuilder text = new StringBuilder();
			text.append(((VariableInfo) this.core).type.getText());
			text.append(" $$");
			text.append(((VariableInfo) this.core).name);
			text.append("$$");
			this.text = text.toString();
		}
	}
}
