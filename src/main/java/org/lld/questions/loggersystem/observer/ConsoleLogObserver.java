package org.lld.questions.loggersystem.observer;

public class ConsoleLogObserver implements LogSinkObserver{
    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
