package main.Spielfigur;

import main.IWaffenverhalten.IWaffenverhalten;

public abstract class Spielfigur
{
    private IWaffenverhalten waffe;
    private Object IllegalArgumentException;

    public Spielfigur(IWaffenverhalten wv) throws Throwable
    {
        this.setWaffe(wv);
    }

    public void anzeigen()
    {
        System.out.print("Ich bin eine Spielfigur vom Typ: ");
        System.out.println(this.getClassName());
    }

    public void kaempfen()
    {
        this.getWaffe().benutzeWaffe();
    }

    public void setWaffe(IWaffenverhalten wv) throws Throwable
    {
        if (wv != null) {
            this.waffe = wv;
        }
        else {
            throw (Throwable) IllegalArgumentException;
        }
    }

    private IWaffenverhalten getWaffe() { return this.waffe; }

    private String getClassName()
    {
        var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
}
