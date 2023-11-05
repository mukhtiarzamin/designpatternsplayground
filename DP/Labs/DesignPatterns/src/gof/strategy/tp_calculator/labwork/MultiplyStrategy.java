package gof.strategy.tp_calculator.labwork;

public class MultiplyStrategy extends Computer {
    public MultiplyStrategy(){}
    public MultiplyStrategy(Computer nextStrategy) {
        this.nextComputer = nextStrategy;
    }

    @Override
    public int computeResult(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >=1000 && num1 <= 5000 && num2 >=1000 && num2 <= 5000 ) {
            computationResult = num1 * num2;
            System.out.println("Multiplication in Range:"+num1+" x "+num2+" = "+computationResult);
            return computationResult;
        }
        if(nextComputer == null)
            System.out.println("Kindly add support for given range.");
        else
            return nextComputer.computeInRange(num1,num2);
        return 0;
    }
}
