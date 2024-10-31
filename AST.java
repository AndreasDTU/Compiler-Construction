import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

public abstract class AST{
    public void error(String msg){
	System.err.println(msg);
	System.exit(-1);
    }
    public abstract Boolean eval(Environment env);
};

/* Expressions are similar to arithmetic expressions in the impl
   language: the atomic expressions are just Signal (similar to
   variables in expressions) and they can be composed to larger
   expressions with And (Conjunction), Or (Disjunction), and Not
   (Negation). Moreover, an expression can be using any of the
   functions defined in the definitions. */

abstract class Expr extends AST{}

class Conjunction extends Expr{
    // Example: Signal1 * Signal2 
    Expr e1,e2;
    Conjunction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    @Override
    public Boolean eval(Environment env) {
        return e1.eval(env) && e2.eval(env);
    }
}

class Disjunction extends Expr{
    // Example: Signal1 + Signal2 
    Expr e1,e2;
    Disjunction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    @Override
    public Boolean eval(Environment env) {
        return e1.eval(env) || e2.eval(env);
    }
}

class Negation extends Expr{
    // Example: /Signal
    Expr e;
    Negation(Expr e){this.e=e;}
    @Override
    public Boolean eval(Environment env) {
        return !e.eval(env);
    }
}

class UseDef extends Expr{
    // Using any of the functions defined by "def"
    // e.g. xor(Signal1,/Signal2) 
    String f;  // the name of the function, e.g. "xor" 
    List<Expr> args;  // arguments, e.g. [Signal1, /Signal2]
    UseDef(String f, List<Expr> args){
	this.f=f; this.args=args;
    }
    @Override
    public Boolean eval(Environment env) {
        // Example implementation for "xor" function
        if (f.equals("xor") && args.size() == 2) {
            Boolean arg1 = args.get(0).eval(env);
            Boolean arg2 = args.get(1).eval(env);
            return (arg1 || arg2) && !(arg1 && arg2);
        }
        // Add more functions as needed (e.g., NAND, NOR, etc.)
        throw new RuntimeException("Unknown function: " + f);
    }
}

class Signal extends Expr{
    String varname; // a signal is just identified by a name 
    Signal(String varname){this.varname=varname;}
    @Override
    public Boolean eval(Environment env) {
        if (!env.hasVariable(varname)) {
            throw new RuntimeException("Signal " + varname + " not found in environment.");
        }
        return env.getVariable(varname);
    }
}

class Def extends AST{
    // Definition of a function
    // Example: def xor(A,B) = A * /B + /A * B
    String f; // function name, e.g. "xor"
    List<String> args;  // formal arguments, e.g. [A,B]
    Expr e;  // body of the definition, e.g. A * /B + /A * B
    Def(String f, List<String> args, Expr e){
	this.f=f; this.args=args; this.e=e;
    }
    public Boolean eval(Environment env) {
        error("Def called with eval");
        return false;
    }
}

// An Update is any of the lines " signal = expression "
// in the update section

class Update extends AST {
    String name;  // The signal being updated, e.g., "Signal1"
    Expr e;       // The expression whose value is assigned, e.g., "/Signal2"
    
    // Constructor
    Update(String name, Expr e) {
        this.name = name;
        this.e = e;
    }

    // Method to evaluate the expression and update the environment
    @Override
    public Boolean eval(Environment env) {
        // Evaluate the expression and get the result
        Boolean result = e.eval(env);
        
        // Update the environment: set the value of the signal to the result
        env.setVariable(name, result);

        // Return true to indicate successful update
        return true;
    }
}



/* A Trace is a signal and an array of Booleans, for instance each
   line of the .simulate section that specifies the traces for the
   input signals of the circuit. It is suggested to use this class
   also for the output signals of the circuit in the second
   assignment.
*/

class Trace extends AST{
    // Example Signal = 0101010
    String signal;
    Boolean[] values;
    Trace(String signal, Boolean[] values){
	this.signal=signal;
	this.values=values;
    }
    @Override
    public Boolean eval(Environment env) {
        // Traces are usually not evaluated in this sense
        return true;
    }
}

/* The main data structure of this simulator: the entire circuit with
   its inputs, outputs, latches, definitions and updates. Additionally
   for each input signal, it has a Trace as simulation input.
   
   There are two variables that are not part of the abstract syntax
   and thus not initialized by the constructor (so far): simoutputs
   and simlength. It is suggested to use these two variables for
   assignment 2 as follows: 
 
   1. all siminputs should have the same length (this is part of the
   checks that you should implement). set simlength to this length: it
   is the number of simulation cycles that the interpreter should run.

   2. use the simoutputs to store the value of the output signals in
   each simulation cycle, so they can be displayed at the end. These
   traces should also finally have the length simlength.
*/

class Circuit extends AST{
    String name;  
    List<String> inputs; 
    List<String> outputs;
    List<String>  latches;
    List<Def> definitions;
    List<Update> updates;
    List<Trace>  siminputs;
    List<Trace>  simoutputs;
    int simlength;
    Circuit(String name,
	    List<String> inputs,
	    List<String> outputs,
	    List<String>  latches,
	    List<Def> definitions,
	    List<Update> updates,
	    List<Trace>  siminputs){
	this.name=name;
	this.inputs=inputs;
	this.outputs=outputs;
	this.latches=latches;
	this.definitions=definitions;
	this.updates=updates;
	this.siminputs=siminputs;
    }
    @Override
    public Boolean eval(Environment env) {
        // Evaluate updates in sequence, updating the environment
        for (Update update : updates) {
            Boolean result = update.eval(env);
            env.setVariable(update.name, result);
        }

        // Return some value; in a real scenario, you'd probably return the final output state or results
        return true;
    }
}
