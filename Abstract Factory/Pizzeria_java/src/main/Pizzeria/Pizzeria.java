package main.Pizzeria;

import main.Pizzeria.IngredientFactory.AIngredientFactory;
import main.Pizzeria.Pizza.Pizza;
import main.Pizzeria.Pizza.Toppings.*;

public final class Pizzeria {
    private AIngredientFactory ingredientFactory;

    public Pizzeria(AIngredientFactory ingredientFactory) {
        this.setIngredientFactory(ingredientFactory);
    }

    private Pizza createPizza(pizzaType type) {
        Pizza pizza = new Pizza(this.getIngredientFactory().createDough(),
                this.getIngredientFactory().createCheese());
        pizza.prepare();
        System.out.println("Prepared: " + pizza.getDough().getClassName() + ", " + pizza.getCheese().getClassName());
        switch (type) {
            case FUNGHI -> pizza.addTopping(new Mushrooms());
            case HAWAII -> {
                pizza.addTopping(new Ham());
                pizza.addTopping(new Pineapple());
            }
            case MARGHERITA -> {}
            case PROSCIUTTO -> pizza.addTopping(new Ham());
            case SALAMI -> pizza.addTopping(new Salami());
            case SPECIALE -> {
                pizza.addTopping(new Ham());
                pizza.addTopping(new Salami());
            }
            case TONNO -> pizza.addTopping(new Tuna());
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    public Pizza orderPizza(pizzaType type) {
        System.out.println("Ordering " + type + "...");
        Pizza pizza = createPizza(type);
        System.out.println(type + " has been finished!");
        System.out.println();
        return pizza;
    }

    public enum pizzaType {FUNGHI, HAWAII, MARGHERITA, PROSCIUTTO, SALAMI, SPECIALE, TONNO}

    public AIngredientFactory getIngredientFactory() {
        return ingredientFactory;
    }

    private void setIngredientFactory(AIngredientFactory ingredientFactory) {
        if (ingredientFactory != null)
            this.ingredientFactory = ingredientFactory;
        else
            throw new IllegalStateException("Parameter ingredientFactory must not be null.");
    }
}
