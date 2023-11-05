package gof.strategy.tp_calculator.labwork;

public abstract class Computer implements Strategy{
        public int computationResult;
        public Computer nextComputer;
        public abstract int computeInRange(int num1, int num2);
}
