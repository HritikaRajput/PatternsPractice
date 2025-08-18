package org.lld.questions.loggersystem.observable;

import org.lld.questions.loggersystem.observer.LogSinkObserver;

public interface LogSinkObservable {
    void addObserver(LogSinkObserver logSinkObserver);
    void removeObserver(LogSinkObserver logSinkObserver);
    void updateObserverState(String message);
    void notifyObserver(String message);
}
