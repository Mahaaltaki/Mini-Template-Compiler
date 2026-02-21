lexer grammar SimpleCSSLexer;

ID     : [a-zA-Z][a-zA-Z0-9_-]*;
NUMBER : [0-9]+;
WS     : [ \t\r\n]+ -> skip;
DOT    : '.';
HASH   : '#';
COMMA  : ',';
COLON  : ':';
SEMI   : ';';
LBRACE : '{';
RBRACE : '}';
PERCENT : '%';
LPAREN : '(';
RPAREN : ')';
DASH   : '-';
