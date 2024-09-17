grammar prog;

start   : cmd* EOF ;

cmd : IDENT '=' exp ';'
    | IDENT '++' ';'
    | 'while' '(' condition ')' cmd
    | 'if' '(' condition ')' cmd ('else' cmd)?
    | '{' cmd* '}'
    ;

condition : exp ('==' | '!=' | '<' | '>') exp
	  | condition '&&' condition
	  | condition '||' condition
	  | '!' condition
	  ;

exp : CONST
    | IDENT
    | exp OP exp
    | '(' exp ')'
    ;

OP : '+' | '/' | '-' | '*' ;

CONST : [0-9]+ ('.' [0-9]+)? ;

IDENT : [a-zA-Z][a-zA-Z0-9]* ;

WHITESPACE : [ \n\t]+ -> skip ;
COMMENT : '//' ~[\n]* -> skip ;


ANYTHING : . ;
