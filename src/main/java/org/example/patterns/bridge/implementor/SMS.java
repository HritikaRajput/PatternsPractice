package org.example.patterns.bridge.implementor;

public class SMS implements Channel {



    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending SMS to " + receiver + ": " + message);
    }
}
