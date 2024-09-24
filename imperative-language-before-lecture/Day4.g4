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
