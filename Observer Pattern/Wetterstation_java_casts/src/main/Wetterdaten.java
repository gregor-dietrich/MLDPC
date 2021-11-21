package main;

public class Wetterdaten extends ASubject {
    private double temperatur = 0;
    private double feuchtigkeit = 0;
    private double luftdruck = 0;

    public double getTemperatur() {
        return this.temperatur;
    }

    public void setTemperatur(double t) {
        this.temperatur = t;
        this.setChanged(true);
        this.notifyObservers();
    }

    public double getFeuchtigkeit() {
        return this.feuchtigkeit;
    }

    public void setFeuchtigkeit(double f) {
        if (f < 0)
            this.feuchtigkeit = 0;
        else if (f > 100)
            this.feuchtigkeit = 100;
        else
            this.feuchtigkeit = f;
        this.setChanged(true);
        this.notifyObservers();
    }

    public double getLuftdruck() {
        return this.luftdruck;
    }

    public void setLuftdruck(double l) {
        this.luftdruck = l;
        this.setChanged(true);
        this.notifyObservers();
    }
}
