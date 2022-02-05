from Ente.Entenattrappe import *
from Ente.Gummiente import *
from Ente.Mechaente import *
from Ente.Moorente import *
from Ente.Stockente import *
from IFlugverhalten import *
from IQuakverhalten import *


if __name__ == "__main__":
    # Implementierte Klassen instanziieren
    enten = [
        Stockente(Fluegelschlagen, Quaken),
        Moorente(Gleiten, Quaken),
        Gummiente(NichtFliegen, Quietschen),
        Entenattrappe(NichtFliegen, Still),
        Mechaente(Duesenantriebsfliegen, Still)
    ]

    # Verhalten testen
    for ente in enten:
        ente.anzeigen()
        ente.schwimmen()
        ente.flugAusfuehren()
        ente.quakAusfuehren()

    # Verhalten zur Laufzeit veraendern
    enten[0].flugAusfuehren()
    enten[0].setFlugverhalten(Duesenantriebsfliegen)
    enten[0].flugAusfuehren()
