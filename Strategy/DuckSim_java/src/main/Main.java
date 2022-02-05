package main;

import main.Ente.*;
import main.Flugverhalten.Duesenantriebsfliegen;
import main.Flugverhalten.Fluegelschlagen;
import main.Flugverhalten.Gleiten;
import main.Flugverhalten.NichtFliegen;
import main.Quakverhalten.Quaken;
import main.Quakverhalten.Quietschen;
import main.Quakverhalten.Still;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Implementierte Klassen instanziieren
        final var enten = new ArrayList<AEnte>();
        enten.add(new Stockente(new Fluegelschlagen(), new Quaken()));
        enten.add(new Moorente(new Gleiten(), new Quaken()));
        enten.add(new Gummiente(new NichtFliegen(), new Quietschen()));
        enten.add(new Entenattrappe(new NichtFliegen(), new Still()));
        enten.add(new Mechaente(new Duesenantriebsfliegen(), new Still()));

        // Verhalten testen
        for (final var ente : enten) {
            ente.anzeigen();
            ente.schwimmen();
            ente.fliegenAusfuehren();
            ente.quakAusfuehren();
        }

        // Verhalten zur Laufzeit veraendern
        enten.get(0).fliegenAusfuehren();
        enten.get(0).setFlugEigenschaft(new Duesenantriebsfliegen());
        enten.get(0).fliegenAusfuehren();
    }
}
