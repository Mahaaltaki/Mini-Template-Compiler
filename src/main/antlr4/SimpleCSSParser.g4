parser grammar SimpleCSSParser;

options { tokenVocab=SimpleCSSLexer; }

stylesheet : rule* EOF # StylesheetNode;

rule : selectors block # RuleNode;

selectors : selector (COMMA selector)* # SelectorListNode;

selector
    : DOT ID (ID)? (COLON ID)*   # ClassSelector
    | HASH ID (ID)? (COLON ID)*  # IdSelector
    | ID (ID)? (COLON ID)*       # TagSelector
    ;

block : LBRACE declaration* RBRACE # BlockNode;

declaration : propName COLON propValue SEMI # DeclarationNode;

propName : ID | ID DASH ID;
propValue
    : ID
    | NUMBER
    | HASH (ID | NUMBER)
    | NUMBER ID
    | NUMBER PERCENT
    | ID LPAREN (NUMBER (COMMA NUMBER)*)? RPAREN
    ;
