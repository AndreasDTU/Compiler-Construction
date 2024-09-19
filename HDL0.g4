grammar HDL0;

//Lexer Rules

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

hardware: 
    hardware' SIGNAL;

inputs:
    'inputs:' signal_list;

outputs: 
    'outputs:' signal_list;

latches :
    'latches' signal_list;

definitions:
    (definition)*; 

updates:
    'updates:' (update)+;

siminputs:
    'siminputs:' (siminput+);


signal_list:
    SIGNAL (SIGNAL)*;

definition:
    'def:' SIGNAL '(' signal_list ')' '=' EXP;

update
    : SIGNAL '=' expression;

siminput:
    SIGNAL '=' BOOLEAN+;



function_call
    : SIGNAL '(' expression (',' expression)* ')';
