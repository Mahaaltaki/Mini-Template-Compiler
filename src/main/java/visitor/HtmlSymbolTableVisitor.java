package visitor;

import symboltable.SymbolTable;
import antlr.TemplateHTMLBaseVisitor;
import antlr.TemplateHTMLParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlSymbolTableVisitor extends TemplateHTMLBaseVisitor<Void> {
    private SymbolTable symbolTable;

    public HtmlSymbolTableVisitor() {
        this.symbolTable = new SymbolTable("HTML TEMPLATE");
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visitJinjaPrintNode(TemplateHTMLParser.JinjaPrintNodeContext ctx) {
        String rawText = ctx.getText(); 
        
        String content = rawText.replace("{{", "").replace("}}", "").trim();

        if (content.contains("url_for")) {
            Pattern p = Pattern.compile("url_for\\(['\"](.*?)['\"]\\)");
            Matcher m = p.matcher(content);
            if (m.find()) {
                symbolTable.define(m.group(1), "URL_ENDPOINT", "Template");
            }
            return null;
        }

        String varName = content;
        if (varName.contains(".")) {
            varName = varName.split("\\.")[0];
        }

        if (!varName.isEmpty()) {
            symbolTable.define(varName, "JINJA VAR", "Template");
        }
        return null;
    }

    @Override
    public Void visitJinjaCodeNode(TemplateHTMLParser.JinjaCodeNodeContext ctx) {
        String text = ctx.getText(); 
        
        String content = text.replace("{%", "").replace("%}", "").trim();
        
        if (content.startsWith("for ")) {
            String[] parts = content.split("\\s+");
            
            if (parts.length >= 4 && parts[2].equals("in")) {
                String loopVar = parts[1]; 
                String listVar = parts[3]; 
                
                symbolTable.define(loopVar, "LOOP VAR", "Local Scope");
                symbolTable.define(listVar, "ITERABLE", "Global Scope");
            }
        }
        return null;
    }
}