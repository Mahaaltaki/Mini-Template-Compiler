grammar SimpleCSS;

stylesheet : rule* EOF # StylesheetNode;

rule : selectors block # RuleNode;

selectors : selector (',' selector)* # SelectorListNode;

selector
    : '.' ID (ID)?   # ClassSelector
    | '#' ID (ID)?   # IdSelector
    | ID (ID)?       # TagSelector
    ;

block : '{' declaration* '}' # BlockNode;

declaration : propName ':' propValue ';' # DeclarationNode;

propName : ID | ID '-' ID;
propValue : ID | NUMBER | '#' ID | NUMBER ID | NUMBER PERCENT; 

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
