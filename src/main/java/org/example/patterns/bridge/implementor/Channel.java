package org.example.patterns.bridge.implementor;

public interface Channel {
    void send(String message, String receiver);
}
