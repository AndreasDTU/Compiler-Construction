// Generated from prog.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class progParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, FLOAT=8, 
		WHITESPACE=9, COMMENT=10, LONGCOMMENT=11;
	public static final int
		RULE_start = 0, RULE_exp = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTIFIER", "FLOAT", "WHITESPACE", 
			"COMMENT", "LONGCOMMENT"
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
	public String getGrammarFileName() { return "prog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public progParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(progParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof progListener ) ((progListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof progListener ) ((progListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof progVisitor ) return ((progVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			exp(0);
			setState(5);
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
	public static class ExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(progParser.IDENTIFIER, 0); }
		public TerminalNode FLOAT() { return getToken(progParser.FLOAT, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof progListener ) ((progListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof progListener ) ((progListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof progVisitor ) return ((progVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(8);
				match(IDENTIFIER);
				}
				break;
			case FLOAT:
				{
				setState(9);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(23);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(12);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(13);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(14);
						exp(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(15);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(16);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(17);
						exp(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(18);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(19);
						match(T__4);
						setState(20);
						exp(0);
						setState(21);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b\u001d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u000b\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001"+
		"\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0002\u0001\u0000\u0001"+
		"\u0002\u0001\u0000\u0003\u0004\u001e\u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0002\n\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005"+
		"\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0006\u0001\uffff\uffff\u0000\b\u000b\u0005\u0007\u0000\u0000\t\u000b"+
		"\u0005\b\u0000\u0000\n\u0007\u0001\u0000\u0000\u0000\n\t\u0001\u0000\u0000"+
		"\u0000\u000b\u0019\u0001\u0000\u0000\u0000\f\r\n\u0003\u0000\u0000\r\u000e"+
		"\u0007\u0000\u0000\u0000\u000e\u0018\u0003\u0002\u0001\u0004\u000f\u0010"+
		"\n\u0002\u0000\u0000\u0010\u0011\u0007\u0001\u0000\u0000\u0011\u0018\u0003"+
		"\u0002\u0001\u0003\u0012\u0013\n\u0001\u0000\u0000\u0013\u0014\u0005\u0005"+
		"\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005\u0006"+
		"\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\f\u0001\u0000\u0000"+
		"\u0000\u0017\u000f\u0001\u0000\u0000\u0000\u0017\u0012\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u0003\n\u0017\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}