package main.Ressourcen.Composites;

import main.Ressourcen.IValuable;

import java.util.ArrayList;

public abstract class AComposite implements IValuable {
    private final ArrayList<IValuable> components;

    public AComposite() {
        this.components = new ArrayList<>();
    }

    public AComposite(final ArrayList<IValuable> pieces) {
        this.components = pieces;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (var piece : components)
            price += piece.getPrice();
        return price;
    }

    public final boolean addComponent(final IValuable c) {
        return this.components.add(c);
    }

    public final boolean removeComponent(final IValuable c) {
        return this.components.remove(c);
    }

    public final ArrayList<IValuable> getComponents() {
        return components;
    }
}
