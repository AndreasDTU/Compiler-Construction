// Generated from HDL0.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HDL0Parser}.
 */
public interface HDL0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#hdl0}.
	 * @param ctx the parse tree
	 */
	void enterHdl0(HDL0Parser.Hdl0Context ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#hdl0}.
	 * @param ctx the parse tree
	 */
	void exitHdl0(HDL0Parser.Hdl0Context ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(HDL0Parser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(HDL0Parser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(HDL0Parser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(HDL0Parser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(HDL0Parser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(HDL0Parser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(HDL0Parser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(HDL0Parser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(HDL0Parser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(HDL0Parser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#updates}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(HDL0Parser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#updates}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(HDL0Parser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#siminputs}.
	 * @param ctx the parse tree
	 */
	void enterSiminputs(HDL0Parser.SiminputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#siminputs}.
	 * @param ctx the parse tree
	 */
	void exitSiminputs(HDL0Parser.SiminputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#signal_list}.
	 * @param ctx the parse tree
	 */
	void enterSignal_list(HDL0Parser.Signal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#signal_list}.
	 * @param ctx the parse tree
	 */
	void exitSignal_list(HDL0Parser.Signal_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(HDL0Parser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(HDL0Parser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#siminput}.
	 * @param ctx the parse tree
	 */
	void enterSiminput(HDL0Parser.SiminputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#siminput}.
	 * @param ctx the parse tree
	 */
	void exitSiminput(HDL0Parser.SiminputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(HDL0Parser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(HDL0Parser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSignal(HDL0Parser.SignalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSignal(HDL0Parser.SignalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr(HDL0Parser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr(HDL0Parser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(HDL0Parser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(HDL0Parser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Functioncall}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(HDL0Parser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Functioncall}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(HDL0Parser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParen(HDL0Parser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParen(HDL0Parser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HDL0Parser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(HDL0Parser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HDL0Parser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(HDL0Parser.UpdateContext ctx);
}