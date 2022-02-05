package main;

import main.observer.AktuelleBedingungen;
import main.observer.Wettervorhersage;
import main.subject.Wetterdaten;

public class Main {

    public static void main(String[] args) {
        // Subjects
        final var aachen = new Wetterdaten(9.6, 10.0, 1027.4);
        final var wetterstation = new Wetterstation(aachen);
        // Observer
        final var aktuelleBedingungen = new AktuelleBedingungen(aachen);
        final var wettervorhersage = new Wettervorhersage(aachen);
        // Ablauf
        wetterstation.changeTemperatur(9.5);
        System.out.println();
        wetterstation.changeLuftdruck(-15.1);
        System.out.println();
        wetterstation.changeFeuchtigkeit(5.0);
    }
}
