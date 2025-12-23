from abc import ABC, abstractmethod

class ASTNode(ABC):
    def __init__(self, line_number):
        self.line_number = line_number
        self.label = self.__class__.__name__

    @abstractmethod
    def accept(self, visitor):
        pass

class Program(ASTNode):
    def __init__(self, statements, line=1):
        super().__init__(line)
        self.statements = statements

    def accept(self, visitor):
        return visitor.visit_program(self)

class HTMLElement(ASTNode):
    def __init__(self, content, line):
        super().__init__(line)
        self.content = content

    def accept(self, visitor):
        return visitor.visit_html(self)

class VarDeclaration(ASTNode):
    def __init__(self, name, value, line):
        super().__init__(line)
        self.name = name
        self.value = value

    def accept(self, visitor):
        return visitor.visit_var_decl(self)

class VarReference(ASTNode):
    def __init__(self, name, line):
        super().__init__(line)
        self.name = name

    def accept(self, visitor):
        return visitor.visit_var_ref(self)

class ForLoop(ASTNode):
    def __init__(self, iterator, iterable, body, line):
        super().__init__(line)
        self.iterator = iterator
        self.iterable = iterable
        self.body = body

    def accept(self, visitor):
        return visitor.visit_for_loop(self)