package main.Ressourcen.Composites.DinnerSets;

import main.Ressourcen.Composites.*;

public final class CandlelightDinner extends AComposite {
    public CandlelightDinner() {
        this.addComponent(new Table());
        for (int i = 0; i < 2; i++)
            this.addComponent(new Chair());
        for (int i = 0; i < 2; i++)
            this.addComponent(new PlacePremium());
        for (int i = 0; i < 2; i++)
            this.addComponent(new Candlelight());
    }
}
