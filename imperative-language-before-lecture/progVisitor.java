// Generated from prog.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link progParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface progVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link progParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(progParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(progParser.ExpContext ctx);
}