#include "Gummiente.h"

Gummiente::Gummiente(IQuakverhalten* qv, IFlugverhalten* fv)
	:Ente(qv, fv)
{
}

void Gummiente::anzeigen()
{
	Ente::anzeigen();
	std::cout << "Gummiente\n";
}
