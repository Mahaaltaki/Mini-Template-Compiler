// Generated from FlaskPythonParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlaskPythonParser}.
 */
public interface FlaskPythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramNode}
	 * labeled alternative in {@link FlaskPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramNode(FlaskPythonParser.ProgramNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramNode}
	 * labeled alternative in {@link FlaskPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramNode(FlaskPythonParser.ProgramNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStat(FlaskPythonParser.ImportStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStat(FlaskPythonParser.ImportStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(FlaskPythonParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(FlaskPythonParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(FlaskPythonParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(FlaskPythonParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorStatement}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorStatement(FlaskPythonParser.DecoratorStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorStatement}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorStatement(FlaskPythonParser.DecoratorStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefStatement}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefStatement(FlaskPythonParser.FunctionDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefStatement}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefStatement(FlaskPythonParser.FunctionDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(FlaskPythonParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(FlaskPythonParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(FlaskPythonParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(FlaskPythonParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#decoratorStat}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorStat(FlaskPythonParser.DecoratorStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#decoratorStat}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorStat(FlaskPythonParser.DecoratorStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(FlaskPythonParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(FlaskPythonParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(FlaskPythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(FlaskPythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(FlaskPythonParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(FlaskPythonParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(FlaskPythonParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(FlaskPythonParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(FlaskPythonParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(FlaskPythonParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDictExpr(FlaskPythonParser.DictExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDictExpr(FlaskPythonParser.DictExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(FlaskPythonParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(FlaskPythonParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(FlaskPythonParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(FlaskPythonParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(FlaskPythonParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(FlaskPythonParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExprLegacy}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExprLegacy(FlaskPythonParser.IdExprLegacyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExprLegacy}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExprLegacy(FlaskPythonParser.IdExprLegacyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(FlaskPythonParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(FlaskPythonParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FlaskPythonParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FlaskPythonParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#dictPairs}.
	 * @param ctx the parse tree
	 */
	void enterDictPairs(FlaskPythonParser.DictPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#dictPairs}.
	 * @param ctx the parse tree
	 */
	void exitDictPairs(FlaskPythonParser.DictPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskPythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(FlaskPythonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskPythonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(FlaskPythonParser.PairContext ctx);
}