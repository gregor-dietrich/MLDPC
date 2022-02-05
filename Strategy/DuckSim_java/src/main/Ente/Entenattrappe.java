package main.Ente;

import main.Flugverhalten.IFlugverhalten;
import main.Quakverhalten.IQuakverhalten;

public final class Entenattrappe extends AEnte {
    public Entenattrappe(final IFlugverhalten fv, final IQuakverhalten qv) {
        super(fv, qv);
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Entenattrappe");
    }
}
