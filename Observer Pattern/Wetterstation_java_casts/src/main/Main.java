package main;

public class Main {
    public static void main(String[] args) {
        // Default constructor
        final var station = new Wetterstation();
        station.setValues(9.6, 10, 1027.4);
        station.changeTemperatur(2.1);
        station.changeLuftdruck(-14.9);

        // Overloaded constructors:
        // final var station = new Wetterstation(new Wetterdaten());
        // final var station = new Wetterstation(9.6, 10, 1027.4);
        // final var station = new Wetterstation(new Wetterdaten(9.6, 10, 1027.4, false));
    }
}
