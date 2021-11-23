package main.Pizzeria;

import main.Pizzeria.Pizza.APizza;
import main.Pizzeria.Pizza.American.*;

public class PizzeriaAmerika extends APizzeria {
    @Override
    protected APizza createPizza(pizzaType type) {
        APizza pizza = switch (type) {
            case FUNGHI -> new AmericanFunghi();
            case HAWAII -> new AmericanHawaii();
            case MARGHERITA -> new AmericanMargherita();
            case SALAMI -> new AmericanSalami();
            case TONNO -> new AmericanTonno();
        };
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
