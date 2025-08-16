package org.example.patterns.prototype;

public interface DocumentPrototype {
    DocumentPrototype clone();
    void setName(String name);
    void setEmail(String email);
    void print();
}
