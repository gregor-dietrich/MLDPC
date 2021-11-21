package main.Ente;

import main.IFlugverhalten.IFlugverhalten;
import main.IQuakverhalten.IQuakverhalten;

public abstract class Ente
{
    private IFlugverhalten flugEigenschaft;
    private IQuakverhalten quakArt;
    private Object IllegalArgumentException;

    public Ente(IFlugverhalten fv, IQuakverhalten qv) throws Throwable
    {
        this.setFlugEigenschaft(fv);
        this.setQuakArt(qv);
    }

    public void anzeigen()
    {
        System.out.print("Ich bin eine Ente vom Typ: ");
    }

    public void fliegenAusfuehren()
    {
        this.getFlugEigenschaft().fliegen();
    }

    public void quakAusfuehren()
    {
        this.getQuakArt().quaken();
    }

    public void schwimmen() { System.out.println(this.getClassName() + " schwimmt."); }

    public void setFlugEigenschaft(IFlugverhalten fv) throws Throwable
    {
        if (fv != null) {
            this.flugEigenschaft = fv;
        }
        else {
            throw (Throwable) IllegalArgumentException;
        }
    }

    public void setQuakArt(IQuakverhalten qv) throws Throwable
    {
        if (qv != null) {
            this.quakArt = qv;
        }
        else {
            throw (Throwable) IllegalArgumentException;
        }
    }

    private IFlugverhalten getFlugEigenschaft() { return this.flugEigenschaft; }

    private IQuakverhalten getQuakArt() { return this.quakArt; }

    private String getClassName()
    {
        var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
}
