package main.Truthahn;

import main.Ente.AEnte;
import main.Flugverhalten.IFlugverhalten;
import main.Quakverhalten.IQuakverhalten;

public final class TruthahnAdapter extends AEnte implements ITruthahn {
    public TruthahnAdapter(final IFlugverhalten fv, final IQuakverhalten qv) {
        super(fv, qv);
    }

    @Override
    public void kollern() {
        this.quakAusfuehren();
    }

    @Override
    public void flattern() {
        this.fliegenAusfuehren();
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Truthahn");
    }
}
