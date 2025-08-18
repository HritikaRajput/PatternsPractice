package org.lld.questions.loggersystem.observable;

import org.lld.questions.loggersystem.observer.LogSinkObserver;

import java.util.ArrayList;
import java.util.List;

public class LogObservable implements  LogSinkObservable{
    List<LogSinkObserver> observerList = new ArrayList<>();
    @Override
    public void addObserver(LogSinkObserver logSinkObserver) {
        this.observerList.add(logSinkObserver);
    }

    @Override
    public void removeObserver(LogSinkObserver logSinkObserver) {
        this.observerList.remove(logSinkObserver);
    }

    @Override
    public void updateObserverState(String message) {
        notifyObserver(message);
    }

    @Override
    public void notifyObserver(String message) {
        for(LogSinkObserver observer: observerList) {
            observer.logMessage(message);
        }
    }
}
