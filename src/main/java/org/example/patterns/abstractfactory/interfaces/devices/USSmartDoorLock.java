package org.example.patterns.abstractfactory.interfaces.devices;

import org.example.patterns.abstractfactory.interfaces.SmartDoorLock;

public class USSmartDoorLock implements SmartDoorLock {
    @Override
    public void connect() {
        System.out.println("connect to us SmartDoorLock");
    }

    @Override
    public String getSpecs() {
        return "US SmartDoorLock";
    }
}
