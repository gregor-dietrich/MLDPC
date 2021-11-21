package main;

import main.IWaffenverhalten.*;
import main.Spielfigur.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Throwable
    {
        // Implementierte Klassen instanzieren
        ArrayList<Spielfigur> figuren = new ArrayList<>();
        figuren.add(new Koenig(new Schwertschwingen()));
        figuren.add(new Koenigin(new Messerstechen()));
        figuren.add(new Ritter(new Bogenschiessen()));
        figuren.add(new Troll(new Axtschlagen()));

        // Verhalten testen
        for (var figur : figuren) {
            figur.anzeigen();
            figur.kaempfen();
        }

        // Verhalten zur Laufzeit veraendern
        figuren.get(0).kaempfen();
        figuren.get(0).setWaffe(new Messerstechen());
        figuren.get(0).kaempfen();
    }
}
