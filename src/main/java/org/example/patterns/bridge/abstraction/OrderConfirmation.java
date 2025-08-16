package org.example.patterns.bridge.abstraction;

import org.example.patterns.bridge.implementor.Channel;

public class OrderConfirmation extends Notification {

    public OrderConfirmation(Channel channel, String message, String receiver) {
        super(channel, message, receiver);
    }

    @Override
    public void send() {
        System.out.println("Order Confirmation Notification:");
        channel.send(getMessage(), getReceiver());
    }
}
