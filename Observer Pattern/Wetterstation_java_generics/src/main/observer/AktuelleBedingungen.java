package main.observer;

import main.subject.ASubject;
import main.subject.Wetterdaten;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AktuelleBedingungen implements IObserver<Wetterdaten> {
    public AktuelleBedingungen(ASubject<Wetterdaten> wd) {
        wd.addObserver(this);
    }

    @Override
    public void update(Wetterdaten wd) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println("Aktuelle Bedingungen:");
        System.out.println("Temperatur: " + df.format(wd.getTemperatur()) + "°C");
        System.out.println("Feuchtigkeit: " + df.format(wd.getTemperatur()) + "%");
        System.out.println("Luftdruck: " + df.format(wd.getLuftdruck()) + " hPa");
    }
}
