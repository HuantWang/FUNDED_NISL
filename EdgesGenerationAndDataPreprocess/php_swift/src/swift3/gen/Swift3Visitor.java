// Generated from E:/raw-data/antlr4/php_swift/src/swift3\Swift3.g4 by ANTLR 4.8
package swift3.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Swift3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Swift3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#top_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level(Swift3Parser.Top_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Swift3Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Swift3Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#statements_impl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements_impl(Swift3Parser.Statements_implContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(Swift3Parser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(Swift3Parser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(Swift3Parser.For_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(Swift3Parser.For_in_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(Swift3Parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_list(Swift3Parser.Condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Swift3Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#case_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_condition(Swift3Parser.Case_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_binding_condition(Swift3Parser.Optional_binding_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_while_statement(Swift3Parser.Repeat_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(Swift3Parser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Swift3Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(Swift3Parser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#guard_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_statement(Swift3Parser.Guard_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(Swift3Parser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#switch_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_cases(Swift3Parser.Switch_casesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(Swift3Parser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(Swift3Parser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#case_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_list(Swift3Parser.Case_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#default_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_label(Swift3Parser.Default_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(Swift3Parser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#where_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_expression(Swift3Parser.Where_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(Swift3Parser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#statement_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_label(Swift3Parser.Statement_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(Swift3Parser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_transfer_statement(Swift3Parser.Control_transfer_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(Swift3Parser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(Swift3Parser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthrough_statement(Swift3Parser.Fallthrough_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Swift3Parser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(Swift3Parser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#defer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefer_statement(Swift3Parser.Defer_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(Swift3Parser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#catch_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clauses(Swift3Parser.Catch_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#catch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clause(Swift3Parser.Catch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_control_statement(Swift3Parser.Compiler_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#conditional_compilation_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_compilation_block(Swift3Parser.Conditional_compilation_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#if_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_directive_clause(Swift3Parser.If_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#elseif_directive_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_directive_clauses(Swift3Parser.Elseif_directive_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#elseif_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_directive_clause(Swift3Parser.Elseif_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#else_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_directive_clause(Swift3Parser.Else_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#if_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_directive(Swift3Parser.If_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#elseif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_directive(Swift3Parser.Elseif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#else_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_directive(Swift3Parser.Else_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#endif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif_directive(Swift3Parser.Endif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#compilation_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition(Swift3Parser.Compilation_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#platform_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_condition(Swift3Parser.Platform_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#swift_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwift_version(Swift3Parser.Swift_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#operating_system}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperating_system(Swift3Parser.Operating_systemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#architecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture(Swift3Parser.ArchitectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#line_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_control_statement(Swift3Parser.Line_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#line_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_number(Swift3Parser.Line_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(Swift3Parser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#availability_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_condition(Swift3Parser.Availability_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#availability_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_arguments(Swift3Parser.Availability_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#availability_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_argument(Swift3Parser.Availability_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_clause(Swift3Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_list(Swift3Parser.Generic_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#generic_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter(Swift3Parser.Generic_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#generic_where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_where_clause(Swift3Parser.Generic_where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#requirement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_list(Swift3Parser.Requirement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(Swift3Parser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConformance_requirement(Swift3Parser.Conformance_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_requirement(Swift3Parser.Same_type_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_clause(Swift3Parser.Generic_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_list(Swift3Parser.Generic_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#generic_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument(Swift3Parser.Generic_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Swift3Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(Swift3Parser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level_declaration(Swift3Parser.Top_level_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(Swift3Parser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(Swift3Parser.Import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#import_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_kind(Swift3Parser.Import_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#import_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path(Swift3Parser.Import_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path_identifier(Swift3Parser.Import_path_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(Swift3Parser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer_list(Swift3Parser.Pattern_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer(Swift3Parser.Pattern_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(Swift3Parser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(Swift3Parser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_head(Swift3Parser.Variable_declaration_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(Swift3Parser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_block(Swift3Parser.Getter_setter_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#getter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_clause(Swift3Parser.Getter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#setter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_clause(Swift3Parser.Setter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#setter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_name(Swift3Parser.Setter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_keyword_block(Swift3Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_keyword_clause(Swift3Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_keyword_clause(Swift3Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_didSet_block(Swift3Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#willSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_clause(Swift3Parser.WillSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#didSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDidSet_clause(Swift3Parser.DidSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_declaration(Swift3Parser.Typealias_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#typealias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_name(Swift3Parser.Typealias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_assignment(Swift3Parser.Typealias_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(Swift3Parser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(Swift3Parser.Function_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(Swift3Parser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(Swift3Parser.Function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_result(Swift3Parser.Function_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(Swift3Parser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clause(Swift3Parser.Parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(Swift3Parser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Swift3Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_parameter_name(Swift3Parser.External_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_name(Swift3Parser.Local_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument_clause(Swift3Parser.Default_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(Swift3Parser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#union_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum(Swift3Parser.Union_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_members(Swift3Parser.Union_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_member(Swift3Parser.Union_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_clause(Swift3Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_list(Swift3Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case(Swift3Parser.Union_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name(Swift3Parser.Enum_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#enum_case_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_name(Swift3Parser.Enum_case_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum(Swift3Parser.Raw_value_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_members(Swift3Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_member(Swift3Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_clause(Swift3Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_list(Swift3Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case(Swift3Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_assignment(Swift3Parser.Raw_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_literal(Swift3Parser.Raw_value_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(Swift3Parser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(Swift3Parser.Struct_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(Swift3Parser.Struct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#struct_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member(Swift3Parser.Struct_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(Swift3Parser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(Swift3Parser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(Swift3Parser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member(Swift3Parser.Class_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(Swift3Parser.Protocol_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(Swift3Parser.Protocol_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_body(Swift3Parser.Protocol_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member(Swift3Parser.Protocol_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declaration(Swift3Parser.Protocol_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_property_declaration(Swift3Parser.Protocol_property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_method_declaration(Swift3Parser.Protocol_method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_initializer_declaration(Swift3Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_subscript_declaration(Swift3Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_associated_type_declaration(Swift3Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_declaration(Swift3Parser.Initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#initializer_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_head(Swift3Parser.Initializer_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#initializer_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_body(Swift3Parser.Initializer_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeinitializer_declaration(Swift3Parser.Deinitializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#extension_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_declaration(Swift3Parser.Extension_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#extension_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_body(Swift3Parser.Extension_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#extension_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_member(Swift3Parser.Extension_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_declaration(Swift3Parser.Subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#subscript_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_head(Swift3Parser.Subscript_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#subscript_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_result(Swift3Parser.Subscript_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(Swift3Parser.Operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator_declaration(Swift3Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator_declaration(Swift3Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_declaration(Swift3Parser.Infix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#infix_operator_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_group(Swift3Parser.Infix_operator_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#precedence_group_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_declaration(Swift3Parser.Precedence_group_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#precedence_group_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_attribute(Swift3Parser.Precedence_group_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#precedence_group_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_relation(Swift3Parser.Precedence_group_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#precedence_group_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_assignment(Swift3Parser.Precedence_group_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#precedence_group_associativity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_associativity(Swift3Parser.Precedence_group_associativityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#associativity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity(Swift3Parser.AssociativityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#precedence_group_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_names(Swift3Parser.Precedence_group_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#precedence_group_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_name(Swift3Parser.Precedence_group_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_modifier(Swift3Parser.Declaration_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_modifiers(Swift3Parser.Declaration_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_level_modifier(Swift3Parser.Access_level_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#mutation_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutation_modifier(Swift3Parser.Mutation_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(Swift3Parser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_pattern(Swift3Parser.Wildcard_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_pattern(Swift3Parser.Identifier_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_binding_pattern(Swift3Parser.Value_binding_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern(Swift3Parser.Tuple_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element_list(Swift3Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element(Swift3Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_pattern(Swift3Parser.Enum_case_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#optional_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_pattern(Swift3Parser.Optional_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#expression_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_pattern(Swift3Parser.Expression_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(Swift3Parser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(Swift3Parser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_clause(Swift3Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(Swift3Parser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_tokens(Swift3Parser.Balanced_tokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#balanced_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_token(Swift3Parser.Balanced_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#any_punctuation_for_balanced_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_punctuation_for_balanced_token(Swift3Parser.Any_punctuation_for_balanced_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Swift3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(Swift3Parser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#prefix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expression(Swift3Parser.Prefix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#in_out_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_out_expression(Swift3Parser.In_out_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#try_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_operator(Swift3Parser.Try_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(Swift3Parser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#binary_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expressions(Swift3Parser.Binary_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(Swift3Parser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_operator(Swift3Parser.Type_casting_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(Swift3Parser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(Swift3Parser.Literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(Swift3Parser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#array_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_items(Swift3Parser.Array_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#array_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_item(Swift3Parser.Array_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal(Swift3Parser.Dictionary_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_items(Swift3Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_item(Swift3Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#playground_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayground_literal(Swift3Parser.Playground_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_expression(Swift3Parser.Self_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_expression(Swift3Parser.Superclass_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#superclass_method_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_method_expression(Swift3Parser.Superclass_method_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_subscript_expression(Swift3Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_initializer_expression(Swift3Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#closure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_expression(Swift3Parser.Closure_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#closure_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_signature(Swift3Parser.Closure_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#closure_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter_clause(Swift3Parser.Closure_parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#closure_parameter_clause_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter_clause_identifier_list(Swift3Parser.Closure_parameter_clause_identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#closure_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter_list(Swift3Parser.Closure_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#closure_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter(Swift3Parser.Closure_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#closure_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter_name(Swift3Parser.Closure_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#capture_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list(Swift3Parser.Capture_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#capture_list_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list_items(Swift3Parser.Capture_list_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#capture_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list_item(Swift3Parser.Capture_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#capture_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_specifier(Swift3Parser.Capture_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_member_expression(Swift3Parser.Implicit_member_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(Swift3Parser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_expression(Swift3Parser.Tuple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_element(Swift3Parser.Tuple_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_expression(Swift3Parser.Wildcard_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#selector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_expression(Swift3Parser.Selector_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#key_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_path_expression(Swift3Parser.Key_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_expression_with_closure}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression_with_closure(Swift3Parser.Function_call_expression_with_closureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(Swift3Parser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression1(Swift3Parser.Explicit_member_expression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_expression(Swift3Parser.Initializer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_self_expression(Swift3Parser.Postfix_self_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_expression_with_args(Swift3Parser.Initializer_expression_with_argsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dynamic_type}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_type(Swift3Parser.Dynamic_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_expression(Swift3Parser.Subscript_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression2(Swift3Parser.Explicit_member_expression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression3(Swift3Parser.Explicit_member_expression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression4}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression4(Swift3Parser.Explicit_member_expression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operation(Swift3Parser.Postfix_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Swift3Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_call_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_argument_clause(Swift3Parser.Function_call_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_call_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_argument_list(Swift3Parser.Function_call_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_call_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_argument(Swift3Parser.Function_call_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#trailing_closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing_closure(Swift3Parser.Trailing_closureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#argument_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_names(Swift3Parser.Argument_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#argument_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_name(Swift3Parser.Argument_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#dynamic_type_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_type_expression(Swift3Parser.Dynamic_type_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_metatype_protocol_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_metatype_protocol_type(Swift3Parser.The_metatype_protocol_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_function_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_function_type(Swift3Parser.The_function_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_implicitly_unwrapped_optional_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_implicitly_unwrapped_optional_type(Swift3Parser.The_implicitly_unwrapped_optional_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_dictionary_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_dictionary_type(Swift3Parser.The_dictionary_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_optional_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_optional_type(Swift3Parser.The_optional_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_tuple_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_tuple_type(Swift3Parser.The_tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_self_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_self_type(Swift3Parser.The_self_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_array_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_array_type(Swift3Parser.The_array_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_metatype_type_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_metatype_type_type(Swift3Parser.The_metatype_type_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_protocol_composition_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_protocol_composition_type(Swift3Parser.The_protocol_composition_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_any_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_any_type(Swift3Parser.The_any_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code the_type_identifier}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_type_identifier(Swift3Parser.The_type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(Swift3Parser.Type_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(Swift3Parser.Type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(Swift3Parser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(Swift3Parser.Tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element_list(Swift3Parser.Tuple_type_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element(Swift3Parser.Tuple_type_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(Swift3Parser.Element_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(Swift3Parser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_type_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type_argument_clause(Swift3Parser.Function_type_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_type_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type_argument_list(Swift3Parser.Function_type_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#function_type_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type_argument(Swift3Parser.Function_type_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#argument_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_label(Swift3Parser.Argument_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(Swift3Parser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#dictionary_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_type(Swift3Parser.Dictionary_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_composition_type(Swift3Parser.Protocol_composition_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#protocol_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier(Swift3Parser.Protocol_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_clause(Swift3Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_list(Swift3Parser.Type_inheritance_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#class_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_requirement(Swift3Parser.Class_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#declaration_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_identifier(Swift3Parser.Declaration_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#label_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_identifier(Swift3Parser.Label_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#keyword_as_identifier_in_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_as_identifier_in_declarations(Swift3Parser.Keyword_as_identifier_in_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#keyword_as_identifier_in_labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_as_identifier_in_labels(Swift3Parser.Keyword_as_identifier_in_labelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(Swift3Parser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate_prefix_operator(Swift3Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#compilation_condition_AND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition_AND(Swift3Parser.Compilation_condition_ANDContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#compilation_condition_OR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition_OR(Swift3Parser.Compilation_condition_ORContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#compilation_condition_GE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition_GE(Swift3Parser.Compilation_condition_GEContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#arrow_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_operator(Swift3Parser.Arrow_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#range_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_operator(Swift3Parser.Range_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#same_type_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_equals(Swift3Parser.Same_type_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(Swift3Parser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(Swift3Parser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator(Swift3Parser.Postfix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(Swift3Parser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#operator_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_character(Swift3Parser.Operator_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#operator_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_head(Swift3Parser.Operator_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_operator_head(Swift3Parser.Dot_operator_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_operator_character(Swift3Parser.Dot_operator_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Swift3Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(Swift3Parser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(Swift3Parser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#nil_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_literal(Swift3Parser.Nil_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(Swift3Parser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift3Parser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(Swift3Parser.String_literalContext ctx);
}