package org.example.patterns.decorator.decorators.decorators;

import org.example.patterns.decorator.decorators.BasePizza;

public class VeggieToppingCombo extends Toppings{
    VeggieToppingCombo(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public int getCost() {
        return 0;
    }
}
