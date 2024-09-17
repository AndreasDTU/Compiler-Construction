grammar html;

////////////// PARSER: ///////////

start   :  html* EOF ;

html : '<i>' html* '</i>'
     | '<b>' html* '</b>'
     | '<h1>' html* '</h1>'
     | '<h2>' html* '</h2>'
     | '<html>' html* '</html>'
     | '<body>' html* '</body>'
     | '<head>' html* '</head>'
     | BEGINTAG html* ENDTAG
     | TEXT
     ;

////////////// LEXER: ////////

BEGINTAG : '<' IDENT '>' ; 
ENDTAG : '</' IDENT '>' ; 

fragment
IDENT : [a-zA-Z][a-zA-Z0-9]* ;

TEXT : ~[<>/& \n\t]+ ;

WHITESPACE : [ \n\t] -> skip ;
