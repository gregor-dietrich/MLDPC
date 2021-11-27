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

auto Ente::anzeigen() -> void
{
	std::cout << "Ich bin eine Ente vom Typ: ";
}

auto Ente::schwimmen() -> void
{
	std::cout << getClassName() << " schwimmt.\n";
}

auto Ente::fliegenAusfuehren() -> void
{
	this->getFlugverhalten()->fliegen();
}

auto Ente::quakAusfuehren() -> void
{
	this->getQuakverhalten()->quaken();
}

auto Ente::setFlugverhalten(IFlugverhalten* fv) -> void
{
	delete this->flugEigenschaft;
	this->flugEigenschaft = fv;
}

auto Ente::setQuakverhalten(IQuakverhalten* qv) -> void
{
	delete this->quakArt;
	this->quakArt = qv;
}

auto Ente::getFlugverhalten() -> IFlugverhalten*
{
	return this->flugEigenschaft;
}

auto Ente::getQuakverhalten() -> IQuakverhalten*
{
	return this->quakArt;
}

auto Ente::getClassName() -> std::string
{
	auto name = std::string(typeid(*this).name()).substr(6, std::string::npos);
	return name;
}
