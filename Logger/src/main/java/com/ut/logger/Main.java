package com.ut.logger;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.INFO, "hellow");
        logProcessor.log(LogProcessor.DEBUG, "hellow");
        logProcessor.log(LogProcessor.ERROR, "hellow");
    }
}
