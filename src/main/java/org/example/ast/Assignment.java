package org.example.ast;

public class Assignment implements Statement {
    private final String varName;
    private final Expression value;

    public Assignment(String varName, Expression value) {
        this.varName = varName;
        this.value = value;
    }

    public String getVarName() {
        return varName;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Assignment(" + varName + " = " + value + ")";
    }
}
