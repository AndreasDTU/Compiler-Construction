// Generated from HDL0.g4 by ANTLR 4.13.2
package src;
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
		AND=15, OR=16, NOT=17, COMMENT=18, LONGCOMMENT=19;
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
			"COMMA", "AND", "OR", "NOT", "COMMENT", "LONGCOMMENT"
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
			"COMMA", "AND", "OR", "NOT", "COMMENT", "LONGCOMMENT"
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
		"\u0004\u0000\u0013\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u008d\b\u0012\n\u0012\f\u0012\u0090"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u009a\b\u0013\n\u0013\f\u0013"+
		"\u009d\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0000\u0007\u0003\t\u0004"+
		"\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019"+
		"\f\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013\u0001"+
		"\u0000\u0006\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0003\u000009AZaz\u0001"+
		"\u0000\n\n\u0001\u0000**\u0001\u0000//\u00a7\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000"+
		"\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000"+
		"\u00079\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000bG\u0001"+
		"\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fX\u0001\u0000\u0000"+
		"\u0000\u0011a\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015"+
		"o\u0001\u0000\u0000\u0000\u0017z\u0001\u0000\u0000\u0000\u0019|\u0001"+
		"\u0000\u0000\u0000\u001b~\u0001\u0000\u0000\u0000\u001d\u0080\u0001\u0000"+
		"\u0000\u0000\u001f\u0082\u0001\u0000\u0000\u0000!\u0084\u0001\u0000\u0000"+
		"\u0000#\u0086\u0001\u0000\u0000\u0000%\u0088\u0001\u0000\u0000\u0000\'"+
		"\u0093\u0001\u0000\u0000\u0000)*\u000201\u0000*\u0002\u0001\u0000\u0000"+
		"\u0000+-\u0007\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0006\u0001\u0000\u00001\u0004\u0001\u0000\u0000"+
		"\u000026\u0007\u0001\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000"+
		"\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007\u0006\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009;\u0003\u0005\u0002\u0000:<\u0005\'\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005h\u0000"+
		"\u0000>?\u0005a\u0000\u0000?@\u0005r\u0000\u0000@A\u0005d\u0000\u0000"+
		"AB\u0005w\u0000\u0000BC\u0005a\u0000\u0000CD\u0005r\u0000\u0000DE\u0005"+
		"e\u0000\u0000EF\u0005:\u0000\u0000F\n\u0001\u0000\u0000\u0000GH\u0005"+
		"i\u0000\u0000HI\u0005n\u0000\u0000IJ\u0005p\u0000\u0000JK\u0005u\u0000"+
		"\u0000KL\u0005t\u0000\u0000LM\u0005s\u0000\u0000MN\u0005:\u0000\u0000"+
		"N\f\u0001\u0000\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005u\u0000\u0000"+
		"QR\u0005t\u0000\u0000RS\u0005p\u0000\u0000ST\u0005u\u0000\u0000TU\u0005"+
		"t\u0000\u0000UV\u0005s\u0000\u0000VW\u0005:\u0000\u0000W\u000e\u0001\u0000"+
		"\u0000\u0000XY\u0005l\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005t\u0000"+
		"\u0000[\\\u0005c\u0000\u0000\\]\u0005h\u0000\u0000]^\u0005e\u0000\u0000"+
		"^_\u0005s\u0000\u0000_`\u0005:\u0000\u0000`\u0010\u0001\u0000\u0000\u0000"+
		"ab\u0005d\u0000\u0000bc\u0005e\u0000\u0000cd\u0005f\u0000\u0000de\u0005"+
		":\u0000\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005u\u0000\u0000gh\u0005"+
		"p\u0000\u0000hi\u0005d\u0000\u0000ij\u0005a\u0000\u0000jk\u0005t\u0000"+
		"\u0000kl\u0005e\u0000\u0000lm\u0005s\u0000\u0000mn\u0005:\u0000\u0000"+
		"n\u0014\u0001\u0000\u0000\u0000op\u0005s\u0000\u0000pq\u0005i\u0000\u0000"+
		"qr\u0005m\u0000\u0000rs\u0005i\u0000\u0000st\u0005n\u0000\u0000tu\u0005"+
		"p\u0000\u0000uv\u0005u\u0000\u0000vw\u0005t\u0000\u0000wx\u0005s\u0000"+
		"\u0000xy\u0005:\u0000\u0000y\u0016\u0001\u0000\u0000\u0000z{\u0005=\u0000"+
		"\u0000{\u0018\u0001\u0000\u0000\u0000|}\u0005(\u0000\u0000}\u001a\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005)\u0000\u0000\u007f\u001c\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005,\u0000\u0000\u0081\u001e\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005*\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005+\u0000\u0000\u0085\"\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"/\u0000\u0000\u0087$\u0001\u0000\u0000\u0000\u0088\u0089\u0005/\u0000"+
		"\u0000\u0089\u008a\u0005/\u0000\u0000\u008a\u008e\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\b\u0003\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0012\u0000\u0000\u0092"+
		"&\u0001\u0000\u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0005"+
		"*\u0000\u0000\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u009a\b\u0004"+
		"\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098\u009a\b\u0005\u0000"+
		"\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005*\u0000\u0000"+
		"\u009f\u00a0\u0005/\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0006\u0013\u0000\u0000\u00a2(\u0001\u0000\u0000\u0000\u0007\u0000"+
		".6;\u008e\u0099\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}