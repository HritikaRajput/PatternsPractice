package org.example.patterns.abstractfactory;

import org.example.patterns.abstractfactory.interfaces.SmartDoorLock;
import org.example.patterns.abstractfactory.interfaces.SmartLight;
import org.example.patterns.abstractfactory.interfaces.SmartThermostat;

public interface SmartDeviceFactory {
    SmartLight createLight();

    SmartThermostat createThermostat();

    SmartDoorLock createDoorLock();
}
