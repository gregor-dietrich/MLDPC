#include "Entenattrappe.h"

Entenattrappe::Entenattrappe(IQuakverhalten* qv, IFlugverhalten* fv)
	:Ente(qv, fv)
{
}

void Entenattrappe::anzeigen()
{
	Ente::anzeigen();
	std::cout << "Entenattrappe\n";
}
