package main.Subject;

import main.Observer.AktuelleBedingungen;
import main.Observer.Wettervorhersage;

public final class Wetterdaten extends ASubject {
    private double temperatur;
    private double feuchtigkeit;
    private double luftdruck;

    public Wetterdaten() {
        this.addObserver(new AktuelleBedingungen());
        this.addObserver(new Wettervorhersage());
        this.setTemperatur(0, false);
        this.setFeuchtigkeit(0, false);
        this.setLuftdruck(0, false);
    }

    public Wetterdaten(final double t, final double f, final double l, final boolean notify) {
        this.addObserver(new AktuelleBedingungen());
        this.addObserver(new Wettervorhersage());
        if (notify)
            this.setValues(t, f, l);
        else
            this.setTemperatur(t, false);
        this.setFeuchtigkeit(f, false);
        this.setLuftdruck(l, false);
    }

    public void setValues(final double t, final double f, final double l) {
        this.setTemperatur(t, false);
        this.setFeuchtigkeit(f, false);
        this.setLuftdruck(l, false);
        this.notifyObservers();
    }

    public double getTemperatur() {
        return this.temperatur;
    }

    public void setTemperatur(final double t, final boolean notify) {
        if (this.temperatur == t)
            return;
        this.temperatur = t;
        this.setChanged(true);
        if (notify)
            this.notifyObservers();
    }

    public double getFeuchtigkeit() {
        return this.feuchtigkeit;
    }

    public void setFeuchtigkeit(final double f, final boolean notify) {
        if (this.feuchtigkeit == f)
            return;
        if (f < 0)
            this.feuchtigkeit = 0;
        else if (f > 100)
            this.feuchtigkeit = 100;
        else
            this.feuchtigkeit = f;
        this.setChanged(true);
        if (notify)
            this.notifyObservers();
    }

    public double getLuftdruck() {
        return this.luftdruck;
    }

    public void setLuftdruck(final double l, final boolean notify) {
        if (this.luftdruck == l)
            return;
        this.luftdruck = l;
        this.setChanged(true);
        if (notify)
            this.notifyObservers();
    }
}
