package main;

public final class KelvinAdapter extends CelsiusReporter implements IKelvin {

    @Override
    public double getTemperatureInK() {
        return this.getTemperatureInC() + 273.15;
    }

    @Override
    public void setTemperatureInK(final double temperatureInK) {
        this.setTemperatureInC(temperatureInK - 273.15);
    }
}
