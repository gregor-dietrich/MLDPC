#include "Moorente.h"

Moorente::Moorente(IQuakverhalten* qv, IFlugverhalten* fv)
	:Ente(qv, fv)
{
}

void Moorente::anzeigen()
{
	Ente::anzeigen();
	std::cout << "Moorente\n";
}
