#include <vector>

#include "Ente.h"
#include "Entenattrappe.h"
#include "Gummiente.h"
#include "Mechaente.h"
#include "Moorente.h"
#include "Stockente.h"

#include "IFlugverhalten.h"
#include "IQuakverhalten.h"

int main(int argc, const char* argv[])
{
	// Implementierte Klassen instanzieren
	std::vector<Ente*> enten =
	{
		new Stockente(new Quaken(), new Fluegelschlagen()),
		new Moorente(new Quaken(), new Gleiten()),
		new Gummiente(new Quietschen(), new NichtFliegen()),
		new Entenattrappe(new Still(), new NichtFliegen()),
		new Mechaente(new Still(), new Duesenantriebsfliegen())
	};

	// Verhalten testen
	for (auto ente : enten)
	{
		ente->anzeigen();
		ente->schwimmen();
		ente->fliegenAusfuehren();
		ente->quakAusfuehren();
	}

	// Verhalten zur Laufzeit veraendern
	enten[0]->fliegenAusfuehren();
	enten[0]->setFlugverhalten(new Duesenantriebsfliegen());
	enten[0]->fliegenAusfuehren();

	// Heap aufraeumen
	for (auto ente : enten)
		delete ente;

	return 0;
}
