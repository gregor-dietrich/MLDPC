#pragma once
#include "Ente.h"
class Gummiente :
    public Ente
{
public:
	Gummiente(IQuakverhalten *qv, IFlugverhalten *fv);

	void anzeigen() override;
};
