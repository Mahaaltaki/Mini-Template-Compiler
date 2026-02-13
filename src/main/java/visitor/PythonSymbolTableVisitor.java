package visitor;

import symboltable.SymbolTable;
import antlr.*;

public class PythonSymbolTableVisitor extends FlaskPythonBaseVisitor<Void> {
    private SymbolTable symbolTable;

    public PythonSymbolTableVisitor() {
        this.symbolTable = new SymbolTable("PYTHON");
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visitAssignStat(FlaskPythonParser.AssignStatContext ctx) {
        String varName = ctx.ID().getText();
        String type = "Unknown"; 
        
        if (ctx.expression() instanceof FlaskPythonParser.ListExprContext) type = "LIST";
        else if (ctx.expression() instanceof FlaskPythonParser.DictExprContext) type = "DICTIONARY";
        else if (ctx.expression() instanceof FlaskPythonParser.StringExprContext) type = "STRING";
        else if (ctx.expression() instanceof FlaskPythonParser.NumberExprContext) type = "INTEGER";
        else if (ctx.expression() instanceof FlaskPythonParser.FunctionCallExprContext) type = "FUNC_CALL";

        symbolTable.define(varName, type, "Global");
        return null;
    }
    
    @Override
    public Void visitImportStat(FlaskPythonParser.ImportStatContext ctx) {
        if (ctx.idList() != null) {
            for(var id : ctx.idList().ID()) {
                 symbolTable.define(id.getText(), "MODULE_IMPORT", "Global");
            }
        }
        return null;
    }
}