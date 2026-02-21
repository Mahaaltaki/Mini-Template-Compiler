// Generated from src/main/antlr4/FlaskPythonParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlaskPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlaskPythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramNode}
	 * labeled alternative in {@link FlaskPythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramNode(FlaskPythonParser.ProgramNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStat(FlaskPythonParser.ImportStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(FlaskPythonParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorStatement}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorStatement(FlaskPythonParser.DecoratorStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefStatement}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefStatement(FlaskPythonParser.FunctionDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(FlaskPythonParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(FlaskPythonParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#decoratorStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorStat(FlaskPythonParser.DecoratorStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(FlaskPythonParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(FlaskPythonParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(FlaskPythonParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(FlaskPythonParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(FlaskPythonParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpr(FlaskPythonParser.DictExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(FlaskPythonParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(FlaskPythonParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(FlaskPythonParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExprLegacy}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExprLegacy(FlaskPythonParser.IdExprLegacyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(FlaskPythonParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FlaskPythonParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#dictPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictPairs(FlaskPythonParser.DictPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(FlaskPythonParser.PairContext ctx);
}