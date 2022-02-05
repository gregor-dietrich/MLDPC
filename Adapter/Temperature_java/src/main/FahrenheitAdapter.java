package main;

public final class FahrenheitAdapter extends CelsiusReporter implements IFahrenheit {

    @Override
    public double getTemperatureInF() {
        return this.getTemperatureInC() * 1.8 + 32;
    }

    @Override
    public void setTemperatureInF(final double temperatureInF) {
        this.setTemperatureInC((temperatureInF - 32) / 1.8);
    }
}
