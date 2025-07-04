package org.example.patterns.decorator.decorators;

public class Farmhouse implements BasePizza{
    @Override
    public String getDescription() {
        return "Farmhouse pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
