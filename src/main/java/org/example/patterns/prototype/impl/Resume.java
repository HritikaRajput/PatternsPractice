package org.example.patterns.prototype.impl;

import org.example.patterns.prototype.DocumentPrototype;

import javax.swing.text.Document;

public class Resume implements DocumentPrototype {
    private String name;
    private String email;
    private String phoneNumber;
    private String experience;

    public Resume(String name, String email, String phoneNumber, String experience) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.experience = experience;

    }
    @Override
    public DocumentPrototype clone() {
        return new Resume(name, email, phoneNumber, experience);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void print() {
        System.out.println("Resume:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Experience: " + experience);
    }

    public String getEmail() {
        return email;
    }

}
