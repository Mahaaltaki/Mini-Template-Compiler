grammar TemplateHTML;

htmlDocument : node* EOF # DocumentNode;

node
    : doctype      # DoctypeNode
    | jinjaPrint   # JinjaPrintNode   
    | jinjaCode    # JinjaCodeNode    
    | htmlTag      # HtmlTagNode      
    | htmlText     # TextNode         
    ;

doctype    : DOCTYPE;
jinjaPrint : JINJA_VAR;
jinjaCode  : JINJA_TAG;
htmlTag    : TAG;
htmlText   : TEXT;

DOCTYPE  : '<!' .*? '>';
JINJA_VAR : '{{' .*? '}}';

JINJA_TAG : '{%' .*? '%}';

TAG : '<' ~[>]+ '>';

TEXT : ~[<{]+;

WS : [ \t\r\n]+ -> skip;
