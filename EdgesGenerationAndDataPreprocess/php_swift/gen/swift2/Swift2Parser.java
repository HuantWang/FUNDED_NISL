// Generated from E:/raw-data/antlr4/php_swift/src/swift2\Swift2.g4 by ANTLR 4.8
package swift2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Swift2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		Platform=102, Identifier=103, DOT=104, LCURLY=105, LPAREN=106, LBRACK=107, 
		RCURLY=108, RPAREN=109, RBRACK=110, COMMA=111, COLON=112, SEMI=113, LT=114, 
		GT=115, UNDERSCORE=116, BANG=117, QUESTION=118, AT=119, AND=120, SUB=121, 
		EQUAL=122, OR=123, DIV=124, ADD=125, MUL=126, MOD=127, CARET=128, TILDE=129, 
		Operator_head_other=130, Operator_following_character=131, Implicit_parameter_name=132, 
		Binary_literal=133, Octal_literal=134, Decimal_literal=135, Pure_decimal_digits=136, 
		Hexadecimal_literal=137, Floating_point_literal=138, Static_string_literal=139, 
		Interpolated_string_literal=140, WS=141, Block_comment=142, Line_comment=143;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_loop_statement = 3, 
		RULE_for_statement = 4, RULE_for_init = 5, RULE_for_in_statement = 6, 
		RULE_while_statement = 7, RULE_condition_clause = 8, RULE_condition_list = 9, 
		RULE_condition = 10, RULE_case_condition = 11, RULE_optional_binding_condition = 12, 
		RULE_optional_binding_head = 13, RULE_optional_binding_continuation_list = 14, 
		RULE_optional_binding_continuation = 15, RULE_repeat_while_statement = 16, 
		RULE_branch_statement = 17, RULE_if_statement = 18, RULE_else_clause = 19, 
		RULE_guard_statement = 20, RULE_switch_statement = 21, RULE_switch_cases = 22, 
		RULE_switch_case = 23, RULE_case_label = 24, RULE_case_item_list = 25, 
		RULE_default_label = 26, RULE_where_clause = 27, RULE_where_expression = 28, 
		RULE_labeled_statement = 29, RULE_statement_label = 30, RULE_label_name = 31, 
		RULE_control_transfer_statement = 32, RULE_break_statement = 33, RULE_continue_statement = 34, 
		RULE_fallthrough_statement = 35, RULE_return_statement = 36, RULE_availability_condition = 37, 
		RULE_availability_arguments = 38, RULE_availability_argument = 39, RULE_throw_statement = 40, 
		RULE_defer_statement = 41, RULE_do_statement = 42, RULE_catch_clauses = 43, 
		RULE_catch_clause = 44, RULE_compiler_control_statement = 45, RULE_build_configuration_statement = 46, 
		RULE_build_configuration_elseif_clauses = 47, RULE_build_configuration_elseif_clause = 48, 
		RULE_build_configuration_else_clause = 49, RULE_build_configuration = 50, 
		RULE_platform_testing_function = 51, RULE_operating_system = 52, RULE_architecture = 53, 
		RULE_line_control_statement = 54, RULE_line_number = 55, RULE_file_name = 56, 
		RULE_generic_parameter_clause = 57, RULE_generic_parameter_list = 58, 
		RULE_generic_parameter = 59, RULE_requirement_clause = 60, RULE_requirement_list = 61, 
		RULE_requirement = 62, RULE_conformance_requirement = 63, RULE_same_type_requirement = 64, 
		RULE_generic_argument_clause = 65, RULE_generic_argument_list = 66, RULE_generic_argument = 67, 
		RULE_declaration = 68, RULE_declarations = 69, RULE_top_level_declaration = 70, 
		RULE_code_block = 71, RULE_import_declaration = 72, RULE_import_kind = 73, 
		RULE_import_path = 74, RULE_import_path_identifier = 75, RULE_constant_declaration = 76, 
		RULE_pattern_initializer_list = 77, RULE_pattern_initializer = 78, RULE_initializer = 79, 
		RULE_variable_declaration = 80, RULE_variable_declaration_head = 81, RULE_variable_name = 82, 
		RULE_getter_setter_block = 83, RULE_getter_clause = 84, RULE_setter_clause = 85, 
		RULE_setter_name = 86, RULE_getter_setter_keyword_block = 87, RULE_getter_keyword_clause = 88, 
		RULE_setter_keyword_clause = 89, RULE_willSet_didSet_block = 90, RULE_willSet_clause = 91, 
		RULE_didSet_clause = 92, RULE_typealias_declaration = 93, RULE_typealias_head = 94, 
		RULE_typealias_name = 95, RULE_typealias_assignment = 96, RULE_function_declaration = 97, 
		RULE_function_head = 98, RULE_function_name = 99, RULE_function_signature = 100, 
		RULE_function_result = 101, RULE_function_body = 102, RULE_parameter_clauses = 103, 
		RULE_parameter_clause = 104, RULE_parameter_list = 105, RULE_parameter = 106, 
		RULE_external_parameter_name = 107, RULE_local_parameter_name = 108, RULE_default_argument_clause = 109, 
		RULE_enum_declaration = 110, RULE_union_style_enum = 111, RULE_union_style_enum_members = 112, 
		RULE_union_style_enum_member = 113, RULE_union_style_enum_case_clause = 114, 
		RULE_union_style_enum_case_list = 115, RULE_union_style_enum_case = 116, 
		RULE_enum_name = 117, RULE_enum_case_name = 118, RULE_raw_value_style_enum = 119, 
		RULE_raw_value_style_enum_members = 120, RULE_raw_value_style_enum_member = 121, 
		RULE_raw_value_style_enum_case_clause = 122, RULE_raw_value_style_enum_case_list = 123, 
		RULE_raw_value_style_enum_case = 124, RULE_raw_value_assignment = 125, 
		RULE_raw_value_literal = 126, RULE_struct_declaration = 127, RULE_struct_name = 128, 
		RULE_struct_body = 129, RULE_class_declaration = 130, RULE_class_name = 131, 
		RULE_class_body = 132, RULE_protocol_declaration = 133, RULE_protocol_name = 134, 
		RULE_protocol_body = 135, RULE_protocol_member_declaration = 136, RULE_protocol_member_declarations = 137, 
		RULE_protocol_property_declaration = 138, RULE_protocol_method_declaration = 139, 
		RULE_protocol_initializer_declaration = 140, RULE_protocol_subscript_declaration = 141, 
		RULE_protocol_associated_type_declaration = 142, RULE_initializer_declaration = 143, 
		RULE_initializer_head = 144, RULE_initializer_body = 145, RULE_deinitializer_declaration = 146, 
		RULE_extension_declaration = 147, RULE_extension_body = 148, RULE_subscript_declaration = 149, 
		RULE_subscript_head = 150, RULE_subscript_result = 151, RULE_operator_declaration = 152, 
		RULE_prefix_operator_declaration = 153, RULE_postfix_operator_declaration = 154, 
		RULE_infix_operator_declaration = 155, RULE_infix_operator_attributes = 156, 
		RULE_precedence_clause = 157, RULE_precedence_level = 158, RULE_associativity_clause = 159, 
		RULE_associativity = 160, RULE_declaration_modifier = 161, RULE_declaration_modifiers = 162, 
		RULE_access_level_modifier = 163, RULE_pattern = 164, RULE_wildcard_pattern = 165, 
		RULE_identifier_pattern = 166, RULE_value_binding_pattern = 167, RULE_tuple_pattern = 168, 
		RULE_tuple_pattern_element_list = 169, RULE_tuple_pattern_element = 170, 
		RULE_enum_case_pattern = 171, RULE_optional_pattern = 172, RULE_expression_pattern = 173, 
		RULE_attribute = 174, RULE_attribute_name = 175, RULE_attribute_argument_clause = 176, 
		RULE_attributes = 177, RULE_balanced_tokens = 178, RULE_balanced_token = 179, 
		RULE_expression = 180, RULE_expression_list = 181, RULE_prefix_expression = 182, 
		RULE_in_out_expression = 183, RULE_try_operator = 184, RULE_binary_expression = 185, 
		RULE_binary_expressions = 186, RULE_conditional_operator = 187, RULE_type_casting_operator = 188, 
		RULE_primary_expression = 189, RULE_implicit_member_expression = 190, 
		RULE_literal_expression = 191, RULE_array_literal = 192, RULE_array_literal_items = 193, 
		RULE_array_literal_item = 194, RULE_dictionary_literal = 195, RULE_dictionary_literal_items = 196, 
		RULE_dictionary_literal_item = 197, RULE_self_expression = 198, RULE_superclass_expression = 199, 
		RULE_superclass_method_expression = 200, RULE_superclass_subscript_expression = 201, 
		RULE_superclass_initializer_expression = 202, RULE_closure_expression = 203, 
		RULE_closure_signature = 204, RULE_capture_list = 205, RULE_capture_list_items = 206, 
		RULE_capture_list_item = 207, RULE_capture_specifier = 208, RULE_parenthesized_expression = 209, 
		RULE_expression_element_list = 210, RULE_expression_element = 211, RULE_wildcard_expression = 212, 
		RULE_selector_expression = 213, RULE_postfix_expression = 214, RULE_argument_names = 215, 
		RULE_argument_name = 216, RULE_trailing_closure = 217, RULE_type = 218, 
		RULE_type_annotation = 219, RULE_type_identifier = 220, RULE_type_name = 221, 
		RULE_tuple_type = 222, RULE_tuple_type_body = 223, RULE_tuple_type_element_list = 224, 
		RULE_tuple_type_element = 225, RULE_element_name = 226, RULE_protocol_composition_type = 227, 
		RULE_protocol_identifier_list = 228, RULE_protocol_identifier = 229, RULE_type_inheritance_clause = 230, 
		RULE_type_inheritance_list = 231, RULE_class_requirement = 232, RULE_identifier = 233, 
		RULE_identifier_list = 234, RULE_context_sensitive_keyword = 235, RULE_assignment_operator = 236, 
		RULE_negate_prefix_operator = 237, RULE_build_AND = 238, RULE_build_OR = 239, 
		RULE_arrow_operator = 240, RULE_range_operator = 241, RULE_same_type_equals = 242, 
		RULE_binary_operator = 243, RULE_prefix_operator = 244, RULE_postfix_operator = 245, 
		RULE_operator = 246, RULE_operator_character = 247, RULE_operator_head = 248, 
		RULE_dot_operator_head = 249, RULE_dot_operator_character = 250, RULE_literal = 251, 
		RULE_numeric_literal = 252, RULE_boolean_literal = 253, RULE_nil_literal = 254, 
		RULE_integer_literal = 255, RULE_string_literal = 256;
	private static String[] makeRuleNames() {
		return new String[] {
			"top_level", "statement", "statements", "loop_statement", "for_statement", 
			"for_init", "for_in_statement", "while_statement", "condition_clause", 
			"condition_list", "condition", "case_condition", "optional_binding_condition", 
			"optional_binding_head", "optional_binding_continuation_list", "optional_binding_continuation", 
			"repeat_while_statement", "branch_statement", "if_statement", "else_clause", 
			"guard_statement", "switch_statement", "switch_cases", "switch_case", 
			"case_label", "case_item_list", "default_label", "where_clause", "where_expression", 
			"labeled_statement", "statement_label", "label_name", "control_transfer_statement", 
			"break_statement", "continue_statement", "fallthrough_statement", "return_statement", 
			"availability_condition", "availability_arguments", "availability_argument", 
			"throw_statement", "defer_statement", "do_statement", "catch_clauses", 
			"catch_clause", "compiler_control_statement", "build_configuration_statement", 
			"build_configuration_elseif_clauses", "build_configuration_elseif_clause", 
			"build_configuration_else_clause", "build_configuration", "platform_testing_function", 
			"operating_system", "architecture", "line_control_statement", "line_number", 
			"file_name", "generic_parameter_clause", "generic_parameter_list", "generic_parameter", 
			"requirement_clause", "requirement_list", "requirement", "conformance_requirement", 
			"same_type_requirement", "generic_argument_clause", "generic_argument_list", 
			"generic_argument", "declaration", "declarations", "top_level_declaration", 
			"code_block", "import_declaration", "import_kind", "import_path", "import_path_identifier", 
			"constant_declaration", "pattern_initializer_list", "pattern_initializer", 
			"initializer", "variable_declaration", "variable_declaration_head", "variable_name", 
			"getter_setter_block", "getter_clause", "setter_clause", "setter_name", 
			"getter_setter_keyword_block", "getter_keyword_clause", "setter_keyword_clause", 
			"willSet_didSet_block", "willSet_clause", "didSet_clause", "typealias_declaration", 
			"typealias_head", "typealias_name", "typealias_assignment", "function_declaration", 
			"function_head", "function_name", "function_signature", "function_result", 
			"function_body", "parameter_clauses", "parameter_clause", "parameter_list", 
			"parameter", "external_parameter_name", "local_parameter_name", "default_argument_clause", 
			"enum_declaration", "union_style_enum", "union_style_enum_members", "union_style_enum_member", 
			"union_style_enum_case_clause", "union_style_enum_case_list", "union_style_enum_case", 
			"enum_name", "enum_case_name", "raw_value_style_enum", "raw_value_style_enum_members", 
			"raw_value_style_enum_member", "raw_value_style_enum_case_clause", "raw_value_style_enum_case_list", 
			"raw_value_style_enum_case", "raw_value_assignment", "raw_value_literal", 
			"struct_declaration", "struct_name", "struct_body", "class_declaration", 
			"class_name", "class_body", "protocol_declaration", "protocol_name", 
			"protocol_body", "protocol_member_declaration", "protocol_member_declarations", 
			"protocol_property_declaration", "protocol_method_declaration", "protocol_initializer_declaration", 
			"protocol_subscript_declaration", "protocol_associated_type_declaration", 
			"initializer_declaration", "initializer_head", "initializer_body", "deinitializer_declaration", 
			"extension_declaration", "extension_body", "subscript_declaration", "subscript_head", 
			"subscript_result", "operator_declaration", "prefix_operator_declaration", 
			"postfix_operator_declaration", "infix_operator_declaration", "infix_operator_attributes", 
			"precedence_clause", "precedence_level", "associativity_clause", "associativity", 
			"declaration_modifier", "declaration_modifiers", "access_level_modifier", 
			"pattern", "wildcard_pattern", "identifier_pattern", "value_binding_pattern", 
			"tuple_pattern", "tuple_pattern_element_list", "tuple_pattern_element", 
			"enum_case_pattern", "optional_pattern", "expression_pattern", "attribute", 
			"attribute_name", "attribute_argument_clause", "attributes", "balanced_tokens", 
			"balanced_token", "expression", "expression_list", "prefix_expression", 
			"in_out_expression", "try_operator", "binary_expression", "binary_expressions", 
			"conditional_operator", "type_casting_operator", "primary_expression", 
			"implicit_member_expression", "literal_expression", "array_literal", 
			"array_literal_items", "array_literal_item", "dictionary_literal", "dictionary_literal_items", 
			"dictionary_literal_item", "self_expression", "superclass_expression", 
			"superclass_method_expression", "superclass_subscript_expression", "superclass_initializer_expression", 
			"closure_expression", "closure_signature", "capture_list", "capture_list_items", 
			"capture_list_item", "capture_specifier", "parenthesized_expression", 
			"expression_element_list", "expression_element", "wildcard_expression", 
			"selector_expression", "postfix_expression", "argument_names", "argument_name", 
			"trailing_closure", "type", "type_annotation", "type_identifier", "type_name", 
			"tuple_type", "tuple_type_body", "tuple_type_element_list", "tuple_type_element", 
			"element_name", "protocol_composition_type", "protocol_identifier_list", 
			"protocol_identifier", "type_inheritance_clause", "type_inheritance_list", 
			"class_requirement", "identifier", "identifier_list", "context_sensitive_keyword", 
			"assignment_operator", "negate_prefix_operator", "build_AND", "build_OR", 
			"arrow_operator", "range_operator", "same_type_equals", "binary_operator", 
			"prefix_operator", "postfix_operator", "operator", "operator_character", 
			"operator_head", "dot_operator_head", "dot_operator_character", "literal", 
			"numeric_literal", "boolean_literal", "nil_literal", "integer_literal", 
			"string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'case'", "'in'", "'while'", "'let'", "'var'", "'repeat'", 
			"'if'", "'else'", "'guard'", "'switch'", "'default'", "'where'", "'break'", 
			"'continue'", "'fallthrough'", "'return'", "'#available'", "'throw'", 
			"'defer'", "'do'", "'catch'", "'#if'", "'#endif'", "'#elseif'", "'#else'", 
			"'os'", "'arch'", "'OSX'", "'iOS'", "'watchOS'", "'tvOS'", "'i386'", 
			"'x86_64'", "'arm'", "'arm64'", "'#line'", "'import'", "'typealias'", 
			"'struct'", "'class'", "'enum'", "'protocol'", "'func'", "'get'", "'set'", 
			"'willSet'", "'didSet'", "'throws'", "'rethrows'", "'inout'", "'indirect'", 
			"'associatedtype'", "'init'", "'deinit'", "'extension'", "'subscript'", 
			"'prefix'", "'operator'", "'postfix'", "'infix'", "'precedence'", "'associativity'", 
			"'left'", "'right'", "'none'", "'convenience'", "'dynamic'", "'final'", 
			"'lazy'", "'mutating'", "'nonmutating'", "'optional'", "'override'", 
			"'required'", "'static'", "'unowned'", "'safe'", "'unsafe'", "'weak'", 
			"'internal'", "'private'", "'public'", "'is'", "'as'", "'try'", "'__FILE__'", 
			"'__LINE__'", "'__COLUMN__'", "'__FUNCTION__'", "'self'", "'super'", 
			"'unowned(safe)'", "'unowned(unsafe)'", "'#selector'", "'dynamicType'", 
			"'Type'", "'Protocol'", "'true'", "'false'", "'nil'", null, null, "'.'", 
			"'{'", "'('", "'['", "'}'", "')'", "']'", "','", "':'", "';'", "'<'", 
			"'>'", "'_'", "'!'", "'?'", "'@'", "'&'", "'-'", "'='", "'|'", "'/'", 
			"'+'", "'*'", "'%'", "'^'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Platform", "Identifier", "DOT", 
			"LCURLY", "LPAREN", "LBRACK", "RCURLY", "RPAREN", "RBRACK", "COMMA", 
			"COLON", "SEMI", "LT", "GT", "UNDERSCORE", "BANG", "QUESTION", "AT", 
			"AND", "SUB", "EQUAL", "OR", "DIV", "ADD", "MUL", "MOD", "CARET", "TILDE", 
			"Operator_head_other", "Operator_following_character", "Implicit_parameter_name", 
			"Binary_literal", "Octal_literal", "Decimal_literal", "Pure_decimal_digits", 
			"Hexadecimal_literal", "Floating_point_literal", "Static_string_literal", 
			"Interpolated_string_literal", "WS", "Block_comment", "Line_comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Swift2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Swift2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Swift2Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTop_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTop_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTop_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					statement();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(520);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Swift2Parser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public Defer_statementContext defer_statement() {
			return getRuleContext(Defer_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				expression();
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(523);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				declaration();
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(527);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				loop_statement();
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(531);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				branch_statement();
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(535);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(538);
				labeled_statement();
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(539);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(542);
				control_transfer_statement();
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(543);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				defer_statement();
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(547);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(550);
				do_statement();
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(551);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(554);
				compiler_control_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(557);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(560); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_while_statementContext repeat_while_statement() {
			return getRuleContext(Repeat_while_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop_statement);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(565);
				repeat_while_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(Swift2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Swift2Parser.SEMI, i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_statement);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(T__0);
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(569);
					for_init();
					}
					break;
				}
				setState(572);
				match(SEMI);
				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(573);
					expression();
					}
					break;
				}
				setState(576);
				match(SEMI);
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(577);
					expression();
					}
					break;
				}
				setState(580);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(T__0);
				setState(582);
				match(LPAREN);
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(583);
					for_init();
					}
					break;
				}
				setState(586);
				match(SEMI);
				setState(588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(587);
					expression();
					}
					break;
				}
				setState(590);
				match(SEMI);
				setState(592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(591);
					expression();
					}
					break;
				}
				setState(594);
				match(RPAREN);
				setState(595);
				code_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_init);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_in_statementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFor_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__0);
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(603);
				match(T__1);
				}
				break;
			}
			setState(606);
			pattern(0);
			setState(607);
			match(T__2);
			setState(608);
			expression();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(609);
				where_clause();
				}
			}

			setState(612);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(T__3);
			setState(615);
			condition_clause();
			setState(616);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_clauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCondition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCondition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCondition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition_clause);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				expression();
				setState(620);
				match(COMMA);
				setState(621);
				condition_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				condition_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				availability_condition();
				setState(625);
				match(COMMA);
				setState(626);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCondition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCondition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCondition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_listContext condition_list() throws RecognitionException {
		Condition_listContext _localctx = new Condition_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			condition();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(631);
				match(COMMA);
				setState(632);
				condition();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public Case_conditionContext case_condition() {
			return getRuleContext(Case_conditionContext.class,0);
		}
		public Optional_binding_conditionContext optional_binding_condition() {
			return getRuleContext(Optional_binding_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				availability_condition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				case_condition();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				optional_binding_condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCase_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCase_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCase_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(T__1);
			setState(644);
			pattern(0);
			setState(645);
			initializer();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(646);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_conditionContext extends ParserRuleContext {
		public Optional_binding_headContext optional_binding_head() {
			return getRuleContext(Optional_binding_headContext.class,0);
		}
		public Optional_binding_continuation_listContext optional_binding_continuation_list() {
			return getRuleContext(Optional_binding_continuation_listContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Optional_binding_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOptional_binding_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOptional_binding_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOptional_binding_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_conditionContext optional_binding_condition() throws RecognitionException {
		Optional_binding_conditionContext _localctx = new Optional_binding_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_optional_binding_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			optional_binding_head();
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(650);
				optional_binding_continuation_list();
				}
				break;
			}
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(653);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_headContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOptional_binding_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOptional_binding_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOptional_binding_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_headContext optional_binding_head() throws RecognitionException {
		Optional_binding_headContext _localctx = new Optional_binding_headContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optional_binding_head);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(T__4);
				setState(657);
				pattern(0);
				setState(658);
				initializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(T__5);
				setState(661);
				pattern(0);
				setState(662);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_continuation_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public List<Optional_binding_continuationContext> optional_binding_continuation() {
			return getRuleContexts(Optional_binding_continuationContext.class);
		}
		public Optional_binding_continuationContext optional_binding_continuation(int i) {
			return getRuleContext(Optional_binding_continuationContext.class,i);
		}
		public Optional_binding_continuation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_continuation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOptional_binding_continuation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOptional_binding_continuation_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOptional_binding_continuation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_continuation_listContext optional_binding_continuation_list() throws RecognitionException {
		Optional_binding_continuation_listContext _localctx = new Optional_binding_continuation_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_optional_binding_continuation_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(COMMA);
			setState(667);
			optional_binding_continuation();
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(668);
					match(COMMA);
					setState(669);
					optional_binding_continuation();
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_continuationContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_headContext optional_binding_head() {
			return getRuleContext(Optional_binding_headContext.class,0);
		}
		public Optional_binding_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_continuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOptional_binding_continuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOptional_binding_continuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOptional_binding_continuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_continuationContext optional_binding_continuation() throws RecognitionException {
		Optional_binding_continuationContext _localctx = new Optional_binding_continuationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optional_binding_continuation);
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				pattern(0);
				setState(676);
				initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				optional_binding_head();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_while_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRepeat_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRepeat_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRepeat_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_while_statementContext repeat_while_statement() throws RecognitionException {
		Repeat_while_statementContext _localctx = new Repeat_while_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__6);
			setState(682);
			code_block();
			setState(683);
			match(T__3);
			setState(684);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Guard_statementContext guard_statement() {
			return getRuleContext(Guard_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBranch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_branch_statement);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				guard_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				switch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__7);
			setState(692);
			condition_clause();
			setState(693);
			code_block();
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(694);
				else_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_clause);
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(T__8);
				setState(698);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(T__8);
				setState(700);
				if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Guard_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGuard_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGuard_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGuard_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_statementContext guard_statement() throws RecognitionException {
		Guard_statementContext _localctx = new Guard_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_guard_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__9);
			setState(704);
			condition_clause();
			setState(705);
			match(T__8);
			setState(706);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__10);
			setState(709);
			expression();
			setState(710);
			match(LCURLY);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(711);
				switch_cases();
				}
			}

			setState(714);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSwitch_cases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSwitch_cases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSwitch_cases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			switch_case();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(717);
				switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switch_case);
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				case_label();
				setState(721);
				statements();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				default_label();
				setState(724);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(T__1);
			setState(729);
			case_item_list();
			setState(730);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_item_listContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCase_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCase_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCase_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_item_list);
		int _la;
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				pattern(0);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(733);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				pattern(0);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(737);
					where_clause();
					}
				}

				setState(740);
				match(COMMA);
				setState(741);
				case_item_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_labelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDefault_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDefault_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDefault_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(T__11);
			setState(746);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_expressionContext where_expression() {
			return getRuleContext(Where_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(T__12);
			setState(749);
			where_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterWhere_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitWhere_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitWhere_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_expressionContext where_expression() throws RecognitionException {
		Where_expressionContext _localctx = new Where_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_labeled_statement);
		try {
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				statement_label();
				setState(754);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				statement_label();
				setState(757);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				statement_label();
				setState(760);
				switch_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterStatement_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitStatement_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitStatement_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			label_name();
			setState(765);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLabel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLabel_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLabel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Fallthrough_statementContext fallthrough_statement() {
			return getRuleContext(Fallthrough_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Throw_statementContext throw_statement() {
			return getRuleContext(Throw_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterControl_transfer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitControl_transfer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitControl_transfer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_control_transfer_statement);
		try {
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				break_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				continue_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				fallthrough_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				return_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(773);
				throw_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(T__13);
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(777);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(T__14);
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(781);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fallthrough_statementContext extends ParserRuleContext {
		public Fallthrough_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthrough_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFallthrough_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFallthrough_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFallthrough_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(T__16);
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(787);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_conditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public Availability_argumentsContext availability_arguments() {
			return getRuleContext(Availability_argumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Availability_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAvailability_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAvailability_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAvailability_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_conditionContext availability_condition() throws RecognitionException {
		Availability_conditionContext _localctx = new Availability_conditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_availability_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(T__17);
			setState(791);
			match(LPAREN);
			setState(792);
			availability_arguments();
			setState(793);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_argumentsContext extends ParserRuleContext {
		public List<Availability_argumentContext> availability_argument() {
			return getRuleContexts(Availability_argumentContext.class);
		}
		public Availability_argumentContext availability_argument(int i) {
			return getRuleContext(Availability_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Availability_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAvailability_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAvailability_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAvailability_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentsContext availability_arguments() throws RecognitionException {
		Availability_argumentsContext _localctx = new Availability_argumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_availability_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			availability_argument();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(796);
				match(COMMA);
				setState(797);
				availability_argument();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_argumentContext extends ParserRuleContext {
		public TerminalNode Platform() { return getToken(Swift2Parser.Platform, 0); }
		public TerminalNode MUL() { return getToken(Swift2Parser.MUL, 0); }
		public Availability_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAvailability_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAvailability_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAvailability_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentContext availability_argument() throws RecognitionException {
		Availability_argumentContext _localctx = new Availability_argumentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_availability_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_la = _input.LA(1);
			if ( !(_la==Platform || _la==MUL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throw_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(T__18);
			setState(806);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defer_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Defer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDefer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDefer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDefer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defer_statementContext defer_statement() throws RecognitionException {
		Defer_statementContext _localctx = new Defer_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_defer_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(T__19);
			setState(809);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(T__20);
			setState(812);
			code_block();
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(813);
				catch_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clausesContext extends ParserRuleContext {
		public Catch_clauseContext catch_clause() {
			return getRuleContext(Catch_clauseContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCatch_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_catch_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			catch_clause();
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(817);
				catch_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCatch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCatch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCatch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(T__21);
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(821);
				pattern(0);
				}
				break;
			}
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(824);
				where_clause();
				}
			}

			setState(827);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compiler_control_statementContext extends ParserRuleContext {
		public Build_configuration_statementContext build_configuration_statement() {
			return getRuleContext(Build_configuration_statementContext.class,0);
		}
		public Line_control_statementContext line_control_statement() {
			return getRuleContext(Line_control_statementContext.class,0);
		}
		public Compiler_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCompiler_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCompiler_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCompiler_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_control_statementContext compiler_control_statement() throws RecognitionException {
		Compiler_control_statementContext _localctx = new Compiler_control_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compiler_control_statement);
		try {
			setState(831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				build_configuration_statement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				line_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_statementContext extends ParserRuleContext {
		public Build_configurationContext build_configuration() {
			return getRuleContext(Build_configurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() {
			return getRuleContext(Build_configuration_elseif_clausesContext.class,0);
		}
		public Build_configuration_else_clauseContext build_configuration_else_clause() {
			return getRuleContext(Build_configuration_else_clauseContext.class,0);
		}
		public Build_configuration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBuild_configuration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBuild_configuration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBuild_configuration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_statementContext build_configuration_statement() throws RecognitionException {
		Build_configuration_statementContext _localctx = new Build_configuration_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_build_configuration_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(T__22);
			setState(834);
			build_configuration(0);
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(835);
				statements();
				}
				break;
			}
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(838);
				build_configuration_elseif_clauses();
				}
			}

			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(841);
				build_configuration_else_clause();
				}
			}

			setState(844);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_elseif_clausesContext extends ParserRuleContext {
		public Build_configuration_elseif_clauseContext build_configuration_elseif_clause() {
			return getRuleContext(Build_configuration_elseif_clauseContext.class,0);
		}
		public Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() {
			return getRuleContext(Build_configuration_elseif_clausesContext.class,0);
		}
		public Build_configuration_elseif_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_elseif_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBuild_configuration_elseif_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBuild_configuration_elseif_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBuild_configuration_elseif_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() throws RecognitionException {
		Build_configuration_elseif_clausesContext _localctx = new Build_configuration_elseif_clausesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_build_configuration_elseif_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			build_configuration_elseif_clause();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(847);
				build_configuration_elseif_clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_elseif_clauseContext extends ParserRuleContext {
		public Build_configurationContext build_configuration() {
			return getRuleContext(Build_configurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_elseif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_elseif_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBuild_configuration_elseif_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBuild_configuration_elseif_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBuild_configuration_elseif_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_elseif_clauseContext build_configuration_elseif_clause() throws RecognitionException {
		Build_configuration_elseif_clauseContext _localctx = new Build_configuration_elseif_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_build_configuration_elseif_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(T__24);
			setState(851);
			build_configuration(0);
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(852);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_else_clauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBuild_configuration_else_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBuild_configuration_else_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBuild_configuration_else_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_else_clauseContext build_configuration_else_clause() throws RecognitionException {
		Build_configuration_else_clauseContext _localctx = new Build_configuration_else_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_build_configuration_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(T__25);
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(856);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configurationContext extends ParserRuleContext {
		public Platform_testing_functionContext platform_testing_function() {
			return getRuleContext(Platform_testing_functionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public List<Build_configurationContext> build_configuration() {
			return getRuleContexts(Build_configurationContext.class);
		}
		public Build_configurationContext build_configuration(int i) {
			return getRuleContext(Build_configurationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public TerminalNode BANG() { return getToken(Swift2Parser.BANG, 0); }
		public Build_ANDContext build_AND() {
			return getRuleContext(Build_ANDContext.class,0);
		}
		public Build_ORContext build_OR() {
			return getRuleContext(Build_ORContext.class,0);
		}
		public Build_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBuild_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBuild_configuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBuild_configuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configurationContext build_configuration() throws RecognitionException {
		return build_configuration(0);
	}

	private Build_configurationContext build_configuration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Build_configurationContext _localctx = new Build_configurationContext(_ctx, _parentState);
		Build_configurationContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_build_configuration, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
				{
				setState(860);
				platform_testing_function();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				{
				setState(861);
				identifier();
				}
				break;
			case T__98:
			case T__99:
				{
				setState(862);
				boolean_literal();
				}
				break;
			case LPAREN:
				{
				setState(863);
				match(LPAREN);
				setState(864);
				build_configuration(0);
				setState(865);
				match(RPAREN);
				}
				break;
			case BANG:
				{
				setState(867);
				match(BANG);
				setState(868);
				build_configuration(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(879);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(871);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(872);
						build_AND();
						setState(873);
						build_configuration(3);
						}
						break;
					case 2:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(875);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(876);
						build_OR();
						setState(877);
						build_configuration(2);
						}
						break;
					}
					} 
				}
				setState(883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Platform_testing_functionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public Operating_systemContext operating_system() {
			return getRuleContext(Operating_systemContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public Platform_testing_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_testing_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPlatform_testing_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPlatform_testing_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPlatform_testing_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_testing_functionContext platform_testing_function() throws RecognitionException {
		Platform_testing_functionContext _localctx = new Platform_testing_functionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_platform_testing_function);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				match(T__26);
				setState(885);
				match(LPAREN);
				setState(886);
				operating_system();
				setState(887);
				match(RPAREN);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				match(T__27);
				setState(890);
				match(LPAREN);
				setState(891);
				architecture();
				setState(892);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operating_systemContext extends ParserRuleContext {
		public Operating_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOperating_system(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOperating_system(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOperating_system(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operating_systemContext operating_system() throws RecognitionException {
		Operating_systemContext _localctx = new Operating_systemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operating_system);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchitectureContext extends ParserRuleContext {
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitArchitecture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitArchitecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_control_statementContext extends ParserRuleContext {
		public Line_numberContext line_number() {
			return getRuleContext(Line_numberContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Line_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLine_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLine_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLine_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_control_statementContext line_control_statement() throws RecognitionException {
		Line_control_statementContext _localctx = new Line_control_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_line_control_statement);
		try {
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(T__36);
				setState(902);
				line_number();
				setState(903);
				file_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_numberContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Line_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLine_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLine_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLine_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_numberContext line_number() throws RecognitionException {
		Line_numberContext _localctx = new Line_numberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_line_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(Swift2Parser.Static_string_literal, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(Static_string_literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift2Parser.LT, 0); }
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift2Parser.GT, 0); }
		public Requirement_clauseContext requirement_clause() {
			return getRuleContext(Requirement_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGeneric_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGeneric_parameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGeneric_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_generic_parameter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(LT);
			setState(912);
			generic_parameter_list();
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(913);
				requirement_clause();
				}
			}

			setState(916);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_listContext extends ParserRuleContext {
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
		}
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGeneric_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGeneric_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGeneric_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_generic_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			generic_parameter();
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(919);
				match(COMMA);
				setState(920);
				generic_parameter();
				}
				}
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameterContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGeneric_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGeneric_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGeneric_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_generic_parameter);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				type_name();
				setState(928);
				match(COLON);
				setState(929);
				type_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(931);
				type_name();
				setState(932);
				match(COLON);
				setState(933);
				protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRequirement_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRequirement_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRequirement_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_clauseContext requirement_clause() throws RecognitionException {
		Requirement_clauseContext _localctx = new Requirement_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_requirement_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(T__12);
			setState(938);
			requirement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_listContext extends ParserRuleContext {
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRequirement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRequirement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRequirement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_requirement_list);
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				requirement();
				setState(942);
				match(COMMA);
				setState(943);
				requirement_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_requirement);
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				same_type_requirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conformance_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterConformance_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitConformance_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitConformance_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_conformance_requirement);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				type_identifier();
				setState(952);
				match(COLON);
				setState(953);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				type_identifier();
				setState(956);
				match(COLON);
				setState(957);
				protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_requirementContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Same_type_equalsContext same_type_equals() {
			return getRuleContext(Same_type_equalsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSame_type_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSame_type_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSame_type_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			type_identifier();
			setState(962);
			same_type_equals();
			setState(963);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift2Parser.LT, 0); }
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift2Parser.GT, 0); }
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGeneric_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGeneric_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGeneric_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(LT);
			setState(966);
			generic_argument_list();
			setState(967);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_listContext extends ParserRuleContext {
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
		}
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGeneric_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGeneric_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGeneric_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			generic_argument();
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(970);
				match(COMMA);
				setState(971);
				generic_argument();
				}
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGeneric_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGeneric_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGeneric_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Extension_declarationContext extension_declaration() {
			return getRuleContext(Extension_declarationContext.class,0);
		}
		public Subscript_declarationContext subscript_declaration() {
			return getRuleContext(Subscript_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declaration);
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(981);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(982);
				typealias_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(983);
				function_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(984);
				enum_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(985);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(986);
				class_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(987);
				protocol_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(988);
				initializer_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(989);
				deinitializer_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(990);
				extension_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(991);
				subscript_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(992);
				operator_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(995);
				declaration();
				}
				}
				setState(998); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_level_declarationContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTop_level_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTop_level_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTop_level_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1000);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(LCURLY);
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1004);
				statements();
				}
				break;
			}
			setState(1007);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_declarationContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitImport_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitImport_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1009);
				attributes();
				}
			}

			setState(1012);
			match(T__37);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(1013);
				import_kind();
				}
			}

			setState(1016);
			import_path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_kindContext extends ParserRuleContext {
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterImport_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitImport_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitImport_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_pathContext extends ParserRuleContext {
		public Import_path_identifierContext import_path_identifier() {
			return getRuleContext(Import_path_identifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterImport_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitImport_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitImport_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_import_path);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				import_path_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				import_path_identifier();
				setState(1022);
				match(DOT);
				setState(1023);
				import_path();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_path_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterImport_path_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitImport_path_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitImport_path_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_import_path_identifier);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1031);
				attributes();
				}
				break;
			}
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1034);
				declaration_modifiers();
				}
			}

			setState(1037);
			match(T__4);
			setState(1038);
			pattern_initializer_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
		}
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPattern_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPattern_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPattern_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			pattern_initializer();
			setState(1045);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1041);
					match(COMMA);
					setState(1042);
					pattern_initializer();
					}
					} 
				}
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPattern_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPattern_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPattern_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			pattern(0);
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1049);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			assignment_operator();
			setState(1053);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public List<Type_annotationContext> type_annotation() {
			return getRuleContexts(Type_annotationContext.class);
		}
		public Type_annotationContext type_annotation(int i) {
			return getRuleContext(Type_annotationContext.class,i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_variable_declaration);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				variable_declaration_head();
				setState(1056);
				pattern_initializer_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				variable_declaration_head();
				setState(1059);
				variable_name();
				setState(1060);
				type_annotation();
				setState(1061);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063);
				variable_declaration_head();
				setState(1064);
				variable_name();
				setState(1065);
				type_annotation();
				setState(1066);
				getter_setter_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1068);
				variable_declaration_head();
				setState(1069);
				variable_name();
				setState(1070);
				type_annotation();
				setState(1071);
				getter_setter_keyword_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1073);
				variable_declaration_head();
				setState(1074);
				variable_name();
				setState(1075);
				type_annotation();
				setState(1077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1076);
					initializer();
					}
					break;
				}
				setState(1079);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1081);
				variable_declaration_head();
				setState(1082);
				variable_name();
				setState(1083);
				type_annotation();
				setState(1084);
				type_annotation();
				setState(1086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(1085);
					initializer();
					}
					break;
				}
				setState(1088);
				willSet_didSet_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterVariable_declaration_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitVariable_declaration_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitVariable_declaration_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1092);
				attributes();
				}
				break;
			}
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1095);
				declaration_modifiers();
				}
			}

			setState(1098);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGetter_setter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGetter_setter_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGetter_setter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_getter_setter_block);
		int _la;
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				match(LCURLY);
				setState(1103);
				getter_clause();
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1104);
					setter_clause();
					}
				}

				setState(1107);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				match(LCURLY);
				setState(1110);
				setter_clause();
				setState(1111);
				getter_clause();
				setState(1112);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_getter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1116);
				attributes();
				}
				break;
			}
			setState(1119);
			match(T__44);
			setState(1120);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1122);
				attributes();
				}
				break;
			}
			setState(1125);
			match(T__45);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1126);
				setter_name();
				}
			}

			setState(1129);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_nameContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSetter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSetter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSetter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(LPAREN);
			setState(1132);
			identifier();
			setState(1133);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGetter_setter_keyword_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGetter_setter_keyword_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGetter_setter_keyword_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				match(LCURLY);
				setState(1136);
				getter_keyword_clause();
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1137);
					setter_keyword_clause();
					}
				}

				setState(1140);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				match(LCURLY);
				setState(1143);
				setter_keyword_clause();
				setState(1144);
				getter_keyword_clause();
				setState(1145);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterGetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitGetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitGetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_getter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1149);
				attributes();
				}
				break;
			}
			setState(1152);
			match(T__44);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(1154);
				attributes();
				}
				break;
			}
			setState(1157);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterWillSet_didSet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitWillSet_didSet_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitWillSet_didSet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				match(LCURLY);
				setState(1160);
				willSet_clause();
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1161);
					didSet_clause();
					}
				}

				setState(1164);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				match(LCURLY);
				setState(1167);
				didSet_clause();
				setState(1168);
				willSet_clause();
				setState(1169);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterWillSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitWillSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitWillSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1173);
				attributes();
				}
				break;
			}
			setState(1176);
			match(T__46);
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1177);
				setter_name();
				}
			}

			setState(1180);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DidSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDidSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDidSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDidSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1182);
				attributes();
				}
				break;
			}
			setState(1185);
			match(T__47);
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1186);
				setter_name();
				}
			}

			setState(1189);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_declarationContext extends ParserRuleContext {
		public Typealias_headContext typealias_head() {
			return getRuleContext(Typealias_headContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTypealias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTypealias_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTypealias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			typealias_head();
			setState(1192);
			typealias_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_headContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Typealias_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTypealias_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTypealias_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTypealias_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_headContext typealias_head() throws RecognitionException {
		Typealias_headContext _localctx = new Typealias_headContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typealias_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1194);
				attributes();
				}
			}

			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1197);
				access_level_modifier();
				}
			}

			setState(1200);
			match(T__38);
			setState(1201);
			typealias_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTypealias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTypealias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTypealias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typealias_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTypealias_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTypealias_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTypealias_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			assignment_operator();
			setState(1206);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			function_head();
			setState(1209);
			function_name();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1210);
				generic_parameter_clause();
				}
			}

			setState(1213);
			function_signature();
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1214);
				function_body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1217);
				attributes();
				}
				break;
			}
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1220);
				declaration_modifiers();
				}
			}

			setState(1223);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_function_name);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_function_signature);
		try {
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				parameter_clauses();
				setState(1231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1230);
					match(T__48);
					}
					break;
				}
				setState(1234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1233);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				parameter_clauses();
				setState(1237);
				match(T__49);
				setState(1239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1238);
					function_result();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			arrow_operator();
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1244);
				attributes();
				}
				break;
			}
			setState(1247);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_clausesContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Parameter_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterParameter_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitParameter_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitParameter_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clausesContext parameter_clauses() throws RecognitionException {
		Parameter_clausesContext _localctx = new Parameter_clausesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_parameter_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			parameter_clause();
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1252);
				parameter_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterParameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitParameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitParameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_parameter_clause);
		try {
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				match(LPAREN);
				setState(1256);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				match(LPAREN);
				setState(1258);
				parameter_list();
				setState(1259);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			parameter();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1264);
				match(COMMA);
				setState(1265);
				parameter();
				}
				}
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parameter);
		int _la;
		try {
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(1271);
					match(T__4);
					}
				}

				setState(1275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1274);
					external_parameter_name();
					}
					break;
				}
				setState(1277);
				local_parameter_name();
				setState(1279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1278);
					type_annotation();
					}
					break;
				}
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1281);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				match(T__5);
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1285);
					external_parameter_name();
					}
					break;
				}
				setState(1288);
				local_parameter_name();
				setState(1290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1289);
					type_annotation();
					}
					break;
				}
				setState(1293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1292);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				match(T__50);
				setState(1297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1296);
					external_parameter_name();
					}
					break;
				}
				setState(1299);
				local_parameter_name();
				setState(1300);
				type_annotation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1302);
					external_parameter_name();
					}
					break;
				}
				setState(1305);
				local_parameter_name();
				setState(1306);
				type_annotation();
				setState(1307);
				range_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(Swift2Parser.UNDERSCORE, 0); }
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExternal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExternal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExternal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_external_parameter_name);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(Swift2Parser.UNDERSCORE, 0); }
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLocal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLocal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLocal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_local_parameter_name);
		try {
			setState(1317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDefault_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDefault_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDefault_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			assignment_operator();
			setState(1320);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public Union_style_enumContext union_style_enum() {
			return getRuleContext(Union_style_enumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Raw_value_style_enumContext raw_value_style_enum() {
			return getRuleContext(Raw_value_style_enumContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitEnum_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enum_declaration);
		int _la;
		try {
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1322);
					attributes();
					}
					break;
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
					{
					setState(1325);
					access_level_modifier();
					}
				}

				setState(1328);
				union_style_enum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1329);
					attributes();
					}
				}

				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
					{
					setState(1332);
					access_level_modifier();
					}
				}

				setState(1335);
				raw_value_style_enum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterUnion_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitUnion_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitUnion_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(1338);
				match(T__51);
				}
			}

			setState(1341);
			match(T__41);
			setState(1342);
			enum_name();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1343);
				generic_parameter_clause();
				}
			}

			setState(1347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1346);
				type_inheritance_clause();
				}
			}

			setState(1349);
			match(LCURLY);
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1350);
				union_style_enum_members();
				}
			}

			setState(1353);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_membersContext extends ParserRuleContext {
		public Union_style_enum_memberContext union_style_enum_member() {
			return getRuleContext(Union_style_enum_memberContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterUnion_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitUnion_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitUnion_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			union_style_enum_member();
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1356);
				union_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Union_style_enum_case_clauseContext union_style_enum_case_clause() {
			return getRuleContext(Union_style_enum_case_clauseContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterUnion_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitUnion_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitUnion_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_union_style_enum_member);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				union_style_enum_case_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_clauseContext extends ParserRuleContext {
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Union_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterUnion_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitUnion_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitUnion_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1363);
				attributes();
				}
				break;
			}
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(1366);
				match(T__51);
				}
			}

			setState(1369);
			match(T__1);
			setState(1370);
			union_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_listContext extends ParserRuleContext {
		public Union_style_enum_caseContext union_style_enum_case() {
			return getRuleContext(Union_style_enum_caseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterUnion_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitUnion_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitUnion_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_union_style_enum_case_list);
		try {
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372);
				union_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				union_style_enum_case();
				setState(1374);
				match(COMMA);
				setState(1375);
				union_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Union_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterUnion_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitUnion_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitUnion_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			enum_case_name();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1380);
				tuple_type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitEnum_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitEnum_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterEnum_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitEnum_case_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitEnum_case_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(T__41);
			setState(1388);
			enum_name();
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1389);
				generic_parameter_clause();
				}
			}

			setState(1392);
			type_inheritance_clause();
			setState(1393);
			match(LCURLY);
			setState(1394);
			raw_value_style_enum_members();
			setState(1395);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_membersContext extends ParserRuleContext {
		public Raw_value_style_enum_memberContext raw_value_style_enum_member() {
			return getRuleContext(Raw_value_style_enum_memberContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Raw_value_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			raw_value_style_enum_member();
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1398);
				raw_value_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() {
			return getRuleContext(Raw_value_style_enum_case_clauseContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_raw_value_style_enum_member);
		try {
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				raw_value_style_enum_case_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_clauseContext extends ParserRuleContext {
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1405);
				attributes();
				}
			}

			setState(1408);
			match(T__1);
			setState(1409);
			raw_value_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_listContext extends ParserRuleContext {
		public Raw_value_style_enum_caseContext raw_value_style_enum_case() {
			return getRuleContext(Raw_value_style_enum_caseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_raw_value_style_enum_case_list);
		try {
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				raw_value_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				raw_value_style_enum_case();
				setState(1413);
				match(COMMA);
				setState(1414);
				raw_value_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Raw_value_assignmentContext raw_value_assignment() {
			return getRuleContext(Raw_value_assignmentContext.class,0);
		}
		public Raw_value_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_raw_value_style_enum_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			enum_case_name();
			setState(1420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1419);
				raw_value_assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Raw_value_literalContext raw_value_literal() {
			return getRuleContext(Raw_value_literalContext.class,0);
		}
		public Raw_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			assignment_operator();
			setState(1423);
			raw_value_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_literalContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public TerminalNode Static_string_literal() { return getToken(Swift2Parser.Static_string_literal, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Raw_value_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRaw_value_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRaw_value_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRaw_value_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_literalContext raw_value_literal() throws RecognitionException {
		Raw_value_literalContext _localctx = new Raw_value_literalContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_raw_value_literal);
		try {
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1426);
				match(Static_string_literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1427);
				boolean_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1430);
				attributes();
				}
			}

			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1433);
				access_level_modifier();
				}
			}

			setState(1436);
			match(T__39);
			setState(1437);
			struct_name();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1438);
				generic_parameter_clause();
				}
			}

			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1441);
				type_inheritance_clause();
				}
			}

			setState(1444);
			struct_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitStruct_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(LCURLY);
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1449);
				declarations();
				}
			}

			setState(1452);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1454);
				attributes();
				}
			}

			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1457);
				access_level_modifier();
				}
			}

			setState(1460);
			match(T__40);
			setState(1461);
			class_name();
			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1462);
				generic_parameter_clause();
				}
			}

			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1465);
				type_inheritance_clause();
				}
			}

			setState(1468);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(LCURLY);
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1473);
				declarations();
				}
			}

			setState(1476);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_bodyContext protocol_body() {
			return getRuleContext(Protocol_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1478);
				attributes();
				}
			}

			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1481);
				access_level_modifier();
				}
			}

			setState(1484);
			match(T__42);
			setState(1485);
			protocol_name();
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1486);
				type_inheritance_clause();
				}
			}

			setState(1489);
			protocol_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(LCURLY);
			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__40) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1494);
				protocol_member_declarations();
				}
			}

			setState(1497);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_member_declarationContext extends ParserRuleContext {
		public Protocol_property_declarationContext protocol_property_declaration() {
			return getRuleContext(Protocol_property_declarationContext.class,0);
		}
		public Protocol_method_declarationContext protocol_method_declaration() {
			return getRuleContext(Protocol_method_declarationContext.class,0);
		}
		public Protocol_initializer_declarationContext protocol_initializer_declaration() {
			return getRuleContext(Protocol_initializer_declarationContext.class,0);
		}
		public Protocol_subscript_declarationContext protocol_subscript_declaration() {
			return getRuleContext(Protocol_subscript_declarationContext.class,0);
		}
		public Protocol_associated_type_declarationContext protocol_associated_type_declaration() {
			return getRuleContext(Protocol_associated_type_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_protocol_member_declaration);
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1499);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1501);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1502);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1503);
				protocol_associated_type_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_member_declarationsContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationsContext protocol_member_declarations() throws RecognitionException {
		Protocol_member_declarationsContext _localctx = new Protocol_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_protocol_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			protocol_member_declaration();
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__40) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1507);
				protocol_member_declarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_property_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_property_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_property_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			variable_declaration_head();
			setState(1511);
			variable_name();
			setState(1512);
			type_annotation();
			setState(1513);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_method_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			function_head();
			setState(1516);
			function_name();
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1517);
				generic_parameter_clause();
				}
			}

			setState(1520);
			function_signature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_initializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_initializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_initializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_protocol_initializer_declaration);
		int _la;
		try {
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				initializer_head();
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1523);
					generic_parameter_clause();
					}
				}

				setState(1526);
				parameter_clause();
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1527);
					match(T__48);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				initializer_head();
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1531);
					generic_parameter_clause();
					}
				}

				setState(1534);
				parameter_clause();
				setState(1535);
				match(T__49);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_subscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_subscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_subscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			subscript_head();
			setState(1540);
			subscript_result();
			setState(1541);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_associated_type_declarationContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Protocol_associated_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_associated_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_associated_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_associated_type_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_associated_type_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1543);
				attributes();
				}
			}

			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1546);
				access_level_modifier();
				}
			}

			setState(1549);
			match(T__52);
			setState(1550);
			typealias_name();
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1551);
				type_inheritance_clause();
				}
				break;
			}
			setState(1555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1554);
				typealias_assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_bodyContext initializer_body() {
			return getRuleContext(Initializer_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_initializer_declaration);
		int _la;
		try {
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				initializer_head();
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1558);
					generic_parameter_clause();
					}
				}

				setState(1561);
				parameter_clause();
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1562);
					match(T__48);
					}
				}

				setState(1565);
				initializer_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				initializer_head();
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1568);
					generic_parameter_clause();
					}
				}

				setState(1571);
				parameter_clause();
				setState(1572);
				match(T__49);
				setState(1573);
				initializer_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift2Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift2Parser.BANG, 0); }
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInitializer_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInitializer_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInitializer_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_initializer_head);
		int _la;
		try {
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1577);
					attributes();
					}
					break;
				}
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1580);
					declaration_modifiers();
					}
				}

				setState(1583);
				match(T__53);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1584);
					attributes();
					}
					break;
				}
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1587);
					declaration_modifiers();
					}
				}

				setState(1590);
				match(T__53);
				setState(1591);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1592);
					attributes();
					}
					break;
				}
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1595);
					declaration_modifiers();
					}
				}

				setState(1598);
				match(T__53);
				setState(1599);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInitializer_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInitializer_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInitializer_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDeinitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDeinitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDeinitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1604);
				attributes();
				}
			}

			setState(1607);
			match(T__54);
			setState(1608);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_declarationContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Extension_bodyContext extension_body() {
			return getRuleContext(Extension_bodyContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExtension_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExtension_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExtension_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1610);
				access_level_modifier();
				}
			}

			setState(1613);
			match(T__55);
			setState(1614);
			type_identifier();
			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1615);
				type_inheritance_clause();
				}
			}

			setState(1618);
			extension_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExtension_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExtension_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExtension_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(LCURLY);
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1621);
				declarations();
				}
			}

			setState(1624);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSubscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSubscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSubscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_subscript_declaration);
		try {
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
				subscript_head();
				setState(1627);
				subscript_result();
				setState(1628);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				subscript_head();
				setState(1631);
				subscript_result();
				setState(1632);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1634);
				subscript_head();
				setState(1635);
				subscript_result();
				setState(1636);
				getter_setter_keyword_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_headContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Subscript_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSubscript_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSubscript_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSubscript_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1640);
				attributes();
				}
				break;
			}
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1643);
				declaration_modifiers();
				}
			}

			setState(1646);
			match(T__56);
			setState(1647);
			parameter_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSubscript_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSubscript_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSubscript_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_subscript_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			arrow_operator();
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1650);
				attributes();
				}
				break;
			}
			setState(1653);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_operator_declaration);
		try {
			setState(1658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(1655);
				prefix_operator_declaration();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				postfix_operator_declaration();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 3);
				{
				setState(1657);
				infix_operator_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPrefix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPrefix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPrefix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(T__57);
			setState(1661);
			match(T__58);
			setState(1662);
			operator();
			setState(1663);
			match(LCURLY);
			setState(1664);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPostfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPostfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPostfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(T__59);
			setState(1667);
			match(T__58);
			setState(1668);
			operator();
			setState(1669);
			match(LCURLY);
			setState(1670);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public Infix_operator_attributesContext infix_operator_attributes() {
			return getRuleContext(Infix_operator_attributesContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(T__60);
			setState(1673);
			match(T__58);
			setState(1674);
			operator();
			setState(1675);
			match(LCURLY);
			setState(1676);
			infix_operator_attributes();
			setState(1677);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_attributesContext extends ParserRuleContext {
		public Precedence_clauseContext precedence_clause() {
			return getRuleContext(Precedence_clauseContext.class,0);
		}
		public Associativity_clauseContext associativity_clause() {
			return getRuleContext(Associativity_clauseContext.class,0);
		}
		public Infix_operator_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInfix_operator_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInfix_operator_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInfix_operator_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_attributesContext infix_operator_attributes() throws RecognitionException {
		Infix_operator_attributesContext _localctx = new Infix_operator_attributesContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_infix_operator_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(1679);
				precedence_clause();
				}
			}

			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(1682);
				associativity_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_clauseContext extends ParserRuleContext {
		public Precedence_levelContext precedence_level() {
			return getRuleContext(Precedence_levelContext.class,0);
		}
		public Precedence_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPrecedence_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPrecedence_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPrecedence_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_clauseContext precedence_clause() throws RecognitionException {
		Precedence_clauseContext _localctx = new Precedence_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_precedence_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(T__61);
			setState(1686);
			precedence_level();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_levelContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Precedence_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPrecedence_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPrecedence_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPrecedence_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_levelContext precedence_level() throws RecognitionException {
		Precedence_levelContext _localctx = new Precedence_levelContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_precedence_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associativity_clauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public Associativity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAssociativity_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAssociativity_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAssociativity_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associativity_clauseContext associativity_clause() throws RecognitionException {
		Associativity_clauseContext _localctx = new Associativity_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_associativity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(T__62);
			setState(1691);
			associativity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAssociativity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAssociativity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_modifierContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDeclaration_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDeclaration_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDeclaration_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_declaration_modifier);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				match(T__40);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				match(T__66);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1697);
				match(T__67);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1698);
				match(T__68);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1699);
				match(T__60);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1700);
				match(T__69);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1701);
				match(T__70);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1702);
				match(T__71);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1703);
				match(T__72);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1704);
				match(T__73);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1705);
				match(T__59);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1706);
				match(T__57);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1707);
				match(T__74);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1708);
				match(T__75);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1709);
				match(T__76);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1710);
				match(T__76);
				setState(1711);
				match(LPAREN);
				setState(1712);
				match(T__77);
				setState(1713);
				match(RPAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1714);
				match(T__76);
				setState(1715);
				match(LPAREN);
				setState(1716);
				match(T__78);
				setState(1717);
				match(RPAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1718);
				match(T__79);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1719);
				access_level_modifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_modifiersContext extends ParserRuleContext {
		public Declaration_modifierContext declaration_modifier() {
			return getRuleContext(Declaration_modifierContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDeclaration_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDeclaration_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDeclaration_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			declaration_modifier();
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1723);
				declaration_modifiers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_level_modifierContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAccess_level_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAccess_level_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAccess_level_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_access_level_modifier);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1726);
				match(T__80);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				match(T__80);
				setState(1728);
				match(LPAREN);
				setState(1729);
				match(T__45);
				setState(1730);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1731);
				match(T__81);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1732);
				match(T__81);
				setState(1733);
				match(LPAREN);
				setState(1734);
				match(T__45);
				setState(1735);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1736);
				match(T__82);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1737);
				match(T__82);
				setState(1738);
				match(LPAREN);
				setState(1739);
				match(T__45);
				setState(1740);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext enum_case_pattern() {
			return getRuleContext(Enum_case_patternContext.class,0);
		}
		public Optional_patternContext optional_pattern() {
			return getRuleContext(Optional_patternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 328;
		enterRecursionRule(_localctx, 328, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1744);
				wildcard_pattern();
				setState(1746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1745);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1748);
				identifier_pattern();
				setState(1750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1749);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1752);
				value_binding_pattern();
				}
				break;
			case 4:
				{
				setState(1753);
				tuple_pattern();
				setState(1755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1754);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1757);
				enum_case_pattern();
				}
				break;
			case 6:
				{
				setState(1758);
				optional_pattern();
				}
				break;
			case 7:
				{
				setState(1759);
				match(T__83);
				setState(1760);
				type(0);
				}
				break;
			case 8:
				{
				setState(1761);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1764);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1765);
					match(T__84);
					setState(1766);
					type(0);
					}
					} 
				}
				setState(1771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Wildcard_patternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Swift2Parser.UNDERSCORE, 0); }
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitWildcard_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitWildcard_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_patternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterIdentifier_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitIdentifier_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitIdentifier_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_binding_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterValue_binding_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitValue_binding_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitValue_binding_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_value_binding_pattern);
		try {
			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1776);
				match(T__5);
				setState(1777);
				pattern(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				match(T__4);
				setState(1779);
				pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_patternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTuple_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTuple_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(LPAREN);
			setState(1784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1783);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(1786);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTuple_pattern_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTuple_pattern_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTuple_pattern_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			tuple_pattern_element();
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1789);
				match(COMMA);
				setState(1790);
				tuple_pattern_element();
				}
				}
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTuple_pattern_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTuple_pattern_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTuple_pattern_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			pattern(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_patternContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterEnum_case_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitEnum_case_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitEnum_case_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(1798);
				type_identifier();
				}
			}

			setState(1801);
			match(DOT);
			setState(1802);
			enum_case_name();
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1803);
				tuple_pattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_patternContext extends ParserRuleContext {
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift2Parser.QUESTION, 0); }
		public Optional_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOptional_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOptional_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOptional_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_patternContext optional_pattern() throws RecognitionException {
		Optional_patternContext _localctx = new Optional_patternContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			identifier_pattern();
			setState(1807);
			match(QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExpression_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExpression_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExpression_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public TerminalNode AT() { return getToken(Swift2Parser.AT, 0); }
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1811);
				match(AT);
				}
			}

			setState(1814);
			attribute_name();
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1815);
				attribute_argument_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAttribute_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAttribute_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAttribute_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(LPAREN);
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1821);
				balanced_tokens();
				}
				break;
			}
			setState(1824);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1827); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1826);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1829); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokensContext extends ParserRuleContext {
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBalanced_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBalanced_tokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBalanced_tokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1832); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1831);
					balanced_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1834); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBalanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBalanced_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBalanced_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_balanced_token);
		try {
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				match(LPAREN);
				setState(1838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1837);
					balanced_tokens();
					}
					break;
				}
				setState(1840);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1841);
				match(LBRACK);
				setState(1843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1842);
					balanced_tokens();
					}
					break;
				}
				setState(1845);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1846);
				match(LCURLY);
				setState(1848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1847);
					balanced_tokens();
					}
					break;
				}
				setState(1850);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1851);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1852);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1853);
				context_sensitive_keyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1854);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1855);
				operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Binary_expressionsContext binary_expressions() {
			return getRuleContext(Binary_expressionsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1858);
				try_operator();
				}
				break;
			}
			setState(1861);
			prefix_expression();
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1862);
				binary_expressions();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			expression();
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1866);
				match(COMMA);
				setState(1867);
				expression();
				}
				}
				setState(1872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_expressionContext extends ParserRuleContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPrefix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPrefix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_prefix_expression);
		try {
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				prefix_operator();
				setState(1874);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1877);
				in_out_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_out_expressionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Swift2Parser.AND, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterIn_out_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitIn_out_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitIn_out_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			match(AND);
			setState(1881);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_operatorContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Swift2Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift2Parser.BANG, 0); }
		public Try_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTry_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTry_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTry_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_operatorContext try_operator() throws RecognitionException {
		Try_operatorContext _localctx = new Try_operatorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_try_operator);
		try {
			setState(1888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1883);
				match(T__85);
				setState(1884);
				match(QUESTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1885);
				match(T__85);
				setState(1886);
				match(BANG);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1887);
				match(T__85);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_binary_expression);
		try {
			setState(1900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				binary_operator();
				setState(1891);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1893);
				conditional_operator();
				setState(1895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1894);
					try_operator();
					}
					break;
				}
				setState(1897);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1899);
				type_casting_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionsContext extends ParserRuleContext {
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public Binary_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBinary_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBinary_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBinary_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1903); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1902);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1905); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_operatorContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Swift2Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			match(QUESTION);
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1908);
				try_operator();
				}
				break;
			}
			setState(1911);
			expression();
			setState(1912);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_casting_operatorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift2Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift2Parser.BANG, 0); }
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterType_casting_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitType_casting_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitType_casting_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_type_casting_operator);
		try {
			setState(1924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914);
				match(T__83);
				setState(1915);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				match(T__84);
				setState(1917);
				type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1918);
				match(T__84);
				setState(1919);
				match(QUESTION);
				setState(1920);
				type(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1921);
				match(T__84);
				setState(1922);
				match(BANG);
				setState(1923);
				type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Superclass_expressionContext superclass_expression() {
			return getRuleContext(Superclass_expressionContext.class,0);
		}
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Implicit_member_expressionContext implicit_member_expression() {
			return getRuleContext(Implicit_member_expressionContext.class,0);
		}
		public Wildcard_expressionContext wildcard_expression() {
			return getRuleContext(Wildcard_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_primary_expression);
		try {
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1926);
				identifier();
				setState(1928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1927);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1930);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1931);
				self_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1932);
				superclass_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1933);
				closure_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1934);
				parenthesized_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1935);
				implicit_member_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1936);
				wildcard_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1937);
				selector_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterImplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitImplicit_member_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitImplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			match(DOT);
			setState(1941);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Dictionary_literalContext dictionary_literal() {
			return getRuleContext(Dictionary_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLiteral_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_literal_expression);
		try {
			setState(1950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1944);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1945);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1946);
				match(T__86);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1947);
				match(T__87);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1948);
				match(T__88);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1949);
				match(T__89);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(LBRACK);
			setState(1954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1953);
				array_literal_items();
				}
				break;
			}
			setState(1956);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemsContext extends ParserRuleContext {
		public List<Array_literal_itemContext> array_literal_item() {
			return getRuleContexts(Array_literal_itemContext.class);
		}
		public Array_literal_itemContext array_literal_item(int i) {
			return getRuleContext(Array_literal_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterArray_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitArray_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitArray_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_array_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			array_literal_item();
			setState(1963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1959);
					match(COMMA);
					setState(1960);
					array_literal_item();
					}
					} 
				}
				setState(1965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1966);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterArray_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitArray_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitArray_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literalContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDictionary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDictionary_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_dictionary_literal);
		try {
			setState(1978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1971);
				match(LBRACK);
				setState(1972);
				dictionary_literal_items();
				setState(1973);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				match(LBRACK);
				setState(1976);
				match(COLON);
				setState(1977);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemsContext extends ParserRuleContext {
		public List<Dictionary_literal_itemContext> dictionary_literal_item() {
			return getRuleContexts(Dictionary_literal_itemContext.class);
		}
		public Dictionary_literal_itemContext dictionary_literal_item(int i) {
			return getRuleContext(Dictionary_literal_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDictionary_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDictionary_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDictionary_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_dictionary_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			dictionary_literal_item();
			setState(1985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1981);
					match(COMMA);
					setState(1982);
					dictionary_literal_item();
					}
					} 
				}
				setState(1987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(1989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1988);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDictionary_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDictionary_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDictionary_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			expression();
			setState(1992);
			match(COLON);
			setState(1993);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Self_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSelf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSelf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSelf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_self_expression);
		try {
			setState(2007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1995);
				match(T__90);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1996);
				match(T__90);
				setState(1997);
				match(DOT);
				setState(1998);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1999);
				match(T__90);
				setState(2000);
				match(LBRACK);
				setState(2001);
				expression_list();
				setState(2002);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2004);
				match(T__90);
				setState(2005);
				match(DOT);
				setState(2006);
				match(T__53);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_expressionContext extends ParserRuleContext {
		public Superclass_method_expressionContext superclass_method_expression() {
			return getRuleContext(Superclass_method_expressionContext.class,0);
		}
		public Superclass_subscript_expressionContext superclass_subscript_expression() {
			return getRuleContext(Superclass_subscript_expressionContext.class,0);
		}
		public Superclass_initializer_expressionContext superclass_initializer_expression() {
			return getRuleContext(Superclass_initializer_expressionContext.class,0);
		}
		public Superclass_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSuperclass_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSuperclass_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSuperclass_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_superclass_expression);
		try {
			setState(2012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2009);
				superclass_method_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2010);
				superclass_subscript_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2011);
				superclass_initializer_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_method_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Superclass_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSuperclass_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSuperclass_method_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSuperclass_method_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_method_expressionContext superclass_method_expression() throws RecognitionException {
		Superclass_method_expressionContext _localctx = new Superclass_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			match(T__91);
			setState(2015);
			match(DOT);
			setState(2016);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_subscript_expressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public Superclass_subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_subscript_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSuperclass_subscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSuperclass_subscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSuperclass_subscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_subscript_expressionContext superclass_subscript_expression() throws RecognitionException {
		Superclass_subscript_expressionContext _localctx = new Superclass_subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(T__91);
			setState(2019);
			match(LBRACK);
			setState(2020);
			expression();
			setState(2021);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_initializer_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Superclass_initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSuperclass_initializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSuperclass_initializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSuperclass_initializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_initializer_expressionContext superclass_initializer_expression() throws RecognitionException {
		Superclass_initializer_expressionContext _localctx = new Superclass_initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			match(T__91);
			setState(2024);
			match(DOT);
			setState(2025);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_expressionContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift2Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift2Parser.RCURLY, 0); }
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitClosure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitClosure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(LCURLY);
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2028);
				closure_signature();
				}
				break;
			}
			setState(2032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2031);
				statements();
				}
				break;
			}
			setState(2034);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_signatureContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterClosure_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitClosure_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitClosure_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_closure_signature);
		try {
			setState(2065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				parameter_clause();
				setState(2038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2037);
					function_result();
					}
					break;
				}
				setState(2040);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				identifier_list();
				setState(2044);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2043);
					function_result();
					}
					break;
				}
				setState(2046);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2048);
				capture_list();
				setState(2049);
				parameter_clause();
				setState(2051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2050);
					function_result();
					}
					break;
				}
				setState(2053);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2055);
				capture_list();
				setState(2056);
				identifier_list();
				setState(2058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2057);
					function_result();
					}
					break;
				}
				setState(2060);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2062);
				capture_list();
				setState(2063);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_listContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public Capture_list_itemsContext capture_list_items() {
			return getRuleContext(Capture_list_itemsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCapture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCapture_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCapture_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(LBRACK);
			setState(2068);
			capture_list_items();
			setState(2069);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemsContext extends ParserRuleContext {
		public List<Capture_list_itemContext> capture_list_item() {
			return getRuleContexts(Capture_list_itemContext.class);
		}
		public Capture_list_itemContext capture_list_item(int i) {
			return getRuleContext(Capture_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Capture_list_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCapture_list_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCapture_list_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCapture_list_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemsContext capture_list_items() throws RecognitionException {
		Capture_list_itemsContext _localctx = new Capture_list_itemsContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			capture_list_item();
			setState(2076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2072);
				match(COMMA);
				setState(2073);
				capture_list_item();
				}
				}
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Capture_specifierContext capture_specifier() {
			return getRuleContext(Capture_specifierContext.class,0);
		}
		public Capture_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCapture_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCapture_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCapture_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemContext capture_list_item() throws RecognitionException {
		Capture_list_itemContext _localctx = new Capture_list_itemContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2079);
				capture_specifier();
				}
				break;
			}
			setState(2082);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_specifierContext extends ParserRuleContext {
		public Capture_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterCapture_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitCapture_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitCapture_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__79 - 77)) | (1L << (T__92 - 77)) | (1L << (T__93 - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Expression_element_listContext expression_element_list() {
			return getRuleContext(Expression_element_listContext.class,0);
		}
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
			match(LPAREN);
			setState(2088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2087);
				expression_element_list();
				}
				break;
			}
			setState(2090);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_element_listContext extends ParserRuleContext {
		public List<Expression_elementContext> expression_element() {
			return getRuleContexts(Expression_elementContext.class);
		}
		public Expression_elementContext expression_element(int i) {
			return getRuleContext(Expression_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Expression_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExpression_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExpression_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExpression_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_element_listContext expression_element_list() throws RecognitionException {
		Expression_element_listContext _localctx = new Expression_element_listContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_expression_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			expression_element();
			setState(2097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2093);
				match(COMMA);
				setState(2094);
				expression_element();
				}
				}
				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Expression_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExpression_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExpression_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExpression_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_elementContext expression_element() throws RecognitionException {
		Expression_elementContext _localctx = new Expression_elementContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_expression_element);
		try {
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2100);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				identifier();
				setState(2102);
				match(COLON);
				setState(2103);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wildcard_expressionContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Swift2Parser.UNDERSCORE, 0); }
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterWildcard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitWildcard_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitWildcard_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSelector_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSelector_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			match(T__94);
			setState(2110);
			match(LPAREN);
			setState(2111);
			expression();
			setState(2112);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_call_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_call_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression1Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(Swift2Parser.Pure_decimal_digits, 0); }
		public Explicit_member_expression1Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExplicit_member_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExplicit_member_expression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExplicit_member_expression1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Initializer_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInitializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInitializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInitializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_type_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Dynamic_type_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDynamic_type_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDynamic_type_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDynamic_type_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Postfix_self_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Postfix_self_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPostfix_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPostfix_self_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPostfix_self_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_with_closure_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_with_closure_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterFunction_call_with_closure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitFunction_call_with_closure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitFunction_call_with_closure_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expression_with_argsContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Initializer_expression_with_argsContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInitializer_expression_with_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInitializer_expression_with_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInitializer_expression_with_args(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subscript_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public Subscript_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSubscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSubscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSubscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression2Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Explicit_member_expression2Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExplicit_member_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExplicit_member_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExplicit_member_expression2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression3Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Explicit_member_expression3Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExplicit_member_expression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExplicit_member_expression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExplicit_member_expression3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression4Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Explicit_member_expression4Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterExplicit_member_expression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitExplicit_member_expression4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitExplicit_member_expression4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Postfix_operationContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Postfix_operationContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPostfix_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPostfix_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPostfix_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 428;
		enterRecursionRule(_localctx, 428, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2115);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_operationContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2117);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2118);
						postfix_operator();
						}
						break;
					case 2:
						{
						_localctx = new Function_call_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2119);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2120);
						parenthesized_expression();
						}
						break;
					case 3:
						{
						_localctx = new Function_call_with_closure_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2121);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(2122);
							parenthesized_expression();
							}
						}

						setState(2125);
						trailing_closure();
						}
						break;
					case 4:
						{
						_localctx = new Initializer_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2126);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2127);
						match(DOT);
						setState(2128);
						match(T__53);
						}
						break;
					case 5:
						{
						_localctx = new Initializer_expression_with_argsContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2129);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2130);
						match(DOT);
						setState(2131);
						match(T__53);
						setState(2132);
						match(LPAREN);
						setState(2133);
						argument_names();
						setState(2134);
						match(RPAREN);
						}
						break;
					case 6:
						{
						_localctx = new Explicit_member_expression1Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2136);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2137);
						match(DOT);
						setState(2138);
						match(Pure_decimal_digits);
						}
						break;
					case 7:
						{
						_localctx = new Explicit_member_expression2Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2140);
						match(DOT);
						setState(2141);
						identifier();
						setState(2143);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
						case 1:
							{
							setState(2142);
							generic_argument_clause();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new Explicit_member_expression3Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2145);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2146);
						match(DOT);
						setState(2147);
						identifier();
						setState(2148);
						match(LPAREN);
						setState(2149);
						argument_names();
						setState(2150);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new Explicit_member_expression4Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2153);
						match(LPAREN);
						setState(2154);
						argument_names();
						setState(2155);
						match(RPAREN);
						}
						break;
					case 10:
						{
						_localctx = new Postfix_self_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2158);
						match(DOT);
						setState(2159);
						match(T__90);
						}
						break;
					case 11:
						{
						_localctx = new Dynamic_type_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2161);
						match(DOT);
						setState(2162);
						match(T__95);
						}
						break;
					case 12:
						{
						_localctx = new Subscript_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2163);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2164);
						match(LBRACK);
						setState(2165);
						expression_list();
						setState(2166);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(2172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Argument_namesContext extends ParserRuleContext {
		public Argument_nameContext argument_name() {
			return getRuleContext(Argument_nameContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterArgument_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitArgument_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitArgument_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			argument_name();
			setState(2175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(2174);
				argument_names();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterArgument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitArgument_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitArgument_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			identifier();
			setState(2178);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trailing_closureContext extends ParserRuleContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTrailing_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTrailing_closure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTrailing_closure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trailing_closureContext trailing_closure() throws RecognitionException {
		Trailing_closureContext _localctx = new Trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			closure_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift2Parser.LBRACK, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(Swift2Parser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift2Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift2Parser.BANG, 0); }
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2183);
				match(LBRACK);
				setState(2184);
				type(0);
				setState(2185);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2187);
				match(LBRACK);
				setState(2188);
				type(0);
				setState(2189);
				match(COLON);
				setState(2190);
				type(0);
				setState(2191);
				match(RBRACK);
				}
				break;
			case 3:
				{
				setState(2193);
				type_identifier();
				}
				break;
			case 4:
				{
				setState(2194);
				tuple_type();
				}
				break;
			case 5:
				{
				setState(2195);
				protocol_composition_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2198);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2200);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
						case 1:
							{
							setState(2199);
							match(T__48);
							}
							break;
						}
						setState(2202);
						arrow_operator();
						setState(2203);
						type(10);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2205);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2206);
						match(T__49);
						setState(2207);
						arrow_operator();
						setState(2208);
						type(9);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2210);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2211);
						match(QUESTION);
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2212);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2213);
						match(BANG);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2214);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2215);
						match(DOT);
						setState(2216);
						match(T__96);
						}
						break;
					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2217);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2218);
						match(DOT);
						setState(2219);
						match(T__97);
						}
						break;
					}
					} 
				}
				setState(2224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_annotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitType_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_type_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(COLON);
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2226);
				attributes();
				}
				break;
			}
			setState(2229);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_identifierContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitType_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitType_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_type_identifier);
		int _la;
		try {
			setState(2242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2231);
				type_name();
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2232);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2235);
				type_name();
				setState(2237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2236);
					generic_argument_clause();
					}
				}

				setState(2239);
				match(DOT);
				setState(2240);
				type_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift2Parser.RPAREN, 0); }
		public Tuple_type_bodyContext tuple_type_body() {
			return getRuleContext(Tuple_type_bodyContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			match(LPAREN);
			setState(2248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(2247);
				tuple_type_body();
				}
			}

			setState(2250);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_bodyContext extends ParserRuleContext {
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Tuple_type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTuple_type_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTuple_type_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTuple_type_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_bodyContext tuple_type_body() throws RecognitionException {
		Tuple_type_bodyContext _localctx = new Tuple_type_bodyContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_tuple_type_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			tuple_type_element_list();
			setState(2254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2253);
				range_operator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public Tuple_type_elementContext tuple_type_element() {
			return getRuleContext(Tuple_type_elementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTuple_type_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTuple_type_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTuple_type_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_tuple_type_element_list);
		try {
			setState(2261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2256);
				tuple_type_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2257);
				tuple_type_element();
				setState(2258);
				match(COMMA);
				setState(2259);
				tuple_type_element_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitTuple_type_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_tuple_type_element);
		int _la;
		try {
			setState(2276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2263);
					attributes();
					}
					break;
				}
				setState(2267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(2266);
					match(T__50);
					}
				}

				setState(2269);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(2270);
					match(T__50);
					}
				}

				setState(2273);
				element_name();
				setState(2274);
				type_annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterElement_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitElement_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitElement_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift2Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Swift2Parser.GT, 0); }
		public Protocol_identifier_listContext protocol_identifier_list() {
			return getRuleContext(Protocol_identifier_listContext.class,0);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_composition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_composition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_composition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_protocol_composition_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			match(T__42);
			setState(2281);
			match(LT);
			setState(2283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (COMMA - 64)))) != 0)) {
				{
				setState(2282);
				protocol_identifier_list();
				}
			}

			setState(2285);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_identifier_listContext extends ParserRuleContext {
		public List<Protocol_identifierContext> protocol_identifier() {
			return getRuleContexts(Protocol_identifierContext.class);
		}
		public Protocol_identifierContext protocol_identifier(int i) {
			return getRuleContext(Protocol_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Protocol_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_identifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_identifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifier_listContext protocol_identifier_list() throws RecognitionException {
		Protocol_identifier_listContext _localctx = new Protocol_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_protocol_identifier_list);
		int _la;
		try {
			setState(2294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2287);
				protocol_identifier();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(2290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2288);
					match(COMMA);
					setState(2289);
					protocol_identifier();
					}
					}
					setState(2292); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_identifierContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterProtocol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitProtocol_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitProtocol_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifierContext protocol_identifier() throws RecognitionException {
		Protocol_identifierContext _localctx = new Protocol_identifierContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_clauseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift2Parser.COLON, 0); }
		public Class_requirementContext class_requirement() {
			return getRuleContext(Class_requirementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterType_inheritance_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitType_inheritance_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitType_inheritance_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_type_inheritance_clause);
		try {
			setState(2307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2298);
				match(COLON);
				setState(2299);
				class_requirement();
				setState(2300);
				match(COMMA);
				setState(2301);
				type_inheritance_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2303);
				match(COLON);
				setState(2304);
				class_requirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2305);
				match(COLON);
				setState(2306);
				type_inheritance_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_listContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift2Parser.COMMA, 0); }
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterType_inheritance_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitType_inheritance_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitType_inheritance_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_type_inheritance_list);
		try {
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2310);
				type_identifier();
				setState(2311);
				match(COMMA);
				setState(2312);
				type_inheritance_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_requirementContext extends ParserRuleContext {
		public Class_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterClass_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitClass_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitClass_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_requirementContext class_requirement() throws RecognitionException {
		Class_requirementContext _localctx = new Class_requirementContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_class_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift2Parser.Identifier, 0); }
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_identifier);
		try {
			setState(2320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2318);
				match(Identifier);
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
				enterOuterAlt(_localctx, 2);
				{
				setState(2319);
				context_sensitive_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift2Parser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			identifier();
			setState(2327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2323);
					match(COMMA);
					setState(2324);
					identifier();
					}
					} 
				}
				setState(2329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_sensitive_keywordContext extends ParserRuleContext {
		public Context_sensitive_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_sensitive_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterContext_sensitive_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitContext_sensitive_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitContext_sensitive_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_sensitive_keywordContext context_sensitive_keyword() throws RecognitionException {
		Context_sensitive_keywordContext _localctx = new Context_sensitive_keywordContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_context_sensitive_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Swift2Parser.EQUAL, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2333);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negate_prefix_operatorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Swift2Parser.SUB, 0); }
		public Negate_prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterNegate_prefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitNegate_prefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitNegate_prefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_prefix_operatorContext negate_prefix_operator() throws RecognitionException {
		Negate_prefix_operatorContext _localctx = new Negate_prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2336);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_ANDContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(Swift2Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Swift2Parser.AND, i);
		}
		public Build_ANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_AND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBuild_AND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBuild_AND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBuild_AND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_ANDContext build_AND() throws RecognitionException {
		Build_ANDContext _localctx = new Build_ANDContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_build_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(2339);
			match(AND);
			setState(2340);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_ORContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(Swift2Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Swift2Parser.OR, i);
		}
		public Build_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_OR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBuild_OR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBuild_OR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBuild_OR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_ORContext build_OR() throws RecognitionException {
		Build_ORContext _localctx = new Build_ORContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_build_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(2343);
			match(OR);
			setState(2344);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_operatorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Swift2Parser.SUB, 0); }
		public TerminalNode GT() { return getToken(Swift2Parser.GT, 0); }
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterArrow_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitArrow_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitArrow_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(2347);
			match(SUB);
			setState(2348);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_operatorContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(Swift2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift2Parser.DOT, i);
		}
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterRange_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitRange_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitRange_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(2351);
			match(DOT);
			setState(2352);
			match(DOT);
			setState(2353);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_equalsContext extends ParserRuleContext {
		public List<TerminalNode> EQUAL() { return getTokens(Swift2Parser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(Swift2Parser.EQUAL, i);
		}
		public Same_type_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterSame_type_equals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitSame_type_equals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitSame_type_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_equalsContext same_type_equals() throws RecognitionException {
		Same_type_equalsContext _localctx = new Same_type_equalsContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(2356);
			match(EQUAL);
			setState(2357);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2360);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPrefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2363);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterPostfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitPostfix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitPostfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(2366);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public List<Operator_characterContext> operator_character() {
			return getRuleContexts(Operator_characterContext.class);
		}
		public Operator_characterContext operator_character(int i) {
			return getRuleContext(Operator_characterContext.class,i);
		}
		public Dot_operator_headContext dot_operator_head() {
			return getRuleContext(Dot_operator_headContext.class,0);
		}
		public List<Dot_operator_characterContext> dot_operator_character() {
			return getRuleContexts(Dot_operator_characterContext.class);
		}
		public Dot_operator_characterContext dot_operator_character(int i) {
			return getRuleContext(Dot_operator_characterContext.class,i);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_operator);
		try {
			int _alt;
			setState(2384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2368);
				operator_head();
				setState(2373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2369);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2370);
						operator_character();
						}
						} 
					}
					setState(2375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2376);
				dot_operator_head();
				setState(2381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2377);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2378);
						dot_operator_character();
						}
						} 
					}
					setState(2383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_characterContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public TerminalNode Operator_following_character() { return getToken(Swift2Parser.Operator_following_character, 0); }
		public Operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOperator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOperator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOperator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_characterContext operator_character() throws RecognitionException {
		Operator_characterContext _localctx = new Operator_characterContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_operator_character);
		try {
			setState(2388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2386);
				operator_head();
				}
				break;
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2387);
				match(Operator_following_character);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_headContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(Swift2Parser.DIV, 0); }
		public TerminalNode EQUAL() { return getToken(Swift2Parser.EQUAL, 0); }
		public TerminalNode SUB() { return getToken(Swift2Parser.SUB, 0); }
		public TerminalNode ADD() { return getToken(Swift2Parser.ADD, 0); }
		public TerminalNode BANG() { return getToken(Swift2Parser.BANG, 0); }
		public TerminalNode MUL() { return getToken(Swift2Parser.MUL, 0); }
		public TerminalNode MOD() { return getToken(Swift2Parser.MOD, 0); }
		public TerminalNode AND() { return getToken(Swift2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Swift2Parser.OR, 0); }
		public TerminalNode LT() { return getToken(Swift2Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Swift2Parser.GT, 0); }
		public TerminalNode CARET() { return getToken(Swift2Parser.CARET, 0); }
		public TerminalNode TILDE() { return getToken(Swift2Parser.TILDE, 0); }
		public TerminalNode QUESTION() { return getToken(Swift2Parser.QUESTION, 0); }
		public TerminalNode Operator_head_other() { return getToken(Swift2Parser.Operator_head_other, 0); }
		public Operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterOperator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitOperator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitOperator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_headContext operator_head() throws RecognitionException {
		Operator_headContext _localctx = new Operator_headContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_operator_head);
		int _la;
		try {
			setState(2392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2390);
				_la = _input.LA(1);
				if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (LT - 114)) | (1L << (GT - 114)) | (1L << (BANG - 114)) | (1L << (QUESTION - 114)) | (1L << (AND - 114)) | (1L << (SUB - 114)) | (1L << (EQUAL - 114)) | (1L << (OR - 114)) | (1L << (DIV - 114)) | (1L << (ADD - 114)) | (1L << (MUL - 114)) | (1L << (MOD - 114)) | (1L << (CARET - 114)) | (1L << (TILDE - 114)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(2391);
				match(Operator_head_other);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operator_headContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(Swift2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift2Parser.DOT, i);
		}
		public Dot_operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDot_operator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDot_operator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDot_operator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_headContext dot_operator_head() throws RecognitionException {
		Dot_operator_headContext _localctx = new Dot_operator_headContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			match(DOT);
			setState(2395);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operator_characterContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift2Parser.DOT, 0); }
		public Operator_characterContext operator_character() {
			return getRuleContext(Operator_characterContext.class,0);
		}
		public Dot_operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterDot_operator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitDot_operator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitDot_operator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_characterContext dot_operator_character() throws RecognitionException {
		Dot_operator_characterContext _localctx = new Dot_operator_characterContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_dot_operator_character);
		try {
			setState(2399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2397);
				match(DOT);
				}
				break;
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2398);
				operator_character();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Nil_literalContext nil_literal() {
			return getRuleContext(Nil_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_literal);
		try {
			setState(2405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2401);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2402);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2403);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2404);
				nil_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negate_prefix_operatorContext negate_prefix_operator() {
			return getRuleContext(Negate_prefix_operatorContext.class,0);
		}
		public TerminalNode Floating_point_literal() { return getToken(Swift2Parser.Floating_point_literal, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_numeric_literal);
		try {
			setState(2415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2407);
					negate_prefix_operator();
					}
					break;
				}
				setState(2410);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2411);
					negate_prefix_operator();
					}
					break;
				}
				setState(2414);
				match(Floating_point_literal);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
			_la = _input.LA(1);
			if ( !(_la==T__98 || _la==T__99) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nil_literalContext extends ParserRuleContext {
		public Nil_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterNil_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitNil_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitNil_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_literalContext nil_literal() throws RecognitionException {
		Nil_literalContext _localctx = new Nil_literalContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			match(T__100);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Binary_literal() { return getToken(Swift2Parser.Binary_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(Swift2Parser.Octal_literal, 0); }
		public TerminalNode Decimal_literal() { return getToken(Swift2Parser.Decimal_literal, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(Swift2Parser.Pure_decimal_digits, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(Swift2Parser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2421);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Binary_literal - 133)) | (1L << (Octal_literal - 133)) | (1L << (Decimal_literal - 133)) | (1L << (Pure_decimal_digits - 133)) | (1L << (Hexadecimal_literal - 133)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(Swift2Parser.Static_string_literal, 0); }
		public TerminalNode Interpolated_string_literal() { return getToken(Swift2Parser.Interpolated_string_literal, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift2Listener ) ((Swift2Listener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift2Visitor ) return ((Swift2Visitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			_la = _input.LA(1);
			if ( !(_la==Static_string_literal || _la==Interpolated_string_literal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 50:
			return build_configuration_sempred((Build_configurationContext)_localctx, predIndex);
		case 164:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 214:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 218:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 236:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 237:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 238:
			return build_AND_sempred((Build_ANDContext)_localctx, predIndex);
		case 239:
			return build_OR_sempred((Build_ORContext)_localctx, predIndex);
		case 240:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 241:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 242:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 243:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 244:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 245:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 246:
			return operator_sempred((OperatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean build_configuration_sempred(Build_configurationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean build_AND_sempred(Build_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean build_OR_sempred(Build_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return _input.get(_input.index()-1).getType()!=WS;
		case 32:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0091\u097c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\3\2\7"+
		"\2\u0206\n\2\f\2\16\2\u0209\13\2\3\2\3\2\3\3\3\3\5\3\u020f\n\3\3\3\3\3"+
		"\5\3\u0213\n\3\3\3\3\3\5\3\u0217\n\3\3\3\3\3\5\3\u021b\n\3\3\3\3\3\5\3"+
		"\u021f\n\3\3\3\3\3\5\3\u0223\n\3\3\3\3\3\5\3\u0227\n\3\3\3\3\3\5\3\u022b"+
		"\n\3\3\3\5\3\u022e\n\3\3\4\6\4\u0231\n\4\r\4\16\4\u0232\3\5\3\5\3\5\3"+
		"\5\5\5\u0239\n\5\3\6\3\6\5\6\u023d\n\6\3\6\3\6\5\6\u0241\n\6\3\6\3\6\5"+
		"\6\u0245\n\6\3\6\3\6\3\6\3\6\5\6\u024b\n\6\3\6\3\6\5\6\u024f\n\6\3\6\3"+
		"\6\5\6\u0253\n\6\3\6\3\6\5\6\u0257\n\6\3\7\3\7\5\7\u025b\n\7\3\b\3\b\5"+
		"\b\u025f\n\b\3\b\3\b\3\b\3\b\5\b\u0265\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0277\n\n\3\13\3\13\3\13\7\13"+
		"\u027c\n\13\f\13\16\13\u027f\13\13\3\f\3\f\3\f\5\f\u0284\n\f\3\r\3\r\3"+
		"\r\3\r\5\r\u028a\n\r\3\16\3\16\5\16\u028e\n\16\3\16\5\16\u0291\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u029b\n\17\3\20\3\20\3\20"+
		"\3\20\7\20\u02a1\n\20\f\20\16\20\u02a4\13\20\3\21\3\21\3\21\3\21\5\21"+
		"\u02aa\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u02b4\n\23\3"+
		"\24\3\24\3\24\3\24\5\24\u02ba\n\24\3\25\3\25\3\25\3\25\5\25\u02c0\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u02cb\n\27\3\27\3\27"+
		"\3\30\3\30\5\30\u02d1\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02d9\n"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u02e1\n\33\3\33\3\33\5\33\u02e5"+
		"\n\33\3\33\3\33\3\33\5\33\u02ea\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02fd\n\37\3 "+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0309\n\"\3#\3#\5#\u030d\n#\3$\3"+
		"$\5$\u0311\n$\3%\3%\3&\3&\5&\u0317\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7("+
		"\u0321\n(\f(\16(\u0324\13(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\5,\u0331\n"+
		",\3-\3-\5-\u0335\n-\3.\3.\5.\u0339\n.\3.\5.\u033c\n.\3.\3.\3/\3/\5/\u0342"+
		"\n/\3\60\3\60\3\60\5\60\u0347\n\60\3\60\5\60\u034a\n\60\3\60\5\60\u034d"+
		"\n\60\3\60\3\60\3\61\3\61\5\61\u0353\n\61\3\62\3\62\3\62\5\62\u0358\n"+
		"\62\3\63\3\63\5\63\u035c\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0368\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64"+
		"\u0372\n\64\f\64\16\64\u0375\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u0381\n\65\3\66\3\66\3\67\3\67\38\38\38\38\38\58"+
		"\u038c\n8\39\39\3:\3:\3;\3;\3;\5;\u0395\n;\3;\3;\3<\3<\3<\7<\u039c\n<"+
		"\f<\16<\u039f\13<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03aa\n=\3>\3>\3>\3?\3"+
		"?\3?\3?\3?\5?\u03b4\n?\3@\3@\5@\u03b8\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03c2"+
		"\nA\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\7D\u03cf\nD\fD\16D\u03d2\13D\3E\3"+
		"E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03e4\nF\3G\6G\u03e7\n"+
		"G\rG\16G\u03e8\3H\5H\u03ec\nH\3I\3I\5I\u03f0\nI\3I\3I\3J\5J\u03f5\nJ\3"+
		"J\3J\5J\u03f9\nJ\3J\3J\3K\3K\3L\3L\3L\3L\3L\5L\u0404\nL\3M\3M\5M\u0408"+
		"\nM\3N\5N\u040b\nN\3N\5N\u040e\nN\3N\3N\3N\3O\3O\3O\7O\u0416\nO\fO\16"+
		"O\u0419\13O\3P\3P\5P\u041d\nP\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0438\nR\3R\3R\3R\3R\3R\3R\3R\5"+
		"R\u0441\nR\3R\3R\5R\u0445\nR\3S\5S\u0448\nS\3S\5S\u044b\nS\3S\3S\3T\3"+
		"T\3U\3U\3U\5U\u0454\nU\3U\3U\3U\3U\3U\3U\3U\5U\u045d\nU\3V\5V\u0460\n"+
		"V\3V\3V\3V\3W\5W\u0466\nW\3W\3W\5W\u046a\nW\3W\3W\3X\3X\3X\3X\3Y\3Y\3"+
		"Y\5Y\u0475\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u047e\nY\3Z\5Z\u0481\nZ\3Z\3Z\3"+
		"[\5[\u0486\n[\3[\3[\3\\\3\\\3\\\5\\\u048d\n\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u0496\n\\\3]\5]\u0499\n]\3]\3]\5]\u049d\n]\3]\3]\3^\5^\u04a2"+
		"\n^\3^\3^\5^\u04a6\n^\3^\3^\3_\3_\3_\3`\5`\u04ae\n`\3`\5`\u04b1\n`\3`"+
		"\3`\3`\3a\3a\3b\3b\3b\3c\3c\3c\5c\u04be\nc\3c\3c\5c\u04c2\nc\3d\5d\u04c5"+
		"\nd\3d\5d\u04c8\nd\3d\3d\3e\3e\5e\u04ce\ne\3f\3f\5f\u04d2\nf\3f\5f\u04d5"+
		"\nf\3f\3f\3f\5f\u04da\nf\5f\u04dc\nf\3g\3g\5g\u04e0\ng\3g\3g\3h\3h\3i"+
		"\3i\5i\u04e8\ni\3j\3j\3j\3j\3j\3j\5j\u04f0\nj\3k\3k\3k\7k\u04f5\nk\fk"+
		"\16k\u04f8\13k\3l\5l\u04fb\nl\3l\5l\u04fe\nl\3l\3l\5l\u0502\nl\3l\5l\u0505"+
		"\nl\3l\3l\5l\u0509\nl\3l\3l\5l\u050d\nl\3l\5l\u0510\nl\3l\3l\5l\u0514"+
		"\nl\3l\3l\3l\3l\5l\u051a\nl\3l\3l\3l\3l\5l\u0520\nl\3m\3m\5m\u0524\nm"+
		"\3n\3n\5n\u0528\nn\3o\3o\3o\3p\5p\u052e\np\3p\5p\u0531\np\3p\3p\5p\u0535"+
		"\np\3p\5p\u0538\np\3p\5p\u053b\np\3q\5q\u053e\nq\3q\3q\3q\5q\u0543\nq"+
		"\3q\5q\u0546\nq\3q\3q\5q\u054a\nq\3q\3q\3r\3r\5r\u0550\nr\3s\3s\5s\u0554"+
		"\ns\3t\5t\u0557\nt\3t\5t\u055a\nt\3t\3t\3t\3u\3u\3u\3u\3u\5u\u0564\nu"+
		"\3v\3v\5v\u0568\nv\3w\3w\3x\3x\3y\3y\3y\5y\u0571\ny\3y\3y\3y\3y\3y\3z"+
		"\3z\5z\u057a\nz\3{\3{\5{\u057e\n{\3|\5|\u0581\n|\3|\3|\3|\3}\3}\3}\3}"+
		"\3}\5}\u058b\n}\3~\3~\5~\u058f\n~\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\5\u0080\u0597\n\u0080\3\u0081\5\u0081\u059a\n\u0081\3\u0081\5\u0081"+
		"\u059d\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05a2\n\u0081\3\u0081\5"+
		"\u0081\u05a5\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5"+
		"\u0083\u05ad\n\u0083\3\u0083\3\u0083\3\u0084\5\u0084\u05b2\n\u0084\3\u0084"+
		"\5\u0084\u05b5\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u05ba\n\u0084\3"+
		"\u0084\5\u0084\u05bd\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3"+
		"\u0086\5\u0086\u05c5\n\u0086\3\u0086\3\u0086\3\u0087\5\u0087\u05ca\n\u0087"+
		"\3\u0087\5\u0087\u05cd\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05d2\n"+
		"\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\5\u0089\u05da\n"+
		"\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u05e3\n\u008a\3\u008b\3\u008b\5\u008b\u05e7\n\u008b\3\u008c\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u05f1\n\u008d\3"+
		"\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u05f7\n\u008e\3\u008e\3\u008e\5"+
		"\u008e\u05fb\n\u008e\3\u008e\3\u008e\5\u008e\u05ff\n\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0604\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\5\u0090\u060b\n\u0090\3\u0090\5\u0090\u060e\n\u0090\3\u0090\3\u0090\3"+
		"\u0090\5\u0090\u0613\n\u0090\3\u0090\5\u0090\u0616\n\u0090\3\u0091\3\u0091"+
		"\5\u0091\u061a\n\u0091\3\u0091\3\u0091\5\u0091\u061e\n\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\5\u0091\u0624\n\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\5\u0091\u062a\n\u0091\3\u0092\5\u0092\u062d\n\u0092\3\u0092\5\u0092"+
		"\u0630\n\u0092\3\u0092\3\u0092\5\u0092\u0634\n\u0092\3\u0092\5\u0092\u0637"+
		"\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u063c\n\u0092\3\u0092\5\u0092"+
		"\u063f\n\u0092\3\u0092\3\u0092\5\u0092\u0643\n\u0092\3\u0093\3\u0093\3"+
		"\u0094\5\u0094\u0648\n\u0094\3\u0094\3\u0094\3\u0094\3\u0095\5\u0095\u064e"+
		"\n\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0653\n\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\5\u0096\u0659\n\u0096\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u0669\n\u0097\3\u0098\5\u0098\u066c\n\u0098\3\u0098\5"+
		"\u0098\u066f\n\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u0676"+
		"\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\5\u009a\u067d\n\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\5\u009e\u0693\n\u009e\3\u009e\5\u009e\u0696\n\u009e\3"+
		"\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u06bb\n\u00a3\3\u00a4\3\u00a4\5\u00a4\u06bf\n\u00a4\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u06d0\n\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u06d5\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u06d9\n\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\5\u00a6\u06de\n\u00a6\3\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\5\u00a6\u06e5\n\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u06ea"+
		"\n\u00a6\f\u00a6\16\u00a6\u06ed\13\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u06f7\n\u00a9\3\u00aa\3\u00aa"+
		"\5\u00aa\u06fb\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab"+
		"\u0702\n\u00ab\f\u00ab\16\u00ab\u0705\13\u00ab\3\u00ac\3\u00ac\3\u00ad"+
		"\5\u00ad\u070a\n\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u070f\n\u00ad\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\5\u00b0\u0717\n\u00b0\3"+
		"\u00b0\3\u00b0\5\u00b0\u071b\n\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5"+
		"\u00b2\u0721\n\u00b2\3\u00b2\3\u00b2\3\u00b3\6\u00b3\u0726\n\u00b3\r\u00b3"+
		"\16\u00b3\u0727\3\u00b4\6\u00b4\u072b\n\u00b4\r\u00b4\16\u00b4\u072c\3"+
		"\u00b5\3\u00b5\5\u00b5\u0731\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0736"+
		"\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u073b\n\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0743\n\u00b5\3\u00b6\5\u00b6"+
		"\u0746\n\u00b6\3\u00b6\3\u00b6\5\u00b6\u074a\n\u00b6\3\u00b7\3\u00b7\3"+
		"\u00b7\7\u00b7\u074f\n\u00b7\f\u00b7\16\u00b7\u0752\13\u00b7\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0759\n\u00b8\3\u00b9\3\u00b9\3"+
		"\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0763\n\u00ba\3"+
		"\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u076a\n\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bb\5\u00bb\u076f\n\u00bb\3\u00bc\6\u00bc\u0772\n\u00bc\r\u00bc"+
		"\16\u00bc\u0773\3\u00bd\3\u00bd\5\u00bd\u0778\n\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\5\u00be\u0787\n\u00be\3\u00bf\3\u00bf\5\u00bf\u078b\n"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u0795\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07a1\n\u00c1\3\u00c2\3\u00c2"+
		"\5\u00c2\u07a5\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3"+
		"\u07ac\n\u00c3\f\u00c3\16\u00c3\u07af\13\u00c3\3\u00c3\5\u00c3\u07b2\n"+
		"\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u07bd\n\u00c5\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u07c2\n"+
		"\u00c6\f\u00c6\16\u00c6\u07c5\13\u00c6\3\u00c6\5\u00c6\u07c8\n\u00c6\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u07da"+
		"\n\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u07df\n\u00c9\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\5\u00cd\u07f0\n\u00cd\3\u00cd\5\u00cd"+
		"\u07f3\n\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\5\u00ce\u07f9\n\u00ce\3"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u07ff\n\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\3\u00ce\5\u00ce\u0806\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\5\u00ce\u080d\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\5\u00ce\u0814\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3"+
		"\u00d0\3\u00d0\7\u00d0\u081d\n\u00d0\f\u00d0\16\u00d0\u0820\13\u00d0\3"+
		"\u00d1\5\u00d1\u0823\n\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3"+
		"\u00d3\5\u00d3\u082b\n\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\7"+
		"\u00d4\u0832\n\u00d4\f\u00d4\16\u00d4\u0835\13\u00d4\3\u00d5\3\u00d5\3"+
		"\u00d5\3\u00d5\3\u00d5\5\u00d5\u083c\n\u00d5\3\u00d6\3\u00d6\3\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u084e\n\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0862"+
		"\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u087b\n\u00d8"+
		"\f\u00d8\16\u00d8\u087e\13\u00d8\3\u00d9\3\u00d9\5\u00d9\u0882\n\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\5\u00dc\u0897\n\u00dc\3\u00dc\3\u00dc\5\u00dc\u089b\n\u00dc\3"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\7\u00dc\u08af\n\u00dc\f\u00dc\16\u00dc\u08b2\13\u00dc\3\u00dd\3\u00dd"+
		"\5\u00dd\u08b6\n\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\5\u00de\u08bc\n"+
		"\u00de\3\u00de\3\u00de\5\u00de\u08c0\n\u00de\3\u00de\3\u00de\3\u00de\5"+
		"\u00de\u08c5\n\u00de\3\u00df\3\u00df\3\u00e0\3\u00e0\5\u00e0\u08cb\n\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e1\3\u00e1\5\u00e1\u08d1\n\u00e1\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u08d8\n\u00e2\3\u00e3\5\u00e3\u08db\n"+
		"\u00e3\3\u00e3\5\u00e3\u08de\n\u00e3\3\u00e3\3\u00e3\5\u00e3\u08e2\n\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u08e7\n\u00e3\3\u00e4\3\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\5\u00e5\u08ee\n\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\6\u00e6\u08f5\n\u00e6\r\u00e6\16\u00e6\u08f6\5\u00e6\u08f9\n"+
		"\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0906\n\u00e8\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\5\u00e9\u090d\n\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb"+
		"\5\u00eb\u0913\n\u00eb\3\u00ec\3\u00ec\3\u00ec\7\u00ec\u0918\n\u00ec\f"+
		"\u00ec\16\u00ec\u091b\13\u00ec\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8"+
		"\7\u00f8\u0946\n\u00f8\f\u00f8\16\u00f8\u0949\13\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\7\u00f8\u094e\n\u00f8\f\u00f8\16\u00f8\u0951\13\u00f8\5\u00f8"+
		"\u0953\n\u00f8\3\u00f9\3\u00f9\5\u00f9\u0957\n\u00f9\3\u00fa\3\u00fa\5"+
		"\u00fa\u095b\n\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\5\u00fc\u0962"+
		"\n\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd\5\u00fd\u0968\n\u00fd\3\u00fe"+
		"\5\u00fe\u096b\n\u00fe\3\u00fe\3\u00fe\5\u00fe\u096f\n\u00fe\3\u00fe\5"+
		"\u00fe\u0972\n\u00fe\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0101\3\u0101\3"+
		"\u0102\3\u0102\3\u0102\2\6f\u014a\u01ae\u01b6\u0103\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2"+
		"\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa"+
		"\u01fc\u01fe\u0200\u0202\2\r\4\2hh\u0080\u0080\3\2\37\"\3\2#&\4\2\b\b"+
		").\3\2BD\5\2OORR_`\b\2/\62\66\66<MOORRcd\5\2tuwxz\u0083\3\2ef\3\2\u0087"+
		"\u008b\3\2\u008d\u008e\2\u0a15\2\u0207\3\2\2\2\4\u022d\3\2\2\2\6\u0230"+
		"\3\2\2\2\b\u0238\3\2\2\2\n\u0256\3\2\2\2\f\u025a\3\2\2\2\16\u025c\3\2"+
		"\2\2\20\u0268\3\2\2\2\22\u0276\3\2\2\2\24\u0278\3\2\2\2\26\u0283\3\2\2"+
		"\2\30\u0285\3\2\2\2\32\u028b\3\2\2\2\34\u029a\3\2\2\2\36\u029c\3\2\2\2"+
		" \u02a9\3\2\2\2\"\u02ab\3\2\2\2$\u02b3\3\2\2\2&\u02b5\3\2\2\2(\u02bf\3"+
		"\2\2\2*\u02c1\3\2\2\2,\u02c6\3\2\2\2.\u02ce\3\2\2\2\60\u02d8\3\2\2\2\62"+
		"\u02da\3\2\2\2\64\u02e9\3\2\2\2\66\u02eb\3\2\2\28\u02ee\3\2\2\2:\u02f1"+
		"\3\2\2\2<\u02fc\3\2\2\2>\u02fe\3\2\2\2@\u0301\3\2\2\2B\u0308\3\2\2\2D"+
		"\u030a\3\2\2\2F\u030e\3\2\2\2H\u0312\3\2\2\2J\u0314\3\2\2\2L\u0318\3\2"+
		"\2\2N\u031d\3\2\2\2P\u0325\3\2\2\2R\u0327\3\2\2\2T\u032a\3\2\2\2V\u032d"+
		"\3\2\2\2X\u0332\3\2\2\2Z\u0336\3\2\2\2\\\u0341\3\2\2\2^\u0343\3\2\2\2"+
		"`\u0350\3\2\2\2b\u0354\3\2\2\2d\u0359\3\2\2\2f\u0367\3\2\2\2h\u0380\3"+
		"\2\2\2j\u0382\3\2\2\2l\u0384\3\2\2\2n\u038b\3\2\2\2p\u038d\3\2\2\2r\u038f"+
		"\3\2\2\2t\u0391\3\2\2\2v\u0398\3\2\2\2x\u03a9\3\2\2\2z\u03ab\3\2\2\2|"+
		"\u03b3\3\2\2\2~\u03b7\3\2\2\2\u0080\u03c1\3\2\2\2\u0082\u03c3\3\2\2\2"+
		"\u0084\u03c7\3\2\2\2\u0086\u03cb\3\2\2\2\u0088\u03d3\3\2\2\2\u008a\u03e3"+
		"\3\2\2\2\u008c\u03e6\3\2\2\2\u008e\u03eb\3\2\2\2\u0090\u03ed\3\2\2\2\u0092"+
		"\u03f4\3\2\2\2\u0094\u03fc\3\2\2\2\u0096\u0403\3\2\2\2\u0098\u0407\3\2"+
		"\2\2\u009a\u040a\3\2\2\2\u009c\u0412\3\2\2\2\u009e\u041a\3\2\2\2\u00a0"+
		"\u041e\3\2\2\2\u00a2\u0444\3\2\2\2\u00a4\u0447\3\2\2\2\u00a6\u044e\3\2"+
		"\2\2\u00a8\u045c\3\2\2\2\u00aa\u045f\3\2\2\2\u00ac\u0465\3\2\2\2\u00ae"+
		"\u046d\3\2\2\2\u00b0\u047d\3\2\2\2\u00b2\u0480\3\2\2\2\u00b4\u0485\3\2"+
		"\2\2\u00b6\u0495\3\2\2\2\u00b8\u0498\3\2\2\2\u00ba\u04a1\3\2\2\2\u00bc"+
		"\u04a9\3\2\2\2\u00be\u04ad\3\2\2\2\u00c0\u04b5\3\2\2\2\u00c2\u04b7\3\2"+
		"\2\2\u00c4\u04ba\3\2\2\2\u00c6\u04c4\3\2\2\2\u00c8\u04cd\3\2\2\2\u00ca"+
		"\u04db\3\2\2\2\u00cc\u04dd\3\2\2\2\u00ce\u04e3\3\2\2\2\u00d0\u04e5\3\2"+
		"\2\2\u00d2\u04ef\3\2\2\2\u00d4\u04f1\3\2\2\2\u00d6\u051f\3\2\2\2\u00d8"+
		"\u0523\3\2\2\2\u00da\u0527\3\2\2\2\u00dc\u0529\3\2\2\2\u00de\u053a\3\2"+
		"\2\2\u00e0\u053d\3\2\2\2\u00e2\u054d\3\2\2\2\u00e4\u0553\3\2\2\2\u00e6"+
		"\u0556\3\2\2\2\u00e8\u0563\3\2\2\2\u00ea\u0565\3\2\2\2\u00ec\u0569\3\2"+
		"\2\2\u00ee\u056b\3\2\2\2\u00f0\u056d\3\2\2\2\u00f2\u0577\3\2\2\2\u00f4"+
		"\u057d\3\2\2\2\u00f6\u0580\3\2\2\2\u00f8\u058a\3\2\2\2\u00fa\u058c\3\2"+
		"\2\2\u00fc\u0590\3\2\2\2\u00fe\u0596\3\2\2\2\u0100\u0599\3\2\2\2\u0102"+
		"\u05a8\3\2\2\2\u0104\u05aa\3\2\2\2\u0106\u05b1\3\2\2\2\u0108\u05c0\3\2"+
		"\2\2\u010a\u05c2\3\2\2\2\u010c\u05c9\3\2\2\2\u010e\u05d5\3\2\2\2\u0110"+
		"\u05d7\3\2\2\2\u0112\u05e2\3\2\2\2\u0114\u05e4\3\2\2\2\u0116\u05e8\3\2"+
		"\2\2\u0118\u05ed\3\2\2\2\u011a\u0603\3\2\2\2\u011c\u0605\3\2\2\2\u011e"+
		"\u060a\3\2\2\2\u0120\u0629\3\2\2\2\u0122\u0642\3\2\2\2\u0124\u0644\3\2"+
		"\2\2\u0126\u0647\3\2\2\2\u0128\u064d\3\2\2\2\u012a\u0656\3\2\2\2\u012c"+
		"\u0668\3\2\2\2\u012e\u066b\3\2\2\2\u0130\u0673\3\2\2\2\u0132\u067c\3\2"+
		"\2\2\u0134\u067e\3\2\2\2\u0136\u0684\3\2\2\2\u0138\u068a\3\2\2\2\u013a"+
		"\u0692\3\2\2\2\u013c\u0697\3\2\2\2\u013e\u069a\3\2\2\2\u0140\u069c\3\2"+
		"\2\2\u0142\u069f\3\2\2\2\u0144\u06ba\3\2\2\2\u0146\u06bc\3\2\2\2\u0148"+
		"\u06cf\3\2\2\2\u014a\u06e4\3\2\2\2\u014c\u06ee\3\2\2\2\u014e\u06f0\3\2"+
		"\2\2\u0150\u06f6\3\2\2\2\u0152\u06f8\3\2\2\2\u0154\u06fe\3\2\2\2\u0156"+
		"\u0706\3\2\2\2\u0158\u0709\3\2\2\2\u015a\u0710\3\2\2\2\u015c\u0713\3\2"+
		"\2\2\u015e\u0716\3\2\2\2\u0160\u071c\3\2\2\2\u0162\u071e\3\2\2\2\u0164"+
		"\u0725\3\2\2\2\u0166\u072a\3\2\2\2\u0168\u0742\3\2\2\2\u016a\u0745\3\2"+
		"\2\2\u016c\u074b\3\2\2\2\u016e\u0758\3\2\2\2\u0170\u075a\3\2\2\2\u0172"+
		"\u0762\3\2\2\2\u0174\u076e\3\2\2\2\u0176\u0771\3\2\2\2\u0178\u0775\3\2"+
		"\2\2\u017a\u0786\3\2\2\2\u017c\u0794\3\2\2\2\u017e\u0796\3\2\2\2\u0180"+
		"\u07a0\3\2\2\2\u0182\u07a2\3\2\2\2\u0184\u07a8\3\2\2\2\u0186\u07b3\3\2"+
		"\2\2\u0188\u07bc\3\2\2\2\u018a\u07be\3\2\2\2\u018c\u07c9\3\2\2\2\u018e"+
		"\u07d9\3\2\2\2\u0190\u07de\3\2\2\2\u0192\u07e0\3\2\2\2\u0194\u07e4\3\2"+
		"\2\2\u0196\u07e9\3\2\2\2\u0198\u07ed\3\2\2\2\u019a\u0813\3\2\2\2\u019c"+
		"\u0815\3\2\2\2\u019e\u0819\3\2\2\2\u01a0\u0822\3\2\2\2\u01a2\u0826\3\2"+
		"\2\2\u01a4\u0828\3\2\2\2\u01a6\u082e\3\2\2\2\u01a8\u083b\3\2\2\2\u01aa"+
		"\u083d\3\2\2\2\u01ac\u083f\3\2\2\2\u01ae\u0844\3\2\2\2\u01b0\u087f\3\2"+
		"\2\2\u01b2\u0883\3\2\2\2\u01b4\u0886\3\2\2\2\u01b6\u0896\3\2\2\2\u01b8"+
		"\u08b3\3\2\2\2\u01ba\u08c4\3\2\2\2\u01bc\u08c6\3\2\2\2\u01be\u08c8\3\2"+
		"\2\2\u01c0\u08ce\3\2\2\2\u01c2\u08d7\3\2\2\2\u01c4\u08e6\3\2\2\2\u01c6"+
		"\u08e8\3\2\2\2\u01c8\u08ea\3\2\2\2\u01ca\u08f8\3\2\2\2\u01cc\u08fa\3\2"+
		"\2\2\u01ce\u0905\3\2\2\2\u01d0\u090c\3\2\2\2\u01d2\u090e\3\2\2\2\u01d4"+
		"\u0912\3\2\2\2\u01d6\u0914\3\2\2\2\u01d8\u091c\3\2\2\2\u01da\u091e\3\2"+
		"\2\2\u01dc\u0921\3\2\2\2\u01de\u0924\3\2\2\2\u01e0\u0928\3\2\2\2\u01e2"+
		"\u092c\3\2\2\2\u01e4\u0930\3\2\2\2\u01e6\u0935\3\2\2\2\u01e8\u0939\3\2"+
		"\2\2\u01ea\u093c\3\2\2\2\u01ec\u093f\3\2\2\2\u01ee\u0952\3\2\2\2\u01f0"+
		"\u0956\3\2\2\2\u01f2\u095a\3\2\2\2\u01f4\u095c\3\2\2\2\u01f6\u0961\3\2"+
		"\2\2\u01f8\u0967\3\2\2\2\u01fa\u0971\3\2\2\2\u01fc\u0973\3\2\2\2\u01fe"+
		"\u0975\3\2\2\2\u0200\u0977\3\2\2\2\u0202\u0979\3\2\2\2\u0204\u0206\5\4"+
		"\3\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7\2"+
		"\2\3\u020b\3\3\2\2\2\u020c\u020e\5\u016a\u00b6\2\u020d\u020f\7s\2\2\u020e"+
		"\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u022e\3\2\2\2\u0210\u0212\5\u008a"+
		"F\2\u0211\u0213\7s\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u022e"+
		"\3\2\2\2\u0214\u0216\5\b\5\2\u0215\u0217\7s\2\2\u0216\u0215\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u022e\3\2\2\2\u0218\u021a\5$\23\2\u0219\u021b\7s"+
		"\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u022e\3\2\2\2\u021c"+
		"\u021e\5<\37\2\u021d\u021f\7s\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u022e\3\2\2\2\u0220\u0222\5B\"\2\u0221\u0223\7s\2\2\u0222\u0221"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u022e\3\2\2\2\u0224\u0226\5T+\2\u0225"+
		"\u0227\7s\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022e\3\2"+
		"\2\2\u0228\u022a\5V,\2\u0229\u022b\7s\2\2\u022a\u0229\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022e\5\\/\2\u022d\u020c\3\2\2\2\u022d"+
		"\u0210\3\2\2\2\u022d\u0214\3\2\2\2\u022d\u0218\3\2\2\2\u022d\u021c\3\2"+
		"\2\2\u022d\u0220\3\2\2\2\u022d\u0224\3\2\2\2\u022d\u0228\3\2\2\2\u022d"+
		"\u022c\3\2\2\2\u022e\5\3\2\2\2\u022f\u0231\5\4\3\2\u0230\u022f\3\2\2\2"+
		"\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\7\3"+
		"\2\2\2\u0234\u0239\5\n\6\2\u0235\u0239\5\16\b\2\u0236\u0239\5\20\t\2\u0237"+
		"\u0239\5\"\22\2\u0238\u0234\3\2\2\2\u0238\u0235\3\2\2\2\u0238\u0236\3"+
		"\2\2\2\u0238\u0237\3\2\2\2\u0239\t\3\2\2\2\u023a\u023c\7\3\2\2\u023b\u023d"+
		"\5\f\7\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u0240\7s\2\2\u023f\u0241\5\u016a\u00b6\2\u0240\u023f\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\7s\2\2\u0243\u0245\5\u016a\u00b6"+
		"\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0257"+
		"\5\u0090I\2\u0247\u0248\7\3\2\2\u0248\u024a\7l\2\2\u0249\u024b\5\f\7\2"+
		"\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e"+
		"\7s\2\2\u024d\u024f\5\u016a\u00b6\2\u024e\u024d\3\2\2\2\u024e\u024f\3"+
		"\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\7s\2\2\u0251\u0253\5\u016a\u00b6"+
		"\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255"+
		"\7o\2\2\u0255\u0257\5\u0090I\2\u0256\u023a\3\2\2\2\u0256\u0247\3\2\2\2"+
		"\u0257\13\3\2\2\2\u0258\u025b\5\u00a2R\2\u0259\u025b\5\u016c\u00b7\2\u025a"+
		"\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b\r\3\2\2\2\u025c\u025e\7\3\2\2"+
		"\u025d\u025f\7\4\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0261\5\u014a\u00a6\2\u0261\u0262\7\5\2\2\u0262\u0264\5"+
		"\u016a\u00b6\2\u0263\u0265\58\35\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\u0267\5\u0090I\2\u0267\17\3\2\2\2\u0268"+
		"\u0269\7\6\2\2\u0269\u026a\5\22\n\2\u026a\u026b\5\u0090I\2\u026b\21\3"+
		"\2\2\2\u026c\u0277\5\u016a\u00b6\2\u026d\u026e\5\u016a\u00b6\2\u026e\u026f"+
		"\7q\2\2\u026f\u0270\5\24\13\2\u0270\u0277\3\2\2\2\u0271\u0277\5\24\13"+
		"\2\u0272\u0273\5L\'\2\u0273\u0274\7q\2\2\u0274\u0275\5\u016a\u00b6\2\u0275"+
		"\u0277\3\2\2\2\u0276\u026c\3\2\2\2\u0276\u026d\3\2\2\2\u0276\u0271\3\2"+
		"\2\2\u0276\u0272\3\2\2\2\u0277\23\3\2\2\2\u0278\u027d\5\26\f\2\u0279\u027a"+
		"\7q\2\2\u027a\u027c\5\26\f\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\25\3\2\2\2\u027f\u027d\3\2\2"+
		"\2\u0280\u0284\5L\'\2\u0281\u0284\5\30\r\2\u0282\u0284\5\32\16\2\u0283"+
		"\u0280\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0282\3\2\2\2\u0284\27\3\2\2"+
		"\2\u0285\u0286\7\4\2\2\u0286\u0287\5\u014a\u00a6\2\u0287\u0289\5\u00a0"+
		"Q\2\u0288\u028a\58\35\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\31\3\2\2\2\u028b\u028d\5\34\17\2\u028c\u028e\5\36\20\2\u028d\u028c\3"+
		"\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u0291\58\35\2\u0290"+
		"\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\33\3\2\2\2\u0292\u0293\7\7\2"+
		"\2\u0293\u0294\5\u014a\u00a6\2\u0294\u0295\5\u00a0Q\2\u0295\u029b\3\2"+
		"\2\2\u0296\u0297\7\b\2\2\u0297\u0298\5\u014a\u00a6\2\u0298\u0299\5\u00a0"+
		"Q\2\u0299\u029b\3\2\2\2\u029a\u0292\3\2\2\2\u029a\u0296\3\2\2\2\u029b"+
		"\35\3\2\2\2\u029c\u029d\7q\2\2\u029d\u02a2\5 \21\2\u029e\u029f\7q\2\2"+
		"\u029f\u02a1\5 \21\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0"+
		"\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\37\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5"+
		"\u02a6\5\u014a\u00a6\2\u02a6\u02a7\5\u00a0Q\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02aa\5\34\17\2\u02a9\u02a5\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa!\3\2\2"+
		"\2\u02ab\u02ac\7\t\2\2\u02ac\u02ad\5\u0090I\2\u02ad\u02ae\7\6\2\2\u02ae"+
		"\u02af\5\u016a\u00b6\2\u02af#\3\2\2\2\u02b0\u02b4\5&\24\2\u02b1\u02b4"+
		"\5*\26\2\u02b2\u02b4\5,\27\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b2\3\2\2\2\u02b4%\3\2\2\2\u02b5\u02b6\7\n\2\2\u02b6\u02b7\5\22\n\2"+
		"\u02b7\u02b9\5\u0090I\2\u02b8\u02ba\5(\25\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\'\3\2\2\2\u02bb\u02bc\7\13\2\2\u02bc\u02c0\5\u0090"+
		"I\2\u02bd\u02be\7\13\2\2\u02be\u02c0\5&\24\2\u02bf\u02bb\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02c0)\3\2\2\2\u02c1\u02c2\7\f\2\2\u02c2\u02c3\5\22\n\2"+
		"\u02c3\u02c4\7\13\2\2\u02c4\u02c5\5\u0090I\2\u02c5+\3\2\2\2\u02c6\u02c7"+
		"\7\r\2\2\u02c7\u02c8\5\u016a\u00b6\2\u02c8\u02ca\7k\2\2\u02c9\u02cb\5"+
		".\30\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02cd\7n\2\2\u02cd-\3\2\2\2\u02ce\u02d0\5\60\31\2\u02cf\u02d1\5.\30\2"+
		"\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1/\3\2\2\2\u02d2\u02d3\5"+
		"\62\32\2\u02d3\u02d4\5\6\4\2\u02d4\u02d9\3\2\2\2\u02d5\u02d6\5\66\34\2"+
		"\u02d6\u02d7\5\6\4\2\u02d7\u02d9\3\2\2\2\u02d8\u02d2\3\2\2\2\u02d8\u02d5"+
		"\3\2\2\2\u02d9\61\3\2\2\2\u02da\u02db\7\4\2\2\u02db\u02dc\5\64\33\2\u02dc"+
		"\u02dd\7r\2\2\u02dd\63\3\2\2\2\u02de\u02e0\5\u014a\u00a6\2\u02df\u02e1"+
		"\58\35\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02ea\3\2\2\2\u02e2"+
		"\u02e4\5\u014a\u00a6\2\u02e3\u02e5\58\35\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\7q\2\2\u02e7\u02e8\5\64\33\2"+
		"\u02e8\u02ea\3\2\2\2\u02e9\u02de\3\2\2\2\u02e9\u02e2\3\2\2\2\u02ea\65"+
		"\3\2\2\2\u02eb\u02ec\7\16\2\2\u02ec\u02ed\7r\2\2\u02ed\67\3\2\2\2\u02ee"+
		"\u02ef\7\17\2\2\u02ef\u02f0\5:\36\2\u02f09\3\2\2\2\u02f1\u02f2\5\u016a"+
		"\u00b6\2\u02f2;\3\2\2\2\u02f3\u02f4\5> \2\u02f4\u02f5\5\b\5\2\u02f5\u02fd"+
		"\3\2\2\2\u02f6\u02f7\5> \2\u02f7\u02f8\5&\24\2\u02f8\u02fd\3\2\2\2\u02f9"+
		"\u02fa\5> \2\u02fa\u02fb\5,\27\2\u02fb\u02fd\3\2\2\2\u02fc\u02f3\3\2\2"+
		"\2\u02fc\u02f6\3\2\2\2\u02fc\u02f9\3\2\2\2\u02fd=\3\2\2\2\u02fe\u02ff"+
		"\5@!\2\u02ff\u0300\7r\2\2\u0300?\3\2\2\2\u0301\u0302\5\u01d4\u00eb\2\u0302"+
		"A\3\2\2\2\u0303\u0309\5D#\2\u0304\u0309\5F$\2\u0305\u0309\5H%\2\u0306"+
		"\u0309\5J&\2\u0307\u0309\5R*\2\u0308\u0303\3\2\2\2\u0308\u0304\3\2\2\2"+
		"\u0308\u0305\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309C\3"+
		"\2\2\2\u030a\u030c\7\20\2\2\u030b\u030d\5@!\2\u030c\u030b\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030dE\3\2\2\2\u030e\u0310\7\21\2\2\u030f\u0311\5@!\2\u0310"+
		"\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311G\3\2\2\2\u0312\u0313\7\22\2\2"+
		"\u0313I\3\2\2\2\u0314\u0316\7\23\2\2\u0315\u0317\5\u016a\u00b6\2\u0316"+
		"\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317K\3\2\2\2\u0318\u0319\7\24\2\2"+
		"\u0319\u031a\7l\2\2\u031a\u031b\5N(\2\u031b\u031c\7o\2\2\u031cM\3\2\2"+
		"\2\u031d\u0322\5P)\2\u031e\u031f\7q\2\2\u031f\u0321\5P)\2\u0320\u031e"+
		"\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"O\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0326\t\2\2\2\u0326Q\3\2\2\2\u0327"+
		"\u0328\7\25\2\2\u0328\u0329\5\u016a\u00b6\2\u0329S\3\2\2\2\u032a\u032b"+
		"\7\26\2\2\u032b\u032c\5\u0090I\2\u032cU\3\2\2\2\u032d\u032e\7\27\2\2\u032e"+
		"\u0330\5\u0090I\2\u032f\u0331\5X-\2\u0330\u032f\3\2\2\2\u0330\u0331\3"+
		"\2\2\2\u0331W\3\2\2\2\u0332\u0334\5Z.\2\u0333\u0335\5X-\2\u0334\u0333"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335Y\3\2\2\2\u0336\u0338\7\30\2\2\u0337"+
		"\u0339\5\u014a\u00a6\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b"+
		"\3\2\2\2\u033a\u033c\58\35\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d\u033e\5\u0090I\2\u033e[\3\2\2\2\u033f\u0342\5^\60"+
		"\2\u0340\u0342\5n8\2\u0341\u033f\3\2\2\2\u0341\u0340\3\2\2\2\u0342]\3"+
		"\2\2\2\u0343\u0344\7\31\2\2\u0344\u0346\5f\64\2\u0345\u0347\5\6\4\2\u0346"+
		"\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\3\2\2\2\u0348\u034a\5`"+
		"\61\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b"+
		"\u034d\5d\63\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\u034f\7\32\2\2\u034f_\3\2\2\2\u0350\u0352\5b\62\2\u0351\u0353"+
		"\5`\61\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353a\3\2\2\2\u0354"+
		"\u0355\7\33\2\2\u0355\u0357\5f\64\2\u0356\u0358\5\6\4\2\u0357\u0356\3"+
		"\2\2\2\u0357\u0358\3\2\2\2\u0358c\3\2\2\2\u0359\u035b\7\34\2\2\u035a\u035c"+
		"\5\6\4\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035ce\3\2\2\2\u035d"+
		"\u035e\b\64\1\2\u035e\u0368\5h\65\2\u035f\u0368\5\u01d4\u00eb\2\u0360"+
		"\u0368\5\u01fc\u00ff\2\u0361\u0362\7l\2\2\u0362\u0363\5f\64\2\u0363\u0364"+
		"\7o\2\2\u0364\u0368\3\2\2\2\u0365\u0366\7w\2\2\u0366\u0368\5f\64\5\u0367"+
		"\u035d\3\2\2\2\u0367\u035f\3\2\2\2\u0367\u0360\3\2\2\2\u0367\u0361\3\2"+
		"\2\2\u0367\u0365\3\2\2\2\u0368\u0373\3\2\2\2\u0369\u036a\f\4\2\2\u036a"+
		"\u036b\5\u01de\u00f0\2\u036b\u036c\5f\64\5\u036c\u0372\3\2\2\2\u036d\u036e"+
		"\f\3\2\2\u036e\u036f\5\u01e0\u00f1\2\u036f\u0370\5f\64\4\u0370\u0372\3"+
		"\2\2\2\u0371\u0369\3\2\2\2\u0371\u036d\3\2\2\2\u0372\u0375\3\2\2\2\u0373"+
		"\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374g\3\2\2\2\u0375\u0373\3\2\2\2"+
		"\u0376\u0377\7\35\2\2\u0377\u0378\7l\2\2\u0378\u0379\5j\66\2\u0379\u037a"+
		"\7o\2\2\u037a\u0381\3\2\2\2\u037b\u037c\7\36\2\2\u037c\u037d\7l\2\2\u037d"+
		"\u037e\5l\67\2\u037e\u037f\7o\2\2\u037f\u0381\3\2\2\2\u0380\u0376\3\2"+
		"\2\2\u0380\u037b\3\2\2\2\u0381i\3\2\2\2\u0382\u0383\t\3\2\2\u0383k\3\2"+
		"\2\2\u0384\u0385\t\4\2\2\u0385m\3\2\2\2\u0386\u038c\7\'\2\2\u0387\u0388"+
		"\7\'\2\2\u0388\u0389\5p9\2\u0389\u038a\5r:\2\u038a\u038c\3\2\2\2\u038b"+
		"\u0386\3\2\2\2\u038b\u0387\3\2\2\2\u038co\3\2\2\2\u038d\u038e\5\u0200"+
		"\u0101\2\u038eq\3\2\2\2\u038f\u0390\7\u008d\2\2\u0390s\3\2\2\2\u0391\u0392"+
		"\7t\2\2\u0392\u0394\5v<\2\u0393\u0395\5z>\2\u0394\u0393\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\7u\2\2\u0397u\3\2\2\2\u0398"+
		"\u039d\5x=\2\u0399\u039a\7q\2\2\u039a\u039c\5x=\2\u039b\u0399\3\2\2\2"+
		"\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039ew\3"+
		"\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03aa\5\u01bc\u00df\2\u03a1\u03a2\5\u01bc"+
		"\u00df\2\u03a2\u03a3\7r\2\2\u03a3\u03a4\5\u01ba\u00de\2\u03a4\u03aa\3"+
		"\2\2\2\u03a5\u03a6\5\u01bc\u00df\2\u03a6\u03a7\7r\2\2\u03a7\u03a8\5\u01c8"+
		"\u00e5\2\u03a8\u03aa\3\2\2\2\u03a9\u03a0\3\2\2\2\u03a9\u03a1\3\2\2\2\u03a9"+
		"\u03a5\3\2\2\2\u03aay\3\2\2\2\u03ab\u03ac\7\17\2\2\u03ac\u03ad\5|?\2\u03ad"+
		"{\3\2\2\2\u03ae\u03b4\5~@\2\u03af\u03b0\5~@\2\u03b0\u03b1\7q\2\2\u03b1"+
		"\u03b2\5|?\2\u03b2\u03b4\3\2\2\2\u03b3\u03ae\3\2\2\2\u03b3\u03af\3\2\2"+
		"\2\u03b4}\3\2\2\2\u03b5\u03b8\5\u0080A\2\u03b6\u03b8\5\u0082B\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\177\3\2\2\2\u03b9\u03ba\5\u01ba"+
		"\u00de\2\u03ba\u03bb\7r\2\2\u03bb\u03bc\5\u01ba\u00de\2\u03bc\u03c2\3"+
		"\2\2\2\u03bd\u03be\5\u01ba\u00de\2\u03be\u03bf\7r\2\2\u03bf\u03c0\5\u01c8"+
		"\u00e5\2\u03c0\u03c2\3\2\2\2\u03c1\u03b9\3\2\2\2\u03c1\u03bd\3\2\2\2\u03c2"+
		"\u0081\3\2\2\2\u03c3\u03c4\5\u01ba\u00de\2\u03c4\u03c5\5\u01e6\u00f4\2"+
		"\u03c5\u03c6\5\u01b6\u00dc\2\u03c6\u0083\3\2\2\2\u03c7\u03c8\7t\2\2\u03c8"+
		"\u03c9\5\u0086D\2\u03c9\u03ca\7u\2\2\u03ca\u0085\3\2\2\2\u03cb\u03d0\5"+
		"\u0088E\2\u03cc\u03cd\7q\2\2\u03cd\u03cf\5\u0088E\2\u03ce\u03cc\3\2\2"+
		"\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u0087"+
		"\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\5\u01b6\u00dc\2\u03d4\u0089\3"+
		"\2\2\2\u03d5\u03e4\5\u0092J\2\u03d6\u03e4\5\u009aN\2\u03d7\u03e4\5\u00a2"+
		"R\2\u03d8\u03e4\5\u00bc_\2\u03d9\u03e4\5\u00c4c\2\u03da\u03e4\5\u00de"+
		"p\2\u03db\u03e4\5\u0100\u0081\2\u03dc\u03e4\5\u0106\u0084\2\u03dd\u03e4"+
		"\5\u010c\u0087\2\u03de\u03e4\5\u0120\u0091\2\u03df\u03e4\5\u0126\u0094"+
		"\2\u03e0\u03e4\5\u0128\u0095\2\u03e1\u03e4\5\u012c\u0097\2\u03e2\u03e4"+
		"\5\u0132\u009a\2\u03e3\u03d5\3\2\2\2\u03e3\u03d6\3\2\2\2\u03e3\u03d7\3"+
		"\2\2\2\u03e3\u03d8\3\2\2\2\u03e3\u03d9\3\2\2\2\u03e3\u03da\3\2\2\2\u03e3"+
		"\u03db\3\2\2\2\u03e3\u03dc\3\2\2\2\u03e3\u03dd\3\2\2\2\u03e3\u03de\3\2"+
		"\2\2\u03e3\u03df\3\2\2\2\u03e3\u03e0\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3"+
		"\u03e2\3\2\2\2\u03e4\u008b\3\2\2\2\u03e5\u03e7\5\u008aF\2\u03e6\u03e5"+
		"\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u008d\3\2\2\2\u03ea\u03ec\5\6\4\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2"+
		"\2\2\u03ec\u008f\3\2\2\2\u03ed\u03ef\7k\2\2\u03ee\u03f0\5\6\4\2\u03ef"+
		"\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\7n"+
		"\2\2\u03f2\u0091\3\2\2\2\u03f3\u03f5\5\u0164\u00b3\2\u03f4\u03f3\3\2\2"+
		"\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\7(\2\2\u03f7\u03f9"+
		"\5\u0094K\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2"+
		"\2\u03fa\u03fb\5\u0096L\2\u03fb\u0093\3\2\2\2\u03fc\u03fd\t\5\2\2\u03fd"+
		"\u0095\3\2\2\2\u03fe\u0404\5\u0098M\2\u03ff\u0400\5\u0098M\2\u0400\u0401"+
		"\7j\2\2\u0401\u0402\5\u0096L\2\u0402\u0404\3\2\2\2\u0403\u03fe\3\2\2\2"+
		"\u0403\u03ff\3\2\2\2\u0404\u0097\3\2\2\2\u0405\u0408\5\u01d4\u00eb\2\u0406"+
		"\u0408\5\u01ee\u00f8\2\u0407\u0405\3\2\2\2\u0407\u0406\3\2\2\2\u0408\u0099"+
		"\3\2\2\2\u0409\u040b\5\u0164\u00b3\2\u040a\u0409\3\2\2\2\u040a\u040b\3"+
		"\2\2\2\u040b\u040d\3\2\2\2\u040c\u040e\5\u0146\u00a4\2\u040d\u040c\3\2"+
		"\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\7\7\2\2\u0410"+
		"\u0411\5\u009cO\2\u0411\u009b\3\2\2\2\u0412\u0417\5\u009eP\2\u0413\u0414"+
		"\7q\2\2\u0414\u0416\5\u009eP\2\u0415\u0413\3\2\2\2\u0416\u0419\3\2\2\2"+
		"\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u009d\3\2\2\2\u0419\u0417"+
		"\3\2\2\2\u041a\u041c\5\u014a\u00a6\2\u041b\u041d\5\u00a0Q\2\u041c\u041b"+
		"\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u009f\3\2\2\2\u041e\u041f\5\u01da\u00ee"+
		"\2\u041f\u0420\5\u016a\u00b6\2\u0420\u00a1\3\2\2\2\u0421\u0422\5\u00a4"+
		"S\2\u0422\u0423\5\u009cO\2\u0423\u0445\3\2\2\2\u0424\u0425\5\u00a4S\2"+
		"\u0425\u0426\5\u00a6T\2\u0426\u0427\5\u01b8\u00dd\2\u0427\u0428\5\u0090"+
		"I\2\u0428\u0445\3\2\2\2\u0429\u042a\5\u00a4S\2\u042a\u042b\5\u00a6T\2"+
		"\u042b\u042c\5\u01b8\u00dd\2\u042c\u042d\5\u00a8U\2\u042d\u0445\3\2\2"+
		"\2\u042e\u042f\5\u00a4S\2\u042f\u0430\5\u00a6T\2\u0430\u0431\5\u01b8\u00dd"+
		"\2\u0431\u0432\5\u00b0Y\2\u0432\u0445\3\2\2\2\u0433\u0434\5\u00a4S\2\u0434"+
		"\u0435\5\u00a6T\2\u0435\u0437\5\u01b8\u00dd\2\u0436\u0438\5\u00a0Q\2\u0437"+
		"\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\5\u00b6"+
		"\\\2\u043a\u0445\3\2\2\2\u043b\u043c\5\u00a4S\2\u043c\u043d\5\u00a6T\2"+
		"\u043d\u043e\5\u01b8\u00dd\2\u043e\u0440\5\u01b8\u00dd\2\u043f\u0441\5"+
		"\u00a0Q\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2"+
		"\u0442\u0443\5\u00b6\\\2\u0443\u0445\3\2\2\2\u0444\u0421\3\2\2\2\u0444"+
		"\u0424\3\2\2\2\u0444\u0429\3\2\2\2\u0444\u042e\3\2\2\2\u0444\u0433\3\2"+
		"\2\2\u0444\u043b\3\2\2\2\u0445\u00a3\3\2\2\2\u0446\u0448\5\u0164\u00b3"+
		"\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2\2\2\u0449\u044b"+
		"\5\u0146\u00a4\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3"+
		"\2\2\2\u044c\u044d\7\b\2\2\u044d\u00a5\3\2\2\2\u044e\u044f\5\u01d4\u00eb"+
		"\2\u044f\u00a7\3\2\2\2\u0450\u0451\7k\2\2\u0451\u0453\5\u00aaV\2\u0452"+
		"\u0454\5\u00acW\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455"+
		"\3\2\2\2\u0455\u0456\7n\2\2\u0456\u045d\3\2\2\2\u0457\u0458\7k\2\2\u0458"+
		"\u0459\5\u00acW\2\u0459\u045a\5\u00aaV\2\u045a\u045b\7n\2\2\u045b\u045d"+
		"\3\2\2\2\u045c\u0450\3\2\2\2\u045c\u0457\3\2\2\2\u045d\u00a9\3\2\2\2\u045e"+
		"\u0460\5\u0164\u00b3\2\u045f\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461"+
		"\3\2\2\2\u0461\u0462\7/\2\2\u0462\u0463\5\u0090I\2\u0463\u00ab\3\2\2\2"+
		"\u0464\u0466\5\u0164\u00b3\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466"+
		"\u0467\3\2\2\2\u0467\u0469\7\60\2\2\u0468\u046a\5\u00aeX\2\u0469\u0468"+
		"\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\5\u0090I"+
		"\2\u046c\u00ad\3\2\2\2\u046d\u046e\7l\2\2\u046e\u046f\5\u01d4\u00eb\2"+
		"\u046f\u0470\7o\2\2\u0470\u00af\3\2\2\2\u0471\u0472\7k\2\2\u0472\u0474"+
		"\5\u00b2Z\2\u0473\u0475\5\u00b4[\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u0476\3\2\2\2\u0476\u0477\7n\2\2\u0477\u047e\3\2\2\2\u0478"+
		"\u0479\7k\2\2\u0479\u047a\5\u00b4[\2\u047a\u047b\5\u00b2Z\2\u047b\u047c"+
		"\7n\2\2\u047c\u047e\3\2\2\2\u047d\u0471\3\2\2\2\u047d\u0478\3\2\2\2\u047e"+
		"\u00b1\3\2\2\2\u047f\u0481\5\u0164\u00b3\2\u0480\u047f\3\2\2\2\u0480\u0481"+
		"\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\7/\2\2\u0483\u00b3\3\2\2\2\u0484"+
		"\u0486\5\u0164\u00b3\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487"+
		"\3\2\2\2\u0487\u0488\7\60\2\2\u0488\u00b5\3\2\2\2\u0489\u048a\7k\2\2\u048a"+
		"\u048c\5\u00b8]\2\u048b\u048d\5\u00ba^\2\u048c\u048b\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\7n\2\2\u048f\u0496\3\2\2\2\u0490"+
		"\u0491\7k\2\2\u0491\u0492\5\u00ba^\2\u0492\u0493\5\u00b8]\2\u0493\u0494"+
		"\7n\2\2\u0494\u0496\3\2\2\2\u0495\u0489\3\2\2\2\u0495\u0490\3\2\2\2\u0496"+
		"\u00b7\3\2\2\2\u0497\u0499\5\u0164\u00b3\2\u0498\u0497\3\2\2\2\u0498\u0499"+
		"\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\7\61\2\2\u049b\u049d\5\u00ae"+
		"X\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\u049f\5\u0090I\2\u049f\u00b9\3\2\2\2\u04a0\u04a2\5\u0164\u00b3\2\u04a1"+
		"\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\7\62"+
		"\2\2\u04a4\u04a6\5\u00aeX\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04a7\3\2\2\2\u04a7\u04a8\5\u0090I\2\u04a8\u00bb\3\2\2\2\u04a9\u04aa"+
		"\5\u00be`\2\u04aa\u04ab\5\u00c2b\2\u04ab\u00bd\3\2\2\2\u04ac\u04ae\5\u0164"+
		"\u00b3\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04b1\5\u0148\u00a5\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2"+
		"\3\2\2\2\u04b2\u04b3\7)\2\2\u04b3\u04b4\5\u00c0a\2\u04b4\u00bf\3\2\2\2"+
		"\u04b5\u04b6\5\u01d4\u00eb\2\u04b6\u00c1\3\2\2\2\u04b7\u04b8\5\u01da\u00ee"+
		"\2\u04b8\u04b9\5\u01b6\u00dc\2\u04b9\u00c3\3\2\2\2\u04ba\u04bb\5\u00c6"+
		"d\2\u04bb\u04bd\5\u00c8e\2\u04bc\u04be\5t;\2\u04bd\u04bc\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\5\u00caf\2\u04c0\u04c2"+
		"\5\u00ceh\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u00c5\3\2\2"+
		"\2\u04c3\u04c5\5\u0164\u00b3\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2"+
		"\u04c5\u04c7\3\2\2\2\u04c6\u04c8\5\u0146\u00a4\2\u04c7\u04c6\3\2\2\2\u04c7"+
		"\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\7.\2\2\u04ca\u00c7\3\2"+
		"\2\2\u04cb\u04ce\5\u01d4\u00eb\2\u04cc\u04ce\5\u01ee\u00f8\2\u04cd\u04cb"+
		"\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u00c9\3\2\2\2\u04cf\u04d1\5\u00d0i"+
		"\2\u04d0\u04d2\7\63\2\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d4\3\2\2\2\u04d3\u04d5\5\u00ccg\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u04dc\3\2\2\2\u04d6\u04d7\5\u00d0i\2\u04d7\u04d9\7\64\2"+
		"\2\u04d8\u04da\5\u00ccg\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04dc\3\2\2\2\u04db\u04cf\3\2\2\2\u04db\u04d6\3\2\2\2\u04dc\u00cb\3\2"+
		"\2\2\u04dd\u04df\5\u01e2\u00f2\2\u04de\u04e0\5\u0164\u00b3\2\u04df\u04de"+
		"\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\5\u01b6\u00dc"+
		"\2\u04e2\u00cd\3\2\2\2\u04e3\u04e4\5\u0090I\2\u04e4\u00cf\3\2\2\2\u04e5"+
		"\u04e7\5\u00d2j\2\u04e6\u04e8\5\u00d0i\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8"+
		"\3\2\2\2\u04e8\u00d1\3\2\2\2\u04e9\u04ea\7l\2\2\u04ea\u04f0\7o\2\2\u04eb"+
		"\u04ec\7l\2\2\u04ec\u04ed\5\u00d4k\2\u04ed\u04ee\7o\2\2\u04ee\u04f0\3"+
		"\2\2\2\u04ef\u04e9\3\2\2\2\u04ef\u04eb\3\2\2\2\u04f0\u00d3\3\2\2\2\u04f1"+
		"\u04f6\5\u00d6l\2\u04f2\u04f3\7q\2\2\u04f3\u04f5\5\u00d6l\2\u04f4\u04f2"+
		"\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u00d5\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04fb\7\7\2\2\u04fa\u04f9\3\2"+
		"\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fe\5\u00d8m\2\u04fd"+
		"\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\5\u00da"+
		"n\2\u0500\u0502\5\u01b8\u00dd\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2"+
		"\2\u0502\u0504\3\2\2\2\u0503\u0505\5\u00dco\2\u0504\u0503\3\2\2\2\u0504"+
		"\u0505\3\2\2\2\u0505\u0520\3\2\2\2\u0506\u0508\7\b\2\2\u0507\u0509\5\u00d8"+
		"m\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u050c\5\u00dan\2\u050b\u050d\5\u01b8\u00dd\2\u050c\u050b\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050d\u050f\3\2\2\2\u050e\u0510\5\u00dco\2\u050f\u050e"+
		"\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0520\3\2\2\2\u0511\u0513\7\65\2\2"+
		"\u0512\u0514\5\u00d8m\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515\u0516\5\u00dan\2\u0516\u0517\5\u01b8\u00dd\2\u0517"+
		"\u0520\3\2\2\2\u0518\u051a\5\u00d8m\2\u0519\u0518\3\2\2\2\u0519\u051a"+
		"\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\5\u00dan\2\u051c\u051d\5\u01b8"+
		"\u00dd\2\u051d\u051e\5\u01e4\u00f3\2\u051e\u0520\3\2\2\2\u051f\u04fa\3"+
		"\2\2\2\u051f\u0506\3\2\2\2\u051f\u0511\3\2\2\2\u051f\u0519\3\2\2\2\u0520"+
		"\u00d7\3\2\2\2\u0521\u0524\5\u01d4\u00eb\2\u0522\u0524\7v\2\2\u0523\u0521"+
		"\3\2\2\2\u0523\u0522\3\2\2\2\u0524\u00d9\3\2\2\2\u0525\u0528\5\u01d4\u00eb"+
		"\2\u0526\u0528\7v\2\2\u0527\u0525\3\2\2\2\u0527\u0526\3\2\2\2\u0528\u00db"+
		"\3\2\2\2\u0529\u052a\5\u01da\u00ee\2\u052a\u052b\5\u016a\u00b6\2\u052b"+
		"\u00dd\3\2\2\2\u052c\u052e\5\u0164\u00b3\2\u052d\u052c\3\2\2\2\u052d\u052e"+
		"\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u0531\5\u0148\u00a5\2\u0530\u052f\3"+
		"\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u053b\5\u00e0q\2"+
		"\u0533\u0535\5\u0164\u00b3\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u0538\5\u0148\u00a5\2\u0537\u0536\3\2\2\2\u0537\u0538"+
		"\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053b\5\u00f0y\2\u053a\u052d\3\2\2"+
		"\2\u053a\u0534\3\2\2\2\u053b\u00df\3\2\2\2\u053c\u053e\7\66\2\2\u053d"+
		"\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\7,"+
		"\2\2\u0540\u0542\5\u00ecw\2\u0541\u0543\5t;\2\u0542\u0541\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0546\5\u01ce\u00e8\2\u0545\u0544"+
		"\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\7k\2\2\u0548"+
		"\u054a\5\u00e2r\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b"+
		"\3\2\2\2\u054b\u054c\7n\2\2\u054c\u00e1\3\2\2\2\u054d\u054f\5\u00e4s\2"+
		"\u054e\u0550\5\u00e2r\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550"+
		"\u00e3\3\2\2\2\u0551\u0554\5\u008aF\2\u0552\u0554\5\u00e6t\2\u0553\u0551"+
		"\3\2\2\2\u0553\u0552\3\2\2\2\u0554\u00e5\3\2\2\2\u0555\u0557\5\u0164\u00b3"+
		"\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2\u0558\u055a"+
		"\7\66\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2\2\2"+
		"\u055b\u055c\7\4\2\2\u055c\u055d\5\u00e8u\2\u055d\u00e7\3\2\2\2\u055e"+
		"\u0564\5\u00eav\2\u055f\u0560\5\u00eav\2\u0560\u0561\7q\2\2\u0561\u0562"+
		"\5\u00e8u\2\u0562\u0564\3\2\2\2\u0563\u055e\3\2\2\2\u0563\u055f\3\2\2"+
		"\2\u0564\u00e9\3\2\2\2\u0565\u0567\5\u00eex\2\u0566\u0568\5\u01be\u00e0"+
		"\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u00eb\3\2\2\2\u0569\u056a"+
		"\5\u01d4\u00eb\2\u056a\u00ed\3\2\2\2\u056b\u056c\5\u01d4\u00eb\2\u056c"+
		"\u00ef\3\2\2\2\u056d\u056e\7,\2\2\u056e\u0570\5\u00ecw\2\u056f\u0571\5"+
		"t;\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572"+
		"\u0573\5\u01ce\u00e8\2\u0573\u0574\7k\2\2\u0574\u0575\5\u00f2z\2\u0575"+
		"\u0576\7n\2\2\u0576\u00f1\3\2\2\2\u0577\u0579\5\u00f4{\2\u0578\u057a\5"+
		"\u00f2z\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u00f3\3\2\2\2"+
		"\u057b\u057e\5\u008aF\2\u057c\u057e\5\u00f6|\2\u057d\u057b\3\2\2\2\u057d"+
		"\u057c\3\2\2\2\u057e\u00f5\3\2\2\2\u057f\u0581\5\u0164\u00b3\2\u0580\u057f"+
		"\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\7\4\2\2\u0583"+
		"\u0584\5\u00f8}\2\u0584\u00f7\3\2\2\2\u0585\u058b\5\u00fa~\2\u0586\u0587"+
		"\5\u00fa~\2\u0587\u0588\7q\2\2\u0588\u0589\5\u00f8}\2\u0589\u058b\3\2"+
		"\2\2\u058a\u0585\3\2\2\2\u058a\u0586\3\2\2\2\u058b\u00f9\3\2\2\2\u058c"+
		"\u058e\5\u00eex\2\u058d\u058f\5\u00fc\177\2\u058e\u058d\3\2\2\2\u058e"+
		"\u058f\3\2\2\2\u058f\u00fb\3\2\2\2\u0590\u0591\5\u01da\u00ee\2\u0591\u0592"+
		"\5\u00fe\u0080\2\u0592\u00fd\3\2\2\2\u0593\u0597\5\u01fa\u00fe\2\u0594"+
		"\u0597\7\u008d\2\2\u0595\u0597\5\u01fc\u00ff\2\u0596\u0593\3\2\2\2\u0596"+
		"\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597\u00ff\3\2\2\2\u0598\u059a\5\u0164"+
		"\u00b3\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\3\2\2\2\u059b"+
		"\u059d\5\u0148\u00a5\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e"+
		"\3\2\2\2\u059e\u059f\7*\2\2\u059f\u05a1\5\u0102\u0082\2\u05a0\u05a2\5"+
		"t;\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3"+
		"\u05a5\5\u01ce\u00e8\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6"+
		"\3\2\2\2\u05a6\u05a7\5\u0104\u0083\2\u05a7\u0101\3\2\2\2\u05a8\u05a9\5"+
		"\u01d4\u00eb\2\u05a9\u0103\3\2\2\2\u05aa\u05ac\7k\2\2\u05ab\u05ad\5\u008c"+
		"G\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u05af\7n\2\2\u05af\u0105\3\2\2\2\u05b0\u05b2\5\u0164\u00b3\2\u05b1\u05b0"+
		"\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b5\5\u0148\u00a5"+
		"\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7"+
		"\7+\2\2\u05b7\u05b9\5\u0108\u0085\2\u05b8\u05ba\5t;\2\u05b9\u05b8\3\2"+
		"\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05bd\5\u01ce\u00e8"+
		"\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf"+
		"\5\u010a\u0086\2\u05bf\u0107\3\2\2\2\u05c0\u05c1\5\u01d4\u00eb\2\u05c1"+
		"\u0109\3\2\2\2\u05c2\u05c4\7k\2\2\u05c3\u05c5\5\u008cG\2\u05c4\u05c3\3"+
		"\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\7n\2\2\u05c7"+
		"\u010b\3\2\2\2\u05c8\u05ca\5\u0164\u00b3\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca"+
		"\3\2\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05cd\5\u0148\u00a5\2\u05cc\u05cb\3"+
		"\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\7-\2\2\u05cf"+
		"\u05d1\5\u010e\u0088\2\u05d0\u05d2\5\u01ce\u00e8\2\u05d1\u05d0\3\2\2\2"+
		"\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\5\u0110\u0089\2\u05d4"+
		"\u010d\3\2\2\2\u05d5\u05d6\5\u01d4\u00eb\2\u05d6\u010f\3\2\2\2\u05d7\u05d9"+
		"\7k\2\2\u05d8\u05da\5\u0114\u008b\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3"+
		"\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\7n\2\2\u05dc\u0111\3\2\2\2\u05dd"+
		"\u05e3\5\u0116\u008c\2\u05de\u05e3\5\u0118\u008d\2\u05df\u05e3\5\u011a"+
		"\u008e\2\u05e0\u05e3\5\u011c\u008f\2\u05e1\u05e3\5\u011e\u0090\2\u05e2"+
		"\u05dd\3\2\2\2\u05e2\u05de\3\2\2\2\u05e2\u05df\3\2\2\2\u05e2\u05e0\3\2"+
		"\2\2\u05e2\u05e1\3\2\2\2\u05e3\u0113\3\2\2\2\u05e4\u05e6\5\u0112\u008a"+
		"\2\u05e5\u05e7\5\u0114\u008b\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2"+
		"\u05e7\u0115\3\2\2\2\u05e8\u05e9\5\u00a4S\2\u05e9\u05ea\5\u00a6T\2\u05ea"+
		"\u05eb\5\u01b8\u00dd\2\u05eb\u05ec\5\u00b0Y\2\u05ec\u0117\3\2\2\2\u05ed"+
		"\u05ee\5\u00c6d\2\u05ee\u05f0\5\u00c8e\2\u05ef\u05f1\5t;\2\u05f0\u05ef"+
		"\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\5\u00caf"+
		"\2\u05f3\u0119\3\2\2\2\u05f4\u05f6\5\u0122\u0092\2\u05f5\u05f7\5t;\2\u05f6"+
		"\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\5\u00d2"+
		"j\2\u05f9\u05fb\7\63\2\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u0604\3\2\2\2\u05fc\u05fe\5\u0122\u0092\2\u05fd\u05ff\5t;\2\u05fe\u05fd"+
		"\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\5\u00d2j"+
		"\2\u0601\u0602\7\64\2\2\u0602\u0604\3\2\2\2\u0603\u05f4\3\2\2\2\u0603"+
		"\u05fc\3\2\2\2\u0604\u011b\3\2\2\2\u0605\u0606\5\u012e\u0098\2\u0606\u0607"+
		"\5\u0130\u0099\2\u0607\u0608\5\u00b0Y\2\u0608\u011d\3\2\2\2\u0609\u060b"+
		"\5\u0164\u00b3\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\3"+
		"\2\2\2\u060c\u060e\5\u0148\u00a5\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2"+
		"\2\2\u060e\u060f\3\2\2\2\u060f\u0610\7\67\2\2\u0610\u0612\5\u00c0a\2\u0611"+
		"\u0613\5\u01ce\u00e8\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615"+
		"\3\2\2\2\u0614\u0616\5\u00c2b\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2"+
		"\2\u0616\u011f\3\2\2\2\u0617\u0619\5\u0122\u0092\2\u0618\u061a\5t;\2\u0619"+
		"\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\5\u00d2"+
		"j\2\u061c\u061e\7\63\2\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u0620\5\u0124\u0093\2\u0620\u062a\3\2\2\2\u0621\u0623"+
		"\5\u0122\u0092\2\u0622\u0624\5t;\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u0625\3\2\2\2\u0625\u0626\5\u00d2j\2\u0626\u0627\7\64\2\2\u0627"+
		"\u0628\5\u0124\u0093\2\u0628\u062a\3\2\2\2\u0629\u0617\3\2\2\2\u0629\u0621"+
		"\3\2\2\2\u062a\u0121\3\2\2\2\u062b\u062d\5\u0164\u00b3\2\u062c\u062b\3"+
		"\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u0630\5\u0146\u00a4"+
		"\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0643"+
		"\78\2\2\u0632\u0634\5\u0164\u00b3\2\u0633\u0632\3\2\2\2\u0633\u0634\3"+
		"\2\2\2\u0634\u0636\3\2\2\2\u0635\u0637\5\u0146\u00a4\2\u0636\u0635\3\2"+
		"\2\2\u0636\u0637\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\78\2\2\u0639"+
		"\u0643\7x\2\2\u063a\u063c\5\u0164\u00b3\2\u063b\u063a\3\2\2\2\u063b\u063c"+
		"\3\2\2\2\u063c\u063e\3\2\2\2\u063d\u063f\5\u0146\u00a4\2\u063e\u063d\3"+
		"\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0641\78\2\2\u0641"+
		"\u0643\7w\2\2\u0642\u062c\3\2\2\2\u0642\u0633\3\2\2\2\u0642\u063b\3\2"+
		"\2\2\u0643\u0123\3\2\2\2\u0644\u0645\5\u0090I\2\u0645\u0125\3\2\2\2\u0646"+
		"\u0648\5\u0164\u00b3\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649"+
		"\3\2\2\2\u0649\u064a\79\2\2\u064a\u064b\5\u0090I\2\u064b\u0127\3\2\2\2"+
		"\u064c\u064e\5\u0148\u00a5\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u064f\3\2\2\2\u064f\u0650\7:\2\2\u0650\u0652\5\u01ba\u00de\2\u0651\u0653"+
		"\5\u01ce\u00e8\2\u0652\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3"+
		"\2\2\2\u0654\u0655\5\u012a\u0096\2\u0655\u0129\3\2\2\2\u0656\u0658\7k"+
		"\2\2\u0657\u0659\5\u008cG\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659"+
		"\u065a\3\2\2\2\u065a\u065b\7n\2\2\u065b\u012b\3\2\2\2\u065c\u065d\5\u012e"+
		"\u0098\2\u065d\u065e\5\u0130\u0099\2\u065e\u065f\5\u0090I\2\u065f\u0669"+
		"\3\2\2\2\u0660\u0661\5\u012e\u0098\2\u0661\u0662\5\u0130\u0099\2\u0662"+
		"\u0663\5\u00a8U\2\u0663\u0669\3\2\2\2\u0664\u0665\5\u012e\u0098\2\u0665"+
		"\u0666\5\u0130\u0099\2\u0666\u0667\5\u00b0Y\2\u0667\u0669\3\2\2\2\u0668"+
		"\u065c\3\2\2\2\u0668\u0660\3\2\2\2\u0668\u0664\3\2\2\2\u0669\u012d\3\2"+
		"\2\2\u066a\u066c\5\u0164\u00b3\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2"+
		"\2\u066c\u066e\3\2\2\2\u066d\u066f\5\u0146\u00a4\2\u066e\u066d\3\2\2\2"+
		"\u066e\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\7;\2\2\u0671\u0672"+
		"\5\u00d2j\2\u0672\u012f\3\2\2\2\u0673\u0675\5\u01e2\u00f2\2\u0674\u0676"+
		"\5\u0164\u00b3\2\u0675\u0674\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\3"+
		"\2\2\2\u0677\u0678\5\u01b6\u00dc\2\u0678\u0131\3\2\2\2\u0679\u067d\5\u0134"+
		"\u009b\2\u067a\u067d\5\u0136\u009c\2\u067b\u067d\5\u0138\u009d\2\u067c"+
		"\u0679\3\2\2\2\u067c\u067a\3\2\2\2\u067c\u067b\3\2\2\2\u067d\u0133\3\2"+
		"\2\2\u067e\u067f\7<\2\2\u067f\u0680\7=\2\2\u0680\u0681\5\u01ee\u00f8\2"+
		"\u0681\u0682\7k\2\2\u0682\u0683\7n\2\2\u0683\u0135\3\2\2\2\u0684\u0685"+
		"\7>\2\2\u0685\u0686\7=\2\2\u0686\u0687\5\u01ee\u00f8\2\u0687\u0688\7k"+
		"\2\2\u0688\u0689\7n\2\2\u0689\u0137\3\2\2\2\u068a\u068b\7?\2\2\u068b\u068c"+
		"\7=\2\2\u068c\u068d\5\u01ee\u00f8\2\u068d\u068e\7k\2\2\u068e\u068f\5\u013a"+
		"\u009e\2\u068f\u0690\7n\2\2\u0690\u0139\3\2\2\2\u0691\u0693\5\u013c\u009f"+
		"\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\3\2\2\2\u0694\u0696"+
		"\5\u0140\u00a1\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u013b\3"+
		"\2\2\2\u0697\u0698\7@\2\2\u0698\u0699\5\u013e\u00a0\2\u0699\u013d\3\2"+
		"\2\2\u069a\u069b\5\u0200\u0101\2\u069b\u013f\3\2\2\2\u069c\u069d\7A\2"+
		"\2\u069d\u069e\5\u0142\u00a2\2\u069e\u0141\3\2\2\2\u069f\u06a0\t\6\2\2"+
		"\u06a0\u0143\3\2\2\2\u06a1\u06bb\7+\2\2\u06a2\u06bb\7E\2\2\u06a3\u06bb"+
		"\7F\2\2\u06a4\u06bb\7G\2\2\u06a5\u06bb\7?\2\2\u06a6\u06bb\7H\2\2\u06a7"+
		"\u06bb\7I\2\2\u06a8\u06bb\7J\2\2\u06a9\u06bb\7K\2\2\u06aa\u06bb\7L\2\2"+
		"\u06ab\u06bb\7>\2\2\u06ac\u06bb\7<\2\2\u06ad\u06bb\7M\2\2\u06ae\u06bb"+
		"\7N\2\2\u06af\u06bb\7O\2\2\u06b0\u06b1\7O\2\2\u06b1\u06b2\7l\2\2\u06b2"+
		"\u06b3\7P\2\2\u06b3\u06bb\7o\2\2\u06b4\u06b5\7O\2\2\u06b5\u06b6\7l\2\2"+
		"\u06b6\u06b7\7Q\2\2\u06b7\u06bb\7o\2\2\u06b8\u06bb\7R\2\2\u06b9\u06bb"+
		"\5\u0148\u00a5\2\u06ba\u06a1\3\2\2\2\u06ba\u06a2\3\2\2\2\u06ba\u06a3\3"+
		"\2\2\2\u06ba\u06a4\3\2\2\2\u06ba\u06a5\3\2\2\2\u06ba\u06a6\3\2\2\2\u06ba"+
		"\u06a7\3\2\2\2\u06ba\u06a8\3\2\2\2\u06ba\u06a9\3\2\2\2\u06ba\u06aa\3\2"+
		"\2\2\u06ba\u06ab\3\2\2\2\u06ba\u06ac\3\2\2\2\u06ba\u06ad\3\2\2\2\u06ba"+
		"\u06ae\3\2\2\2\u06ba\u06af\3\2\2\2\u06ba\u06b0\3\2\2\2\u06ba\u06b4\3\2"+
		"\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06b9\3\2\2\2\u06bb\u0145\3\2\2\2\u06bc"+
		"\u06be\5\u0144\u00a3\2\u06bd\u06bf\5\u0146\u00a4\2\u06be\u06bd\3\2\2\2"+
		"\u06be\u06bf\3\2\2\2\u06bf\u0147\3\2\2\2\u06c0\u06d0\7S\2\2\u06c1\u06c2"+
		"\7S\2\2\u06c2\u06c3\7l\2\2\u06c3\u06c4\7\60\2\2\u06c4\u06d0\7o\2\2\u06c5"+
		"\u06d0\7T\2\2\u06c6\u06c7\7T\2\2\u06c7\u06c8\7l\2\2\u06c8\u06c9\7\60\2"+
		"\2\u06c9\u06d0\7o\2\2\u06ca\u06d0\7U\2\2\u06cb\u06cc\7U\2\2\u06cc\u06cd"+
		"\7l\2\2\u06cd\u06ce\7\60\2\2\u06ce\u06d0\7o\2\2\u06cf\u06c0\3\2\2\2\u06cf"+
		"\u06c1\3\2\2\2\u06cf\u06c5\3\2\2\2\u06cf\u06c6\3\2\2\2\u06cf\u06ca\3\2"+
		"\2\2\u06cf\u06cb\3\2\2\2\u06d0\u0149\3\2\2\2\u06d1\u06d2\b\u00a6\1\2\u06d2"+
		"\u06d4\5\u014c\u00a7\2\u06d3\u06d5\5\u01b8\u00dd\2\u06d4\u06d3\3\2\2\2"+
		"\u06d4\u06d5\3\2\2\2\u06d5\u06e5\3\2\2\2\u06d6\u06d8\5\u014e\u00a8\2\u06d7"+
		"\u06d9\5\u01b8\u00dd\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06e5"+
		"\3\2\2\2\u06da\u06e5\5\u0150\u00a9\2\u06db\u06dd\5\u0152\u00aa\2\u06dc"+
		"\u06de\5\u01b8\u00dd\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e5"+
		"\3\2\2\2\u06df\u06e5\5\u0158\u00ad\2\u06e0\u06e5\5\u015a\u00ae\2\u06e1"+
		"\u06e2\7V\2\2\u06e2\u06e5\5\u01b6\u00dc\2\u06e3\u06e5\5\u015c\u00af\2"+
		"\u06e4\u06d1\3\2\2\2\u06e4\u06d6\3\2\2\2\u06e4\u06da\3\2\2\2\u06e4\u06db"+
		"\3\2\2\2\u06e4\u06df\3\2\2\2\u06e4\u06e0\3\2\2\2\u06e4\u06e1\3\2\2\2\u06e4"+
		"\u06e3\3\2\2\2\u06e5\u06eb\3\2\2\2\u06e6\u06e7\f\4\2\2\u06e7\u06e8\7W"+
		"\2\2\u06e8\u06ea\5\u01b6\u00dc\2\u06e9\u06e6\3\2\2\2\u06ea\u06ed\3\2\2"+
		"\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u014b\3\2\2\2\u06ed\u06eb"+
		"\3\2\2\2\u06ee\u06ef\7v\2\2\u06ef\u014d\3\2\2\2\u06f0\u06f1\5\u01d4\u00eb"+
		"\2\u06f1\u014f\3\2\2\2\u06f2\u06f3\7\b\2\2\u06f3\u06f7\5\u014a\u00a6\2"+
		"\u06f4\u06f5\7\7\2\2\u06f5\u06f7\5\u014a\u00a6\2\u06f6\u06f2\3\2\2\2\u06f6"+
		"\u06f4\3\2\2\2\u06f7\u0151\3\2\2\2\u06f8\u06fa\7l\2\2\u06f9\u06fb\5\u0154"+
		"\u00ab\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc"+
		"\u06fd\7o\2\2\u06fd\u0153\3\2\2\2\u06fe\u0703\5\u0156\u00ac\2\u06ff\u0700"+
		"\7q\2\2\u0700\u0702\5\u0156\u00ac\2\u0701\u06ff\3\2\2\2\u0702\u0705\3"+
		"\2\2\2\u0703\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0155\3\2\2\2\u0705"+
		"\u0703\3\2\2\2\u0706\u0707\5\u014a\u00a6\2\u0707\u0157\3\2\2\2\u0708\u070a"+
		"\5\u01ba\u00de\2\u0709\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\3"+
		"\2\2\2\u070b\u070c\7j\2\2\u070c\u070e\5\u00eex\2\u070d\u070f\5\u0152\u00aa"+
		"\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0159\3\2\2\2\u0710\u0711"+
		"\5\u014e\u00a8\2\u0711\u0712\7x\2\2\u0712\u015b\3\2\2\2\u0713\u0714\5"+
		"\u016a\u00b6\2\u0714\u015d\3\2\2\2\u0715\u0717\7y\2\2\u0716\u0715\3\2"+
		"\2\2\u0716\u0717\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071a\5\u0160\u00b1"+
		"\2\u0719\u071b\5\u0162\u00b2\2\u071a\u0719\3\2\2\2\u071a\u071b\3\2\2\2"+
		"\u071b\u015f\3\2\2\2\u071c\u071d\5\u01d4\u00eb\2\u071d\u0161\3\2\2\2\u071e"+
		"\u0720\7l\2\2\u071f\u0721\5\u0166\u00b4\2\u0720\u071f\3\2\2\2\u0720\u0721"+
		"\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\7o\2\2\u0723\u0163\3\2\2\2\u0724"+
		"\u0726\5\u015e\u00b0\2\u0725\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0725"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0165\3\2\2\2\u0729\u072b\5\u0168\u00b5"+
		"\2\u072a\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072a\3\2\2\2\u072c\u072d"+
		"\3\2\2\2\u072d\u0167\3\2\2\2\u072e\u0730\7l\2\2\u072f\u0731\5\u0166\u00b4"+
		"\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0743"+
		"\7o\2\2\u0733\u0735\7m\2\2\u0734\u0736\5\u0166\u00b4\2\u0735\u0734\3\2"+
		"\2\2\u0735\u0736\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0743\7p\2\2\u0738"+
		"\u073a\7k\2\2\u0739\u073b\5\u0166\u00b4\2\u073a\u0739\3\2\2\2\u073a\u073b"+
		"\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0743\7n\2\2\u073d\u0743\5\u01d4\u00eb"+
		"\2\u073e\u0743\5\u016a\u00b6\2\u073f\u0743\5\u01d8\u00ed\2\u0740\u0743"+
		"\5\u01f8\u00fd\2\u0741\u0743\5\u01ee\u00f8\2\u0742\u072e\3\2\2\2\u0742"+
		"\u0733\3\2\2\2\u0742\u0738\3\2\2\2\u0742\u073d\3\2\2\2\u0742\u073e\3\2"+
		"\2\2\u0742\u073f\3\2\2\2\u0742\u0740\3\2\2\2\u0742\u0741\3\2\2\2\u0743"+
		"\u0169\3\2\2\2\u0744\u0746\5\u0172\u00ba\2\u0745\u0744\3\2\2\2\u0745\u0746"+
		"\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749\5\u016e\u00b8\2\u0748\u074a\5"+
		"\u0176\u00bc\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u016b\3\2"+
		"\2\2\u074b\u0750\5\u016a\u00b6\2\u074c\u074d\7q\2\2\u074d\u074f\5\u016a"+
		"\u00b6\2\u074e\u074c\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u016d\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0754\5\u01ea"+
		"\u00f6\2\u0754\u0755\5\u01ae\u00d8\2\u0755\u0759\3\2\2\2\u0756\u0759\5"+
		"\u01ae\u00d8\2\u0757\u0759\5\u0170\u00b9\2\u0758\u0753\3\2\2\2\u0758\u0756"+
		"\3\2\2\2\u0758\u0757\3\2\2\2\u0759\u016f\3\2\2\2\u075a\u075b\7z\2\2\u075b"+
		"\u075c\5\u01d4\u00eb\2\u075c\u0171\3\2\2\2\u075d\u075e\7X\2\2\u075e\u0763"+
		"\7x\2\2\u075f\u0760\7X\2\2\u0760\u0763\7w\2\2\u0761\u0763\7X\2\2\u0762"+
		"\u075d\3\2\2\2\u0762\u075f\3\2\2\2\u0762\u0761\3\2\2\2\u0763\u0173\3\2"+
		"\2\2\u0764\u0765\5\u01e8\u00f5\2\u0765\u0766\5\u016e\u00b8\2\u0766\u076f"+
		"\3\2\2\2\u0767\u0769\5\u0178\u00bd\2\u0768\u076a\5\u0172\u00ba\2\u0769"+
		"\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c\5\u016e"+
		"\u00b8\2\u076c\u076f\3\2\2\2\u076d\u076f\5\u017a\u00be\2\u076e\u0764\3"+
		"\2\2\2\u076e\u0767\3\2\2\2\u076e\u076d\3\2\2\2\u076f\u0175\3\2\2\2\u0770"+
		"\u0772\5\u0174\u00bb\2\u0771\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0771"+
		"\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0177\3\2\2\2\u0775\u0777\7x\2\2\u0776"+
		"\u0778\5\u0172\u00ba\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779"+
		"\3\2\2\2\u0779\u077a\5\u016a\u00b6\2\u077a\u077b\7r\2\2\u077b\u0179\3"+
		"\2\2\2\u077c\u077d\7V\2\2\u077d\u0787\5\u01b6\u00dc\2\u077e\u077f\7W\2"+
		"\2\u077f\u0787\5\u01b6\u00dc\2\u0780\u0781\7W\2\2\u0781\u0782\7x\2\2\u0782"+
		"\u0787\5\u01b6\u00dc\2\u0783\u0784\7W\2\2\u0784\u0785\7w\2\2\u0785\u0787"+
		"\5\u01b6\u00dc\2\u0786\u077c\3\2\2\2\u0786\u077e\3\2\2\2\u0786\u0780\3"+
		"\2\2\2\u0786\u0783\3\2\2\2\u0787\u017b\3\2\2\2\u0788\u078a\5\u01d4\u00eb"+
		"\2\u0789\u078b\5\u0084C\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u0795\3\2\2\2\u078c\u0795\5\u0180\u00c1\2\u078d\u0795\5\u018e\u00c8\2"+
		"\u078e\u0795\5\u0190\u00c9\2\u078f\u0795\5\u0198\u00cd\2\u0790\u0795\5"+
		"\u01a4\u00d3\2\u0791\u0795\5\u017e\u00c0\2\u0792\u0795\5\u01aa\u00d6\2"+
		"\u0793\u0795\5\u01ac\u00d7\2\u0794\u0788\3\2\2\2\u0794\u078c\3\2\2\2\u0794"+
		"\u078d\3\2\2\2\u0794\u078e\3\2\2\2\u0794\u078f\3\2\2\2\u0794\u0790\3\2"+
		"\2\2\u0794\u0791\3\2\2\2\u0794\u0792\3\2\2\2\u0794\u0793\3\2\2\2\u0795"+
		"\u017d\3\2\2\2\u0796\u0797\7j\2\2\u0797\u0798\5\u01d4\u00eb\2\u0798\u017f"+
		"\3\2\2\2\u0799\u07a1\5\u01f8\u00fd\2\u079a\u07a1\5\u0182\u00c2\2\u079b"+
		"\u07a1\5\u0188\u00c5\2\u079c\u07a1\7Y\2\2\u079d\u07a1\7Z\2\2\u079e\u07a1"+
		"\7[\2\2\u079f\u07a1\7\\\2\2\u07a0\u0799\3\2\2\2\u07a0\u079a\3\2\2\2\u07a0"+
		"\u079b\3\2\2\2\u07a0\u079c\3\2\2\2\u07a0\u079d\3\2\2\2\u07a0\u079e\3\2"+
		"\2\2\u07a0\u079f\3\2\2\2\u07a1\u0181\3\2\2\2\u07a2\u07a4\7m\2\2\u07a3"+
		"\u07a5\5\u0184\u00c3\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6"+
		"\3\2\2\2\u07a6\u07a7\7p\2\2\u07a7\u0183\3\2\2\2\u07a8\u07ad\5\u0186\u00c4"+
		"\2\u07a9\u07aa\7q\2\2\u07aa\u07ac\5\u0186\u00c4\2\u07ab\u07a9\3\2\2\2"+
		"\u07ac\u07af\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b1"+
		"\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0\u07b2\7q\2\2\u07b1\u07b0\3\2\2\2\u07b1"+
		"\u07b2\3\2\2\2\u07b2\u0185\3\2\2\2\u07b3\u07b4\5\u016a\u00b6\2\u07b4\u0187"+
		"\3\2\2\2\u07b5\u07b6\7m\2\2\u07b6\u07b7\5\u018a\u00c6\2\u07b7\u07b8\7"+
		"p\2\2\u07b8\u07bd\3\2\2\2\u07b9\u07ba\7m\2\2\u07ba\u07bb\7r\2\2\u07bb"+
		"\u07bd\7p\2\2\u07bc\u07b5\3\2\2\2\u07bc\u07b9\3\2\2\2\u07bd\u0189\3\2"+
		"\2\2\u07be\u07c3\5\u018c\u00c7\2\u07bf\u07c0\7q\2\2\u07c0\u07c2\5\u018c"+
		"\u00c7\2\u07c1\u07bf\3\2\2\2\u07c2\u07c5\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3"+
		"\u07c4\3\2\2\2\u07c4\u07c7\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c6\u07c8\7q"+
		"\2\2\u07c7\u07c6\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u018b\3\2\2\2\u07c9"+
		"\u07ca\5\u016a\u00b6\2\u07ca\u07cb\7r\2\2\u07cb\u07cc\5\u016a\u00b6\2"+
		"\u07cc\u018d\3\2\2\2\u07cd\u07da\7]\2\2\u07ce\u07cf\7]\2\2\u07cf\u07d0"+
		"\7j\2\2\u07d0\u07da\5\u01d4\u00eb\2\u07d1\u07d2\7]\2\2\u07d2\u07d3\7m"+
		"\2\2\u07d3\u07d4\5\u016c\u00b7\2\u07d4\u07d5\7p\2\2\u07d5\u07da\3\2\2"+
		"\2\u07d6\u07d7\7]\2\2\u07d7\u07d8\7j\2\2\u07d8\u07da\78\2\2\u07d9\u07cd"+
		"\3\2\2\2\u07d9\u07ce\3\2\2\2\u07d9\u07d1\3\2\2\2\u07d9\u07d6\3\2\2\2\u07da"+
		"\u018f\3\2\2\2\u07db\u07df\5\u0192\u00ca\2\u07dc\u07df\5\u0194\u00cb\2"+
		"\u07dd\u07df\5\u0196\u00cc\2\u07de\u07db\3\2\2\2\u07de\u07dc\3\2\2\2\u07de"+
		"\u07dd\3\2\2\2\u07df\u0191\3\2\2\2\u07e0\u07e1\7^\2\2\u07e1\u07e2\7j\2"+
		"\2\u07e2\u07e3\5\u01d4\u00eb\2\u07e3\u0193\3\2\2\2\u07e4\u07e5\7^\2\2"+
		"\u07e5\u07e6\7m\2\2\u07e6\u07e7\5\u016a\u00b6\2\u07e7\u07e8\7p\2\2\u07e8"+
		"\u0195\3\2\2\2\u07e9\u07ea\7^\2\2\u07ea\u07eb\7j\2\2\u07eb\u07ec\78\2"+
		"\2\u07ec\u0197\3\2\2\2\u07ed\u07ef\7k\2\2\u07ee\u07f0\5\u019a\u00ce\2"+
		"\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1\u07f3"+
		"\5\6\4\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4"+
		"\u07f5\7n\2\2\u07f5\u0199\3\2\2\2\u07f6\u07f8\5\u00d2j\2\u07f7\u07f9\5"+
		"\u00ccg\2\u07f8\u07f7\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2"+
		"\u07fa\u07fb\7\5\2\2\u07fb\u0814\3\2\2\2\u07fc\u07fe\5\u01d6\u00ec\2\u07fd"+
		"\u07ff\5\u00ccg\2\u07fe\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800"+
		"\3\2\2\2\u0800\u0801\7\5\2\2\u0801\u0814\3\2\2\2\u0802\u0803\5\u019c\u00cf"+
		"\2\u0803\u0805\5\u00d2j\2\u0804\u0806\5\u00ccg\2\u0805\u0804\3\2\2\2\u0805"+
		"\u0806\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\7\5\2\2\u0808\u0814\3\2"+
		"\2\2\u0809\u080a\5\u019c\u00cf\2\u080a\u080c\5\u01d6\u00ec\2\u080b\u080d"+
		"\5\u00ccg\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e\3\2\2"+
		"\2\u080e\u080f\7\5\2\2\u080f\u0814\3\2\2\2\u0810\u0811\5\u019c\u00cf\2"+
		"\u0811\u0812\7\5\2\2\u0812\u0814\3\2\2\2\u0813\u07f6\3\2\2\2\u0813\u07fc"+
		"\3\2\2\2\u0813\u0802\3\2\2\2\u0813\u0809\3\2\2\2\u0813\u0810\3\2\2\2\u0814"+
		"\u019b\3\2\2\2\u0815\u0816\7m\2\2\u0816\u0817\5\u019e\u00d0\2\u0817\u0818"+
		"\7p\2\2\u0818\u019d\3\2\2\2\u0819\u081e\5\u01a0\u00d1\2\u081a\u081b\7"+
		"q\2\2\u081b\u081d\5\u01a0\u00d1\2\u081c\u081a\3\2\2\2\u081d\u0820\3\2"+
		"\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u019f\3\2\2\2\u0820"+
		"\u081e\3\2\2\2\u0821\u0823\5\u01a2\u00d2\2\u0822\u0821\3\2\2\2\u0822\u0823"+
		"\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\5\u016a\u00b6\2\u0825\u01a1\3"+
		"\2\2\2\u0826\u0827\t\7\2\2\u0827\u01a3\3\2\2\2\u0828\u082a\7l\2\2\u0829"+
		"\u082b\5\u01a6\u00d4\2\u082a\u0829\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082c"+
		"\3\2\2\2\u082c\u082d\7o\2\2\u082d\u01a5\3\2\2\2\u082e\u0833\5\u01a8\u00d5"+
		"\2\u082f\u0830\7q\2\2\u0830\u0832\5\u01a8\u00d5\2\u0831\u082f\3\2\2\2"+
		"\u0832\u0835\3\2\2\2\u0833\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u01a7"+
		"\3\2\2\2\u0835\u0833\3\2\2\2\u0836\u083c\5\u016a\u00b6\2\u0837\u0838\5"+
		"\u01d4\u00eb\2\u0838\u0839\7r\2\2\u0839\u083a\5\u016a\u00b6\2\u083a\u083c"+
		"\3\2\2\2\u083b\u0836\3\2\2\2\u083b\u0837\3\2\2\2\u083c\u01a9\3\2\2\2\u083d"+
		"\u083e\7v\2\2\u083e\u01ab\3\2\2\2\u083f\u0840\7a\2\2\u0840\u0841\7l\2"+
		"\2\u0841\u0842\5\u016a\u00b6\2\u0842\u0843\7o\2\2\u0843\u01ad\3\2\2\2"+
		"\u0844\u0845\b\u00d8\1\2\u0845\u0846\5\u017c\u00bf\2\u0846\u087c\3\2\2"+
		"\2\u0847\u0848\f\16\2\2\u0848\u087b\5\u01ec\u00f7\2\u0849\u084a\f\r\2"+
		"\2\u084a\u087b\5\u01a4\u00d3\2\u084b\u084d\f\f\2\2\u084c\u084e\5\u01a4"+
		"\u00d3\2\u084d\u084c\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f"+
		"\u087b\5\u01b4\u00db\2\u0850\u0851\f\13\2\2\u0851\u0852\7j\2\2\u0852\u087b"+
		"\78\2\2\u0853\u0854\f\n\2\2\u0854\u0855\7j\2\2\u0855\u0856\78\2\2\u0856"+
		"\u0857\7l\2\2\u0857\u0858\5\u01b0\u00d9\2\u0858\u0859\7o\2\2\u0859\u087b"+
		"\3\2\2\2\u085a\u085b\f\t\2\2\u085b\u085c\7j\2\2\u085c\u087b\7\u008a\2"+
		"\2\u085d\u085e\f\b\2\2\u085e\u085f\7j\2\2\u085f\u0861\5\u01d4\u00eb\2"+
		"\u0860\u0862\5\u0084C\2\u0861\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862"+
		"\u087b\3\2\2\2\u0863\u0864\f\7\2\2\u0864\u0865\7j\2\2\u0865\u0866\5\u01d4"+
		"\u00eb\2\u0866\u0867\7l\2\2\u0867\u0868\5\u01b0\u00d9\2\u0868\u0869\7"+
		"o\2\2\u0869\u087b\3\2\2\2\u086a\u086b\f\6\2\2\u086b\u086c\7l\2\2\u086c"+
		"\u086d\5\u01b0\u00d9\2\u086d\u086e\7o\2\2\u086e\u087b\3\2\2\2\u086f\u0870"+
		"\f\5\2\2\u0870\u0871\7j\2\2\u0871\u087b\7]\2\2\u0872\u0873\f\4\2\2\u0873"+
		"\u0874\7j\2\2\u0874\u087b\7b\2\2\u0875\u0876\f\3\2\2\u0876\u0877\7m\2"+
		"\2\u0877\u0878\5\u016c\u00b7\2\u0878\u0879\7p\2\2\u0879\u087b\3\2\2\2"+
		"\u087a\u0847\3\2\2\2\u087a\u0849\3\2\2\2\u087a\u084b\3\2\2\2\u087a\u0850"+
		"\3\2\2\2\u087a\u0853\3\2\2\2\u087a\u085a\3\2\2\2\u087a\u085d\3\2\2\2\u087a"+
		"\u0863\3\2\2\2\u087a\u086a\3\2\2\2\u087a\u086f\3\2\2\2\u087a\u0872\3\2"+
		"\2\2\u087a\u0875\3\2\2\2\u087b\u087e\3\2\2\2\u087c\u087a\3\2\2\2\u087c"+
		"\u087d\3\2\2\2\u087d\u01af\3\2\2\2\u087e\u087c\3\2\2\2\u087f\u0881\5\u01b2"+
		"\u00da\2\u0880\u0882\5\u01b0\u00d9\2\u0881\u0880\3\2\2\2\u0881\u0882\3"+
		"\2\2\2\u0882\u01b1\3\2\2\2\u0883\u0884\5\u01d4\u00eb\2\u0884\u0885\7r"+
		"\2\2\u0885\u01b3\3\2\2\2\u0886\u0887\5\u0198\u00cd\2\u0887\u01b5\3\2\2"+
		"\2\u0888\u0889\b\u00dc\1\2\u0889\u088a\7m\2\2\u088a\u088b\5\u01b6\u00dc"+
		"\2\u088b\u088c\7p\2\2\u088c\u0897\3\2\2\2\u088d\u088e\7m\2\2\u088e\u088f"+
		"\5\u01b6\u00dc\2\u088f\u0890\7r\2\2\u0890\u0891\5\u01b6\u00dc\2\u0891"+
		"\u0892\7p\2\2\u0892\u0897\3\2\2\2\u0893\u0897\5\u01ba\u00de\2\u0894\u0897"+
		"\5\u01be\u00e0\2\u0895\u0897\5\u01c8\u00e5\2\u0896\u0888\3\2\2\2\u0896"+
		"\u088d\3\2\2\2\u0896\u0893\3\2\2\2\u0896\u0894\3\2\2\2\u0896\u0895\3\2"+
		"\2\2\u0897\u08b0\3\2\2\2\u0898\u089a\f\13\2\2\u0899\u089b\7\63\2\2\u089a"+
		"\u0899\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089d\5\u01e2"+
		"\u00f2\2\u089d\u089e\5\u01b6\u00dc\f\u089e\u08af\3\2\2\2\u089f\u08a0\f"+
		"\n\2\2\u08a0\u08a1\7\64\2\2\u08a1\u08a2\5\u01e2\u00f2\2\u08a2\u08a3\5"+
		"\u01b6\u00dc\13\u08a3\u08af\3\2\2\2\u08a4\u08a5\f\7\2\2\u08a5\u08af\7"+
		"x\2\2\u08a6\u08a7\f\6\2\2\u08a7\u08af\7w\2\2\u08a8\u08a9\f\4\2\2\u08a9"+
		"\u08aa\7j\2\2\u08aa\u08af\7c\2\2\u08ab\u08ac\f\3\2\2\u08ac\u08ad\7j\2"+
		"\2\u08ad\u08af\7d\2\2\u08ae\u0898\3\2\2\2\u08ae\u089f\3\2\2\2\u08ae\u08a4"+
		"\3\2\2\2\u08ae\u08a6\3\2\2\2\u08ae\u08a8\3\2\2\2\u08ae\u08ab\3\2\2\2\u08af"+
		"\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u01b7\3\2"+
		"\2\2\u08b2\u08b0\3\2\2\2\u08b3\u08b5\7r\2\2\u08b4\u08b6\5\u0164\u00b3"+
		"\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8"+
		"\5\u01b6\u00dc\2\u08b8\u01b9\3\2\2\2\u08b9\u08bb\5\u01bc\u00df\2\u08ba"+
		"\u08bc\5\u0084C\2\u08bb\u08ba\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08c5"+
		"\3\2\2\2\u08bd\u08bf\5\u01bc\u00df\2\u08be\u08c0\5\u0084C\2\u08bf\u08be"+
		"\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c2\7j\2\2\u08c2"+
		"\u08c3\5\u01ba\u00de\2\u08c3\u08c5\3\2\2\2\u08c4\u08b9\3\2\2\2\u08c4\u08bd"+
		"\3\2\2\2\u08c5\u01bb\3\2\2\2\u08c6\u08c7\5\u01d4\u00eb\2\u08c7\u01bd\3"+
		"\2\2\2\u08c8\u08ca\7l\2\2\u08c9\u08cb\5\u01c0\u00e1\2\u08ca\u08c9\3\2"+
		"\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08cd\7o\2\2\u08cd"+
		"\u01bf\3\2\2\2\u08ce\u08d0\5\u01c2\u00e2\2\u08cf\u08d1\5\u01e4\u00f3\2"+
		"\u08d0\u08cf\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u01c1\3\2\2\2\u08d2\u08d8"+
		"\5\u01c4\u00e3\2\u08d3\u08d4\5\u01c4\u00e3\2\u08d4\u08d5\7q\2\2\u08d5"+
		"\u08d6\5\u01c2\u00e2\2\u08d6\u08d8\3\2\2\2\u08d7\u08d2\3\2\2\2\u08d7\u08d3"+
		"\3\2\2\2\u08d8\u01c3\3\2\2\2\u08d9\u08db\5\u0164\u00b3\2\u08da\u08d9\3"+
		"\2\2\2\u08da\u08db\3\2\2\2\u08db\u08dd\3\2\2\2\u08dc\u08de\7\65\2\2\u08dd"+
		"\u08dc\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e7\5\u01b6"+
		"\u00dc\2\u08e0\u08e2\7\65\2\2\u08e1\u08e0\3\2\2\2\u08e1\u08e2\3\2\2\2"+
		"\u08e2\u08e3\3\2\2\2\u08e3\u08e4\5\u01c6\u00e4\2\u08e4\u08e5\5\u01b8\u00dd"+
		"\2\u08e5\u08e7\3\2\2\2\u08e6\u08da\3\2\2\2\u08e6\u08e1\3\2\2\2\u08e7\u01c5"+
		"\3\2\2\2\u08e8\u08e9\5\u01d4\u00eb\2\u08e9\u01c7\3\2\2\2\u08ea\u08eb\7"+
		"-\2\2\u08eb\u08ed\7t\2\2\u08ec\u08ee\5\u01ca\u00e6\2\u08ed\u08ec\3\2\2"+
		"\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f0\7u\2\2\u08f0\u01c9"+
		"\3\2\2\2\u08f1\u08f9\5\u01cc\u00e7\2\u08f2\u08f3\7q\2\2\u08f3\u08f5\5"+
		"\u01cc\u00e7\2\u08f4\u08f2\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f4\3\2"+
		"\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f9\3\2\2\2\u08f8\u08f1\3\2\2\2\u08f8"+
		"\u08f4\3\2\2\2\u08f9\u01cb\3\2\2\2\u08fa\u08fb\5\u01ba\u00de\2\u08fb\u01cd"+
		"\3\2\2\2\u08fc\u08fd\7r\2\2\u08fd\u08fe\5\u01d2\u00ea\2\u08fe\u08ff\7"+
		"q\2\2\u08ff\u0900\5\u01d0\u00e9\2\u0900\u0906\3\2\2\2\u0901\u0902\7r\2"+
		"\2\u0902\u0906\5\u01d2\u00ea\2\u0903\u0904\7r\2\2\u0904\u0906\5\u01d0"+
		"\u00e9\2\u0905\u08fc\3\2\2\2\u0905\u0901\3\2\2\2\u0905\u0903\3\2\2\2\u0906"+
		"\u01cf\3\2\2\2\u0907\u090d\5\u01ba\u00de\2\u0908\u0909\5\u01ba\u00de\2"+
		"\u0909\u090a\7q\2\2\u090a\u090b\5\u01d0\u00e9\2\u090b\u090d\3\2\2\2\u090c"+
		"\u0907\3\2\2\2\u090c\u0908\3\2\2\2\u090d\u01d1\3\2\2\2\u090e\u090f\7+"+
		"\2\2\u090f\u01d3\3\2\2\2\u0910\u0913\7i\2\2\u0911\u0913\5\u01d8\u00ed"+
		"\2\u0912\u0910\3\2\2\2\u0912\u0911\3\2\2\2\u0913\u01d5\3\2\2\2\u0914\u0919"+
		"\5\u01d4\u00eb\2\u0915\u0916\7q\2\2\u0916\u0918\5\u01d4\u00eb\2\u0917"+
		"\u0915\3\2\2\2\u0918\u091b\3\2\2\2\u0919\u0917\3\2\2\2\u0919\u091a\3\2"+
		"\2\2\u091a\u01d7\3\2\2\2\u091b\u0919\3\2\2\2\u091c\u091d\t\b\2\2\u091d"+
		"\u01d9\3\2\2\2\u091e\u091f\6\u00ee\27\2\u091f\u0920\7|\2\2\u0920\u01db"+
		"\3\2\2\2\u0921\u0922\6\u00ef\30\2\u0922\u0923\7{\2\2\u0923\u01dd\3\2\2"+
		"\2\u0924\u0925\6\u00f0\31\2\u0925\u0926\7z\2\2\u0926\u0927\7z\2\2\u0927"+
		"\u01df\3\2\2\2\u0928\u0929\6\u00f1\32\2\u0929\u092a\7}\2\2\u092a\u092b"+
		"\7}\2\2\u092b\u01e1\3\2\2\2\u092c\u092d\6\u00f2\33\2\u092d\u092e\7{\2"+
		"\2\u092e\u092f\7u\2\2\u092f\u01e3\3\2\2\2\u0930\u0931\6\u00f3\34\2\u0931"+
		"\u0932\7j\2\2\u0932\u0933\7j\2\2\u0933\u0934\7j\2\2\u0934\u01e5\3\2\2"+
		"\2\u0935\u0936\6\u00f4\35\2\u0936\u0937\7|\2\2\u0937\u0938\7|\2\2\u0938"+
		"\u01e7\3\2\2\2\u0939\u093a\6\u00f5\36\2\u093a\u093b\5\u01ee\u00f8\2\u093b"+
		"\u01e9\3\2\2\2\u093c\u093d\6\u00f6\37\2\u093d\u093e\5\u01ee\u00f8\2\u093e"+
		"\u01eb\3\2\2\2\u093f\u0940\6\u00f7 \2\u0940\u0941\5\u01ee\u00f8\2\u0941"+
		"\u01ed\3\2\2\2\u0942\u0947\5\u01f2\u00fa\2\u0943\u0944\6\u00f8!\2\u0944"+
		"\u0946\5\u01f0\u00f9\2\u0945\u0943\3\2\2\2\u0946\u0949\3\2\2\2\u0947\u0945"+
		"\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0953\3\2\2\2\u0949\u0947\3\2\2\2\u094a"+
		"\u094f\5\u01f4\u00fb\2\u094b\u094c\6\u00f8\"\2\u094c\u094e\5\u01f6\u00fc"+
		"\2\u094d\u094b\3\2\2\2\u094e\u0951\3\2\2\2\u094f\u094d\3\2\2\2\u094f\u0950"+
		"\3\2\2\2\u0950\u0953\3\2\2\2\u0951\u094f\3\2\2\2\u0952\u0942\3\2\2\2\u0952"+
		"\u094a\3\2\2\2\u0953\u01ef\3\2\2\2\u0954\u0957\5\u01f2\u00fa\2\u0955\u0957"+
		"\7\u0085\2\2\u0956\u0954\3\2\2\2\u0956\u0955\3\2\2\2\u0957\u01f1\3\2\2"+
		"\2\u0958\u095b\t\t\2\2\u0959\u095b\7\u0084\2\2\u095a\u0958\3\2\2\2\u095a"+
		"\u0959\3\2\2\2\u095b\u01f3\3\2\2\2\u095c\u095d\7j\2\2\u095d\u095e\7j\2"+
		"\2\u095e\u01f5\3\2\2\2\u095f\u0962\7j\2\2\u0960\u0962\5\u01f0\u00f9\2"+
		"\u0961\u095f\3\2\2\2\u0961\u0960\3\2\2\2\u0962\u01f7\3\2\2\2\u0963\u0968"+
		"\5\u01fa\u00fe\2\u0964\u0968\5\u0202\u0102\2\u0965\u0968\5\u01fc\u00ff"+
		"\2\u0966\u0968\5\u01fe\u0100\2\u0967\u0963\3\2\2\2\u0967\u0964\3\2\2\2"+
		"\u0967\u0965\3\2\2\2\u0967\u0966\3\2\2\2\u0968\u01f9\3\2\2\2\u0969\u096b"+
		"\5\u01dc\u00ef\2\u096a\u0969\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096c\3"+
		"\2\2\2\u096c\u0972\5\u0200\u0101\2\u096d\u096f\5\u01dc\u00ef\2\u096e\u096d"+
		"\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0972\7\u008c\2"+
		"\2\u0971\u096a\3\2\2\2\u0971\u096e\3\2\2\2\u0972\u01fb\3\2\2\2\u0973\u0974"+
		"\t\n\2\2\u0974\u01fd\3\2\2\2\u0975\u0976\7g\2\2\u0976\u01ff\3\2\2\2\u0977"+
		"\u0978\t\13\2\2\u0978\u0201\3\2\2\2\u0979\u097a\t\f\2\2\u097a\u0203\3"+
		"\2\2\2\u0123\u0207\u020e\u0212\u0216\u021a\u021e\u0222\u0226\u022a\u022d"+
		"\u0232\u0238\u023c\u0240\u0244\u024a\u024e\u0252\u0256\u025a\u025e\u0264"+
		"\u0276\u027d\u0283\u0289\u028d\u0290\u029a\u02a2\u02a9\u02b3\u02b9\u02bf"+
		"\u02ca\u02d0\u02d8\u02e0\u02e4\u02e9\u02fc\u0308\u030c\u0310\u0316\u0322"+
		"\u0330\u0334\u0338\u033b\u0341\u0346\u0349\u034c\u0352\u0357\u035b\u0367"+
		"\u0371\u0373\u0380\u038b\u0394\u039d\u03a9\u03b3\u03b7\u03c1\u03d0\u03e3"+
		"\u03e8\u03eb\u03ef\u03f4\u03f8\u0403\u0407\u040a\u040d\u0417\u041c\u0437"+
		"\u0440\u0444\u0447\u044a\u0453\u045c\u045f\u0465\u0469\u0474\u047d\u0480"+
		"\u0485\u048c\u0495\u0498\u049c\u04a1\u04a5\u04ad\u04b0\u04bd\u04c1\u04c4"+
		"\u04c7\u04cd\u04d1\u04d4\u04d9\u04db\u04df\u04e7\u04ef\u04f6\u04fa\u04fd"+
		"\u0501\u0504\u0508\u050c\u050f\u0513\u0519\u051f\u0523\u0527\u052d\u0530"+
		"\u0534\u0537\u053a\u053d\u0542\u0545\u0549\u054f\u0553\u0556\u0559\u0563"+
		"\u0567\u0570\u0579\u057d\u0580\u058a\u058e\u0596\u0599\u059c\u05a1\u05a4"+
		"\u05ac\u05b1\u05b4\u05b9\u05bc\u05c4\u05c9\u05cc\u05d1\u05d9\u05e2\u05e6"+
		"\u05f0\u05f6\u05fa\u05fe\u0603\u060a\u060d\u0612\u0615\u0619\u061d\u0623"+
		"\u0629\u062c\u062f\u0633\u0636\u063b\u063e\u0642\u0647\u064d\u0652\u0658"+
		"\u0668\u066b\u066e\u0675\u067c\u0692\u0695\u06ba\u06be\u06cf\u06d4\u06d8"+
		"\u06dd\u06e4\u06eb\u06f6\u06fa\u0703\u0709\u070e\u0716\u071a\u0720\u0727"+
		"\u072c\u0730\u0735\u073a\u0742\u0745\u0749\u0750\u0758\u0762\u0769\u076e"+
		"\u0773\u0777\u0786\u078a\u0794\u07a0\u07a4\u07ad\u07b1\u07bc\u07c3\u07c7"+
		"\u07d9\u07de\u07ef\u07f2\u07f8\u07fe\u0805\u080c\u0813\u081e\u0822\u082a"+
		"\u0833\u083b\u084d\u0861\u087a\u087c\u0881\u0896\u089a\u08ae\u08b0\u08b5"+
		"\u08bb\u08bf\u08c4\u08ca\u08d0\u08d7\u08da\u08dd\u08e1\u08e6\u08ed\u08f6"+
		"\u08f8\u0905\u090c\u0912\u0919\u0947\u094f\u0952\u0956\u095a\u0961\u0967"+
		"\u096a\u096e\u0971";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}