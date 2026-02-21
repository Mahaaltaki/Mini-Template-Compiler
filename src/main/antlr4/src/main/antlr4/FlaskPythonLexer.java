// Generated from src/main/antlr4/FlaskPythonLexer.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FlaskPythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FROM=1, IMPORT=2, DEF=3, ASSIGN=4, COMMA=5, COLON=6, LBRACE=7, RBRACE=8, 
		LBRACK=9, RBRACK=10, LPAREN=11, RPAREN=12, AT=13, DOT=14, STRING=15, NUMBER=16, 
		ID=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "IMPORT", "DEF", "ASSIGN", "COMMA", "COLON", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "LPAREN", "RPAREN", "AT", "DOT", "STRING", "NUMBER", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'import'", "'def'", "'='", "','", "':'", "'{'", "'}'", 
			"'['", "']'", "'('", "')'", "'@'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "IMPORT", "DEF", "ASSIGN", "COMMA", "COLON", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "LPAREN", "RPAREN", "AT", "DOT", "STRING", 
			"NUMBER", "ID", "WS"
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


	public FlaskPythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FlaskPythonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012p\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000eN\b\u000e\n\u000e\f\u000eQ\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000eV\b\u000e\n\u000e\f\u000eY\t\u000e\u0001\u000e"+
		"\u0003\u000e\\\b\u000e\u0001\u000f\u0004\u000f_\b\u000f\u000b\u000f\f"+
		"\u000f`\u0001\u0010\u0001\u0010\u0005\u0010e\b\u0010\n\u0010\f\u0010h"+
		"\t\u0010\u0001\u0011\u0004\u0011k\b\u0011\u000b\u0011\f\u0011l\u0001\u0011"+
		"\u0001\u0011\u0002OW\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001"+
		"\u0000\u0004\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  u\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001"+
		"%\u0001\u0000\u0000\u0000\u0003*\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000"+
		"\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f"+
		"=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013A\u0001"+
		"\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000"+
		"\u0000\u0019G\u0001\u0000\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001d"+
		"[\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!b\u0001\u0000"+
		"\u0000\u0000#j\u0001\u0000\u0000\u0000%&\u0005f\u0000\u0000&\'\u0005r"+
		"\u0000\u0000\'(\u0005o\u0000\u0000()\u0005m\u0000\u0000)\u0002\u0001\u0000"+
		"\u0000\u0000*+\u0005i\u0000\u0000+,\u0005m\u0000\u0000,-\u0005p\u0000"+
		"\u0000-.\u0005o\u0000\u0000./\u0005r\u0000\u0000/0\u0005t\u0000\u0000"+
		"0\u0004\u0001\u0000\u0000\u000012\u0005d\u0000\u000023\u0005e\u0000\u0000"+
		"34\u0005f\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005=\u0000\u0000"+
		"6\b\u0001\u0000\u0000\u000078\u0005,\u0000\u00008\n\u0001\u0000\u0000"+
		"\u00009:\u0005:\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005{\u0000"+
		"\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005}\u0000\u0000>\u0010\u0001"+
		"\u0000\u0000\u0000?@\u0005[\u0000\u0000@\u0012\u0001\u0000\u0000\u0000"+
		"AB\u0005]\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0005(\u0000\u0000"+
		"D\u0016\u0001\u0000\u0000\u0000EF\u0005)\u0000\u0000F\u0018\u0001\u0000"+
		"\u0000\u0000GH\u0005@\u0000\u0000H\u001a\u0001\u0000\u0000\u0000IJ\u0005"+
		".\u0000\u0000J\u001c\u0001\u0000\u0000\u0000KO\u0005\"\u0000\u0000LN\t"+
		"\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000R\\\u0005\"\u0000\u0000SW\u0005\'\u0000"+
		"\u0000TV\t\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0005\'\u0000\u0000[K\u0001"+
		"\u0000\u0000\u0000[S\u0001\u0000\u0000\u0000\\\u001e\u0001\u0000\u0000"+
		"\u0000]_\u0007\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a \u0001"+
		"\u0000\u0000\u0000bf\u0007\u0001\u0000\u0000ce\u0007\u0002\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000g\"\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ik\u0007\u0003\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0006\u0011\u0000\u0000o$\u0001\u0000\u0000"+
		"\u0000\u0007\u0000OW[`fl\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}