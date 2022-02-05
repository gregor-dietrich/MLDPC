package main;

import main.Spielfigur.*;
import main.Waffenverhalten.Axtschlagen;
import main.Waffenverhalten.Bogenschiessen;
import main.Waffenverhalten.Messerstechen;
import main.Waffenverhalten.Schwertschwingen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Implementierte Klassen instanziieren
        final var figuren = new ArrayList<ASpielfigur>();
        figuren.add(new Koenig(new Schwertschwingen()));
        figuren.add(new Koenigin(new Messerstechen()));
        figuren.add(new Ritter(new Bogenschiessen()));
        figuren.add(new Troll(new Axtschlagen()));

        // Verhalten testen
        for (final var figur : figuren) {
            figur.anzeigen();
            figur.kaempfen();
        }

        // Verhalten zur Laufzeit veraendern
        figuren.get(0).kaempfen();
        figuren.get(0).setWaffe(new Messerstechen());
        figuren.get(0).kaempfen();
    }
}
