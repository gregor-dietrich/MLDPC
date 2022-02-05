package main;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        final var df = new DecimalFormat("#.##");

        final var tempInfoF = new FahrenheitAdapter();
        tempInfoF.setTemperatureInC(0);
        System.out.println("Temperature in °C: " + df.format(tempInfoF.getTemperatureInC()));
        System.out.println("Temperature in °F: " + df.format(tempInfoF.getTemperatureInF()));
        tempInfoF.setTemperatureInF(85);
        System.out.println("Temperature in °C: " + df.format(tempInfoF.getTemperatureInC()));
        System.out.println("Temperature in °F: " + df.format(tempInfoF.getTemperatureInF()));

        final var tempInfoK = new KelvinAdapter();
        tempInfoK.setTemperatureInC(100);
        System.out.println("Temperature in °C: " + df.format(tempInfoK.getTemperatureInC()));
        System.out.println("Temperature in °K: " + df.format(tempInfoK.getTemperatureInK()));
        tempInfoK.setTemperatureInK(0);
        System.out.println("Temperature in °C: " + df.format(tempInfoK.getTemperatureInC()));
        System.out.println("Temperature in °K: " + df.format(tempInfoK.getTemperatureInK()));

    }
}
