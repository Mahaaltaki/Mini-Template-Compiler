grammar TemplateHTML;

//Parser Rules

htmlDocument : node* EOF # DocumentNode;

node
    : jinjaPrint   # JinjaPrintNode   
    | jinjaCode    # JinjaCodeNode    
    | htmlTag      # HtmlTagNode      
    | htmlText     # TextNode         
    ;

jinjaPrint : JINJA_VAR;
jinjaCode  : JINJA_TAG;
htmlTag    : TAG;
htmlText   : TEXT;

// Lexer Rules

JINJA_VAR : '{{' .*? '}}';

JINJA_TAG : '{%' .*? '%}';

TAG : '<' ~[>]+ '>';

TEXT : ~[<{]+;

WS : [ \t\r\n]+ -> skip;