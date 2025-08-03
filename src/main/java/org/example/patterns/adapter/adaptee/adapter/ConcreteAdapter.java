package org.example.patterns.adapter.adaptee.adapter;

import org.example.patterns.adapter.adaptee.Adaptee;

import java.awt.event.ComponentAdapter;

public class ConcreteAdapter implements Aparter {
    Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getWeightInKg() {
        Double getWeightInPound = adaptee.getWeight();
        return getWeightInPound * 100;
    }
}
