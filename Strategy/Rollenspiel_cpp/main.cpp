#include <vector>

#include "Spielfigur.h"
#include "Waffenverhalten.h"

int main(int argc, const char* argv[])
{
	// Implementierte Klassen instanziieren
	std::vector<Spielfigur*> spielfiguren =
	{
		new Koenig(new Schwertschwingen()),
		new Koenigin(new Messerstechen()),
		new Ritter(new Bogenschiessen()),
		new Troll(new Axtschlagen())
	};

	// Verhalten testen
	for (auto spielfigur : spielfiguren)
	{
		spielfigur->anzeigen();
		spielfigur->kaempfen();
	}

	// Verhalten zur Laufzeit veraendern
	spielfiguren[0]->kaempfen();
	spielfiguren[0]->setWaffe(new Messerstechen());
	spielfiguren[0]->kaempfen();

	// Heap aufraeumen
	for (auto spielfigur : spielfiguren)
		delete spielfigur;

	return 0;
}
