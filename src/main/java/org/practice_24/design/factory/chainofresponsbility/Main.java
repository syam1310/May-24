package org.practice_24.design.factory.chainofresponsbility;

public class Main {
    public static void main(String[] args) {
        LoggerProcessor loggerProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        loggerProcessor.log(LoggerProcessor.ERROR, "Exception happens");
        loggerProcessor.log(LoggerProcessor.INFO, "Just for info");
        loggerProcessor.log(LoggerProcessor.DEBUG, "Need to debug this");
    }
}
