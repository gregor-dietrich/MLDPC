#include <vector>

#include "ASpielfigur.h"

auto main() -> int
{
	std::vector<ASpielfigur*> figuren = {
		new Koenig(new Schwertschwingen),
		new Koenigin(new Messerstechen),
		new Ritter(new Bogenschiessen),
		new Troll(new Axtschlagen)
	};

	for (auto figur : figuren)
	{
		figur->anzeigen();
		figur->kaempfen(1);
	}

	figuren.at(0)->kaempfen(1);
	figuren.at(0)->set_waffe(new Messerstechen);
	figuren.at(0)->kaempfen(2);

	return EXIT_SUCCESS;
}
