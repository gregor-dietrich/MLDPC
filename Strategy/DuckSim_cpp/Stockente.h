#pragma once
#include "Ente.h"
class Stockente :
    public Ente
{
public:
	Stockente(IQuakverhalten *qv, IFlugverhalten *fv);

	auto anzeigen() -> void override;
};
