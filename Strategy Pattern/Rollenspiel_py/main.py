from IWaffenverhalten import *
from Spielfigur.Koenig import *
from Spielfigur.Koenigin import *
from Spielfigur.Ritter import *
from Spielfigur.Troll import *

if __name__ == "__main__":
    # Implementierte Klassen instanzieren
    spielfiguren = [
        Koenig(Schwertschwingen),
        Koenigin(Messerstechen),
        Ritter(Bogenschiessen),
        Troll(Axtschlagen)
    ]

    # Verhalten testen
    for spielfigur in spielfiguren:
        spielfigur.anzeigen()
        spielfigur.kaempfen()

    # Verhalten zur Laufzeit veraendern
    spielfiguren[0].kaempfen()
    spielfiguren[0].setWaffe(Messerstechen)
    spielfiguren[0].kaempfen()
