package symboltable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    public static class Symbol {
        String name;
        String type;
        String scope;

        public Symbol(String name, String type, String scope) {
            this.name = name;
            this.type = type;
            this.scope = scope;
        }
    }

    private List<Symbol> symbols = new ArrayList<>();
    private String tableName;

    public SymbolTable(String tableName) {
        this.tableName = tableName;
    }

    public void define(String name, String type, String scope) {
        symbols.add(new Symbol(name, type, scope));
    }

    public void printTable() {
        System.out.println("\n=======================================================");
        System.out.println("   " + tableName + " SYMBOL TABLE SNAPSHOT");
        System.out.println("=======================================================");
        System.out.printf("| %-20s | %-15s | %-10s |\n", "NAME", "TYPE", "SCOPE");
        System.out.println("-------------------------------------------------------");
        for (Symbol s : symbols) {
            System.out.printf("| %-20s | %-15s | %-10s |\n", s.name, s.type, s.scope);
        }
        System.out.println("=======================================================\n");
    }
}