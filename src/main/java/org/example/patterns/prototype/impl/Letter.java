package org.example.patterns.prototype.impl;

import org.example.patterns.prototype.DocumentPrototype;

public class Letter implements DocumentPrototype {
    private String recipient;
    private String sender;
    private String content;

    public Letter(String recipient, String sender, String content) {
        this.recipient = recipient;
        this.sender = sender;
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() {
        return new Letter(recipient, sender, content);
    }

    @Override
    public void setName(String name) {
        // In the context of a letter, we might set the recipient's name
        this.recipient = name;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public void print() {
        System.out.println("Letter:");
        System.out.println("Recipient: " + recipient);
        System.out.println("Sender: " + sender);
        System.out.println("Content: " + content);
    }

    // Getters and setters can be added here if needed
}
