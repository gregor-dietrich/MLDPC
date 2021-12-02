package main.Ressourcen.Composites;

import main.Ressourcen.Components.Dish;
import main.Ressourcen.Components.DrinkingGlass;

public final class PlaceNormal extends AComposite {
    public PlaceNormal() {
        for (int i = 0; i < 2; i++)
            this.addComponent(new Dish());
        this.addComponent(new CutleryNormal());
        this.addComponent(new DrinkingGlass());
    }
}
