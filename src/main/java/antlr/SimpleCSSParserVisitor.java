// Generated from SimpleCSSParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCSSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code StylesheetNode}
	 * labeled alternative in {@link SimpleCSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheetNode(SimpleCSSParser.StylesheetNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RuleNode}
	 * labeled alternative in {@link SimpleCSSParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleNode(SimpleCSSParser.RuleNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorListNode}
	 * labeled alternative in {@link SimpleCSSParser#selectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorListNode(SimpleCSSParser.SelectorListNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(SimpleCSSParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(SimpleCSSParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagSelector(SimpleCSSParser.TagSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link SimpleCSSParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNode(SimpleCSSParser.BlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationNode}
	 * labeled alternative in {@link SimpleCSSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationNode(SimpleCSSParser.DeclarationNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCSSParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(SimpleCSSParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCSSParser#propValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropValue(SimpleCSSParser.PropValueContext ctx);
}