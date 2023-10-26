package com.ut.logger;

public abstract class LogProcessor {

    public static int INFO = 0;
    public static int DEBUG = 1;
    public static int ERROR = 2;
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log (int logLevel, String msg) {
        if(nextLogProcessor != null) {
          nextLogProcessor.log(logLevel, msg);
        }
    }
}
