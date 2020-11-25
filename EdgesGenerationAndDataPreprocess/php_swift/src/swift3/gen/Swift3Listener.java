// Generated from E:/raw-data/antlr4/php_swift/src/swift3\Swift3.g4 by ANTLR 4.8
package swift3.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Swift3Parser}.
 */
public interface Swift3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#top_level}.
	 * @param ctx the parse tree
	 */
	void enterTop_level(Swift3Parser.Top_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#top_level}.
	 * @param ctx the parse tree
	 */
	void exitTop_level(Swift3Parser.Top_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Swift3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Swift3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Swift3Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Swift3Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statements_impl}.
	 * @param ctx the parse tree
	 */
	void enterStatements_impl(Swift3Parser.Statements_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statements_impl}.
	 * @param ctx the parse tree
	 */
	void exitStatements_impl(Swift3Parser.Statements_implContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(Swift3Parser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(Swift3Parser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(Swift3Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(Swift3Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(Swift3Parser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(Swift3Parser.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(Swift3Parser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(Swift3Parser.For_in_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(Swift3Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(Swift3Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(Swift3Parser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(Swift3Parser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Swift3Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Swift3Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#case_condition}.
	 * @param ctx the parse tree
	 */
	void enterCase_condition(Swift3Parser.Case_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#case_condition}.
	 * @param ctx the parse tree
	 */
	void exitCase_condition(Swift3Parser.Case_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_condition(Swift3Parser.Optional_binding_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_condition(Swift3Parser.Optional_binding_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_while_statement(Swift3Parser.Repeat_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_while_statement(Swift3Parser.Repeat_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(Swift3Parser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(Swift3Parser.Branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Swift3Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Swift3Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(Swift3Parser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(Swift3Parser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void enterGuard_statement(Swift3Parser.Guard_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void exitGuard_statement(Swift3Parser.Guard_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(Swift3Parser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(Swift3Parser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cases(Swift3Parser.Switch_casesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cases(Swift3Parser.Switch_casesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(Swift3Parser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(Swift3Parser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(Swift3Parser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(Swift3Parser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_list(Swift3Parser.Case_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_list(Swift3Parser.Case_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#default_label}.
	 * @param ctx the parse tree
	 */
	void enterDefault_label(Swift3Parser.Default_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#default_label}.
	 * @param ctx the parse tree
	 */
	void exitDefault_label(Swift3Parser.Default_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(Swift3Parser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(Swift3Parser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#where_expression}.
	 * @param ctx the parse tree
	 */
	void enterWhere_expression(Swift3Parser.Where_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#where_expression}.
	 * @param ctx the parse tree
	 */
	void exitWhere_expression(Swift3Parser.Where_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(Swift3Parser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(Swift3Parser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statement_label}.
	 * @param ctx the parse tree
	 */
	void enterStatement_label(Swift3Parser.Statement_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statement_label}.
	 * @param ctx the parse tree
	 */
	void exitStatement_label(Swift3Parser.Statement_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(Swift3Parser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(Swift3Parser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_transfer_statement(Swift3Parser.Control_transfer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_transfer_statement(Swift3Parser.Control_transfer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(Swift3Parser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(Swift3Parser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(Swift3Parser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(Swift3Parser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void enterFallthrough_statement(Swift3Parser.Fallthrough_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void exitFallthrough_statement(Swift3Parser.Fallthrough_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(Swift3Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(Swift3Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(Swift3Parser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(Swift3Parser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefer_statement(Swift3Parser.Defer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefer_statement(Swift3Parser.Defer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(Swift3Parser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(Swift3Parser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(Swift3Parser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(Swift3Parser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clause(Swift3Parser.Catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clause(Swift3Parser.Catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_control_statement(Swift3Parser.Compiler_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_control_statement(Swift3Parser.Compiler_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditional_compilation_block}.
	 * @param ctx the parse tree
	 */
	void enterConditional_compilation_block(Swift3Parser.Conditional_compilation_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditional_compilation_block}.
	 * @param ctx the parse tree
	 */
	void exitConditional_compilation_block(Swift3Parser.Conditional_compilation_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#if_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_directive_clause(Swift3Parser.If_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#if_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_directive_clause(Swift3Parser.If_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseif_directive_clauses}.
	 * @param ctx the parse tree
	 */
	void enterElseif_directive_clauses(Swift3Parser.Elseif_directive_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseif_directive_clauses}.
	 * @param ctx the parse tree
	 */
	void exitElseif_directive_clauses(Swift3Parser.Elseif_directive_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseif_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterElseif_directive_clause(Swift3Parser.Elseif_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseif_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitElseif_directive_clause(Swift3Parser.Elseif_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#else_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_directive_clause(Swift3Parser.Else_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#else_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_directive_clause(Swift3Parser.Else_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#if_directive}.
	 * @param ctx the parse tree
	 */
	void enterIf_directive(Swift3Parser.If_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#if_directive}.
	 * @param ctx the parse tree
	 */
	void exitIf_directive(Swift3Parser.If_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseif_directive}.
	 * @param ctx the parse tree
	 */
	void enterElseif_directive(Swift3Parser.Elseif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseif_directive}.
	 * @param ctx the parse tree
	 */
	void exitElseif_directive(Swift3Parser.Elseif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#else_directive}.
	 * @param ctx the parse tree
	 */
	void enterElse_directive(Swift3Parser.Else_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#else_directive}.
	 * @param ctx the parse tree
	 */
	void exitElse_directive(Swift3Parser.Else_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndif_directive(Swift3Parser.Endif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndif_directive(Swift3Parser.Endif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilation_condition}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition(Swift3Parser.Compilation_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilation_condition}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition(Swift3Parser.Compilation_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#platform_condition}.
	 * @param ctx the parse tree
	 */
	void enterPlatform_condition(Swift3Parser.Platform_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#platform_condition}.
	 * @param ctx the parse tree
	 */
	void exitPlatform_condition(Swift3Parser.Platform_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#swift_version}.
	 * @param ctx the parse tree
	 */
	void enterSwift_version(Swift3Parser.Swift_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#swift_version}.
	 * @param ctx the parse tree
	 */
	void exitSwift_version(Swift3Parser.Swift_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operating_system}.
	 * @param ctx the parse tree
	 */
	void enterOperating_system(Swift3Parser.Operating_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operating_system}.
	 * @param ctx the parse tree
	 */
	void exitOperating_system(Swift3Parser.Operating_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(Swift3Parser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(Swift3Parser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterLine_control_statement(Swift3Parser.Line_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitLine_control_statement(Swift3Parser.Line_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#line_number}.
	 * @param ctx the parse tree
	 */
	void enterLine_number(Swift3Parser.Line_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#line_number}.
	 * @param ctx the parse tree
	 */
	void exitLine_number(Swift3Parser.Line_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(Swift3Parser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(Swift3Parser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_condition(Swift3Parser.Availability_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_condition(Swift3Parser.Availability_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_arguments(Swift3Parser.Availability_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_arguments(Swift3Parser.Availability_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_argument(Swift3Parser.Availability_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_argument(Swift3Parser.Availability_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_clause(Swift3Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_clause(Swift3Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_list(Swift3Parser.Generic_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_list(Swift3Parser.Generic_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter(Swift3Parser.Generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter(Swift3Parser.Generic_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#generic_where_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_where_clause(Swift3Parser.Generic_where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#generic_where_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_where_clause(Swift3Parser.Generic_where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_list(Swift3Parser.Requirement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_list(Swift3Parser.Requirement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(Swift3Parser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(Swift3Parser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void enterConformance_requirement(Swift3Parser.Conformance_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void exitConformance_requirement(Swift3Parser.Conformance_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_requirement(Swift3Parser.Same_type_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_requirement(Swift3Parser.Same_type_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_clause(Swift3Parser.Generic_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_clause(Swift3Parser.Generic_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_list(Swift3Parser.Generic_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_list(Swift3Parser.Generic_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument(Swift3Parser.Generic_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument(Swift3Parser.Generic_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Swift3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Swift3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Swift3Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Swift3Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTop_level_declaration(Swift3Parser.Top_level_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTop_level_declaration(Swift3Parser.Top_level_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(Swift3Parser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(Swift3Parser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(Swift3Parser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(Swift3Parser.Import_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#import_kind}.
	 * @param ctx the parse tree
	 */
	void enterImport_kind(Swift3Parser.Import_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#import_kind}.
	 * @param ctx the parse tree
	 */
	void exitImport_kind(Swift3Parser.Import_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#import_path}.
	 * @param ctx the parse tree
	 */
	void enterImport_path(Swift3Parser.Import_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#import_path}.
	 * @param ctx the parse tree
	 */
	void exitImport_path(Swift3Parser.Import_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImport_path_identifier(Swift3Parser.Import_path_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImport_path_identifier(Swift3Parser.Import_path_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(Swift3Parser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(Swift3Parser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer_list(Swift3Parser.Pattern_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer_list(Swift3Parser.Pattern_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer(Swift3Parser.Pattern_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer(Swift3Parser.Pattern_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(Swift3Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(Swift3Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(Swift3Parser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(Swift3Parser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_head(Swift3Parser.Variable_declaration_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_head(Swift3Parser.Variable_declaration_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(Swift3Parser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(Swift3Parser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_block(Swift3Parser.Getter_setter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_block(Swift3Parser.Getter_setter_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_clause(Swift3Parser.Getter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_clause(Swift3Parser.Getter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_clause(Swift3Parser.Setter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_clause(Swift3Parser.Setter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setter_name}.
	 * @param ctx the parse tree
	 */
	void enterSetter_name(Swift3Parser.Setter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setter_name}.
	 * @param ctx the parse tree
	 */
	void exitSetter_name(Swift3Parser.Setter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_keyword_block(Swift3Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_keyword_block(Swift3Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_keyword_clause(Swift3Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_keyword_clause(Swift3Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_keyword_clause(Swift3Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_keyword_clause(Swift3Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_didSet_block(Swift3Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_didSet_block(Swift3Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_clause(Swift3Parser.WillSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_clause(Swift3Parser.WillSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterDidSet_clause(Swift3Parser.DidSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitDidSet_clause(Swift3Parser.DidSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_declaration(Swift3Parser.Typealias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_declaration(Swift3Parser.Typealias_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_name(Swift3Parser.Typealias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_name(Swift3Parser.Typealias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_assignment(Swift3Parser.Typealias_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_assignment(Swift3Parser.Typealias_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(Swift3Parser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(Swift3Parser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(Swift3Parser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(Swift3Parser.Function_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(Swift3Parser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(Swift3Parser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(Swift3Parser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(Swift3Parser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_result}.
	 * @param ctx the parse tree
	 */
	void enterFunction_result(Swift3Parser.Function_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_result}.
	 * @param ctx the parse tree
	 */
	void exitFunction_result(Swift3Parser.Function_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(Swift3Parser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(Swift3Parser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clause(Swift3Parser.Parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clause(Swift3Parser.Parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(Swift3Parser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(Swift3Parser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Swift3Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Swift3Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterExternal_parameter_name(Swift3Parser.External_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitExternal_parameter_name(Swift3Parser.External_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_name(Swift3Parser.Local_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_name(Swift3Parser.Local_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument_clause(Swift3Parser.Default_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument_clause(Swift3Parser.Default_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(Swift3Parser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(Swift3Parser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum(Swift3Parser.Union_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum(Swift3Parser.Union_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_members(Swift3Parser.Union_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_members(Swift3Parser.Union_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_member(Swift3Parser.Union_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_member(Swift3Parser.Union_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_clause(Swift3Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_clause(Swift3Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_list(Swift3Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_list(Swift3Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case(Swift3Parser.Union_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case(Swift3Parser.Union_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(Swift3Parser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(Swift3Parser.Enum_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_name(Swift3Parser.Enum_case_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_name(Swift3Parser.Enum_case_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum(Swift3Parser.Raw_value_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum(Swift3Parser.Raw_value_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_members(Swift3Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_members(Swift3Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_member(Swift3Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_member(Swift3Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_clause(Swift3Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_clause(Swift3Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_list(Swift3Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_list(Swift3Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case(Swift3Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case(Swift3Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_assignment(Swift3Parser.Raw_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_assignment(Swift3Parser.Raw_value_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_literal(Swift3Parser.Raw_value_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_literal(Swift3Parser.Raw_value_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(Swift3Parser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(Swift3Parser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#struct_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_name(Swift3Parser.Struct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#struct_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_name(Swift3Parser.Struct_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(Swift3Parser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(Swift3Parser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#struct_member}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member(Swift3Parser.Struct_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#struct_member}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member(Swift3Parser.Struct_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(Swift3Parser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(Swift3Parser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(Swift3Parser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(Swift3Parser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(Swift3Parser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(Swift3Parser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterClass_member(Swift3Parser.Class_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitClass_member(Swift3Parser.Class_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(Swift3Parser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(Swift3Parser.Protocol_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(Swift3Parser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(Swift3Parser.Protocol_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_body(Swift3Parser.Protocol_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_body(Swift3Parser.Protocol_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_member}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member(Swift3Parser.Protocol_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_member}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member(Swift3Parser.Protocol_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declaration(Swift3Parser.Protocol_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declaration(Swift3Parser.Protocol_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_property_declaration(Swift3Parser.Protocol_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_property_declaration(Swift3Parser.Protocol_property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_method_declaration(Swift3Parser.Protocol_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_method_declaration(Swift3Parser.Protocol_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_initializer_declaration(Swift3Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_initializer_declaration(Swift3Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_subscript_declaration(Swift3Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_subscript_declaration(Swift3Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_associated_type_declaration(Swift3Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_associated_type_declaration(Swift3Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_declaration(Swift3Parser.Initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_declaration(Swift3Parser.Initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_head(Swift3Parser.Initializer_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_head(Swift3Parser.Initializer_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_body(Swift3Parser.Initializer_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_body(Swift3Parser.Initializer_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializer_declaration(Swift3Parser.Deinitializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializer_declaration(Swift3Parser.Deinitializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtension_declaration(Swift3Parser.Extension_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtension_declaration(Swift3Parser.Extension_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#extension_body}.
	 * @param ctx the parse tree
	 */
	void enterExtension_body(Swift3Parser.Extension_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#extension_body}.
	 * @param ctx the parse tree
	 */
	void exitExtension_body(Swift3Parser.Extension_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#extension_member}.
	 * @param ctx the parse tree
	 */
	void enterExtension_member(Swift3Parser.Extension_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#extension_member}.
	 * @param ctx the parse tree
	 */
	void exitExtension_member(Swift3Parser.Extension_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_declaration(Swift3Parser.Subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_declaration(Swift3Parser.Subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_head(Swift3Parser.Subscript_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_head(Swift3Parser.Subscript_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_result(Swift3Parser.Subscript_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_result(Swift3Parser.Subscript_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(Swift3Parser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(Swift3Parser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator_declaration(Swift3Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator_declaration(Swift3Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator_declaration(Swift3Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator_declaration(Swift3Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_declaration(Swift3Parser.Infix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_declaration(Swift3Parser.Infix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#infix_operator_group}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_group(Swift3Parser.Infix_operator_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#infix_operator_group}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_group(Swift3Parser.Infix_operator_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedence_group_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_declaration(Swift3Parser.Precedence_group_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedence_group_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_declaration(Swift3Parser.Precedence_group_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedence_group_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_attribute(Swift3Parser.Precedence_group_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedence_group_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_attribute(Swift3Parser.Precedence_group_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedence_group_relation}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_relation(Swift3Parser.Precedence_group_relationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedence_group_relation}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_relation(Swift3Parser.Precedence_group_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedence_group_assignment}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_assignment(Swift3Parser.Precedence_group_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedence_group_assignment}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_assignment(Swift3Parser.Precedence_group_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedence_group_associativity}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_associativity(Swift3Parser.Precedence_group_associativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedence_group_associativity}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_associativity(Swift3Parser.Precedence_group_associativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity(Swift3Parser.AssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity(Swift3Parser.AssociativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedence_group_names}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_names(Swift3Parser.Precedence_group_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedence_group_names}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_names(Swift3Parser.Precedence_group_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedence_group_name}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_name(Swift3Parser.Precedence_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedence_group_name}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_name(Swift3Parser.Precedence_group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifier(Swift3Parser.Declaration_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifier(Swift3Parser.Declaration_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifiers(Swift3Parser.Declaration_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifiers(Swift3Parser.Declaration_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_level_modifier(Swift3Parser.Access_level_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_level_modifier(Swift3Parser.Access_level_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#mutation_modifier}.
	 * @param ctx the parse tree
	 */
	void enterMutation_modifier(Swift3Parser.Mutation_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#mutation_modifier}.
	 * @param ctx the parse tree
	 */
	void exitMutation_modifier(Swift3Parser.Mutation_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Swift3Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Swift3Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(Swift3Parser.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(Swift3Parser.Wildcard_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pattern(Swift3Parser.Identifier_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pattern(Swift3Parser.Identifier_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValue_binding_pattern(Swift3Parser.Value_binding_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValue_binding_pattern(Swift3Parser.Value_binding_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern(Swift3Parser.Tuple_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern(Swift3Parser.Tuple_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element_list(Swift3Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element_list(Swift3Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element(Swift3Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element(Swift3Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_pattern(Swift3Parser.Enum_case_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_pattern(Swift3Parser.Enum_case_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOptional_pattern(Swift3Parser.Optional_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOptional_pattern(Swift3Parser.Optional_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void enterExpression_pattern(Swift3Parser.Expression_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void exitExpression_pattern(Swift3Parser.Expression_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Swift3Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Swift3Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(Swift3Parser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(Swift3Parser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_clause(Swift3Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_clause(Swift3Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(Swift3Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(Swift3Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_tokens(Swift3Parser.Balanced_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_tokens(Swift3Parser.Balanced_tokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token(Swift3Parser.Balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token(Swift3Parser.Balanced_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#any_punctuation_for_balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterAny_punctuation_for_balanced_token(Swift3Parser.Any_punctuation_for_balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#any_punctuation_for_balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitAny_punctuation_for_balanced_token(Swift3Parser.Any_punctuation_for_balanced_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Swift3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Swift3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(Swift3Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(Swift3Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(Swift3Parser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(Swift3Parser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_out_expression(Swift3Parser.In_out_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_out_expression(Swift3Parser.In_out_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#try_operator}.
	 * @param ctx the parse tree
	 */
	void enterTry_operator(Swift3Parser.Try_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#try_operator}.
	 * @param ctx the parse tree
	 */
	void exitTry_operator(Swift3Parser.Try_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(Swift3Parser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(Swift3Parser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expressions(Swift3Parser.Binary_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expressions(Swift3Parser.Binary_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(Swift3Parser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(Swift3Parser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_operator(Swift3Parser.Type_casting_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_operator(Swift3Parser.Type_casting_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(Swift3Parser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(Swift3Parser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(Swift3Parser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(Swift3Parser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(Swift3Parser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(Swift3Parser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_items(Swift3Parser.Array_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_items(Swift3Parser.Array_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_item(Swift3Parser.Array_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_item(Swift3Parser.Array_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal(Swift3Parser.Dictionary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal(Swift3Parser.Dictionary_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_items(Swift3Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_items(Swift3Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_item(Swift3Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_item(Swift3Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#playground_literal}.
	 * @param ctx the parse tree
	 */
	void enterPlayground_literal(Swift3Parser.Playground_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#playground_literal}.
	 * @param ctx the parse tree
	 */
	void exitPlayground_literal(Swift3Parser.Playground_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_expression(Swift3Parser.Self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_expression(Swift3Parser.Self_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_expression(Swift3Parser.Superclass_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_expression(Swift3Parser.Superclass_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_method_expression(Swift3Parser.Superclass_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_method_expression(Swift3Parser.Superclass_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_subscript_expression(Swift3Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_subscript_expression(Swift3Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_initializer_expression(Swift3Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_initializer_expression(Swift3Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(Swift3Parser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(Swift3Parser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void enterClosure_signature(Swift3Parser.Closure_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void exitClosure_signature(Swift3Parser.Closure_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closure_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter_clause(Swift3Parser.Closure_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closure_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter_clause(Swift3Parser.Closure_parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closure_parameter_clause_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter_clause_identifier_list(Swift3Parser.Closure_parameter_clause_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closure_parameter_clause_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter_clause_identifier_list(Swift3Parser.Closure_parameter_clause_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closure_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter_list(Swift3Parser.Closure_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closure_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter_list(Swift3Parser.Closure_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closure_parameter}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter(Swift3Parser.Closure_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closure_parameter}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter(Swift3Parser.Closure_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closure_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter_name(Swift3Parser.Closure_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closure_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter_name(Swift3Parser.Closure_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#capture_list}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list(Swift3Parser.Capture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#capture_list}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list(Swift3Parser.Capture_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_items(Swift3Parser.Capture_list_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_items(Swift3Parser.Capture_list_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_item(Swift3Parser.Capture_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_item(Swift3Parser.Capture_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCapture_specifier(Swift3Parser.Capture_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCapture_specifier(Swift3Parser.Capture_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_member_expression(Swift3Parser.Implicit_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_member_expression(Swift3Parser.Implicit_member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(Swift3Parser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(Swift3Parser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_expression}.
	 * @param ctx the parse tree
	 */
	void enterTuple_expression(Swift3Parser.Tuple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_expression}.
	 * @param ctx the parse tree
	 */
	void exitTuple_expression(Swift3Parser.Tuple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_element(Swift3Parser.Tuple_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_element(Swift3Parser.Tuple_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_expression(Swift3Parser.Wildcard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_expression(Swift3Parser.Wildcard_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelector_expression(Swift3Parser.Selector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelector_expression(Swift3Parser.Selector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#key_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterKey_path_expression(Swift3Parser.Key_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#key_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitKey_path_expression(Swift3Parser.Key_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_expression_with_closure}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression_with_closure(Swift3Parser.Function_call_expression_with_closureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_expression_with_closure}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression_with_closure(Swift3Parser.Function_call_expression_with_closureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(Swift3Parser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(Swift3Parser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression1(Swift3Parser.Explicit_member_expression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression1(Swift3Parser.Explicit_member_expression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression(Swift3Parser.Initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression(Swift3Parser.Initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_self_expression(Swift3Parser.Postfix_self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_self_expression(Swift3Parser.Postfix_self_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression_with_args(Swift3Parser.Initializer_expression_with_argsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression_with_args(Swift3Parser.Initializer_expression_with_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamic_type}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_type(Swift3Parser.Dynamic_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamic_type}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_type(Swift3Parser.Dynamic_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_expression(Swift3Parser.Subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_expression(Swift3Parser.Subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression2(Swift3Parser.Explicit_member_expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression2(Swift3Parser.Explicit_member_expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression3(Swift3Parser.Explicit_member_expression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression3(Swift3Parser.Explicit_member_expression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression4}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression4(Swift3Parser.Explicit_member_expression4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression4}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression4(Swift3Parser.Explicit_member_expression4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operation(Swift3Parser.Postfix_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operation(Swift3Parser.Postfix_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Swift3Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift3Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Swift3Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_call_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_argument_clause(Swift3Parser.Function_call_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_call_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_argument_clause(Swift3Parser.Function_call_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_call_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_argument_list(Swift3Parser.Function_call_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_call_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_argument_list(Swift3Parser.Function_call_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_call_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_argument(Swift3Parser.Function_call_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_call_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_argument(Swift3Parser.Function_call_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_closure(Swift3Parser.Trailing_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_closure(Swift3Parser.Trailing_closureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#argument_names}.
	 * @param ctx the parse tree
	 */
	void enterArgument_names(Swift3Parser.Argument_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#argument_names}.
	 * @param ctx the parse tree
	 */
	void exitArgument_names(Swift3Parser.Argument_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(Swift3Parser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(Swift3Parser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dynamic_type_expression}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_type_expression(Swift3Parser.Dynamic_type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dynamic_type_expression}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_type_expression(Swift3Parser.Dynamic_type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_metatype_protocol_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_metatype_protocol_type(Swift3Parser.The_metatype_protocol_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_metatype_protocol_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_metatype_protocol_type(Swift3Parser.The_metatype_protocol_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_function_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_function_type(Swift3Parser.The_function_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_function_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_function_type(Swift3Parser.The_function_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_implicitly_unwrapped_optional_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_implicitly_unwrapped_optional_type(Swift3Parser.The_implicitly_unwrapped_optional_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_implicitly_unwrapped_optional_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_implicitly_unwrapped_optional_type(Swift3Parser.The_implicitly_unwrapped_optional_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_dictionary_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_dictionary_type(Swift3Parser.The_dictionary_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_dictionary_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_dictionary_type(Swift3Parser.The_dictionary_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_optional_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_optional_type(Swift3Parser.The_optional_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_optional_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_optional_type(Swift3Parser.The_optional_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_tuple_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_tuple_type(Swift3Parser.The_tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_tuple_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_tuple_type(Swift3Parser.The_tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_self_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_self_type(Swift3Parser.The_self_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_self_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_self_type(Swift3Parser.The_self_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_array_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_array_type(Swift3Parser.The_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_array_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_array_type(Swift3Parser.The_array_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_metatype_type_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_metatype_type_type(Swift3Parser.The_metatype_type_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_metatype_type_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_metatype_type_type(Swift3Parser.The_metatype_type_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_protocol_composition_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_protocol_composition_type(Swift3Parser.The_protocol_composition_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_protocol_composition_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_protocol_composition_type(Swift3Parser.The_protocol_composition_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_any_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_any_type(Swift3Parser.The_any_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_any_type}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_any_type(Swift3Parser.The_any_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code the_type_identifier}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterThe_type_identifier(Swift3Parser.The_type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code the_type_identifier}
	 * labeled alternative in {@link Swift3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitThe_type_identifier(Swift3Parser.The_type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(Swift3Parser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(Swift3Parser.Type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(Swift3Parser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(Swift3Parser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(Swift3Parser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(Swift3Parser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(Swift3Parser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(Swift3Parser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element_list(Swift3Parser.Tuple_type_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element_list(Swift3Parser.Tuple_type_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element(Swift3Parser.Tuple_type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element(Swift3Parser.Tuple_type_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(Swift3Parser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(Swift3Parser.Element_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(Swift3Parser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(Swift3Parser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_type_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type_argument_clause(Swift3Parser.Function_type_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_type_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type_argument_clause(Swift3Parser.Function_type_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type_argument_list(Swift3Parser.Function_type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type_argument_list(Swift3Parser.Function_type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#function_type_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type_argument(Swift3Parser.Function_type_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#function_type_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type_argument(Swift3Parser.Function_type_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#argument_label}.
	 * @param ctx the parse tree
	 */
	void enterArgument_label(Swift3Parser.Argument_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#argument_label}.
	 * @param ctx the parse tree
	 */
	void exitArgument_label(Swift3Parser.Argument_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(Swift3Parser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(Swift3Parser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionary_type}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_type(Swift3Parser.Dictionary_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionary_type}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_type(Swift3Parser.Dictionary_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_composition_type(Swift3Parser.Protocol_composition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_composition_type(Swift3Parser.Protocol_composition_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier(Swift3Parser.Protocol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier(Swift3Parser.Protocol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_clause(Swift3Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_clause(Swift3Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_list(Swift3Parser.Type_inheritance_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_list(Swift3Parser.Type_inheritance_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#class_requirement}.
	 * @param ctx the parse tree
	 */
	void enterClass_requirement(Swift3Parser.Class_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#class_requirement}.
	 * @param ctx the parse tree
	 */
	void exitClass_requirement(Swift3Parser.Class_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declaration_identifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_identifier(Swift3Parser.Declaration_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declaration_identifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_identifier(Swift3Parser.Declaration_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#label_identifier}.
	 * @param ctx the parse tree
	 */
	void enterLabel_identifier(Swift3Parser.Label_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#label_identifier}.
	 * @param ctx the parse tree
	 */
	void exitLabel_identifier(Swift3Parser.Label_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#keyword_as_identifier_in_declarations}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_as_identifier_in_declarations(Swift3Parser.Keyword_as_identifier_in_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#keyword_as_identifier_in_declarations}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_as_identifier_in_declarations(Swift3Parser.Keyword_as_identifier_in_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#keyword_as_identifier_in_labels}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_as_identifier_in_labels(Swift3Parser.Keyword_as_identifier_in_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#keyword_as_identifier_in_labels}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_as_identifier_in_labels(Swift3Parser.Keyword_as_identifier_in_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(Swift3Parser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(Swift3Parser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterNegate_prefix_operator(Swift3Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitNegate_prefix_operator(Swift3Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilation_condition_AND}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition_AND(Swift3Parser.Compilation_condition_ANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilation_condition_AND}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition_AND(Swift3Parser.Compilation_condition_ANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilation_condition_OR}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition_OR(Swift3Parser.Compilation_condition_ORContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilation_condition_OR}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition_OR(Swift3Parser.Compilation_condition_ORContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilation_condition_GE}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition_GE(Swift3Parser.Compilation_condition_GEContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilation_condition_GE}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition_GE(Swift3Parser.Compilation_condition_GEContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void enterArrow_operator(Swift3Parser.Arrow_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void exitArrow_operator(Swift3Parser.Arrow_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#range_operator}.
	 * @param ctx the parse tree
	 */
	void enterRange_operator(Swift3Parser.Range_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#range_operator}.
	 * @param ctx the parse tree
	 */
	void exitRange_operator(Swift3Parser.Range_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_equals(Swift3Parser.Same_type_equalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_equals(Swift3Parser.Same_type_equalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(Swift3Parser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(Swift3Parser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(Swift3Parser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(Swift3Parser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator(Swift3Parser.Postfix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator(Swift3Parser.Postfix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(Swift3Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(Swift3Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operator_character}.
	 * @param ctx the parse tree
	 */
	void enterOperator_character(Swift3Parser.Operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operator_character}.
	 * @param ctx the parse tree
	 */
	void exitOperator_character(Swift3Parser.Operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operator_head}.
	 * @param ctx the parse tree
	 */
	void enterOperator_head(Swift3Parser.Operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operator_head}.
	 * @param ctx the parse tree
	 */
	void exitOperator_head(Swift3Parser.Operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_head(Swift3Parser.Dot_operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_head(Swift3Parser.Dot_operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_character(Swift3Parser.Dot_operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_character(Swift3Parser.Dot_operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Swift3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Swift3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(Swift3Parser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(Swift3Parser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(Swift3Parser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(Swift3Parser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void enterNil_literal(Swift3Parser.Nil_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void exitNil_literal(Swift3Parser.Nil_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(Swift3Parser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(Swift3Parser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(Swift3Parser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(Swift3Parser.String_literalContext ctx);
}