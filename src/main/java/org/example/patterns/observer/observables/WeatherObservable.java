package org.example.patterns.observer.observables;

import org.example.patterns.observer.observers.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservable implements Observable {
    List<DisplayObserver> displayObserverList =  new ArrayList<>();
    @Override
    public void add(DisplayObserver displayObserver) {
        displayObserverList.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        displayObserverList.remove(displayObserver);
    }

    @Override
    public void notifyObservers(String s) {
        for(DisplayObserver observer: displayObserverList) {
            observer.updateObserverState(s);
        }
    }

    @Override
    public void changeState(String s) {
        notifyObservers(s);
    }
}
