package org.lld.questions.loggersystem.observer;

public class FileLogObserver implements LogSinkObserver{
    @Override
    public void logMessage(String message) {
        System.out.println("writing to a file: " + message);
    }
}
