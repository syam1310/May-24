package org.practice_24.design.factory.chainofresponsbility;

public class DebugLogProcessor extends LoggerProcessor {
    public DebugLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
