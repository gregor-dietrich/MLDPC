#pragma once
#include "Spielfigur.h"
class Ritter :
    public Spielfigur
{
public:
	Ritter(IWaffenverhalten *wv);
};
