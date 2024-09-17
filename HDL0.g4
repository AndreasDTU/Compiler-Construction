grammar HDL0;

//Lexer Rules
SIGNAL: [0-1];
NUMBER
WHITESPACE: [ \t\r\n]+ -> skip;




//Parser Rules


outputs: 
    'outputs:' signal_list;




