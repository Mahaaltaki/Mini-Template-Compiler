// Generated from src/main/antlr4/SimpleCSSParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCSSParser}.
 */
public interface SimpleCSSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code StylesheetNode}
	 * labeled alternative in {@link SimpleCSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheetNode(SimpleCSSParser.StylesheetNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesheetNode}
	 * labeled alternative in {@link SimpleCSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheetNode(SimpleCSSParser.StylesheetNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RuleNode}
	 * labeled alternative in {@link SimpleCSSParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRuleNode(SimpleCSSParser.RuleNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RuleNode}
	 * labeled alternative in {@link SimpleCSSParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRuleNode(SimpleCSSParser.RuleNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorListNode}
	 * labeled alternative in {@link SimpleCSSParser#selectors}.
	 * @param ctx the parse tree
	 */
	void enterSelectorListNode(SimpleCSSParser.SelectorListNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorListNode}
	 * labeled alternative in {@link SimpleCSSParser#selectors}.
	 * @param ctx the parse tree
	 */
	void exitSelectorListNode(SimpleCSSParser.SelectorListNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(SimpleCSSParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(SimpleCSSParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(SimpleCSSParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(SimpleCSSParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterTagSelector(SimpleCSSParser.TagSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagSelector}
	 * labeled alternative in {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitTagSelector(SimpleCSSParser.TagSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link SimpleCSSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockNode(SimpleCSSParser.BlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockNode}
	 * labeled alternative in {@link SimpleCSSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockNode(SimpleCSSParser.BlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationNode}
	 * labeled alternative in {@link SimpleCSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationNode(SimpleCSSParser.DeclarationNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationNode}
	 * labeled alternative in {@link SimpleCSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationNode(SimpleCSSParser.DeclarationNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCSSParser#propName}.
	 * @param ctx the parse tree
	 */
	void enterPropName(SimpleCSSParser.PropNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCSSParser#propName}.
	 * @param ctx the parse tree
	 */
	void exitPropName(SimpleCSSParser.PropNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCSSParser#propValue}.
	 * @param ctx the parse tree
	 */
	void enterPropValue(SimpleCSSParser.PropValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCSSParser#propValue}.
	 * @param ctx the parse tree
	 */
	void exitPropValue(SimpleCSSParser.PropValueContext ctx);
}