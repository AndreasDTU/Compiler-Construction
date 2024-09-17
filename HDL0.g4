grammar prog;

start   : cmd* EOF ;

cmd : IDENT '=' exp ';'