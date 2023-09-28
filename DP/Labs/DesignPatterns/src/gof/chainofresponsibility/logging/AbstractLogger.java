package gof.chainofresponsibility.logging;

public abstract class AbstractLogger {
    protected Enums.LogType logType;

    //next element in chain or responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(Enums.LogType level, String message){
        if(this.logType == level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    public void logOnceMessage(Enums.LogType level, String message){
        if(this.logType == level){
            write(message);
        }
        else if(nextLogger !=null){
            nextLogger.logOnceMessage(level, message);
        }
        else {
            System.out.println("Current Chain has no support for "+level);
        }
    }

    abstract protected void write(String message);

    public void printChain(AbstractLogger loggerChain) {
        System.out.println("Chain: ");
        while(loggerChain!=null) {
            System.out.print(" > "+loggerChain.getClass().getName());
            loggerChain = loggerChain.nextLogger;
        }
        System.out.println();
    }
}
