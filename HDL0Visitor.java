// Generated from HDL0.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link progParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HDL0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link progParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(progParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(progParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(progParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(progParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(progParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(progParser.MultDivContext ctx);
}