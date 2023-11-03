package gof.visitor.computerparts.tpexample.labwork;

public class ComputerPartMaintainer implements ComputerPartMaintenanceVisitor{
    @Override
    public void maintain(Computer computer) {
        System.out.println("Maintaing Computer.");
    }

    @Override
    public void maintain(Mouse mouse) {
        System.out.println("Maintaing Mouse.");
    }

    @Override
    public void maintain(Keyboard keyboard) {
        System.out.println("Maintaing Keyboard.");
    }

    @Override
    public void maintain(Monitor monitor) {
        System.out.println("Maintaing Monitor.");
    }

    @Override
    public void maintain(Multimedia multimedia) {
        System.out.println("Maintaing Multimedia.");
    }
}
