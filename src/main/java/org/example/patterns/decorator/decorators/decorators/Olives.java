package org.example.patterns.decorator.decorators.decorators;

import org.example.patterns.decorator.decorators.BasePizza;

public class Olives extends Toppings{
    public Olives(BasePizza basePizza) {
        super(basePizza);
    }


    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with olives";
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 50;
    }
}
