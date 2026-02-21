package visitor;
import antlr.*;
import symboltable.SymbolTable;
import antlr.SimpleCSSParserBaseVisitor;
import antlr.SimpleCSSParser;

public class CssSymbolTableVisitor extends SimpleCSSParserBaseVisitor<Void> {
    private SymbolTable symbolTable;

    public CssSymbolTableVisitor() {
        this.symbolTable = new SymbolTable("CSS");
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visitClassSelector(SimpleCSSParser.ClassSelectorContext ctx) {
        String name = ctx.ID(0).getText();
        symbolTable.define("." + name, "CSS CLASS", "Global");
        return null;
    }

    @Override
    public Void visitIdSelector(SimpleCSSParser.IdSelectorContext ctx) {
        String name = ctx.ID(0).getText();
        symbolTable.define("#" + name, "CSS ID", "Global");
        return null;
    }

    @Override
    public Void visitSelectorListNode(SimpleCSSParser.SelectorListNodeContext ctx) {
        return visitChildren(ctx);
    }
}
