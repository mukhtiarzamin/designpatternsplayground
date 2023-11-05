package gof.strategy.tp_calculator.labwork;

public class SubtractStrategy extends Computer {
    public SubtractStrategy(){}
    public SubtractStrategy(Computer nextStrategy) {
        this.nextComputer = nextStrategy;
    }

    @Override
    public int computeResult(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        if (num1 >= 100 && num1 <= 1000 && num2 >= 100 && num2 <= 1000) {
            computationResult = num1 - num2;
            System.out.println("Subtraction in Range:"+num1+" - "+num2+" = "+computationResult);
            return computationResult;
        }
        if (nextComputer == null)
            System.out.println("Kindly add support for given range.");
        else
            return nextComputer.computeInRange(num1, num2);
        return 0;
    }
}
