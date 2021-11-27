package main;

import main.Subject.Wetterdaten;

public final class Wetterstation {
    private Wetterdaten wd;

    public Wetterstation() {
        this.setWetterdaten(new Wetterdaten());
    }

    public Wetterstation(final Wetterdaten wd) {
        this.setWetterdaten(wd);
    }

    public Wetterstation(final double t, final double f, final double l) {
        this.setWetterdaten(new Wetterdaten(t, f, l, false));
    }

    public void setValues(final double t, final double f, final double l) {
        this.getWetterdaten().setValues(t, f, l);
    }

    public void changeTemperatur(final double t) {
        this.getWetterdaten().setTemperatur(this.getWetterdaten().getTemperatur() + t, true);
    }

    public void changeFeuchtigkeit(final double f) {
        this.getWetterdaten().setFeuchtigkeit(this.getWetterdaten().getFeuchtigkeit() + f, true);
    }

    public void changeLuftdruck(final double l) {
        this.getWetterdaten().setLuftdruck(this.getWetterdaten().getLuftdruck() + l, true);
    }

    private Wetterdaten getWetterdaten() {
        return wd;
    }

    private void setWetterdaten(final Wetterdaten wd) {
        this.wd = wd;
    }
}
