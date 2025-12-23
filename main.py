from src.lexer import Lexer
from src.parser import Parser
from src.visitor import SemanticAnalyzerVisitor, PrintTreeVisitor

def compile_project(source_code):
    try:
        print("\n=== 1. Lexical Analysis ===")
        lexer = Lexer(source_code)
        tokens = lexer.tokenize()
        
        print("\n=== 2. Parsing ===")
        parser = Parser(tokens)
        ast = parser.parse()
        
        print("\n=== 3. Printing AST ===")
        printer = PrintTreeVisitor()
        ast.accept(printer)
        
        print("\n=== 4. Semantic Analysis ===")
        analyzer = SemanticAnalyzerVisitor()
        ast.accept(analyzer)
        
    except Exception as e:
        print(f"\nCRITICAL ERROR: {e}")

if __name__ == "__main__":
    sample_code = """
    <h1>Welcome</h1>
    {% set user = user_name %}
    {% for item in products_list %}
        <p>{{ item }}</p>
    {% endfor %}
    """
    compile_project(sample_code)