// Generated from FlaskPythonParser.g4 by ANTLR 4.13.1
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
public class FlaskPythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FROM=1, IMPORT=2, DEF=3, RETURN=4, ASSIGN=5, COMMA=6, COLON=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, LPAREN=12, RPAREN=13, AT=14, DOT=15, STRING=16, 
		NUMBER=17, ID=18, WS=19;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_idList = 2, RULE_decoratorStat = 3, 
		RULE_funcDef = 4, RULE_dottedName = 5, RULE_paramList = 6, RULE_expression = 7, 
		RULE_argList = 8, RULE_expressionList = 9, RULE_dictPairs = 10, RULE_pair = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "idList", "decoratorStat", "funcDef", "dottedName", 
			"paramList", "expression", "argList", "expressionList", "dictPairs", 
			"pair"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'import'", "'def'", "'return'", "'='", "','", "':'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "'@'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "IMPORT", "DEF", "RETURN", "ASSIGN", "COMMA", "COLON", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "LPAREN", "RPAREN", "AT", "DOT", 
			"STRING", "NUMBER", "ID", "WS"
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
	public String getGrammarFileName() { return "FlaskPythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlaskPythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramNodeContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(FlaskPythonParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramNodeContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterProgramNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitProgramNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitProgramNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 476442L) != 0)) {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterExprStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitExprStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitExprStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(FlaskPythonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatContext extends StatementContext {
		public TerminalNode ID() { return getToken(FlaskPythonParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FlaskPythonParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefStatementContext extends StatementContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FunctionDefStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterFunctionDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitFunctionDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitFunctionDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatContext extends StatementContext {
		public Token src;
		public TerminalNode FROM() { return getToken(FlaskPythonParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(FlaskPythonParser.IMPORT, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode ID() { return getToken(FlaskPythonParser.ID, 0); }
		public ImportStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterImportStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitImportStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitImportStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorStatementContext extends StatementContext {
		public DecoratorStatContext decoratorStat() {
			return getRuleContext(DecoratorStatContext.class,0);
		}
		public DecoratorStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterDecoratorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitDecoratorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitDecoratorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ImportStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(FROM);
				setState(33);
				((ImportStatContext)_localctx).src = match(ID);
				setState(34);
				match(IMPORT);
				setState(35);
				idList();
				}
				break;
			case 2:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(ID);
				setState(37);
				match(ASSIGN);
				setState(38);
				expression();
				}
				break;
			case 3:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(RETURN);
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(40);
					expression();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new DecoratorStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				decoratorStat();
				}
				break;
			case 5:
				_localctx = new FunctionDefStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				funcDef();
				}
				break;
			case 6:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				expression();
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
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FlaskPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FlaskPythonParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskPythonParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(49);
				match(COMMA);
				setState(50);
				match(ID);
				}
				}
				setState(55);
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
	public static class DecoratorStatContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(FlaskPythonParser.AT, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FlaskPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FlaskPythonParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public DecoratorStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterDecoratorStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitDecoratorStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitDecoratorStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorStatContext decoratorStat() throws RecognitionException {
		DecoratorStatContext _localctx = new DecoratorStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decoratorStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(AT);
			setState(57);
			dottedName();
			setState(58);
			match(LPAREN);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 460032L) != 0)) {
				{
				setState(59);
				argList();
				}
			}

			setState(62);
			match(RPAREN);
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
	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FlaskPythonParser.DEF, 0); }
		public TerminalNode ID() { return getToken(FlaskPythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(FlaskPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FlaskPythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(FlaskPythonParser.COLON, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(DEF);
			setState(65);
			match(ID);
			setState(66);
			match(LPAREN);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(67);
				paramList();
				}
			}

			setState(70);
			match(RPAREN);
			setState(71);
			match(COLON);
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
	public static class DottedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FlaskPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FlaskPythonParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(FlaskPythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FlaskPythonParser.DOT, i);
		}
		public DottedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterDottedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitDottedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitDottedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedNameContext dottedName() throws RecognitionException {
		DottedNameContext _localctx = new DottedNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dottedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(74);
				match(DOT);
				setState(75);
				match(ID);
				}
				}
				setState(80);
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
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FlaskPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FlaskPythonParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskPythonParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				match(ID);
				}
				}
				setState(88);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(FlaskPythonParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(FlaskPythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(FlaskPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FlaskPythonParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpressionContext {
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(FlaskPythonParser.NUMBER, 0); }
		public NumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExprContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(FlaskPythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FlaskPythonParser.RBRACE, 0); }
		public DictPairsContext dictPairs() {
			return getRuleContext(DictPairsContext.class,0);
		}
		public DictExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterDictExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitDictExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitDictExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends ExpressionContext {
		public TerminalNode LBRACK() { return getToken(FlaskPythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FlaskPythonParser.RBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprLegacyContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(FlaskPythonParser.ID, 0); }
		public IdExprLegacyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterIdExprLegacy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitIdExprLegacy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitIdExprLegacy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new FunctionCallExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(ID);
				setState(90);
				match(LPAREN);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 460032L) != 0)) {
					{
					setState(91);
					argList();
					}
				}

				setState(94);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(LBRACK);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 460032L) != 0)) {
					{
					setState(96);
					expressionList();
					}
				}

				setState(99);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new DictExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(LBRACE);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 460032L) != 0)) {
					{
					setState(101);
					dictPairs();
					}
				}

				setState(104);
				match(RBRACE);
				}
				break;
			case 4:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(NUMBER);
				}
				break;
			case 6:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				dottedName();
				}
				break;
			case 7:
				_localctx = new IdExprLegacyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskPythonParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expression();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				expression();
				}
				}
				setState(118);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskPythonParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			expression();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				expression();
				}
				}
				setState(126);
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
	public static class DictPairsContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskPythonParser.COMMA, i);
		}
		public DictPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictPairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterDictPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitDictPairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitDictPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictPairsContext dictPairs() throws RecognitionException {
		DictPairsContext _localctx = new DictPairsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dictPairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			pair();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				pair();
				}
				}
				setState(134);
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
	public static class PairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FlaskPythonParser.COLON, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskPythonParserListener ) ((FlaskPythonParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskPythonParserVisitor ) return ((FlaskPythonParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expression();
			setState(136);
			match(COLON);
			setState(137);
			expression();
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
		"\u0004\u0001\u0013\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006U\b\u0006\n\u0006"+
		"\f\u0006X\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007]\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007b\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\bs\b\b\n\b\f\bv\t\b\u0001\t\u0001\t\u0001\t\u0005\t{"+
		"\b\t\n\t\f\t~\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u0083\b\n\n\n\f\n\u0086"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0000\u0097\u0000\u001b\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000"+
		"\u0000\u00040\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b"+
		"@\u0001\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000"+
		"\u0000\u000em\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012"+
		"w\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u0087"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\u0001"+
		"\u0000\u0000!\"\u0005\u0012\u0000\u0000\"#\u0005\u0002\u0000\u0000#/\u0003"+
		"\u0004\u0002\u0000$%\u0005\u0012\u0000\u0000%&\u0005\u0005\u0000\u0000"+
		"&/\u0003\u000e\u0007\u0000\')\u0005\u0004\u0000\u0000(*\u0003\u000e\u0007"+
		"\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*/\u0001\u0000"+
		"\u0000\u0000+/\u0003\u0006\u0003\u0000,/\u0003\b\u0004\u0000-/\u0003\u000e"+
		"\u0007\u0000. \u0001\u0000\u0000\u0000.$\u0001\u0000\u0000\u0000.\'\u0001"+
		"\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u000005\u0005\u0012"+
		"\u0000\u000012\u0005\u0006\u0000\u000024\u0005\u0012\u0000\u000031\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000089\u0005\u000e\u0000\u00009:\u0003\n\u0005\u0000:<\u0005\f"+
		"\u0000\u0000;=\u0003\u0010\b\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005\r\u0000\u0000?\u0007\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000AB\u0005\u0012\u0000\u0000"+
		"BD\u0005\f\u0000\u0000CE\u0003\f\u0006\u0000DC\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\r\u0000\u0000"+
		"GH\u0005\u0007\u0000\u0000H\t\u0001\u0000\u0000\u0000IN\u0005\u0012\u0000"+
		"\u0000JK\u0005\u000f\u0000\u0000KM\u0005\u0012\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000O\u000b\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QV\u0005\u0012\u0000\u0000RS\u0005\u0006\u0000\u0000SU\u0005\u0012"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\u0012\u0000\u0000Z\\\u0005\f\u0000"+
		"\u0000[]\u0003\u0010\b\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^n\u0005\r\u0000\u0000_a\u0005\n"+
		"\u0000\u0000`b\u0003\u0012\t\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cn\u0005\u000b\u0000\u0000df\u0005"+
		"\b\u0000\u0000eg\u0003\u0014\n\u0000fe\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hn\u0005\t\u0000\u0000in\u0005"+
		"\u0010\u0000\u0000jn\u0005\u0011\u0000\u0000kn\u0003\n\u0005\u0000ln\u0005"+
		"\u0012\u0000\u0000mY\u0001\u0000\u0000\u0000m_\u0001\u0000\u0000\u0000"+
		"md\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u000f\u0001"+
		"\u0000\u0000\u0000ot\u0003\u000e\u0007\u0000pq\u0005\u0006\u0000\u0000"+
		"qs\u0003\u000e\u0007\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0011\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w|\u0003\u000e\u0007\u0000"+
		"xy\u0005\u0006\u0000\u0000y{\u0003\u000e\u0007\u0000zx\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u0013\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0084\u0003\u0016\u000b\u0000\u0080\u0081\u0005\u0006\u0000\u0000"+
		"\u0081\u0083\u0003\u0016\u000b\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u000e\u0007\u0000"+
		"\u0088\u0089\u0005\u0007\u0000\u0000\u0089\u008a\u0003\u000e\u0007\u0000"+
		"\u008a\u0017\u0001\u0000\u0000\u0000\u000f\u001b).5<DNV\\afmt|\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}