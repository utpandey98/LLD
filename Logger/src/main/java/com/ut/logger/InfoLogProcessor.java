package com.ut.logger;

public class InfoLogProcessor extends LogProcessor{

    int logLevel = INFO;

    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == this.logLevel) {
            System.out.println("INFO: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
