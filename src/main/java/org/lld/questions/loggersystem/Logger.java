package org.lld.questions.loggersystem;

import org.lld.questions.loggersystem.observable.LogObservable;

import static org.lld.questions.loggersystem.LogManager.buildChainOfLogger;
import static org.lld.questions.loggersystem.LogManager.buildObserversAndObservables;

public class Logger {
    private static Logger logger;
    private static LogProcessor logProcessorChain;
    private static LogObservable logObservables;

    private Logger() {

    }

    public static synchronized Logger getInstance() {
        if(logger == null) {
            synchronized (Logger.class) {
                if(logger == null) {
                    logProcessorChain = buildChainOfLogger(); // not bulding here since it is not the responsibility of this class
                    logObservables = buildObserversAndObservables();
                    return new Logger();
                }
            }
        }
        return logger;
    }

    private void createLog(int level, String message) {
        logProcessorChain.logMessage(level,message, logObservables);
    }

    public void info(String message) {
        createLog(1, message);
    }
    public void debug(String message) {
        createLog(3, message);
    }
    public void error(String message) {
        createLog(2, message);
    }


}
