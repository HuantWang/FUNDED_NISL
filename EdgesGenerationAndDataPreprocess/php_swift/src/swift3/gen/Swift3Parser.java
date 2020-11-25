// Generated from E:/raw-data/antlr4/php_swift/src/swift3\Swift3.g4 by ANTLR 4.8
package swift3.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import swift3.Grammar.SwiftSupport;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Swift3Parser extends Parser {
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
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, Platform_name_platform_version=130, 
		Identifier=131, DOT=132, LCURLY=133, LPAREN=134, LBRACK=135, RCURLY=136, 
		RPAREN=137, RBRACK=138, COMMA=139, COLON=140, SEMI=141, LT=142, GT=143, 
		UNDERSCORE=144, BANG=145, QUESTION=146, AT=147, AND=148, SUB=149, EQUAL=150, 
		OR=151, DIV=152, ADD=153, MUL=154, MOD=155, CARET=156, TILDE=157, Operator_head_other=158, 
		Operator_following_character=159, Implicit_parameter_name=160, Binary_literal=161, 
		Octal_literal=162, Decimal_literal=163, Pure_decimal_digits=164, Hexadecimal_literal=165, 
		Floating_point_literal=166, Static_string_literal=167, Interpolated_string_literal=168, 
		WS=169, Block_comment=170, Line_comment=171;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_statements_impl = 3, 
		RULE_loop_statement = 4, RULE_for_statement = 5, RULE_for_init = 6, RULE_for_in_statement = 7, 
		RULE_while_statement = 8, RULE_condition_list = 9, RULE_condition = 10, 
		RULE_case_condition = 11, RULE_optional_binding_condition = 12, RULE_repeat_while_statement = 13, 
		RULE_branch_statement = 14, RULE_if_statement = 15, RULE_else_clause = 16, 
		RULE_guard_statement = 17, RULE_switch_statement = 18, RULE_switch_cases = 19, 
		RULE_switch_case = 20, RULE_case_label = 21, RULE_case_item_list = 22, 
		RULE_default_label = 23, RULE_where_clause = 24, RULE_where_expression = 25, 
		RULE_labeled_statement = 26, RULE_statement_label = 27, RULE_label_name = 28, 
		RULE_control_transfer_statement = 29, RULE_break_statement = 30, RULE_continue_statement = 31, 
		RULE_fallthrough_statement = 32, RULE_return_statement = 33, RULE_throw_statement = 34, 
		RULE_defer_statement = 35, RULE_do_statement = 36, RULE_catch_clauses = 37, 
		RULE_catch_clause = 38, RULE_compiler_control_statement = 39, RULE_conditional_compilation_block = 40, 
		RULE_if_directive_clause = 41, RULE_elseif_directive_clauses = 42, RULE_elseif_directive_clause = 43, 
		RULE_else_directive_clause = 44, RULE_if_directive = 45, RULE_elseif_directive = 46, 
		RULE_else_directive = 47, RULE_endif_directive = 48, RULE_compilation_condition = 49, 
		RULE_platform_condition = 50, RULE_swift_version = 51, RULE_operating_system = 52, 
		RULE_architecture = 53, RULE_line_control_statement = 54, RULE_line_number = 55, 
		RULE_file_name = 56, RULE_availability_condition = 57, RULE_availability_arguments = 58, 
		RULE_availability_argument = 59, RULE_generic_parameter_clause = 60, RULE_generic_parameter_list = 61, 
		RULE_generic_parameter = 62, RULE_generic_where_clause = 63, RULE_requirement_list = 64, 
		RULE_requirement = 65, RULE_conformance_requirement = 66, RULE_same_type_requirement = 67, 
		RULE_generic_argument_clause = 68, RULE_generic_argument_list = 69, RULE_generic_argument = 70, 
		RULE_declaration = 71, RULE_declarations = 72, RULE_top_level_declaration = 73, 
		RULE_code_block = 74, RULE_import_declaration = 75, RULE_import_kind = 76, 
		RULE_import_path = 77, RULE_import_path_identifier = 78, RULE_constant_declaration = 79, 
		RULE_pattern_initializer_list = 80, RULE_pattern_initializer = 81, RULE_initializer = 82, 
		RULE_variable_declaration = 83, RULE_variable_declaration_head = 84, RULE_variable_name = 85, 
		RULE_getter_setter_block = 86, RULE_getter_clause = 87, RULE_setter_clause = 88, 
		RULE_setter_name = 89, RULE_getter_setter_keyword_block = 90, RULE_getter_keyword_clause = 91, 
		RULE_setter_keyword_clause = 92, RULE_willSet_didSet_block = 93, RULE_willSet_clause = 94, 
		RULE_didSet_clause = 95, RULE_typealias_declaration = 96, RULE_typealias_name = 97, 
		RULE_typealias_assignment = 98, RULE_function_declaration = 99, RULE_function_head = 100, 
		RULE_function_name = 101, RULE_function_signature = 102, RULE_function_result = 103, 
		RULE_function_body = 104, RULE_parameter_clause = 105, RULE_parameter_list = 106, 
		RULE_parameter = 107, RULE_external_parameter_name = 108, RULE_local_parameter_name = 109, 
		RULE_default_argument_clause = 110, RULE_enum_declaration = 111, RULE_union_style_enum = 112, 
		RULE_union_style_enum_members = 113, RULE_union_style_enum_member = 114, 
		RULE_union_style_enum_case_clause = 115, RULE_union_style_enum_case_list = 116, 
		RULE_union_style_enum_case = 117, RULE_enum_name = 118, RULE_enum_case_name = 119, 
		RULE_raw_value_style_enum = 120, RULE_raw_value_style_enum_members = 121, 
		RULE_raw_value_style_enum_member = 122, RULE_raw_value_style_enum_case_clause = 123, 
		RULE_raw_value_style_enum_case_list = 124, RULE_raw_value_style_enum_case = 125, 
		RULE_raw_value_assignment = 126, RULE_raw_value_literal = 127, RULE_struct_declaration = 128, 
		RULE_struct_name = 129, RULE_struct_body = 130, RULE_struct_member = 131, 
		RULE_class_declaration = 132, RULE_class_name = 133, RULE_class_body = 134, 
		RULE_class_member = 135, RULE_protocol_declaration = 136, RULE_protocol_name = 137, 
		RULE_protocol_body = 138, RULE_protocol_member = 139, RULE_protocol_member_declaration = 140, 
		RULE_protocol_property_declaration = 141, RULE_protocol_method_declaration = 142, 
		RULE_protocol_initializer_declaration = 143, RULE_protocol_subscript_declaration = 144, 
		RULE_protocol_associated_type_declaration = 145, RULE_initializer_declaration = 146, 
		RULE_initializer_head = 147, RULE_initializer_body = 148, RULE_deinitializer_declaration = 149, 
		RULE_extension_declaration = 150, RULE_extension_body = 151, RULE_extension_member = 152, 
		RULE_subscript_declaration = 153, RULE_subscript_head = 154, RULE_subscript_result = 155, 
		RULE_operator_declaration = 156, RULE_prefix_operator_declaration = 157, 
		RULE_postfix_operator_declaration = 158, RULE_infix_operator_declaration = 159, 
		RULE_infix_operator_group = 160, RULE_precedence_group_declaration = 161, 
		RULE_precedence_group_attribute = 162, RULE_precedence_group_relation = 163, 
		RULE_precedence_group_assignment = 164, RULE_precedence_group_associativity = 165, 
		RULE_associativity = 166, RULE_precedence_group_names = 167, RULE_precedence_group_name = 168, 
		RULE_declaration_modifier = 169, RULE_declaration_modifiers = 170, RULE_access_level_modifier = 171, 
		RULE_mutation_modifier = 172, RULE_pattern = 173, RULE_wildcard_pattern = 174, 
		RULE_identifier_pattern = 175, RULE_value_binding_pattern = 176, RULE_tuple_pattern = 177, 
		RULE_tuple_pattern_element_list = 178, RULE_tuple_pattern_element = 179, 
		RULE_enum_case_pattern = 180, RULE_optional_pattern = 181, RULE_expression_pattern = 182, 
		RULE_attribute = 183, RULE_attribute_name = 184, RULE_attribute_argument_clause = 185, 
		RULE_attributes = 186, RULE_balanced_tokens = 187, RULE_balanced_token = 188, 
		RULE_any_punctuation_for_balanced_token = 189, RULE_expression = 190, 
		RULE_expression_list = 191, RULE_prefix_expression = 192, RULE_in_out_expression = 193, 
		RULE_try_operator = 194, RULE_binary_expression = 195, RULE_binary_expressions = 196, 
		RULE_conditional_operator = 197, RULE_type_casting_operator = 198, RULE_primary_expression = 199, 
		RULE_literal_expression = 200, RULE_array_literal = 201, RULE_array_literal_items = 202, 
		RULE_array_literal_item = 203, RULE_dictionary_literal = 204, RULE_dictionary_literal_items = 205, 
		RULE_dictionary_literal_item = 206, RULE_playground_literal = 207, RULE_self_expression = 208, 
		RULE_superclass_expression = 209, RULE_superclass_method_expression = 210, 
		RULE_superclass_subscript_expression = 211, RULE_superclass_initializer_expression = 212, 
		RULE_closure_expression = 213, RULE_closure_signature = 214, RULE_closure_parameter_clause = 215, 
		RULE_closure_parameter_clause_identifier_list = 216, RULE_closure_parameter_list = 217, 
		RULE_closure_parameter = 218, RULE_closure_parameter_name = 219, RULE_capture_list = 220, 
		RULE_capture_list_items = 221, RULE_capture_list_item = 222, RULE_capture_specifier = 223, 
		RULE_implicit_member_expression = 224, RULE_parenthesized_expression = 225, 
		RULE_tuple_expression = 226, RULE_tuple_element = 227, RULE_wildcard_expression = 228, 
		RULE_selector_expression = 229, RULE_key_path_expression = 230, RULE_postfix_expression = 231, 
		RULE_function_call_argument_clause = 232, RULE_function_call_argument_list = 233, 
		RULE_function_call_argument = 234, RULE_trailing_closure = 235, RULE_argument_names = 236, 
		RULE_argument_name = 237, RULE_dynamic_type_expression = 238, RULE_type = 239, 
		RULE_type_annotation = 240, RULE_type_identifier = 241, RULE_type_name = 242, 
		RULE_tuple_type = 243, RULE_tuple_type_element_list = 244, RULE_tuple_type_element = 245, 
		RULE_element_name = 246, RULE_function_type = 247, RULE_function_type_argument_clause = 248, 
		RULE_function_type_argument_list = 249, RULE_function_type_argument = 250, 
		RULE_argument_label = 251, RULE_array_type = 252, RULE_dictionary_type = 253, 
		RULE_protocol_composition_type = 254, RULE_protocol_identifier = 255, 
		RULE_type_inheritance_clause = 256, RULE_type_inheritance_list = 257, 
		RULE_class_requirement = 258, RULE_declaration_identifier = 259, RULE_label_identifier = 260, 
		RULE_keyword_as_identifier_in_declarations = 261, RULE_keyword_as_identifier_in_labels = 262, 
		RULE_assignment_operator = 263, RULE_negate_prefix_operator = 264, RULE_compilation_condition_AND = 265, 
		RULE_compilation_condition_OR = 266, RULE_compilation_condition_GE = 267, 
		RULE_arrow_operator = 268, RULE_range_operator = 269, RULE_same_type_equals = 270, 
		RULE_binary_operator = 271, RULE_prefix_operator = 272, RULE_postfix_operator = 273, 
		RULE_operator = 274, RULE_operator_character = 275, RULE_operator_head = 276, 
		RULE_dot_operator_head = 277, RULE_dot_operator_character = 278, RULE_literal = 279, 
		RULE_numeric_literal = 280, RULE_boolean_literal = 281, RULE_nil_literal = 282, 
		RULE_integer_literal = 283, RULE_string_literal = 284;
	private static String[] makeRuleNames() {
		return new String[] {
			"top_level", "statement", "statements", "statements_impl", "loop_statement", 
			"for_statement", "for_init", "for_in_statement", "while_statement", "condition_list", 
			"condition", "case_condition", "optional_binding_condition", "repeat_while_statement", 
			"branch_statement", "if_statement", "else_clause", "guard_statement", 
			"switch_statement", "switch_cases", "switch_case", "case_label", "case_item_list", 
			"default_label", "where_clause", "where_expression", "labeled_statement", 
			"statement_label", "label_name", "control_transfer_statement", "break_statement", 
			"continue_statement", "fallthrough_statement", "return_statement", "throw_statement", 
			"defer_statement", "do_statement", "catch_clauses", "catch_clause", "compiler_control_statement", 
			"conditional_compilation_block", "if_directive_clause", "elseif_directive_clauses", 
			"elseif_directive_clause", "else_directive_clause", "if_directive", "elseif_directive", 
			"else_directive", "endif_directive", "compilation_condition", "platform_condition", 
			"swift_version", "operating_system", "architecture", "line_control_statement", 
			"line_number", "file_name", "availability_condition", "availability_arguments", 
			"availability_argument", "generic_parameter_clause", "generic_parameter_list", 
			"generic_parameter", "generic_where_clause", "requirement_list", "requirement", 
			"conformance_requirement", "same_type_requirement", "generic_argument_clause", 
			"generic_argument_list", "generic_argument", "declaration", "declarations", 
			"top_level_declaration", "code_block", "import_declaration", "import_kind", 
			"import_path", "import_path_identifier", "constant_declaration", "pattern_initializer_list", 
			"pattern_initializer", "initializer", "variable_declaration", "variable_declaration_head", 
			"variable_name", "getter_setter_block", "getter_clause", "setter_clause", 
			"setter_name", "getter_setter_keyword_block", "getter_keyword_clause", 
			"setter_keyword_clause", "willSet_didSet_block", "willSet_clause", "didSet_clause", 
			"typealias_declaration", "typealias_name", "typealias_assignment", "function_declaration", 
			"function_head", "function_name", "function_signature", "function_result", 
			"function_body", "parameter_clause", "parameter_list", "parameter", "external_parameter_name", 
			"local_parameter_name", "default_argument_clause", "enum_declaration", 
			"union_style_enum", "union_style_enum_members", "union_style_enum_member", 
			"union_style_enum_case_clause", "union_style_enum_case_list", "union_style_enum_case", 
			"enum_name", "enum_case_name", "raw_value_style_enum", "raw_value_style_enum_members", 
			"raw_value_style_enum_member", "raw_value_style_enum_case_clause", "raw_value_style_enum_case_list", 
			"raw_value_style_enum_case", "raw_value_assignment", "raw_value_literal", 
			"struct_declaration", "struct_name", "struct_body", "struct_member", 
			"class_declaration", "class_name", "class_body", "class_member", "protocol_declaration", 
			"protocol_name", "protocol_body", "protocol_member", "protocol_member_declaration", 
			"protocol_property_declaration", "protocol_method_declaration", "protocol_initializer_declaration", 
			"protocol_subscript_declaration", "protocol_associated_type_declaration", 
			"initializer_declaration", "initializer_head", "initializer_body", "deinitializer_declaration", 
			"extension_declaration", "extension_body", "extension_member", "subscript_declaration", 
			"subscript_head", "subscript_result", "operator_declaration", "prefix_operator_declaration", 
			"postfix_operator_declaration", "infix_operator_declaration", "infix_operator_group", 
			"precedence_group_declaration", "precedence_group_attribute", "precedence_group_relation", 
			"precedence_group_assignment", "precedence_group_associativity", "associativity", 
			"precedence_group_names", "precedence_group_name", "declaration_modifier", 
			"declaration_modifiers", "access_level_modifier", "mutation_modifier", 
			"pattern", "wildcard_pattern", "identifier_pattern", "value_binding_pattern", 
			"tuple_pattern", "tuple_pattern_element_list", "tuple_pattern_element", 
			"enum_case_pattern", "optional_pattern", "expression_pattern", "attribute", 
			"attribute_name", "attribute_argument_clause", "attributes", "balanced_tokens", 
			"balanced_token", "any_punctuation_for_balanced_token", "expression", 
			"expression_list", "prefix_expression", "in_out_expression", "try_operator", 
			"binary_expression", "binary_expressions", "conditional_operator", "type_casting_operator", 
			"primary_expression", "literal_expression", "array_literal", "array_literal_items", 
			"array_literal_item", "dictionary_literal", "dictionary_literal_items", 
			"dictionary_literal_item", "playground_literal", "self_expression", "superclass_expression", 
			"superclass_method_expression", "superclass_subscript_expression", "superclass_initializer_expression", 
			"closure_expression", "closure_signature", "closure_parameter_clause", 
			"closure_parameter_clause_identifier_list", "closure_parameter_list", 
			"closure_parameter", "closure_parameter_name", "capture_list", "capture_list_items", 
			"capture_list_item", "capture_specifier", "implicit_member_expression", 
			"parenthesized_expression", "tuple_expression", "tuple_element", "wildcard_expression", 
			"selector_expression", "key_path_expression", "postfix_expression", "function_call_argument_clause", 
			"function_call_argument_list", "function_call_argument", "trailing_closure", 
			"argument_names", "argument_name", "dynamic_type_expression", "type", 
			"type_annotation", "type_identifier", "type_name", "tuple_type", "tuple_type_element_list", 
			"tuple_type_element", "element_name", "function_type", "function_type_argument_clause", 
			"function_type_argument_list", "function_type_argument", "argument_label", 
			"array_type", "dictionary_type", "protocol_composition_type", "protocol_identifier", 
			"type_inheritance_clause", "type_inheritance_list", "class_requirement", 
			"declaration_identifier", "label_identifier", "keyword_as_identifier_in_declarations", 
			"keyword_as_identifier_in_labels", "assignment_operator", "negate_prefix_operator", 
			"compilation_condition_AND", "compilation_condition_OR", "compilation_condition_GE", 
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
			"'continue'", "'fallthrough'", "'return'", "'throw'", "'defer'", "'do'", 
			"'catch'", "'#if'", "'#elseif'", "'#else'", "'#endif'", "'os'", "'arch'", 
			"'swift'", "'#sourceLocation'", "'file'", "'line'", "'#available'", "'import'", 
			"'typealias'", "'struct'", "'class'", "'enum'", "'protocol'", "'func'", 
			"'get'", "'set'", "'willSet'", "'didSet'", "'throws'", "'rethrows'", 
			"'indirect'", "'final'", "'associatedtype'", "'init'", "'deinit'", "'extension'", 
			"'subscript'", "'prefix'", "'operator'", "'postfix'", "'infix'", "'precedencegroup'", 
			"'higherThan'", "'lowerThan'", "'assignment'", "'associativity'", "'left'", 
			"'right'", "'none'", "'convenience'", "'dynamic'", "'lazy'", "'optional'", 
			"'override'", "'required'", "'static'", "'unowned'", "'safe'", "'unsafe'", 
			"'weak'", "'private'", "'fileprivate'", "'internal'", "'public'", "'open'", 
			"'mutating'", "'nonmutating'", "'is'", "'as'", "'#'", "'`'", "'try'", 
			"'#file'", "'#line'", "'#column'", "'#function'", "'#dsohandle'", "'#colorLiteral'", 
			"'red'", "'green'", "'blue'", "'alpha'", "'#fileLiteral'", "'resourceName'", 
			"'#imageLiteral'", "'self'", "'Self'", "'super'", "'unowned(safe)'", 
			"'unowned(unsafe)'", "'#selector'", "'getter:'", "'setter:'", "'#keyPath'", 
			"'type'", "'of'", "'Type'", "'Protocol'", "'Any'", "'inout'", "'arm'", 
			"'arm64'", "'i386'", "'iOS'", "'iOSApplicationExtension'", "'macOS'", 
			"'macOSApplicationExtension'", "'precedence'", "'tvOS'", "'watchOS'", 
			"'x86_64'", "'false'", "'nil'", "'true'", null, null, "'.'", "'{'", "'('", 
			"'['", "'}'", "')'", "']'", "','", "':'", "';'", "'<'", "'>'", "'_'", 
			"'!'", "'?'", "'@'", "'&'", "'-'", "'='", "'|'", "'/'", "'+'", "'*'", 
			"'%'", "'^'", "'~'"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Platform_name_platform_version", 
			"Identifier", "DOT", "LCURLY", "LPAREN", "LBRACK", "RCURLY", "RPAREN", 
			"RBRACK", "COMMA", "COLON", "SEMI", "LT", "GT", "UNDERSCORE", "BANG", 
			"QUESTION", "AT", "AND", "SUB", "EQUAL", "OR", "DIV", "ADD", "MUL", "MOD", 
			"CARET", "TILDE", "Operator_head_other", "Operator_following_character", 
			"Implicit_parameter_name", "Binary_literal", "Octal_literal", "Decimal_literal", 
			"Pure_decimal_digits", "Hexadecimal_literal", "Floating_point_literal", 
			"Static_string_literal", "Interpolated_string_literal", "WS", "Block_comment", 
			"Line_comment"
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
	public String getGrammarFileName() { return "Swift3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Swift3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Swift3Parser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTop_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTop_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTop_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(570);
				statements();
				}
				break;
			}
			setState(573);
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
		public TerminalNode SEMI() { return getToken(Swift3Parser.SEMI, 0); }
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				expression();
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(576);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				declaration();
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(580);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				loop_statement();
				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(584);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				branch_statement();
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(588);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				labeled_statement();
				setState(593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(592);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(595);
				control_transfer_statement();
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(596);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(599);
				defer_statement();
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(600);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(603);
				do_statement();
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(604);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
				compiler_control_statement();
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(608);
					match(SEMI);
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

	public static class StatementsContext extends ParserRuleContext {
		public Statements_implContext statements_impl() {
			return getRuleContext(Statements_implContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			statements_impl(-1);
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

	public static class Statements_implContext extends ParserRuleContext {
		public int indexBefore;
		public int indexAfter = -1;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statements_implContext statements_impl() {
			return getRuleContext(Statements_implContext.class,0);
		}
		public Statements_implContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statements_implContext(ParserRuleContext parent, int invokingState, int indexBefore) {
			super(parent, invokingState);
			this.indexBefore = indexBefore;
		}
		@Override public int getRuleIndex() { return RULE_statements_impl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStatements_impl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStatements_impl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStatements_impl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statements_implContext statements_impl(int indexBefore) throws RecognitionException {
		Statements_implContext _localctx = new Statements_implContext(_ctx, getState(), indexBefore);
		enterRule(_localctx, 6, RULE_statements_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			if (!(SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore))) {
				throw new FailedPredicateException(this, "SwiftSupport.isSeparatedStatement(_input, $indexBefore)");
			}
			setState(616);
			statement();
			((Statements_implContext)_localctx).indexAfter =  _input.index();
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(618);
				statements_impl(_localctx.indexAfter);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
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
		public List<TerminalNode> SEMI() { return getTokens(Swift3Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Swift3Parser.SEMI, i);
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(T__0);
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(628);
					for_init();
					}
					break;
				}
				setState(631);
				match(SEMI);
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(632);
					expression();
					}
					break;
				}
				setState(635);
				match(SEMI);
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(636);
					expression();
					}
					break;
				}
				setState(639);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(T__0);
				setState(641);
				match(LPAREN);
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(642);
					for_init();
					}
					break;
				}
				setState(645);
				match(SEMI);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(646);
					expression();
					}
					break;
				}
				setState(649);
				match(SEMI);
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(650);
					expression();
					}
					break;
				}
				setState(653);
				match(RPAREN);
				setState(654);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_init);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFor_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__0);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(662);
				match(T__1);
				}
				break;
			}
			setState(665);
			pattern(0);
			setState(666);
			match(T__2);
			setState(667);
			expression();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(668);
				where_clause();
				}
			}

			setState(671);
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
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(T__3);
			setState(674);
			condition_list();
			setState(675);
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

	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCondition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCondition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCondition_list(this);
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
			setState(677);
			condition();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(678);
				match(COMMA);
				setState(679);
				condition();
				}
				}
				setState(684);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				availability_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				case_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				optional_binding_condition();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCase_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCase_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCase_condition(this);
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
			setState(691);
			match(T__1);
			setState(692);
			pattern(0);
			setState(693);
			initializer();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(694);
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
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOptional_binding_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOptional_binding_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitOptional_binding_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_conditionContext optional_binding_condition() throws RecognitionException {
		Optional_binding_conditionContext _localctx = new Optional_binding_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_optional_binding_condition);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(T__4);
				setState(698);
				pattern(0);
				setState(699);
				initializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(T__5);
				setState(702);
				pattern(0);
				setState(703);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRepeat_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRepeat_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRepeat_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_while_statementContext repeat_while_statement() throws RecognitionException {
		Repeat_while_statementContext _localctx = new Repeat_while_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__6);
			setState(708);
			code_block();
			setState(709);
			match(T__3);
			setState(710);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBranch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_branch_statement);
		try {
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				guard_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
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
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__7);
			setState(718);
			condition_list();
			setState(719);
			code_block();
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(720);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_clause);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(T__8);
				setState(724);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(T__8);
				setState(726);
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
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGuard_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGuard_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGuard_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_statementContext guard_statement() throws RecognitionException {
		Guard_statementContext _localctx = new Guard_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_guard_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__9);
			setState(730);
			condition_list();
			setState(731);
			match(T__8);
			setState(732);
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T__10);
			setState(735);
			expression();
			setState(736);
			match(LCURLY);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(737);
				switch_cases();
				}
			}

			setState(740);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwitch_cases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwitch_cases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSwitch_cases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			switch_case();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(743);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switch_case);
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				case_label();
				setState(747);
				statements();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				default_label();
				setState(750);
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
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__1);
			setState(755);
			case_item_list();
			setState(756);
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
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCase_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCase_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCase_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_case_item_list);
		int _la;
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				pattern(0);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(759);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				pattern(0);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(763);
					where_clause();
					}
				}

				setState(766);
				match(COMMA);
				setState(767);
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
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDefault_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDefault_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDefault_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(T__11);
			setState(772);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(T__12);
			setState(775);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWhere_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWhere_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitWhere_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_expressionContext where_expression() throws RecognitionException {
		Where_expressionContext _localctx = new Where_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
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
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_labeled_statement);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				statement_label();
				setState(780);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				statement_label();
				setState(783);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				statement_label();
				setState(786);
				switch_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(788);
				statement_label();
				setState(789);
				do_statement();
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
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStatement_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStatement_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStatement_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			label_name();
			setState(794);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLabel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLabel_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLabel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			declaration_identifier();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterControl_transfer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitControl_transfer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitControl_transfer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_control_transfer_statement);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				break_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				continue_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				fallthrough_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				return_statement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(T__13);
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(806);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(T__14);
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(810);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFallthrough_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFallthrough_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFallthrough_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(T__16);
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(816);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(T__17);
			setState(820);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDefer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDefer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDefer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defer_statementContext defer_statement() throws RecognitionException {
		Defer_statementContext _localctx = new Defer_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_defer_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(T__18);
			setState(823);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(T__19);
			setState(826);
			code_block();
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(827);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCatch_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_catch_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			catch_clause();
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(831);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCatch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCatch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCatch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(T__20);
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(835);
				pattern(0);
				}
				break;
			}
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(838);
				where_clause();
				}
			}

			setState(841);
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
		public Conditional_compilation_blockContext conditional_compilation_block() {
			return getRuleContext(Conditional_compilation_blockContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCompiler_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCompiler_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCompiler_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_control_statementContext compiler_control_statement() throws RecognitionException {
		Compiler_control_statementContext _localctx = new Compiler_control_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compiler_control_statement);
		try {
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				conditional_compilation_block();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
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

	public static class Conditional_compilation_blockContext extends ParserRuleContext {
		public If_directive_clauseContext if_directive_clause() {
			return getRuleContext(If_directive_clauseContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public Elseif_directive_clausesContext elseif_directive_clauses() {
			return getRuleContext(Elseif_directive_clausesContext.class,0);
		}
		public Else_directive_clauseContext else_directive_clause() {
			return getRuleContext(Else_directive_clauseContext.class,0);
		}
		public Conditional_compilation_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_compilation_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConditional_compilation_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConditional_compilation_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitConditional_compilation_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_compilation_blockContext conditional_compilation_block() throws RecognitionException {
		Conditional_compilation_blockContext _localctx = new Conditional_compilation_blockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditional_compilation_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			if_directive_clause();
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(848);
				elseif_directive_clauses();
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(851);
				else_directive_clause();
				}
			}

			setState(854);
			endif_directive();
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

	public static class If_directive_clauseContext extends ParserRuleContext {
		public If_directiveContext if_directive() {
			return getRuleContext(If_directiveContext.class,0);
		}
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIf_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIf_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitIf_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_directive_clauseContext if_directive_clause() throws RecognitionException {
		If_directive_clauseContext _localctx = new If_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			if_directive();
			setState(857);
			compilation_condition(0);
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(858);
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

	public static class Elseif_directive_clausesContext extends ParserRuleContext {
		public List<Elseif_directive_clauseContext> elseif_directive_clause() {
			return getRuleContexts(Elseif_directive_clauseContext.class);
		}
		public Elseif_directive_clauseContext elseif_directive_clause(int i) {
			return getRuleContext(Elseif_directive_clauseContext.class,i);
		}
		public Elseif_directive_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElseif_directive_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElseif_directive_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitElseif_directive_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_directive_clausesContext elseif_directive_clauses() throws RecognitionException {
		Elseif_directive_clausesContext _localctx = new Elseif_directive_clausesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elseif_directive_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(861);
				elseif_directive_clause();
				}
				}
				setState(864); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
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

	public static class Elseif_directive_clauseContext extends ParserRuleContext {
		public Elseif_directiveContext elseif_directive() {
			return getRuleContext(Elseif_directiveContext.class,0);
		}
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Elseif_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElseif_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElseif_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitElseif_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_directive_clauseContext elseif_directive_clause() throws RecognitionException {
		Elseif_directive_clauseContext _localctx = new Elseif_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elseif_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			elseif_directive();
			setState(867);
			compilation_condition(0);
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(868);
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

	public static class Else_directive_clauseContext extends ParserRuleContext {
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElse_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElse_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitElse_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directive_clauseContext else_directive_clause() throws RecognitionException {
		Else_directive_clauseContext _localctx = new Else_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_else_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			else_directive();
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(872);
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

	public static class If_directiveContext extends ParserRuleContext {
		public If_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIf_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIf_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitIf_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_directiveContext if_directive() throws RecognitionException {
		If_directiveContext _localctx = new If_directiveContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(T__21);
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

	public static class Elseif_directiveContext extends ParserRuleContext {
		public Elseif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElseif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElseif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitElseif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_directiveContext elseif_directive() throws RecognitionException {
		Elseif_directiveContext _localctx = new Elseif_directiveContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elseif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(T__22);
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

	public static class Else_directiveContext extends ParserRuleContext {
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElse_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElse_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitElse_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_else_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
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

	public static class Endif_directiveContext extends ParserRuleContext {
		public Endif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEndif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEndif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitEndif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_directiveContext endif_directive() throws RecognitionException {
		Endif_directiveContext _localctx = new Endif_directiveContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_endif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__24);
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

	public static class Compilation_conditionContext extends ParserRuleContext {
		public Platform_conditionContext platform_condition() {
			return getRuleContext(Platform_conditionContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public List<Compilation_conditionContext> compilation_condition() {
			return getRuleContexts(Compilation_conditionContext.class);
		}
		public Compilation_conditionContext compilation_condition(int i) {
			return getRuleContext(Compilation_conditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Compilation_condition_ANDContext compilation_condition_AND() {
			return getRuleContext(Compilation_condition_ANDContext.class,0);
		}
		public Compilation_condition_ORContext compilation_condition_OR() {
			return getRuleContext(Compilation_condition_ORContext.class,0);
		}
		public Compilation_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCompilation_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCompilation_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCompilation_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_conditionContext compilation_condition() throws RecognitionException {
		return compilation_condition(0);
	}

	private Compilation_conditionContext compilation_condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Compilation_conditionContext _localctx = new Compilation_conditionContext(_ctx, _parentState);
		Compilation_conditionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_compilation_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(884);
				platform_condition();
				}
				break;
			case 2:
				{
				setState(885);
				label_identifier();
				}
				break;
			case 3:
				{
				setState(886);
				boolean_literal();
				}
				break;
			case 4:
				{
				setState(887);
				match(LPAREN);
				setState(888);
				compilation_condition(0);
				setState(889);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(891);
				match(BANG);
				setState(892);
				compilation_condition(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(903);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new Compilation_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compilation_condition);
						setState(895);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(896);
						compilation_condition_AND();
						setState(897);
						compilation_condition(3);
						}
						break;
					case 2:
						{
						_localctx = new Compilation_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compilation_condition);
						setState(899);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(900);
						compilation_condition_OR();
						setState(901);
						compilation_condition(2);
						}
						break;
					}
					} 
				}
				setState(907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class Platform_conditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Operating_systemContext operating_system() {
			return getRuleContext(Operating_systemContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public Compilation_condition_GEContext compilation_condition_GE() {
			return getRuleContext(Compilation_condition_GEContext.class,0);
		}
		public Swift_versionContext swift_version() {
			return getRuleContext(Swift_versionContext.class,0);
		}
		public Platform_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPlatform_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPlatform_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPlatform_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_conditionContext platform_condition() throws RecognitionException {
		Platform_conditionContext _localctx = new Platform_conditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_platform_condition);
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(T__25);
				setState(909);
				match(LPAREN);
				setState(910);
				operating_system();
				setState(911);
				match(RPAREN);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(T__26);
				setState(914);
				match(LPAREN);
				setState(915);
				architecture();
				setState(916);
				match(RPAREN);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				match(T__27);
				setState(919);
				match(LPAREN);
				setState(920);
				compilation_condition_GE();
				setState(921);
				swift_version();
				setState(922);
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

	public static class Swift_versionContext extends ParserRuleContext {
		public List<TerminalNode> Pure_decimal_digits() { return getTokens(Swift3Parser.Pure_decimal_digits); }
		public TerminalNode Pure_decimal_digits(int i) {
			return getToken(Swift3Parser.Pure_decimal_digits, i);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Swift_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swift_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwift_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwift_version(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSwift_version(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Swift_versionContext swift_version() throws RecognitionException {
		Swift_versionContext _localctx = new Swift_versionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_swift_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(Pure_decimal_digits);
			setState(927);
			match(DOT);
			setState(928);
			match(Pure_decimal_digits);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Operating_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperating_system(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperating_system(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitOperating_system(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operating_systemContext operating_system() throws RecognitionException {
		Operating_systemContext _localctx = new Operating_systemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operating_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			declaration_identifier();
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArchitecture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArchitecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_architecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			declaration_identifier();
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(Swift3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Swift3Parser.COLON, i);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Line_numberContext line_number() {
			return getRuleContext(Line_numberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Line_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLine_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLine_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLine_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_control_statementContext line_control_statement() throws RecognitionException {
		Line_control_statementContext _localctx = new Line_control_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_line_control_statement);
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(T__28);
				setState(935);
				match(LPAREN);
				setState(936);
				match(T__29);
				setState(937);
				match(COLON);
				setState(938);
				file_name();
				setState(939);
				match(COMMA);
				setState(940);
				match(T__30);
				setState(941);
				match(COLON);
				setState(942);
				line_number();
				setState(943);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(T__28);
				setState(946);
				match(LPAREN);
				setState(947);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLine_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLine_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLine_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_numberContext line_number() throws RecognitionException {
		Line_numberContext _localctx = new Line_numberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_line_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
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
		public TerminalNode Static_string_literal() { return getToken(Swift3Parser.Static_string_literal, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
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

	public static class Availability_conditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Availability_argumentsContext availability_arguments() {
			return getRuleContext(Availability_argumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Availability_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAvailability_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAvailability_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAvailability_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_conditionContext availability_condition() throws RecognitionException {
		Availability_conditionContext _localctx = new Availability_conditionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_availability_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(T__31);
			setState(955);
			match(LPAREN);
			setState(956);
			availability_arguments();
			setState(957);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Availability_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAvailability_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAvailability_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAvailability_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentsContext availability_arguments() throws RecognitionException {
		Availability_argumentsContext _localctx = new Availability_argumentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_availability_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			availability_argument();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(960);
				match(COMMA);
				setState(961);
				availability_argument();
				}
				}
				setState(966);
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
		public TerminalNode Platform_name_platform_version() { return getToken(Swift3Parser.Platform_name_platform_version, 0); }
		public TerminalNode MUL() { return getToken(Swift3Parser.MUL, 0); }
		public Availability_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAvailability_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAvailability_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAvailability_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentContext availability_argument() throws RecognitionException {
		Availability_argumentContext _localctx = new Availability_argumentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_availability_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_la = _input.LA(1);
			if ( !(_la==Platform_name_platform_version || _la==MUL) ) {
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

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift3Parser.LT, 0); }
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGeneric_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGeneric_parameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGeneric_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_generic_parameter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(LT);
			setState(970);
			generic_parameter_list();
			setState(971);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGeneric_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGeneric_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGeneric_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_generic_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			generic_parameter();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(974);
				match(COMMA);
				setState(975);
				generic_parameter();
				}
				}
				setState(980);
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
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGeneric_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGeneric_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGeneric_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_generic_parameter);
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				type_name();
				setState(983);
				match(COLON);
				setState(984);
				type_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				type_name();
				setState(987);
				match(COLON);
				setState(988);
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

	public static class Generic_where_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Generic_where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGeneric_where_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGeneric_where_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGeneric_where_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_where_clauseContext generic_where_clause() throws RecognitionException {
		Generic_where_clauseContext _localctx = new Generic_where_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_generic_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(T__12);
			setState(993);
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
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRequirement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRequirement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRequirement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_requirement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			requirement();
			setState(1000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(996);
					match(COMMA);
					setState(997);
					requirement();
					}
					} 
				}
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_requirement);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
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
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConformance_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConformance_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitConformance_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_conformance_requirement);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				type_identifier();
				setState(1008);
				match(COLON);
				setState(1009);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				type_identifier();
				setState(1012);
				match(COLON);
				setState(1013);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSame_type_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSame_type_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSame_type_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			type_identifier();
			setState(1018);
			same_type_equals();
			setState(1019);
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
		public TerminalNode LT() { return getToken(Swift3Parser.LT, 0); }
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGeneric_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGeneric_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGeneric_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(LT);
			setState(1022);
			generic_argument_list();
			setState(1023);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGeneric_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGeneric_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGeneric_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			generic_argument();
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1026);
				match(COMMA);
				setState(1027);
				generic_argument();
				}
				}
				setState(1032);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGeneric_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGeneric_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGeneric_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
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
		public Precedence_group_declarationContext precedence_group_declaration() {
			return getRuleContext(Precedence_group_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declaration);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1038);
				typealias_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039);
				function_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				enum_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1041);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1042);
				class_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1043);
				protocol_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1044);
				initializer_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1045);
				deinitializer_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1046);
				extension_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1047);
				subscript_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1048);
				operator_declaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1049);
				operator_declaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1050);
				precedence_group_declaration();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1053);
				declaration();
				}
				}
				setState(1056); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT );
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTop_level_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTop_level_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTop_level_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1058);
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(LCURLY);
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1062);
				statements();
				}
				break;
			}
			setState(1065);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImport_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitImport_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1067);
				attributes();
				}
			}

			setState(1070);
			match(T__32);
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) {
				{
				setState(1071);
				import_kind();
				}
			}

			setState(1074);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImport_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImport_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitImport_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
		public List<Import_path_identifierContext> import_path_identifier() {
			return getRuleContexts(Import_path_identifierContext.class);
		}
		public Import_path_identifierContext import_path_identifier(int i) {
			return getRuleContext(Import_path_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Swift3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift3Parser.DOT, i);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImport_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImport_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitImport_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_import_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			import_path_identifier();
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1079);
					match(DOT);
					setState(1080);
					import_path_identifier();
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class Import_path_identifierContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImport_path_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImport_path_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitImport_path_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_import_path_identifier);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__52:
			case T__54:
			case T__55:
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
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__79:
			case T__80:
			case T__81:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				declaration_identifier();
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
				setState(1087);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1090);
				attributes();
				}
			}

			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0)) {
				{
				setState(1093);
				declaration_modifiers();
				}
			}

			setState(1096);
			match(T__4);
			setState(1097);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPattern_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPattern_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPattern_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			pattern_initializer();
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1100);
					match(COMMA);
					setState(1101);
					pattern_initializer();
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPattern_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPattern_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPattern_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			pattern(0);
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1108);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			assignment_operator();
			setState(1112);
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
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variable_declaration);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				variable_declaration_head();
				setState(1115);
				variable_name();
				setState(1116);
				type_annotation();
				setState(1117);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				variable_declaration_head();
				setState(1120);
				variable_name();
				setState(1121);
				type_annotation();
				setState(1122);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				variable_declaration_head();
				setState(1125);
				variable_name();
				setState(1126);
				type_annotation();
				setState(1127);
				getter_setter_keyword_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				variable_declaration_head();
				setState(1130);
				variable_name();
				setState(1131);
				type_annotation();
				setState(1133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1132);
					initializer();
					}
					break;
				}
				setState(1135);
				willSet_didSet_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1137);
				variable_declaration_head();
				setState(1138);
				variable_name();
				setState(1139);
				type_annotation();
				setState(1140);
				type_annotation();
				setState(1142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1141);
					initializer();
					}
					break;
				}
				setState(1144);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1146);
				variable_declaration_head();
				setState(1147);
				pattern_initializer_list();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterVariable_declaration_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitVariable_declaration_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitVariable_declaration_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1151);
				attributes();
				}
			}

			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0)) {
				{
				setState(1154);
				declaration_modifiers();
				}
			}

			setState(1157);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			declaration_identifier();
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetter_setter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetter_setter_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGetter_setter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_getter_setter_block);
		int _la;
		try {
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(LCURLY);
				setState(1162);
				getter_clause();
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0) || _la==AT) {
					{
					setState(1163);
					setter_clause();
					}
				}

				setState(1166);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				match(LCURLY);
				setState(1169);
				setter_clause();
				setState(1170);
				getter_clause();
				setState(1171);
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
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1175);
				attributes();
				}
			}

			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1178);
				mutation_modifier();
				}
			}

			setState(1181);
			match(T__39);
			setState(1182);
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
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1184);
				attributes();
				}
			}

			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1187);
				mutation_modifier();
				}
			}

			setState(1190);
			match(T__40);
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1191);
				setter_name();
				}
			}

			setState(1194);
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSetter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSetter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSetter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(LPAREN);
			setState(1197);
			declaration_identifier();
			setState(1198);
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetter_setter_keyword_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetter_setter_keyword_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGetter_setter_keyword_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				match(LCURLY);
				setState(1201);
				getter_keyword_clause();
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0) || _la==AT) {
					{
					setState(1202);
					setter_keyword_clause();
					}
				}

				setState(1205);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				match(LCURLY);
				setState(1208);
				setter_keyword_clause();
				setState(1209);
				getter_keyword_clause();
				setState(1210);
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
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitGetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1214);
				attributes();
				}
			}

			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1217);
				mutation_modifier();
				}
			}

			setState(1220);
			match(T__39);
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
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1222);
				attributes();
				}
			}

			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1225);
				mutation_modifier();
				}
			}

			setState(1228);
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

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWillSet_didSet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWillSet_didSet_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitWillSet_didSet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				match(LCURLY);
				setState(1231);
				willSet_clause();
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__42 || _la==AT) {
					{
					setState(1232);
					didSet_clause();
					}
				}

				setState(1235);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				match(LCURLY);
				setState(1238);
				didSet_clause();
				setState(1239);
				willSet_clause();
				setState(1240);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWillSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWillSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitWillSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1244);
				attributes();
				}
			}

			setState(1247);
			match(T__41);
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1248);
				setter_name();
				}
			}

			setState(1251);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDidSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDidSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDidSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1253);
				attributes();
				}
			}

			setState(1256);
			match(T__42);
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1257);
				setter_name();
				}
			}

			setState(1260);
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
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
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
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypealias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypealias_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTypealias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typealias_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1262);
				attributes();
				}
			}

			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
				{
				setState(1265);
				access_level_modifier();
				}
			}

			setState(1268);
			match(T__33);
			setState(1269);
			typealias_name();
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1270);
				generic_parameter_clause();
				}
				break;
			}
			setState(1273);
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

	public static class Typealias_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypealias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypealias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTypealias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			declaration_identifier();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypealias_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypealias_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTypealias_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			assignment_operator();
			setState(1278);
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
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			function_head();
			setState(1281);
			function_name();
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1282);
				generic_parameter_clause();
				}
			}

			setState(1285);
			function_signature();
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1286);
				generic_where_clause();
				}
				break;
			}
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1289);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1292);
				attributes();
				}
			}

			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0)) {
				{
				setState(1295);
				declaration_modifiers();
				}
			}

			setState(1298);
			match(T__38);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_name);
		try {
			setState(1302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__52:
			case T__54:
			case T__55:
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
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__79:
			case T__80:
			case T__81:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				declaration_identifier();
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
				setState(1301);
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
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_signature);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				parameter_clause();
				setState(1306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1305);
					match(T__43);
					}
					break;
				}
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1308);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				parameter_clause();
				setState(1312);
				match(T__44);
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1313);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			arrow_operator();
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1319);
				attributes();
				}
				break;
			}
			setState(1322);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
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

	public static class Parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitParameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameter_clause);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				match(LPAREN);
				setState(1327);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				match(LPAREN);
				setState(1329);
				parameter_list();
				setState(1330);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			parameter();
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1335);
				match(COMMA);
				setState(1336);
				parameter();
				}
				}
				setState(1341);
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
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_parameter);
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1342);
					external_parameter_name();
					}
					break;
				}
				setState(1345);
				local_parameter_name();
				setState(1346);
				type_annotation();
				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1347);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1350);
					external_parameter_name();
					}
					break;
				}
				setState(1353);
				local_parameter_name();
				setState(1354);
				type_annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1356);
					external_parameter_name();
					}
					break;
				}
				setState(1359);
				local_parameter_name();
				setState(1360);
				type_annotation();
				setState(1361);
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
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExternal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExternal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExternal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_external_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			label_identifier();
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
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLocal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLocal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLocal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_local_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			label_identifier();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDefault_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDefault_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDefault_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			assignment_operator();
			setState(1370);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnum_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_enum_declaration);
		int _la;
		try {
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1372);
					attributes();
					}
				}

				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
					{
					setState(1375);
					access_level_modifier();
					}
				}

				setState(1378);
				union_style_enum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1379);
					attributes();
					}
				}

				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
					{
					setState(1382);
					access_level_modifier();
					}
				}

				setState(1385);
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnion_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnion_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitUnion_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(1388);
				match(T__45);
				}
			}

			setState(1391);
			match(T__36);
			setState(1392);
			enum_name();
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1393);
				generic_parameter_clause();
				}
			}

			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1396);
				type_inheritance_clause();
				}
			}

			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1399);
				generic_where_clause();
				}
			}

			setState(1402);
			match(LCURLY);
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__28) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT) {
				{
				setState(1403);
				union_style_enum_members();
				}
			}

			setState(1406);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnion_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnion_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitUnion_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			union_style_enum_member();
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__28) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT) {
				{
				setState(1409);
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
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnion_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnion_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitUnion_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_union_style_enum_member);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				union_style_enum_case_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnion_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnion_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitUnion_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1417);
				attributes();
				}
			}

			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(1420);
				match(T__45);
				}
			}

			setState(1423);
			match(T__1);
			setState(1424);
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
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnion_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnion_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitUnion_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_union_style_enum_case_list);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				union_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
				union_style_enum_case();
				setState(1428);
				match(COMMA);
				setState(1429);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnion_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnion_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitUnion_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			enum_case_name();
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1434);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnum_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitEnum_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			declaration_identifier();
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnum_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnum_case_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitEnum_case_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			declaration_identifier();
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(T__36);
			setState(1442);
			enum_name();
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1443);
				generic_parameter_clause();
				}
			}

			setState(1446);
			type_inheritance_clause();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1447);
				generic_where_clause();
				}
			}

			setState(1450);
			match(LCURLY);
			setState(1451);
			raw_value_style_enum_members();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			raw_value_style_enum_member();
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__28) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT) {
				{
				setState(1455);
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
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_raw_value_style_enum_member);
		try {
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				raw_value_style_enum_case_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1463);
				attributes();
				}
			}

			setState(1466);
			match(T__1);
			setState(1467);
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
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_raw_value_style_enum_case_list);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				raw_value_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				raw_value_style_enum_case();
				setState(1471);
				match(COMMA);
				setState(1472);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_raw_value_style_enum_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			enum_case_name();
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1477);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			assignment_operator();
			setState(1481);
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
		public TerminalNode Static_string_literal() { return getToken(Swift3Parser.Static_string_literal, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Raw_value_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRaw_value_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRaw_value_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRaw_value_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_literalContext raw_value_literal() throws RecognitionException {
		Raw_value_literalContext _localctx = new Raw_value_literalContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_raw_value_literal);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				match(Static_string_literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
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
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1488);
				attributes();
				}
			}

			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
				{
				setState(1491);
				access_level_modifier();
				}
			}

			setState(1494);
			match(T__34);
			setState(1495);
			struct_name();
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1496);
				generic_parameter_clause();
				}
			}

			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1499);
				type_inheritance_clause();
				}
			}

			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1502);
				generic_where_clause();
				}
			}

			setState(1505);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStruct_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			declaration_identifier();
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Struct_memberContext> struct_member() {
			return getRuleContexts(Struct_memberContext.class);
		}
		public Struct_memberContext struct_member(int i) {
			return getRuleContext(Struct_memberContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(LCURLY);
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__28) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT) {
				{
				{
				setState(1510);
				struct_member();
				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1516);
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

	public static class Struct_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Struct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStruct_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStruct_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitStruct_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_memberContext struct_member() throws RecognitionException {
		Struct_memberContext _localctx = new Struct_memberContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_struct_member);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__45:
			case T__46:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				compiler_control_statement();
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
		public List<Access_level_modifierContext> access_level_modifier() {
			return getRuleContexts(Access_level_modifierContext.class);
		}
		public Access_level_modifierContext access_level_modifier(int i) {
			return getRuleContext(Access_level_modifierContext.class,i);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_class_declaration);
		int _la;
		try {
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1522);
					attributes();
					}
				}

				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
					{
					setState(1525);
					access_level_modifier();
					}
				}

				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__46) {
					{
					setState(1528);
					match(T__46);
					}
				}

				setState(1531);
				match(T__35);
				setState(1532);
				class_name();
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1533);
					generic_parameter_clause();
					}
				}

				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1536);
					type_inheritance_clause();
					}
				}

				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1539);
					generic_where_clause();
					}
				}

				setState(1542);
				class_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1544);
					attributes();
					}
				}

				setState(1548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
					{
					setState(1547);
					access_level_modifier();
					}
				}

				setState(1550);
				match(T__46);
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
					{
					setState(1551);
					access_level_modifier();
					}
				}

				setState(1554);
				match(T__35);
				setState(1555);
				class_name();
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1556);
					generic_parameter_clause();
					}
				}

				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1559);
					type_inheritance_clause();
					}
				}

				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1562);
					generic_where_clause();
					}
				}

				setState(1565);
				class_body();
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

	public static class Class_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			declaration_identifier();
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(LCURLY);
			setState(1575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__28) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT) {
				{
				{
				setState(1572);
				class_member();
				}
				}
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1578);
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

	public static class Class_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClass_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClass_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClass_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_class_member);
		try {
			setState(1582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__45:
			case T__46:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				compiler_control_statement();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1584);
				attributes();
				}
			}

			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
				{
				setState(1587);
				access_level_modifier();
				}
			}

			setState(1590);
			match(T__37);
			setState(1591);
			protocol_name();
			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1592);
				type_inheritance_clause();
				}
			}

			setState(1595);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			declaration_identifier();
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Protocol_memberContext> protocol_member() {
			return getRuleContexts(Protocol_memberContext.class);
		}
		public Protocol_memberContext protocol_member(int i) {
			return getRuleContext(Protocol_memberContext.class,i);
		}
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(LCURLY);
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__28) | (1L << T__33) | (1L << T__35) | (1L << T__38) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT) {
				{
				{
				setState(1600);
				protocol_member();
				}
				}
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1606);
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

	public static class Protocol_memberContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Protocol_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_memberContext protocol_member() throws RecognitionException {
		Protocol_memberContext _localctx = new Protocol_memberContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_protocol_member);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__33:
			case T__35:
			case T__38:
			case T__46:
			case T__47:
			case T__48:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				protocol_member_declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				compiler_control_statement();
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
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_protocol_member_declaration);
		try {
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1615);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1616);
				protocol_associated_type_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1617);
				typealias_declaration();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_property_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_property_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			variable_declaration_head();
			setState(1621);
			variable_name();
			setState(1622);
			type_annotation();
			setState(1623);
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
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			function_head();
			setState(1626);
			function_name();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1627);
				generic_parameter_clause();
				}
			}

			setState(1630);
			function_signature();
			setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1631);
				generic_where_clause();
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
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_initializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_initializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_initializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_protocol_initializer_declaration);
		int _la;
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				initializer_head();
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1635);
					generic_parameter_clause();
					}
				}

				setState(1638);
				parameter_clause();
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(1639);
					match(T__43);
					}
				}

				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1642);
					generic_where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				initializer_head();
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1646);
					generic_parameter_clause();
					}
				}

				setState(1649);
				parameter_clause();
				setState(1650);
				match(T__44);
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1651);
					generic_where_clause();
					}
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_subscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_subscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_subscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			subscript_head();
			setState(1657);
			subscript_result();
			setState(1658);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_associated_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_associated_type_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_associated_type_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1660);
				attributes();
				}
			}

			setState(1664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
				{
				setState(1663);
				access_level_modifier();
				}
			}

			setState(1666);
			match(T__47);
			setState(1667);
			typealias_name();
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1668);
				type_inheritance_clause();
				}
				break;
			}
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1671);
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
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_initializer_declaration);
		int _la;
		try {
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674);
				initializer_head();
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1675);
					generic_parameter_clause();
					}
				}

				setState(1678);
				parameter_clause();
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(1679);
					match(T__43);
					}
				}

				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1682);
					generic_where_clause();
					}
				}

				setState(1685);
				initializer_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				initializer_head();
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1688);
					generic_parameter_clause();
					}
				}

				setState(1691);
				parameter_clause();
				setState(1692);
				match(T__44);
				setState(1694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1693);
					generic_where_clause();
					}
				}

				setState(1696);
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
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializer_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializer_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInitializer_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_initializer_head);
		int _la;
		try {
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1700);
					attributes();
					}
				}

				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0)) {
					{
					setState(1703);
					declaration_modifiers();
					}
				}

				setState(1706);
				match(T__48);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1707);
					attributes();
					}
				}

				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0)) {
					{
					setState(1710);
					declaration_modifiers();
					}
				}

				setState(1713);
				match(T__48);
				setState(1714);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1715);
					attributes();
					}
				}

				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0)) {
					{
					setState(1718);
					declaration_modifiers();
					}
				}

				setState(1721);
				match(T__48);
				setState(1722);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializer_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializer_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInitializer_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeinitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeinitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDeinitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1727);
				attributes();
				}
			}

			setState(1730);
			match(T__49);
			setState(1731);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExtension_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExtension_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExtension_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_extension_declaration);
		int _la;
		try {
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1733);
					attributes();
					}
				}

				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
					{
					setState(1736);
					access_level_modifier();
					}
				}

				setState(1739);
				match(T__50);
				setState(1740);
				type_identifier();
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1741);
					type_inheritance_clause();
					}
				}

				setState(1744);
				extension_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1746);
					attributes();
					}
				}

				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)))) != 0)) {
					{
					setState(1749);
					access_level_modifier();
					}
				}

				setState(1752);
				match(T__50);
				setState(1753);
				type_identifier();
				setState(1754);
				generic_where_clause();
				setState(1755);
				extension_body();
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

	public static class Extension_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Extension_memberContext> extension_member() {
			return getRuleContexts(Extension_memberContext.class);
		}
		public Extension_memberContext extension_member(int i) {
			return getRuleContext(Extension_memberContext.class,i);
		}
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExtension_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExtension_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExtension_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(LCURLY);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__28) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__77 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__80 - 65)) | (1L << (T__81 - 65)))) != 0) || _la==AT) {
				{
				{
				setState(1760);
				extension_member();
				}
				}
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1766);
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

	public static class Extension_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Extension_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExtension_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExtension_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExtension_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_memberContext extension_member() throws RecognitionException {
		Extension_memberContext _localctx = new Extension_memberContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_extension_member);
		try {
			setState(1770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__45:
			case T__46:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1769);
				compiler_control_statement();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSubscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_subscript_declaration);
		try {
			setState(1784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				subscript_head();
				setState(1773);
				subscript_result();
				setState(1774);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776);
				subscript_head();
				setState(1777);
				subscript_result();
				setState(1778);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1780);
				subscript_head();
				setState(1781);
				subscript_result();
				setState(1782);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscript_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscript_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSubscript_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1786);
				attributes();
				}
			}

			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0)) {
				{
				setState(1789);
				declaration_modifiers();
				}
			}

			setState(1792);
			match(T__51);
			setState(1793);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscript_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscript_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSubscript_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_subscript_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			arrow_operator();
			setState(1797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1796);
				attributes();
				}
				break;
			}
			setState(1799);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_operator_declaration);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				prefix_operator_declaration();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				postfix_operator_declaration();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(1803);
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
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrefix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrefix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrefix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(T__52);
			setState(1807);
			match(T__53);
			setState(1808);
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

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPostfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(T__54);
			setState(1811);
			match(T__53);
			setState(1812);
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

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Infix_operator_groupContext infix_operator_group() {
			return getRuleContext(Infix_operator_groupContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(T__55);
			setState(1815);
			match(T__53);
			setState(1816);
			operator();
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1817);
				infix_operator_group();
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

	public static class Infix_operator_groupContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public Infix_operator_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInfix_operator_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInfix_operator_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInfix_operator_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_groupContext infix_operator_group() throws RecognitionException {
		Infix_operator_groupContext _localctx = new Infix_operator_groupContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_infix_operator_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(COLON);
			setState(1821);
			precedence_group_name();
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

	public static class Precedence_group_declarationContext extends ParserRuleContext {
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Precedence_group_attributeContext> precedence_group_attribute() {
			return getRuleContexts(Precedence_group_attributeContext.class);
		}
		public Precedence_group_attributeContext precedence_group_attribute(int i) {
			return getRuleContext(Precedence_group_attributeContext.class,i);
		}
		public Precedence_group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedence_group_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedence_group_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrecedence_group_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_declarationContext precedence_group_declaration() throws RecognitionException {
		Precedence_group_declarationContext _localctx = new Precedence_group_declarationContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_precedence_group_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			match(T__56);
			setState(1824);
			precedence_group_name();
			setState(1825);
			match(LCURLY);
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0)) {
				{
				{
				setState(1826);
				precedence_group_attribute();
				}
				}
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1832);
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

	public static class Precedence_group_attributeContext extends ParserRuleContext {
		public Precedence_group_relationContext precedence_group_relation() {
			return getRuleContext(Precedence_group_relationContext.class,0);
		}
		public Precedence_group_assignmentContext precedence_group_assignment() {
			return getRuleContext(Precedence_group_assignmentContext.class,0);
		}
		public Precedence_group_associativityContext precedence_group_associativity() {
			return getRuleContext(Precedence_group_associativityContext.class,0);
		}
		public Precedence_group_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedence_group_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedence_group_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrecedence_group_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_attributeContext precedence_group_attribute() throws RecognitionException {
		Precedence_group_attributeContext _localctx = new Precedence_group_attributeContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_precedence_group_attribute);
		try {
			setState(1837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				precedence_group_relation();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				precedence_group_assignment();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 3);
				{
				setState(1836);
				precedence_group_associativity();
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

	public static class Precedence_group_relationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Precedence_group_namesContext precedence_group_names() {
			return getRuleContext(Precedence_group_namesContext.class,0);
		}
		public Precedence_group_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedence_group_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedence_group_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrecedence_group_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_relationContext precedence_group_relation() throws RecognitionException {
		Precedence_group_relationContext _localctx = new Precedence_group_relationContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_precedence_group_relation);
		try {
			setState(1845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				match(T__57);
				setState(1840);
				match(COLON);
				setState(1841);
				precedence_group_names();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				match(T__58);
				setState(1843);
				match(COLON);
				setState(1844);
				precedence_group_names();
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

	public static class Precedence_group_assignmentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Precedence_group_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedence_group_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedence_group_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrecedence_group_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_assignmentContext precedence_group_assignment() throws RecognitionException {
		Precedence_group_assignmentContext _localctx = new Precedence_group_assignmentContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_precedence_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(T__59);
			setState(1848);
			match(COLON);
			setState(1849);
			boolean_literal();
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

	public static class Precedence_group_associativityContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public Precedence_group_associativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedence_group_associativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedence_group_associativity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrecedence_group_associativity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_associativityContext precedence_group_associativity() throws RecognitionException {
		Precedence_group_associativityContext _localctx = new Precedence_group_associativityContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_precedence_group_associativity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(T__60);
			setState(1852);
			match(COLON);
			setState(1853);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAssociativity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAssociativity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (T__61 - 62)) | (1L << (T__62 - 62)) | (1L << (T__63 - 62)))) != 0)) ) {
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

	public static class Precedence_group_namesContext extends ParserRuleContext {
		public List<Precedence_group_nameContext> precedence_group_name() {
			return getRuleContexts(Precedence_group_nameContext.class);
		}
		public Precedence_group_nameContext precedence_group_name(int i) {
			return getRuleContext(Precedence_group_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Precedence_group_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedence_group_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedence_group_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrecedence_group_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_namesContext precedence_group_names() throws RecognitionException {
		Precedence_group_namesContext _localctx = new Precedence_group_namesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_precedence_group_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			precedence_group_name();
			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1858);
				match(COMMA);
				setState(1859);
				precedence_group_name();
				}
				}
				setState(1864);
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

	public static class Precedence_group_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Precedence_group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedence_group_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedence_group_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrecedence_group_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_nameContext precedence_group_name() throws RecognitionException {
		Precedence_group_nameContext _localctx = new Precedence_group_nameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_precedence_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			declaration_identifier();
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclaration_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclaration_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDeclaration_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_declaration_modifier);
		try {
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1867);
				match(T__35);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1868);
				match(T__64);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1869);
				match(T__65);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1870);
				match(T__46);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1871);
				match(T__55);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1872);
				match(T__66);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1873);
				match(T__67);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1874);
				match(T__68);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1875);
				match(T__54);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1876);
				match(T__52);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1877);
				match(T__69);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1878);
				match(T__70);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1879);
				match(T__71);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1880);
				match(T__71);
				setState(1881);
				match(LPAREN);
				setState(1882);
				match(T__72);
				setState(1883);
				match(RPAREN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1884);
				match(T__71);
				setState(1885);
				match(LPAREN);
				setState(1886);
				match(T__73);
				setState(1887);
				match(RPAREN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1888);
				match(T__74);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1889);
				access_level_modifier();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1890);
				mutation_modifier();
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
		public List<Declaration_modifierContext> declaration_modifier() {
			return getRuleContexts(Declaration_modifierContext.class);
		}
		public Declaration_modifierContext declaration_modifier(int i) {
			return getRuleContext(Declaration_modifierContext.class,i);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclaration_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclaration_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDeclaration_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1893);
				declaration_modifier();
				}
				}
				setState(1896); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__46 - 36)) | (1L << (T__52 - 36)) | (1L << (T__54 - 36)) | (1L << (T__55 - 36)) | (1L << (T__64 - 36)) | (1L << (T__65 - 36)) | (1L << (T__66 - 36)) | (1L << (T__67 - 36)) | (1L << (T__68 - 36)) | (1L << (T__69 - 36)) | (1L << (T__70 - 36)) | (1L << (T__71 - 36)) | (1L << (T__74 - 36)) | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36)) | (1L << (T__79 - 36)) | (1L << (T__80 - 36)) | (1L << (T__81 - 36)))) != 0) );
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAccess_level_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAccess_level_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAccess_level_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_access_level_modifier);
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				match(T__75);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				match(T__75);
				setState(1900);
				match(LPAREN);
				setState(1901);
				match(T__40);
				setState(1902);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1903);
				match(T__76);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1904);
				match(T__76);
				setState(1905);
				match(LPAREN);
				setState(1906);
				match(T__40);
				setState(1907);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1908);
				match(T__77);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1909);
				match(T__77);
				setState(1910);
				match(LPAREN);
				setState(1911);
				match(T__40);
				setState(1912);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1913);
				match(T__78);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1914);
				match(T__78);
				setState(1915);
				match(LPAREN);
				setState(1916);
				match(T__40);
				setState(1917);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1918);
				match(T__79);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1919);
				match(T__79);
				setState(1920);
				match(LPAREN);
				setState(1921);
				match(T__40);
				setState(1922);
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

	public static class Mutation_modifierContext extends ParserRuleContext {
		public Mutation_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutation_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterMutation_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitMutation_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitMutation_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mutation_modifierContext mutation_modifier() throws RecognitionException {
		Mutation_modifierContext _localctx = new Mutation_modifierContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_mutation_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__81) ) {
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPattern(this);
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
		int _startState = 346;
		enterRecursionRule(_localctx, 346, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1928);
				wildcard_pattern();
				setState(1930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1929);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1932);
				identifier_pattern();
				setState(1934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1933);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1936);
				value_binding_pattern();
				}
				break;
			case 4:
				{
				setState(1937);
				tuple_pattern();
				setState(1939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1938);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1941);
				enum_case_pattern();
				}
				break;
			case 6:
				{
				setState(1942);
				optional_pattern();
				}
				break;
			case 7:
				{
				setState(1943);
				match(T__82);
				setState(1944);
				type(0);
				}
				break;
			case 8:
				{
				setState(1945);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1948);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1949);
					match(T__83);
					setState(1950);
					type(0);
					}
					} 
				}
				setState(1955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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
		public TerminalNode UNDERSCORE() { return getToken(Swift3Parser.UNDERSCORE, 0); }
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWildcard_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitWildcard_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIdentifier_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIdentifier_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitIdentifier_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			declaration_identifier();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterValue_binding_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitValue_binding_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitValue_binding_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_value_binding_pattern);
		try {
			setState(1964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1960);
				match(T__5);
				setState(1961);
				pattern(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				match(T__4);
				setState(1963);
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(LPAREN);
			setState(1968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1967);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(1970);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_pattern_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_pattern_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_pattern_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			tuple_pattern_element();
			setState(1977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1973);
				match(COMMA);
				setState(1974);
				tuple_pattern_element();
				}
				}
				setState(1979);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_pattern_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_pattern_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_pattern_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
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
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnum_case_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnum_case_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitEnum_case_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__27 - 26)) | (1L << (T__29 - 26)) | (1L << (T__30 - 26)) | (1L << (T__39 - 26)) | (1L << (T__40 - 26)) | (1L << (T__41 - 26)) | (1L << (T__42 - 26)) | (1L << (T__45 - 26)) | (1L << (T__46 - 26)) | (1L << (T__52 - 26)) | (1L << (T__54 - 26)) | (1L << (T__55 - 26)) | (1L << (T__57 - 26)) | (1L << (T__58 - 26)) | (1L << (T__59 - 26)) | (1L << (T__60 - 26)) | (1L << (T__61 - 26)) | (1L << (T__62 - 26)) | (1L << (T__63 - 26)) | (1L << (T__64 - 26)) | (1L << (T__65 - 26)) | (1L << (T__66 - 26)) | (1L << (T__67 - 26)) | (1L << (T__68 - 26)) | (1L << (T__69 - 26)) | (1L << (T__71 - 26)) | (1L << (T__72 - 26)) | (1L << (T__73 - 26)) | (1L << (T__74 - 26)) | (1L << (T__79 - 26)) | (1L << (T__80 - 26)) | (1L << (T__81 - 26)))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (T__93 - 94)) | (1L << (T__94 - 94)) | (1L << (T__95 - 94)) | (1L << (T__96 - 94)) | (1L << (T__98 - 94)) | (1L << (T__109 - 94)) | (1L << (T__110 - 94)) | (1L << (T__111 - 94)) | (1L << (T__112 - 94)) | (1L << (T__115 - 94)) | (1L << (T__116 - 94)) | (1L << (T__117 - 94)) | (1L << (T__118 - 94)) | (1L << (T__119 - 94)) | (1L << (T__120 - 94)) | (1L << (T__121 - 94)) | (1L << (T__122 - 94)) | (1L << (T__123 - 94)) | (1L << (T__124 - 94)) | (1L << (T__125 - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				setState(1982);
				type_identifier();
				}
			}

			setState(1985);
			match(DOT);
			setState(1986);
			enum_case_name();
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1987);
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
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public Optional_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOptional_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOptional_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitOptional_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_patternContext optional_pattern() throws RecognitionException {
		Optional_patternContext _localctx = new Optional_patternContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			identifier_pattern();
			setState(1991);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpression_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpression_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExpression_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Swift3Parser.AT, 0); }
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(AT);
			setState(1996);
			attribute_name();
			setState(1998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1997);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			declaration_identifier();
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttribute_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttribute_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAttribute_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(LPAREN);
			setState(2003);
			balanced_tokens();
			setState(2004);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2007); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2006);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2009); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBalanced_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBalanced_tokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBalanced_tokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2011);
					balanced_token();
					}
					} 
				}
				setState(2016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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

	public static class Balanced_tokenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode Platform_name_platform_version() { return getToken(Swift3Parser.Platform_name_platform_version, 0); }
		public Any_punctuation_for_balanced_tokenContext any_punctuation_for_balanced_token() {
			return getRuleContext(Any_punctuation_for_balanced_tokenContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBalanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBalanced_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBalanced_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_balanced_token);
		try {
			setState(2034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				match(LPAREN);
				setState(2018);
				balanced_tokens();
				setState(2019);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2021);
				match(LBRACK);
				setState(2022);
				balanced_tokens();
				setState(2023);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2025);
				match(LCURLY);
				setState(2026);
				balanced_tokens();
				setState(2027);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2029);
				label_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2030);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2031);
				operator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2032);
				match(Platform_name_platform_version);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2033);
				any_punctuation_for_balanced_token();
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

	public static class Any_punctuation_for_balanced_tokenContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(Swift3Parser.SEMI, 0); }
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public TerminalNode AT() { return getToken(Swift3Parser.AT, 0); }
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TerminalNode AND() { return getToken(Swift3Parser.AND, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Any_punctuation_for_balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_punctuation_for_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAny_punctuation_for_balanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAny_punctuation_for_balanced_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAny_punctuation_for_balanced_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_punctuation_for_balanced_tokenContext any_punctuation_for_balanced_token() throws RecognitionException {
		Any_punctuation_for_balanced_tokenContext _localctx = new Any_punctuation_for_balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_any_punctuation_for_balanced_token);
		int _la;
		try {
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (DOT - 85)) | (1L << (COMMA - 85)) | (1L << (COLON - 85)) | (1L << (SEMI - 85)) | (1L << (QUESTION - 85)) | (1L << (AT - 85)))) != 0) || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				arrow_operator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2038);
				if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
				setState(2039);
				match(AND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2040);
				if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
				setState(2041);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2044);
				try_operator();
				}
				break;
			}
			setState(2047);
			prefix_expression();
			setState(2049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(2048);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			expression();
			setState(2056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2052);
				match(COMMA);
				setState(2053);
				expression();
				}
				}
				setState(2058);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrefix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrefix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_prefix_expression);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2059);
				prefix_operator();
				setState(2060);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2062);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2063);
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
		public TerminalNode AND() { return getToken(Swift3Parser.AND, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIn_out_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIn_out_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitIn_out_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(AND);
			setState(2067);
			declaration_identifier();
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
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Try_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTry_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTry_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTry_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_operatorContext try_operator() throws RecognitionException {
		Try_operatorContext _localctx = new Try_operatorContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_try_operator);
		try {
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2069);
				match(T__86);
				setState(2070);
				match(QUESTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				match(T__86);
				setState(2072);
				match(BANG);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2073);
				match(T__86);
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
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_binary_expression);
		try {
			setState(2092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				binary_operator();
				setState(2077);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2079);
				assignment_operator();
				setState(2081);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2080);
					try_operator();
					}
					break;
				}
				setState(2083);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2085);
				conditional_operator();
				setState(2087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(2086);
					try_operator();
					}
					break;
				}
				setState(2089);
				prefix_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2091);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBinary_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBinary_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBinary_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2095); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2094);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2097); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
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
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(QUESTION);
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2100);
				try_operator();
				}
				break;
			}
			setState(2103);
			expression();
			setState(2104);
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
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterType_casting_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitType_casting_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitType_casting_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_type_casting_operator);
		try {
			setState(2116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				match(T__82);
				setState(2107);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				match(T__83);
				setState(2109);
				type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2110);
				match(T__83);
				setState(2111);
				match(QUESTION);
				setState(2112);
				type(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2113);
				match(T__83);
				setState(2114);
				match(BANG);
				setState(2115);
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
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
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
		public Tuple_expressionContext tuple_expression() {
			return getRuleContext(Tuple_expressionContext.class,0);
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
		public Key_path_expressionContext key_path_expression() {
			return getRuleContext(Key_path_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_primary_expression);
		try {
			setState(2132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2118);
				declaration_identifier();
				setState(2120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2119);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2123);
				self_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2124);
				superclass_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2125);
				closure_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2126);
				parenthesized_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2127);
				tuple_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2128);
				implicit_member_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2129);
				wildcard_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2130);
				selector_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2131);
				key_path_expression();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLiteral_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_literal_expression);
		try {
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2134);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2135);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2136);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2137);
				match(T__87);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2138);
				match(T__88);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2139);
				match(T__89);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2140);
				match(T__90);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2141);
				match(T__91);
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
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(LBRACK);
			setState(2146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2145);
				array_literal_items();
				}
				break;
			}
			setState(2148);
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
		public Array_literal_itemContext array_literal_item() {
			return getRuleContext(Array_literal_itemContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArray_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArray_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArray_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_array_literal_items);
		int _la;
		try {
			setState(2158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				array_literal_item();
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2151);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2154);
				array_literal_item();
				setState(2155);
				match(COMMA);
				setState(2156);
				array_literal_items();
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArray_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArray_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArray_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
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
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionary_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dictionary_literal);
		try {
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2162);
				match(LBRACK);
				setState(2163);
				dictionary_literal_items();
				setState(2164);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2166);
				match(LBRACK);
				setState(2167);
				match(COLON);
				setState(2168);
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
		public Dictionary_literal_itemContext dictionary_literal_item() {
			return getRuleContext(Dictionary_literal_itemContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionary_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionary_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDictionary_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dictionary_literal_items);
		int _la;
		try {
			setState(2179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				dictionary_literal_item();
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2172);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2175);
				dictionary_literal_item();
				setState(2176);
				match(COMMA);
				setState(2177);
				dictionary_literal_items();
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

	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionary_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionary_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDictionary_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			expression();
			setState(2182);
			match(COLON);
			setState(2183);
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

	public static class Playground_literalContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(Swift3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Swift3Parser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Playground_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playground_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPlayground_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPlayground_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPlayground_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Playground_literalContext playground_literal() throws RecognitionException {
		Playground_literalContext _localctx = new Playground_literalContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_playground_literal);
		try {
			setState(2218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				match(T__92);
				setState(2186);
				match(LPAREN);
				setState(2187);
				match(T__93);
				setState(2188);
				match(COLON);
				setState(2189);
				expression();
				setState(2190);
				match(COMMA);
				setState(2191);
				match(T__94);
				setState(2192);
				match(COLON);
				setState(2193);
				expression();
				setState(2194);
				match(COMMA);
				setState(2195);
				match(T__95);
				setState(2196);
				match(COLON);
				setState(2197);
				expression();
				setState(2198);
				match(COMMA);
				setState(2199);
				match(T__96);
				setState(2200);
				match(COLON);
				setState(2201);
				expression();
				setState(2202);
				match(RPAREN);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 2);
				{
				setState(2204);
				match(T__97);
				setState(2205);
				match(LPAREN);
				setState(2206);
				match(T__98);
				setState(2207);
				match(COLON);
				setState(2208);
				expression();
				setState(2209);
				match(RPAREN);
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 3);
				{
				setState(2211);
				match(T__99);
				setState(2212);
				match(LPAREN);
				setState(2213);
				match(T__98);
				setState(2214);
				match(COLON);
				setState(2215);
				expression();
				setState(2216);
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

	public static class Self_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSelf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSelf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSelf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_self_expression);
		try {
			setState(2239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2220);
				match(T__100);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2221);
				match(T__100);
				setState(2222);
				match(DOT);
				setState(2223);
				declaration_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2224);
				match(T__100);
				setState(2225);
				match(LBRACK);
				setState(2226);
				expression_list();
				setState(2227);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2229);
				match(T__100);
				setState(2230);
				match(DOT);
				setState(2231);
				match(T__48);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2232);
				match(T__101);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2233);
				match(T__101);
				setState(2234);
				match(DOT);
				setState(2235);
				declaration_identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2236);
				match(T__101);
				setState(2237);
				match(DOT);
				setState(2238);
				match(T__48);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclass_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclass_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSuperclass_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_superclass_expression);
		try {
			setState(2244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2241);
				superclass_method_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2242);
				superclass_subscript_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2243);
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
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Superclass_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclass_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclass_method_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSuperclass_method_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_method_expressionContext superclass_method_expression() throws RecognitionException {
		Superclass_method_expressionContext _localctx = new Superclass_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			match(T__102);
			setState(2247);
			match(DOT);
			setState(2248);
			declaration_identifier();
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
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Superclass_subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_subscript_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclass_subscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclass_subscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSuperclass_subscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_subscript_expressionContext superclass_subscript_expression() throws RecognitionException {
		Superclass_subscript_expressionContext _localctx = new Superclass_subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(T__102);
			setState(2251);
			match(LBRACK);
			setState(2252);
			expression();
			setState(2253);
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
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Superclass_initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclass_initializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclass_initializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSuperclass_initializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_initializer_expressionContext superclass_initializer_expression() throws RecognitionException {
		Superclass_initializer_expressionContext _localctx = new Superclass_initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(T__102);
			setState(2256);
			match(DOT);
			setState(2257);
			match(T__48);
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
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClosure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			match(LCURLY);
			setState(2261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2260);
				closure_signature();
				}
				break;
			}
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2263);
				statements();
				}
				break;
			}
			setState(2266);
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
		public Closure_parameter_clauseContext closure_parameter_clause() {
			return getRuleContext(Closure_parameter_clauseContext.class,0);
		}
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosure_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosure_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClosure_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_closure_signature);
		int _la;
		try {
			setState(2283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(2268);
					capture_list();
					}
				}

				setState(2271);
				closure_parameter_clause();
				setState(2273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2272);
					match(T__43);
					}
					break;
				}
				setState(2276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2275);
					function_result();
					}
					break;
				}
				setState(2278);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
				capture_list();
				setState(2281);
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

	public static class Closure_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Closure_parameter_listContext closure_parameter_list() {
			return getRuleContext(Closure_parameter_listContext.class,0);
		}
		public Closure_parameter_clause_identifier_listContext closure_parameter_clause_identifier_list() {
			return getRuleContext(Closure_parameter_clause_identifier_listContext.class,0);
		}
		public Closure_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosure_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosure_parameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClosure_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameter_clauseContext closure_parameter_clause() throws RecognitionException {
		Closure_parameter_clauseContext _localctx = new Closure_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_closure_parameter_clause);
		try {
			setState(2292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2285);
				match(LPAREN);
				setState(2286);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2287);
				match(LPAREN);
				setState(2288);
				closure_parameter_list();
				setState(2289);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2291);
				closure_parameter_clause_identifier_list();
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

	public static class Closure_parameter_clause_identifier_listContext extends ParserRuleContext {
		public List<Declaration_identifierContext> declaration_identifier() {
			return getRuleContexts(Declaration_identifierContext.class);
		}
		public Declaration_identifierContext declaration_identifier(int i) {
			return getRuleContext(Declaration_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Closure_parameter_clause_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_clause_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosure_parameter_clause_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosure_parameter_clause_identifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClosure_parameter_clause_identifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameter_clause_identifier_listContext closure_parameter_clause_identifier_list() throws RecognitionException {
		Closure_parameter_clause_identifier_listContext _localctx = new Closure_parameter_clause_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_closure_parameter_clause_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			declaration_identifier();
			setState(2299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2295);
					match(COMMA);
					setState(2296);
					declaration_identifier();
					}
					} 
				}
				setState(2301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
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

	public static class Closure_parameter_listContext extends ParserRuleContext {
		public List<Closure_parameterContext> closure_parameter() {
			return getRuleContexts(Closure_parameterContext.class);
		}
		public Closure_parameterContext closure_parameter(int i) {
			return getRuleContext(Closure_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Closure_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosure_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosure_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClosure_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameter_listContext closure_parameter_list() throws RecognitionException {
		Closure_parameter_listContext _localctx = new Closure_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_closure_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			closure_parameter();
			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2303);
				match(COMMA);
				setState(2304);
				closure_parameter();
				}
				}
				setState(2309);
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

	public static class Closure_parameterContext extends ParserRuleContext {
		public Closure_parameter_nameContext closure_parameter_name() {
			return getRuleContext(Closure_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Closure_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosure_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosure_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClosure_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameterContext closure_parameter() throws RecognitionException {
		Closure_parameterContext _localctx = new Closure_parameterContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_closure_parameter);
		int _la;
		try {
			setState(2318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				closure_parameter_name();
				setState(2312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(2311);
					type_annotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2314);
				closure_parameter_name();
				setState(2315);
				type_annotation();
				setState(2316);
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

	public static class Closure_parameter_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Closure_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosure_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosure_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClosure_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameter_nameContext closure_parameter_name() throws RecognitionException {
		Closure_parameter_nameContext _localctx = new Closure_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_closure_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2320);
			label_identifier();
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
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Capture_list_itemsContext capture_list_items() {
			return getRuleContext(Capture_list_itemsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCapture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCapture_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCapture_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			match(LBRACK);
			setState(2323);
			capture_list_items();
			setState(2324);
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
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Capture_list_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCapture_list_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCapture_list_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCapture_list_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemsContext capture_list_items() throws RecognitionException {
		Capture_list_itemsContext _localctx = new Capture_list_itemsContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			capture_list_item();
			setState(2331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2327);
				match(COMMA);
				setState(2328);
				capture_list_item();
				}
				}
				setState(2333);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCapture_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCapture_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCapture_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemContext capture_list_item() throws RecognitionException {
		Capture_list_itemContext _localctx = new Capture_list_itemContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2334);
				capture_specifier();
				}
				break;
			}
			setState(2337);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCapture_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCapture_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCapture_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__74 - 72)) | (1L << (T__103 - 72)) | (1L << (T__104 - 72)))) != 0)) ) {
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

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImplicit_member_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitImplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(DOT);
			setState(2342);
			label_identifier();
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
			match(LPAREN);
			setState(2345);
			expression();
			setState(2346);
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

	public static class Tuple_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Tuple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_expressionContext tuple_expression() throws RecognitionException {
		Tuple_expressionContext _localctx = new Tuple_expressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_tuple_expression);
		int _la;
		try {
			setState(2360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2348);
				match(LPAREN);
				setState(2349);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2350);
				match(LPAREN);
				setState(2351);
				tuple_element();
				setState(2354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2352);
					match(COMMA);
					setState(2353);
					tuple_element();
					}
					}
					setState(2356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(2358);
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

	public static class Tuple_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_tuple_element);
		try {
			setState(2367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				label_identifier();
				setState(2364);
				match(COLON);
				setState(2365);
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
		public TerminalNode UNDERSCORE() { return getToken(Swift3Parser.UNDERSCORE, 0); }
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWildcard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWildcard_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitWildcard_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSelector_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSelector_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_selector_expression);
		try {
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2371);
				match(T__105);
				setState(2372);
				match(LPAREN);
				setState(2373);
				expression();
				setState(2374);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2376);
				match(T__105);
				setState(2377);
				match(LPAREN);
				setState(2378);
				match(T__106);
				setState(2379);
				expression();
				setState(2380);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2382);
				match(T__105);
				setState(2383);
				match(LPAREN);
				setState(2384);
				match(T__107);
				setState(2385);
				expression();
				setState(2386);
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

	public static class Key_path_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Key_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterKey_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitKey_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitKey_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_path_expressionContext key_path_expression() throws RecognitionException {
		Key_path_expressionContext _localctx = new Key_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_key_path_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			match(T__108);
			setState(2391);
			match(LPAREN);
			setState(2392);
			expression();
			setState(2393);
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
	public static class Function_call_expression_with_closureContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Function_call_argument_clauseContext function_call_argument_clause() {
			return getRuleContext(Function_call_argument_clauseContext.class,0);
		}
		public Function_call_expression_with_closureContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_call_expression_with_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_call_expression_with_closure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_call_expression_with_closure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_call_argument_clauseContext function_call_argument_clause() {
			return getRuleContext(Function_call_argument_clauseContext.class,0);
		}
		public Function_call_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_call_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression1Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(Swift3Parser.Pure_decimal_digits, 0); }
		public Explicit_member_expression1Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExplicit_member_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExplicit_member_expression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExplicit_member_expression1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Initializer_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInitializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Postfix_self_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Postfix_self_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfix_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfix_self_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPostfix_self_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expression_with_argsContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Initializer_expression_with_argsContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializer_expression_with_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializer_expression_with_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInitializer_expression_with_args(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_typeContext extends Postfix_expressionContext {
		public Dynamic_type_expressionContext dynamic_type_expression() {
			return getRuleContext(Dynamic_type_expressionContext.class,0);
		}
		public Dynamic_typeContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDynamic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDynamic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDynamic_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subscript_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Subscript_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSubscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression2Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Explicit_member_expression2Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExplicit_member_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExplicit_member_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExplicit_member_expression2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression3Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Explicit_member_expression3Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExplicit_member_expression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExplicit_member_expression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExplicit_member_expression3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression4Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Explicit_member_expression4Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExplicit_member_expression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExplicit_member_expression4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitExplicit_member_expression4(this);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfix_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfix_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPostfix_operation(this);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrimary(this);
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
		int _startState = 462;
		enterRecursionRule(_localctx, 462, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2396);
				primary_expression();
				}
				break;
			case 2:
				{
				_localctx = new Dynamic_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2397);
				dynamic_type_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_operationContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2400);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2401);
						postfix_operator();
						}
						break;
					case 2:
						{
						_localctx = new Function_call_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2402);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2403);
						function_call_argument_clause();
						}
						break;
					case 3:
						{
						_localctx = new Function_call_expression_with_closureContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2404);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2406);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(2405);
							function_call_argument_clause();
							}
						}

						setState(2408);
						trailing_closure();
						}
						break;
					case 4:
						{
						_localctx = new Initializer_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2409);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2410);
						match(DOT);
						setState(2411);
						match(T__48);
						}
						break;
					case 5:
						{
						_localctx = new Initializer_expression_with_argsContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2412);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2413);
						match(DOT);
						setState(2414);
						match(T__48);
						setState(2415);
						match(LPAREN);
						setState(2416);
						argument_names();
						setState(2417);
						match(RPAREN);
						}
						break;
					case 6:
						{
						_localctx = new Explicit_member_expression1Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2419);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2420);
						match(DOT);
						setState(2421);
						match(Pure_decimal_digits);
						}
						break;
					case 7:
						{
						_localctx = new Explicit_member_expression2Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2422);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2423);
						match(DOT);
						setState(2424);
						declaration_identifier();
						setState(2426);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
						case 1:
							{
							setState(2425);
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
						setState(2428);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2429);
						match(DOT);
						setState(2430);
						declaration_identifier();
						setState(2431);
						match(LPAREN);
						setState(2432);
						argument_names();
						setState(2433);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new Explicit_member_expression4Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2435);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2436);
						match(LPAREN);
						setState(2437);
						argument_names();
						setState(2438);
						match(RPAREN);
						}
						break;
					case 10:
						{
						_localctx = new Postfix_self_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2440);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2441);
						match(DOT);
						setState(2442);
						match(T__100);
						}
						break;
					case 11:
						{
						_localctx = new Subscript_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2443);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2444);
						match(LBRACK);
						setState(2445);
						expression_list();
						setState(2446);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(2452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
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

	public static class Function_call_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public Function_call_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_call_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_call_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_call_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argument_clauseContext function_call_argument_clause() throws RecognitionException {
		Function_call_argument_clauseContext _localctx = new Function_call_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_function_call_argument_clause);
		try {
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				match(LPAREN);
				setState(2454);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2455);
				match(LPAREN);
				setState(2456);
				function_call_argument_list();
				setState(2457);
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

	public static class Function_call_argument_listContext extends ParserRuleContext {
		public List<Function_call_argumentContext> function_call_argument() {
			return getRuleContexts(Function_call_argumentContext.class);
		}
		public Function_call_argumentContext function_call_argument(int i) {
			return getRuleContext(Function_call_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Function_call_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_call_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_call_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_call_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argument_listContext function_call_argument_list() throws RecognitionException {
		Function_call_argument_listContext _localctx = new Function_call_argument_listContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_function_call_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			function_call_argument();
			setState(2466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2462);
				match(COMMA);
				setState(2463);
				function_call_argument();
				}
				}
				setState(2468);
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

	public static class Function_call_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_call_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_call_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_call_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_call_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argumentContext function_call_argument() throws RecognitionException {
		Function_call_argumentContext _localctx = new Function_call_argumentContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_function_call_argument);
		try {
			setState(2479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2469);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2470);
				label_identifier();
				setState(2471);
				match(COLON);
				setState(2472);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2474);
				operator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2475);
				label_identifier();
				setState(2476);
				match(COLON);
				setState(2477);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTrailing_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTrailing_closure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTrailing_closure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trailing_closureContext trailing_closure() throws RecognitionException {
		Trailing_closureContext _localctx = new Trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
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

	public static class Argument_namesContext extends ParserRuleContext {
		public List<Argument_nameContext> argument_name() {
			return getRuleContexts(Argument_nameContext.class);
		}
		public Argument_nameContext argument_name(int i) {
			return getRuleContext(Argument_nameContext.class,i);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArgument_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArgument_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArgument_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			argument_name();
			setState(2487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (Identifier - 128)))) != 0)) {
				{
				{
				setState(2484);
				argument_name();
				}
				}
				setState(2489);
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

	public static class Argument_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArgument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArgument_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArgument_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			label_identifier();
			setState(2491);
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

	public static class Dynamic_type_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Dynamic_type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_type_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDynamic_type_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDynamic_type_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDynamic_type_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_type_expressionContext dynamic_type_expression() throws RecognitionException {
		Dynamic_type_expressionContext _localctx = new Dynamic_type_expressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_dynamic_type_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			match(T__109);
			setState(2494);
			match(LPAREN);
			setState(2495);
			match(T__110);
			setState(2496);
			match(COLON);
			setState(2497);
			expression();
			setState(2498);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class The_metatype_protocol_typeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public The_metatype_protocol_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_metatype_protocol_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_metatype_protocol_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_metatype_protocol_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_function_typeContext extends TypeContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public The_function_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_function_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_function_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_function_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_implicitly_unwrapped_optional_typeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public The_implicitly_unwrapped_optional_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_implicitly_unwrapped_optional_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_implicitly_unwrapped_optional_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_implicitly_unwrapped_optional_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_dictionary_typeContext extends TypeContext {
		public Dictionary_typeContext dictionary_type() {
			return getRuleContext(Dictionary_typeContext.class,0);
		}
		public The_dictionary_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_dictionary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_dictionary_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_dictionary_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_optional_typeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public The_optional_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_optional_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_optional_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_optional_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_tuple_typeContext extends TypeContext {
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public The_tuple_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_tuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_tuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_tuple_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_self_typeContext extends TypeContext {
		public The_self_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_self_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_self_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_self_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_array_typeContext extends TypeContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public The_array_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_array_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_array_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_array_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_metatype_type_typeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public The_metatype_type_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_metatype_type_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_metatype_type_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_metatype_type_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_protocol_composition_typeContext extends TypeContext {
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public The_protocol_composition_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_protocol_composition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_protocol_composition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_protocol_composition_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_any_typeContext extends TypeContext {
		public The_any_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_any_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_any_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_any_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class The_type_identifierContext extends TypeContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public The_type_identifierContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThe_type_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThe_type_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitThe_type_identifier(this);
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
		int _startState = 478;
		enterRecursionRule(_localctx, 478, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				_localctx = new The_array_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2501);
				array_type();
				}
				break;
			case 2:
				{
				_localctx = new The_dictionary_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2502);
				dictionary_type();
				}
				break;
			case 3:
				{
				_localctx = new The_function_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2503);
				function_type();
				}
				break;
			case 4:
				{
				_localctx = new The_type_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2504);
				type_identifier();
				}
				break;
			case 5:
				{
				_localctx = new The_tuple_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2505);
				tuple_type();
				}
				break;
			case 6:
				{
				_localctx = new The_protocol_composition_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2506);
				protocol_composition_type();
				}
				break;
			case 7:
				{
				_localctx = new The_any_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2507);
				match(T__113);
				}
				break;
			case 8:
				{
				_localctx = new The_self_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2508);
				match(T__101);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
					case 1:
						{
						_localctx = new The_optional_typeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2511);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2512);
						match(QUESTION);
						}
						break;
					case 2:
						{
						_localctx = new The_implicitly_unwrapped_optional_typeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2513);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2514);
						match(BANG);
						}
						break;
					case 3:
						{
						_localctx = new The_metatype_type_typeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2515);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2516);
						match(DOT);
						setState(2517);
						match(T__111);
						}
						break;
					case 4:
						{
						_localctx = new The_metatype_protocol_typeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2518);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2519);
						match(DOT);
						setState(2520);
						match(T__112);
						}
						break;
					}
					} 
				}
				setState(2525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
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
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitType_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			match(COLON);
			setState(2528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2527);
				attributes();
				}
				break;
			}
			setState(2531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__114) {
				{
				setState(2530);
				match(T__114);
				}
			}

			setState(2533);
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
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitType_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitType_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2535);
			type_name();
			setState(2537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2536);
				generic_argument_clause();
				}
				break;
			}
			setState(2541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2539);
				match(DOT);
				setState(2540);
				type_identifier();
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

	public static class Type_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2543);
			declaration_identifier();
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
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			match(LPAREN);
			setState(2547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (Identifier - 128)) | (1L << (LPAREN - 128)) | (1L << (LBRACK - 128)) | (1L << (AT - 128)))) != 0)) {
				{
				setState(2546);
				tuple_type_element_list();
				}
			}

			setState(2549);
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

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public Tuple_type_elementContext tuple_type_element() {
			return getRuleContext(Tuple_type_elementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_type_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_type_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_type_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_tuple_type_element_list);
		try {
			setState(2556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2551);
				tuple_type_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2552);
				tuple_type_element();
				setState(2553);
				match(COMMA);
				setState(2554);
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
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuple_type_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_tuple_type_element);
		try {
			setState(2562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2558);
				element_name();
				setState(2559);
				type_annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
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

	public static class Element_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElement_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElement_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitElement_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			label_identifier();
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

	public static class Function_typeContext extends ParserRuleContext {
		public Function_type_argument_clauseContext function_type_argument_clause() {
			return getRuleContext(Function_type_argument_clauseContext.class,0);
		}
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_function_type);
		int _la;
		try {
			setState(2584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2566);
					attributes();
					}
				}

				setState(2569);
				function_type_argument_clause();
				setState(2571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2570);
					match(T__43);
					}
					break;
				}
				setState(2573);
				arrow_operator();
				setState(2574);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2576);
					attributes();
					}
				}

				setState(2579);
				function_type_argument_clause();
				setState(2580);
				match(T__44);
				setState(2581);
				arrow_operator();
				setState(2582);
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

	public static class Function_type_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Function_type_argument_listContext function_type_argument_list() {
			return getRuleContext(Function_type_argument_listContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Function_type_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_type_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_type_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_type_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_type_argument_clauseContext function_type_argument_clause() throws RecognitionException {
		Function_type_argument_clauseContext _localctx = new Function_type_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_function_type_argument_clause);
		try {
			setState(2595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2586);
				match(LPAREN);
				setState(2587);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2588);
				match(LPAREN);
				setState(2589);
				function_type_argument_list();
				setState(2591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2590);
					range_operator();
					}
					break;
				}
				setState(2593);
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

	public static class Function_type_argument_listContext extends ParserRuleContext {
		public Function_type_argumentContext function_type_argument() {
			return getRuleContext(Function_type_argumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Function_type_argument_listContext function_type_argument_list() {
			return getRuleContext(Function_type_argument_listContext.class,0);
		}
		public Function_type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_type_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_type_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_type_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_type_argument_listContext function_type_argument_list() throws RecognitionException {
		Function_type_argument_listContext _localctx = new Function_type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_function_type_argument_list);
		try {
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2597);
				function_type_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2598);
				function_type_argument();
				setState(2599);
				match(COMMA);
				setState(2600);
				function_type_argument_list();
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

	public static class Function_type_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Argument_labelContext argument_label() {
			return getRuleContext(Argument_labelContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Function_type_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunction_type_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunction_type_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitFunction_type_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_type_argumentContext function_type_argument() throws RecognitionException {
		Function_type_argumentContext _localctx = new Function_type_argumentContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_function_type_argument);
		int _la;
		try {
			setState(2614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2604);
					attributes();
					}
					break;
				}
				setState(2608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__114) {
					{
					setState(2607);
					match(T__114);
					}
				}

				setState(2610);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2611);
				argument_label();
				setState(2612);
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

	public static class Argument_labelContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Argument_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArgument_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArgument_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArgument_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_labelContext argument_label() throws RecognitionException {
		Argument_labelContext _localctx = new Argument_labelContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_argument_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2616);
			label_identifier();
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			match(LBRACK);
			setState(2619);
			type(0);
			setState(2620);
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

	public static class Dictionary_typeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Dictionary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionary_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDictionary_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_typeContext dictionary_type() throws RecognitionException {
		Dictionary_typeContext _localctx = new Dictionary_typeContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_dictionary_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			match(LBRACK);
			setState(2623);
			type(0);
			setState(2624);
			match(COLON);
			setState(2625);
			type(0);
			setState(2626);
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

	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public List<Protocol_identifierContext> protocol_identifier() {
			return getRuleContexts(Protocol_identifierContext.class);
		}
		public Protocol_identifierContext protocol_identifier(int i) {
			return getRuleContext(Protocol_identifierContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(Swift3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Swift3Parser.AND, i);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_composition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_composition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_composition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_protocol_composition_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			protocol_identifier();
			setState(2631); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2629);
					match(AND);
					setState(2630);
					protocol_identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2633); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocol_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitProtocol_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifierContext protocol_identifier() throws RecognitionException {
		Protocol_identifierContext _localctx = new Protocol_identifierContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
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
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Class_requirementContext class_requirement() {
			return getRuleContext(Class_requirementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterType_inheritance_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitType_inheritance_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitType_inheritance_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_type_inheritance_clause);
		try {
			setState(2646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2637);
				match(COLON);
				setState(2638);
				class_requirement();
				setState(2639);
				match(COMMA);
				setState(2640);
				type_inheritance_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2642);
				match(COLON);
				setState(2643);
				class_requirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2644);
				match(COLON);
				setState(2645);
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
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterType_inheritance_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitType_inheritance_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitType_inheritance_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_type_inheritance_list);
		try {
			setState(2653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2648);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2649);
				type_identifier();
				setState(2650);
				match(COMMA);
				setState(2651);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClass_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClass_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitClass_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_requirementContext class_requirement() throws RecognitionException {
		Class_requirementContext _localctx = new Class_requirementContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_class_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(T__35);
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

	public static class Declaration_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public Keyword_as_identifier_in_declarationsContext keyword_as_identifier_in_declarations() {
			return getRuleContext(Keyword_as_identifier_in_declarationsContext.class,0);
		}
		public Declaration_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclaration_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclaration_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDeclaration_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_identifierContext declaration_identifier() throws RecognitionException {
		Declaration_identifierContext _localctx = new Declaration_identifierContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_declaration_identifier);
		try {
			setState(2659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2657);
				match(Identifier);
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__52:
			case T__54:
			case T__55:
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
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__79:
			case T__80:
			case T__81:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
				enterOuterAlt(_localctx, 2);
				{
				setState(2658);
				keyword_as_identifier_in_declarations();
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

	public static class Label_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public Keyword_as_identifier_in_labelsContext keyword_as_identifier_in_labels() {
			return getRuleContext(Keyword_as_identifier_in_labelsContext.class,0);
		}
		public Label_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLabel_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLabel_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLabel_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_identifierContext label_identifier() throws RecognitionException {
		Label_identifierContext _localctx = new Label_identifierContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_label_identifier);
		try {
			setState(2663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661);
				match(Identifier);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
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
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__86:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__100:
			case T__101:
			case T__102:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
				enterOuterAlt(_localctx, 2);
				{
				setState(2662);
				keyword_as_identifier_in_labels();
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

	public static class Keyword_as_identifier_in_declarationsContext extends ParserRuleContext {
		public Keyword_as_identifier_in_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_identifier_in_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterKeyword_as_identifier_in_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitKeyword_as_identifier_in_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitKeyword_as_identifier_in_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_as_identifier_in_declarationsContext keyword_as_identifier_in_declarations() throws RecognitionException {
		Keyword_as_identifier_in_declarationsContext _localctx = new Keyword_as_identifier_in_declarationsContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_keyword_as_identifier_in_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__45) | (1L << T__46) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__98 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)))) != 0)) ) {
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

	public static class Keyword_as_identifier_in_labelsContext extends ParserRuleContext {
		public Keyword_as_identifier_in_labelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_identifier_in_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterKeyword_as_identifier_in_labels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitKeyword_as_identifier_in_labels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitKeyword_as_identifier_in_labels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_as_identifier_in_labelsContext keyword_as_identifier_in_labels() throws RecognitionException {
		Keyword_as_identifier_in_labelsContext _localctx = new Keyword_as_identifier_in_labelsContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_keyword_as_identifier_in_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || _la==T__127 || _la==T__128) ) {
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
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2669);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2670);
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
		public TerminalNode SUB() { return getToken(Swift3Parser.SUB, 0); }
		public Negate_prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterNegate_prefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitNegate_prefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitNegate_prefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_prefix_operatorContext negate_prefix_operator() throws RecognitionException {
		Negate_prefix_operatorContext _localctx = new Negate_prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2673);
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

	public static class Compilation_condition_ANDContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(Swift3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Swift3Parser.AND, i);
		}
		public Compilation_condition_ANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_AND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCompilation_condition_AND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCompilation_condition_AND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCompilation_condition_AND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_condition_ANDContext compilation_condition_AND() throws RecognitionException {
		Compilation_condition_ANDContext _localctx = new Compilation_condition_ANDContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_compilation_condition_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2675);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(2676);
			match(AND);
			setState(2677);
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

	public static class Compilation_condition_ORContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(Swift3Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Swift3Parser.OR, i);
		}
		public Compilation_condition_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_OR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCompilation_condition_OR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCompilation_condition_OR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCompilation_condition_OR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_condition_ORContext compilation_condition_OR() throws RecognitionException {
		Compilation_condition_ORContext _localctx = new Compilation_condition_ORContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_compilation_condition_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(2680);
			match(OR);
			setState(2681);
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

	public static class Compilation_condition_GEContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public Compilation_condition_GEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_GE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCompilation_condition_GE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCompilation_condition_GE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitCompilation_condition_GE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_condition_GEContext compilation_condition_GE() throws RecognitionException {
		Compilation_condition_GEContext _localctx = new Compilation_condition_GEContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_compilation_condition_GE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2683);
			if (!(SwiftSupport.isOperator(_input,">="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\">=\")");
			setState(2684);
			match(GT);
			setState(2685);
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

	public static class Arrow_operatorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Swift3Parser.SUB, 0); }
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArrow_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArrow_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitArrow_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(2688);
			match(SUB);
			setState(2689);
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
		public List<TerminalNode> DOT() { return getTokens(Swift3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift3Parser.DOT, i);
		}
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRange_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRange_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitRange_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(2692);
			match(DOT);
			setState(2693);
			match(DOT);
			setState(2694);
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
		public List<TerminalNode> EQUAL() { return getTokens(Swift3Parser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(Swift3Parser.EQUAL, i);
		}
		public Same_type_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSame_type_equals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSame_type_equals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitSame_type_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_equalsContext same_type_equals() throws RecognitionException {
		Same_type_equalsContext _localctx = new Same_type_equalsContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2696);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(2697);
			match(EQUAL);
			setState(2698);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 542, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2700);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2701);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2704);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitPostfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 546, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2706);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(2707);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 548, RULE_operator);
		try {
			int _alt;
			setState(2725);
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
				setState(2709);
				operator_head();
				setState(2714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2710);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2711);
						operator_character();
						}
						} 
					}
					setState(2716);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2717);
				dot_operator_head();
				setState(2722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2718);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2719);
						dot_operator_character();
						}
						} 
					}
					setState(2724);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
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
		public TerminalNode Operator_following_character() { return getToken(Swift3Parser.Operator_following_character, 0); }
		public Operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitOperator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_characterContext operator_character() throws RecognitionException {
		Operator_characterContext _localctx = new Operator_characterContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_operator_character);
		try {
			setState(2729);
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
				setState(2727);
				operator_head();
				}
				break;
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2728);
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
		public TerminalNode DIV() { return getToken(Swift3Parser.DIV, 0); }
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public TerminalNode SUB() { return getToken(Swift3Parser.SUB, 0); }
		public TerminalNode ADD() { return getToken(Swift3Parser.ADD, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public TerminalNode MUL() { return getToken(Swift3Parser.MUL, 0); }
		public TerminalNode MOD() { return getToken(Swift3Parser.MOD, 0); }
		public TerminalNode AND() { return getToken(Swift3Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Swift3Parser.OR, 0); }
		public TerminalNode LT() { return getToken(Swift3Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public TerminalNode CARET() { return getToken(Swift3Parser.CARET, 0); }
		public TerminalNode TILDE() { return getToken(Swift3Parser.TILDE, 0); }
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode Operator_head_other() { return getToken(Swift3Parser.Operator_head_other, 0); }
		public Operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitOperator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_headContext operator_head() throws RecognitionException {
		Operator_headContext _localctx = new Operator_headContext(_ctx, getState());
		enterRule(_localctx, 552, RULE_operator_head);
		int _la;
		try {
			setState(2733);
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
				setState(2731);
				_la = _input.LA(1);
				if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LT - 142)) | (1L << (GT - 142)) | (1L << (BANG - 142)) | (1L << (QUESTION - 142)) | (1L << (AND - 142)) | (1L << (SUB - 142)) | (1L << (EQUAL - 142)) | (1L << (OR - 142)) | (1L << (DIV - 142)) | (1L << (ADD - 142)) | (1L << (MUL - 142)) | (1L << (MOD - 142)) | (1L << (CARET - 142)) | (1L << (TILDE - 142)))) != 0)) ) {
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
				setState(2732);
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
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Dot_operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDot_operator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDot_operator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDot_operator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_headContext dot_operator_head() throws RecognitionException {
		Dot_operator_headContext _localctx = new Dot_operator_headContext(_ctx, getState());
		enterRule(_localctx, 554, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2735);
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
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Operator_characterContext operator_character() {
			return getRuleContext(Operator_characterContext.class,0);
		}
		public Dot_operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDot_operator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDot_operator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitDot_operator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_characterContext dot_operator_character() throws RecognitionException {
		Dot_operator_characterContext _localctx = new Dot_operator_characterContext(_ctx, getState());
		enterRule(_localctx, 556, RULE_dot_operator_character);
		try {
			setState(2739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2737);
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
				setState(2738);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 558, RULE_literal);
		try {
			setState(2745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2741);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2742);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2743);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2744);
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
		public TerminalNode Floating_point_literal() { return getToken(Swift3Parser.Floating_point_literal, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 560, RULE_numeric_literal);
		try {
			setState(2755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2747);
					negate_prefix_operator();
					}
					break;
				}
				setState(2750);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2751);
					negate_prefix_operator();
					}
					break;
				}
				setState(2754);
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 562, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2757);
			_la = _input.LA(1);
			if ( !(_la==T__126 || _la==T__128) ) {
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
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterNil_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitNil_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitNil_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_literalContext nil_literal() throws RecognitionException {
		Nil_literalContext _localctx = new Nil_literalContext(_ctx, getState());
		enterRule(_localctx, 564, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2759);
			match(T__127);
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
		public TerminalNode Binary_literal() { return getToken(Swift3Parser.Binary_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(Swift3Parser.Octal_literal, 0); }
		public TerminalNode Decimal_literal() { return getToken(Swift3Parser.Decimal_literal, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(Swift3Parser.Pure_decimal_digits, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(Swift3Parser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 566, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			_la = _input.LA(1);
			if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (Binary_literal - 161)) | (1L << (Octal_literal - 161)) | (1L << (Decimal_literal - 161)) | (1L << (Pure_decimal_digits - 161)) | (1L << (Hexadecimal_literal - 161)))) != 0)) ) {
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
		public TerminalNode Static_string_literal() { return getToken(Swift3Parser.Static_string_literal, 0); }
		public TerminalNode Interpolated_string_literal() { return getToken(Swift3Parser.Interpolated_string_literal, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift3Visitor ) return ((Swift3Visitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 568, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
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
		case 3:
			return statements_impl_sempred((Statements_implContext)_localctx, predIndex);
		case 49:
			return compilation_condition_sempred((Compilation_conditionContext)_localctx, predIndex);
		case 173:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 189:
			return any_punctuation_for_balanced_token_sempred((Any_punctuation_for_balanced_tokenContext)_localctx, predIndex);
		case 231:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 239:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 263:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 264:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 265:
			return compilation_condition_AND_sempred((Compilation_condition_ANDContext)_localctx, predIndex);
		case 266:
			return compilation_condition_OR_sempred((Compilation_condition_ORContext)_localctx, predIndex);
		case 267:
			return compilation_condition_GE_sempred((Compilation_condition_GEContext)_localctx, predIndex);
		case 268:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 269:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 270:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 271:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 272:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 273:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 274:
			return operator_sempred((OperatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_impl_sempred(Statements_implContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore);
		}
		return true;
	}
	private boolean compilation_condition_sempred(Compilation_conditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean any_punctuation_for_balanced_token_sempred(Any_punctuation_for_balanced_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return SwiftSupport.isPrefixOp(_input);
		case 5:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
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
	private boolean compilation_condition_AND_sempred(Compilation_condition_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean compilation_condition_OR_sempred(Compilation_condition_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean compilation_condition_GE_sempred(Compilation_condition_GEContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return SwiftSupport.isOperator(_input,">=");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return _input.get(_input.index()-1).getType()!=WS;
		case 33:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ad\u0ad0\4\2\t"+
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
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110\t\u0110"+
		"\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114\4\u0115"+
		"\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119\t\u0119"+
		"\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d\4\u011e"+
		"\t\u011e\3\2\5\2\u023e\n\2\3\2\3\2\3\3\3\3\5\3\u0244\n\3\3\3\3\3\5\3\u0248"+
		"\n\3\3\3\3\3\5\3\u024c\n\3\3\3\3\3\5\3\u0250\n\3\3\3\3\3\5\3\u0254\n\3"+
		"\3\3\3\3\5\3\u0258\n\3\3\3\3\3\5\3\u025c\n\3\3\3\3\3\5\3\u0260\n\3\3\3"+
		"\3\3\5\3\u0264\n\3\5\3\u0266\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u026e\n\5"+
		"\3\6\3\6\3\6\3\6\5\6\u0274\n\6\3\7\3\7\5\7\u0278\n\7\3\7\3\7\5\7\u027c"+
		"\n\7\3\7\3\7\5\7\u0280\n\7\3\7\3\7\3\7\3\7\5\7\u0286\n\7\3\7\3\7\5\7\u028a"+
		"\n\7\3\7\3\7\5\7\u028e\n\7\3\7\3\7\5\7\u0292\n\7\3\b\3\b\5\b\u0296\n\b"+
		"\3\t\3\t\5\t\u029a\n\t\3\t\3\t\3\t\3\t\5\t\u02a0\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\7\13\u02ab\n\13\f\13\16\13\u02ae\13\13\3\f\3\f\3"+
		"\f\3\f\5\f\u02b4\n\f\3\r\3\r\3\r\3\r\5\r\u02ba\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u02c4\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\5\20\u02ce\n\20\3\21\3\21\3\21\3\21\5\21\u02d4\n\21\3\22\3\22\3"+
		"\22\3\22\5\22\u02da\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\5\24\u02e5\n\24\3\24\3\24\3\25\3\25\5\25\u02eb\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u02f3\n\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u02fb"+
		"\n\30\3\30\3\30\5\30\u02ff\n\30\3\30\3\30\3\30\5\30\u0304\n\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u031a\n\34\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0326\n\37\3 \3 \5 \u032a\n \3!\3!\5!\u032e"+
		"\n!\3\"\3\"\3#\3#\5#\u0334\n#\3$\3$\3$\3%\3%\3%\3&\3&\3&\5&\u033f\n&\3"+
		"\'\3\'\5\'\u0343\n\'\3(\3(\5(\u0347\n(\3(\5(\u034a\n(\3(\3(\3)\3)\5)\u0350"+
		"\n)\3*\3*\5*\u0354\n*\3*\5*\u0357\n*\3*\3*\3+\3+\3+\5+\u035e\n+\3,\6,"+
		"\u0361\n,\r,\16,\u0362\3-\3-\3-\5-\u0368\n-\3.\3.\5.\u036c\n.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u0380\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63"+
		"\u038a\n\63\f\63\16\63\u038d\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u039f\n\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\58\u03b7\n8\39\39\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\7<\u03c5\n<\f<\16"+
		"<\u03c8\13<\3=\3=\3>\3>\3>\3>\3?\3?\3?\7?\u03d3\n?\f?\16?\u03d6\13?\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03e1\n@\3A\3A\3A\3B\3B\3B\7B\u03e9\nB\f"+
		"B\16B\u03ec\13B\3C\3C\5C\u03f0\nC\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03fa\nD"+
		"\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\7G\u0407\nG\fG\16G\u040a\13G\3H\3H\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u041e\nI\3J\6J\u0421"+
		"\nJ\rJ\16J\u0422\3K\5K\u0426\nK\3L\3L\5L\u042a\nL\3L\3L\3M\5M\u042f\n"+
		"M\3M\3M\5M\u0433\nM\3M\3M\3N\3N\3O\3O\3O\7O\u043c\nO\fO\16O\u043f\13O"+
		"\3P\3P\5P\u0443\nP\3Q\5Q\u0446\nQ\3Q\5Q\u0449\nQ\3Q\3Q\3Q\3R\3R\3R\7R"+
		"\u0451\nR\fR\16R\u0454\13R\3S\3S\5S\u0458\nS\3T\3T\3T\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0470\nU\3U\3U\3U\3U\3U\3"+
		"U\3U\5U\u0479\nU\3U\3U\3U\3U\3U\5U\u0480\nU\3V\5V\u0483\nV\3V\5V\u0486"+
		"\nV\3V\3V\3W\3W\3X\3X\3X\5X\u048f\nX\3X\3X\3X\3X\3X\3X\3X\5X\u0498\nX"+
		"\3Y\5Y\u049b\nY\3Y\5Y\u049e\nY\3Y\3Y\3Y\3Z\5Z\u04a4\nZ\3Z\5Z\u04a7\nZ"+
		"\3Z\3Z\5Z\u04ab\nZ\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\5\\\u04b6\n\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\5\\\u04bf\n\\\3]\5]\u04c2\n]\3]\5]\u04c5\n]\3]\3"+
		"]\3^\5^\u04ca\n^\3^\5^\u04cd\n^\3^\3^\3_\3_\3_\5_\u04d4\n_\3_\3_\3_\3"+
		"_\3_\3_\3_\5_\u04dd\n_\3`\5`\u04e0\n`\3`\3`\5`\u04e4\n`\3`\3`\3a\5a\u04e9"+
		"\na\3a\3a\5a\u04ed\na\3a\3a\3b\5b\u04f2\nb\3b\5b\u04f5\nb\3b\3b\3b\5b"+
		"\u04fa\nb\3b\3b\3c\3c\3d\3d\3d\3e\3e\3e\5e\u0506\ne\3e\3e\5e\u050a\ne"+
		"\3e\5e\u050d\ne\3f\5f\u0510\nf\3f\5f\u0513\nf\3f\3f\3g\3g\5g\u0519\ng"+
		"\3h\3h\5h\u051d\nh\3h\5h\u0520\nh\3h\3h\3h\5h\u0525\nh\5h\u0527\nh\3i"+
		"\3i\5i\u052b\ni\3i\3i\3j\3j\3k\3k\3k\3k\3k\3k\5k\u0537\nk\3l\3l\3l\7l"+
		"\u053c\nl\fl\16l\u053f\13l\3m\5m\u0542\nm\3m\3m\3m\5m\u0547\nm\3m\5m\u054a"+
		"\nm\3m\3m\3m\3m\5m\u0550\nm\3m\3m\3m\3m\5m\u0556\nm\3n\3n\3o\3o\3p\3p"+
		"\3p\3q\5q\u0560\nq\3q\5q\u0563\nq\3q\3q\5q\u0567\nq\3q\5q\u056a\nq\3q"+
		"\5q\u056d\nq\3r\5r\u0570\nr\3r\3r\3r\5r\u0575\nr\3r\5r\u0578\nr\3r\5r"+
		"\u057b\nr\3r\3r\5r\u057f\nr\3r\3r\3s\3s\5s\u0585\ns\3t\3t\3t\5t\u058a"+
		"\nt\3u\5u\u058d\nu\3u\5u\u0590\nu\3u\3u\3u\3v\3v\3v\3v\3v\5v\u059a\nv"+
		"\3w\3w\5w\u059e\nw\3x\3x\3y\3y\3z\3z\3z\5z\u05a7\nz\3z\3z\5z\u05ab\nz"+
		"\3z\3z\3z\3z\3{\3{\5{\u05b3\n{\3|\3|\3|\5|\u05b8\n|\3}\5}\u05bb\n}\3}"+
		"\3}\3}\3~\3~\3~\3~\3~\5~\u05c5\n~\3\177\3\177\5\177\u05c9\n\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u05d1\n\u0081\3\u0082"+
		"\5\u0082\u05d4\n\u0082\3\u0082\5\u0082\u05d7\n\u0082\3\u0082\3\u0082\3"+
		"\u0082\5\u0082\u05dc\n\u0082\3\u0082\5\u0082\u05df\n\u0082\3\u0082\5\u0082"+
		"\u05e2\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\7\u0084"+
		"\u05ea\n\u0084\f\u0084\16\u0084\u05ed\13\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\5\u0085\u05f3\n\u0085\3\u0086\5\u0086\u05f6\n\u0086\3\u0086\5"+
		"\u0086\u05f9\n\u0086\3\u0086\5\u0086\u05fc\n\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0601\n\u0086\3\u0086\5\u0086\u0604\n\u0086\3\u0086\5\u0086\u0607"+
		"\n\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u060c\n\u0086\3\u0086\5\u0086"+
		"\u060f\n\u0086\3\u0086\3\u0086\5\u0086\u0613\n\u0086\3\u0086\3\u0086\3"+
		"\u0086\5\u0086\u0618\n\u0086\3\u0086\5\u0086\u061b\n\u0086\3\u0086\5\u0086"+
		"\u061e\n\u0086\3\u0086\3\u0086\5\u0086\u0622\n\u0086\3\u0087\3\u0087\3"+
		"\u0088\3\u0088\7\u0088\u0628\n\u0088\f\u0088\16\u0088\u062b\13\u0088\3"+
		"\u0088\3\u0088\3\u0089\3\u0089\5\u0089\u0631\n\u0089\3\u008a\5\u008a\u0634"+
		"\n\u008a\3\u008a\5\u008a\u0637\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u063c\n\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\7\u008c"+
		"\u0644\n\u008c\f\u008c\16\u008c\u0647\13\u008c\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\5\u008d\u064d\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0655\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\5\u0090\u065f\n\u0090\3\u0090\3\u0090\5\u0090"+
		"\u0663\n\u0090\3\u0091\3\u0091\5\u0091\u0667\n\u0091\3\u0091\3\u0091\5"+
		"\u0091\u066b\n\u0091\3\u0091\5\u0091\u066e\n\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0672\n\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0677\n\u0091\5\u0091\u0679"+
		"\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\5\u0093\u0680\n\u0093"+
		"\3\u0093\5\u0093\u0683\n\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0688\n"+
		"\u0093\3\u0093\5\u0093\u068b\n\u0093\3\u0094\3\u0094\5\u0094\u068f\n\u0094"+
		"\3\u0094\3\u0094\5\u0094\u0693\n\u0094\3\u0094\5\u0094\u0696\n\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u069c\n\u0094\3\u0094\3\u0094\3"+
		"\u0094\5\u0094\u06a1\n\u0094\3\u0094\3\u0094\5\u0094\u06a5\n\u0094\3\u0095"+
		"\5\u0095\u06a8\n\u0095\3\u0095\5\u0095\u06ab\n\u0095\3\u0095\3\u0095\5"+
		"\u0095\u06af\n\u0095\3\u0095\5\u0095\u06b2\n\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u06b7\n\u0095\3\u0095\5\u0095\u06ba\n\u0095\3\u0095\3\u0095\5"+
		"\u0095\u06be\n\u0095\3\u0096\3\u0096\3\u0097\5\u0097\u06c3\n\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\5\u0098\u06c9\n\u0098\3\u0098\5\u0098\u06cc\n"+
		"\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u06d1\n\u0098\3\u0098\3\u0098\3"+
		"\u0098\5\u0098\u06d6\n\u0098\3\u0098\5\u0098\u06d9\n\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\5\u0098\u06e0\n\u0098\3\u0099\3\u0099\7\u0099"+
		"\u06e4\n\u0099\f\u0099\16\u0099\u06e7\13\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\5\u009a\u06ed\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u06fb"+
		"\n\u009b\3\u009c\5\u009c\u06fe\n\u009c\3\u009c\5\u009c\u0701\n\u009c\3"+
		"\u009c\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u0708\n\u009d\3\u009d\3"+
		"\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u070f\n\u009e\3\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u071d\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\7\u00a3\u0726\n\u00a3\f\u00a3\16\u00a3\u0729\13\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0730\n\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0738\n\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0747\n\u00a9\f\u00a9\16\u00a9\u074a"+
		"\13\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u0766\n\u00ab\3\u00ac\6\u00ac\u0769\n\u00ac\r\u00ac\16\u00ac"+
		"\u076a\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad"+
		"\u0786\n\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u078d\n"+
		"\u00af\3\u00af\3\u00af\5\u00af\u0791\n\u00af\3\u00af\3\u00af\3\u00af\5"+
		"\u00af\u0796\n\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u079d"+
		"\n\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u07a2\n\u00af\f\u00af\16\u00af"+
		"\u07a5\13\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u07af\n\u00b2\3\u00b3\3\u00b3\5\u00b3\u07b3\n\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u07ba\n\u00b4\f\u00b4\16"+
		"\u00b4\u07bd\13\u00b4\3\u00b5\3\u00b5\3\u00b6\5\u00b6\u07c2\n\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b6\5\u00b6\u07c7\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3"+
		"\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07d1\n\u00b9\3\u00ba\3"+
		"\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\6\u00bc\u07da\n\u00bc\r"+
		"\u00bc\16\u00bc\u07db\3\u00bd\7\u00bd\u07df\n\u00bd\f\u00bd\16\u00bd\u07e2"+
		"\13\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\5\u00be\u07f5\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u07fd\n\u00bf\3\u00c0\5\u00c0\u0800\n\u00c0\3\u00c0\3\u00c0\5"+
		"\u00c0\u0804\n\u00c0\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0809\n\u00c1\f\u00c1"+
		"\16\u00c1\u080c\13\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u0813\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\5\u00c4\u081d\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\5\u00c5\u0824\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u082a\n"+
		"\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u082f\n\u00c5\3\u00c6\6\u00c6\u0832"+
		"\n\u00c6\r\u00c6\16\u00c6\u0833\3\u00c7\3\u00c7\5\u00c7\u0838\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0847\n\u00c8\3\u00c9\3\u00c9"+
		"\5\u00c9\u084b\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0857\n\u00c9\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0861\n\u00ca"+
		"\3\u00cb\3\u00cb\5\u00cb\u0865\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\5\u00cc\u086b\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0871\n"+
		"\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\5\u00ce\u087c\n\u00ce\3\u00cf\3\u00cf\5\u00cf\u0880\n\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0886\n\u00cf\3\u00d0\3\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1"+
		"\u08ad\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u08c2\n\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\5\u00d3\u08c7\n\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7"+
		"\5\u00d7\u08d8\n\u00d7\3\u00d7\5\u00d7\u08db\n\u00d7\3\u00d7\3\u00d7\3"+
		"\u00d8\5\u00d8\u08e0\n\u00d8\3\u00d8\3\u00d8\5\u00d8\u08e4\n\u00d8\3\u00d8"+
		"\5\u00d8\u08e7\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8"+
		"\u08ee\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\5\u00d9\u08f7\n\u00d9\3\u00da\3\u00da\3\u00da\7\u00da\u08fc\n\u00da\f"+
		"\u00da\16\u00da\u08ff\13\u00da\3\u00db\3\u00db\3\u00db\7\u00db\u0904\n"+
		"\u00db\f\u00db\16\u00db\u0907\13\u00db\3\u00dc\3\u00dc\5\u00dc\u090b\n"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0911\n\u00dc\3\u00dd\3"+
		"\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\7\u00df"+
		"\u091c\n\u00df\f\u00df\16\u00df\u091f\13\u00df\3\u00e0\5\u00e0\u0922\n"+
		"\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\6\u00e4\u0935\n\u00e4\r\u00e4\16\u00e4\u0936\3\u00e4\3\u00e4\5\u00e4"+
		"\u093b\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0942\n"+
		"\u00e5\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\5\u00e7\u0957\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0961\n\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0969\n\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u097d"+
		"\n\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\7\u00e9\u0993\n\u00e9\f\u00e9\16\u00e9\u0996"+
		"\13\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u099e"+
		"\n\u00ea\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u09a3\n\u00eb\f\u00eb\16\u00eb"+
		"\u09a6\13\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u09b2\n\u00ec\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\7\u00ee\u09b8\n\u00ee\f\u00ee\16\u00ee\u09bb\13\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\5\u00f1\u09d0\n\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f1\7\u00f1\u09dc\n\u00f1\f\u00f1\16\u00f1"+
		"\u09df\13\u00f1\3\u00f2\3\u00f2\5\u00f2\u09e3\n\u00f2\3\u00f2\5\u00f2"+
		"\u09e6\n\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3\5\u00f3\u09ec\n\u00f3\3"+
		"\u00f3\3\u00f3\5\u00f3\u09f0\n\u00f3\3\u00f4\3\u00f4\3\u00f5\3\u00f5\5"+
		"\u00f5\u09f6\n\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3"+
		"\u00f6\5\u00f6\u09ff\n\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u0a05"+
		"\n\u00f7\3\u00f8\3\u00f8\3\u00f9\5\u00f9\u0a0a\n\u00f9\3\u00f9\3\u00f9"+
		"\5\u00f9\u0a0e\n\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\5\u00f9\u0a14\n"+
		"\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\5\u00f9\u0a1b\n\u00f9\3"+
		"\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u0a22\n\u00fa\3\u00fa\3"+
		"\u00fa\5\u00fa\u0a26\n\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\5"+
		"\u00fb\u0a2d\n\u00fb\3\u00fc\5\u00fc\u0a30\n\u00fc\3\u00fc\5\u00fc\u0a33"+
		"\n\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\5\u00fc\u0a39\n\u00fc\3\u00fd"+
		"\3\u00fd\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0100\6\u0100\u0a4a\n\u0100\r\u0100"+
		"\16\u0100\u0a4b\3\u0101\3\u0101\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102"+
		"\3\u0102\3\u0102\3\u0102\3\u0102\5\u0102\u0a59\n\u0102\3\u0103\3\u0103"+
		"\3\u0103\3\u0103\3\u0103\5\u0103\u0a60\n\u0103\3\u0104\3\u0104\3\u0105"+
		"\3\u0105\5\u0105\u0a66\n\u0105\3\u0106\3\u0106\5\u0106\u0a6a\n\u0106\3"+
		"\u0107\3\u0107\3\u0108\3\u0108\3\u0109\3\u0109\3\u0109\3\u010a\3\u010a"+
		"\3\u010a\3\u010b\3\u010b\3\u010b\3\u010b\3\u010c\3\u010c\3\u010c\3\u010c"+
		"\3\u010d\3\u010d\3\u010d\3\u010d\3\u010e\3\u010e\3\u010e\3\u010e\3\u010f"+
		"\3\u010f\3\u010f\3\u010f\3\u010f\3\u0110\3\u0110\3\u0110\3\u0110\3\u0111"+
		"\3\u0111\3\u0111\3\u0112\3\u0112\3\u0112\3\u0113\3\u0113\3\u0113\3\u0114"+
		"\3\u0114\3\u0114\7\u0114\u0a9b\n\u0114\f\u0114\16\u0114\u0a9e\13\u0114"+
		"\3\u0114\3\u0114\3\u0114\7\u0114\u0aa3\n\u0114\f\u0114\16\u0114\u0aa6"+
		"\13\u0114\5\u0114\u0aa8\n\u0114\3\u0115\3\u0115\5\u0115\u0aac\n\u0115"+
		"\3\u0116\3\u0116\5\u0116\u0ab0\n\u0116\3\u0117\3\u0117\3\u0118\3\u0118"+
		"\5\u0118\u0ab6\n\u0118\3\u0119\3\u0119\3\u0119\3\u0119\5\u0119\u0abc\n"+
		"\u0119\3\u011a\5\u011a\u0abf\n\u011a\3\u011a\3\u011a\5\u011a\u0ac3\n\u011a"+
		"\3\u011a\5\u011a\u0ac6\n\u011a\3\u011b\3\u011b\3\u011c\3\u011c\3\u011d"+
		"\3\u011d\3\u011e\3\u011e\3\u011e\2\6d\u015c\u01d0\u01e0\u011f\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8"+
		"\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210"+
		"\u0212\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228"+
		"\u022a\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u023a\2\16\4\2\u0084"+
		"\u0084\u009c\u009c\4\2\b\b$)\3\2@B\3\2ST\7\2WX\u0086\u0086\u008d\u008f"+
		"\u0094\u0095\u0098\u0098\5\2JJMMjk\17\2\34\36 !*-\60\61\67\679:<HJMRT"+
		"`ceepsv\u0080\r\2\3\6\t\27\34\36 !#VYY`ceegiptv\u0083\5\2\u0090\u0091"+
		"\u0093\u0094\u0096\u009f\4\2\u0081\u0081\u0083\u0083\3\2\u00a3\u00a7\3"+
		"\2\u00a9\u00aa\2\u0b7f\2\u023d\3\2\2\2\4\u0265\3\2\2\2\6\u0267\3\2\2\2"+
		"\b\u0269\3\2\2\2\n\u0273\3\2\2\2\f\u0291\3\2\2\2\16\u0295\3\2\2\2\20\u0297"+
		"\3\2\2\2\22\u02a3\3\2\2\2\24\u02a7\3\2\2\2\26\u02b3\3\2\2\2\30\u02b5\3"+
		"\2\2\2\32\u02c3\3\2\2\2\34\u02c5\3\2\2\2\36\u02cd\3\2\2\2 \u02cf\3\2\2"+
		"\2\"\u02d9\3\2\2\2$\u02db\3\2\2\2&\u02e0\3\2\2\2(\u02e8\3\2\2\2*\u02f2"+
		"\3\2\2\2,\u02f4\3\2\2\2.\u0303\3\2\2\2\60\u0305\3\2\2\2\62\u0308\3\2\2"+
		"\2\64\u030b\3\2\2\2\66\u0319\3\2\2\28\u031b\3\2\2\2:\u031e\3\2\2\2<\u0325"+
		"\3\2\2\2>\u0327\3\2\2\2@\u032b\3\2\2\2B\u032f\3\2\2\2D\u0331\3\2\2\2F"+
		"\u0335\3\2\2\2H\u0338\3\2\2\2J\u033b\3\2\2\2L\u0340\3\2\2\2N\u0344\3\2"+
		"\2\2P\u034f\3\2\2\2R\u0351\3\2\2\2T\u035a\3\2\2\2V\u0360\3\2\2\2X\u0364"+
		"\3\2\2\2Z\u0369\3\2\2\2\\\u036d\3\2\2\2^\u036f\3\2\2\2`\u0371\3\2\2\2"+
		"b\u0373\3\2\2\2d\u037f\3\2\2\2f\u039e\3\2\2\2h\u03a0\3\2\2\2j\u03a4\3"+
		"\2\2\2l\u03a6\3\2\2\2n\u03b6\3\2\2\2p\u03b8\3\2\2\2r\u03ba\3\2\2\2t\u03bc"+
		"\3\2\2\2v\u03c1\3\2\2\2x\u03c9\3\2\2\2z\u03cb\3\2\2\2|\u03cf\3\2\2\2~"+
		"\u03e0\3\2\2\2\u0080\u03e2\3\2\2\2\u0082\u03e5\3\2\2\2\u0084\u03ef\3\2"+
		"\2\2\u0086\u03f9\3\2\2\2\u0088\u03fb\3\2\2\2\u008a\u03ff\3\2\2\2\u008c"+
		"\u0403\3\2\2\2\u008e\u040b\3\2\2\2\u0090\u041d\3\2\2\2\u0092\u0420\3\2"+
		"\2\2\u0094\u0425\3\2\2\2\u0096\u0427\3\2\2\2\u0098\u042e\3\2\2\2\u009a"+
		"\u0436\3\2\2\2\u009c\u0438\3\2\2\2\u009e\u0442\3\2\2\2\u00a0\u0445\3\2"+
		"\2\2\u00a2\u044d\3\2\2\2\u00a4\u0455\3\2\2\2\u00a6\u0459\3\2\2\2\u00a8"+
		"\u047f\3\2\2\2\u00aa\u0482\3\2\2\2\u00ac\u0489\3\2\2\2\u00ae\u0497\3\2"+
		"\2\2\u00b0\u049a\3\2\2\2\u00b2\u04a3\3\2\2\2\u00b4\u04ae\3\2\2\2\u00b6"+
		"\u04be\3\2\2\2\u00b8\u04c1\3\2\2\2\u00ba\u04c9\3\2\2\2\u00bc\u04dc\3\2"+
		"\2\2\u00be\u04df\3\2\2\2\u00c0\u04e8\3\2\2\2\u00c2\u04f1\3\2\2\2\u00c4"+
		"\u04fd\3\2\2\2\u00c6\u04ff\3\2\2\2\u00c8\u0502\3\2\2\2\u00ca\u050f\3\2"+
		"\2\2\u00cc\u0518\3\2\2\2\u00ce\u0526\3\2\2\2\u00d0\u0528\3\2\2\2\u00d2"+
		"\u052e\3\2\2\2\u00d4\u0536\3\2\2\2\u00d6\u0538\3\2\2\2\u00d8\u0555\3\2"+
		"\2\2\u00da\u0557\3\2\2\2\u00dc\u0559\3\2\2\2\u00de\u055b\3\2\2\2\u00e0"+
		"\u056c\3\2\2\2\u00e2\u056f\3\2\2\2\u00e4\u0582\3\2\2\2\u00e6\u0589\3\2"+
		"\2\2\u00e8\u058c\3\2\2\2\u00ea\u0599\3\2\2\2\u00ec\u059b\3\2\2\2\u00ee"+
		"\u059f\3\2\2\2\u00f0\u05a1\3\2\2\2\u00f2\u05a3\3\2\2\2\u00f4\u05b0\3\2"+
		"\2\2\u00f6\u05b7\3\2\2\2\u00f8\u05ba\3\2\2\2\u00fa\u05c4\3\2\2\2\u00fc"+
		"\u05c6\3\2\2\2\u00fe\u05ca\3\2\2\2\u0100\u05d0\3\2\2\2\u0102\u05d3\3\2"+
		"\2\2\u0104\u05e5\3\2\2\2\u0106\u05e7\3\2\2\2\u0108\u05f2\3\2\2\2\u010a"+
		"\u0621\3\2\2\2\u010c\u0623\3\2\2\2\u010e\u0625\3\2\2\2\u0110\u0630\3\2"+
		"\2\2\u0112\u0633\3\2\2\2\u0114\u063f\3\2\2\2\u0116\u0641\3\2\2\2\u0118"+
		"\u064c\3\2\2\2\u011a\u0654\3\2\2\2\u011c\u0656\3\2\2\2\u011e\u065b\3\2"+
		"\2\2\u0120\u0678\3\2\2\2\u0122\u067a\3\2\2\2\u0124\u067f\3\2\2\2\u0126"+
		"\u06a4\3\2\2\2\u0128\u06bd\3\2\2\2\u012a\u06bf\3\2\2\2\u012c\u06c2\3\2"+
		"\2\2\u012e\u06df\3\2\2\2\u0130\u06e1\3\2\2\2\u0132\u06ec\3\2\2\2\u0134"+
		"\u06fa\3\2\2\2\u0136\u06fd\3\2\2\2\u0138\u0705\3\2\2\2\u013a\u070e\3\2"+
		"\2\2\u013c\u0710\3\2\2\2\u013e\u0714\3\2\2\2\u0140\u0718\3\2\2\2\u0142"+
		"\u071e\3\2\2\2\u0144\u0721\3\2\2\2\u0146\u072f\3\2\2\2\u0148\u0737\3\2"+
		"\2\2\u014a\u0739\3\2\2\2\u014c\u073d\3\2\2\2\u014e\u0741\3\2\2\2\u0150"+
		"\u0743\3\2\2\2\u0152\u074b\3\2\2\2\u0154\u0765\3\2\2\2\u0156\u0768\3\2"+
		"\2\2\u0158\u0785\3\2\2\2\u015a\u0787\3\2\2\2\u015c\u079c\3\2\2\2\u015e"+
		"\u07a6\3\2\2\2\u0160\u07a8\3\2\2\2\u0162\u07ae\3\2\2\2\u0164\u07b0\3\2"+
		"\2\2\u0166\u07b6\3\2\2\2\u0168\u07be\3\2\2\2\u016a\u07c1\3\2\2\2\u016c"+
		"\u07c8\3\2\2\2\u016e\u07cb\3\2\2\2\u0170\u07cd\3\2\2\2\u0172\u07d2\3\2"+
		"\2\2\u0174\u07d4\3\2\2\2\u0176\u07d9\3\2\2\2\u0178\u07e0\3\2\2\2\u017a"+
		"\u07f4\3\2\2\2\u017c\u07fc\3\2\2\2\u017e\u07ff\3\2\2\2\u0180\u0805\3\2"+
		"\2\2\u0182\u0812\3\2\2\2\u0184\u0814\3\2\2\2\u0186\u081c\3\2\2\2\u0188"+
		"\u082e\3\2\2\2\u018a\u0831\3\2\2\2\u018c\u0835\3\2\2\2\u018e\u0846\3\2"+
		"\2\2\u0190\u0856\3\2\2\2\u0192\u0860\3\2\2\2\u0194\u0862\3\2\2\2\u0196"+
		"\u0870\3\2\2\2\u0198\u0872\3\2\2\2\u019a\u087b\3\2\2\2\u019c\u0885\3\2"+
		"\2\2\u019e\u0887\3\2\2\2\u01a0\u08ac\3\2\2\2\u01a2\u08c1\3\2\2\2\u01a4"+
		"\u08c6\3\2\2\2\u01a6\u08c8\3\2\2\2\u01a8\u08cc\3\2\2\2\u01aa\u08d1\3\2"+
		"\2\2\u01ac\u08d5\3\2\2\2\u01ae\u08ed\3\2\2\2\u01b0\u08f6\3\2\2\2\u01b2"+
		"\u08f8\3\2\2\2\u01b4\u0900\3\2\2\2\u01b6\u0910\3\2\2\2\u01b8\u0912\3\2"+
		"\2\2\u01ba\u0914\3\2\2\2\u01bc\u0918\3\2\2\2\u01be\u0921\3\2\2\2\u01c0"+
		"\u0925\3\2\2\2\u01c2\u0927\3\2\2\2\u01c4\u092a\3\2\2\2\u01c6\u093a\3\2"+
		"\2\2\u01c8\u0941\3\2\2\2\u01ca\u0943\3\2\2\2\u01cc\u0956\3\2\2\2\u01ce"+
		"\u0958\3\2\2\2\u01d0\u0960\3\2\2\2\u01d2\u099d\3\2\2\2\u01d4\u099f\3\2"+
		"\2\2\u01d6\u09b1\3\2\2\2\u01d8\u09b3\3\2\2\2\u01da\u09b5\3\2\2\2\u01dc"+
		"\u09bc\3\2\2\2\u01de\u09bf\3\2\2\2\u01e0\u09cf\3\2\2\2\u01e2\u09e0\3\2"+
		"\2\2\u01e4\u09e9\3\2\2\2\u01e6\u09f1\3\2\2\2\u01e8\u09f3\3\2\2\2\u01ea"+
		"\u09fe\3\2\2\2\u01ec\u0a04\3\2\2\2\u01ee\u0a06\3\2\2\2\u01f0\u0a1a\3\2"+
		"\2\2\u01f2\u0a25\3\2\2\2\u01f4\u0a2c\3\2\2\2\u01f6\u0a38\3\2\2\2\u01f8"+
		"\u0a3a\3\2\2\2\u01fa\u0a3c\3\2\2\2\u01fc\u0a40\3\2\2\2\u01fe\u0a46\3\2"+
		"\2\2\u0200\u0a4d\3\2\2\2\u0202\u0a58\3\2\2\2\u0204\u0a5f\3\2\2\2\u0206"+
		"\u0a61\3\2\2\2\u0208\u0a65\3\2\2\2\u020a\u0a69\3\2\2\2\u020c\u0a6b\3\2"+
		"\2\2\u020e\u0a6d\3\2\2\2\u0210\u0a6f\3\2\2\2\u0212\u0a72\3\2\2\2\u0214"+
		"\u0a75\3\2\2\2\u0216\u0a79\3\2\2\2\u0218\u0a7d\3\2\2\2\u021a\u0a81\3\2"+
		"\2\2\u021c\u0a85\3\2\2\2\u021e\u0a8a\3\2\2\2\u0220\u0a8e\3\2\2\2\u0222"+
		"\u0a91\3\2\2\2\u0224\u0a94\3\2\2\2\u0226\u0aa7\3\2\2\2\u0228\u0aab\3\2"+
		"\2\2\u022a\u0aaf\3\2\2\2\u022c\u0ab1\3\2\2\2\u022e\u0ab5\3\2\2\2\u0230"+
		"\u0abb\3\2\2\2\u0232\u0ac5\3\2\2\2\u0234\u0ac7\3\2\2\2\u0236\u0ac9\3\2"+
		"\2\2\u0238\u0acb\3\2\2\2\u023a\u0acd\3\2\2\2\u023c\u023e\5\6\4\2\u023d"+
		"\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7\2"+
		"\2\3\u0240\3\3\2\2\2\u0241\u0243\5\u017e\u00c0\2\u0242\u0244\7\u008f\2"+
		"\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0266\3\2\2\2\u0245\u0247"+
		"\5\u0090I\2\u0246\u0248\7\u008f\2\2\u0247\u0246\3\2\2\2\u0247\u0248\3"+
		"\2\2\2\u0248\u0266\3\2\2\2\u0249\u024b\5\n\6\2\u024a\u024c\7\u008f\2\2"+
		"\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0266\3\2\2\2\u024d\u024f"+
		"\5\36\20\2\u024e\u0250\7\u008f\2\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0266\3\2\2\2\u0251\u0253\5\66\34\2\u0252\u0254\7\u008f\2\2"+
		"\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0266\3\2\2\2\u0255\u0257"+
		"\5<\37\2\u0256\u0258\7\u008f\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2"+
		"\2\u0258\u0266\3\2\2\2\u0259\u025b\5H%\2\u025a\u025c\7\u008f\2\2\u025b"+
		"\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0266\3\2\2\2\u025d\u025f\5J"+
		"&\2\u025e\u0260\7\u008f\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0266\3\2\2\2\u0261\u0263\5P)\2\u0262\u0264\7\u008f\2\2\u0263\u0262\3"+
		"\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0241\3\2\2\2\u0265"+
		"\u0245\3\2\2\2\u0265\u0249\3\2\2\2\u0265\u024d\3\2\2\2\u0265\u0251\3\2"+
		"\2\2\u0265\u0255\3\2\2\2\u0265\u0259\3\2\2\2\u0265\u025d\3\2\2\2\u0265"+
		"\u0261\3\2\2\2\u0266\5\3\2\2\2\u0267\u0268\5\b\5\2\u0268\7\3\2\2\2\u0269"+
		"\u026a\6\5\2\3\u026a\u026b\5\4\3\2\u026b\u026d\b\5\1\2\u026c\u026e\5\b"+
		"\5\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\t\3\2\2\2\u026f\u0274"+
		"\5\f\7\2\u0270\u0274\5\20\t\2\u0271\u0274\5\22\n\2\u0272\u0274\5\34\17"+
		"\2\u0273\u026f\3\2\2\2\u0273\u0270\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0272"+
		"\3\2\2\2\u0274\13\3\2\2\2\u0275\u0277\7\3\2\2\u0276\u0278\5\16\b\2\u0277"+
		"\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\7\u008f"+
		"\2\2\u027a\u027c\5\u017e\u00c0\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2"+
		"\2\u027c\u027d\3\2\2\2\u027d\u027f\7\u008f\2\2\u027e\u0280\5\u017e\u00c0"+
		"\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0292"+
		"\5\u0096L\2\u0282\u0283\7\3\2\2\u0283\u0285\7\u0088\2\2\u0284\u0286\5"+
		"\16\b\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0289\7\u008f\2\2\u0288\u028a\5\u017e\u00c0\2\u0289\u0288\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\7\u008f\2\2\u028c\u028e"+
		"\5\u017e\u00c0\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3"+
		"\2\2\2\u028f\u0290\7\u008b\2\2\u0290\u0292\5\u0096L\2\u0291\u0275\3\2"+
		"\2\2\u0291\u0282\3\2\2\2\u0292\r\3\2\2\2\u0293\u0296\5\u00a8U\2\u0294"+
		"\u0296\5\u0180\u00c1\2\u0295\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296\17"+
		"\3\2\2\2\u0297\u0299\7\3\2\2\u0298\u029a\7\4\2\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\5\u015c\u00af\2\u029c\u029d"+
		"\7\5\2\2\u029d\u029f\5\u017e\u00c0\2\u029e\u02a0\5\62\32\2\u029f\u029e"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\5\u0096L"+
		"\2\u02a2\21\3\2\2\2\u02a3\u02a4\7\6\2\2\u02a4\u02a5\5\24\13\2\u02a5\u02a6"+
		"\5\u0096L\2\u02a6\23\3\2\2\2\u02a7\u02ac\5\26\f\2\u02a8\u02a9\7\u008d"+
		"\2\2\u02a9\u02ab\5\26\f\2\u02aa\u02a8\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\25\3\2\2\2\u02ae\u02ac\3\2\2"+
		"\2\u02af\u02b4\5\u017e\u00c0\2\u02b0\u02b4\5t;\2\u02b1\u02b4\5\30\r\2"+
		"\u02b2\u02b4\5\32\16\2\u02b3\u02af\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\27\3\2\2\2\u02b5\u02b6\7\4\2\2\u02b6"+
		"\u02b7\5\u015c\u00af\2\u02b7\u02b9\5\u00a6T\2\u02b8\u02ba\5\62\32\2\u02b9"+
		"\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\31\3\2\2\2\u02bb\u02bc\7\7\2"+
		"\2\u02bc\u02bd\5\u015c\u00af\2\u02bd\u02be\5\u00a6T\2\u02be\u02c4\3\2"+
		"\2\2\u02bf\u02c0\7\b\2\2\u02c0\u02c1\5\u015c\u00af\2\u02c1\u02c2\5\u00a6"+
		"T\2\u02c2\u02c4\3\2\2\2\u02c3\u02bb\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c4"+
		"\33\3\2\2\2\u02c5\u02c6\7\t\2\2\u02c6\u02c7\5\u0096L\2\u02c7\u02c8\7\6"+
		"\2\2\u02c8\u02c9\5\u017e\u00c0\2\u02c9\35\3\2\2\2\u02ca\u02ce\5 \21\2"+
		"\u02cb\u02ce\5$\23\2\u02cc\u02ce\5&\24\2\u02cd\u02ca\3\2\2\2\u02cd\u02cb"+
		"\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\37\3\2\2\2\u02cf\u02d0\7\n\2\2\u02d0"+
		"\u02d1\5\24\13\2\u02d1\u02d3\5\u0096L\2\u02d2\u02d4\5\"\22\2\u02d3\u02d2"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4!\3\2\2\2\u02d5\u02d6\7\13\2\2\u02d6"+
		"\u02da\5\u0096L\2\u02d7\u02d8\7\13\2\2\u02d8\u02da\5 \21\2\u02d9\u02d5"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da#\3\2\2\2\u02db\u02dc\7\f\2\2\u02dc"+
		"\u02dd\5\24\13\2\u02dd\u02de\7\13\2\2\u02de\u02df\5\u0096L\2\u02df%\3"+
		"\2\2\2\u02e0\u02e1\7\r\2\2\u02e1\u02e2\5\u017e\u00c0\2\u02e2\u02e4\7\u0087"+
		"\2\2\u02e3\u02e5\5(\25\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e7\7\u008a\2\2\u02e7\'\3\2\2\2\u02e8\u02ea\5*"+
		"\26\2\u02e9\u02eb\5(\25\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		")\3\2\2\2\u02ec\u02ed\5,\27\2\u02ed\u02ee\5\6\4\2\u02ee\u02f3\3\2\2\2"+
		"\u02ef\u02f0\5\60\31\2\u02f0\u02f1\5\6\4\2\u02f1\u02f3\3\2\2\2\u02f2\u02ec"+
		"\3\2\2\2\u02f2\u02ef\3\2\2\2\u02f3+\3\2\2\2\u02f4\u02f5\7\4\2\2\u02f5"+
		"\u02f6\5.\30\2\u02f6\u02f7\7\u008e\2\2\u02f7-\3\2\2\2\u02f8\u02fa\5\u015c"+
		"\u00af\2\u02f9\u02fb\5\62\32\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2"+
		"\u02fb\u0304\3\2\2\2\u02fc\u02fe\5\u015c\u00af\2\u02fd\u02ff\5\62\32\2"+
		"\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301"+
		"\7\u008d\2\2\u0301\u0302\5.\30\2\u0302\u0304\3\2\2\2\u0303\u02f8\3\2\2"+
		"\2\u0303\u02fc\3\2\2\2\u0304/\3\2\2\2\u0305\u0306\7\16\2\2\u0306\u0307"+
		"\7\u008e\2\2\u0307\61\3\2\2\2\u0308\u0309\7\17\2\2\u0309\u030a\5\64\33"+
		"\2\u030a\63\3\2\2\2\u030b\u030c\5\u017e\u00c0\2\u030c\65\3\2\2\2\u030d"+
		"\u030e\58\35\2\u030e\u030f\5\n\6\2\u030f\u031a\3\2\2\2\u0310\u0311\58"+
		"\35\2\u0311\u0312\5 \21\2\u0312\u031a\3\2\2\2\u0313\u0314\58\35\2\u0314"+
		"\u0315\5&\24\2\u0315\u031a\3\2\2\2\u0316\u0317\58\35\2\u0317\u0318\5J"+
		"&\2\u0318\u031a\3\2\2\2\u0319\u030d\3\2\2\2\u0319\u0310\3\2\2\2\u0319"+
		"\u0313\3\2\2\2\u0319\u0316\3\2\2\2\u031a\67\3\2\2\2\u031b\u031c\5:\36"+
		"\2\u031c\u031d\7\u008e\2\2\u031d9\3\2\2\2\u031e\u031f\5\u0208\u0105\2"+
		"\u031f;\3\2\2\2\u0320\u0326\5> \2\u0321\u0326\5@!\2\u0322\u0326\5B\"\2"+
		"\u0323\u0326\5D#\2\u0324\u0326\5F$\2\u0325\u0320\3\2\2\2\u0325\u0321\3"+
		"\2\2\2\u0325\u0322\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0324\3\2\2\2\u0326"+
		"=\3\2\2\2\u0327\u0329\7\20\2\2\u0328\u032a\5:\36\2\u0329\u0328\3\2\2\2"+
		"\u0329\u032a\3\2\2\2\u032a?\3\2\2\2\u032b\u032d\7\21\2\2\u032c\u032e\5"+
		":\36\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032eA\3\2\2\2\u032f\u0330"+
		"\7\22\2\2\u0330C\3\2\2\2\u0331\u0333\7\23\2\2\u0332\u0334\5\u017e\u00c0"+
		"\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334E\3\2\2\2\u0335\u0336"+
		"\7\24\2\2\u0336\u0337\5\u017e\u00c0\2\u0337G\3\2\2\2\u0338\u0339\7\25"+
		"\2\2\u0339\u033a\5\u0096L\2\u033aI\3\2\2\2\u033b\u033c\7\26\2\2\u033c"+
		"\u033e\5\u0096L\2\u033d\u033f\5L\'\2\u033e\u033d\3\2\2\2\u033e\u033f\3"+
		"\2\2\2\u033fK\3\2\2\2\u0340\u0342\5N(\2\u0341\u0343\5L\'\2\u0342\u0341"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343M\3\2\2\2\u0344\u0346\7\27\2\2\u0345"+
		"\u0347\5\u015c\u00af\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349"+
		"\3\2\2\2\u0348\u034a\5\62\32\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2"+
		"\u034a\u034b\3\2\2\2\u034b\u034c\5\u0096L\2\u034cO\3\2\2\2\u034d\u0350"+
		"\5R*\2\u034e\u0350\5n8\2\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u0350"+
		"Q\3\2\2\2\u0351\u0353\5T+\2\u0352\u0354\5V,\2\u0353\u0352\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0357\5Z.\2\u0356\u0355\3\2\2"+
		"\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\5b\62\2\u0359S"+
		"\3\2\2\2\u035a\u035b\5\\/\2\u035b\u035d\5d\63\2\u035c\u035e\5\6\4\2\u035d"+
		"\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035eU\3\2\2\2\u035f\u0361\5X-\2\u0360"+
		"\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363W\3\2\2\2\u0364\u0365\5^\60\2\u0365\u0367\5d\63\2\u0366\u0368"+
		"\5\6\4\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368Y\3\2\2\2\u0369"+
		"\u036b\5`\61\2\u036a\u036c\5\6\4\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c[\3\2\2\2\u036d\u036e\7\30\2\2\u036e]\3\2\2\2\u036f\u0370\7"+
		"\31\2\2\u0370_\3\2\2\2\u0371\u0372\7\32\2\2\u0372a\3\2\2\2\u0373\u0374"+
		"\7\33\2\2\u0374c\3\2\2\2\u0375\u0376\b\63\1\2\u0376\u0380\5f\64\2\u0377"+
		"\u0380\5\u020a\u0106\2\u0378\u0380\5\u0234\u011b\2\u0379\u037a\7\u0088"+
		"\2\2\u037a\u037b\5d\63\2\u037b\u037c\7\u008b\2\2\u037c\u0380\3\2\2\2\u037d"+
		"\u037e\7\u0093\2\2\u037e\u0380\5d\63\5\u037f\u0375\3\2\2\2\u037f\u0377"+
		"\3\2\2\2\u037f\u0378\3\2\2\2\u037f\u0379\3\2\2\2\u037f\u037d\3\2\2\2\u0380"+
		"\u038b\3\2\2\2\u0381\u0382\f\4\2\2\u0382\u0383\5\u0214\u010b\2\u0383\u0384"+
		"\5d\63\5\u0384\u038a\3\2\2\2\u0385\u0386\f\3\2\2\u0386\u0387\5\u0216\u010c"+
		"\2\u0387\u0388\5d\63\4\u0388\u038a\3\2\2\2\u0389\u0381\3\2\2\2\u0389\u0385"+
		"\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"e\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u038f\7\34\2\2\u038f\u0390\7\u0088"+
		"\2\2\u0390\u0391\5j\66\2\u0391\u0392\7\u008b\2\2\u0392\u039f\3\2\2\2\u0393"+
		"\u0394\7\35\2\2\u0394\u0395\7\u0088\2\2\u0395\u0396\5l\67\2\u0396\u0397"+
		"\7\u008b\2\2\u0397\u039f\3\2\2\2\u0398\u0399\7\36\2\2\u0399\u039a\7\u0088"+
		"\2\2\u039a\u039b\5\u0218\u010d\2\u039b\u039c\5h\65\2\u039c\u039d\7\u008b"+
		"\2\2\u039d\u039f\3\2\2\2\u039e\u038e\3\2\2\2\u039e\u0393\3\2\2\2\u039e"+
		"\u0398\3\2\2\2\u039fg\3\2\2\2\u03a0\u03a1\7\u00a6\2\2\u03a1\u03a2\7\u0086"+
		"\2\2\u03a2\u03a3\7\u00a6\2\2\u03a3i\3\2\2\2\u03a4\u03a5\5\u0208\u0105"+
		"\2\u03a5k\3\2\2\2\u03a6\u03a7\5\u0208\u0105\2\u03a7m\3\2\2\2\u03a8\u03a9"+
		"\7\37\2\2\u03a9\u03aa\7\u0088\2\2\u03aa\u03ab\7 \2\2\u03ab\u03ac\7\u008e"+
		"\2\2\u03ac\u03ad\5r:\2\u03ad\u03ae\7\u008d\2\2\u03ae\u03af\7!\2\2\u03af"+
		"\u03b0\7\u008e\2\2\u03b0\u03b1\5p9\2\u03b1\u03b2\7\u008b\2\2\u03b2\u03b7"+
		"\3\2\2\2\u03b3\u03b4\7\37\2\2\u03b4\u03b5\7\u0088\2\2\u03b5\u03b7\7\u008b"+
		"\2\2\u03b6\u03a8\3\2\2\2\u03b6\u03b3\3\2\2\2\u03b7o\3\2\2\2\u03b8\u03b9"+
		"\5\u0238\u011d\2\u03b9q\3\2\2\2\u03ba\u03bb\7\u00a9\2\2\u03bbs\3\2\2\2"+
		"\u03bc\u03bd\7\"\2\2\u03bd\u03be\7\u0088\2\2\u03be\u03bf\5v<\2\u03bf\u03c0"+
		"\7\u008b\2\2\u03c0u\3\2\2\2\u03c1\u03c6\5x=\2\u03c2\u03c3\7\u008d\2\2"+
		"\u03c3\u03c5\5x=\2\u03c4\u03c2\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4"+
		"\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7w\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9"+
		"\u03ca\t\2\2\2\u03cay\3\2\2\2\u03cb\u03cc\7\u0090\2\2\u03cc\u03cd\5|?"+
		"\2\u03cd\u03ce\7\u0091\2\2\u03ce{\3\2\2\2\u03cf\u03d4\5~@\2\u03d0\u03d1"+
		"\7\u008d\2\2\u03d1\u03d3\5~@\2\u03d2\u03d0\3\2\2\2\u03d3\u03d6\3\2\2\2"+
		"\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5}\3\2\2\2\u03d6\u03d4\3"+
		"\2\2\2\u03d7\u03e1\5\u01e6\u00f4\2\u03d8\u03d9\5\u01e6\u00f4\2\u03d9\u03da"+
		"\7\u008e\2\2\u03da\u03db\5\u01e4\u00f3\2\u03db\u03e1\3\2\2\2\u03dc\u03dd"+
		"\5\u01e6\u00f4\2\u03dd\u03de\7\u008e\2\2\u03de\u03df\5\u01fe\u0100\2\u03df"+
		"\u03e1\3\2\2\2\u03e0\u03d7\3\2\2\2\u03e0\u03d8\3\2\2\2\u03e0\u03dc\3\2"+
		"\2\2\u03e1\177\3\2\2\2\u03e2\u03e3\7\17\2\2\u03e3\u03e4\5\u0082B\2\u03e4"+
		"\u0081\3\2\2\2\u03e5\u03ea\5\u0084C\2\u03e6\u03e7\7\u008d\2\2\u03e7\u03e9"+
		"\5\u0084C\2\u03e8\u03e6\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2"+
		"\2\u03ea\u03eb\3\2\2\2\u03eb\u0083\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03f0"+
		"\5\u0086D\2\u03ee\u03f0\5\u0088E\2\u03ef\u03ed\3\2\2\2\u03ef\u03ee\3\2"+
		"\2\2\u03f0\u0085\3\2\2\2\u03f1\u03f2\5\u01e4\u00f3\2\u03f2\u03f3\7\u008e"+
		"\2\2\u03f3\u03f4\5\u01e4\u00f3\2\u03f4\u03fa\3\2\2\2\u03f5\u03f6\5\u01e4"+
		"\u00f3\2\u03f6\u03f7\7\u008e\2\2\u03f7\u03f8\5\u01fe\u0100\2\u03f8\u03fa"+
		"\3\2\2\2\u03f9\u03f1\3\2\2\2\u03f9\u03f5\3\2\2\2\u03fa\u0087\3\2\2\2\u03fb"+
		"\u03fc\5\u01e4\u00f3\2\u03fc\u03fd\5\u021e\u0110\2\u03fd\u03fe\5\u01e0"+
		"\u00f1\2\u03fe\u0089\3\2\2\2\u03ff\u0400\7\u0090\2\2\u0400\u0401\5\u008c"+
		"G\2\u0401\u0402\7\u0091\2\2\u0402\u008b\3\2\2\2\u0403\u0408\5\u008eH\2"+
		"\u0404\u0405\7\u008d\2\2\u0405\u0407\5\u008eH\2\u0406\u0404\3\2\2\2\u0407"+
		"\u040a\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u008d\3\2"+
		"\2\2\u040a\u0408\3\2\2\2\u040b\u040c\5\u01e0\u00f1\2\u040c\u008f\3\2\2"+
		"\2\u040d\u041e\5\u0098M\2\u040e\u041e\5\u00a0Q\2\u040f\u041e\5\u00a8U"+
		"\2\u0410\u041e\5\u00c2b\2\u0411\u041e\5\u00c8e\2\u0412\u041e\5\u00e0q"+
		"\2\u0413\u041e\5\u0102\u0082\2\u0414\u041e\5\u010a\u0086\2\u0415\u041e"+
		"\5\u0112\u008a\2\u0416\u041e\5\u0126\u0094\2\u0417\u041e\5\u012c\u0097"+
		"\2\u0418\u041e\5\u012e\u0098\2\u0419\u041e\5\u0134\u009b\2\u041a\u041e"+
		"\5\u013a\u009e\2\u041b\u041e\5\u013a\u009e\2\u041c\u041e\5\u0144\u00a3"+
		"\2\u041d\u040d\3\2\2\2\u041d\u040e\3\2\2\2\u041d\u040f\3\2\2\2\u041d\u0410"+
		"\3\2\2\2\u041d\u0411\3\2\2\2\u041d\u0412\3\2\2\2\u041d\u0413\3\2\2\2\u041d"+
		"\u0414\3\2\2\2\u041d\u0415\3\2\2\2\u041d\u0416\3\2\2\2\u041d\u0417\3\2"+
		"\2\2\u041d\u0418\3\2\2\2\u041d\u0419\3\2\2\2\u041d\u041a\3\2\2\2\u041d"+
		"\u041b\3\2\2\2\u041d\u041c\3\2\2\2\u041e\u0091\3\2\2\2\u041f\u0421\5\u0090"+
		"I\2\u0420\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0093\3\2\2\2\u0424\u0426\5\6\4\2\u0425\u0424\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0095\3\2\2\2\u0427\u0429\7\u0087\2\2\u0428"+
		"\u042a\5\6\4\2\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2"+
		"\2\2\u042b\u042c\7\u008a\2\2\u042c\u0097\3\2\2\2\u042d\u042f\5\u0176\u00bc"+
		"\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432"+
		"\7#\2\2\u0431\u0433\5\u009aN\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2"+
		"\u0433\u0434\3\2\2\2\u0434\u0435\5\u009cO\2\u0435\u0099\3\2\2\2\u0436"+
		"\u0437\t\3\2\2\u0437\u009b\3\2\2\2\u0438\u043d\5\u009eP\2\u0439\u043a"+
		"\7\u0086\2\2\u043a\u043c\5\u009eP\2\u043b\u0439\3\2\2\2\u043c\u043f\3"+
		"\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u009d\3\2\2\2\u043f"+
		"\u043d\3\2\2\2\u0440\u0443\5\u0208\u0105\2\u0441\u0443\5\u0226\u0114\2"+
		"\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2\2\u0443\u009f\3\2\2\2\u0444\u0446"+
		"\5\u0176\u00bc\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0448\3"+
		"\2\2\2\u0447\u0449\5\u0156\u00ac\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2"+
		"\2\2\u0449\u044a\3\2\2\2\u044a\u044b\7\7\2\2\u044b\u044c\5\u00a2R\2\u044c"+
		"\u00a1\3\2\2\2\u044d\u0452\5\u00a4S\2\u044e\u044f\7\u008d\2\2\u044f\u0451"+
		"\5\u00a4S\2\u0450\u044e\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2"+
		"\2\u0452\u0453\3\2\2\2\u0453\u00a3\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0457"+
		"\5\u015c\u00af\2\u0456\u0458\5\u00a6T\2\u0457\u0456\3\2\2\2\u0457\u0458"+
		"\3\2\2\2\u0458\u00a5\3\2\2\2\u0459\u045a\5\u0210\u0109\2\u045a\u045b\5"+
		"\u017e\u00c0\2\u045b\u00a7\3\2\2\2\u045c\u045d\5\u00aaV\2\u045d\u045e"+
		"\5\u00acW\2\u045e\u045f\5\u01e2\u00f2\2\u045f\u0460\5\u0096L\2\u0460\u0480"+
		"\3\2\2\2\u0461\u0462\5\u00aaV\2\u0462\u0463\5\u00acW\2\u0463\u0464\5\u01e2"+
		"\u00f2\2\u0464\u0465\5\u00aeX\2\u0465\u0480\3\2\2\2\u0466\u0467\5\u00aa"+
		"V\2\u0467\u0468\5\u00acW\2\u0468\u0469\5\u01e2\u00f2\2\u0469\u046a\5\u00b6"+
		"\\\2\u046a\u0480\3\2\2\2\u046b\u046c\5\u00aaV\2\u046c\u046d\5\u00acW\2"+
		"\u046d\u046f\5\u01e2\u00f2\2\u046e\u0470\5\u00a6T\2\u046f\u046e\3\2\2"+
		"\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\5\u00bc_\2\u0472"+
		"\u0480\3\2\2\2\u0473\u0474\5\u00aaV\2\u0474\u0475\5\u00acW\2\u0475\u0476"+
		"\5\u01e2\u00f2\2\u0476\u0478\5\u01e2\u00f2\2\u0477\u0479\5\u00a6T\2\u0478"+
		"\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\5\u00bc"+
		"_\2\u047b\u0480\3\2\2\2\u047c\u047d\5\u00aaV\2\u047d\u047e\5\u00a2R\2"+
		"\u047e\u0480\3\2\2\2\u047f\u045c\3\2\2\2\u047f\u0461\3\2\2\2\u047f\u0466"+
		"\3\2\2\2\u047f\u046b\3\2\2\2\u047f\u0473\3\2\2\2\u047f\u047c\3\2\2\2\u0480"+
		"\u00a9\3\2\2\2\u0481\u0483\5\u0176\u00bc\2\u0482\u0481\3\2\2\2\u0482\u0483"+
		"\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0486\5\u0156\u00ac\2\u0485\u0484\3"+
		"\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\7\b\2\2\u0488"+
		"\u00ab\3\2\2\2\u0489\u048a\5\u0208\u0105\2\u048a\u00ad\3\2\2\2\u048b\u048c"+
		"\7\u0087\2\2\u048c\u048e\5\u00b0Y\2\u048d\u048f\5\u00b2Z\2\u048e\u048d"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\7\u008a\2"+
		"\2\u0491\u0498\3\2\2\2\u0492\u0493\7\u0087\2\2\u0493\u0494\5\u00b2Z\2"+
		"\u0494\u0495\5\u00b0Y\2\u0495\u0496\7\u008a\2\2\u0496\u0498\3\2\2\2\u0497"+
		"\u048b\3\2\2\2\u0497\u0492\3\2\2\2\u0498\u00af\3\2\2\2\u0499\u049b\5\u0176"+
		"\u00bc\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\3\2\2\2\u049c"+
		"\u049e\5\u015a\u00ae\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f"+
		"\3\2\2\2\u049f\u04a0\7*\2\2\u04a0\u04a1\5\u0096L\2\u04a1\u00b1\3\2\2\2"+
		"\u04a2\u04a4\5\u0176\u00bc\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04a6\3\2\2\2\u04a5\u04a7\5\u015a\u00ae\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7"+
		"\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\7+\2\2\u04a9\u04ab\5\u00b4[\2"+
		"\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad"+
		"\5\u0096L\2\u04ad\u00b3\3\2\2\2\u04ae\u04af\7\u0088\2\2\u04af\u04b0\5"+
		"\u0208\u0105\2\u04b0\u04b1\7\u008b\2\2\u04b1\u00b5\3\2\2\2\u04b2\u04b3"+
		"\7\u0087\2\2\u04b3\u04b5\5\u00b8]\2\u04b4\u04b6\5\u00ba^\2\u04b5\u04b4"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7\u008a\2"+
		"\2\u04b8\u04bf\3\2\2\2\u04b9\u04ba\7\u0087\2\2\u04ba\u04bb\5\u00ba^\2"+
		"\u04bb\u04bc\5\u00b8]\2\u04bc\u04bd\7\u008a\2\2\u04bd\u04bf\3\2\2\2\u04be"+
		"\u04b2\3\2\2\2\u04be\u04b9\3\2\2\2\u04bf\u00b7\3\2\2\2\u04c0\u04c2\5\u0176"+
		"\u00bc\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3"+
		"\u04c5\5\u015a\u00ae\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c7\7*\2\2\u04c7\u00b9\3\2\2\2\u04c8\u04ca\5\u0176\u00bc"+
		"\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04cd"+
		"\5\u015a\u00ae\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\3"+
		"\2\2\2\u04ce\u04cf\7+\2\2\u04cf\u00bb\3\2\2\2\u04d0\u04d1\7\u0087\2\2"+
		"\u04d1\u04d3\5\u00be`\2\u04d2\u04d4\5\u00c0a\2\u04d3\u04d2\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\7\u008a\2\2\u04d6\u04dd"+
		"\3\2\2\2\u04d7\u04d8\7\u0087\2\2\u04d8\u04d9\5\u00c0a\2\u04d9\u04da\5"+
		"\u00be`\2\u04da\u04db\7\u008a\2\2\u04db\u04dd\3\2\2\2\u04dc\u04d0\3\2"+
		"\2\2\u04dc\u04d7\3\2\2\2\u04dd\u00bd\3\2\2\2\u04de\u04e0\5\u0176\u00bc"+
		"\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3"+
		"\7,\2\2\u04e2\u04e4\5\u00b4[\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2"+
		"\u04e4\u04e5\3\2\2\2\u04e5\u04e6\5\u0096L\2\u04e6\u00bf\3\2\2\2\u04e7"+
		"\u04e9\5\u0176\u00bc\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea"+
		"\3\2\2\2\u04ea\u04ec\7-\2\2\u04eb\u04ed\5\u00b4[\2\u04ec\u04eb\3\2\2\2"+
		"\u04ec\u04ed\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\5\u0096L\2\u04ef"+
		"\u00c1\3\2\2\2\u04f0\u04f2\5\u0176\u00bc\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2"+
		"\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f5\5\u0158\u00ad\2\u04f4\u04f3\3"+
		"\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\7$\2\2\u04f7"+
		"\u04f9\5\u00c4c\2\u04f8\u04fa\5z>\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3"+
		"\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\5\u00c6d\2\u04fc\u00c3\3\2\2\2"+
		"\u04fd\u04fe\5\u0208\u0105\2\u04fe\u00c5\3\2\2\2\u04ff\u0500\5\u0210\u0109"+
		"\2\u0500\u0501\5\u01e0\u00f1\2\u0501\u00c7\3\2\2\2\u0502\u0503\5\u00ca"+
		"f\2\u0503\u0505\5\u00ccg\2\u0504\u0506\5z>\2\u0505\u0504\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\5\u00ceh\2\u0508\u050a"+
		"\5\u0080A\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2"+
		"\2\u050b\u050d\5\u00d2j\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u00c9\3\2\2\2\u050e\u0510\5\u0176\u00bc\2\u050f\u050e\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u0513\5\u0156\u00ac\2\u0512\u0511\3"+
		"\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\7)\2\2\u0515"+
		"\u00cb\3\2\2\2\u0516\u0519\5\u0208\u0105\2\u0517\u0519\5\u0226\u0114\2"+
		"\u0518\u0516\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u00cd\3\2\2\2\u051a\u051c"+
		"\5\u00d4k\2\u051b\u051d\7.\2\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2"+
		"\u051d\u051f\3\2\2\2\u051e\u0520\5\u00d0i\2\u051f\u051e\3\2\2\2\u051f"+
		"\u0520\3\2\2\2\u0520\u0527\3\2\2\2\u0521\u0522\5\u00d4k\2\u0522\u0524"+
		"\7/\2\2\u0523\u0525\5\u00d0i\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2"+
		"\u0525\u0527\3\2\2\2\u0526\u051a\3\2\2\2\u0526\u0521\3\2\2\2\u0527\u00cf"+
		"\3\2\2\2\u0528\u052a\5\u021a\u010e\2\u0529\u052b\5\u0176\u00bc\2\u052a"+
		"\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\5\u01e0"+
		"\u00f1\2\u052d\u00d1\3\2\2\2\u052e\u052f\5\u0096L\2\u052f\u00d3\3\2\2"+
		"\2\u0530\u0531\7\u0088\2\2\u0531\u0537\7\u008b\2\2\u0532\u0533\7\u0088"+
		"\2\2\u0533\u0534\5\u00d6l\2\u0534\u0535\7\u008b\2\2\u0535\u0537\3\2\2"+
		"\2\u0536\u0530\3\2\2\2\u0536\u0532\3\2\2\2\u0537\u00d5\3\2\2\2\u0538\u053d"+
		"\5\u00d8m\2\u0539\u053a\7\u008d\2\2\u053a\u053c\5\u00d8m\2\u053b\u0539"+
		"\3\2\2\2\u053c\u053f\3\2\2\2\u053d\u053b\3\2\2\2\u053d\u053e\3\2\2\2\u053e"+
		"\u00d7\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u0542\5\u00dan\2\u0541\u0540"+
		"\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\5\u00dco"+
		"\2\u0544\u0546\5\u01e2\u00f2\2\u0545\u0547\5\u00dep\2\u0546\u0545\3\2"+
		"\2\2\u0546\u0547\3\2\2\2\u0547\u0556\3\2\2\2\u0548\u054a\5\u00dan\2\u0549"+
		"\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\5\u00dc"+
		"o\2\u054c\u054d\5\u01e2\u00f2\2\u054d\u0556\3\2\2\2\u054e\u0550\5\u00da"+
		"n\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551"+
		"\u0552\5\u00dco\2\u0552\u0553\5\u01e2\u00f2\2\u0553\u0554\5\u021c\u010f"+
		"\2\u0554\u0556\3\2\2\2\u0555\u0541\3\2\2\2\u0555\u0549\3\2\2\2\u0555\u054f"+
		"\3\2\2\2\u0556\u00d9\3\2\2\2\u0557\u0558\5\u020a\u0106\2\u0558\u00db\3"+
		"\2\2\2\u0559\u055a\5\u020a\u0106\2\u055a\u00dd\3\2\2\2\u055b\u055c\5\u0210"+
		"\u0109\2\u055c\u055d\5\u017e\u00c0\2\u055d\u00df\3\2\2\2\u055e\u0560\5"+
		"\u0176\u00bc\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2"+
		"\2\2\u0561\u0563\5\u0158\u00ad\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2"+
		"\2\u0563\u0564\3\2\2\2\u0564\u056d\5\u00e2r\2\u0565\u0567\5\u0176\u00bc"+
		"\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568\u056a"+
		"\5\u0158\u00ad\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3"+
		"\2\2\2\u056b\u056d\5\u00f2z\2\u056c\u055f\3\2\2\2\u056c\u0566\3\2\2\2"+
		"\u056d\u00e1\3\2\2\2\u056e\u0570\7\60\2\2\u056f\u056e\3\2\2\2\u056f\u0570"+
		"\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\7\'\2\2\u0572\u0574\5\u00eex"+
		"\2\u0573\u0575\5z>\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577"+
		"\3\2\2\2\u0576\u0578\5\u0202\u0102\2\u0577\u0576\3\2\2\2\u0577\u0578\3"+
		"\2\2\2\u0578\u057a\3\2\2\2\u0579\u057b\5\u0080A\2\u057a\u0579\3\2\2\2"+
		"\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057e\7\u0087\2\2\u057d"+
		"\u057f\5\u00e4s\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580"+
		"\3\2\2\2\u0580\u0581\7\u008a\2\2\u0581\u00e3\3\2\2\2\u0582\u0584\5\u00e6"+
		"t\2\u0583\u0585\5\u00e4s\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u00e5\3\2\2\2\u0586\u058a\5\u0090I\2\u0587\u058a\5\u00e8u\2\u0588\u058a"+
		"\5P)\2\u0589\u0586\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u0588\3\2\2\2\u058a"+
		"\u00e7\3\2\2\2\u058b\u058d\5\u0176\u00bc\2\u058c\u058b\3\2\2\2\u058c\u058d"+
		"\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u0590\7\60\2\2\u058f\u058e\3\2\2\2"+
		"\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\7\4\2\2\u0592\u0593"+
		"\5\u00eav\2\u0593\u00e9\3\2\2\2\u0594\u059a\5\u00ecw\2\u0595\u0596\5\u00ec"+
		"w\2\u0596\u0597\7\u008d\2\2\u0597\u0598\5\u00eav\2\u0598\u059a\3\2\2\2"+
		"\u0599\u0594\3\2\2\2\u0599\u0595\3\2\2\2\u059a\u00eb\3\2\2\2\u059b\u059d"+
		"\5\u00f0y\2\u059c\u059e\5\u01e8\u00f5\2\u059d\u059c\3\2\2\2\u059d\u059e"+
		"\3\2\2\2\u059e\u00ed\3\2\2\2\u059f\u05a0\5\u0208\u0105\2\u05a0\u00ef\3"+
		"\2\2\2\u05a1\u05a2\5\u0208\u0105\2\u05a2\u00f1\3\2\2\2\u05a3\u05a4\7\'"+
		"\2\2\u05a4\u05a6\5\u00eex\2\u05a5\u05a7\5z>\2\u05a6\u05a5\3\2\2\2\u05a6"+
		"\u05a7\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\5\u0202\u0102\2\u05a9\u05ab"+
		"\5\u0080A\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2"+
		"\2\u05ac\u05ad\7\u0087\2\2\u05ad\u05ae\5\u00f4{\2\u05ae\u05af\7\u008a"+
		"\2\2\u05af\u00f3\3\2\2\2\u05b0\u05b2\5\u00f6|\2\u05b1\u05b3\5\u00f4{\2"+
		"\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u00f5\3\2\2\2\u05b4\u05b8"+
		"\5\u0090I\2\u05b5\u05b8\5\u00f8}\2\u05b6\u05b8\5P)\2\u05b7\u05b4\3\2\2"+
		"\2\u05b7\u05b5\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8\u00f7\3\2\2\2\u05b9\u05bb"+
		"\5\u0176\u00bc\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3"+
		"\2\2\2\u05bc\u05bd\7\4\2\2\u05bd\u05be\5\u00fa~\2\u05be\u00f9\3\2\2\2"+
		"\u05bf\u05c5\5\u00fc\177\2\u05c0\u05c1\5\u00fc\177\2\u05c1\u05c2\7\u008d"+
		"\2\2\u05c2\u05c3\5\u00fa~\2\u05c3\u05c5\3\2\2\2\u05c4\u05bf\3\2\2\2\u05c4"+
		"\u05c0\3\2\2\2\u05c5\u00fb\3\2\2\2\u05c6\u05c8\5\u00f0y\2\u05c7\u05c9"+
		"\5\u00fe\u0080\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u00fd\3"+
		"\2\2\2\u05ca\u05cb\5\u0210\u0109\2\u05cb\u05cc\5\u0100\u0081\2\u05cc\u00ff"+
		"\3\2\2\2\u05cd\u05d1\5\u0232\u011a\2\u05ce\u05d1\7\u00a9\2\2\u05cf\u05d1"+
		"\5\u0234\u011b\2\u05d0\u05cd\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05cf\3"+
		"\2\2\2\u05d1\u0101\3\2\2\2\u05d2\u05d4\5\u0176\u00bc\2\u05d3\u05d2\3\2"+
		"\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05d7\5\u0158\u00ad"+
		"\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9"+
		"\7%\2\2\u05d9\u05db\5\u0104\u0083\2\u05da\u05dc\5z>\2\u05db\u05da\3\2"+
		"\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd\u05df\5\u0202\u0102"+
		"\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e1\3\2\2\2\u05e0\u05e2"+
		"\5\u0080A\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2"+
		"\2\u05e3\u05e4\5\u0106\u0084\2\u05e4\u0103\3\2\2\2\u05e5\u05e6\5\u0208"+
		"\u0105\2\u05e6\u0105\3\2\2\2\u05e7\u05eb\7\u0087\2\2\u05e8\u05ea\5\u0108"+
		"\u0085\2\u05e9\u05e8\3\2\2\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb"+
		"\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05ef\7\u008a"+
		"\2\2\u05ef\u0107\3\2\2\2\u05f0\u05f3\5\u0090I\2\u05f1\u05f3\5P)\2\u05f2"+
		"\u05f0\3\2\2\2\u05f2\u05f1\3\2\2\2\u05f3\u0109\3\2\2\2\u05f4\u05f6\5\u0176"+
		"\u00bc\2\u05f5\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\3\2\2\2\u05f7"+
		"\u05f9\5\u0158\u00ad\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fb"+
		"\3\2\2\2\u05fa\u05fc\7\61\2\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2"+
		"\u05fc\u05fd\3\2\2\2\u05fd\u05fe\7&\2\2\u05fe\u0600\5\u010c\u0087\2\u05ff"+
		"\u0601\5z>\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2\2"+
		"\2\u0602\u0604\5\u0202\u0102\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2"+
		"\u0604\u0606\3\2\2\2\u0605\u0607\5\u0080A\2\u0606\u0605\3\2\2\2\u0606"+
		"\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\5\u010e\u0088\2\u0609\u0622"+
		"\3\2\2\2\u060a\u060c\5\u0176\u00bc\2\u060b\u060a\3\2\2\2\u060b\u060c\3"+
		"\2\2\2\u060c\u060e\3\2\2\2\u060d\u060f\5\u0158\u00ad\2\u060e\u060d\3\2"+
		"\2\2\u060e\u060f\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0612\7\61\2\2\u0611"+
		"\u0613\5\u0158\u00ad\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614"+
		"\3\2\2\2\u0614\u0615\7&\2\2\u0615\u0617\5\u010c\u0087\2\u0616\u0618\5"+
		"z>\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a\3\2\2\2\u0619"+
		"\u061b\5\u0202\u0102\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d"+
		"\3\2\2\2\u061c\u061e\5\u0080A\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2"+
		"\2\u061e\u061f\3\2\2\2\u061f\u0620\5\u010e\u0088\2\u0620\u0622\3\2\2\2"+
		"\u0621\u05f5\3\2\2\2\u0621\u060b\3\2\2\2\u0622\u010b\3\2\2\2\u0623\u0624"+
		"\5\u0208\u0105\2\u0624\u010d\3\2\2\2\u0625\u0629\7\u0087\2\2\u0626\u0628"+
		"\5\u0110\u0089\2\u0627\u0626\3\2\2\2\u0628\u062b\3\2\2\2\u0629\u0627\3"+
		"\2\2\2\u0629\u062a\3\2\2\2\u062a\u062c\3\2\2\2\u062b\u0629\3\2\2\2\u062c"+
		"\u062d\7\u008a\2\2\u062d\u010f\3\2\2\2\u062e\u0631\5\u0090I\2\u062f\u0631"+
		"\5P)\2\u0630\u062e\3\2\2\2\u0630\u062f\3\2\2\2\u0631\u0111\3\2\2\2\u0632"+
		"\u0634\5\u0176\u00bc\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636"+
		"\3\2\2\2\u0635\u0637\5\u0158\u00ad\2\u0636\u0635\3\2\2\2\u0636\u0637\3"+
		"\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\7(\2\2\u0639\u063b\5\u0114\u008b"+
		"\2\u063a\u063c\5\u0202\u0102\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2"+
		"\u063c\u063d\3\2\2\2\u063d\u063e\5\u0116\u008c\2\u063e\u0113\3\2\2\2\u063f"+
		"\u0640\5\u0208\u0105\2\u0640\u0115\3\2\2\2\u0641\u0645\7\u0087\2\2\u0642"+
		"\u0644\5\u0118\u008d\2\u0643\u0642\3\2\2\2\u0644\u0647\3\2\2\2\u0645\u0643"+
		"\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0645\3\2\2\2\u0648"+
		"\u0649\7\u008a\2\2\u0649\u0117\3\2\2\2\u064a\u064d\5\u011a\u008e\2\u064b"+
		"\u064d\5P)\2\u064c\u064a\3\2\2\2\u064c\u064b\3\2\2\2\u064d\u0119\3\2\2"+
		"\2\u064e\u0655\5\u011c\u008f\2\u064f\u0655\5\u011e\u0090\2\u0650\u0655"+
		"\5\u0120\u0091\2\u0651\u0655\5\u0122\u0092\2\u0652\u0655\5\u0124\u0093"+
		"\2\u0653\u0655\5\u00c2b\2\u0654\u064e\3\2\2\2\u0654\u064f\3\2\2\2\u0654"+
		"\u0650\3\2\2\2\u0654\u0651\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0653\3\2"+
		"\2\2\u0655\u011b\3\2\2\2\u0656\u0657\5\u00aaV\2\u0657\u0658\5\u00acW\2"+
		"\u0658\u0659\5\u01e2\u00f2\2\u0659\u065a\5\u00b6\\\2\u065a\u011d\3\2\2"+
		"\2\u065b\u065c\5\u00caf\2\u065c\u065e\5\u00ccg\2\u065d\u065f\5z>\2\u065e"+
		"\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0662\5\u00ce"+
		"h\2\u0661\u0663\5\u0080A\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u011f\3\2\2\2\u0664\u0666\5\u0128\u0095\2\u0665\u0667\5z>\2\u0666\u0665"+
		"\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066a\5\u00d4k"+
		"\2\u0669\u066b\7.\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066d"+
		"\3\2\2\2\u066c\u066e\5\u0080A\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2"+
		"\2\u066e\u0679\3\2\2\2\u066f\u0671\5\u0128\u0095\2\u0670\u0672\5z>\2\u0671"+
		"\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\5\u00d4"+
		"k\2\u0674\u0676\7/\2\2\u0675\u0677\5\u0080A\2\u0676\u0675\3\2\2\2\u0676"+
		"\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678\u0664\3\2\2\2\u0678\u066f\3\2"+
		"\2\2\u0679\u0121\3\2\2\2\u067a\u067b\5\u0136\u009c\2\u067b\u067c\5\u0138"+
		"\u009d\2\u067c\u067d\5\u00b6\\\2\u067d\u0123\3\2\2\2\u067e\u0680\5\u0176"+
		"\u00bc\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0682\3\2\2\2\u0681"+
		"\u0683\5\u0158\u00ad\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684"+
		"\3\2\2\2\u0684\u0685\7\62\2\2\u0685\u0687\5\u00c4c\2\u0686\u0688\5\u0202"+
		"\u0102\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068a\3\2\2\2\u0689"+
		"\u068b\5\u00c6d\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u0125"+
		"\3\2\2\2\u068c\u068e\5\u0128\u0095\2\u068d\u068f\5z>\2\u068e\u068d\3\2"+
		"\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0692\5\u00d4k\2\u0691"+
		"\u0693\7.\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\3\2"+
		"\2\2\u0694\u0696\5\u0080A\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696"+
		"\u0697\3\2\2\2\u0697\u0698\5\u012a\u0096\2\u0698\u06a5\3\2\2\2\u0699\u069b"+
		"\5\u0128\u0095\2\u069a\u069c\5z>\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2"+
		"\2\2\u069c\u069d\3\2\2\2\u069d\u069e\5\u00d4k\2\u069e\u06a0\7/\2\2\u069f"+
		"\u06a1\5\u0080A\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2"+
		"\3\2\2\2\u06a2\u06a3\5\u012a\u0096\2\u06a3\u06a5\3\2\2\2\u06a4\u068c\3"+
		"\2\2\2\u06a4\u0699\3\2\2\2\u06a5\u0127\3\2\2\2\u06a6\u06a8\5\u0176\u00bc"+
		"\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06ab"+
		"\5\u0156\u00ac\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\3"+
		"\2\2\2\u06ac\u06be\7\63\2\2\u06ad\u06af\5\u0176\u00bc\2\u06ae\u06ad\3"+
		"\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06b2\5\u0156\u00ac"+
		"\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4"+
		"\7\63\2\2\u06b4\u06be\7\u0094\2\2\u06b5\u06b7\5\u0176\u00bc\2\u06b6\u06b5"+
		"\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06ba\5\u0156\u00ac"+
		"\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc"+
		"\7\63\2\2\u06bc\u06be\7\u0093\2\2\u06bd\u06a7\3\2\2\2\u06bd\u06ae\3\2"+
		"\2\2\u06bd\u06b6\3\2\2\2\u06be\u0129\3\2\2\2\u06bf\u06c0\5\u0096L\2\u06c0"+
		"\u012b\3\2\2\2\u06c1\u06c3\5\u0176\u00bc\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3"+
		"\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\7\64\2\2\u06c5\u06c6\5\u0096"+
		"L\2\u06c6\u012d\3\2\2\2\u06c7\u06c9\5\u0176\u00bc\2\u06c8\u06c7\3\2\2"+
		"\2\u06c8\u06c9\3\2\2\2\u06c9\u06cb\3\2\2\2\u06ca\u06cc\5\u0158\u00ad\2"+
		"\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce"+
		"\7\65\2\2\u06ce\u06d0\5\u01e4\u00f3\2\u06cf\u06d1\5\u0202\u0102\2\u06d0"+
		"\u06cf\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\5\u0130"+
		"\u0099\2\u06d3\u06e0\3\2\2\2\u06d4\u06d6\5\u0176\u00bc\2\u06d5\u06d4\3"+
		"\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7\u06d9\5\u0158\u00ad"+
		"\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06db"+
		"\7\65\2\2\u06db\u06dc\5\u01e4\u00f3\2\u06dc\u06dd\5\u0080A\2\u06dd\u06de"+
		"\5\u0130\u0099\2\u06de\u06e0\3\2\2\2\u06df\u06c8\3\2\2\2\u06df\u06d5\3"+
		"\2\2\2\u06e0\u012f\3\2\2\2\u06e1\u06e5\7\u0087\2\2\u06e2\u06e4\5\u0132"+
		"\u009a\2\u06e3\u06e2\3\2\2\2\u06e4\u06e7\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e5"+
		"\u06e6\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e8\u06e9\7\u008a"+
		"\2\2\u06e9\u0131\3\2\2\2\u06ea\u06ed\5\u0090I\2\u06eb\u06ed\5P)\2\u06ec"+
		"\u06ea\3\2\2\2\u06ec\u06eb\3\2\2\2\u06ed\u0133\3\2\2\2\u06ee\u06ef\5\u0136"+
		"\u009c\2\u06ef\u06f0\5\u0138\u009d\2\u06f0\u06f1\5\u0096L\2\u06f1\u06fb"+
		"\3\2\2\2\u06f2\u06f3\5\u0136\u009c\2\u06f3\u06f4\5\u0138\u009d\2\u06f4"+
		"\u06f5\5\u00aeX\2\u06f5\u06fb\3\2\2\2\u06f6\u06f7\5\u0136\u009c\2\u06f7"+
		"\u06f8\5\u0138\u009d\2\u06f8\u06f9\5\u00b6\\\2\u06f9\u06fb\3\2\2\2\u06fa"+
		"\u06ee\3\2\2\2\u06fa\u06f2\3\2\2\2\u06fa\u06f6\3\2\2\2\u06fb\u0135\3\2"+
		"\2\2\u06fc\u06fe\5\u0176\u00bc\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2"+
		"\2\u06fe\u0700\3\2\2\2\u06ff\u0701\5\u0156\u00ac\2\u0700\u06ff\3\2\2\2"+
		"\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\7\66\2\2\u0703\u0704"+
		"\5\u00d4k\2\u0704\u0137\3\2\2\2\u0705\u0707\5\u021a\u010e\2\u0706\u0708"+
		"\5\u0176\u00bc\2\u0707\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3"+
		"\2\2\2\u0709\u070a\5\u01e0\u00f1\2\u070a\u0139\3\2\2\2\u070b\u070f\5\u013c"+
		"\u009f\2\u070c\u070f\5\u013e\u00a0\2\u070d\u070f\5\u0140\u00a1\2\u070e"+
		"\u070b\3\2\2\2\u070e\u070c\3\2\2\2\u070e\u070d\3\2\2\2\u070f\u013b\3\2"+
		"\2\2\u0710\u0711\7\67\2\2\u0711\u0712\78\2\2\u0712\u0713\5\u0226\u0114"+
		"\2\u0713\u013d\3\2\2\2\u0714\u0715\79\2\2\u0715\u0716\78\2\2\u0716\u0717"+
		"\5\u0226\u0114\2\u0717\u013f\3\2\2\2\u0718\u0719\7:\2\2\u0719\u071a\7"+
		"8\2\2\u071a\u071c\5\u0226\u0114\2\u071b\u071d\5\u0142\u00a2\2\u071c\u071b"+
		"\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u0141\3\2\2\2\u071e\u071f\7\u008e\2"+
		"\2\u071f\u0720\5\u0152\u00aa\2\u0720\u0143\3\2\2\2\u0721\u0722\7;\2\2"+
		"\u0722\u0723\5\u0152\u00aa\2\u0723\u0727\7\u0087\2\2\u0724\u0726\5\u0146"+
		"\u00a4\2\u0725\u0724\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725\3\2\2\2\u0727"+
		"\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729\u0727\3\2\2\2\u072a\u072b\7\u008a"+
		"\2\2\u072b\u0145\3\2\2\2\u072c\u0730\5\u0148\u00a5\2\u072d\u0730\5\u014a"+
		"\u00a6\2\u072e\u0730\5\u014c\u00a7\2\u072f\u072c\3\2\2\2\u072f\u072d\3"+
		"\2\2\2\u072f\u072e\3\2\2\2\u0730\u0147\3\2\2\2\u0731\u0732\7<\2\2\u0732"+
		"\u0733\7\u008e\2\2\u0733\u0738\5\u0150\u00a9\2\u0734\u0735\7=\2\2\u0735"+
		"\u0736\7\u008e\2\2\u0736\u0738\5\u0150\u00a9\2\u0737\u0731\3\2\2\2\u0737"+
		"\u0734\3\2\2\2\u0738\u0149\3\2\2\2\u0739\u073a\7>\2\2\u073a\u073b\7\u008e"+
		"\2\2\u073b\u073c\5\u0234\u011b\2\u073c\u014b\3\2\2\2\u073d\u073e\7?\2"+
		"\2\u073e\u073f\7\u008e\2\2\u073f\u0740\5\u014e\u00a8\2\u0740\u014d\3\2"+
		"\2\2\u0741\u0742\t\4\2\2\u0742\u014f\3\2\2\2\u0743\u0748\5\u0152\u00aa"+
		"\2\u0744\u0745\7\u008d\2\2\u0745\u0747\5\u0152\u00aa\2\u0746\u0744\3\2"+
		"\2\2\u0747\u074a\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u0151\3\2\2\2\u074a\u0748\3\2\2\2\u074b\u074c\5\u0208\u0105\2\u074c\u0153"+
		"\3\2\2\2\u074d\u0766\7&\2\2\u074e\u0766\7C\2\2\u074f\u0766\7D\2\2\u0750"+
		"\u0766\7\61\2\2\u0751\u0766\7:\2\2\u0752\u0766\7E\2\2\u0753\u0766\7F\2"+
		"\2\u0754\u0766\7G\2\2\u0755\u0766\79\2\2\u0756\u0766\7\67\2\2\u0757\u0766"+
		"\7H\2\2\u0758\u0766\7I\2\2\u0759\u0766\7J\2\2\u075a\u075b\7J\2\2\u075b"+
		"\u075c\7\u0088\2\2\u075c\u075d\7K\2\2\u075d\u0766\7\u008b\2\2\u075e\u075f"+
		"\7J\2\2\u075f\u0760\7\u0088\2\2\u0760\u0761\7L\2\2\u0761\u0766\7\u008b"+
		"\2\2\u0762\u0766\7M\2\2\u0763\u0766\5\u0158\u00ad\2\u0764\u0766\5\u015a"+
		"\u00ae\2\u0765\u074d\3\2\2\2\u0765\u074e\3\2\2\2\u0765\u074f\3\2\2\2\u0765"+
		"\u0750\3\2\2\2\u0765\u0751\3\2\2\2\u0765\u0752\3\2\2\2\u0765\u0753\3\2"+
		"\2\2\u0765\u0754\3\2\2\2\u0765\u0755\3\2\2\2\u0765\u0756\3\2\2\2\u0765"+
		"\u0757\3\2\2\2\u0765\u0758\3\2\2\2\u0765\u0759\3\2\2\2\u0765\u075a\3\2"+
		"\2\2\u0765\u075e\3\2\2\2\u0765\u0762\3\2\2\2\u0765\u0763\3\2\2\2\u0765"+
		"\u0764\3\2\2\2\u0766\u0155\3\2\2\2\u0767\u0769\5\u0154\u00ab\2\u0768\u0767"+
		"\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u0768\3\2\2\2\u076a\u076b\3\2\2\2\u076b"+
		"\u0157\3\2\2\2\u076c\u0786\7N\2\2\u076d\u076e\7N\2\2\u076e\u076f\7\u0088"+
		"\2\2\u076f\u0770\7+\2\2\u0770\u0786\7\u008b\2\2\u0771\u0786\7O\2\2\u0772"+
		"\u0773\7O\2\2\u0773\u0774\7\u0088\2\2\u0774\u0775\7+\2\2\u0775\u0786\7"+
		"\u008b\2\2\u0776\u0786\7P\2\2\u0777\u0778\7P\2\2\u0778\u0779\7\u0088\2"+
		"\2\u0779\u077a\7+\2\2\u077a\u0786\7\u008b\2\2\u077b\u0786\7Q\2\2\u077c"+
		"\u077d\7Q\2\2\u077d\u077e\7\u0088\2\2\u077e\u077f\7+\2\2\u077f\u0786\7"+
		"\u008b\2\2\u0780\u0786\7R\2\2\u0781\u0782\7R\2\2\u0782\u0783\7\u0088\2"+
		"\2\u0783\u0784\7+\2\2\u0784\u0786\7\u008b\2\2\u0785\u076c\3\2\2\2\u0785"+
		"\u076d\3\2\2\2\u0785\u0771\3\2\2\2\u0785\u0772\3\2\2\2\u0785\u0776\3\2"+
		"\2\2\u0785\u0777\3\2\2\2\u0785\u077b\3\2\2\2\u0785\u077c\3\2\2\2\u0785"+
		"\u0780\3\2\2\2\u0785\u0781\3\2\2\2\u0786\u0159\3\2\2\2\u0787\u0788\t\5"+
		"\2\2\u0788\u015b\3\2\2\2\u0789\u078a\b\u00af\1\2\u078a\u078c\5\u015e\u00b0"+
		"\2\u078b\u078d\5\u01e2\u00f2\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2"+
		"\u078d\u079d\3\2\2\2\u078e\u0790\5\u0160\u00b1\2\u078f\u0791\5\u01e2\u00f2"+
		"\2\u0790\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u079d\3\2\2\2\u0792\u079d"+
		"\5\u0162\u00b2\2\u0793\u0795\5\u0164\u00b3\2\u0794\u0796\5\u01e2\u00f2"+
		"\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u079d\3\2\2\2\u0797\u079d"+
		"\5\u016a\u00b6\2\u0798\u079d\5\u016c\u00b7\2\u0799\u079a\7U\2\2\u079a"+
		"\u079d\5\u01e0\u00f1\2\u079b\u079d\5\u016e\u00b8\2\u079c\u0789\3\2\2\2"+
		"\u079c\u078e\3\2\2\2\u079c\u0792\3\2\2\2\u079c\u0793\3\2\2\2\u079c\u0797"+
		"\3\2\2\2\u079c\u0798\3\2\2\2\u079c\u0799\3\2\2\2\u079c\u079b\3\2\2\2\u079d"+
		"\u07a3\3\2\2\2\u079e\u079f\f\4\2\2\u079f\u07a0\7V\2\2\u07a0\u07a2\5\u01e0"+
		"\u00f1\2\u07a1\u079e\3\2\2\2\u07a2\u07a5\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3"+
		"\u07a4\3\2\2\2\u07a4\u015d\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a6\u07a7\7\u0092"+
		"\2\2\u07a7\u015f\3\2\2\2\u07a8\u07a9\5\u0208\u0105\2\u07a9\u0161\3\2\2"+
		"\2\u07aa\u07ab\7\b\2\2\u07ab\u07af\5\u015c\u00af\2\u07ac\u07ad\7\7\2\2"+
		"\u07ad\u07af\5\u015c\u00af\2\u07ae\u07aa\3\2\2\2\u07ae\u07ac\3\2\2\2\u07af"+
		"\u0163\3\2\2\2\u07b0\u07b2\7\u0088\2\2\u07b1\u07b3\5\u0166\u00b4\2\u07b2"+
		"\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5\7\u008b"+
		"\2\2\u07b5\u0165\3\2\2\2\u07b6\u07bb\5\u0168\u00b5\2\u07b7\u07b8\7\u008d"+
		"\2\2\u07b8\u07ba\5\u0168\u00b5\2\u07b9\u07b7\3\2\2\2\u07ba\u07bd\3\2\2"+
		"\2\u07bb\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u0167\3\2\2\2\u07bd\u07bb"+
		"\3\2\2\2\u07be\u07bf\5\u015c\u00af\2\u07bf\u0169\3\2\2\2\u07c0\u07c2\5"+
		"\u01e4\u00f3\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c3\3\2"+
		"\2\2\u07c3\u07c4\7\u0086\2\2\u07c4\u07c6\5\u00f0y\2\u07c5\u07c7\5\u0164"+
		"\u00b3\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u016b\3\2\2\2\u07c8"+
		"\u07c9\5\u0160\u00b1\2\u07c9\u07ca\7\u0094\2\2\u07ca\u016d\3\2\2\2\u07cb"+
		"\u07cc\5\u017e\u00c0\2\u07cc\u016f\3\2\2\2\u07cd\u07ce\7\u0095\2\2\u07ce"+
		"\u07d0\5\u0172\u00ba\2\u07cf\u07d1\5\u0174\u00bb\2\u07d0\u07cf\3\2\2\2"+
		"\u07d0\u07d1\3\2\2\2\u07d1\u0171\3\2\2\2\u07d2\u07d3\5\u0208\u0105\2\u07d3"+
		"\u0173\3\2\2\2\u07d4\u07d5\7\u0088\2\2\u07d5\u07d6\5\u0178\u00bd\2\u07d6"+
		"\u07d7\7\u008b\2\2\u07d7\u0175\3\2\2\2\u07d8\u07da\5\u0170\u00b9\2\u07d9"+
		"\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2"+
		"\2\2\u07dc\u0177\3\2\2\2\u07dd\u07df\5\u017a\u00be\2\u07de\u07dd\3\2\2"+
		"\2\u07df\u07e2\3\2\2\2\u07e0\u07de\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u0179"+
		"\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e3\u07e4\7\u0088\2\2\u07e4\u07e5\5\u0178"+
		"\u00bd\2\u07e5\u07e6\7\u008b\2\2\u07e6\u07f5\3\2\2\2\u07e7\u07e8\7\u0089"+
		"\2\2\u07e8\u07e9\5\u0178\u00bd\2\u07e9\u07ea\7\u008c\2\2\u07ea\u07f5\3"+
		"\2\2\2\u07eb\u07ec\7\u0087\2\2\u07ec\u07ed\5\u0178\u00bd\2\u07ed\u07ee"+
		"\7\u008a\2\2\u07ee\u07f5\3\2\2\2\u07ef\u07f5\5\u020a\u0106\2\u07f0\u07f5"+
		"\5\u0230\u0119\2\u07f1\u07f5\5\u0226\u0114\2\u07f2\u07f5\7\u0084\2\2\u07f3"+
		"\u07f5\5\u017c\u00bf\2\u07f4\u07e3\3\2\2\2\u07f4\u07e7\3\2\2\2\u07f4\u07eb"+
		"\3\2\2\2\u07f4\u07ef\3\2\2\2\u07f4\u07f0\3\2\2\2\u07f4\u07f1\3\2\2\2\u07f4"+
		"\u07f2\3\2\2\2\u07f4\u07f3\3\2\2\2\u07f5\u017b\3\2\2\2\u07f6\u07fd\t\6"+
		"\2\2\u07f7\u07fd\5\u021a\u010e\2\u07f8\u07f9\6\u00bf\6\2\u07f9\u07fd\7"+
		"\u0096\2\2\u07fa\u07fb\6\u00bf\7\2\u07fb\u07fd\7\u0093\2\2\u07fc\u07f6"+
		"\3\2\2\2\u07fc\u07f7\3\2\2\2\u07fc\u07f8\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd"+
		"\u017d\3\2\2\2\u07fe\u0800\5\u0186\u00c4\2\u07ff\u07fe\3\2\2\2\u07ff\u0800"+
		"\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0803\5\u0182\u00c2\2\u0802\u0804\5"+
		"\u018a\u00c6\2\u0803\u0802\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u017f\3\2"+
		"\2\2\u0805\u080a\5\u017e\u00c0\2\u0806\u0807\7\u008d\2\2\u0807\u0809\5"+
		"\u017e\u00c0\2\u0808\u0806\3\2\2\2\u0809\u080c\3\2\2\2\u080a\u0808\3\2"+
		"\2\2\u080a\u080b\3\2\2\2\u080b\u0181\3\2\2\2\u080c\u080a\3\2\2\2\u080d"+
		"\u080e\5\u0222\u0112\2\u080e\u080f\5\u01d0\u00e9\2\u080f\u0813\3\2\2\2"+
		"\u0810\u0813\5\u01d0\u00e9\2\u0811\u0813\5\u0184\u00c3\2\u0812\u080d\3"+
		"\2\2\2\u0812\u0810\3\2\2\2\u0812\u0811\3\2\2\2\u0813\u0183\3\2\2\2\u0814"+
		"\u0815\7\u0096\2\2\u0815\u0816\5\u0208\u0105\2\u0816\u0185\3\2\2\2\u0817"+
		"\u0818\7Y\2\2\u0818\u081d\7\u0094\2\2\u0819\u081a\7Y\2\2\u081a\u081d\7"+
		"\u0093\2\2\u081b\u081d\7Y\2\2\u081c\u0817\3\2\2\2\u081c\u0819\3\2\2\2"+
		"\u081c\u081b\3\2\2\2\u081d\u0187\3\2\2\2\u081e\u081f\5\u0220\u0111\2\u081f"+
		"\u0820\5\u0182\u00c2\2\u0820\u082f\3\2\2\2\u0821\u0823\5\u0210\u0109\2"+
		"\u0822\u0824\5\u0186\u00c4\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824"+
		"\u0825\3\2\2\2\u0825\u0826\5\u0182\u00c2\2\u0826\u082f\3\2\2\2\u0827\u0829"+
		"\5\u018c\u00c7\2\u0828\u082a\5\u0186\u00c4\2\u0829\u0828\3\2\2\2\u0829"+
		"\u082a\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082c\5\u0182\u00c2\2\u082c\u082f"+
		"\3\2\2\2\u082d\u082f\5\u018e\u00c8\2\u082e\u081e\3\2\2\2\u082e\u0821\3"+
		"\2\2\2\u082e\u0827\3\2\2\2\u082e\u082d\3\2\2\2\u082f\u0189\3\2\2\2\u0830"+
		"\u0832\5\u0188\u00c5\2\u0831\u0830\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0831"+
		"\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u018b\3\2\2\2\u0835\u0837\7\u0094\2"+
		"\2\u0836\u0838\5\u0186\u00c4\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2"+
		"\u0838\u0839\3\2\2\2\u0839\u083a\5\u017e\u00c0\2\u083a\u083b\7\u008e\2"+
		"\2\u083b\u018d\3\2\2\2\u083c\u083d\7U\2\2\u083d\u0847\5\u01e0\u00f1\2"+
		"\u083e\u083f\7V\2\2\u083f\u0847\5\u01e0\u00f1\2\u0840\u0841\7V\2\2\u0841"+
		"\u0842\7\u0094\2\2\u0842\u0847\5\u01e0\u00f1\2\u0843\u0844\7V\2\2\u0844"+
		"\u0845\7\u0093\2\2\u0845\u0847\5\u01e0\u00f1\2\u0846\u083c\3\2\2\2\u0846"+
		"\u083e\3\2\2\2\u0846\u0840\3\2\2\2\u0846\u0843\3\2\2\2\u0847\u018f\3\2"+
		"\2\2\u0848\u084a\5\u0208\u0105\2\u0849\u084b\5\u008aF\2\u084a\u0849\3"+
		"\2\2\2\u084a\u084b\3\2\2\2\u084b\u0857\3\2\2\2\u084c\u0857\5\u0192\u00ca"+
		"\2\u084d\u0857\5\u01a2\u00d2\2\u084e\u0857\5\u01a4\u00d3\2\u084f\u0857"+
		"\5\u01ac\u00d7\2\u0850\u0857\5\u01c4\u00e3\2\u0851\u0857\5\u01c6\u00e4"+
		"\2\u0852\u0857\5\u01c2\u00e2\2\u0853\u0857\5\u01ca\u00e6\2\u0854\u0857"+
		"\5\u01cc\u00e7\2\u0855\u0857\5\u01ce\u00e8\2\u0856\u0848\3\2\2\2\u0856"+
		"\u084c\3\2\2\2\u0856\u084d\3\2\2\2\u0856\u084e\3\2\2\2\u0856\u084f\3\2"+
		"\2\2\u0856\u0850\3\2\2\2\u0856\u0851\3\2\2\2\u0856\u0852\3\2\2\2\u0856"+
		"\u0853\3\2\2\2\u0856\u0854\3\2\2\2\u0856\u0855\3\2\2\2\u0857\u0191\3\2"+
		"\2\2\u0858\u0861\5\u0230\u0119\2\u0859\u0861\5\u0194\u00cb\2\u085a\u0861"+
		"\5\u019a\u00ce\2\u085b\u0861\7Z\2\2\u085c\u0861\7[\2\2\u085d\u0861\7\\"+
		"\2\2\u085e\u0861\7]\2\2\u085f\u0861\7^\2\2\u0860\u0858\3\2\2\2\u0860\u0859"+
		"\3\2\2\2\u0860\u085a\3\2\2\2\u0860\u085b\3\2\2\2\u0860\u085c\3\2\2\2\u0860"+
		"\u085d\3\2\2\2\u0860\u085e\3\2\2\2\u0860\u085f\3\2\2\2\u0861\u0193\3\2"+
		"\2\2\u0862\u0864\7\u0089\2\2\u0863\u0865\5\u0196\u00cc\2\u0864\u0863\3"+
		"\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\7\u008c\2\2"+
		"\u0867\u0195\3\2\2\2\u0868\u086a\5\u0198\u00cd\2\u0869\u086b\7\u008d\2"+
		"\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u0871\3\2\2\2\u086c\u086d"+
		"\5\u0198\u00cd\2\u086d\u086e\7\u008d\2\2\u086e\u086f\5\u0196\u00cc\2\u086f"+
		"\u0871\3\2\2\2\u0870\u0868\3\2\2\2\u0870\u086c\3\2\2\2\u0871\u0197\3\2"+
		"\2\2\u0872\u0873\5\u017e\u00c0\2\u0873\u0199\3\2\2\2\u0874\u0875\7\u0089"+
		"\2\2\u0875\u0876\5\u019c\u00cf\2\u0876\u0877\7\u008c\2\2\u0877\u087c\3"+
		"\2\2\2\u0878\u0879\7\u0089\2\2\u0879\u087a\7\u008e\2\2\u087a\u087c\7\u008c"+
		"\2\2\u087b\u0874\3\2\2\2\u087b\u0878\3\2\2\2\u087c\u019b\3\2\2\2\u087d"+
		"\u087f\5\u019e\u00d0\2\u087e\u0880\7\u008d\2\2\u087f\u087e\3\2\2\2\u087f"+
		"\u0880\3\2\2\2\u0880\u0886\3\2\2\2\u0881\u0882\5\u019e\u00d0\2\u0882\u0883"+
		"\7\u008d\2\2\u0883\u0884\5\u019c\u00cf\2\u0884\u0886\3\2\2\2\u0885\u087d"+
		"\3\2\2\2\u0885\u0881\3\2\2\2\u0886\u019d\3\2\2\2\u0887\u0888\5\u017e\u00c0"+
		"\2\u0888\u0889\7\u008e\2\2\u0889\u088a\5\u017e\u00c0\2\u088a\u019f\3\2"+
		"\2\2\u088b\u088c\7_\2\2\u088c\u088d\7\u0088\2\2\u088d\u088e\7`\2\2\u088e"+
		"\u088f\7\u008e\2\2\u088f\u0890\5\u017e\u00c0\2\u0890\u0891\7\u008d\2\2"+
		"\u0891\u0892\7a\2\2\u0892\u0893\7\u008e\2\2\u0893\u0894\5\u017e\u00c0"+
		"\2\u0894\u0895\7\u008d\2\2\u0895\u0896\7b\2\2\u0896\u0897\7\u008e\2\2"+
		"\u0897\u0898\5\u017e\u00c0\2\u0898\u0899\7\u008d\2\2\u0899\u089a\7c\2"+
		"\2\u089a\u089b\7\u008e\2\2\u089b\u089c\5\u017e\u00c0\2\u089c\u089d\7\u008b"+
		"\2\2\u089d\u08ad\3\2\2\2\u089e\u089f\7d\2\2\u089f\u08a0\7\u0088\2\2\u08a0"+
		"\u08a1\7e\2\2\u08a1\u08a2\7\u008e\2\2\u08a2\u08a3\5\u017e\u00c0\2\u08a3"+
		"\u08a4\7\u008b\2\2\u08a4\u08ad\3\2\2\2\u08a5\u08a6\7f\2\2\u08a6\u08a7"+
		"\7\u0088\2\2\u08a7\u08a8\7e\2\2\u08a8\u08a9\7\u008e\2\2\u08a9\u08aa\5"+
		"\u017e\u00c0\2\u08aa\u08ab\7\u008b\2\2\u08ab\u08ad\3\2\2\2\u08ac\u088b"+
		"\3\2\2\2\u08ac\u089e\3\2\2\2\u08ac\u08a5\3\2\2\2\u08ad\u01a1\3\2\2\2\u08ae"+
		"\u08c2\7g\2\2\u08af\u08b0\7g\2\2\u08b0\u08b1\7\u0086\2\2\u08b1\u08c2\5"+
		"\u0208\u0105\2\u08b2\u08b3\7g\2\2\u08b3\u08b4\7\u0089\2\2\u08b4\u08b5"+
		"\5\u0180\u00c1\2\u08b5\u08b6\7\u008c\2\2\u08b6\u08c2\3\2\2\2\u08b7\u08b8"+
		"\7g\2\2\u08b8\u08b9\7\u0086\2\2\u08b9\u08c2\7\63\2\2\u08ba\u08c2\7h\2"+
		"\2\u08bb\u08bc\7h\2\2\u08bc\u08bd\7\u0086\2\2\u08bd\u08c2\5\u0208\u0105"+
		"\2\u08be\u08bf\7h\2\2\u08bf\u08c0\7\u0086\2\2\u08c0\u08c2\7\63\2\2\u08c1"+
		"\u08ae\3\2\2\2\u08c1\u08af\3\2\2\2\u08c1\u08b2\3\2\2\2\u08c1\u08b7\3\2"+
		"\2\2\u08c1\u08ba\3\2\2\2\u08c1\u08bb\3\2\2\2\u08c1\u08be\3\2\2\2\u08c2"+
		"\u01a3\3\2\2\2\u08c3\u08c7\5\u01a6\u00d4\2\u08c4\u08c7\5\u01a8\u00d5\2"+
		"\u08c5\u08c7\5\u01aa\u00d6\2\u08c6\u08c3\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c6"+
		"\u08c5\3\2\2\2\u08c7\u01a5\3\2\2\2\u08c8\u08c9\7i\2\2\u08c9\u08ca\7\u0086"+
		"\2\2\u08ca\u08cb\5\u0208\u0105\2\u08cb\u01a7\3\2\2\2\u08cc\u08cd\7i\2"+
		"\2\u08cd\u08ce\7\u0089\2\2\u08ce\u08cf\5\u017e\u00c0\2\u08cf\u08d0\7\u008c"+
		"\2\2\u08d0\u01a9\3\2\2\2\u08d1\u08d2\7i\2\2\u08d2\u08d3\7\u0086\2\2\u08d3"+
		"\u08d4\7\63\2\2\u08d4\u01ab\3\2\2\2\u08d5\u08d7\7\u0087\2\2\u08d6\u08d8"+
		"\5\u01ae\u00d8\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08da\3"+
		"\2\2\2\u08d9\u08db\5\6\4\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2\2\2\u08db"+
		"\u08dc\3\2\2\2\u08dc\u08dd\7\u008a\2\2\u08dd\u01ad\3\2\2\2\u08de\u08e0"+
		"\5\u01ba\u00de\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\3"+
		"\2\2\2\u08e1\u08e3\5\u01b0\u00d9\2\u08e2\u08e4\7.\2\2\u08e3\u08e2\3\2"+
		"\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e6\3\2\2\2\u08e5\u08e7\5\u00d0i\2\u08e6"+
		"\u08e5\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\7\5"+
		"\2\2\u08e9\u08ee\3\2\2\2\u08ea\u08eb\5\u01ba\u00de\2\u08eb\u08ec\7\5\2"+
		"\2\u08ec\u08ee\3\2\2\2\u08ed\u08df\3\2\2\2\u08ed\u08ea\3\2\2\2\u08ee\u01af"+
		"\3\2\2\2\u08ef\u08f0\7\u0088\2\2\u08f0\u08f7\7\u008b\2\2\u08f1\u08f2\7"+
		"\u0088\2\2\u08f2\u08f3\5\u01b4\u00db\2\u08f3\u08f4\7\u008b\2\2\u08f4\u08f7"+
		"\3\2\2\2\u08f5\u08f7\5\u01b2\u00da\2\u08f6\u08ef\3\2\2\2\u08f6\u08f1\3"+
		"\2\2\2\u08f6\u08f5\3\2\2\2\u08f7\u01b1\3\2\2\2\u08f8\u08fd\5\u0208\u0105"+
		"\2\u08f9\u08fa\7\u008d\2\2\u08fa\u08fc\5\u0208\u0105\2\u08fb\u08f9\3\2"+
		"\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe"+
		"\u01b3\3\2\2\2\u08ff\u08fd\3\2\2\2\u0900\u0905\5\u01b6\u00dc\2\u0901\u0902"+
		"\7\u008d\2\2\u0902\u0904\5\u01b6\u00dc\2\u0903\u0901\3\2\2\2\u0904\u0907"+
		"\3\2\2\2\u0905\u0903\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u01b5\3\2\2\2\u0907"+
		"\u0905\3\2\2\2\u0908\u090a\5\u01b8\u00dd\2\u0909\u090b\5\u01e2\u00f2\2"+
		"\u090a\u0909\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u0911\3\2\2\2\u090c\u090d"+
		"\5\u01b8\u00dd\2\u090d\u090e\5\u01e2\u00f2\2\u090e\u090f\5\u021c\u010f"+
		"\2\u090f\u0911\3\2\2\2\u0910\u0908\3\2\2\2\u0910\u090c\3\2\2\2\u0911\u01b7"+
		"\3\2\2\2\u0912\u0913\5\u020a\u0106\2\u0913\u01b9\3\2\2\2\u0914\u0915\7"+
		"\u0089\2\2\u0915\u0916\5\u01bc\u00df\2\u0916\u0917\7\u008c\2\2\u0917\u01bb"+
		"\3\2\2\2\u0918\u091d\5\u01be\u00e0\2\u0919\u091a\7\u008d\2\2\u091a\u091c"+
		"\5\u01be\u00e0\2\u091b\u0919\3\2\2\2\u091c\u091f\3\2\2\2\u091d\u091b\3"+
		"\2\2\2\u091d\u091e\3\2\2\2\u091e\u01bd\3\2\2\2\u091f\u091d\3\2\2\2\u0920"+
		"\u0922\5\u01c0\u00e1\2\u0921\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923"+
		"\3\2\2\2\u0923\u0924\5\u017e\u00c0\2\u0924\u01bf\3\2\2\2\u0925\u0926\t"+
		"\7\2\2\u0926\u01c1\3\2\2\2\u0927\u0928\7\u0086\2\2\u0928\u0929\5\u020a"+
		"\u0106\2\u0929\u01c3\3\2\2\2\u092a\u092b\7\u0088\2\2\u092b\u092c\5\u017e"+
		"\u00c0\2\u092c\u092d\7\u008b\2\2\u092d\u01c5\3\2\2\2\u092e\u092f\7\u0088"+
		"\2\2\u092f\u093b\7\u008b\2\2\u0930\u0931\7\u0088\2\2\u0931\u0934\5\u01c8"+
		"\u00e5\2\u0932\u0933\7\u008d\2\2\u0933\u0935\5\u01c8\u00e5\2\u0934\u0932"+
		"\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0934\3\2\2\2\u0936\u0937\3\2\2\2\u0937"+
		"\u0938\3\2\2\2\u0938\u0939\7\u008b\2\2\u0939\u093b\3\2\2\2\u093a\u092e"+
		"\3\2\2\2\u093a\u0930\3\2\2\2\u093b\u01c7\3\2\2\2\u093c\u0942\5\u017e\u00c0"+
		"\2\u093d\u093e\5\u020a\u0106\2\u093e\u093f\7\u008e\2\2\u093f\u0940\5\u017e"+
		"\u00c0\2\u0940\u0942\3\2\2\2\u0941\u093c\3\2\2\2\u0941\u093d\3\2\2\2\u0942"+
		"\u01c9\3\2\2\2\u0943\u0944\7\u0092\2\2\u0944\u01cb\3\2\2\2\u0945\u0946"+
		"\7l\2\2\u0946\u0947\7\u0088\2\2\u0947\u0948\5\u017e\u00c0\2\u0948\u0949"+
		"\7\u008b\2\2\u0949\u0957\3\2\2\2\u094a\u094b\7l\2\2\u094b\u094c\7\u0088"+
		"\2\2\u094c\u094d\7m\2\2\u094d\u094e\5\u017e\u00c0\2\u094e\u094f\7\u008b"+
		"\2\2\u094f\u0957\3\2\2\2\u0950\u0951\7l\2\2\u0951\u0952\7\u0088\2\2\u0952"+
		"\u0953\7n\2\2\u0953\u0954\5\u017e\u00c0\2\u0954\u0955\7\u008b\2\2\u0955"+
		"\u0957\3\2\2\2\u0956\u0945\3\2\2\2\u0956\u094a\3\2\2\2\u0956\u0950\3\2"+
		"\2\2\u0957\u01cd\3\2\2\2\u0958\u0959\7o\2\2\u0959\u095a\7\u0088\2\2\u095a"+
		"\u095b\5\u017e\u00c0\2\u095b\u095c\7\u008b\2\2\u095c\u01cf\3\2\2\2\u095d"+
		"\u095e\b\u00e9\1\2\u095e\u0961\5\u0190\u00c9\2\u095f\u0961\5\u01de\u00f0"+
		"\2\u0960\u095d\3\2\2\2\u0960\u095f\3\2\2\2\u0961\u0994\3\2\2\2\u0962\u0963"+
		"\f\16\2\2\u0963\u0993\5\u0224\u0113\2\u0964\u0965\f\r\2\2\u0965\u0993"+
		"\5\u01d2\u00ea\2\u0966\u0968\f\f\2\2\u0967\u0969\5\u01d2\u00ea\2\u0968"+
		"\u0967\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u0993\5\u01d8"+
		"\u00ed\2\u096b\u096c\f\13\2\2\u096c\u096d\7\u0086\2\2\u096d\u0993\7\63"+
		"\2\2\u096e\u096f\f\n\2\2\u096f\u0970\7\u0086\2\2\u0970\u0971\7\63\2\2"+
		"\u0971\u0972\7\u0088\2\2\u0972\u0973\5\u01da\u00ee\2\u0973\u0974\7\u008b"+
		"\2\2\u0974\u0993\3\2\2\2\u0975\u0976\f\t\2\2\u0976\u0977\7\u0086\2\2\u0977"+
		"\u0993\7\u00a6\2\2\u0978\u0979\f\b\2\2\u0979\u097a\7\u0086\2\2\u097a\u097c"+
		"\5\u0208\u0105\2\u097b\u097d\5\u008aF\2\u097c\u097b\3\2\2\2\u097c\u097d"+
		"\3\2\2\2\u097d\u0993\3\2\2\2\u097e\u097f\f\7\2\2\u097f\u0980\7\u0086\2"+
		"\2\u0980\u0981\5\u0208\u0105\2\u0981\u0982\7\u0088\2\2\u0982\u0983\5\u01da"+
		"\u00ee\2\u0983\u0984\7\u008b\2\2\u0984\u0993\3\2\2\2\u0985\u0986\f\6\2"+
		"\2\u0986\u0987\7\u0088\2\2\u0987\u0988\5\u01da\u00ee\2\u0988\u0989\7\u008b"+
		"\2\2\u0989\u0993\3\2\2\2\u098a\u098b\f\5\2\2\u098b\u098c\7\u0086\2\2\u098c"+
		"\u0993\7g\2\2\u098d\u098e\f\3\2\2\u098e\u098f\7\u0089\2\2\u098f\u0990"+
		"\5\u0180\u00c1\2\u0990\u0991\7\u008c\2\2\u0991\u0993\3\2\2\2\u0992\u0962"+
		"\3\2\2\2\u0992\u0964\3\2\2\2\u0992\u0966\3\2\2\2\u0992\u096b\3\2\2\2\u0992"+
		"\u096e\3\2\2\2\u0992\u0975\3\2\2\2\u0992\u0978\3\2\2\2\u0992\u097e\3\2"+
		"\2\2\u0992\u0985\3\2\2\2\u0992\u098a\3\2\2\2\u0992\u098d\3\2\2\2\u0993"+
		"\u0996\3\2\2\2\u0994\u0992\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u01d1\3\2"+
		"\2\2\u0996\u0994\3\2\2\2\u0997\u0998\7\u0088\2\2\u0998\u099e\7\u008b\2"+
		"\2\u0999\u099a\7\u0088\2\2\u099a\u099b\5\u01d4\u00eb\2\u099b\u099c\7\u008b"+
		"\2\2\u099c\u099e\3\2\2\2\u099d\u0997\3\2\2\2\u099d\u0999\3\2\2\2\u099e"+
		"\u01d3\3\2\2\2\u099f\u09a4\5\u01d6\u00ec\2\u09a0\u09a1\7\u008d\2\2\u09a1"+
		"\u09a3\5\u01d6\u00ec\2\u09a2\u09a0\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u09a3\u09a6\3\2\2\2\u09a4\u09a2\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u01d5"+
		"\3\2\2\2\u09a6\u09a4\3\2\2\2\u09a7\u09b2\5\u017e\u00c0\2\u09a8\u09a9\5"+
		"\u020a\u0106\2\u09a9\u09aa\7\u008e\2\2\u09aa\u09ab\5\u017e\u00c0\2\u09ab"+
		"\u09b2\3\2\2\2\u09ac\u09b2\5\u0226\u0114\2\u09ad\u09ae\5\u020a\u0106\2"+
		"\u09ae\u09af\7\u008e\2\2\u09af\u09b0\5\u0226\u0114\2\u09b0\u09b2\3\2\2"+
		"\2\u09b1\u09a7\3\2\2\2\u09b1\u09a8\3\2\2\2\u09b1\u09ac\3\2\2\2\u09b1\u09ad"+
		"\3\2\2\2\u09b2\u01d7\3\2\2\2\u09b3\u09b4\5\u01ac\u00d7\2\u09b4\u01d9\3"+
		"\2\2\2\u09b5\u09b9\5\u01dc\u00ef\2\u09b6\u09b8\5\u01dc\u00ef\2\u09b7\u09b6"+
		"\3\2\2\2\u09b8\u09bb\3\2\2\2\u09b9\u09b7\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba"+
		"\u01db\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bc\u09bd\5\u020a\u0106\2\u09bd\u09be"+
		"\7\u008e\2\2\u09be\u01dd\3\2\2\2\u09bf\u09c0\7p\2\2\u09c0\u09c1\7\u0088"+
		"\2\2\u09c1\u09c2\7q\2\2\u09c2\u09c3\7\u008e\2\2\u09c3\u09c4\5\u017e\u00c0"+
		"\2\u09c4\u09c5\7\u008b\2\2\u09c5\u01df\3\2\2\2\u09c6\u09c7\b\u00f1\1\2"+
		"\u09c7\u09d0\5\u01fa\u00fe\2\u09c8\u09d0\5\u01fc\u00ff\2\u09c9\u09d0\5"+
		"\u01f0\u00f9\2\u09ca\u09d0\5\u01e4\u00f3\2\u09cb\u09d0\5\u01e8\u00f5\2"+
		"\u09cc\u09d0\5\u01fe\u0100\2\u09cd\u09d0\7t\2\2\u09ce\u09d0\7h\2\2\u09cf"+
		"\u09c6\3\2\2\2\u09cf\u09c8\3\2\2\2\u09cf\u09c9\3\2\2\2\u09cf\u09ca\3\2"+
		"\2\2\u09cf\u09cb\3\2\2\2\u09cf\u09cc\3\2\2\2\u09cf\u09cd\3\2\2\2\u09cf"+
		"\u09ce\3\2\2\2\u09d0\u09dd\3\2\2\2\u09d1\u09d2\f\t\2\2\u09d2\u09dc\7\u0094"+
		"\2\2\u09d3\u09d4\f\b\2\2\u09d4\u09dc\7\u0093\2\2\u09d5\u09d6\f\6\2\2\u09d6"+
		"\u09d7\7\u0086\2\2\u09d7\u09dc\7r\2\2\u09d8\u09d9\f\5\2\2\u09d9\u09da"+
		"\7\u0086\2\2\u09da\u09dc\7s\2\2\u09db\u09d1\3\2\2\2\u09db\u09d3\3\2\2"+
		"\2\u09db\u09d5\3\2\2\2\u09db\u09d8\3\2\2\2\u09dc\u09df\3\2\2\2\u09dd\u09db"+
		"\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u01e1\3\2\2\2\u09df\u09dd\3\2\2\2\u09e0"+
		"\u09e2\7\u008e\2\2\u09e1\u09e3\5\u0176\u00bc\2\u09e2\u09e1\3\2\2\2\u09e2"+
		"\u09e3\3\2\2\2\u09e3\u09e5\3\2\2\2\u09e4\u09e6\7u\2\2\u09e5\u09e4\3\2"+
		"\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\5\u01e0\u00f1"+
		"\2\u09e8\u01e3\3\2\2\2\u09e9\u09eb\5\u01e6\u00f4\2\u09ea\u09ec\5\u008a"+
		"F\2\u09eb\u09ea\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec\u09ef\3\2\2\2\u09ed"+
		"\u09ee\7\u0086\2\2\u09ee\u09f0\5\u01e4\u00f3\2\u09ef\u09ed\3\2\2\2\u09ef"+
		"\u09f0\3\2\2\2\u09f0\u01e5\3\2\2\2\u09f1\u09f2\5\u0208\u0105\2\u09f2\u01e7"+
		"\3\2\2\2\u09f3\u09f5\7\u0088\2\2\u09f4\u09f6\5\u01ea\u00f6\2\u09f5\u09f4"+
		"\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f8\7\u008b\2"+
		"\2\u09f8\u01e9\3\2\2\2\u09f9\u09ff\5\u01ec\u00f7\2\u09fa\u09fb\5\u01ec"+
		"\u00f7\2\u09fb\u09fc\7\u008d\2\2\u09fc\u09fd\5\u01ea\u00f6\2\u09fd\u09ff"+
		"\3\2\2\2\u09fe\u09f9\3\2\2\2\u09fe\u09fa\3\2\2\2\u09ff\u01eb\3\2\2\2\u0a00"+
		"\u0a01\5\u01ee\u00f8\2\u0a01\u0a02\5\u01e2\u00f2\2\u0a02\u0a05\3\2\2\2"+
		"\u0a03\u0a05\5\u01e0\u00f1\2\u0a04\u0a00\3\2\2\2\u0a04\u0a03\3\2\2\2\u0a05"+
		"\u01ed\3\2\2\2\u0a06\u0a07\5\u020a\u0106\2\u0a07\u01ef\3\2\2\2\u0a08\u0a0a"+
		"\5\u0176\u00bc\2\u0a09\u0a08\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a\u0a0b\3"+
		"\2\2\2\u0a0b\u0a0d\5\u01f2\u00fa\2\u0a0c\u0a0e\7.\2\2\u0a0d\u0a0c\3\2"+
		"\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a10\5\u021a\u010e"+
		"\2\u0a10\u0a11\5\u01e0\u00f1\2\u0a11\u0a1b\3\2\2\2\u0a12\u0a14\5\u0176"+
		"\u00bc\2\u0a13\u0a12\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15"+
		"\u0a16\5\u01f2\u00fa\2\u0a16\u0a17\7/\2\2\u0a17\u0a18\5\u021a\u010e\2"+
		"\u0a18\u0a19\5\u01e0\u00f1\2\u0a19\u0a1b\3\2\2\2\u0a1a\u0a09\3\2\2\2\u0a1a"+
		"\u0a13\3\2\2\2\u0a1b\u01f1\3\2\2\2\u0a1c\u0a1d\7\u0088\2\2\u0a1d\u0a26"+
		"\7\u008b\2\2\u0a1e\u0a1f\7\u0088\2\2\u0a1f\u0a21\5\u01f4\u00fb\2\u0a20"+
		"\u0a22\5\u021c\u010f\2\u0a21\u0a20\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a23"+
		"\3\2\2\2\u0a23\u0a24\7\u008b\2\2\u0a24\u0a26\3\2\2\2\u0a25\u0a1c\3\2\2"+
		"\2\u0a25\u0a1e\3\2\2\2\u0a26\u01f3\3\2\2\2\u0a27\u0a2d\5\u01f6\u00fc\2"+
		"\u0a28\u0a29\5\u01f6\u00fc\2\u0a29\u0a2a\7\u008d\2\2\u0a2a\u0a2b\5\u01f4"+
		"\u00fb\2\u0a2b\u0a2d\3\2\2\2\u0a2c\u0a27\3\2\2\2\u0a2c\u0a28\3\2\2\2\u0a2d"+
		"\u01f5\3\2\2\2\u0a2e\u0a30\5\u0176\u00bc\2\u0a2f\u0a2e\3\2\2\2\u0a2f\u0a30"+
		"\3\2\2\2\u0a30\u0a32\3\2\2\2\u0a31\u0a33\7u\2\2\u0a32\u0a31\3\2\2\2\u0a32"+
		"\u0a33\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a39\5\u01e0\u00f1\2\u0a35\u0a36"+
		"\5\u01f8\u00fd\2\u0a36\u0a37\5\u01e2\u00f2\2\u0a37\u0a39\3\2\2\2\u0a38"+
		"\u0a2f\3\2\2\2\u0a38\u0a35\3\2\2\2\u0a39\u01f7\3\2\2\2\u0a3a\u0a3b\5\u020a"+
		"\u0106\2\u0a3b\u01f9\3\2\2\2\u0a3c\u0a3d\7\u0089\2\2\u0a3d\u0a3e\5\u01e0"+
		"\u00f1\2\u0a3e\u0a3f\7\u008c\2\2\u0a3f\u01fb\3\2\2\2\u0a40\u0a41\7\u0089"+
		"\2\2\u0a41\u0a42\5\u01e0\u00f1\2\u0a42\u0a43\7\u008e\2\2\u0a43\u0a44\5"+
		"\u01e0\u00f1\2\u0a44\u0a45\7\u008c\2\2\u0a45\u01fd\3\2\2\2\u0a46\u0a49"+
		"\5\u0200\u0101\2\u0a47\u0a48\7\u0096\2\2\u0a48\u0a4a\5\u0200\u0101\2\u0a49"+
		"\u0a47\3\2\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u0a49\3\2\2\2\u0a4b\u0a4c\3\2"+
		"\2\2\u0a4c\u01ff\3\2\2\2\u0a4d\u0a4e\5\u01e4\u00f3\2\u0a4e\u0201\3\2\2"+
		"\2\u0a4f\u0a50\7\u008e\2\2\u0a50\u0a51\5\u0206\u0104\2\u0a51\u0a52\7\u008d"+
		"\2\2\u0a52\u0a53\5\u0204\u0103\2\u0a53\u0a59\3\2\2\2\u0a54\u0a55\7\u008e"+
		"\2\2\u0a55\u0a59\5\u0206\u0104\2\u0a56\u0a57\7\u008e\2\2\u0a57\u0a59\5"+
		"\u0204\u0103\2\u0a58\u0a4f\3\2\2\2\u0a58\u0a54\3\2\2\2\u0a58\u0a56\3\2"+
		"\2\2\u0a59\u0203\3\2\2\2\u0a5a\u0a60\5\u01e4\u00f3\2\u0a5b\u0a5c\5\u01e4"+
		"\u00f3\2\u0a5c\u0a5d\7\u008d\2\2\u0a5d\u0a5e\5\u0204\u0103\2\u0a5e\u0a60"+
		"\3\2\2\2\u0a5f\u0a5a\3\2\2\2\u0a5f\u0a5b\3\2\2\2\u0a60\u0205\3\2\2\2\u0a61"+
		"\u0a62\7&\2\2\u0a62\u0207\3\2\2\2\u0a63\u0a66\7\u0085\2\2\u0a64\u0a66"+
		"\5\u020c\u0107\2\u0a65\u0a63\3\2\2\2\u0a65\u0a64\3\2\2\2\u0a66\u0209\3"+
		"\2\2\2\u0a67\u0a6a\7\u0085\2\2\u0a68\u0a6a\5\u020e\u0108\2\u0a69\u0a67"+
		"\3\2\2\2\u0a69\u0a68\3\2\2\2\u0a6a\u020b\3\2\2\2\u0a6b\u0a6c\t\b\2\2\u0a6c"+
		"\u020d\3\2\2\2\u0a6d\u0a6e\t\t\2\2\u0a6e\u020f\3\2\2\2\u0a6f\u0a70\6\u0109"+
		"\27\2\u0a70\u0a71\7\u0098\2\2\u0a71\u0211\3\2\2\2\u0a72\u0a73\6\u010a"+
		"\30\2\u0a73\u0a74\7\u0097\2\2\u0a74\u0213\3\2\2\2\u0a75\u0a76\6\u010b"+
		"\31\2\u0a76\u0a77\7\u0096\2\2\u0a77\u0a78\7\u0096\2\2\u0a78\u0215\3\2"+
		"\2\2\u0a79\u0a7a\6\u010c\32\2\u0a7a\u0a7b\7\u0099\2\2\u0a7b\u0a7c\7\u0099"+
		"\2\2\u0a7c\u0217\3\2\2\2\u0a7d\u0a7e\6\u010d\33\2\u0a7e\u0a7f\7\u0091"+
		"\2\2\u0a7f\u0a80\7\u0098\2\2\u0a80\u0219\3\2\2\2\u0a81\u0a82\6\u010e\34"+
		"\2\u0a82\u0a83\7\u0097\2\2\u0a83\u0a84\7\u0091\2\2\u0a84\u021b\3\2\2\2"+
		"\u0a85\u0a86\6\u010f\35\2\u0a86\u0a87\7\u0086\2\2\u0a87\u0a88\7\u0086"+
		"\2\2\u0a88\u0a89\7\u0086\2\2\u0a89\u021d\3\2\2\2\u0a8a\u0a8b\6\u0110\36"+
		"\2\u0a8b\u0a8c\7\u0098\2\2\u0a8c\u0a8d\7\u0098\2\2\u0a8d\u021f\3\2\2\2"+
		"\u0a8e\u0a8f\6\u0111\37\2\u0a8f\u0a90\5\u0226\u0114\2\u0a90\u0221\3\2"+
		"\2\2\u0a91\u0a92\6\u0112 \2\u0a92\u0a93\5\u0226\u0114\2\u0a93\u0223\3"+
		"\2\2\2\u0a94\u0a95\6\u0113!\2\u0a95\u0a96\5\u0226\u0114\2\u0a96\u0225"+
		"\3\2\2\2\u0a97\u0a9c\5\u022a\u0116\2\u0a98\u0a99\6\u0114\"\2\u0a99\u0a9b"+
		"\5\u0228\u0115\2\u0a9a\u0a98\3\2\2\2\u0a9b\u0a9e\3\2\2\2\u0a9c\u0a9a\3"+
		"\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d\u0aa8\3\2\2\2\u0a9e\u0a9c\3\2\2\2\u0a9f"+
		"\u0aa4\5\u022c\u0117\2\u0aa0\u0aa1\6\u0114#\2\u0aa1\u0aa3\5\u022e\u0118"+
		"\2\u0aa2\u0aa0\3\2\2\2\u0aa3\u0aa6\3\2\2\2\u0aa4\u0aa2\3\2\2\2\u0aa4\u0aa5"+
		"\3\2\2\2\u0aa5\u0aa8\3\2\2\2\u0aa6\u0aa4\3\2\2\2\u0aa7\u0a97\3\2\2\2\u0aa7"+
		"\u0a9f\3\2\2\2\u0aa8\u0227\3\2\2\2\u0aa9\u0aac\5\u022a\u0116\2\u0aaa\u0aac"+
		"\7\u00a1\2\2\u0aab\u0aa9\3\2\2\2\u0aab\u0aaa\3\2\2\2\u0aac\u0229\3\2\2"+
		"\2\u0aad\u0ab0\t\n\2\2\u0aae\u0ab0\7\u00a0\2\2\u0aaf\u0aad\3\2\2\2\u0aaf"+
		"\u0aae\3\2\2\2\u0ab0\u022b\3\2\2\2\u0ab1\u0ab2\7\u0086\2\2\u0ab2\u022d"+
		"\3\2\2\2\u0ab3\u0ab6\7\u0086\2\2\u0ab4\u0ab6\5\u0228\u0115\2\u0ab5\u0ab3"+
		"\3\2\2\2\u0ab5\u0ab4\3\2\2\2\u0ab6\u022f\3\2\2\2\u0ab7\u0abc\5\u0232\u011a"+
		"\2\u0ab8\u0abc\5\u023a\u011e\2\u0ab9\u0abc\5\u0234\u011b\2\u0aba\u0abc"+
		"\5\u0236\u011c\2\u0abb\u0ab7\3\2\2\2\u0abb\u0ab8\3\2\2\2\u0abb\u0ab9\3"+
		"\2\2\2\u0abb\u0aba\3\2\2\2\u0abc\u0231\3\2\2\2\u0abd\u0abf\5\u0212\u010a"+
		"\2\u0abe\u0abd\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac6"+
		"\5\u0238\u011d\2\u0ac1\u0ac3\5\u0212\u010a\2\u0ac2\u0ac1\3\2\2\2\u0ac2"+
		"\u0ac3\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac6\7\u00a8\2\2\u0ac5\u0abe"+
		"\3\2\2\2\u0ac5\u0ac2\3\2\2\2\u0ac6\u0233\3\2\2\2\u0ac7\u0ac8\t\13\2\2"+
		"\u0ac8\u0235\3\2\2\2\u0ac9\u0aca\7\u0082\2\2\u0aca\u0237\3\2\2\2\u0acb"+
		"\u0acc\t\f\2\2\u0acc\u0239\3\2\2\2\u0acd\u0ace\t\r\2\2\u0ace\u023b\3\2"+
		"\2\2\u0141\u023d\u0243\u0247\u024b\u024f\u0253\u0257\u025b\u025f\u0263"+
		"\u0265\u026d\u0273\u0277\u027b\u027f\u0285\u0289\u028d\u0291\u0295\u0299"+
		"\u029f\u02ac\u02b3\u02b9\u02c3\u02cd\u02d3\u02d9\u02e4\u02ea\u02f2\u02fa"+
		"\u02fe\u0303\u0319\u0325\u0329\u032d\u0333\u033e\u0342\u0346\u0349\u034f"+
		"\u0353\u0356\u035d\u0362\u0367\u036b\u037f\u0389\u038b\u039e\u03b6\u03c6"+
		"\u03d4\u03e0\u03ea\u03ef\u03f9\u0408\u041d\u0422\u0425\u0429\u042e\u0432"+
		"\u043d\u0442\u0445\u0448\u0452\u0457\u046f\u0478\u047f\u0482\u0485\u048e"+
		"\u0497\u049a\u049d\u04a3\u04a6\u04aa\u04b5\u04be\u04c1\u04c4\u04c9\u04cc"+
		"\u04d3\u04dc\u04df\u04e3\u04e8\u04ec\u04f1\u04f4\u04f9\u0505\u0509\u050c"+
		"\u050f\u0512\u0518\u051c\u051f\u0524\u0526\u052a\u0536\u053d\u0541\u0546"+
		"\u0549\u054f\u0555\u055f\u0562\u0566\u0569\u056c\u056f\u0574\u0577\u057a"+
		"\u057e\u0584\u0589\u058c\u058f\u0599\u059d\u05a6\u05aa\u05b2\u05b7\u05ba"+
		"\u05c4\u05c8\u05d0\u05d3\u05d6\u05db\u05de\u05e1\u05eb\u05f2\u05f5\u05f8"+
		"\u05fb\u0600\u0603\u0606\u060b\u060e\u0612\u0617\u061a\u061d\u0621\u0629"+
		"\u0630\u0633\u0636\u063b\u0645\u064c\u0654\u065e\u0662\u0666\u066a\u066d"+
		"\u0671\u0676\u0678\u067f\u0682\u0687\u068a\u068e\u0692\u0695\u069b\u06a0"+
		"\u06a4\u06a7\u06aa\u06ae\u06b1\u06b6\u06b9\u06bd\u06c2\u06c8\u06cb\u06d0"+
		"\u06d5\u06d8\u06df\u06e5\u06ec\u06fa\u06fd\u0700\u0707\u070e\u071c\u0727"+
		"\u072f\u0737\u0748\u0765\u076a\u0785\u078c\u0790\u0795\u079c\u07a3\u07ae"+
		"\u07b2\u07bb\u07c1\u07c6\u07d0\u07db\u07e0\u07f4\u07fc\u07ff\u0803\u080a"+
		"\u0812\u081c\u0823\u0829\u082e\u0833\u0837\u0846\u084a\u0856\u0860\u0864"+
		"\u086a\u0870\u087b\u087f\u0885\u08ac\u08c1\u08c6\u08d7\u08da\u08df\u08e3"+
		"\u08e6\u08ed\u08f6\u08fd\u0905\u090a\u0910\u091d\u0921\u0936\u093a\u0941"+
		"\u0956\u0960\u0968\u097c\u0992\u0994\u099d\u09a4\u09b1\u09b9\u09cf\u09db"+
		"\u09dd\u09e2\u09e5\u09eb\u09ef\u09f5\u09fe\u0a04\u0a09\u0a0d\u0a13\u0a1a"+
		"\u0a21\u0a25\u0a2c\u0a2f\u0a32\u0a38\u0a4b\u0a58\u0a5f\u0a65\u0a69\u0a9c"+
		"\u0aa4\u0aa7\u0aab\u0aaf\u0ab5\u0abb\u0abe\u0ac2\u0ac5";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}