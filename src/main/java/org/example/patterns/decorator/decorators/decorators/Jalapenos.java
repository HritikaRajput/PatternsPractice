package org.example.patterns.decorator.decorators.decorators;

import org.example.patterns.decorator.decorators.BasePizza;

public class Jalapenos extends Toppings{
    public Jalapenos(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with jalapenos";
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 70;
    }
}
