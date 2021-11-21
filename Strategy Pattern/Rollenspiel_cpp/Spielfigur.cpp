#include "Spielfigur.h"

Spielfigur::Spielfigur(IWaffenverhalten *wv)
{
	setWaffe(wv);
}

Spielfigur::~Spielfigur()
{
	delete this->waffe;
}

void Spielfigur::anzeigen()
{
	std::cout << "Ich bin eine Spielfigur vom Typ " << this->getClassName() << " und ich benutze " << this->getWaffenName() << ".\n";
}

void Spielfigur::kaempfen()
{
	this->getWaffe()->benutzeWaffe();
}

void Spielfigur::setWaffe(IWaffenverhalten* wv)
{
	delete this->waffe;
	this->waffe = wv;
}

IWaffenverhalten* Spielfigur::getWaffe()
{
	return this->waffe;
}

std::string Spielfigur::getClassName()
{
	auto name = std::string(typeid(*this).name()).substr(6, std::string::npos);
	return name;
}

std::string Spielfigur::getWaffenName()
{
	auto waffenName = std::string(typeid(*this->getWaffe()).name()).substr(6, std::string::npos);
	return waffenName;
}
