// Generated from src/main/antlr4/TemplateHTMLParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TemplateHTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, JINJA_VAR=2, JINJA_TAG=3, TAG=4, TEXT=5, WS=6;
	public static final int
		RULE_htmlDocument = 0, RULE_node = 1, RULE_doctype = 2, RULE_jinjaPrint = 3, 
		RULE_jinjaCode = 4, RULE_htmlTag = 5, RULE_htmlText = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "node", "doctype", "jinjaPrint", "jinjaCode", "htmlTag", 
			"htmlText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "JINJA_VAR", "JINJA_TAG", "TAG", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TemplateHTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateHTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
	 
		public HtmlDocumentContext() { }
		public void copyFrom(HtmlDocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DocumentNodeContext extends HtmlDocumentContext {
		public TerminalNode EOF() { return getToken(TemplateHTMLParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public DocumentNodeContext(HtmlDocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterDocumentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitDocumentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitDocumentNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			_localctx = new DocumentNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				{
				setState(14);
				node();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	 
		public NodeContext() { }
		public void copyFrom(NodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPrintNodeContext extends NodeContext {
		public JinjaPrintContext jinjaPrint() {
			return getRuleContext(JinjaPrintContext.class,0);
		}
		public JinjaPrintNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterJinjaPrintNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitJinjaPrintNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaPrintNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCodeNodeContext extends NodeContext {
		public JinjaCodeContext jinjaCode() {
			return getRuleContext(JinjaCodeContext.class,0);
		}
		public JinjaCodeNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterJinjaCodeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitJinjaCodeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaCodeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextNodeContext extends NodeContext {
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public TextNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNodeContext extends NodeContext {
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public HtmlTagNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterHtmlTagNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitHtmlTagNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitHtmlTagNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeNodeContext extends NodeContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public DoctypeNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterDoctypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitDoctypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitDoctypeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOCTYPE:
				_localctx = new DoctypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				doctype();
				}
				break;
			case JINJA_VAR:
				_localctx = new JinjaPrintNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				jinjaPrint();
				}
				break;
			case JINJA_TAG:
				_localctx = new JinjaCodeNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				jinjaCode();
				}
				break;
			case TAG:
				_localctx = new HtmlTagNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				htmlTag();
				}
				break;
			case TEXT:
				_localctx = new TextNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				htmlText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(TemplateHTMLParser.DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(DOCTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPrintContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR() { return getToken(TemplateHTMLParser.JINJA_VAR, 0); }
		public JinjaPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterJinjaPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitJinjaPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPrintContext jinjaPrint() throws RecognitionException {
		JinjaPrintContext _localctx = new JinjaPrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jinjaPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(JINJA_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCodeContext extends ParserRuleContext {
		public TerminalNode JINJA_TAG() { return getToken(TemplateHTMLParser.JINJA_TAG, 0); }
		public JinjaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterJinjaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitJinjaCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCodeContext jinjaCode() throws RecognitionException {
		JinjaCodeContext _localctx = new JinjaCodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jinjaCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(JINJA_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(TemplateHTMLParser.TAG, 0); }
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateHTMLParser.TEXT, 0); }
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateHTMLParserListener ) ((TemplateHTMLParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0006(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000%\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000"+
		"\u0000\u0000\u0006\u001f\u0001\u0000\u0000\u0000\b!\u0001\u0000\u0000"+
		"\u0000\n#\u0001\u0000\u0000\u0000\f%\u0001\u0000\u0000\u0000\u000e\u0010"+
		"\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001"+
		"\u0001\u0000\u0000\u0000\u0016\u001c\u0003\u0004\u0002\u0000\u0017\u001c"+
		"\u0003\u0006\u0003\u0000\u0018\u001c\u0003\b\u0004\u0000\u0019\u001c\u0003"+
		"\n\u0005\u0000\u001a\u001c\u0003\f\u0006\u0000\u001b\u0016\u0001\u0000"+
		"\u0000\u0000\u001b\u0017\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001"+
		"\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f \u0005\u0002\u0000"+
		"\u0000 \u0007\u0001\u0000\u0000\u0000!\"\u0005\u0003\u0000\u0000\"\t\u0001"+
		"\u0000\u0000\u0000#$\u0005\u0004\u0000\u0000$\u000b\u0001\u0000\u0000"+
		"\u0000%&\u0005\u0005\u0000\u0000&\r\u0001\u0000\u0000\u0000\u0002\u0011"+
		"\u001b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}