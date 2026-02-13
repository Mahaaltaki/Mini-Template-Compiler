package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateHTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateHTMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code DocumentNode}
	 * labeled alternative in {@link TemplateHTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentNode(TemplateHTMLParser.DocumentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaPrintNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPrintNode(TemplateHTMLParser.JinjaPrintNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCodeNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCodeNode(TemplateHTMLParser.JinjaCodeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTagNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagNode(TemplateHTMLParser.HtmlTagNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(TemplateHTMLParser.TextNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#jinjaPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPrint(TemplateHTMLParser.JinjaPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#jinjaCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCode(TemplateHTMLParser.JinjaCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(TemplateHTMLParser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(TemplateHTMLParser.HtmlTextContext ctx);
}