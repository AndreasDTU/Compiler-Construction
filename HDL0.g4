grammar HDL0;

//Lexer Rules
HARDWARE: 'hardware' ;
INPUTS: 
    'inputs:' signal_list;
EXP: 
    |
    | (EXP)
    ;
SIGNAL: [0-1];
NUMBER
WHITESPACE: [ \t\r\n]+ -> skip;
F(EXPS): IDENT "(" EXP ")" ;
IDENT: [a-zA-Z][a-zA-Z0-9]*;



//Parser Rules


outputs: 
    'outputs:' signal_list;

signal_list:
    SIGNAL (SIGNAL)*;



