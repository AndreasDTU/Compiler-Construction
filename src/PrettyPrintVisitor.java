package src;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import src.HDL0Parser.HardwareContext;

public class PrettyPrintVisitor extends AbstractParseTreeVisitor<String> implements HDL0Visitor<String> {
    private StringBuilder output = new StringBuilder();

    @Override
    public String visitHdl0(HDL0Parser.Hdl0Context ctx) {
        String title = ctx.hardware().SIGNAL().getText(); // Get the hardware specification name
        output.append("<!DOCTYPE html>\n");
        output.append("<html><head><title>").append(title).append("</title>\n");
        output.append("<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n");
        output.append("<script type=\"text/javascript\" id=\"MathJax-script\" async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\"></script>\n");
        output.append("</head><body>\n");
        output.append("<h1>").append(title).append("</h1>\n");

        if (ctx.inputs() != null) {
            output.append("<h2>Inputs</h2>\n");
            output.append(visit(ctx.inputs()));
        }
        
        if (ctx.outputs() != null) {
            output.append("<h2>Outputs</h2>\n");
            output.append(visit(ctx.outputs()));
        }
        
        if (ctx.latches() != null) {
            output.append("<h2>Latches</h2>\n");
            output.append(visit(ctx.latches()));
        }
        
        if (ctx.definitions() != null) {
            output.append("<h2>Definitions</h2>\n");
            output.append(visit(ctx.definitions()));
        }
        
        if (ctx.updates() != null) {
            output.append("<h2>Updates</h2>\n");
            output.append(visit(ctx.updates()));
        }
        
        if (ctx.siminputs() != null) {
            output.append("<h2>Simulation inputs</h2>\n");
            output.append(visit(ctx.siminputs()));
        }

        output.append("</body></html>\n");
        return output.toString();
    }

    @Override
    public String visitInputs(HDL0Parser.InputsContext ctx) {
        return visitSignal_list(ctx.signal_list());
    }

    @Override
    public String visitOutputs(HDL0Parser.OutputsContext ctx) {
        return visitSignal_list(ctx.signal_list());
    }

    @Override
    public String visitLatches(HDL0Parser.LatchesContext ctx) {
        return visitSignal_list(ctx.signal_list());
    }

    @Override
    public String visitSignal_list(HDL0Parser.Signal_listContext ctx) { // Ensure this matches the generated method
        StringBuilder signals = new StringBuilder();
        for (int i = 0; i < ctx.SIGNAL().size(); i++) {
            signals.append(ctx.SIGNAL(i).getText()).append("<br>\n");
        }
        return signals.toString();
    }

    @Override
    public String visitDefinitions(HDL0Parser.DefinitionsContext ctx) {
        StringBuilder definitions = new StringBuilder();
        for (HDL0Parser.DefinitionContext def : ctx.definition()) {
            definitions.append(visit(def)).append("<br>\n");
        }
        return definitions.toString();
    }

    @Override
    public String visitDefinition(HDL0Parser.DefinitionContext ctx) {
        String signal = ctx.SIGNAL().getText();
        String expression = visit(ctx.exp());
        return "\\(\\mathit{" + signal + "}(a,b) = (" + expression + ")\\)";
    }

    @Override
    public String visitUpdates(HDL0Parser.UpdatesContext ctx) {
        StringBuilder updates = new StringBuilder();
        for (HDL0Parser.UpdateContext update : ctx.update()) {
            updates.append(visit(update)).append("<br>\n");
        }
        return updates.toString();
    }

    @Override
    public String visitUpdate(HDL0Parser.UpdateContext ctx) {
        String outputSignal = ctx.SIGNAL().getText();
        String expression = visit(ctx.exp());
        return outputSignal + "&larr; " + expression;
    }

    @Override
    public String visitSiminputs(HDL0Parser.SiminputsContext ctx) {
        StringBuilder simInputs = new StringBuilder();
        for (HDL0Parser.SiminputContext simInput : ctx.siminput()) {
            simInputs.append(visit(simInput)).append("<br>\n");
        }
        return simInputs.toString();
    }

    @Override
    public String visitSiminput(HDL0Parser.SiminputContext ctx) {
        String signal = ctx.SIGNAL().getText();
        String value = ((RuleContext) ctx.BOOLEAN()).getText();
        return "<b>" + signal + "</b>: " + value;
    }

    @Override
    public String visitExp(HDL0Parser.ExpContext ctx) {
        // Handle the expression formatting in LaTeX
        if (ctx.NOT() != null) {
            return "\\neg " + visit(ctx.exp(0));
        } else if (ctx.AND() != null) {
            return "(" + visit(ctx.exp(0)) + "\\wedge " + visit(ctx.exp(1)) + ")";
        } else if (ctx.OR() != null) {
            return "(" + visit(ctx.exp(0)) + "\\vee " + visit(ctx.exp(1)) + ")";
        } else if (ctx.SIGNAL() != null) {
            return "\\mathrm{" + ((RuleContext) ctx.SIGNAL()).getText() + "}";
        } else if (ctx.function_call() != null) {
            return visit(ctx.function_call());
        }
        return "";
    }

    @Override
    public String visitFunction_call(HDL0Parser.Function_callContext ctx) {
        StringBuilder functionCall = new StringBuilder();
        functionCall.append("\\mathit{" + ctx.SIGNAL().getText() + "}(");
        for (int i = 0; i < ctx.exp().size(); i++) {
            functionCall.append(visit(ctx.exp(i)));
            if (i < ctx.exp().size() - 1) {
                functionCall.append(", ");
            }
        }
        functionCall.append(")");
        return functionCall.toString();
    }
}
