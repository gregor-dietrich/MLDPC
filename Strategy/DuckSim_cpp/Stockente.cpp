#include "Stockente.h"

Stockente::Stockente(IQuakverhalten* qv, IFlugverhalten* fv)
	:Ente(qv, fv)
{
}

void Stockente::anzeigen()
{
	Ente::anzeigen();
	std::cout << "Stockente\n";
}
