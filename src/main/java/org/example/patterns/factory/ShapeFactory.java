package org.example.patterns.factory;

public class ShapeFactory {
    public Shape getShape(String s) throws Exception {
        switch (s) {
            case "circle":
                return new Circle();
            default:
                throw new Exception("invalid shape given");
        }

    }
}
