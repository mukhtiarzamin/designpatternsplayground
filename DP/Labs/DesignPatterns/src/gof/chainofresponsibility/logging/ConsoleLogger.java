package gof.chainofresponsibility.logging;

public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(Enums.LogType type){
        this.logType = type;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
