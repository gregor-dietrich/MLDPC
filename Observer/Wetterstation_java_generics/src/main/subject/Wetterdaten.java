package main.subject;

public final class Wetterdaten extends ASubject<Wetterdaten> {
    private double temperatur;
    private double feuchtigkeit;
    private double luftdruck;

    public Wetterdaten() {
        this.temperatur = 0;
        this.feuchtigkeit = 0;
        this.luftdruck = 0;
    }

    public Wetterdaten(final double temperatur, final double feuchtigkeit, final double luftdruck) {
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

    public void setTemperatur(final double temperatur) {
        this.temperatur = temperatur;
        this.notifyObservers();
    }

    public double getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public void setFeuchtigkeit(final double feuchtigkeit) {
        this.feuchtigkeit = feuchtigkeit;
        this.notifyObservers();
    }

    public double getLuftdruck() {
        return luftdruck;
    }

    public void setLuftdruck(final double luftdruck) {
        this.luftdruck = luftdruck;
        this.notifyObservers();
    }
}
