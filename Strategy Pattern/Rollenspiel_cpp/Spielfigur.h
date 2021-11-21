#pragma once

#include "IWaffenverhalten.h"

class Spielfigur
{
public:
	Spielfigur(IWaffenverhalten *wv);
	~Spielfigur();

	void anzeigen();	
	void kaempfen();
	void setWaffe(IWaffenverhalten *wv);
protected:
	IWaffenverhalten* getWaffe();

	virtual std::string getClassName();
	virtual std::string getWaffenName();
private:
	IWaffenverhalten* waffe;
};
