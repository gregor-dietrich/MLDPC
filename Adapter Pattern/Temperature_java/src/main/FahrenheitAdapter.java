package main;

public final class FahrenheitAdapter extends FahrenheitReporter implements ITemperatureConverter {
    @Override
    public double getTemperatureInC() {
        return (this.getTemperatureInF() - 32) / 1.8;
    }

    @Override
    public double getTemperatureInF() {
        return this.getTemperature();
    }
}
