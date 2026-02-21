// Generated from FlaskPythonLexer.g4 by ANTLR 4.13.1
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
		FROM=1, IMPORT=2, DEF=3, RETURN=4, ASSIGN=5, COMMA=6, COLON=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, LPAREN=12, RPAREN=13, AT=14, DOT=15, STRING=16, 
		NUMBER=17, ID=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "IMPORT", "DEF", "RETURN", "ASSIGN", "COMMA", "COLON", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "LPAREN", "RPAREN", "AT", "DOT", "STRING", 
			"NUMBER", "ID", "WS"
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
		"\u0004\u0000\u0013y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000fW\b\u000f\n\u000f"+
		"\f\u000fZ\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f_\b\u000f"+
		"\n\u000f\f\u000fb\t\u000f\u0001\u000f\u0003\u000fe\b\u000f\u0001\u0010"+
		"\u0004\u0010h\b\u0010\u000b\u0010\f\u0010i\u0001\u0011\u0001\u0011\u0005"+
		"\u0011n\b\u0011\n\u0011\f\u0011q\t\u0011\u0001\u0012\u0004\u0012t\b\u0012"+
		"\u000b\u0012\f\u0012u\u0001\u0012\u0001\u0012\u0002X`\u0000\u0013\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0004\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  ~\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000"+
		"\u00053\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t>\u0001"+
		"\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rB\u0001\u0000\u0000"+
		"\u0000\u000fD\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013"+
		"H\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017L\u0001"+
		"\u0000\u0000\u0000\u0019N\u0001\u0000\u0000\u0000\u001bP\u0001\u0000\u0000"+
		"\u0000\u001dR\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!"+
		"g\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%s\u0001\u0000\u0000"+
		"\u0000\'(\u0005f\u0000\u0000()\u0005r\u0000\u0000)*\u0005o\u0000\u0000"+
		"*+\u0005m\u0000\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005i\u0000\u0000"+
		"-.\u0005m\u0000\u0000./\u0005p\u0000\u0000/0\u0005o\u0000\u000001\u0005"+
		"r\u0000\u000012\u0005t\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005"+
		"d\u0000\u000045\u0005e\u0000\u000056\u0005f\u0000\u00006\u0006\u0001\u0000"+
		"\u0000\u000078\u0005r\u0000\u000089\u0005e\u0000\u00009:\u0005t\u0000"+
		"\u0000:;\u0005u\u0000\u0000;<\u0005r\u0000\u0000<=\u0005n\u0000\u0000"+
		"=\b\u0001\u0000\u0000\u0000>?\u0005=\u0000\u0000?\n\u0001\u0000\u0000"+
		"\u0000@A\u0005,\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005:\u0000"+
		"\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005{\u0000\u0000E\u0010\u0001"+
		"\u0000\u0000\u0000FG\u0005}\u0000\u0000G\u0012\u0001\u0000\u0000\u0000"+
		"HI\u0005[\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005]\u0000\u0000"+
		"K\u0016\u0001\u0000\u0000\u0000LM\u0005(\u0000\u0000M\u0018\u0001\u0000"+
		"\u0000\u0000NO\u0005)\u0000\u0000O\u001a\u0001\u0000\u0000\u0000PQ\u0005"+
		"@\u0000\u0000Q\u001c\u0001\u0000\u0000\u0000RS\u0005.\u0000\u0000S\u001e"+
		"\u0001\u0000\u0000\u0000TX\u0005\"\u0000\u0000UW\t\u0000\u0000\u0000V"+
		"U\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[e\u0005\"\u0000\u0000\\`\u0005\'\u0000\u0000]_\t\u0000\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000ce\u0005\'\u0000\u0000dT\u0001\u0000\u0000\u0000d\\"+
		"\u0001\u0000\u0000\u0000e \u0001\u0000\u0000\u0000fh\u0007\u0000\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j\"\u0001\u0000\u0000\u0000ko\u0007"+
		"\u0001\u0000\u0000ln\u0007\u0002\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p$\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0007\u0003"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0006\u0012\u0000\u0000x&\u0001\u0000\u0000\u0000\u0007\u0000X`dio"+
		"u\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}