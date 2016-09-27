package com.interview.pattern.responsibility;

import org.junit.Test;

public class ResponsibilityTest {

    @Test
    public void responsibilityTest() throws Exception {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        errorLogger.logMessage(AbstractLogger.INFO,"info log");
        errorLogger.logMessage(AbstractLogger.DEBUG,"debug log");
        errorLogger.logMessage(AbstractLogger.ERROR,"error log");

    }
}
