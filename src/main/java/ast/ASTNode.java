package ast;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    private String label;
    private int lineNumber;
    protected List<ASTNode> children = new ArrayList<>();

    public ASTNode(String label, int lineNumber) {
        this.label = label;
        this.lineNumber = lineNumber;
    }

    public void addChild(ASTNode node) {
        if (node != null) children.add(node);
    }

    public List<ASTNode> getChildren() { return children; }

     public String printTree(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(isTail ? "+-- " : "|-- ").append(label);
        if (lineNumber > 0) sb.append(" (Line ").append(lineNumber).append(")");
        sb.append("\n");

        for (int i = 0; i < children.size() - 1; i++) {
            sb.append(children.get(i).printTree(prefix + (isTail ? "    " : "|   "), false));
        }
        if (!children.isEmpty()) {
            sb.append(children.get(children.size() - 1).printTree(prefix + (isTail ? "    " : "|   "), true));
        }
        return sb.toString();
    }
}