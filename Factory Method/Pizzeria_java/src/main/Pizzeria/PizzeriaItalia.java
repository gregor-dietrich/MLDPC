package main.Pizzeria;

import main.Pizzeria.Pizza.APizza;
import main.Pizzeria.Pizza.Italian.*;

public final class PizzeriaItalia extends APizzeria {
    @Override
    protected APizza createPizza(final pizzaType type) {
        final var pizza = switch (type) {
            case FUNGHI -> new ItalianFunghi();
            case HAWAII -> new ItalianHawaii();
            case MARGHERITA -> new ItalianMargherita();
            case SALAMI -> new ItalianSalami();
            case TONNO -> new ItalianTonno();
        };
        return pizza;
    }
}
