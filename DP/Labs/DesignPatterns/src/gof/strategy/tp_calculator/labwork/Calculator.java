package gof.strategy.tp_calculator.labwork;

public class Calculator {
    private Computer computeStrategy;
    private Computer chainOfStrategies;

    public Calculator(Computer strategy){
        this.computeStrategy = strategy;
    }

    public int compute(int num1, int num2){
        return computeStrategy.computeResult(num1,num2);
    }

    public int computeInRange(int num1, int num2){
        chainOfStrategies = new AddStrategy(new SubtractStrategy(new MultiplyStrategy(new DivideStrategy(new PowerStrategy()))));
        return chainOfStrategies.computeInRange(num1,num2);
    }
}
