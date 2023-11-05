package gof.strategy.tp_calculator.labwork;

public class Demo {

    public static void main(String[] args) {
        Calculator context = new Calculator(new AddStrategy());
        System.out.println("10 + 5 = " + context.compute(10, 5));
        System.out.println("160 + 65 = " + context.compute(160, 65));
        System.out.println("160 + 65 = " + context.compute(160, 65));

        context = new Calculator(new SubtractStrategy());
        System.out.println("10 - 5 = " + context.compute(10, 5));
        System.out.println("10 - 45 = " + context.compute(10, 45));

        context = new Calculator(new MultiplyStrategy());
        System.out.println("10 * 5 = " + context.compute(10, 5));
        System.out.println("10 * 25 = " + context.compute(10, 25));

        context.computeInRange(1,5);
        context.computeInRange(1,105);

    }

}
