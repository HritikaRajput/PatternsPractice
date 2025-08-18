package org.lld.questions.loggersystem;

import org.lld.questions.loggersystem.observable.LogObservable;
import org.lld.questions.loggersystem.observer.ConsoleLogObserver;
import org.lld.questions.loggersystem.observer.FileLogObserver;

public class LogManager {
    protected static LogProcessor buildChainOfLogger() {
        LogProcessor infoLogProcessor = new InfoLogProcessor(1);
        LogProcessor errorLogProcessor = new ErrorLogProcessor(2);
        LogProcessor debugLogProcessor = new DebugLogProcessor(3);

        infoLogProcessor.setNextLogProcessor(errorLogProcessor);
        errorLogProcessor.setNextLogProcessor(debugLogProcessor);

        return infoLogProcessor;
    }

    protected static LogObservable buildObserversAndObservables() {
        LogObservable logObservable = new LogObservable();
        logObservable.addObserver(new ConsoleLogObserver());
        logObservable.addObserver(new FileLogObserver());

        return logObservable;
    }
}
