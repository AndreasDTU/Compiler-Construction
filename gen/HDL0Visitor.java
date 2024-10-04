// Generated from HDL0.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HDL0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HDL0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#hdl0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdl0(HDL0Parser.Hdl0Context ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(HDL0Parser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(HDL0Parser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(HDL0Parser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(HDL0Parser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(HDL0Parser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#updates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdates(HDL0Parser.UpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#siminputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiminputs(HDL0Parser.SiminputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#signal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_list(HDL0Parser.Signal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(HDL0Parser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#siminput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiminput(HDL0Parser.SiminputContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(HDL0Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(HDL0Parser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(HDL0Parser.Function_callContext ctx);
}