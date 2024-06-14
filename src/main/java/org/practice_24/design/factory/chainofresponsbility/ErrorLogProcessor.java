package org.practice_24.design.factory.chainofresponsbility;

public class ErrorLogProcessor extends LoggerProcessor {
    public ErrorLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
