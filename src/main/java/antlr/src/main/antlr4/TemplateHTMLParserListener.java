// Generated from src/main/antlr4/TemplateHTMLParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateHTMLParser}.
 */
public interface TemplateHTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DocumentNode}
	 * labeled alternative in {@link TemplateHTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterDocumentNode(TemplateHTMLParser.DocumentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentNode}
	 * labeled alternative in {@link TemplateHTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitDocumentNode(TemplateHTMLParser.DocumentNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeNode(TemplateHTMLParser.DoctypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeNode(TemplateHTMLParser.DoctypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaPrintNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPrintNode(TemplateHTMLParser.JinjaPrintNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaPrintNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPrintNode(TemplateHTMLParser.JinjaPrintNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCodeNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCodeNode(TemplateHTMLParser.JinjaCodeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCodeNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCodeNode(TemplateHTMLParser.JinjaCodeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTagNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagNode(TemplateHTMLParser.HtmlTagNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTagNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagNode(TemplateHTMLParser.HtmlTagNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(TemplateHTMLParser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(TemplateHTMLParser.TextNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateHTMLParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(TemplateHTMLParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateHTMLParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(TemplateHTMLParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateHTMLParser#jinjaPrint}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPrint(TemplateHTMLParser.JinjaPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateHTMLParser#jinjaPrint}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPrint(TemplateHTMLParser.JinjaPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateHTMLParser#jinjaCode}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCode(TemplateHTMLParser.JinjaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateHTMLParser#jinjaCode}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCode(TemplateHTMLParser.JinjaCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateHTMLParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(TemplateHTMLParser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateHTMLParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(TemplateHTMLParser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateHTMLParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(TemplateHTMLParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateHTMLParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(TemplateHTMLParser.HtmlTextContext ctx);
}