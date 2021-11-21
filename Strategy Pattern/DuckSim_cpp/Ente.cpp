#include "Ente.h"

Ente::Ente(IQuakverhalten *qv, IFlugverhalten *fv)
{
	setQuakverhalten(qv);
	setFlugverhalten(fv);
}

Ente::~Ente()
{
	delete this->quakArt;
	delete this->flugEigenschaft;
}

void Ente::anzeigen()
{
	std::cout << "Ich bin eine Ente vom Typ: ";
}

void Ente::schwimmen()
{
	std::cout << getClassName() << " schwimmt.\n";
}

void Ente::fliegenAusfuehren()
{
	this->getFlugverhalten()->fliegen();
}

void Ente::quakAusfuehren()
{
	this->getQuakverhalten()->quaken();
}

void Ente::setFlugverhalten(IFlugverhalten *fv)
{
	delete this->flugEigenschaft;
	this->flugEigenschaft = fv;
}

void Ente::setQuakverhalten(IQuakverhalten *qv)
{
	delete this->quakArt;
	this->quakArt = qv;
}

IFlugverhalten* Ente::getFlugverhalten()
{
	return this->flugEigenschaft;
}

IQuakverhalten* Ente::getQuakverhalten()
{
	return this->quakArt;
}

std::string Ente::getClassName()
{
	auto name = std::string(typeid(*this).name()).substr(6, std::string::npos);
	return name;
}
