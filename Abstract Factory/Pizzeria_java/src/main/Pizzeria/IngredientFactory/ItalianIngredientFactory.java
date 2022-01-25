package main.Pizzeria.IngredientFactory;

import main.Pizzeria.Pizza.Cheese.ACheese;
import main.Pizzeria.Pizza.Cheese.MozzarellaCheese;
import main.Pizzeria.Pizza.Dough.ADough;
import main.Pizzeria.Pizza.Dough.ThinCrustDough;

public final class ItalianIngredientFactory extends AIngredientFactory {
    @Override
    public ACheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public ADough createDough() {
        return new ThinCrustDough();
    }
}
