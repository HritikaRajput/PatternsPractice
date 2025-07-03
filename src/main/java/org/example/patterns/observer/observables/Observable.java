package org.example.patterns.observer.observables;

import org.example.patterns.observer.observers.DisplayObserver;

public interface Observable {

    void add(DisplayObserver displayObserver);

    void remove(DisplayObserver displayObserver);

    void notifyObservers(String s);

    void changeState(String s);
}
