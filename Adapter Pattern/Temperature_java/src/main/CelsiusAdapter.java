package main;

public final class CelsiusAdapter extends CelsiusReporter implements ITemperatureConverter {
    @Override
    public double getTemperatureInC() {
        return this.getTemperature();
    }

    @Override
    public double getTemperatureInF() {
        return this.getTemperatureInC() * 1.8 + 32;
    }
}
