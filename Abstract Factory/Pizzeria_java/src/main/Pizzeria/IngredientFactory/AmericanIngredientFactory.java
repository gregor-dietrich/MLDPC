package main.Pizzeria.IngredientFactory;

import main.Pizzeria.Pizza.Cheese.ACheese;
import main.Pizzeria.Pizza.Cheese.PlasticCheese;
import main.Pizzeria.Pizza.Dough.ADough;
import main.Pizzeria.Pizza.Dough.ThickCrustDough;

public final class AmericanIngredientFactory extends AIngredientFactory {
    @Override
    public ACheese createCheese() {
        return new PlasticCheese();
    }

    @Override
    public ADough createDough() {
        return new ThickCrustDough();
    }
}
