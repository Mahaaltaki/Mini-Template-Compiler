import re

class TokenType:
    HTML = "HTML"
    VAR_OPEN = "VAR_OPEN"
    VAR_CLOSE = "VAR_CLOSE"
    TAG_OPEN = "TAG_OPEN"
    TAG_CLOSE = "TAG_CLOSE"
    IDENTIFIER = "IDENTIFIER"
    STRING = "STRING"
    NUMBER = "NUMBER"
    KEYWORD = "KEYWORD"
    EOF = "EOF"

class Token:
    def __init__(self, type_, value, line):
        self.type = type_
        self.value = value
        self.line = line

    def __repr__(self):
        return f"Token({self.type}, '{self.value}')"

class Lexer:
    def __init__(self, source):
        self.source = source
        self.tokens = []
        self.line = 1
        self.pos = 0

    def tokenize(self):
        pattern = re.compile(r'(\{\{.*?\}\}|\{%.*?%\})', re.DOTALL)
        parts = pattern.split(self.source)

        for part in parts:
            if not part: continue
            current_line_count = part.count('\n')
            
            if part.startswith('{{'):
                self._tokenize_variable(part)
            elif part.startswith('{%'):
                self._tokenize_tag(part)
            else:
                if part.strip(): 
                    self.tokens.append(Token(TokenType.HTML, part.strip(), self.line))
            
            self.line += current_line_count

        self.tokens.append(Token(TokenType.EOF, "", self.line))
        return self.tokens

    def _tokenize_variable(self, content):
        self.tokens.append(Token(TokenType.VAR_OPEN, "{{", self.line))
        inner = content[2:-2].strip()
        self.tokens.append(Token(TokenType.IDENTIFIER, inner, self.line))
        self.tokens.append(Token(TokenType.VAR_CLOSE, "}}", self.line))

    def _tokenize_tag(self, content):
        self.tokens.append(Token(TokenType.TAG_OPEN, "{%", self.line))
        inner = content[2:-2].strip()
        words = inner.split()
        
        for word in words:
            if word in ['for', 'in', 'endfor', 'set', '=']:
                self.tokens.append(Token(TokenType.KEYWORD, word, self.line))
            elif word.startswith('"') or word.startswith("'"):
                self.tokens.append(Token(TokenType.STRING, word.strip('"\''), self.line))
            elif word.isdigit():
                self.tokens.append(Token(TokenType.NUMBER, word, self.line))
            else:
                self.tokens.append(Token(TokenType.IDENTIFIER, word, self.line))

        self.tokens.append(Token(TokenType.TAG_CLOSE, "%}", self.line))