#pragma once
#include "Spielfigur.h"
class Koenig :
    public Spielfigur
{
public:
	Koenig(IWaffenverhalten *wv);
};
