#include "Mechaente.h"

Mechaente::Mechaente(IQuakverhalten* qv, IFlugverhalten* fv)
	:Ente(qv, fv)
{
}

void Mechaente::anzeigen()
{
	Ente::anzeigen();
	std::cout << "Mechaente\n";
}
