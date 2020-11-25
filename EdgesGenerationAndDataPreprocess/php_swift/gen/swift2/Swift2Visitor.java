// Generated from E:/raw-data/antlr4/php_swift/src/swift2\Swift2.g4 by ANTLR 4.8
package swift2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Swift2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Swift2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#top_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level(Swift2Parser.Top_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Swift2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Swift2Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(Swift2Parser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(Swift2Parser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(Swift2Parser.For_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(Swift2Parser.For_in_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(Swift2Parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#condition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_clause(Swift2Parser.Condition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_list(Swift2Parser.Condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Swift2Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#case_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_condition(Swift2Parser.Case_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_binding_condition(Swift2Parser.Optional_binding_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#optional_binding_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_binding_head(Swift2Parser.Optional_binding_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#optional_binding_continuation_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_binding_continuation_list(Swift2Parser.Optional_binding_continuation_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#optional_binding_continuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_binding_continuation(Swift2Parser.Optional_binding_continuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_while_statement(Swift2Parser.Repeat_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(Swift2Parser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Swift2Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(Swift2Parser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#guard_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_statement(Swift2Parser.Guard_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(Swift2Parser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#switch_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_cases(Swift2Parser.Switch_casesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(Swift2Parser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(Swift2Parser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#case_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_list(Swift2Parser.Case_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#default_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_label(Swift2Parser.Default_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(Swift2Parser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#where_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_expression(Swift2Parser.Where_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(Swift2Parser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#statement_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_label(Swift2Parser.Statement_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(Swift2Parser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_transfer_statement(Swift2Parser.Control_transfer_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(Swift2Parser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(Swift2Parser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthrough_statement(Swift2Parser.Fallthrough_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Swift2Parser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#availability_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_condition(Swift2Parser.Availability_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#availability_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_arguments(Swift2Parser.Availability_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#availability_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_argument(Swift2Parser.Availability_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(Swift2Parser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#defer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefer_statement(Swift2Parser.Defer_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(Swift2Parser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#catch_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clauses(Swift2Parser.Catch_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#catch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clause(Swift2Parser.Catch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_control_statement(Swift2Parser.Compiler_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#build_configuration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_configuration_statement(Swift2Parser.Build_configuration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#build_configuration_elseif_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_configuration_elseif_clauses(Swift2Parser.Build_configuration_elseif_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#build_configuration_elseif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_configuration_elseif_clause(Swift2Parser.Build_configuration_elseif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#build_configuration_else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_configuration_else_clause(Swift2Parser.Build_configuration_else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#build_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_configuration(Swift2Parser.Build_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#platform_testing_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_testing_function(Swift2Parser.Platform_testing_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#operating_system}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperating_system(Swift2Parser.Operating_systemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#architecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture(Swift2Parser.ArchitectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#line_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_control_statement(Swift2Parser.Line_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#line_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_number(Swift2Parser.Line_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(Swift2Parser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_clause(Swift2Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_list(Swift2Parser.Generic_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#generic_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter(Swift2Parser.Generic_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#requirement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_clause(Swift2Parser.Requirement_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#requirement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_list(Swift2Parser.Requirement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(Swift2Parser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConformance_requirement(Swift2Parser.Conformance_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_requirement(Swift2Parser.Same_type_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_clause(Swift2Parser.Generic_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_list(Swift2Parser.Generic_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#generic_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument(Swift2Parser.Generic_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Swift2Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(Swift2Parser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level_declaration(Swift2Parser.Top_level_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(Swift2Parser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(Swift2Parser.Import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#import_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_kind(Swift2Parser.Import_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#import_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path(Swift2Parser.Import_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path_identifier(Swift2Parser.Import_path_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(Swift2Parser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer_list(Swift2Parser.Pattern_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer(Swift2Parser.Pattern_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(Swift2Parser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(Swift2Parser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_head(Swift2Parser.Variable_declaration_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(Swift2Parser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_block(Swift2Parser.Getter_setter_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#getter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_clause(Swift2Parser.Getter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#setter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_clause(Swift2Parser.Setter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#setter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_name(Swift2Parser.Setter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_keyword_block(Swift2Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_keyword_clause(Swift2Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_keyword_clause(Swift2Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_didSet_block(Swift2Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#willSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_clause(Swift2Parser.WillSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#didSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDidSet_clause(Swift2Parser.DidSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_declaration(Swift2Parser.Typealias_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#typealias_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_head(Swift2Parser.Typealias_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#typealias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_name(Swift2Parser.Typealias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_assignment(Swift2Parser.Typealias_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(Swift2Parser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(Swift2Parser.Function_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(Swift2Parser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(Swift2Parser.Function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#function_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_result(Swift2Parser.Function_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(Swift2Parser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#parameter_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clauses(Swift2Parser.Parameter_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clause(Swift2Parser.Parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(Swift2Parser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Swift2Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_parameter_name(Swift2Parser.External_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_name(Swift2Parser.Local_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument_clause(Swift2Parser.Default_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(Swift2Parser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#union_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum(Swift2Parser.Union_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_members(Swift2Parser.Union_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_member(Swift2Parser.Union_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_clause(Swift2Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_list(Swift2Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case(Swift2Parser.Union_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name(Swift2Parser.Enum_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#enum_case_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_name(Swift2Parser.Enum_case_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum(Swift2Parser.Raw_value_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_members(Swift2Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_member(Swift2Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_clause(Swift2Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_list(Swift2Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case(Swift2Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_assignment(Swift2Parser.Raw_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_literal(Swift2Parser.Raw_value_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(Swift2Parser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(Swift2Parser.Struct_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(Swift2Parser.Struct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(Swift2Parser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(Swift2Parser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(Swift2Parser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(Swift2Parser.Protocol_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(Swift2Parser.Protocol_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_body(Swift2Parser.Protocol_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declaration(Swift2Parser.Protocol_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declarations(Swift2Parser.Protocol_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_property_declaration(Swift2Parser.Protocol_property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_method_declaration(Swift2Parser.Protocol_method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_initializer_declaration(Swift2Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_subscript_declaration(Swift2Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_associated_type_declaration(Swift2Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_declaration(Swift2Parser.Initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#initializer_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_head(Swift2Parser.Initializer_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#initializer_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_body(Swift2Parser.Initializer_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeinitializer_declaration(Swift2Parser.Deinitializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#extension_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_declaration(Swift2Parser.Extension_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#extension_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_body(Swift2Parser.Extension_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_declaration(Swift2Parser.Subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#subscript_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_head(Swift2Parser.Subscript_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#subscript_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_result(Swift2Parser.Subscript_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(Swift2Parser.Operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator_declaration(Swift2Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator_declaration(Swift2Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_declaration(Swift2Parser.Infix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_attributes(Swift2Parser.Infix_operator_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#precedence_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_clause(Swift2Parser.Precedence_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#precedence_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_level(Swift2Parser.Precedence_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#associativity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity_clause(Swift2Parser.Associativity_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#associativity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity(Swift2Parser.AssociativityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_modifier(Swift2Parser.Declaration_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_modifiers(Swift2Parser.Declaration_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_level_modifier(Swift2Parser.Access_level_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(Swift2Parser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_pattern(Swift2Parser.Wildcard_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_pattern(Swift2Parser.Identifier_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_binding_pattern(Swift2Parser.Value_binding_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern(Swift2Parser.Tuple_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element_list(Swift2Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element(Swift2Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_pattern(Swift2Parser.Enum_case_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#optional_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_pattern(Swift2Parser.Optional_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#expression_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_pattern(Swift2Parser.Expression_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(Swift2Parser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(Swift2Parser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_clause(Swift2Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(Swift2Parser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_tokens(Swift2Parser.Balanced_tokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#balanced_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_token(Swift2Parser.Balanced_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Swift2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(Swift2Parser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#prefix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expression(Swift2Parser.Prefix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#in_out_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_out_expression(Swift2Parser.In_out_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#try_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_operator(Swift2Parser.Try_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(Swift2Parser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#binary_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expressions(Swift2Parser.Binary_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(Swift2Parser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_operator(Swift2Parser.Type_casting_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(Swift2Parser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_member_expression(Swift2Parser.Implicit_member_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(Swift2Parser.Literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(Swift2Parser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#array_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_items(Swift2Parser.Array_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#array_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_item(Swift2Parser.Array_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal(Swift2Parser.Dictionary_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_items(Swift2Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_item(Swift2Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_expression(Swift2Parser.Self_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_expression(Swift2Parser.Superclass_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#superclass_method_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_method_expression(Swift2Parser.Superclass_method_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_subscript_expression(Swift2Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_initializer_expression(Swift2Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#closure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_expression(Swift2Parser.Closure_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#closure_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_signature(Swift2Parser.Closure_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#capture_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list(Swift2Parser.Capture_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#capture_list_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list_items(Swift2Parser.Capture_list_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#capture_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list_item(Swift2Parser.Capture_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#capture_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_specifier(Swift2Parser.Capture_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(Swift2Parser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#expression_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element_list(Swift2Parser.Expression_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element(Swift2Parser.Expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_expression(Swift2Parser.Wildcard_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#selector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_expression(Swift2Parser.Selector_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(Swift2Parser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression1(Swift2Parser.Explicit_member_expression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_expression(Swift2Parser.Initializer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dynamic_type_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_type_expression(Swift2Parser.Dynamic_type_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_self_expression(Swift2Parser.Postfix_self_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_with_closure_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_with_closure_expression(Swift2Parser.Function_call_with_closure_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_expression_with_args(Swift2Parser.Initializer_expression_with_argsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_expression(Swift2Parser.Subscript_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression2(Swift2Parser.Explicit_member_expression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression3(Swift2Parser.Explicit_member_expression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_member_expression4}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_expression4(Swift2Parser.Explicit_member_expression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operation(Swift2Parser.Postfix_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Swift2Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#argument_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_names(Swift2Parser.Argument_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#argument_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_name(Swift2Parser.Argument_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#trailing_closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing_closure(Swift2Parser.Trailing_closureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Swift2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(Swift2Parser.Type_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(Swift2Parser.Type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(Swift2Parser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(Swift2Parser.Tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#tuple_type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_body(Swift2Parser.Tuple_type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element_list(Swift2Parser.Tuple_type_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element(Swift2Parser.Tuple_type_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(Swift2Parser.Element_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_composition_type(Swift2Parser.Protocol_composition_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier_list(Swift2Parser.Protocol_identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#protocol_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier(Swift2Parser.Protocol_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_clause(Swift2Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_list(Swift2Parser.Type_inheritance_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#class_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_requirement(Swift2Parser.Class_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Swift2Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(Swift2Parser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_sensitive_keyword(Swift2Parser.Context_sensitive_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(Swift2Parser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate_prefix_operator(Swift2Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#build_AND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_AND(Swift2Parser.Build_ANDContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#build_OR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_OR(Swift2Parser.Build_ORContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#arrow_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_operator(Swift2Parser.Arrow_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#range_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_operator(Swift2Parser.Range_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#same_type_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_equals(Swift2Parser.Same_type_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(Swift2Parser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(Swift2Parser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator(Swift2Parser.Postfix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(Swift2Parser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#operator_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_character(Swift2Parser.Operator_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#operator_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_head(Swift2Parser.Operator_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_operator_head(Swift2Parser.Dot_operator_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_operator_character(Swift2Parser.Dot_operator_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Swift2Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(Swift2Parser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(Swift2Parser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#nil_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_literal(Swift2Parser.Nil_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(Swift2Parser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift2Parser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(Swift2Parser.String_literalContext ctx);
}