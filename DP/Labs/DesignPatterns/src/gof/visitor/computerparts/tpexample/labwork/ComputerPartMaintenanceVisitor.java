package gof.visitor.computerparts.tpexample.labwork;

public interface ComputerPartMaintenanceVisitor {
    void maintain(Computer computer);
    void maintain(Mouse mouse);
    void maintain(Keyboard keyboard);
    void maintain(Monitor monitor);
    void maintain(Multimedia multimedia);
}
