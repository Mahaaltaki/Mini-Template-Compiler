package ast;

public class BasicNode extends ASTNode {
    private String value;

    public BasicNode(String label, int lineNumber) {
        super(label, lineNumber);
    }
    
    public BasicNode(String label, String value, int lineNumber) {
        super(label, lineNumber);
        this.value = value;
    }

    @Override
    public String toString() {
        return value == null ? super.toString() : value;
    }
}