package main.Ressourcen.Composites.DinnerSets;

import main.Ressourcen.Composites.AComposite;
import main.Ressourcen.Composites.Chair;
import main.Ressourcen.Composites.PlaceNormal;
import main.Ressourcen.Composites.Table;

public final class BirthdayDinner extends AComposite {
    public BirthdayDinner() {
        for (int i = 0; i < 3; i++)
            this.addComponent(new Table());
        for (int i = 0; i < 12; i++)
            this.addComponent(new Chair());
        for (int i = 0; i < 12; i++)
            this.addComponent(new PlaceNormal());
    }
}
