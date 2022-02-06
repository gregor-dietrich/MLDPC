package main.Ente;

import main.Flugverhalten.IFlugverhalten;
import main.Quakverhalten.IQuakverhalten;

public final class Stockente extends AEnte {
    public Stockente(final IFlugverhalten fv, final IQuakverhalten qv) {
        super(fv, qv);
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Stockente");
    }
}
