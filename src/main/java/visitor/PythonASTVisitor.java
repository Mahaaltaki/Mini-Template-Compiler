package visitor;
import antlr.*;
import ast.ASTNode;
import ast.BasicNode;

public class PythonASTVisitor extends FlaskPythonBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgramNode(FlaskPythonParser.ProgramNodeContext ctx) {
        ASTNode root = new BasicNode("Program", 0);
        for (var stmt : ctx.statement()) {
            root.addChild(visit(stmt));
        }
        return root;
    }

    @Override
    public ASTNode visitImportStat(FlaskPythonParser.ImportStatContext ctx) {
        ASTNode node = new BasicNode("ImportStatement", ctx.getStart().getLine());
        
        if (ctx.ID() != null) {
            node.addChild(new BasicNode("FromModule", ctx.ID().getText(), ctx.getStart().getLine()));
        }

        if (ctx.idList() != null) {
            for (var id : ctx.idList().ID()) {
                node.addChild(new BasicNode("ImportedItem", id.getText(), id.getSymbol().getLine()));
            }
        }
        return node;
    }

    @Override
    public ASTNode visitAssignStat(FlaskPythonParser.AssignStatContext ctx) {
        ASTNode node = new BasicNode("Assignment", ctx.getStart().getLine());
        node.addChild(new BasicNode("Target", ctx.ID().getText(), ctx.getStart().getLine()));
        node.addChild(visit(ctx.expression()));
        return node;
    }

    @Override
    public ASTNode visitFunctionCallExpr(FlaskPythonParser.FunctionCallExprContext ctx) {
        ASTNode node = new BasicNode("FunctionCall", ctx.getStart().getLine());
        node.addChild(new BasicNode("FuncName", ctx.ID().getText(), ctx.getStart().getLine()));
        if (ctx.argList() != null) {
            for (var expr : ctx.argList().expression()) {
                node.addChild(visit(expr));
            }
        }
        return node;
    }
    
    @Override
    public ASTNode visitListExpr(FlaskPythonParser.ListExprContext ctx) {
        ASTNode node = new BasicNode("List", ctx.getStart().getLine());
        if(ctx.expressionList() != null) {
            for(var expr : ctx.expressionList().expression()){
                node.addChild(visit(expr));
            }
        }
        return node;
    }
    
    @Override
    public ASTNode visitDictExpr(FlaskPythonParser.DictExprContext ctx) {
        return new BasicNode("Dictionary", ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitStringExpr(FlaskPythonParser.StringExprContext ctx) {
        return new BasicNode("StringLiteral", ctx.getText(), ctx.getStart().getLine());
    }
    
    @Override
    public ASTNode visitNumberExpr(FlaskPythonParser.NumberExprContext ctx) {
        return new BasicNode("IntegerLiteral", ctx.getText(), ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitIdExpr(FlaskPythonParser.IdExprContext ctx) {
        return new BasicNode("Identifier", ctx.getText(), ctx.getStart().getLine());
    }
}