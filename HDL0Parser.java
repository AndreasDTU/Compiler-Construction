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
		BOOLEAN=1, WHITESPACE=2, SIGNAL=3, HARDWARE=4, INPUTS=5, OUTPUTS=6, LATCHES=7, 
		DEFINITIONS=8, UPDATES=9, SIMINPUTS=10, EQ=11, LPAREN=12, RPAREN=13, COMMA=14, 
		AND=15, OR=16, NOT=17, COMMENT=18, LONGCOMMENT=19;
	public static final int
		RULE_hdl0 = 0, RULE_hardware = 1, RULE_inputs = 2, RULE_outputs = 3, RULE_latches = 4, 
		RULE_definitions = 5, RULE_updates = 6, RULE_siminputs = 7, RULE_signal_list = 8, 
		RULE_definition = 9, RULE_siminput = 10, RULE_exp = 11, RULE_update = 12, 
		RULE_function_call = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"hdl0", "hardware", "inputs", "outputs", "latches", "definitions", "updates", 
			"siminputs", "signal_list", "definition", "siminput", "exp", "update", 
			"function_call"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitHdl0(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitHardware(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitUpdates(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitSiminputs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitSignal_list(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode RPAREN() { return getToken(HDL0Parser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(HDL0Parser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<Signal_listContext> signal_list() {
			return getRuleContexts(Signal_listContext.class);
		}
		public Signal_listContext signal_list(int i) {
			return getRuleContext(Signal_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HDL0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HDL0Parser.COMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DEFINITIONS);
			setState(78);
			match(SIGNAL);
			setState(79);
			match(LPAREN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNAL) {
				{
				setState(80);
				signal_list();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(81);
					match(COMMA);
					setState(82);
					signal_list();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(90);
			match(RPAREN);
			setState(91);
			match(EQ);
			setState(92);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitSiminput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiminputContext siminput() throws RecognitionException {
		SiminputContext _localctx = new SiminputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_siminput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SIGNAL);
			setState(95);
			match(EQ);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				match(BOOLEAN);
				}
				}
				setState(99); 
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(HDL0Parser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignalContext extends ExpContext {
		public List<TerminalNode> SIGNAL() { return getTokens(HDL0Parser.SIGNAL); }
		public TerminalNode SIGNAL(int i) {
			return getToken(HDL0Parser.SIGNAL, i);
		}
		public SignalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitSignal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(HDL0Parser.OR, 0); }
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListSignalContext extends ExpContext {
		public List<TerminalNode> SIGNAL() { return getTokens(HDL0Parser.SIGNAL); }
		public TerminalNode SIGNAL(int i) {
			return getToken(HDL0Parser.SIGNAL, i);
		}
		public List<TerminalNode> NOT() { return getTokens(HDL0Parser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(HDL0Parser.NOT, i);
		}
		public ListSignalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterListSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitListSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitListSignal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(HDL0Parser.AND, 0); }
		public AndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctioncallContext extends ExpContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctioncallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExpContext {
		public TerminalNode LPAREN() { return getToken(HDL0Parser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HDL0Parser.RPAREN, 0); }
		public ParenContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HDL0Listener ) ((HDL0Listener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitParen(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(102);
				match(NOT);
				setState(103);
				exp(7);
				}
				break;
			case 2:
				{
				_localctx = new ListSignalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(104);
					match(NOT);
					setState(105);
					match(SIGNAL);
					}
				}

				setState(108);
				match(SIGNAL);
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(109);
					match(NOT);
					setState(110);
					match(SIGNAL);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new FunctioncallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				function_call();
				}
				break;
			case 4:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(LPAREN);
				setState(115);
				exp(0);
				setState(116);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new SignalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						match(SIGNAL);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(127);
						match(AND);
						setState(128);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(130);
						match(OR);
						setState(131);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(SIGNAL);
			setState(138);
			match(EQ);
			setState(139);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(HDL0Parser.SIGNAL, 0); }
		public TerminalNode LPAREN() { return getToken(HDL0Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HDL0Parser.RPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HDL0Visitor ) return ((HDL0Visitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(SIGNAL);
			setState(142);
			match(LPAREN);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(143);
				exp(0);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(144);
					match(COMMA);
					setState(145);
					exp(0);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(153);
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
		case 11:
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
		"\u0004\u0001\u0013\u009c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\t\u0001\t\u0005\tT\b\t\n\t\f\tW\t\t\u0003\tY\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\nb\b\n\u000b\n\f\nc\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bk\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bp\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"x\b\u000b\n\u000b\f\u000b{\t\u000b\u0003\u000b}\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0085"+
		"\b\u000b\n\u000b\f\u000b\u0088\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0093\b\r\n\r\f\r\u0096"+
		"\t\r\u0003\r\u0098\b\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0016\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0000\u00a1\u0000\u001c\u0001\u0000\u0000\u0000\u0002(\u0001\u0000"+
		"\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000"+
		"\b1\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f:\u0001\u0000"+
		"\u0000\u0000\u000e@\u0001\u0000\u0000\u0000\u0010F\u0001\u0000\u0000\u0000"+
		"\u0012M\u0001\u0000\u0000\u0000\u0014^\u0001\u0000\u0000\u0000\u0016|"+
		"\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u008d"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e"+
		"\u0003\u0004\u0002\u0000\u001e \u0003\u0006\u0003\u0000\u001f!\u0003\b"+
		"\u0004\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!#\u0001\u0000\u0000\u0000\"$\u0003\n\u0005\u0000#\"\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0003\f\u0006"+
		"\u0000&\'\u0003\u000e\u0007\u0000\'\u0001\u0001\u0000\u0000\u0000()\u0005"+
		"\u0004\u0000\u0000)*\u0005\u0003\u0000\u0000*\u0003\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0005\u0000\u0000,-\u0003\u0010\b\u0000-\u0005\u0001\u0000"+
		"\u0000\u0000./\u0005\u0006\u0000\u0000/0\u0003\u0010\b\u00000\u0007\u0001"+
		"\u0000\u0000\u000012\u0005\u0007\u0000\u000023\u0003\u0010\b\u00003\t"+
		"\u0001\u0000\u0000\u000046\u0003\u0012\t\u000054\u0001\u0000\u0000\u0000"+
		"69\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008\u000b\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0005"+
		"\t\u0000\u0000;=\u0003\u0018\f\u0000<;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?\r\u0001\u0000\u0000\u0000@B\u0005\n\u0000\u0000AC\u0003\u0014\n\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000E\u000f\u0001\u0000\u0000\u0000FJ\u0005"+
		"\u0003\u0000\u0000GI\u0005\u0003\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\u0011\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005"+
		"\b\u0000\u0000NO\u0005\u0003\u0000\u0000OX\u0005\f\u0000\u0000PU\u0003"+
		"\u0010\b\u0000QR\u0005\u000e\u0000\u0000RT\u0003\u0010\b\u0000SQ\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XP\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z[\u0005\r\u0000\u0000[\\\u0005\u000b\u0000\u0000\\]\u0003"+
		"\u0016\u000b\u0000]\u0013\u0001\u0000\u0000\u0000^_\u0005\u0003\u0000"+
		"\u0000_a\u0005\u000b\u0000\u0000`b\u0005\u0001\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\u0015\u0001\u0000\u0000\u0000ef\u0006\u000b\uffff"+
		"\uffff\u0000fg\u0005\u0011\u0000\u0000g}\u0003\u0016\u000b\u0007hi\u0005"+
		"\u0011\u0000\u0000ik\u0005\u0003\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0005\u0003\u0000"+
		"\u0000mn\u0005\u0011\u0000\u0000np\u0005\u0003\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p}\u0001\u0000\u0000\u0000q}\u0003"+
		"\u001a\r\u0000rs\u0005\f\u0000\u0000st\u0003\u0016\u000b\u0000tu\u0005"+
		"\r\u0000\u0000u}\u0001\u0000\u0000\u0000vx\u0005\u0003\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|e\u0001\u0000\u0000\u0000|j\u0001\u0000\u0000\u0000|q\u0001\u0000"+
		"\u0000\u0000|r\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000}\u0086"+
		"\u0001\u0000\u0000\u0000~\u007f\n\u0005\u0000\u0000\u007f\u0080\u0005"+
		"\u000f\u0000\u0000\u0080\u0085\u0003\u0016\u000b\u0006\u0081\u0082\n\u0004"+
		"\u0000\u0000\u0082\u0083\u0005\u0010\u0000\u0000\u0083\u0085\u0003\u0016"+
		"\u000b\u0005\u0084~\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0017\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000"+
		"\u0000\u008a\u008b\u0005\u000b\u0000\u0000\u008b\u008c\u0003\u0016\u000b"+
		"\u0000\u008c\u0019\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0003\u0000"+
		"\u0000\u008e\u0097\u0005\f\u0000\u0000\u008f\u0094\u0003\u0016\u000b\u0000"+
		"\u0090\u0091\u0005\u000e\u0000\u0000\u0091\u0093\u0003\u0016\u000b\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u008f\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005\r\u0000\u0000\u009a"+
		"\u001b\u0001\u0000\u0000\u0000\u0011 #7>DJUXcjoy|\u0084\u0086\u0094\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}