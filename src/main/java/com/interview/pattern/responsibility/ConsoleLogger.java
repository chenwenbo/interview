package com.interview.pattern.responsibility;

/**
 * Created by apple on 2016/09/27 23:51.
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("console log" + message);
    }

}
