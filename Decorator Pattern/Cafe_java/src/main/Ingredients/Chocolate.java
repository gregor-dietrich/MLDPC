package main.Ingredients;

import main.AComponent;
import main.ADecorator;

public class Chocolate extends ADecorator {
    public Chocolate(final AComponent pObj) {
        super(pObj);
        this.setPrice(0.99);
        this.setDescription("Hot chocolate.");
    }
}
