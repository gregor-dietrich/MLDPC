package main.Pizzeria;

import main.Pizzeria.Pizza.APizza;
import main.Pizzeria.Pizza.American.*;

public final class PizzeriaAmerika extends APizzeria {
    @Override
    protected APizza createPizza(final pizzaType type) {
        final var pizza = switch (type) {
            case FUNGHI -> new AmericanFunghi();
            case HAWAII -> new AmericanHawaii();
            case MARGHERITA -> new AmericanMargherita();
            case SALAMI -> new AmericanSalami();
            case TONNO -> new AmericanTonno();
        };
        return pizza;
    }
}
