package main;

import main.subject.Wetterdaten;

public class Wetterstation {
    private Wetterdaten wetterdaten;

    public Wetterstation(Wetterdaten wetterdaten) {
        this.wetterdaten = wetterdaten;
    }

    public Wetterstation(double temperatur, double feuchtigkeit, double luftdruck) {
        this.wetterdaten = new Wetterdaten(temperatur, feuchtigkeit, luftdruck);
    }

    public Wetterstation() {
        this.wetterdaten = new Wetterdaten(0, 0, 0);
    }

    public Wetterdaten getWetterdaten() {
        return this.wetterdaten;
    }

    public void setWetterdaten(double temperatur, double feuchtigkeit, double luftdruck) {
        this.wetterdaten.setTemperatur(temperatur);
        this.wetterdaten.setFeuchtigkeit(feuchtigkeit);
        this.wetterdaten.setLuftdruck(luftdruck);
    }

    public void changeTemperatur(double delta) {
        this.wetterdaten.setTemperatur(this.getWetterdaten().getTemperatur() + delta);
    }

    public void changeFeuchtigkeit(double delta) {
        this.wetterdaten.setFeuchtigkeit(this.getWetterdaten().getFeuchtigkeit() + delta);
    }

    public void changeLuftdruck(double delta) {
        this.wetterdaten.setLuftdruck(this.getWetterdaten().getLuftdruck() + delta);
    }
}
