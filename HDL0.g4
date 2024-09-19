grammar HDL0;

// Lexer Rules
NUMBER: [0-9]+;  
BOOLEAN: '0' | '1';  
WHITESPACE: [ \t\r\n]+ -> skip;
IDENT: [a-zA-Z][a-zA-Z0-9]*;
SIGNAL: IDENT '\''?;  // Handles signal names with optional prime (e.g., Oscillator')


// Keywords and Symbols as Lexer Tokens
HARDWARE: 'hardware';
INPUTS: 'inputs:';
OUTPUTS: 'outputs:';
LATCHES: 'latches';
DEFINITIONS: 'def:';
UPDATES: 'updates:';
SIMINPUTS: 'siminputs:';

EQ: '=';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
AND: '*';
OR: '+';
NOT: '/';


// Parser Rules

hdl0
    : hardware inputs outputs latches? definitions? updates siminputs;

hardware: 
    HARDWARE SIGNAL;

inputs:
    INPUTS signal_list;

outputs: 
    OUTPUTS signal_list;

latches :
    LATCHES signal_list;

definitions:
    (definition)*;

updates:
    UPDATES (update)+;

siminputs:
    SIMINPUTS (siminput+);

signal_list:
    SIGNAL (SIGNAL)*;

definition:
    DEFINITIONS SIGNAL LPAREN signal_list RPAREN EQ exp;

update:
    SIGNAL EQ exp;

siminput:
    SIGNAL EQ BOOLEAN+;

// Expression Rules
exp:
      NOT exp              // Negation
    | exp AND exp           // AND
    | exp OR exp            // OR
    | function_call         // Function calls
    | LPAREN exp RPAREN     // Parentheses
    | SIGNAL                // Signal
    ;

function_call
    : SIGNAL LPAREN exp (COMMA exp)* RPAREN;
