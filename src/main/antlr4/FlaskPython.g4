grammar FlaskPython;

//Parser Rules 

program : statement* EOF # ProgramNode;

statement
    : FROM src=ID IMPORT idList            # ImportStat
    | ID ASSIGN expression                 # AssignStat
    | expression                           # ExprStat
    ;

idList : ID (COMMA ID)*;

expression
    : ID LPAREN argList? RPAREN            # FunctionCallExpr
    | LBRACK expressionList? RBRACK        # ListExpr
    | LBRACE dictPairs? RBRACE             # DictExpr
    | STRING                               # StringExpr
    | NUMBER                               # NumberExpr
    | ID                                   # IdExpr
    ;

argList : expression (COMMA expression)*;
expressionList : expression (COMMA expression)*;
dictPairs : pair (COMMA pair)*;
pair : expression COLON expression;

// Lexer Rules

FROM   : 'from';
IMPORT : 'import';
ASSIGN : '=';
COMMA  : ',';
COLON  : ':';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
LPAREN : '(';
RPAREN : ')';

STRING : '"' .*? '"' | '\'' .*? '\'';
NUMBER : [0-9]+;
ID     : [a-zA-Z_][a-zA-Z0-9_]*;

WS     : [ \t\r\n]+ -> skip;