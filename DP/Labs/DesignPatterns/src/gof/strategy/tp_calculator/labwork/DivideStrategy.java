package gof.strategy.tp_calculator.labwork;

public class DivideStrategy extends Computer {
    public DivideStrategy(){}
    public DivideStrategy(Computer nextStrategy) {
        this.nextComputer = nextStrategy;
    }

    @Override
    public int computeResult(int num1, int num2) {
        if(num2 == 0)
            return -1;
        return num1/num2;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >=5000 && num1 <= 10000 && num2 >=5000 && num2 <= 10000 ){
            computationResult = num2 == 0 ? 0: num1 / num2;
            System.out.println("Division in Range:"+num1+" / "+num2+" = "+computationResult);
            return computationResult;
        }
        if(nextComputer == null)
            System.out.println("Kindly add support for given range.");
        else
            return nextComputer.computeInRange(num1,num2);
        return 0;
    }
}
