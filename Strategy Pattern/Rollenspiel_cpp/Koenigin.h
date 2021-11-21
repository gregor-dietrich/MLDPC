#pragma once
#include "Spielfigur.h"
class Koenigin :
    public Spielfigur
{
public:
	Koenigin(IWaffenverhalten *wv);
};
