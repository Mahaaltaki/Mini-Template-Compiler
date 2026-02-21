parser grammar FlaskPythonParser;

options { tokenVocab=FlaskPythonLexer; }

program : statement* EOF # ProgramNode;

statement
    : FROM src=ID IMPORT idList            # ImportStat
    | ID ASSIGN expression                 # AssignStat
    | RETURN expression?                   # ReturnStat
    | decoratorStat                        # DecoratorStatement
    | funcDef                              # FunctionDefStatement
    | expression                           # ExprStat
    ;

idList : ID (COMMA ID)*;

decoratorStat : AT dottedName LPAREN argList? RPAREN;
funcDef : DEF ID LPAREN paramList? RPAREN COLON;
dottedName : ID (DOT ID)*;
paramList : ID (COMMA ID)*;

expression
    : ID LPAREN argList? RPAREN            # FunctionCallExpr
    | LBRACK expressionList? RBRACK        # ListExpr
    | LBRACE dictPairs? RBRACE             # DictExpr
    | STRING                               # StringExpr
    | NUMBER                               # NumberExpr
    | dottedName                           # IdExpr
    | ID                                   # IdExprLegacy
    ;

argList : expression (COMMA expression)*;
expressionList : expression (COMMA expression)*;
dictPairs : pair (COMMA pair)*;
pair : expression COLON expression;
