grammar cc;

// grammatik  parser
start   :
(FLOAT|IDENT|
',' | '(' | ')' | '{' | '}' | 'while'
| '=' | '==' 
| '!=' | ';' | '-'  | CONST 
| '*' )* fail EOF ;

fail : ANYTHING* ;

// TOKENS  lexer

FLOAT : 'float' ;

CONST : [0-9]+;

//LPAREN : '(' ;
//RPAREN : ')' ;

IDENT : [a-zA-Zæøå_] ([a-zA-Zæøå_0-9]*);

//WHITESPACE : (' ' | '\n' | '\t')+ -> skip; 
WHITESPACE : [ \n\t]+ -> skip; 

COMMENT : '//' (~[\n])* '\n' -> skip; 

ANYTHING : . ;

