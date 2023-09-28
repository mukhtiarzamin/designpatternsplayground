package gof.chainofresponsibility.logging;

public class DatabaseLogger extends AbstractLogger {
    public DatabaseLogger(Enums.LogType logType) {
        this.logType=logType;
    }

    @Override
    protected void write(String message) {
        System.out.println("Database::Logger: " + message);
    }
}
