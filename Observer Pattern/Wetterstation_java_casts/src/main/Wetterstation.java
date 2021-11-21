package main;

public class Wetterstation {
    public static void main(String[] args) throws Throwable {
        // Instanzieren
        Wetterdaten wd = new Wetterdaten();
        wd.addObserver(new AktuelleBedingungen());
        wd.addObserver(new Wettervorhersage());

        // Werte setzen
        wd.setTemperatur(9.6);
        wd.setFeuchtigkeit(10.0);
        wd.setLuftdruck(1027.4);
    }
}
