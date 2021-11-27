package main.Spielfigur;

import main.Waffenverhalten.IWaffenverhalten;

public abstract class ASpielfigur {
    private IWaffenverhalten waffe;

    public ASpielfigur(final IWaffenverhalten wv) {
        this.setWaffe(wv);
    }

    public final void anzeigen() {
        System.out.print("Ich bin eine Spielfigur vom Typ: ");
        System.out.println(this.getClassName());
    }

    public final void kaempfen() {
        this.getWaffe().benutzeWaffe();
    }

    private IWaffenverhalten getWaffe() {
        return this.waffe;
    }

    public final void setWaffe(final IWaffenverhalten wv) {
        if (wv != null) {
            this.waffe = wv;
        } else {
            throw new IllegalStateException();
        }
    }

    private String getClassName() {
        var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
}
