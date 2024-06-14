package org.practice_24.design.factory.chainofresponsbility;

public abstract class LoggerProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LoggerProcessor nextLoggerProcessor;

    public LoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLoggerProcessor != null){
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
