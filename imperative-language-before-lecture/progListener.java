// Generated from prog.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link progParser}.
 */
public interface progListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link progParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(progParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(progParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(progParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(progParser.ExpContext ctx);
}