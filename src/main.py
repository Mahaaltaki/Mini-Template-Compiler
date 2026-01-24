from src.lexer import Lexer
from src.parser import Parser
from src.visitor import SemanticAnalyzerVisitor, PrintTreeVisitor

def compile_project(source_code):
    print("=== 1. Lexical Analysis ===")
    lexer = Lexer(source_code)
    tokens = lexer.tokenize()
    
    print("\n=== 2. Parsing (AST Construction) ===")
    parser = Parser(tokens)
    ast = parser.parse()
    
    print("\n=== 3. AST Printing ===")
    printer = PrintTreeVisitor()
    ast.accept(printer)
    
    print("\n=== 4. Semantic Analysis & Symbol Table ===")
    analyzer = SemanticAnalyzerVisitor()
    ast.accept(analyzer)

if __name__ == "__main__":
    sample_code = """
    <h1>Welcome</h1>
    {% set user = 'Saria' %}
    {% for item in products %}
        <p>{{ item }}</p>
    {% endfor %}
    """
    compile_project(sample_code)