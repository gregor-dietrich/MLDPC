#pragma once
#include "Ente.h"
class Moorente :
    public Ente
{
public:
	Moorente(IQuakverhalten *qv, IFlugverhalten *fv);

	void anzeigen() override;
};
