package main;

import main.Pizzeria.APizzeria;
import main.Pizzeria.PizzeriaAmerika;
import main.Pizzeria.PizzeriaItalia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<APizzeria> pizzerien = new ArrayList<>();
        pizzerien.add(new PizzeriaItalia());
        pizzerien.add(new PizzeriaAmerika());

        for (var pizzeria : pizzerien) {
            pizzeria.orderPizza(APizzeria.pizzaType.FUNGHI);
            pizzeria.orderPizza(APizzeria.pizzaType.HAWAII);
            pizzeria.orderPizza(APizzeria.pizzaType.MARGHERITA);
            pizzeria.orderPizza(APizzeria.pizzaType.SALAMI);
            pizzeria.orderPizza(APizzeria.pizzaType.TONNO);
        }
    }
}
