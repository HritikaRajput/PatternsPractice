package org.example.patterns.decorator.decorators.decorators;

import org.example.patterns.decorator.decorators.BasePizza;

abstract class Toppings implements BasePizza {
    protected BasePizza basePizza;

    Toppings(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
}
