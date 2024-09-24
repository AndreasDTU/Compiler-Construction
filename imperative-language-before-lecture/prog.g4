grammar prog; //Navn på fil

// taking only part of last week's imperative language:

start   : e=exp EOF ;

exp : x=IDENTIFIER	                # Variable
    | f=FLOAT		                # Constant
    | e1=exp op=('*'|'/') e2=exp    # MultDiv
    | e1=exp op=('+'|'-') e2=exp    # AddSub
    | '(' e=exp ')'  	            # Paren
    ;

IDENTIFIER : [a-zA-Z] [a-zA-Z_0-9]* ;  // x17y

FLOAT      : [0-9]+ ('.' [0-9]+)? ;

WHITESPACE : [ \t\n]+ -> skip;

COMMENT : '//' ~[\n]* -> skip;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
