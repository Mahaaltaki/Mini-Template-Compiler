import antlr.*;
import ast.ASTNode;
import symboltable.SymbolTable;
import visitor.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(">>> STARTING COMPILER PROJECT <<<\n");

            processPython("test_files/app.py");

            processCSS("test_files/style.css");

            processHTML("test_files/templates/index.html");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processPython(String filePath) throws IOException {
        System.out.println("Processing Python: " + filePath);
        FlaskPythonLexer lexer = new FlaskPythonLexer(CharStreams.fromPath(Paths.get(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FlaskPythonParser parser = new FlaskPythonParser(tokens);
        ParseTree tree = parser.program();

        PythonASTVisitor astVisitor = new PythonASTVisitor();
        ASTNode root = astVisitor.visit(tree);
        System.out.println("\n--- PYTHON AST ---");
        System.out.println(root.printTree("", true));

        PythonSymbolTableVisitor symVisitor = new PythonSymbolTableVisitor();
        symVisitor.visit(tree);
        symVisitor.getSymbolTable().printTable();
    }

    private static void processCSS(String filePath) throws IOException {
        System.out.println("Processing CSS: " + filePath);
        SimpleCSSLexer lexer = new SimpleCSSLexer(CharStreams.fromPath(Paths.get(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleCSSParser parser = new SimpleCSSParser(tokens);
        ParseTree tree = parser.stylesheet();

        CssSymbolTableVisitor cssVisitor = new CssSymbolTableVisitor();
        cssVisitor.visit(tree);
        cssVisitor.getSymbolTable().printTable();
    }

    private static void processHTML(String filePath) throws IOException {
        System.out.println("Processing HTML Template: " + filePath);
        TemplateHTMLLexer lexer = new TemplateHTMLLexer(CharStreams.fromPath(Paths.get(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TemplateHTMLParser parser = new TemplateHTMLParser(tokens);
        ParseTree tree = parser.htmlDocument();

        HtmlSymbolTableVisitor htmlVisitor = new HtmlSymbolTableVisitor();
        htmlVisitor.visit(tree);
        htmlVisitor.getSymbolTable().printTable();
    }
}