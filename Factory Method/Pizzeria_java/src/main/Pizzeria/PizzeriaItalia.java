package main.Pizzeria;

import main.Pizzeria.Pizza.APizza;
import main.Pizzeria.Pizza.Italian.*;

public class PizzeriaItalia extends APizzeria {
    @Override
    protected APizza createPizza(pizzaType type) {
        APizza pizza = switch (type) {
            case FUNGHI -> new ItalianFunghi();
            case HAWAII -> new ItalianHawaii();
            case MARGHERITA -> new ItalianMargherita();
            case SALAMI -> new ItalianSalami();
            case TONNO -> new ItalianTonno();
        };
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
