package main.Ressourcen.Composites;

import main.Ressourcen.Components.Beam;
import main.Ressourcen.Components.Board;
import main.Ressourcen.Components.Screw;

public final class Table extends AComposite {
    public Table() {
        this.addComponent(new Board());
        for (int i = 0; i < 4; i++)
            this.addComponent(new Beam());
        for (int i = 0; i < 8; i++)
            this.addComponent(new Screw());
    }

    @Override
    public double getPrice() {
        var material = super.getPrice();
        return material + material * 5;
    }
}