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
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(HDL0Parser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal(HDL0Parser.SignalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(HDL0Parser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(HDL0Parser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Functioncall}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(HDL0Parser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link HDL0Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(HDL0Parser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HDL0Parser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(HDL0Parser.UpdateContext ctx);
}