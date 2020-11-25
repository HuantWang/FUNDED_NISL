// Generated from E:/raw-data/antlr4/php_swift/src/swift2\Swift2.g4 by ANTLR 4.8
package swift2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Swift2Parser}.
 */
public interface Swift2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#top_level}.
	 * @param ctx the parse tree
	 */
	void enterTop_level(Swift2Parser.Top_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#top_level}.
	 * @param ctx the parse tree
	 */
	void exitTop_level(Swift2Parser.Top_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Swift2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Swift2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Swift2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Swift2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(Swift2Parser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(Swift2Parser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(Swift2Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(Swift2Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(Swift2Parser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(Swift2Parser.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(Swift2Parser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(Swift2Parser.For_in_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(Swift2Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(Swift2Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void enterCondition_clause(Swift2Parser.Condition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void exitCondition_clause(Swift2Parser.Condition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(Swift2Parser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(Swift2Parser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Swift2Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Swift2Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#case_condition}.
	 * @param ctx the parse tree
	 */
	void enterCase_condition(Swift2Parser.Case_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#case_condition}.
	 * @param ctx the parse tree
	 */
	void exitCase_condition(Swift2Parser.Case_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_condition(Swift2Parser.Optional_binding_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_condition(Swift2Parser.Optional_binding_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#optional_binding_head}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_head(Swift2Parser.Optional_binding_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#optional_binding_head}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_head(Swift2Parser.Optional_binding_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#optional_binding_continuation_list}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_continuation_list(Swift2Parser.Optional_binding_continuation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#optional_binding_continuation_list}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_continuation_list(Swift2Parser.Optional_binding_continuation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#optional_binding_continuation}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_continuation(Swift2Parser.Optional_binding_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#optional_binding_continuation}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_continuation(Swift2Parser.Optional_binding_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_while_statement(Swift2Parser.Repeat_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_while_statement(Swift2Parser.Repeat_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(Swift2Parser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(Swift2Parser.Branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Swift2Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Swift2Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(Swift2Parser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(Swift2Parser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void enterGuard_statement(Swift2Parser.Guard_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void exitGuard_statement(Swift2Parser.Guard_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(Swift2Parser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(Swift2Parser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cases(Swift2Parser.Switch_casesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cases(Swift2Parser.Switch_casesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(Swift2Parser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(Swift2Parser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(Swift2Parser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(Swift2Parser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_list(Swift2Parser.Case_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_list(Swift2Parser.Case_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#default_label}.
	 * @param ctx the parse tree
	 */
	void enterDefault_label(Swift2Parser.Default_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#default_label}.
	 * @param ctx the parse tree
	 */
	void exitDefault_label(Swift2Parser.Default_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(Swift2Parser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(Swift2Parser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#where_expression}.
	 * @param ctx the parse tree
	 */
	void enterWhere_expression(Swift2Parser.Where_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#where_expression}.
	 * @param ctx the parse tree
	 */
	void exitWhere_expression(Swift2Parser.Where_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(Swift2Parser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(Swift2Parser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#statement_label}.
	 * @param ctx the parse tree
	 */
	void enterStatement_label(Swift2Parser.Statement_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#statement_label}.
	 * @param ctx the parse tree
	 */
	void exitStatement_label(Swift2Parser.Statement_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(Swift2Parser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(Swift2Parser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_transfer_statement(Swift2Parser.Control_transfer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_transfer_statement(Swift2Parser.Control_transfer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(Swift2Parser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(Swift2Parser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(Swift2Parser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(Swift2Parser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void enterFallthrough_statement(Swift2Parser.Fallthrough_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void exitFallthrough_statement(Swift2Parser.Fallthrough_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(Swift2Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(Swift2Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_condition(Swift2Parser.Availability_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_condition(Swift2Parser.Availability_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_arguments(Swift2Parser.Availability_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_arguments(Swift2Parser.Availability_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_argument(Swift2Parser.Availability_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_argument(Swift2Parser.Availability_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(Swift2Parser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(Swift2Parser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefer_statement(Swift2Parser.Defer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefer_statement(Swift2Parser.Defer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(Swift2Parser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(Swift2Parser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(Swift2Parser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(Swift2Parser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clause(Swift2Parser.Catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clause(Swift2Parser.Catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_control_statement(Swift2Parser.Compiler_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_control_statement(Swift2Parser.Compiler_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#build_configuration_statement}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_statement(Swift2Parser.Build_configuration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#build_configuration_statement}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_statement(Swift2Parser.Build_configuration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#build_configuration_elseif_clauses}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_elseif_clauses(Swift2Parser.Build_configuration_elseif_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#build_configuration_elseif_clauses}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_elseif_clauses(Swift2Parser.Build_configuration_elseif_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#build_configuration_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_elseif_clause(Swift2Parser.Build_configuration_elseif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#build_configuration_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_elseif_clause(Swift2Parser.Build_configuration_elseif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#build_configuration_else_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_else_clause(Swift2Parser.Build_configuration_else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#build_configuration_else_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_else_clause(Swift2Parser.Build_configuration_else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#build_configuration}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration(Swift2Parser.Build_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#build_configuration}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration(Swift2Parser.Build_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#platform_testing_function}.
	 * @param ctx the parse tree
	 */
	void enterPlatform_testing_function(Swift2Parser.Platform_testing_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#platform_testing_function}.
	 * @param ctx the parse tree
	 */
	void exitPlatform_testing_function(Swift2Parser.Platform_testing_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#operating_system}.
	 * @param ctx the parse tree
	 */
	void enterOperating_system(Swift2Parser.Operating_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#operating_system}.
	 * @param ctx the parse tree
	 */
	void exitOperating_system(Swift2Parser.Operating_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(Swift2Parser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(Swift2Parser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterLine_control_statement(Swift2Parser.Line_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitLine_control_statement(Swift2Parser.Line_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#line_number}.
	 * @param ctx the parse tree
	 */
	void enterLine_number(Swift2Parser.Line_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#line_number}.
	 * @param ctx the parse tree
	 */
	void exitLine_number(Swift2Parser.Line_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(Swift2Parser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(Swift2Parser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_clause(Swift2Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_clause(Swift2Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_list(Swift2Parser.Generic_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_list(Swift2Parser.Generic_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter(Swift2Parser.Generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter(Swift2Parser.Generic_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_clause(Swift2Parser.Requirement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_clause(Swift2Parser.Requirement_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_list(Swift2Parser.Requirement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_list(Swift2Parser.Requirement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(Swift2Parser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(Swift2Parser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void enterConformance_requirement(Swift2Parser.Conformance_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void exitConformance_requirement(Swift2Parser.Conformance_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_requirement(Swift2Parser.Same_type_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_requirement(Swift2Parser.Same_type_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_clause(Swift2Parser.Generic_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_clause(Swift2Parser.Generic_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_list(Swift2Parser.Generic_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_list(Swift2Parser.Generic_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument(Swift2Parser.Generic_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument(Swift2Parser.Generic_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Swift2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Swift2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Swift2Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Swift2Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTop_level_declaration(Swift2Parser.Top_level_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTop_level_declaration(Swift2Parser.Top_level_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(Swift2Parser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(Swift2Parser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(Swift2Parser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(Swift2Parser.Import_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#import_kind}.
	 * @param ctx the parse tree
	 */
	void enterImport_kind(Swift2Parser.Import_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#import_kind}.
	 * @param ctx the parse tree
	 */
	void exitImport_kind(Swift2Parser.Import_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#import_path}.
	 * @param ctx the parse tree
	 */
	void enterImport_path(Swift2Parser.Import_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#import_path}.
	 * @param ctx the parse tree
	 */
	void exitImport_path(Swift2Parser.Import_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImport_path_identifier(Swift2Parser.Import_path_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImport_path_identifier(Swift2Parser.Import_path_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(Swift2Parser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(Swift2Parser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer_list(Swift2Parser.Pattern_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer_list(Swift2Parser.Pattern_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer(Swift2Parser.Pattern_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer(Swift2Parser.Pattern_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(Swift2Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(Swift2Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(Swift2Parser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(Swift2Parser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_head(Swift2Parser.Variable_declaration_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_head(Swift2Parser.Variable_declaration_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(Swift2Parser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(Swift2Parser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_block(Swift2Parser.Getter_setter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_block(Swift2Parser.Getter_setter_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_clause(Swift2Parser.Getter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_clause(Swift2Parser.Getter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_clause(Swift2Parser.Setter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_clause(Swift2Parser.Setter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#setter_name}.
	 * @param ctx the parse tree
	 */
	void enterSetter_name(Swift2Parser.Setter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#setter_name}.
	 * @param ctx the parse tree
	 */
	void exitSetter_name(Swift2Parser.Setter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_keyword_block(Swift2Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_keyword_block(Swift2Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_keyword_clause(Swift2Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_keyword_clause(Swift2Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_keyword_clause(Swift2Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_keyword_clause(Swift2Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_didSet_block(Swift2Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_didSet_block(Swift2Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_clause(Swift2Parser.WillSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_clause(Swift2Parser.WillSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterDidSet_clause(Swift2Parser.DidSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitDidSet_clause(Swift2Parser.DidSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_declaration(Swift2Parser.Typealias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_declaration(Swift2Parser.Typealias_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_head(Swift2Parser.Typealias_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_head(Swift2Parser.Typealias_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_name(Swift2Parser.Typealias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_name(Swift2Parser.Typealias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_assignment(Swift2Parser.Typealias_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_assignment(Swift2Parser.Typealias_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(Swift2Parser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(Swift2Parser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(Swift2Parser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(Swift2Parser.Function_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(Swift2Parser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(Swift2Parser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(Swift2Parser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(Swift2Parser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#function_result}.
	 * @param ctx the parse tree
	 */
	void enterFunction_result(Swift2Parser.Function_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#function_result}.
	 * @param ctx the parse tree
	 */
	void exitFunction_result(Swift2Parser.Function_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(Swift2Parser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(Swift2Parser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clauses(Swift2Parser.Parameter_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clauses(Swift2Parser.Parameter_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clause(Swift2Parser.Parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clause(Swift2Parser.Parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(Swift2Parser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(Swift2Parser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Swift2Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Swift2Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterExternal_parameter_name(Swift2Parser.External_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitExternal_parameter_name(Swift2Parser.External_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_name(Swift2Parser.Local_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_name(Swift2Parser.Local_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument_clause(Swift2Parser.Default_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument_clause(Swift2Parser.Default_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(Swift2Parser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(Swift2Parser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum(Swift2Parser.Union_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum(Swift2Parser.Union_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_members(Swift2Parser.Union_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_members(Swift2Parser.Union_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_member(Swift2Parser.Union_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_member(Swift2Parser.Union_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_clause(Swift2Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_clause(Swift2Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_list(Swift2Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_list(Swift2Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case(Swift2Parser.Union_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case(Swift2Parser.Union_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(Swift2Parser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(Swift2Parser.Enum_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_name(Swift2Parser.Enum_case_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_name(Swift2Parser.Enum_case_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum(Swift2Parser.Raw_value_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum(Swift2Parser.Raw_value_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_members(Swift2Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_members(Swift2Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_member(Swift2Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_member(Swift2Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_clause(Swift2Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_clause(Swift2Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_list(Swift2Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_list(Swift2Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case(Swift2Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case(Swift2Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_assignment(Swift2Parser.Raw_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_assignment(Swift2Parser.Raw_value_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_literal(Swift2Parser.Raw_value_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_literal(Swift2Parser.Raw_value_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(Swift2Parser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(Swift2Parser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#struct_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_name(Swift2Parser.Struct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#struct_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_name(Swift2Parser.Struct_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(Swift2Parser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(Swift2Parser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(Swift2Parser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(Swift2Parser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(Swift2Parser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(Swift2Parser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(Swift2Parser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(Swift2Parser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(Swift2Parser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(Swift2Parser.Protocol_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(Swift2Parser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(Swift2Parser.Protocol_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_body(Swift2Parser.Protocol_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_body(Swift2Parser.Protocol_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declaration(Swift2Parser.Protocol_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declaration(Swift2Parser.Protocol_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declarations(Swift2Parser.Protocol_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declarations(Swift2Parser.Protocol_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_property_declaration(Swift2Parser.Protocol_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_property_declaration(Swift2Parser.Protocol_property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_method_declaration(Swift2Parser.Protocol_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_method_declaration(Swift2Parser.Protocol_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_initializer_declaration(Swift2Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_initializer_declaration(Swift2Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_subscript_declaration(Swift2Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_subscript_declaration(Swift2Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_associated_type_declaration(Swift2Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_associated_type_declaration(Swift2Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_declaration(Swift2Parser.Initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_declaration(Swift2Parser.Initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_head(Swift2Parser.Initializer_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_head(Swift2Parser.Initializer_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_body(Swift2Parser.Initializer_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_body(Swift2Parser.Initializer_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializer_declaration(Swift2Parser.Deinitializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializer_declaration(Swift2Parser.Deinitializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtension_declaration(Swift2Parser.Extension_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtension_declaration(Swift2Parser.Extension_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#extension_body}.
	 * @param ctx the parse tree
	 */
	void enterExtension_body(Swift2Parser.Extension_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#extension_body}.
	 * @param ctx the parse tree
	 */
	void exitExtension_body(Swift2Parser.Extension_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_declaration(Swift2Parser.Subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_declaration(Swift2Parser.Subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_head(Swift2Parser.Subscript_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_head(Swift2Parser.Subscript_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_result(Swift2Parser.Subscript_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_result(Swift2Parser.Subscript_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(Swift2Parser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(Swift2Parser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator_declaration(Swift2Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator_declaration(Swift2Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator_declaration(Swift2Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator_declaration(Swift2Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_declaration(Swift2Parser.Infix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_declaration(Swift2Parser.Infix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_attributes(Swift2Parser.Infix_operator_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_attributes(Swift2Parser.Infix_operator_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_clause(Swift2Parser.Precedence_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_clause(Swift2Parser.Precedence_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_level(Swift2Parser.Precedence_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_level(Swift2Parser.Precedence_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity_clause(Swift2Parser.Associativity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity_clause(Swift2Parser.Associativity_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity(Swift2Parser.AssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity(Swift2Parser.AssociativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifier(Swift2Parser.Declaration_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifier(Swift2Parser.Declaration_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifiers(Swift2Parser.Declaration_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifiers(Swift2Parser.Declaration_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_level_modifier(Swift2Parser.Access_level_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_level_modifier(Swift2Parser.Access_level_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Swift2Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Swift2Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(Swift2Parser.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(Swift2Parser.Wildcard_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pattern(Swift2Parser.Identifier_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pattern(Swift2Parser.Identifier_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValue_binding_pattern(Swift2Parser.Value_binding_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValue_binding_pattern(Swift2Parser.Value_binding_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern(Swift2Parser.Tuple_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern(Swift2Parser.Tuple_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element_list(Swift2Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element_list(Swift2Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element(Swift2Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element(Swift2Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_pattern(Swift2Parser.Enum_case_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_pattern(Swift2Parser.Enum_case_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOptional_pattern(Swift2Parser.Optional_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOptional_pattern(Swift2Parser.Optional_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void enterExpression_pattern(Swift2Parser.Expression_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void exitExpression_pattern(Swift2Parser.Expression_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Swift2Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Swift2Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(Swift2Parser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(Swift2Parser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_clause(Swift2Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_clause(Swift2Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(Swift2Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(Swift2Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_tokens(Swift2Parser.Balanced_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_tokens(Swift2Parser.Balanced_tokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token(Swift2Parser.Balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token(Swift2Parser.Balanced_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Swift2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Swift2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(Swift2Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(Swift2Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(Swift2Parser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(Swift2Parser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_out_expression(Swift2Parser.In_out_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_out_expression(Swift2Parser.In_out_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#try_operator}.
	 * @param ctx the parse tree
	 */
	void enterTry_operator(Swift2Parser.Try_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#try_operator}.
	 * @param ctx the parse tree
	 */
	void exitTry_operator(Swift2Parser.Try_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(Swift2Parser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(Swift2Parser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expressions(Swift2Parser.Binary_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expressions(Swift2Parser.Binary_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(Swift2Parser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(Swift2Parser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_operator(Swift2Parser.Type_casting_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_operator(Swift2Parser.Type_casting_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(Swift2Parser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(Swift2Parser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_member_expression(Swift2Parser.Implicit_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_member_expression(Swift2Parser.Implicit_member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(Swift2Parser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(Swift2Parser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(Swift2Parser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(Swift2Parser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_items(Swift2Parser.Array_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_items(Swift2Parser.Array_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_item(Swift2Parser.Array_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_item(Swift2Parser.Array_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal(Swift2Parser.Dictionary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal(Swift2Parser.Dictionary_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_items(Swift2Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_items(Swift2Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_item(Swift2Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_item(Swift2Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_expression(Swift2Parser.Self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_expression(Swift2Parser.Self_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_expression(Swift2Parser.Superclass_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_expression(Swift2Parser.Superclass_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_method_expression(Swift2Parser.Superclass_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_method_expression(Swift2Parser.Superclass_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_subscript_expression(Swift2Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_subscript_expression(Swift2Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_initializer_expression(Swift2Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_initializer_expression(Swift2Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(Swift2Parser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(Swift2Parser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void enterClosure_signature(Swift2Parser.Closure_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void exitClosure_signature(Swift2Parser.Closure_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#capture_list}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list(Swift2Parser.Capture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#capture_list}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list(Swift2Parser.Capture_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_items(Swift2Parser.Capture_list_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_items(Swift2Parser.Capture_list_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_item(Swift2Parser.Capture_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_item(Swift2Parser.Capture_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCapture_specifier(Swift2Parser.Capture_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCapture_specifier(Swift2Parser.Capture_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(Swift2Parser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(Swift2Parser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element_list(Swift2Parser.Expression_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element_list(Swift2Parser.Expression_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#expression_element}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element(Swift2Parser.Expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#expression_element}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element(Swift2Parser.Expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_expression(Swift2Parser.Wildcard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_expression(Swift2Parser.Wildcard_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelector_expression(Swift2Parser.Selector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelector_expression(Swift2Parser.Selector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(Swift2Parser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(Swift2Parser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression1(Swift2Parser.Explicit_member_expression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression1(Swift2Parser.Explicit_member_expression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression(Swift2Parser.Initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression(Swift2Parser.Initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamic_type_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_type_expression(Swift2Parser.Dynamic_type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamic_type_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_type_expression(Swift2Parser.Dynamic_type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_self_expression(Swift2Parser.Postfix_self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_self_expression(Swift2Parser.Postfix_self_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_with_closure_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_with_closure_expression(Swift2Parser.Function_call_with_closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_with_closure_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_with_closure_expression(Swift2Parser.Function_call_with_closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression_with_args(Swift2Parser.Initializer_expression_with_argsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression_with_args(Swift2Parser.Initializer_expression_with_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_expression(Swift2Parser.Subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_expression(Swift2Parser.Subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression2(Swift2Parser.Explicit_member_expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression2(Swift2Parser.Explicit_member_expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression3(Swift2Parser.Explicit_member_expression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression3(Swift2Parser.Explicit_member_expression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression4}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression4(Swift2Parser.Explicit_member_expression4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression4}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression4(Swift2Parser.Explicit_member_expression4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operation(Swift2Parser.Postfix_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operation(Swift2Parser.Postfix_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Swift2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift2Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Swift2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#argument_names}.
	 * @param ctx the parse tree
	 */
	void enterArgument_names(Swift2Parser.Argument_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#argument_names}.
	 * @param ctx the parse tree
	 */
	void exitArgument_names(Swift2Parser.Argument_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(Swift2Parser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(Swift2Parser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_closure(Swift2Parser.Trailing_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_closure(Swift2Parser.Trailing_closureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Swift2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Swift2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(Swift2Parser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(Swift2Parser.Type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(Swift2Parser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(Swift2Parser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(Swift2Parser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(Swift2Parser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(Swift2Parser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(Swift2Parser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_body(Swift2Parser.Tuple_type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_body(Swift2Parser.Tuple_type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element_list(Swift2Parser.Tuple_type_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element_list(Swift2Parser.Tuple_type_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element(Swift2Parser.Tuple_type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element(Swift2Parser.Tuple_type_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(Swift2Parser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(Swift2Parser.Element_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_composition_type(Swift2Parser.Protocol_composition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_composition_type(Swift2Parser.Protocol_composition_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier_list(Swift2Parser.Protocol_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier_list(Swift2Parser.Protocol_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier(Swift2Parser.Protocol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier(Swift2Parser.Protocol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_clause(Swift2Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_clause(Swift2Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_list(Swift2Parser.Type_inheritance_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_list(Swift2Parser.Type_inheritance_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#class_requirement}.
	 * @param ctx the parse tree
	 */
	void enterClass_requirement(Swift2Parser.Class_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#class_requirement}.
	 * @param ctx the parse tree
	 */
	void exitClass_requirement(Swift2Parser.Class_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Swift2Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Swift2Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(Swift2Parser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(Swift2Parser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void enterContext_sensitive_keyword(Swift2Parser.Context_sensitive_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void exitContext_sensitive_keyword(Swift2Parser.Context_sensitive_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(Swift2Parser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(Swift2Parser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterNegate_prefix_operator(Swift2Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitNegate_prefix_operator(Swift2Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#build_AND}.
	 * @param ctx the parse tree
	 */
	void enterBuild_AND(Swift2Parser.Build_ANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#build_AND}.
	 * @param ctx the parse tree
	 */
	void exitBuild_AND(Swift2Parser.Build_ANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#build_OR}.
	 * @param ctx the parse tree
	 */
	void enterBuild_OR(Swift2Parser.Build_ORContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#build_OR}.
	 * @param ctx the parse tree
	 */
	void exitBuild_OR(Swift2Parser.Build_ORContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void enterArrow_operator(Swift2Parser.Arrow_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void exitArrow_operator(Swift2Parser.Arrow_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#range_operator}.
	 * @param ctx the parse tree
	 */
	void enterRange_operator(Swift2Parser.Range_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#range_operator}.
	 * @param ctx the parse tree
	 */
	void exitRange_operator(Swift2Parser.Range_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_equals(Swift2Parser.Same_type_equalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_equals(Swift2Parser.Same_type_equalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(Swift2Parser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(Swift2Parser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(Swift2Parser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(Swift2Parser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator(Swift2Parser.Postfix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator(Swift2Parser.Postfix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(Swift2Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(Swift2Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#operator_character}.
	 * @param ctx the parse tree
	 */
	void enterOperator_character(Swift2Parser.Operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#operator_character}.
	 * @param ctx the parse tree
	 */
	void exitOperator_character(Swift2Parser.Operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#operator_head}.
	 * @param ctx the parse tree
	 */
	void enterOperator_head(Swift2Parser.Operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#operator_head}.
	 * @param ctx the parse tree
	 */
	void exitOperator_head(Swift2Parser.Operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_head(Swift2Parser.Dot_operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_head(Swift2Parser.Dot_operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_character(Swift2Parser.Dot_operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_character(Swift2Parser.Dot_operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Swift2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Swift2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(Swift2Parser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(Swift2Parser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(Swift2Parser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(Swift2Parser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void enterNil_literal(Swift2Parser.Nil_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void exitNil_literal(Swift2Parser.Nil_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(Swift2Parser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(Swift2Parser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift2Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(Swift2Parser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift2Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(Swift2Parser.String_literalContext ctx);
}