package main;

import main.subject.Wetterdaten;

public final class Wetterstation {
    private final Wetterdaten wetterdaten;

    public Wetterstation(final Wetterdaten wetterdaten) {
        this.wetterdaten = wetterdaten;
    }

    public Wetterstation(final double temperatur, final double feuchtigkeit, final double luftdruck) {
        this.wetterdaten = new Wetterdaten(temperatur, feuchtigkeit, luftdruck);
    }

    public Wetterstation() {
        this.wetterdaten = new Wetterdaten(0, 0, 0);
    }

    public Wetterdaten getWetterdaten() {
        return this.wetterdaten;
    }

    public void setWetterdaten(final double temperatur, final double feuchtigkeit, final double luftdruck) {
        this.wetterdaten.setTemperatur(temperatur);
        this.wetterdaten.setFeuchtigkeit(feuchtigkeit);
        this.wetterdaten.setLuftdruck(luftdruck);
    }

    public void changeTemperatur(final double delta) {
        this.wetterdaten.setTemperatur(this.getWetterdaten().getTemperatur() + delta);
    }

    public void changeFeuchtigkeit(final double delta) {
        this.wetterdaten.setFeuchtigkeit(this.getWetterdaten().getFeuchtigkeit() + delta);
    }

    public void changeLuftdruck(final double delta) {
        this.wetterdaten.setLuftdruck(this.getWetterdaten().getLuftdruck() + delta);
    }
}
