package org.lld.questions.loggersystem;

import org.lld.questions.loggersystem.observable.LogObservable;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(int level) {
        this.level = level;
    }


    @Override
    protected void display(String message, LogObservable logObservable) {
        logObservable.notifyObserver(LogLevel.DEBUG + " " + message);
    }
}
