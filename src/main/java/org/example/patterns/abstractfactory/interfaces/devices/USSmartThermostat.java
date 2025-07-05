package org.example.patterns.abstractfactory.interfaces.devices;

import org.example.patterns.abstractfactory.interfaces.SmartThermostat;

public class USSmartThermostat implements SmartThermostat {
    @Override
    public void connect() {
        System.out.println("connect to US SmartThermostat");
    }

    @Override
    public String getSpecs() {
        return "US SmartThermostat";
    }
}
