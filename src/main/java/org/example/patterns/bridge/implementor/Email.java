package org.example.patterns.bridge.implementor;

public class Email implements Channel {

    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending Email to " + receiver + ": " + message);
    }
}
