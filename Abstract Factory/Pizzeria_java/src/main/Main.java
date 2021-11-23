package main;

import main.Pizzeria.IngredientFactory.AmericanIngredientFactory;
import main.Pizzeria.IngredientFactory.ItalianIngredientFactory;
import main.Pizzeria.Pizzeria;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pizzeria> pizzerien = new ArrayList<>();
        pizzerien.add(new Pizzeria(new ItalianIngredientFactory()));
        pizzerien.add(new Pizzeria(new AmericanIngredientFactory()));

        for (var pizzeria : pizzerien) {
            pizzeria.orderPizza(Pizzeria.pizzaType.FUNGHI);
            pizzeria.orderPizza(Pizzeria.pizzaType.HAWAII);
            pizzeria.orderPizza(Pizzeria.pizzaType.MARGHERITA);
            pizzeria.orderPizza(Pizzeria.pizzaType.PROSCIUTTO);
            pizzeria.orderPizza(Pizzeria.pizzaType.SALAMI);
            pizzeria.orderPizza(Pizzeria.pizzaType.SPECIALE);
            pizzeria.orderPizza(Pizzeria.pizzaType.TONNO);
        }
    }
}
