package main;

import main.observer.AktuelleBedingungen;
import main.observer.Wettervorhersage;
import main.subject.Wetterdaten;

public class Main {

    public static void main(String[] args) {
        // Subjects
        final Wetterdaten aachen = new Wetterdaten(9.6, 10.0, 1027.4);
        final Wetterstation wetterstation = new Wetterstation(aachen);
        // Observer
        final AktuelleBedingungen aktuelleBedingungen = new AktuelleBedingungen(aachen);
        final Wettervorhersage wettervorhersage = new Wettervorhersage(aachen);
        // Ablauf
        wetterstation.changeTemperatur(9.5);
        System.out.println();
        wetterstation.changeLuftdruck(-15.1);
        System.out.println();
        wetterstation.changeFeuchtigkeit(5.0);
    }
}
