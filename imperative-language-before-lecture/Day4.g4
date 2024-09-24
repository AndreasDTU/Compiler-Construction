p : '(' p ')'
  | '[' p ']'
  | 
  ;

// nonterminal er små symboler

nonterminal : gamma1 | gamma2 | ... | gammak;

//terminal symbols = Tokens ALTID UPPERCASE
//Skal være one non-terminal som start symbol 
//Stopper først når der ikke er mere at arbejde med


prog : stmt ';'
    | '{' stmts '}' ;
stmts : stmt ';' stmts
    | ;
stmt : IDENTIFIER '=' exp
    | 'if' '(' cond ')' prog 'else' prog
    | 'while' '(' cond ')' prog ;
exp : IDENTIFIER
    | INT
    | exp '+' exp
    | exp '*' exp
    | '(' exp ')' ;
cond : exp '==' exp
    | exp ' !=' exp ;


EXP : IDENT | INT (('+' | '*' | '/' | '-') (IDENT|INT))* ; //Not correct. Is ambigius/tvetydig. 

//A grammar for simple arithmetic expressions:
exp: IDENT | INT | exp '+' exp | exp '*' exp | '('exp')' ;
IDENT: [a-zA-Z][a-zA-Z0-9]*;
INT : [0-9]+;

add(3,mult(x,y)) //Weird

exp: IDENT | INT | exp'*'exp | exp'+'exp | '('exp')' ; //Changed so strongest binding operator comes first
IDENT: [a-zA-Z][a-zA-Z0-9]*;


//Example: på topdown parser

conditional : 'if' bexp 'then' program 'else' program ;
Token token; //always holds the next token to parse
void conditional() {
    if (token != IF_TOKEN) { error(expecting 'if'"); }
    token = lex();
    bexp();
    if (token != THEN_TOKEN) { error("expecting 'then'); }
    token = lex();
    program();
    if (token != ELSE_TOKEN) {error("expecting 'else'"); }
    token = lex();
    program();
}
//Program() may again call conditional()


//Fra hans:
grammar prog; //Navn på fil

// taking only part of last week's imperative language:

start   : e=exp EOF ;

exp : x=IDENTIFIER	                # Variable
    | f=FLOAT		                # Constant
    | e1=exp op=('*'|'/') e2=exp    # MultiDiv
    | e1=exp op=('+'|'-') e2=exp    # AddSub
    | '(' e=exp ')'  	            # Paren
    ;

IDENTIFIER : [a-zA-Z] [a-zA-Z_0-9]* ;  // x17y

FLOAT      : [0-9]+ ('.' [0-9]+)? ;

WHITESPACE : [ \t\n]+ -> skip;

COMMENT : '//' ~[\n]* -> skip;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
