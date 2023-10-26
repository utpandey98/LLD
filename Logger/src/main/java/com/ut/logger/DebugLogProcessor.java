package com.ut.logger;

public class DebugLogProcessor extends LogProcessor {

    int logLevel = DEBUG;
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == this.logLevel) {
            System.out.println("DEBUG: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
