package org.example.patterns.decorator.decorators;

public class Margherita implements  BasePizza{
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
