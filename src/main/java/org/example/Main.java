package org.example;

import org.example.patterns.observer.observables.Observable;
import org.example.patterns.observer.observables.WeatherObservable;
import org.example.patterns.observer.observers.DisplayObserver;
import org.example.patterns.observer.observers.MobileObserver;
import org.example.patterns.observer.observers.TvObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Observable observable = new WeatherObservable();
        DisplayObserver tv = new TvObserver();
        DisplayObserver mobile = new MobileObserver();
        observable.add(tv);
        observable.add(mobile);


        observable.changeState("Weather changing now");




    }
}