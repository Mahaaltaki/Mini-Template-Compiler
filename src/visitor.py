from src.symbol_table import SymbolTable

class PrintTreeVisitor:
    def __init__(self):
        self.indent = 0

    def _print_node(self, node, info=""):
        indentation = "  " * self.indent
        node_label = getattr(node, 'label', node.__class__.__name__)
        print(f"{indentation}- [{node_label}] (Line: {node.line_number}) {info}")

    def visit_program(self, node):
        self._print_node(node)
        self.indent += 1
        for stmt in node.statements:
            stmt.accept(self)
        self.indent -= 1

    def visit_html(self, node):
        self._print_node(node, info=f"Content: {node.content[:30].strip()}...")

    def visit_var_decl(self, node):
        self._print_node(node, info=f"Name: {node.name}, Value: {node.value}")

    def visit_var_ref(self, node):
        self._print_node(node, info=f"Variable Reference: {node.name}")

    def visit_for_loop(self, node):
        self._print_node(node, info=f"Iterator: {node.iterator}, Iterable: {node.iterable}")
        self.indent += 1
        for stmt in node.body:
            stmt.accept(self)
        self.indent -= 1
        
class SemanticAnalyzerVisitor:
    def __init__(self):
        self.symbol_table = SymbolTable()

    def visit_program(self, node):
        print("\nSemantic Analysis Started...")
        self.symbol_table.define("products_list", "List", ["p1", "p2"])
        self.symbol_table.define("user_name", "String", "Ali")
        self.symbol_table.define("current_year", "Number", 2025)
        
        for stmt in node.statements:
            stmt.accept(self)
            
        print("Analysis Complete.")
        self.symbol_table.print_table()

    def visit_html(self, node):
        pass

    def visit_var_decl(self, node):
        self.symbol_table.define(node.name, "Variable", node.value)

    def visit_var_ref(self, node):
        full_name = node.name
        base_name = full_name.split('.')[0] if '.' in full_name else full_name
        symbol = self.symbol_table.lookup(base_name)
        
        if symbol is None:
            print(f"Error: Variable '{full_name}' not defined at line {node.line_number}")
            raise Exception("Semantic Error")

    def visit_for_loop(self, node):
        iterable_sym = self.symbol_table.lookup(node.iterable)
        if iterable_sym is None:
            print(f"Error: Iterable '{node.iterable}' not found at line {node.line_number}")
            raise Exception("Semantic Error")
        
        self.symbol_table.enter_scope()
        self.symbol_table.define(node.iterator, "Iterator", None)
        
        for stmt in node.body:
            stmt.accept(self)
            
        self.symbol_table.exit_scope()