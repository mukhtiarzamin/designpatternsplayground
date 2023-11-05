package gof.strategy.tp_calculator.labwork;

public class PowerStrategy extends Computer {
    @Override
    public int computeResult(int num1, int num2) {
        int result=num1;
        for (int i=2; i <= num2; i++)
            result += num1 * result;
        return result;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >=10000 && num1 <= 20000 && num2 >=10000 && num2 <= 20000 ) {
            computationResult=num1;
            for (int i=2; i <= num2; i++)
                computationResult += num1 * computationResult;
            System.out.println("Power in Range:"+num1+" power "+num2+" = "+computationResult);
            return computationResult;
        }
        if(nextComputer == null)
            System.out.println("Kindly add support for given range.");
        else
            return nextComputer.computeInRange(num1,num2);
        return 0;
    }
}
