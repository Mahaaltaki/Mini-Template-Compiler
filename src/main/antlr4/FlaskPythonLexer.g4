lexer grammar FlaskPythonLexer;

FROM   : 'from';
IMPORT : 'import';
DEF    : 'def';
RETURN : 'return';
ASSIGN : '=';
COMMA  : ',';
COLON  : ':';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
LPAREN : '(';
RPAREN : ')';
AT     : '@';
DOT    : '.';

STRING : '"' .*? '"' | '\'' .*? '\'';
NUMBER : [0-9]+;
ID     : [a-zA-Z_][a-zA-Z0-9_]*;
WS     : [ \t\r\n]+ -> skip;
