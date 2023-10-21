import BaseClass.BasePizza;
import BaseClass.MargheritaPizza;
import Decorator.ExtraCheese;
import Decorator.ExtraTomato;

public class Main {
    public static void main(String ... args) {
        BasePizza basePizza = new ExtraTomato(new ExtraCheese(new MargheritaPizza()));

        System.out.println(basePizza.cost());
    }
}
