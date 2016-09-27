package com.interview.pattern.responsibility;

public abstract class AbstractLogger {

    private AbstractLogger nextLogger;

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger!=null) {
            nextLogger.logMessage(level,message);
        }
    }

    protected abstract void write(String message);

}
