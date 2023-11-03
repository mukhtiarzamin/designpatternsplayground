package gof.visitor.computerparts.tpexample.labwork;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
    void accept(ComputerPartMaintenanceVisitor computerPartMaintainVisitor);
}
