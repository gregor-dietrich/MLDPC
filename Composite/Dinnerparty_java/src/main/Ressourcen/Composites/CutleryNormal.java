package main.Ressourcen.Composites;

import main.Ressourcen.Components.Fork;
import main.Ressourcen.Components.Knife;
import main.Ressourcen.Components.SpoonBig;
import main.Ressourcen.Components.SpoonSmall;

public final class CutleryNormal extends AComposite {
    public CutleryNormal() {
        this.addComponent(new Knife());
        this.addComponent(new Fork());
        this.addComponent(new SpoonBig());
        for (int i = 0; i < 2; i++)
            this.addComponent(new SpoonSmall());
    }
}
