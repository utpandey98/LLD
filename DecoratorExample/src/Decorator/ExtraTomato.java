package Decorator;

import BaseClass.BasePizza;

public class ExtraTomato extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraTomato(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return this.basePizza.cost() + 30;
    }

}
