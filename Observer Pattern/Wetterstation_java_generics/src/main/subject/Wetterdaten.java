package main.subject;

public class Wetterdaten extends ASubject<Wetterdaten> {
    private double temperatur;
    private double feuchtigkeit;
    private double luftdruck;

    public Wetterdaten() {
        this.temperatur = 0;
        this.feuchtigkeit = 0;
        this.luftdruck = 0;
    }

    public Wetterdaten(double temperatur, double feuchtigkeit, double luftdruck) {
        this.temperatur = temperatur;
        this.feuchtigkeit = feuchtigkeit;
        this.luftdruck = luftdruck;
    }

    @Override
    protected Wetterdaten getType() {
        return this;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(double temperatur) {
        this.temperatur = temperatur;
        this.notifyObservers();
    }

    public double getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public void setFeuchtigkeit(double feuchtigkeit) {
        this.feuchtigkeit = feuchtigkeit;
        this.notifyObservers();
    }

    public double getLuftdruck() {
        return luftdruck;
    }

    public void setLuftdruck(double luftdruck) {
        this.luftdruck = luftdruck;
        this.notifyObservers();
    }
}
