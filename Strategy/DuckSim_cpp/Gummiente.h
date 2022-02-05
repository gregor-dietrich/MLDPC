#pragma once
#include "Ente.h"
class Gummiente :
    public Ente
{
public:
	Gummiente(IQuakverhalten *qv, IFlugverhalten *fv);

	auto anzeigen() -> void override;
};
