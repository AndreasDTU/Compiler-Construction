import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class main {
    public static void main(String[] args) throws IOException {
        // we expect exactly one argument: the name of the input file
        if (args.length == 0) {
            System.err.println("\nPlease give as input argument a filename\n");
            return;
        }

        // open the input file
        CharStream input = CharStreams.fromFileName(args[0]);

        // create a lexer/scanner
        HDL0Lexer lex = new HDL0Lexer(input);
        
        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);
        
        // create a parser
        HDL0Parser parser = new HDL0Parser(tokens);
        
        // and parse anything from the grammar for "start"
        ParseTree tree = parser.hdl0();

        // Pretty print the result
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor();
        String htmlOutput = prettyPrinter.visit(tree);

        // Output the generated HTML to a file
        String inputFileName = args[0].substring(0, args[0].lastIndexOf('.'));
        String outputFileName = inputFileName + ".html";

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            writer.println(htmlOutput);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        parser.removeErrorListeners(); // Remove default console error listener
        parser.addErrorListener(new ConsoleErrorListener()); // Add custom error listener

    }
}

// Implement the PrettyPrintVisitor class
class PrettyPrintVisitor extends HDL0BaseVisitor<String> {
    @Override
    public String visitHdl0(HDL0Parser.Hdl0Context ctx) {
        StringBuilder html = new StringBuilder();
        String title = ctx.hardware().SIGNAL().getText(); // Assuming hardware has the title
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
        HDL0Parser.Signal_listContext signalList = ctx.signal_list();
        for (int i = 0; i < signalList.SIGNAL().size(); i++) {
            inputs.append(signalList.SIGNAL(i).getText());
            if (i < signalList.SIGNAL().size() - 1) {
                inputs.append(" "); // Adds a space after if it is not the last one
            }
        }
        
        inputs.append("<br>");
        return inputs.toString();
    }
    
    @Override
    public String visitOutputs(HDL0Parser.OutputsContext ctx) {
        StringBuilder outputs = new StringBuilder();
        HDL0Parser.Signal_listContext signalList = ctx.signal_list();
        for (int i = 0; i < signalList.SIGNAL().size(); i++) {
            outputs.append(signalList.SIGNAL(i).getText());
            if (i < signalList.SIGNAL().size() - 1) {
                outputs.append(" "); // Adds a space after if it is not the last one
            }
        }
        
        outputs.append("<br>");
        return outputs.toString();
    }

    @Override
    public String visitLatches(HDL0Parser.LatchesContext ctx) {
        StringBuilder latches = new StringBuilder();
        HDL0Parser.Signal_listContext signalList = ctx.signal_list();
        for (int i = 0; i < signalList.SIGNAL().size(); i++) {
            latches.append(signalList.SIGNAL(i).getText());
            if (i < signalList.SIGNAL().size() - 1) {
                latches.append(" "); // Adds a space after if it is not the last one
            }
        }
        
        latches.append("<br>");
        return latches.toString();
    }

    @Override
    public String visitDefinitions(HDL0Parser.DefinitionsContext ctx) {
        StringBuilder definitions = new StringBuilder();
        for (HDL0Parser.DefinitionContext def : ctx.definition()) {
            definitions.append("\\(\\mathit{").append(def.SIGNAL().getText()).append("}(");
    
            for (int i = 0; i < def.signal_list().size(); i++) {
                definitions.append(def.signal_list(i).getText()); // Directly get the signal names
                if (i < def.signal_list().size() - 1) {
                    definitions.append(", "); // Add comma between parameters
                }
            }
    
            definitions.append(") = ");
            
            // Visit the expression part with LaTeX formatting (use \mathrm for signal names here)
            definitions.append(visit(def.exp())); // Process the expression for the function body
    
            definitions.append("\\)<br>");
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
            simInputs.append("<b>").append(simInput.SIGNAL().getText()).append("</b>: ").append(simInput.BOOLEAN().toString()).append("<br>");

        }
        return simInputs.toString();
    }
    @Override
    public String visitNot(HDL0Parser.NotContext ctx) { 
        return "\\neg(\\mathrm{" + visit(ctx.exp()) + "})";
    }

    @Override
    public String visitAnd(HDL0Parser.AndContext ctx) { 
        return "(" + visit(ctx.exp(0)) + " \\wedge " + visit(ctx.exp(1)) + ")";
    }

    @Override
    public String visitSignal(HDL0Parser.SignalContext ctx) { 
        return ctx.SIGNAL().getText(); // Only apply \mathrm to the signal itself
    }


    @Override
    public String visitOr(HDL0Parser.OrContext ctx) { 
        return "(" + visit(ctx.exp(0)) + " \\vee " + visit(ctx.exp(1)) + ")"; 
    }
    @Override
    public String visitSignal_list(HDL0Parser.Signal_listContext ctx) {
        StringBuilder signalList = new StringBuilder();
        for (int i = 0; i < ctx.SIGNAL().size(); i++) {
            signalList.append("\\mathrm{").append(ctx.SIGNAL(i).getText()).append("}");
            if (i < ctx.SIGNAL().size() - 1) {
                signalList.append(", "); // Add commas between signals in the same list
            }
        }
        return signalList.toString();
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
        Paren.append("(").append(visit(ctx.exp())).append(")"); // Call visit on inner expression
        return Paren.toString();
    }
}