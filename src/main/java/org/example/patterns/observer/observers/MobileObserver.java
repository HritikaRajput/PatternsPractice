package org.example.patterns.observer.observers;

public class MobileObserver implements DisplayObserver {

    @Override
    public void updateObserverState(String s) {
        System.out.println("State had changed in the weather observable, i'm here in mobile observer " + s);
    }
}
