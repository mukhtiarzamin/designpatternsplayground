package gof.strategy.tp_calculator.labwork;

public class AddStrategy extends Computer  {
    public AddStrategy(){

    }
    public AddStrategy(Computer nextStrategy) {
        this.nextComputer = nextStrategy;
    }

    @Override
    public int computeResult(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
            computationResult = num1 + num2;
            System.out.println("Addition in Range:"+num1+" + "+num2+" = "+computationResult);
            return computationResult;
        }
        if (nextComputer == null)
            System.out.println("Kindly add support for given range.");
        else
            return nextComputer.computeInRange(num1, num2);
        return 0;
    }
}
