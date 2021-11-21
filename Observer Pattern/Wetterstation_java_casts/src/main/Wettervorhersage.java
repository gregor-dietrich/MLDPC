package main;

public class Wettervorhersage implements IObserver {
    @Override
    public void update(ASubject subject) {
        Wetterdaten wd = (Wetterdaten)subject;
        System.out.println("Die main.Wettervorhersage:");
        if (wd.getLuftdruck() > 1013.25)
            System.out.println("Das Wetter wird schön!");
        else if (wd.getLuftdruck() < 1013.25)
            System.out.println("Das Wetter verschlechtert sich!");
        else
            System.out.println("Hier bleibt alles so wie es ist!");
    }
}
