// Generated from HDL0.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HDL0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, BOOLEAN=2, WHITESPACE=3, IDENT=4, SIGNAL=5, HARDWARE=6, INPUTS=7, 
		OUTPUTS=8, LATCHES=9, DEFINITIONS=10, UPDATES=11, SIMINPUTS=12, EQ=13, 
		LPAREN=14, RPAREN=15, COMMA=16, AND=17, OR=18, NOT=19;
	public static final int
		RULE_hdl0 = 0, RULE_hardware = 1, RULE_inputs = 2, RULE_outputs = 3, RULE_latches = 4, 
		RULE_definitions = 5, RULE_updates = 6, RULE_siminputs = 7, RULE_signal_list = 8, 
		RULE_definition = 9, RULE_update = 10, RULE_siminput = 11, RULE_exp = 12, 
		RULE_function_call = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"hdl0", "hardware", "inputs", "outputs", "latches", "definitions", "updates", 
			"siminputs", "signal_list", "definition", "update", "siminput", "exp", 
			"function_call"
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

	@Override
	public String getGrammarFileName() { return "HDL0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HDL0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Hdl0Context extends ParserRuleContext {
		public HardwareContext hardware() {
			return getRuleContext(HardwareContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public UpdatesContext updates() {
			return getRuleContext(UpdatesContext.class,0);
		}
		public SiminputsContext siminputs() {
			return getRuleContext(SiminputsContext.class,0);
		}
		public LatchesContext latches() {
			return getRuleContext(LatchesContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public Hdl0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdl0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterHdl0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitHdl0(this);
		}
	}

	public final Hdl0Context hdl0() throws RecognitionException {
		Hdl0Context _localctx = new Hdl0Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_hdl0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			hardware();
			setState(29);
			inputs();
			setState(30);
			outputs();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LATCHES) {
				{
				setState(31);
				latches();
				}
			}

			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(34);
				definitions();
				}
				break;
			}
			setState(37);
			updates();
			setState(38);
			siminputs();
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
	public static class HardwareContext extends ParserRuleContext {
		public TerminalNode HARDWARE() { return getToken(HDL0Parser.HARDWARE, 0); }
		public TerminalNode SIGNAL() { return getToken(HDL0Parser.SIGNAL, 0); }
		public HardwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterHardware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitHardware(this);
		}
	}

	public final HardwareContext hardware() throws RecognitionException {
		HardwareContext _localctx = new HardwareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hardware);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(HARDWARE);
			setState(41);
			match(SIGNAL);
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
	public static class InputsContext extends ParserRuleContext {
		public TerminalNode INPUTS() { return getToken(HDL0Parser.INPUTS, 0); }
		public Signal_listContext signal_list() {
			return getRuleContext(Signal_listContext.class,0);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitInputs(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(INPUTS);
			setState(44);
			signal_list();
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
	public static class OutputsContext extends ParserRuleContext {
		public TerminalNode OUTPUTS() { return getToken(HDL0Parser.OUTPUTS, 0); }
		public Signal_listContext signal_list() {
			return getRuleContext(Signal_listContext.class,0);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitOutputs(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outputs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(OUTPUTS);
			setState(47);
			signal_list();
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
	public static class LatchesContext extends ParserRuleContext {
		public TerminalNode LATCHES() { return getToken(HDL0Parser.LATCHES, 0); }
		public Signal_listContext signal_list() {
			return getRuleContext(Signal_listContext.class,0);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitLatches(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_latches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LATCHES);
			setState(50);
			signal_list();
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
	public static class DefinitionsContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitDefinitions(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINITIONS) {
				{
				{
				setState(52);
				definition();
				}
				}
				setState(57);
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
	public static class UpdatesContext extends ParserRuleContext {
		public TerminalNode UPDATES() { return getToken(HDL0Parser.UPDATES, 0); }
		public List<UpdateContext> update() {
			return getRuleContexts(UpdateContext.class);
		}
		public UpdateContext update(int i) {
			return getRuleContext(UpdateContext.class,i);
		}
		public UpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitUpdates(this);
		}
	}

	public final UpdatesContext updates() throws RecognitionException {
		UpdatesContext _localctx = new UpdatesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_updates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(UPDATES);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				update();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIGNAL );
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
	public static class SiminputsContext extends ParserRuleContext {
		public TerminalNode SIMINPUTS() { return getToken(HDL0Parser.SIMINPUTS, 0); }
		public List<SiminputContext> siminput() {
			return getRuleContexts(SiminputContext.class);
		}
		public SiminputContext siminput(int i) {
			return getRuleContext(SiminputContext.class,i);
		}
		public SiminputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siminputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterSiminputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitSiminputs(this);
		}
	}

	public final SiminputsContext siminputs() throws RecognitionException {
		SiminputsContext _localctx = new SiminputsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_siminputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SIMINPUTS);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				siminput();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIGNAL );
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
	public static class Signal_listContext extends ParserRuleContext {
		public List<TerminalNode> SIGNAL() { return getTokens(HDL0Parser.SIGNAL); }
		public TerminalNode SIGNAL(int i) {
			return getToken(HDL0Parser.SIGNAL, i);
		}
		public Signal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterSignal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitSignal_list(this);
		}
	}

	public final Signal_listContext signal_list() throws RecognitionException {
		Signal_listContext _localctx = new Signal_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_signal_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(SIGNAL);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGNAL) {
				{
				{
				setState(71);
				match(SIGNAL);
				}
				}
				setState(76);
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
	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode DEFINITIONS() { return getToken(HDL0Parser.DEFINITIONS, 0); }
		public TerminalNode SIGNAL() { return getToken(HDL0Parser.SIGNAL, 0); }
		public TerminalNode LPAREN() { return getToken(HDL0Parser.LPAREN, 0); }
		public Signal_listContext signal_list() {
			return getRuleContext(Signal_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HDL0Parser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(HDL0Parser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DEFINITIONS);
			setState(78);
			match(SIGNAL);
			setState(79);
			match(LPAREN);
			setState(80);
			signal_list();
			setState(81);
			match(RPAREN);
			setState(82);
			match(EQ);
			setState(83);
			exp(0);
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
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(HDL0Parser.SIGNAL, 0); }
		public TerminalNode EQ() { return getToken(HDL0Parser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(SIGNAL);
			setState(86);
			match(EQ);
			setState(87);
			exp(0);
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
	public static class SiminputContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(HDL0Parser.SIGNAL, 0); }
		public TerminalNode EQ() { return getToken(HDL0Parser.EQ, 0); }
		public List<TerminalNode> BOOLEAN() { return getTokens(HDL0Parser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(HDL0Parser.BOOLEAN, i);
		}
		public SiminputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siminput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterSiminput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitSiminput(this);
		}
	}

	public final SiminputContext siminput() throws RecognitionException {
		SiminputContext _localctx = new SiminputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_siminput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SIGNAL);
			setState(90);
			match(EQ);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(BOOLEAN);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOLEAN );
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
		public TerminalNode NOT() { return getToken(HDL0Parser.NOT, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HDL0Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HDL0Parser.RPAREN, 0); }
		public TerminalNode SIGNAL() { return getToken(HDL0Parser.SIGNAL, 0); }
		public TerminalNode AND() { return getToken(HDL0Parser.AND, 0); }
		public TerminalNode OR() { return getToken(HDL0Parser.OR, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitExp(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(97);
				match(NOT);
				setState(98);
				exp(6);
				}
				break;
			case 2:
				{
				setState(99);
				function_call();
				}
				break;
			case 3:
				{
				setState(100);
				match(LPAREN);
				setState(101);
				exp(0);
				setState(102);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(104);
				match(SIGNAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(108);
						match(AND);
						setState(109);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						match(OR);
						setState(112);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(HDL0Parser.SIGNAL, 0); }
		public TerminalNode LPAREN() { return getToken(HDL0Parser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HDL0Parser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HDL0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HDL0Parser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(SIGNAL);
			setState(119);
			match(LPAREN);
			setState(120);
			exp(0);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				exp(0);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000!\b\u0000\u0001\u0000\u0003\u0000$\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u00056\b\u0005\n\u0005\f\u0005"+
		"9\t\u0005\u0001\u0006\u0001\u0006\u0004\u0006=\b\u0006\u000b\u0006\f\u0006"+
		">\u0001\u0007\u0001\u0007\u0004\u0007C\b\u0007\u000b\u0007\f\u0007D\u0001"+
		"\b\u0001\b\u0005\bI\b\b\n\b\f\bL\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b]\b\u000b\u000b\u000b\f\u000b^\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\fj\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fr\b\f\n"+
		"\f\f\fu\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r|\b\r\n\r\f"+
		"\r\u007f\t\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0018\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000"+
		"\u0081\u0000\u001c\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000"+
		"\u0004+\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b1\u0001"+
		"\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000\u0000"+
		"\u000e@\u0001\u0000\u0000\u0000\u0010F\u0001\u0000\u0000\u0000\u0012M"+
		"\u0001\u0000\u0000\u0000\u0014U\u0001\u0000\u0000\u0000\u0016Y\u0001\u0000"+
		"\u0000\u0000\u0018i\u0001\u0000\u0000\u0000\u001av\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0003\u0004\u0002\u0000"+
		"\u001e \u0003\u0006\u0003\u0000\u001f!\u0003\b\u0004\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000"+
		"\"$\u0003\n\u0005\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%&\u0003\f\u0006\u0000&\'\u0003\u000e"+
		"\u0007\u0000\'\u0001\u0001\u0000\u0000\u0000()\u0005\u0006\u0000\u0000"+
		")*\u0005\u0005\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005\u0007"+
		"\u0000\u0000,-\u0003\u0010\b\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005"+
		"\b\u0000\u0000/0\u0003\u0010\b\u00000\u0007\u0001\u0000\u0000\u000012"+
		"\u0005\t\u0000\u000023\u0003\u0010\b\u00003\t\u0001\u0000\u0000\u0000"+
		"46\u0003\u0012\t\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u000b\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:<\u0005\u000b\u0000\u0000;=\u0003"+
		"\u0014\n\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\r\u0001\u0000\u0000\u0000"+
		"@B\u0005\f\u0000\u0000AC\u0003\u0016\u000b\u0000BA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u000f\u0001\u0000\u0000\u0000FJ\u0005\u0005\u0000\u0000GI\u0005"+
		"\u0005\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0011\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\n\u0000\u0000NO\u0005\u0005"+
		"\u0000\u0000OP\u0005\u000e\u0000\u0000PQ\u0003\u0010\b\u0000QR\u0005\u000f"+
		"\u0000\u0000RS\u0005\r\u0000\u0000ST\u0003\u0018\f\u0000T\u0013\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0005\r\u0000\u0000WX\u0003"+
		"\u0018\f\u0000X\u0015\u0001\u0000\u0000\u0000YZ\u0005\u0005\u0000\u0000"+
		"Z\\\u0005\r\u0000\u0000[]\u0005\u0002\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_\u0017\u0001\u0000\u0000\u0000`a\u0006\f\uffff\uffff\u0000"+
		"ab\u0005\u0013\u0000\u0000bj\u0003\u0018\f\u0006cj\u0003\u001a\r\u0000"+
		"de\u0005\u000e\u0000\u0000ef\u0003\u0018\f\u0000fg\u0005\u000f\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hj\u0005\u0005\u0000\u0000i`\u0001\u0000\u0000"+
		"\u0000ic\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000js\u0001\u0000\u0000\u0000kl\n\u0005\u0000\u0000lm\u0005\u0011"+
		"\u0000\u0000mr\u0003\u0018\f\u0006no\n\u0004\u0000\u0000op\u0005\u0012"+
		"\u0000\u0000pr\u0003\u0018\f\u0005qk\u0001\u0000\u0000\u0000qn\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000t\u0019\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0005\u0005\u0000\u0000wx\u0005\u000e\u0000\u0000x}\u0003\u0018"+
		"\f\u0000yz\u0005\u0010\u0000\u0000z|\u0003\u0018\f\u0000{y\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u001b\u0001"+
		"\u0000\u0000\u0000\u000b #7>DJ^iqs}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}