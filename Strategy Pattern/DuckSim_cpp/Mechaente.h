#pragma once
#include "Ente.h"
class Mechaente :
    public Ente
{
public:
	Mechaente(IQuakverhalten *qv, IFlugverhalten *fv);

	auto anzeigen() -> void override;
};
