package gof.visitor.computerparts.tpexample.labwork;

public class Demo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        new Computer(new Mouse()).accept(new ComputerPartMaintainer() {
        });
    }
}
