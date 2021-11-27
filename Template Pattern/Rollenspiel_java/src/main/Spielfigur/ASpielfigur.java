package main.Spielfigur;

import main.Waffenverhalten.AWaffenverhalten;

public abstract class ASpielfigur {
    private AWaffenverhalten waffe;

    public ASpielfigur(final AWaffenverhalten wv) {
        this.setWaffe(wv);
    }

    public final void anzeigen() {
        System.out.print("Ich bin eine Spielfigur vom Typ: ");
        System.out.println(this.getClassName());
    }

    public final void kaempfen(final int anzahl) {
        this.getWaffe().benutzeWaffe(anzahl);
    }

    private AWaffenverhalten getWaffe() {
        return this.waffe;
    }

    public final void setWaffe(final AWaffenverhalten wv) {
        if (wv != null) {
            this.waffe = wv;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private String getClassName() {
        var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
}
