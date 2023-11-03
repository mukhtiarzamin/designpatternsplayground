package gof.chainofresponsibility.logging;

/*
* Basic version was taken from
* https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
*
* */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(Enums.LogType.ERROR);
        AbstractLogger fileLogger = new FileLogger(Enums.LogType.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(Enums.LogType.INFO);
        AbstractLogger dbLogger = new DatabaseLogger(Enums.LogType.WARNING);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(dbLogger);

        return errorLogger;
    }

    private static AbstractLogger getChainOfOneActiveLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(Enums.LogType.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(Enums.LogType.INFO);
        AbstractLogger dbLogger = new DatabaseLogger(Enums.LogType.WARNING);

        errorLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(dbLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.printChain(loggerChain);
        loggerChain.logMessage(Enums.LogType.INFO,"This is an information.");
        loggerChain.logMessage(Enums.LogType.DEBUG,"This is an debug level information.");
        loggerChain.logMessage(Enums.LogType.ERROR,"This is an error ...");
        loggerChain.logMessage(Enums.LogType.WARNING,"This is an warning ...");

        loggerChain = getChainOfOneActiveLoggers();
        loggerChain.printChain(loggerChain);

        loggerChain.logOnceMessage(Enums.LogType.WARNING, "Print a warning message");
        loggerChain.logOnceMessage(Enums.LogType.INFO, "Print info message");
        loggerChain.logOnceMessage(Enums.LogType.DEBUG, "Print debug message");
        loggerChain.logOnceMessage(Enums.LogType.ERROR, "Print error message");
    }
}
