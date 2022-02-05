package main.Ressourcen.Components;

import main.Ressourcen.IValuable;

public abstract class AComponent implements IValuable {
    private double price;

    @Override
    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }
}
