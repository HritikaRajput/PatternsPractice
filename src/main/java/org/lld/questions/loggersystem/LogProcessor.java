package org.lld.questions.loggersystem;

import org.lld.questions.loggersystem.observable.LogObservable;
import org.lld.questions.loggersystem.observable.LogSinkObservable;

public abstract class LogProcessor{
    int level;
    LogProcessor nextLogProcessor;

    public void setNextLogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void logMessage(int level, String message, LogObservable logObservable) {
        if(this.level == level) {
            display(message, logObservable);
        }
        if(nextLogProcessor != null) {
            nextLogProcessor.logMessage(level, message, logObservable);
        }
    }

    protected abstract void display(String message, LogObservable logObservable);
}
