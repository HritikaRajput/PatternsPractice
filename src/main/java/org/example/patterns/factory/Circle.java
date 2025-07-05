package org.example.patterns.factory;

public class Circle implements Shape {
    Circle() {
        System.out.println("New circle shape created");
    }

    @Override
    public String getShape() {
        return "circle";
    }
}
