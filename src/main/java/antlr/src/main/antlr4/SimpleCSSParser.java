// Generated from src/main/antlr4/SimpleCSSParser.g4 by ANTLR 4.13.1
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
public class SimpleCSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMBER=2, WS=3, DOT=4, HASH=5, COMMA=6, COLON=7, SEMI=8, LBRACE=9, 
		RBRACE=10, PERCENT=11, LPAREN=12, RPAREN=13, DASH=14;
	public static final int
		RULE_stylesheet = 0, RULE_rule = 1, RULE_selectors = 2, RULE_selector = 3, 
		RULE_block = 4, RULE_declaration = 5, RULE_propName = 6, RULE_propValue = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "rule", "selectors", "selector", "block", "declaration", 
			"propName", "propValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'", "'#'", "','", "':'", "';'", "'{'", "'}'", 
			"'%'", "'('", "')'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "NUMBER", "WS", "DOT", "HASH", "COMMA", "COLON", "SEMI", 
			"LBRACE", "RBRACE", "PERCENT", "LPAREN", "RPAREN", "DASH"
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
	public String getGrammarFileName() { return "SimpleCSSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
	 
		public StylesheetContext() { }
		public void copyFrom(StylesheetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetNodeContext extends StylesheetContext {
		public TerminalNode EOF() { return getToken(SimpleCSSParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public StylesheetNodeContext(StylesheetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterStylesheetNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitStylesheetNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitStylesheetNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			_localctx = new StylesheetNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0)) {
				{
				{
				setState(16);
				rule_();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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
	public static class RuleContext extends ParserRuleContext {
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
	 
		public RuleContext() { }
		public void copyFrom(RuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNodeContext extends RuleContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RuleNodeContext(RuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterRuleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitRuleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitRuleNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		try {
			_localctx = new RuleNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			selectors();
			setState(25);
			block();
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
	public static class SelectorsContext extends ParserRuleContext {
		public SelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectors; }
	 
		public SelectorsContext() { }
		public void copyFrom(SelectorsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorListNodeContext extends SelectorsContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleCSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleCSSParser.COMMA, i);
		}
		public SelectorListNodeContext(SelectorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterSelectorListNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitSelectorListNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitSelectorListNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorsContext selectors() throws RecognitionException {
		SelectorsContext _localctx = new SelectorsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectors);
		int _la;
		try {
			_localctx = new SelectorListNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			selector();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(28);
				match(COMMA);
				setState(29);
				selector();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends SelectorContext {
		public TerminalNode HASH() { return getToken(SimpleCSSParser.HASH, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleCSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleCSSParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(SimpleCSSParser.COLON, 0); }
		public IdSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends SelectorContext {
		public TerminalNode DOT() { return getToken(SimpleCSSParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleCSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleCSSParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(SimpleCSSParser.COLON, 0); }
		public ClassSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagSelectorContext extends SelectorContext {
		public List<TerminalNode> ID() { return getTokens(SimpleCSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleCSSParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(SimpleCSSParser.COLON, 0); }
		public TagSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterTagSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitTagSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitTagSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(DOT);
				setState(36);
				match(ID);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(37);
					match(ID);
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(40);
					match(COLON);
					setState(41);
					match(ID);
					}
				}

				}
				break;
			case HASH:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(HASH);
				setState(45);
				match(ID);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(46);
					match(ID);
					}
				}

				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(49);
					match(COLON);
					setState(50);
					match(ID);
					}
				}

				}
				break;
			case ID:
				_localctx = new TagSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(ID);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(54);
					match(ID);
					}
				}

				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(57);
					match(COLON);
					setState(58);
					match(ID);
					}
				}

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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockNodeContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(SimpleCSSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleCSSParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public BlockNodeContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			_localctx = new BlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(LBRACE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(64);
				declaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(RBRACE);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationNodeContext extends DeclarationContext {
		public PropNameContext propName() {
			return getRuleContext(PropNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimpleCSSParser.COLON, 0); }
		public PropValueContext propValue() {
			return getRuleContext(PropValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleCSSParser.SEMI, 0); }
		public DeclarationNodeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterDeclarationNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitDeclarationNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitDeclarationNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			_localctx = new DeclarationNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			propName();
			setState(73);
			match(COLON);
			setState(74);
			propValue();
			setState(75);
			match(SEMI);
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
	public static class PropNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleCSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleCSSParser.ID, i);
		}
		public TerminalNode DASH() { return getToken(SimpleCSSParser.DASH, 0); }
		public PropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterPropName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitPropName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitPropName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropNameContext propName() throws RecognitionException {
		PropNameContext _localctx = new PropNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propName);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(ID);
				setState(79);
				match(DASH);
				setState(80);
				match(ID);
				}
				break;
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
	public static class PropValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleCSSParser.ID, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SimpleCSSParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleCSSParser.NUMBER, i);
		}
		public TerminalNode HASH() { return getToken(SimpleCSSParser.HASH, 0); }
		public TerminalNode PERCENT() { return getToken(SimpleCSSParser.PERCENT, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleCSSParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleCSSParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimpleCSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleCSSParser.COMMA, i);
		}
		public PropValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).enterPropValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCSSParserListener ) ((SimpleCSSParserListener)listener).exitPropValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSParserVisitor ) return ((SimpleCSSParserVisitor<? extends T>)visitor).visitPropValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropValueContext propValue() throws RecognitionException {
		PropValueContext _localctx = new PropValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propValue);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(HASH);
				setState(86);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(NUMBER);
				setState(88);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(NUMBER);
				setState(90);
				match(PERCENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(ID);
				setState(92);
				match(LPAREN);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(93);
					match(NUMBER);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(94);
						match(COMMA);
						setState(95);
						match(NUMBER);
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(103);
				match(RPAREN);
				}
				break;
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
		"\u0004\u0001\u000ek\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00030\b\u0003\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00038\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"<\b\u0003\u0003\u0003>\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004B\b"+
		"\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007a\b"+
		"\u0007\n\u0007\f\u0007d\t\u0007\u0003\u0007f\b\u0007\u0001\u0007\u0003"+
		"\u0007i\b\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0000\u0000u\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0018"+
		"\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006=\u0001"+
		"\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000"+
		"\fQ\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a"+
		"\u0003\b\u0004\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b \u0003"+
		"\u0006\u0003\u0000\u001c\u001d\u0005\u0006\u0000\u0000\u001d\u001f\u0003"+
		"\u0006\u0003\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\u0005\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0004"+
		"\u0000\u0000$&\u0005\u0001\u0000\u0000%\'\u0005\u0001\u0000\u0000&%\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"()\u0005\u0007\u0000\u0000)+\u0005\u0001\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+>\u0001\u0000\u0000\u0000,-\u0005\u0005"+
		"\u0000\u0000-/\u0005\u0001\u0000\u0000.0\u0005\u0001\u0000\u0000/.\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u0000"+
		"12\u0005\u0007\u0000\u000024\u0005\u0001\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004>\u0001\u0000\u0000\u000057\u0005\u0001"+
		"\u0000\u000068\u0005\u0001\u0000\u000076\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u00009:\u0005\u0007\u0000\u0000"+
		":<\u0005\u0001\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<>\u0001\u0000\u0000\u0000=#\u0001\u0000\u0000\u0000=,\u0001\u0000"+
		"\u0000\u0000=5\u0001\u0000\u0000\u0000>\u0007\u0001\u0000\u0000\u0000"+
		"?C\u0005\t\u0000\u0000@B\u0003\n\u0005\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\n\u0000"+
		"\u0000G\t\u0001\u0000\u0000\u0000HI\u0003\f\u0006\u0000IJ\u0005\u0007"+
		"\u0000\u0000JK\u0003\u000e\u0007\u0000KL\u0005\b\u0000\u0000L\u000b\u0001"+
		"\u0000\u0000\u0000MR\u0005\u0001\u0000\u0000NO\u0005\u0001\u0000\u0000"+
		"OP\u0005\u000e\u0000\u0000PR\u0005\u0001\u0000\u0000QM\u0001\u0000\u0000"+
		"\u0000QN\u0001\u0000\u0000\u0000R\r\u0001\u0000\u0000\u0000Si\u0005\u0001"+
		"\u0000\u0000Ti\u0005\u0002\u0000\u0000UV\u0005\u0005\u0000\u0000Vi\u0005"+
		"\u0001\u0000\u0000WX\u0005\u0002\u0000\u0000Xi\u0005\u0001\u0000\u0000"+
		"YZ\u0005\u0002\u0000\u0000Zi\u0005\u000b\u0000\u0000[\\\u0005\u0001\u0000"+
		"\u0000\\e\u0005\f\u0000\u0000]b\u0005\u0002\u0000\u0000^_\u0005\u0006"+
		"\u0000\u0000_a\u0005\u0002\u0000\u0000`^\u0001\u0000\u0000\u0000ad\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0005\r\u0000"+
		"\u0000hS\u0001\u0000\u0000\u0000hT\u0001\u0000\u0000\u0000hU\u0001\u0000"+
		"\u0000\u0000hW\u0001\u0000\u0000\u0000hY\u0001\u0000\u0000\u0000h[\u0001"+
		"\u0000\u0000\u0000i\u000f\u0001\u0000\u0000\u0000\u000e\u0013 &*/37;="+
		"CQbeh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}