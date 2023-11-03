package gof.visitor.computerparts.tpexample.labwork;

public class Computer implements ComputerPart {
    ComputerPart[] parts;
    ComputerPart partToMaintain;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }
    public Computer(ComputerPart part){
        this.partToMaintain = part;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

    @Override
    public void accept(ComputerPartMaintenanceVisitor computerPartMaintenanceVisitor) {
        partToMaintain.accept(computerPartMaintenanceVisitor);
    }
}