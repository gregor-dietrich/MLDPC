package main;

public class Main {

    public static void main(String[] args) {
        final var tempC = new CelsiusAdapter();
        tempC.setTemperature(0);
        System.out.println(tempC.getTemperatureInC());
        System.out.println(tempC.getTemperatureInF());

        final var tempF = new FahrenheitAdapter();
        tempF.setTemperature(85);
        System.out.println(tempF.getTemperatureInF());
        System.out.println(tempF.getTemperatureInC());
    }
}
