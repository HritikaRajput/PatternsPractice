package org.lld.questions.loggersystem;

import org.lld.questions.loggersystem.observable.LogObservable;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(int level) {
        this.level = level;
    }


    @Override
    protected void display(String message, LogObservable logObservable) {
        logObservable.notifyObserver(LogLevel.ERROR + " " + message);
    }
}
