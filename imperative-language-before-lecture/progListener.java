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
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(progParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(progParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(progParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(progParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstant(progParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstant(progParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParen(progParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParen(progParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(progParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link progParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(progParser.MultDivContext ctx);
}