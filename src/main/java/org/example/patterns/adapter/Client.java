package org.example.patterns.adapter;

import org.example.patterns.adapter.adaptee.adapter.Aparter;

public class Client {
    Aparter aparter;

    Client(Aparter aparter) {
        this.aparter = aparter;
    }

    void run() {
        System.out.println(aparter.getWeightInKg());
    }
}
