import java.util.List;
// Generated from prog.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
public class PrettyPrintVisitor extends HDL0BaseVisitor<String> {

    private StringBuilder html;

    public PrettyPrintVisitor() {
        // Initialize the HTML structure with boilerplate code
        html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html><head><title>HDL0 Circuit</title>\n");
        html.append("<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n");
        html.append("<script type=\"text/javascript\" id=\"MathJax-script\" async ");
        html.append("src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\"></script>\n");
        html.append("</head><body>\n");
    }

    // Visit the 'hardware' section to get the name
    @Override
    public String visitHardware(HDL0Parser.HardwareContext ctx) {
        String title = ctx.SIGNAL().getText();
        html.append("<h1>").append(title).append("</h1>\n");
        return null;  // Not adding this to return as it's already in the HTML builder
    }

    // Visit the 'inputs' section
    @Override
    public String visitInputs(HDL0Parser.InputsContext ctx) {
        html.append("<h2>Inputs</h2>\n");
        List<HDL0Parser.SignalContext> signals = ctx.signal_list().SIGNAL();
        for (HDL0Parser.SignalContext signal : signals) {
            html.append(signal.getText()).append("<br>\n");
        }
        return null;
    }

    // Visit the 'outputs' section
    @Override
    public String visitOutputs(HDL0Parser.OutputsContext ctx) {
        html.append("<h2>Outputs</h2>\n");
        List<HDL0Parser.SignalContext> signals = ctx.signal_list().SIGNAL();
        for (HDL0Parser.SignalContext signal : signals) {
            html.append(signal.getText()).append("<br>\n");
        }
        return null;
    }

    // Visit the 'latches' section
    @Override
    public String visitLatches(HDL0Parser.LatchesContext ctx) {
        html.append("<h2>Latches</h2>\n");
        List<HDL0Parser.SignalContext> signals = ctx.signal_list().SIGNAL();
        for (HDL0Parser.SignalContext signal : signals) {
            html.append(signal.getText()).append("<br>\n");
        }
        return null;
    }

    // Visit 'updates' and format with LaTeX
    @Override
    public String visitUpdates(HDL0Parser.UpdatesContext ctx) {
        html.append("<h2>Updates</h2>\n");
        for (HDL0Parser.UpdateContext updateCtx : ctx.update()) {
            String leftSignal = updateCtx.SIGNAL().getText();
            String expression = visit(updateCtx.exp());  // Visit the expression for LaTeX format
            html.append(leftSignal).append("&larr;\\(").append(expression).append("\\)<br>\n");
        }
        return null;
    }

    // Visit expressions and convert to LaTeX
    @Override
    public String visitExp(HDL0Parser.ExpContext ctx) {
        if (ctx.OR() != null) {
            // Handle OR expression
            return "(" + visit(ctx.exp(0)) + " \\vee " + visit(ctx.exp(1)) + ")";
        } else if (ctx.AND() != null) {
            // Handle AND expression
            return "(" + visit(ctx.exp(0)) + " \\wedge " + visit(ctx.exp(1)) + ")";
        } else if (ctx.NOT() != null) {
            // Handle NOT expression
            return "\\neg(" + visit(ctx.exp(0)) + ")";
        } else if (ctx.SIGNAL() != null) {
            // Handle single signal
            return "\\mathrm{" + ctx.SIGNAL().getText() + "}";
        }
        return null;
    }

    // Visit simulation inputs
    @Override
    public String visitSiminputs(HDL0Parser.SiminputsContext ctx) {
        html.append("<h2>Simulation Inputs</h2>\n");
        for (HDL0Parser.SiminputContext siminputCtx : ctx.siminput()) {
            String signal = siminputCtx.SIGNAL().getText();
            String booleanValues = siminputCtx.BOOLEAN().getText();
            html.append("<b>").append(signal).append("</b>: ").append(booleanValues).append("<br>\n");
        }
        return null;
    }

    // Final method to generate the HTML content
    public String getHtmlOutput() {
        html.append("</body></html>\n");
        return html.toString();
    }
}
