package main.Ente;

import main.Flugverhalten.IFlugverhalten;
import main.Quakverhalten.IQuakverhalten;

public abstract class AEnte {
    private IFlugverhalten flugEigenschaft;
    private IQuakverhalten quakArt;

    public AEnte(final IFlugverhalten fv, final IQuakverhalten qv) {
        this.setFlugEigenschaft(fv);
        this.setQuakArt(qv);
    }

    public void anzeigen() {
        System.out.print("Ich bin eine Ente vom Typ: ");
    }

    public final void fliegenAusfuehren() {
        this.getFlugEigenschaft().fliegen();
    }

    public final void quakAusfuehren() {
        this.getQuakArt().quaken();
    }

    public final void schwimmen() {
        System.out.println(this.getClassName() + " schwimmt.");
    }

    private IFlugverhalten getFlugEigenschaft() {
        return this.flugEigenschaft;
    }

    public final void setFlugEigenschaft(final IFlugverhalten fv) {
        if (fv != null) {
            this.flugEigenschaft = fv;
        } else {
            throw new IllegalStateException();
        }
    }

    private IQuakverhalten getQuakArt() {
        return this.quakArt;
    }

    public final void setQuakArt(final IQuakverhalten qv) {
        if (qv != null) {
            this.quakArt = qv;
        } else {
            throw new IllegalStateException();
        }
    }

    private String getClassName() {
        var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
}
