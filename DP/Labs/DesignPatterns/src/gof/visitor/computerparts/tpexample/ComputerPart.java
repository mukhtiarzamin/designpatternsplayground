package gof.visitor.computerparts.tpexample;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
