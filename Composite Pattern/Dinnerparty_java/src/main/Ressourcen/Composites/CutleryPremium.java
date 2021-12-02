package main.Ressourcen.Composites;

import main.Ressourcen.Components.Fork;
import main.Ressourcen.Components.Knife;
import main.Ressourcen.Components.SpoonSmall;

public final class CutleryPremium extends AComposite {
    public CutleryPremium() {
        this.addComponent(new CutleryNormal());
        this.addComponent(new Knife());
        this.addComponent(new Fork());
        this.addComponent(new SpoonSmall());
    }
}
