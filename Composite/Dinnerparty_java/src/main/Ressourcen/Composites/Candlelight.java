package main.Ressourcen.Composites;

import main.Ressourcen.Components.Candle;
import main.Ressourcen.Components.Candlestick;

public final class Candlelight extends AComposite {
    public Candlelight() {
        this.addComponent(new Candlestick());
        this.addComponent(new Candle());
    }
}
