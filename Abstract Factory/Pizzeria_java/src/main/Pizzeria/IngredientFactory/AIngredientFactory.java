package main.Pizzeria.IngredientFactory;

import main.Pizzeria.Pizza.Cheese.ACheese;
import main.Pizzeria.Pizza.Dough.ADough;

public abstract class AIngredientFactory {
    public abstract ACheese createCheese();
    public abstract ADough createDough();
}
