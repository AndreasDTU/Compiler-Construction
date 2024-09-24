// Generated from HDL0.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HDL0Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, WHITESPACE=2, SIGNAL=3, HARDWARE=4, INPUTS=5, OUTPUTS=6, LATCHES=7, 
		DEFINITIONS=8, UPDATES=9, SIMINPUTS=10, EQ=11, LPAREN=12, RPAREN=13, COMMA=14, 
		AND=15, OR=16, NOT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "WHITESPACE", "IDENT", "SIGNAL", "HARDWARE", "INPUTS", "OUTPUTS", 
			"LATCHES", "DEFINITIONS", "UPDATES", "SIMINPUTS", "EQ", "LPAREN", "RPAREN", 
			"COMMA", "AND", "OR", "NOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'hardware:'", "'inputs:'", "'outputs:'", "'latches:'", 
			"'def:'", "'updates:'", "'siminputs:'", "'='", "'('", "')'", "','", "'*'", 
			"'+'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "WHITESPACE", "SIGNAL", "HARDWARE", "INPUTS", "OUTPUTS", 
			"LATCHES", "DEFINITIONS", "UPDATES", "SIMINPUTS", "EQ", "LPAREN", "RPAREN", 
			"COMMA", "AND", "OR", "NOT"
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


	public HDL0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HDL0.g4"; }

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
		"\u0004\u0000\u0011\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001)\b\u0001\u000b\u0001"+
		"\f\u0001*\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"1\b\u0002\n\u0002\f\u00024\t\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"8\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0000\u0007\u0003\t\u0004"+
		"\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019"+
		"\f\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011\u0001\u0000\u0003\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000AZaz\u0003\u000009AZaz\u0085\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001"+
		"%\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u0005.\u0001"+
		"\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000"+
		"\u0000\u000bC\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000f"+
		"T\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013b\u0001"+
		"\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017v\u0001\u0000\u0000"+
		"\u0000\u0019x\u0001\u0000\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d"+
		"|\u0001\u0000\u0000\u0000\u001f~\u0001\u0000\u0000\u0000!\u0080\u0001"+
		"\u0000\u0000\u0000#\u0082\u0001\u0000\u0000\u0000%&\u000201\u0000&\u0002"+
		"\u0001\u0000\u0000\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0006\u0001\u0000\u0000-\u0004"+
		"\u0001\u0000\u0000\u0000.2\u0007\u0001\u0000\u0000/1\u0007\u0002\u0000"+
		"\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u00003\u0006\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000057\u0003\u0005\u0002\u000068\u0005\'\u0000\u0000"+
		"76\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\b\u0001\u0000\u0000"+
		"\u00009:\u0005h\u0000\u0000:;\u0005a\u0000\u0000;<\u0005r\u0000\u0000"+
		"<=\u0005d\u0000\u0000=>\u0005w\u0000\u0000>?\u0005a\u0000\u0000?@\u0005"+
		"r\u0000\u0000@A\u0005e\u0000\u0000AB\u0005:\u0000\u0000B\n\u0001\u0000"+
		"\u0000\u0000CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000EF\u0005p\u0000"+
		"\u0000FG\u0005u\u0000\u0000GH\u0005t\u0000\u0000HI\u0005s\u0000\u0000"+
		"IJ\u0005:\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005o\u0000\u0000"+
		"LM\u0005u\u0000\u0000MN\u0005t\u0000\u0000NO\u0005p\u0000\u0000OP\u0005"+
		"u\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005s\u0000\u0000RS\u0005:\u0000"+
		"\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005l\u0000\u0000UV\u0005a\u0000"+
		"\u0000VW\u0005t\u0000\u0000WX\u0005c\u0000\u0000XY\u0005h\u0000\u0000"+
		"YZ\u0005e\u0000\u0000Z[\u0005s\u0000\u0000[\\\u0005:\u0000\u0000\\\u0010"+
		"\u0001\u0000\u0000\u0000]^\u0005d\u0000\u0000^_\u0005e\u0000\u0000_`\u0005"+
		"f\u0000\u0000`a\u0005:\u0000\u0000a\u0012\u0001\u0000\u0000\u0000bc\u0005"+
		"u\u0000\u0000cd\u0005p\u0000\u0000de\u0005d\u0000\u0000ef\u0005a\u0000"+
		"\u0000fg\u0005t\u0000\u0000gh\u0005e\u0000\u0000hi\u0005s\u0000\u0000"+
		"ij\u0005:\u0000\u0000j\u0014\u0001\u0000\u0000\u0000kl\u0005s\u0000\u0000"+
		"lm\u0005i\u0000\u0000mn\u0005m\u0000\u0000no\u0005i\u0000\u0000op\u0005"+
		"n\u0000\u0000pq\u0005p\u0000\u0000qr\u0005u\u0000\u0000rs\u0005t\u0000"+
		"\u0000st\u0005s\u0000\u0000tu\u0005:\u0000\u0000u\u0016\u0001\u0000\u0000"+
		"\u0000vw\u0005=\u0000\u0000w\u0018\u0001\u0000\u0000\u0000xy\u0005(\u0000"+
		"\u0000y\u001a\u0001\u0000\u0000\u0000z{\u0005)\u0000\u0000{\u001c\u0001"+
		"\u0000\u0000\u0000|}\u0005,\u0000\u0000}\u001e\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005*\u0000\u0000\u007f \u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005+\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"/\u0000\u0000\u0083$\u0001\u0000\u0000\u0000\u0004\u0000*27\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}