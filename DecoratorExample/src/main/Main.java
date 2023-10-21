package main;

import main.BaseClass.BasePizza;
import main.BaseClass.MargheritaPizza;
import main.Decorator.ExtraCheese;
import main.Decorator.ExtraTomato;

public class Main {
    public static void main(String ... args) {
        BasePizza basePizza = new ExtraTomato(new ExtraCheese(new MargheritaPizza()));

        System.out.println(basePizza.cost());
    }
}
