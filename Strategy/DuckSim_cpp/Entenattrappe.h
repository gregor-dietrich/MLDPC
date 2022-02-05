#pragma once
#include "Ente.h"
class Entenattrappe :
    public Ente
{
public:
	Entenattrappe(IQuakverhalten *qv, IFlugverhalten *fv);

	auto anzeigen() -> void override;
};
