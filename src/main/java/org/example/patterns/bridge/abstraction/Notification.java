package org.example.patterns.bridge.abstraction;

import org.example.patterns.bridge.implementor.Channel;

public abstract class Notification {
    protected Channel channel;
    private final String message;
    private final String receiver;

    public Notification(Channel channel, String message, String receiver) {
        this.channel = channel;
        this.message = message;
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public String getReceiver() {
        return receiver;
    }
    public abstract void send();
}
