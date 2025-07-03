package org.example.patterns.observer.observers;

public class TvObserver implements DisplayObserver {

    @Override
    public void updateObserverState(String s) {
        System.out.println("State had changed in the weather observable, i'm here in tv observer" + s);
    }
}
