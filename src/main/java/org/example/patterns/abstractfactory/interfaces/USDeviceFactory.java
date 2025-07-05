package org.example.patterns.abstractfactory.interfaces;

import org.example.patterns.abstractfactory.SmartDeviceFactory;
import org.example.patterns.abstractfactory.interfaces.devices.USSmartDoorLock;
import org.example.patterns.abstractfactory.interfaces.devices.USSmartLight;
import org.example.patterns.abstractfactory.interfaces.devices.USSmartThermostat;

public class USDeviceFactory implements SmartDeviceFactory {
    @Override
    public SmartLight createLight() {

        return new USSmartLight();
    }

    @Override
    public SmartThermostat createThermostat() {
        return new USSmartThermostat();
    }

    @Override
    public SmartDoorLock createDoorLock() {
        return new USSmartDoorLock();
    }
}
