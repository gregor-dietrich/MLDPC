#pragma once

#include <iostream>

#include "IFlugverhalten.h"
#include "IQuakverhalten.h"

class Ente
{
public:
	Ente(IQuakverhalten *qv, IFlugverhalten *fv);
	~Ente();
	
	virtual void anzeigen();
	
	void schwimmen();
	void fliegenAusfuehren();
	void quakAusfuehren();
	void setFlugverhalten(IFlugverhalten *fv);
	void setQuakverhalten(IQuakverhalten *qv);

protected:
	IFlugverhalten* getFlugverhalten();
	IQuakverhalten* getQuakverhalten();
	
	std::string getClassName();

private:
	IFlugverhalten* flugEigenschaft;
	IQuakverhalten* quakArt;
};
