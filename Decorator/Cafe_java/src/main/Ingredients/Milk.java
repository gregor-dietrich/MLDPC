package main.Ingredients;

import main.AComponent;
import main.ADecorator;

public final class Milk extends ADecorator {
    public Milk(final AComponent pObj) {
        super(pObj);
        this.setPrice(0.59);
        this.setDescription("Fresh milk.");
    }
}
