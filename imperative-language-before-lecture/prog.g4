grammar prog;

// taking only part of last week's imperative language:

start   : exp EOF ;

exp : IDENTIFIER	
    | FLOAT		
    | exp ('*'|'/') exp
    | exp ('+'|'-') exp
    | exp '(' exp ')'  	
    ;
    
IDENTIFIER : [a-zA-Z] [a-zA-Z_0-9]* ;  // x17y

FLOAT      : [0-9]+ ('.' [0-9]+)? ;

WHITESPACE : [ \t\n]+ -> skip;

COMMENT : '//' ~[\n]* -> skip;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
