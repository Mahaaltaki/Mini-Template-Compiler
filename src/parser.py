from src.ast_nodes import Program, HTMLElement, VarDeclaration, ForLoop, VarReference

class Parser:
    def __init__(self, tokens):
        self.tokens = tokens
        self.pos = 0

    def current_token(self):
        return self.tokens[self.pos]

    def eat(self, token_type):
        if self.current_token().type == token_type:
            self.pos += 1
        else:
            raise Exception(f"Unexpected token: {self.current_token()} at line {self.current_token().line}, expected {token_type}")

    def parse(self):
        statements = []
        while self.current_token().type != "EOF":
            stmt = self.parse_statement()
            if stmt:
                statements.append(stmt)
        return Program(statements)

    def parse_statement(self):
        token = self.current_token()

        if token.type == "HTML":
            self.pos += 1
            return HTMLElement(token.value, token.line)

        elif token.type == "VAR_OPEN":
            self.eat("VAR_OPEN")
            var_name = self.current_token().value
            self.eat("IDENTIFIER")
            self.eat("VAR_CLOSE")
            return VarReference(var_name, token.line)

        elif token.type == "TAG_OPEN":
            self.eat("TAG_OPEN")
            keyword = self.current_token()
            
            if keyword.value == "for":
                return self.parse_for_loop()
            elif keyword.value == "set":
                return self.parse_assignment()
            elif keyword.value == "endfor":
                return None 
            else:
                self.pos += 1 
                if self.current_token().type == "TAG_CLOSE":
                    self.eat("TAG_CLOSE")
                return None
        else:
            self.pos += 1
            return None

    def parse_for_loop(self):
        line = self.current_token().line
        self.eat("KEYWORD")
        iterator = self.current_token().value
        self.eat("IDENTIFIER")
        self.eat("KEYWORD")
        iterable = self.current_token().value
        self.eat("IDENTIFIER")
        self.eat("TAG_CLOSE")
        
        body = []
        while self.current_token().type != "EOF":
            if self.current_token().type == "TAG_OPEN":
                if self.pos + 1 < len(self.tokens):
                    next_token = self.tokens[self.pos + 1]
                    if next_token.type == "KEYWORD" and next_token.value == "endfor":
                        break
            stmt = self.parse_statement()
            if stmt:
                body.append(stmt)

        self.eat("TAG_OPEN")
        self.eat("KEYWORD")
        self.eat("TAG_CLOSE")
        return ForLoop(iterator, iterable, body, line)

    def parse_assignment(self):
        line = self.current_token().line
        self.eat("KEYWORD")
        name = self.current_token().value
        self.eat("IDENTIFIER")
        
        if self.current_token().value == "=":
             self.pos += 1
        elif self.current_token().type == "KEYWORD" and self.current_token().value == "=":
             self.pos += 1

        val_token = self.current_token()
        value = val_token.value
        
        if val_token.type == "STRING":
            self.eat("STRING")
        elif val_token.type == "NUMBER":
            self.eat("NUMBER")
        elif val_token.type == "IDENTIFIER":
            self.eat("IDENTIFIER")
        else:
            raise Exception(f"Unexpected assignment value at line {line}: {val_token}")

        self.eat("TAG_CLOSE")
        return VarDeclaration(name, value, line)