grammar HDL0;

//Lexer Rules

INPUTS: 
    'inputs:' signal_list;
EXP: 
    |
    | (EXP)
    ;
SIGNAL: [0-1];
NUMBER: [0-9]+;  
BOOLEAN: '0' | '1';  
WHITESPACE: [ \t\r\n]+ -> skip;
F(EXPS): IDENT "(" EXP ")" ;
IDENT: [a-zA-Z][a-zA-Z0-9]*;
SIGNAL: [IDENT']*;


//Parser Rules

hdl0
    : hardware inputs outputs latches? definitions? updates siminputs;

hardware: 'hardware' SIGNAL;

definitions:
    (definition)*; 

inputs:
    'inputs:' signal_list

outputs: 
    'outputs:' signal_list;

latches :
    'latches' signal_list;

definition:
    IDENT "("signal_list")" "=" EXP;

signal_list:
    SIGNAL (SIGNAL)*;

updates
    : 'updates:' (update)+;

update
    : SIGNAL '=' expression;

siminput
    : SIGNAL '=' BOOLEAN+;


function_call
    : SIGNAL '(' expression (',' expression)* ')';
