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
		NUMBER=1, BOOLEAN=2, WHITESPACE=3, IDENT=4, SIGNAL=5, HARDWARE=6, INPUTS=7, 
		OUTPUTS=8, LATCHES=9, DEFINITIONS=10, UPDATES=11, SIMINPUTS=12, EQ=13, 
		LPAREN=14, RPAREN=15, COMMA=16, AND=17, OR=18, NOT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "BOOLEAN", "WHITESPACE", "IDENT", "SIGNAL", "HARDWARE", "INPUTS", 
			"OUTPUTS", "LATCHES", "DEFINITIONS", "UPDATES", "SIMINPUTS", "EQ", "LPAREN", 
			"RPAREN", "COMMA", "AND", "OR", "NOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'hardware'", "'inputs:'", "'outputs:'", 
			"'latches'", "'def:'", "'updates:'", "'siminputs:'", "'='", "'('", "')'", 
			"','", "'*'", "'+'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "BOOLEAN", "WHITESPACE", "IDENT", "SIGNAL", "HARDWARE", 
			"INPUTS", "OUTPUTS", "LATCHES", "DEFINITIONS", "UPDATES", "SIMINPUTS", 
			"EQ", "LPAREN", "RPAREN", "COMMA", "AND", "OR", "NOT"
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
		"\u0004\u0000\u0013\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0004\u0000)\b\u0000\u000b\u0000"+
		"\f\u0000*\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u00020\b\u0002\u000b"+
		"\u0002\f\u00021\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005"+
		"\u00038\b\u0003\n\u0003\f\u0003;\t\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0004"+
		"\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0003\u000009AZa"+
		"z\u008c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0001(\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t"+
		"<\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rI\u0001\u0000"+
		"\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000"+
		"\u0013b\u0001\u0000\u0000\u0000\u0015g\u0001\u0000\u0000\u0000\u0017p"+
		"\u0001\u0000\u0000\u0000\u0019{\u0001\u0000\u0000\u0000\u001b}\u0001\u0000"+
		"\u0000\u0000\u001d\u007f\u0001\u0000\u0000\u0000\u001f\u0081\u0001\u0000"+
		"\u0000\u0000!\u0083\u0001\u0000\u0000\u0000#\u0085\u0001\u0000\u0000\u0000"+
		"%\u0087\u0001\u0000\u0000\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+\u0002\u0001\u0000\u0000\u0000,-\u000201\u0000-\u0004"+
		"\u0001\u0000\u0000\u0000.0\u0007\u0001\u0000\u0000/.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000034\u0006\u0002\u0000\u00004\u0006"+
		"\u0001\u0000\u0000\u000059\u0007\u0002\u0000\u000068\u0007\u0003\u0000"+
		"\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:\b\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000<>\u0003\u0007\u0003\u0000=?\u0005\'\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\n\u0001\u0000\u0000\u0000"+
		"@A\u0005h\u0000\u0000AB\u0005a\u0000\u0000BC\u0005r\u0000\u0000CD\u0005"+
		"d\u0000\u0000DE\u0005w\u0000\u0000EF\u0005a\u0000\u0000FG\u0005r\u0000"+
		"\u0000GH\u0005e\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005i\u0000"+
		"\u0000JK\u0005n\u0000\u0000KL\u0005p\u0000\u0000LM\u0005u\u0000\u0000"+
		"MN\u0005t\u0000\u0000NO\u0005s\u0000\u0000OP\u0005:\u0000\u0000P\u000e"+
		"\u0001\u0000\u0000\u0000QR\u0005o\u0000\u0000RS\u0005u\u0000\u0000ST\u0005"+
		"t\u0000\u0000TU\u0005p\u0000\u0000UV\u0005u\u0000\u0000VW\u0005t\u0000"+
		"\u0000WX\u0005s\u0000\u0000XY\u0005:\u0000\u0000Y\u0010\u0001\u0000\u0000"+
		"\u0000Z[\u0005l\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005t\u0000\u0000"+
		"]^\u0005c\u0000\u0000^_\u0005h\u0000\u0000_`\u0005e\u0000\u0000`a\u0005"+
		"s\u0000\u0000a\u0012\u0001\u0000\u0000\u0000bc\u0005d\u0000\u0000cd\u0005"+
		"e\u0000\u0000de\u0005f\u0000\u0000ef\u0005:\u0000\u0000f\u0014\u0001\u0000"+
		"\u0000\u0000gh\u0005u\u0000\u0000hi\u0005p\u0000\u0000ij\u0005d\u0000"+
		"\u0000jk\u0005a\u0000\u0000kl\u0005t\u0000\u0000lm\u0005e\u0000\u0000"+
		"mn\u0005s\u0000\u0000no\u0005:\u0000\u0000o\u0016\u0001\u0000\u0000\u0000"+
		"pq\u0005s\u0000\u0000qr\u0005i\u0000\u0000rs\u0005m\u0000\u0000st\u0005"+
		"i\u0000\u0000tu\u0005n\u0000\u0000uv\u0005p\u0000\u0000vw\u0005u\u0000"+
		"\u0000wx\u0005t\u0000\u0000xy\u0005s\u0000\u0000yz\u0005:\u0000\u0000"+
		"z\u0018\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000|\u001a\u0001\u0000"+
		"\u0000\u0000}~\u0005(\u0000\u0000~\u001c\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005)\u0000\u0000\u0080\u001e\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005,\u0000\u0000\u0082 \u0001\u0000\u0000\u0000\u0083\u0084\u0005*"+
		"\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\u0085\u0086\u0005+\u0000"+
		"\u0000\u0086$\u0001\u0000\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088"+
		"&\u0001\u0000\u0000\u0000\u0005\u0000*19>\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}