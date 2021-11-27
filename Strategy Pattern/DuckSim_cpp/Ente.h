#pragma once

#include <iostream>

#include "IFlugverhalten.h"
#include "IQuakverhalten.h"

class Ente
{
public:
	Ente(IQuakverhalten *qv, IFlugverhalten *fv);
	virtual ~Ente();
	
	virtual auto anzeigen() -> void;
	
	virtual auto schwimmen() -> void;
	virtual auto fliegenAusfuehren() -> void;
	virtual auto quakAusfuehren() -> void;
	virtual auto setFlugverhalten(IFlugverhalten* fv) -> void;
	virtual auto setQuakverhalten(IQuakverhalten* qv) -> void;

protected:
	virtual auto getFlugverhalten() -> IFlugverhalten*;
	virtual auto getQuakverhalten() -> IQuakverhalten*;
	
	virtual auto getClassName() -> std::string;

private:
	IFlugverhalten* flugEigenschaft;
	IQuakverhalten* quakArt;
};
