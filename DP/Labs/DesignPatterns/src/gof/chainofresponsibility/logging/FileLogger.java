package gof.chainofresponsibility.logging;

public class FileLogger extends AbstractLogger{
    public FileLogger(Enums.LogType type){
        this.logType = type;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
