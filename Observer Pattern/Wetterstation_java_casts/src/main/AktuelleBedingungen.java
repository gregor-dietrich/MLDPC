package main;

public class AktuelleBedingungen implements IObserver {
    @Override
    public void update(ASubject subject) {
        Wetterdaten wd = (Wetterdaten)subject;
        System.out.println("Aktuelle Bedingungen:");
        System.out.println("Temperatur: " + wd.getTemperatur() + "°C");
        System.out.println("Feuchtigkeit: " + wd.getFeuchtigkeit() + "%");
        System.out.println("Luftdruck: " + wd.getLuftdruck() + " hPa");
    }
}
