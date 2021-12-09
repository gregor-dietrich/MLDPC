package main.Ingredients;

import main.AComponent;
import main.ADecorator;

public class Sugar extends ADecorator {
    public Sugar(final AComponent pObj) {
        super(pObj);
        this.setPrice(0.29);
        this.setDescription("Sweet sugar.");
    }
}
