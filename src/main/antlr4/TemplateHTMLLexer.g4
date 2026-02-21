lexer grammar TemplateHTMLLexer;

DOCTYPE  : '<!' .*? '>';
JINJA_VAR : '{{' .*? '}}';
JINJA_TAG : '{%' .*? '%}';
TAG : '<' ~[>]+ '>';
TEXT : ~[<{]+;
WS : [ \t\r\n]+ -> skip;
