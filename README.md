# Mini-Template Compiler 🚀

### A Robust Web Template Engine Compiler

A comprehensive software engineering project designed to simulate the core functionality of modern template engines (similar to **Jinja2**). It seamlessly integrates HTML with Python-like logic (Variables, For-Loops, and Scopes). Built entirely **from scratch**, this project emphasizes **Clean Code** principles and strictly adheres to academic compiler construction concepts.

## 🌟 Key Features
*   **Lexical Analysis:** Efficient text tokenization and tag handling (`{{ }}`, `{% %}`) implemented using **Regular Expressions (Regex)**.
*   **AST Construction:** A robust **Abstract Syntax Tree** designed using **Object-Oriented Programming (OOP)** and **Polymorphism** to ensure scalability.
*   **Advanced Scope Management:** A sophisticated **Symbol Table** system capable of handling **Nested Scopes** and Loops, with dynamic scope creation and destruction (Enter/Exit Scope logic).
*   **Semantic Analysis:** Performs deep logical checks (e.g., detecting undefined variables or invalid scope access) prior to execution.
*   **Visitor Design Pattern:** Decouples the operational logic (Printing, Analyzing) from the data structure, ensuring a modular and maintainable architecture.

## 🛠 Project Architecture
The compiler is designed as a modular processing pipeline:

1.  **Lexer (`src/lexer.py`):**
    *   Converts source code into a stream of **Tokens**.
    *   Identifies keywords (`for`, `in`, `set`), identifiers, and literals.

2.  **Parser (`src/parser.py`):**
    *   Transforms the token stream into a hierarchical **Abstract Syntax Tree (AST)**.
    *   Performs syntax validation and grammar checks.

3.  **Symbol Table (`src/symbol_table.py`):**
    *   The core of the semantic engine. Implements a **Stack of Dictionaries** structure to simulate memory scopes.
    *   Supports hierarchical **Lookup** (from local to global scopes).

4.  **Visitors (`src/visitor.py`):**
    *   `PrintTreeVisitor`: Visualizes the AST structure for debugging purposes.
    *   `SemanticAnalyzerVisitor`: Validates variable definitions, types, and populates the Symbol Table.

## 💻 How to Run
Ensure you have **Python 3.x** installed. Run the following command in your terminal:

```bash
python main.py
