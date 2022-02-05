#pragma once
#include "Ente.h"
class Moorente :
    public Ente
{
public:
	Moorente(IQuakverhalten *qv, IFlugverhalten *fv);

	auto anzeigen() -> void override;
};
