package visitor;
import antlr.*;
import symboltable.SymbolTable;
import antlr.SimpleCSSBaseVisitor;
import antlr.SimpleCSSParser;

public class CssSymbolTableVisitor extends SimpleCSSBaseVisitor<Void> {
    private SymbolTable symbolTable;

    public CssSymbolTableVisitor() {
        this.symbolTable = new SymbolTable("CSS");
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visitClassSelector(SimpleCSSParser.ClassSelectorContext ctx) {
        symbolTable.define("." + ctx.ID().getText(), "CSS CLASS", "Global");
        return null;
    }

    @Override
    public Void visitIdSelector(SimpleCSSParser.IdSelectorContext ctx) {
        symbolTable.define("#" + ctx.ID().getText(), "CSS ID", "Global");
        return null;
    }

    @Override
    public Void visitSelectorListNode(SimpleCSSParser.SelectorListNodeContext ctx) {
        return visitChildren(ctx);
    }
}