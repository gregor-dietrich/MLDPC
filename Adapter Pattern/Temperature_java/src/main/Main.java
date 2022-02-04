package main;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        final var df = new DecimalFormat("#.##");
        final var tempInfo = new FahrenheitAdapter();
        tempInfo.setTemperatureInC(0);
        System.out.println("Temperature in °C: " + df.format(tempInfo.getTemperatureInC()));
        System.out.println("Temperature in °F: " + df.format(tempInfo.getTemperatureInF()));

        tempInfo.setTemperatureInF(85);
        System.out.println("Temperature in °C: " + df.format(tempInfo.getTemperatureInC()));
        System.out.println("Temperature in °F: " + df.format(tempInfo.getTemperatureInF()));
    }
}
