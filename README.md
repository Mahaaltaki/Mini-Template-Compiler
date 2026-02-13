# 🚀 Multi-Language Web Compiler

**A robust static analysis tool and compiler front-end built with Java and ANTLR4.**

This project implements a complete compiler pipeline capable of parsing and analyzing a full web stack context, including **Python (Flask)** logic, **CSS** styling, and **HTML (Jinja2)** templates. It features a custom AST generation engine and a comprehensive Symbol Table with scope management.

---

## 📋 Table of Contents
- [Project Overview](#-project-overview)
- [Key Features](#-key-features)
- [Architecture](#-architecture)
- [Grammars & Parsing](#-grammars--parsing)
- [Prerequisites](#-prerequisites)
- [How to Compile & Run](#-how-to-compile--run)
- [Project Structure](#-project-structure)
- [Screenshots / Output](#-screenshots--output)

---

## 📖 Project Overview
Unlike simple parsers, this project handles the complexity of mixing languages. It analyzes:
1.  **Backend Logic:** Python code using Flask framework syntax.
2.  **Frontend Styling:** CSS rules, selectors, and properties.
3.  **Dynamic Templates:** HTML files embedded with Jinja2 template logic (variables, loops).

The goal is to verify syntax, generate an Abstract Syntax Tree (AST), and populate a Symbol Table to track variable definitions across different scopes (Global, Local, Template).

---

## ✨ Key Features
*   **Lexical & Syntax Analysis:** Powered by **ANTLR4** to generate high-performance lexers and parsers.
*   **Abstract Syntax Tree (AST):** Builds a clean, hierarchical tree representation of Python code for easy analysis.
*   **Semantic Analysis:** Implements a **Symbol Table** to track:
    *   Python variables, functions, and imports.
    *   CSS classes and IDs.
    *   HTML/Jinja variables and loop iterators.
*   **Design Patterns:** Utilizes the **Visitor Pattern** to decouple the grammar logic from the application logic, ensuring clean and maintainable code.
*   **Error Handling:** Robust grammar rules that handle edge cases (e.g., Python imports with commas, complex HTML tags).

---

## 🏗 Architecture
The project follows a modular pipeline architecture:

1.  **Input:** Source files (`app.py`, `style.css`, `index.html`).
2.  **Lexer/Parser (ANTLR):** Converts code into Parse Trees based on `.g4` grammars.
3.  **AST Visitor:** Traverses the Python Parse Tree to build a simplified AST.
4.  **Symbol Table Visitor:** Traverses all trees to extract metadata (types, scopes, names).
5.  **Output:** Prints the AST structure and Symbol Table snapshots to the console.

---

## 🔧 Grammars & Parsing
The project defines three distinct grammars in `src/main/antlr4`:

| Grammar | Description | Key Capabilities |
| :--- | :--- | :--- |
| **FlaskPython.g4** | Parses Python code. | Handles imports, assignments, lists, dictionaries, and function calls. |
| **SimpleCSS.g4** | Parses CSS stylesheets. | Identifies class selectors (`.btn`), ID selectors (`#header`), and properties. |
| **TemplateHTML.g4** | Parses HTML/Jinja. | distinguishing between raw HTML, text, Jinja variables (`{{ x }}`), and blocks (`{% for %}`). |

---

## ⚙️ Prerequisites
To run this project, ensure you have the following installed:

*   **Java Development Kit (JDK):** Version 21 or higher.
*   **ANTLR4 Library:** `antlr-4.13.1-complete.jar` (Included in the project root).

---

## 🚀 How to Compile & Run

### 1. Generate ANTLR Sources (If modified)
If you modify the `.g4` files, regenerate the Java sources:
```bash
java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -package antlr -visitor -no-listener src/main/antlr4/FlaskPython.g4
java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -package antlr -visitor -no-listener src/main/antlr4/SimpleCSS.g4
java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -package antlr -visitor -no-listener src/main/antlr4/TemplateHTML.g4


Note: Move the generated files to src/main/java/antlr/.
2. Compile the Project (Windows/PowerShell)
code Powershell

# 1. Generate source list
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { '"' + ($_.FullName -replace '\\', '/') + '"' } | Out-File -Encoding ascii sources.txt

# 2. Compile
javac -cp ".;antlr-4.13.1-complete.jar" -d out "@sources.txt"

3. Run the Compiler
code Powershell

java -cp ".;antlr-4.13.1-complete.jar;out" Main

📂 Project Structure
code Text

Compiler Project/
├── antlr-4.13.1-complete.jar   # Core dependency
├── src/
│   └── main/
│       ├── antlr4/             # Grammar files (.g4)
│       └── java/
│           ├── antlr/          # Generated Parser/Lexer code
│           ├── ast/            # AST Node classes
│           ├── symboltable/    # Symbol Table implementation
│           ├── visitor/        # Semantic Analysis Visitors
│           └── Main.java       # Entry point
├── test_files/                 # Input files for testing
│   ├── app.py
│   ├── style.css
│   └── templates/
│       └── index.html
└── README.md

✅ Sample Output

When running the project, you will see output similar to this:
code Text

>>> STARTING COMPILER PROJECT <<<

--- PYTHON AST ---
+-- Program
    |-- ImportStatement (Line 1)
    |-- Assignment (Line 3)
        +-- List (Line 3)

=== PYTHON SYMBOL TABLE ===
| NAME       | TYPE          | SCOPE  |
| app        | FUNC_CALL     | Global |
| products   | LIST          | Global |

=== HTML SYMBOL TABLE ===
| NAME       | TYPE          | SCOPE      |
| title      | JINJA VAR     | Template   |
| item       | LOOP VAR      | Local Scope|

Developed by: [ Maha altaki]
