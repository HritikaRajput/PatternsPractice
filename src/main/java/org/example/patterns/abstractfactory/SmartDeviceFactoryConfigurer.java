package org.example.patterns.abstractfactory;

import org.example.patterns.abstractfactory.interfaces.USDeviceFactory;

public class SmartDeviceFactoryConfigurer {

    public SmartDeviceFactory getSmartDeviceFactory(Region region) {
        switch (region) {
            case US:
                return new USDeviceFactory();
            default:
                return null;
        }
    }
}
