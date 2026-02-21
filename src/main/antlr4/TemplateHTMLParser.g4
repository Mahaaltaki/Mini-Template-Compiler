parser grammar TemplateHTMLParser;

options { tokenVocab=TemplateHTMLLexer; }

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
