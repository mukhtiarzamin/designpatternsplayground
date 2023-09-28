package gof.chainofresponsibility.logging;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(Enums.LogType type){
        this.logType = type;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
