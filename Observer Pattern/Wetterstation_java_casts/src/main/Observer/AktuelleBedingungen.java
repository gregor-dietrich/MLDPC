package main.Observer;

import main.Subject.ASubject;
import main.Subject.Wetterdaten;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public final class AktuelleBedingungen implements IObserver {
    @Override
    public void update(final ASubject subject) {
        final Wetterdaten wd = (Wetterdaten) subject;
        final DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println("Aktuelle Bedingungen:");
        System.out.println("Temperatur: " + df.format(wd.getTemperatur()) + "°C");
        System.out.println("Feuchtigkeit: " + df.format(wd.getFeuchtigkeit()) + "%");
        System.out.println("Luftdruck: " + df.format(wd.getLuftdruck()) + " hPa");
        System.out.println();
    }
}
