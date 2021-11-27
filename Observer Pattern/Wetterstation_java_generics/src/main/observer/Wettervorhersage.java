package main.observer;

import main.subject.ASubject;
import main.subject.Wetterdaten;

public final class Wettervorhersage implements IObserver<Wetterdaten> {
    public Wettervorhersage(final ASubject<Wetterdaten> wd) {
        wd.addObserver(this);
    }

    @Override
    public void update(final Wetterdaten wd) {
        System.out.println("Die Wettervorhersage:");
        if (wd.getLuftdruck() > 1013.25)
            System.out.println("Das Wetter wird schön!");
        else if (wd.getLuftdruck() < 1013.25)
            System.out.println("Das Wetter verschlechtert sich!");
        else
            System.out.println("Hier bleibt alles so wie es ist!");
    }
}
