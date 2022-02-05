package main.Ressourcen.Composites;

import main.Ressourcen.Components.Dish;
import main.Ressourcen.Components.DrinkingGlass;
import main.Ressourcen.Components.WineGlass;

public final class PlacePremium extends AComposite {
    public PlacePremium() {
        for (int i = 0; i < 4; i++)
            this.addComponent(new Dish());
        this.addComponent(new CutleryPremium());
        this.addComponent(new DrinkingGlass());
        this.addComponent(new WineGlass());
    }
}
