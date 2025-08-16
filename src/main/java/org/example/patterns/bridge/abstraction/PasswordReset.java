package org.example.patterns.bridge.abstraction;

import org.example.patterns.bridge.implementor.Channel;

public class PasswordReset extends Notification{

    public PasswordReset(Channel channel, String message, String receiver) {
        super(channel, message, receiver);
    }

    @Override
    public void send() {
        System.out.println("Password Reset Notification:");
        channel.send(getMessage(), getReceiver());
    }
}
