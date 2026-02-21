# Mini Template Compiler

A sophisticated multi-language compiler and static analysis tool designed to bridge the gap between backend logic (Flask/Python) and frontend templates (HTML/CSS). This project utilizes **ANTLR4** to generate lexers and parsers, enabling semantic analysis, symbol table management, and Abstract Syntax Tree (AST) generation across different file formats.

## 🚀 Overview

Modern web development often involves tight coupling between server-side variables and client-side templates. This compiler parses **Flask Python** files, **HTML Templates**, and **CSS** stylesheets to analyze structures, validate symbol usage, and build a unified representation of the web application.

## ✨ Key Features

- **Multi-Language Parsing:** powered by ANTLR4 for:
  - 🐍 **Flask/Python:** Parses backend logic and route definitions.
  - 🌐 **Template HTML:** Parses HTML structures mixed with template tags.
  - 🎨 **Simple CSS:** Parses stylesheet definitions.
- **Symbol Table Management:** Implements a robust symbol table to track variables, functions, and scopes across different languages.
- **AST Generation:** Builds an Abstract Syntax Tree (AST) for further code analysis or optimization.
- **Visitor Pattern:** Utilizes the Visitor design pattern for traversing parse trees and populating symbol tables efficiently.

## 📂 Project Structure

The project is organized into modular components separating grammar logic, tree traversal, and data structures:

```text
src/main/java/
├── antlr/                  # ANTLR4 Generated Code & Base Classes
│   ├── FlaskPython*        # Lexer, Parser, Listeners for Python
│   ├── SimpleCSS*          # Lexer, Parser, Listeners for CSS
│   ├── TemplateHTML*       # Lexer, Parser, Listeners for HTML
│
├── ast/                    # Abstract Syntax Tree Nodes
│   ├── ASTNode.java
│   └── BasicNode.java
│
├── symboltable/            # Semantic Analysis
│   └── SymbolTable.java    # Core logic for scope and variable tracking
│
├── visitor/                # Tree Traversal Logic
│   ├── PythonSymbolTableVisitor.java  # Extracts symbols from Python
│   ├── HtmlSymbolTableVisitor.java    # Extracts symbols from HTML
│   ├── CssSymbolTableVisitor.java     # Extracts symbols from CSS
│   └── PythonASTVisitor.java          # Builds AST from Python parse tree
│
└── Main.java               # Entry point of the compiler

🛠️ Technologies Used

    Java: Core programming language.

    ANTLR4 (Another Tool for Language Recognition): Parser generator for reading, processing, executing, or translating structured text or binary files.

⚙️ Installation & Build
Prerequisites

    Java Development Kit (JDK) 8 or higher.

    ANTLR4 Runtime library.

How to Run

    Clone the repository:
    code Bash

    git clone https://github.com/Mahaaltaki/Mini-Template-Compiler.git
    cd Mini-Template-Compiler

    Compile the project:
    Ensure the ANTLR4 runtime jar is in your classpath.
    code Bash

    javac -cp ".;path/to/antlr-4.x-complete.jar" src/main/java/Main.java

    Run the Compiler:
    code Bash

    java -cp ".;path/to/antlr-4.x-complete.jar" src.main.java.Main

(Note: If you are using an IDE like IntelliJ IDEA or Eclipse, simply import the project as a Maven/Gradle project or add the ANTLR library to your project structure).
🧩 How It Works

    Lexical Analysis: The source files (Python, HTML, CSS) are tokenized by their respective Lexers (FlaskPythonLexer, etc.).

    Parsing: The tokens are converted into a Parse Tree by the Parsers.

    Semantic Analysis: The Visitor classes traverse the parse trees.

        PythonSymbolTableVisitor identifies variables defined in the backend.

        HtmlSymbolTableVisitor checks if the templates use valid variables.

    Symbol Resolution: The SymbolTable class ensures that identifiers are declared before use and adhere to scope rules.
