package main.Observer;

import main.Subject.ASubject;
import main.Subject.Wetterdaten;

public final class Wettervorhersage implements IObserver {
    @Override
    public void update(final ASubject subject) {
        final Wetterdaten wd = (Wetterdaten) subject;
        System.out.println("Die Wettervorhersage:");
        if (wd.getLuftdruck() > 1013.25)
            System.out.println("Das Wetter wird schön!");
        else if (wd.getLuftdruck() < 1013.25)
            System.out.println("Das Wetter verschlechtert sich!");
        else
            System.out.println("Hier bleibt alles so wie es ist!");
        System.out.println();
    }
}
