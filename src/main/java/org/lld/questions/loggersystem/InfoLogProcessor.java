package org.lld.questions.loggersystem;

import org.lld.questions.loggersystem.observable.LogObservable;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(int level) {
        this.level = level;
    }


    @Override
    protected void display(String message, LogObservable logObservable) {
        logObservable.notifyObserver(LogLevel.INFO + " " + message);
    }
}
