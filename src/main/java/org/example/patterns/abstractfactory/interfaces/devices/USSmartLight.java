package org.example.patterns.abstractfactory.interfaces.devices;

import org.example.patterns.abstractfactory.interfaces.SmartLight;

public class USSmartLight implements SmartLight {
    @Override
    public void connect() {
        System.out.println("connect to us smart light");
    }

    @Override
    public String getSpecs() {
        return "us smartlight specs";
    }
}
