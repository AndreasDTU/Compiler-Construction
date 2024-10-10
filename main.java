import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        // we expect exactly one argument: the name of the input file
        if (args.length != 1) {
            System.err.println("\nPlease give as input argument a filename\n");
            System.exit(-1);
        }
        String filename = args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);

        // create a lexer/scanner
        HDL0Lexer lex = new HDL0Lexer(input);
        
        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);
        
        // create a parser
        HDL0Parser parser = new HDL0Parser(tokens);
        
        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.hardware();

        // Pretty print the result
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor();
        String htmlOutput = prettyPrinter.visit(parseTree);

        // Output the generated HTML
        System.out.println(htmlOutput);
    }
}

// Implement the PrettyPrintVisitor class
class PrettyPrintVisitor extends HDL0BaseVisitor<String> {
    @Override
    public String visitHdl0(HDL0Parser.Hdl0Context ctx) {
        StringBuilder html = new StringBuilder();
        String title = ctx.hardware().getText(); // Assuming hardware has the title
        html.append("<!DOCTYPE html>\n<html><head><title>").append(title).append("</title>")
            .append("<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>")
            .append("<script type=\"text/javascript\" id=\"MathJax-script\" async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\"></script>")
            .append("</head><body>")
            .append("<h1>").append(title).append("</h1>");

        // Visit each section
        html.append("<h2> Inputs </h2>").append(visitInputs(ctx.inputs()));
        html.append("<h2> Outputs </h2>").append(visitOutputs(ctx.outputs()));
        html.append("<h2> Latches </h2>").append(visitLatches(ctx.latches()));
        html.append("<h2> Definitions </h2>").append(visitDefinitions(ctx.definitions()));
        html.append("<h2> Updates </h2>").append(visitUpdates(ctx.updates()));
        html.append("<h2> Simulation inputs </h2>").append(visitSiminputs(ctx.siminputs()));

        html.append("</body></html>");
        return html.toString();
    }

    @Override
    public String visitInputs(HDL0Parser.InputsContext ctx) {
        StringBuilder inputs = new StringBuilder();
        inputs.append(ctx.signal_list().getText()).append("<br>");
        return inputs.toString();
    }

    @Override
    public String visitOutputs(HDL0Parser.OutputsContext ctx) {
        StringBuilder outputs = new StringBuilder();
        outputs.append(ctx.signal_list().getText()).append("<br>");
        return outputs.toString();
    }

    @Override
    public String visitLatches(HDL0Parser.LatchesContext ctx) {
        StringBuilder latches = new StringBuilder();
        latches.append(ctx.signal_list().getText()).append("<br>");
        return latches.toString();
    }

    @Override
    public String visitDefinitions(HDL0Parser.DefinitionsContext ctx) {
        StringBuilder definitions = new StringBuilder();
        for (HDL0Parser.DefinitionContext def : ctx.definition()) {
            definitions.append("\\(\\mathit{").append(def.SIGNAL().getText()).append("}(");
            // Handle parameters
            definitions.append(def.LPAREN().getText()).append(((Lexer) def.signal_list()).getText()).append(") = ...\\)<br>");
        }
        return definitions.toString();
    }

    @Override
    public String visitUpdates(HDL0Parser.UpdatesContext ctx) {
        StringBuilder updates = new StringBuilder();
        for (HDL0Parser.UpdateContext update : ctx.update()) {
            updates.append(update.SIGNAL().getText()).append("&larr;\\(");
            updates.append(visit(update.exp())).append("\\)<br>");
        }
        return updates.toString();
    }

    @Override
    public String visitSiminputs(HDL0Parser.SiminputsContext ctx) {
        StringBuilder simInputs = new StringBuilder();
        for (HDL0Parser.SiminputContext simInput : ctx.siminput()) {
            simInputs.append("<b>").append(simInput.SIGNAL().getText()).append("</b>: ").append(((Lexer) simInput.BOOLEAN()).getText()).append("<br>");
        }
        return simInputs.toString();
    }
    @Override
    public String visitNot(HDL0Parser.NotContext ctx) { 
        StringBuilder Not = new StringBuilder();
        Not.append("\\neg ").append(visit(ctx.exp()));
        return Not.toString();
    }

    @Override
    public String visitAnd(HDL0Parser.AndContext ctx) { 
        StringBuilder And = new StringBuilder();
        And.append("\\(").append(visit(ctx.exp(0))).append(" \\wedge ").append(visit(ctx.exp(1))).append("\\)");
        return And.toString();
    }

    @Override
    public String visitOr(HDL0Parser.OrContext ctx) { 
        StringBuilder Or = new StringBuilder();
        Or.append("\\(").append(visit(ctx.exp(0))).append(" \\vee ").append(visit(ctx.exp(1))).append("\\)");
        return Or.toString();
    }

    @Override
    public String visitFunctioncall(HDL0Parser.FunctioncallContext ctx) { 
        StringBuilder Functioncall = new StringBuilder();
        Functioncall.append("\\mathit{").append(ctx.SIGNAL().getText()).append("}(");
        // Visit arguments if any, assuming there's a method for that
        for (int i = 0; i < ctx.exp().size(); i++) {
            Functioncall.append(visit(ctx.exp(i)));
            if (i < ctx.exp().size() - 1) {
                Functioncall.append(", ");
            }
        }
        Functioncall.append(")");
        return Functioncall.toString();
    }

    @Override
    public String visitParen(HDL0Parser.ParenContext ctx) { 
        StringBuilder Paren = new StringBuilder();
        Paren.append("\\(").append(visit(ctx.exp())).append("\\)"); // Call visit on inner expression
        return Paren.toString();
    }

    @Override
    public String visitSignal(HDL0Parser.SignalContext ctx) { 
        StringBuilder Signal = new StringBuilder();
        Signal.append("\\mathrm{").append(ctx.SIGNAL().getText()).append("}");
        return Signal.toString();
    }
}