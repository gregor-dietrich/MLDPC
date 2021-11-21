package main;

import main.Ente.*;
import main.IFlugverhalten.*;
import main.IQuakverhalten.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Throwable
    {
        // Implementierte Klassen instanzieren
        ArrayList<Ente> enten = new ArrayList<>();
        enten.add(new Stockente(new Fluegelschlagen(), new Quaken()));
        enten.add(new Moorente(new Gleiten(), new Quaken()));
        enten.add(new Gummiente(new NichtFliegen(), new Quietschen()));
        enten.add(new Entenattrappe(new NichtFliegen(), new Still()));
        enten.add(new Mechaente(new Duesenantriebsfliegen(), new Still()));

        // Verhalten testen
        for (var ente : enten) {
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
