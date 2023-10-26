package com.ut.logger;

public class ErrorLogProcessor extends LogProcessor {

    int logLevel = ERROR;
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == this.logLevel) {
            System.out.println("ERROR: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
