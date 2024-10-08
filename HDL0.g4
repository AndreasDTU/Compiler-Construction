grammar HDL0;

// Lexer Rules
BOOLEAN: '0' | '1';  
WHITESPACE: [ \t\r\n]+ -> skip;
fragment IDENT: [a-zA-Z][a-zA-Z0-9]*;
SIGNAL: IDENT '\''?; 

// Keywords and Symbols as Lexer Tokens
HARDWARE: 'hardware:';
INPUTS: 'inputs:';
OUTPUTS: 'outputs:';
LATCHES: 'latches:';
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

COMMENT: '//' ~[\n]* -> skip;
LONGCOMMENT: '/*' (~[*] | '*'~[/])* '*/' -> skip;

// Parser Rules
hdl0
    : hardware inputs outputs latches? definitions?
    updates siminputs;

hardware: 
    HARDWARE SIGNAL;

inputs:
    INPUTS signal_list;

outputs: 
    OUTPUTS signal_list;

latches:
    LATCHES signal_list;

definitions:
    (definition)+;

updates:
    UPDATES (update)+;

siminputs:
    SIMINPUTS (siminput+);

signal_list:
    SIGNAL (SIGNAL)*; // Signal list can contain multiple SIGNALS

definition:
    DEFINITIONS SIGNAL LPAREN (signal_list (COMMA signal_list)*)? RPAREN EQ exp;

siminput:
    SIGNAL EQ BOOLEAN+;

// Expression Rules
exp: NOT exp                                # Not         
    | exp AND? exp                          # And
    | exp OR exp                            # Or      
    | SIGNAL LPAREN (exp (COMMA exp)*)? RPAREN                        # Functioncall     
    | LPAREN exp RPAREN                     # Paren
    | SIGNAL                               # Signal
    ;

update:
    SIGNAL EQ exp;                          


