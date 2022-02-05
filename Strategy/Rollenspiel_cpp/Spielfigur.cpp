#include "Spielfigur.h"

Spielfigur::Spielfigur(Waffenverhalten *wv)
{
	setWaffe(wv);
}

Spielfigur::~Spielfigur()
{
	delete this->waffe;
}

auto Spielfigur::anzeigen() -> void
{
	std::cout << "Ich bin eine Spielfigur vom Typ " << this->getClassName();
	std::cout << " und ich benutze " << this->getWaffenName() << ".\n";
}

auto Spielfigur::kaempfen() -> void
{
	this->getWaffe()->benutzeWaffe();
}

auto Spielfigur::setWaffe(Waffenverhalten* wv) -> void
{
	delete this->waffe;
	this->waffe = wv;
}

auto Spielfigur::getWaffe() -> Waffenverhalten*
{
	return this->waffe;
}

auto Spielfigur::getClassName() -> std::string
{
	return std::string(typeid(*this).name()).substr(6, std::string::npos);
}

auto Spielfigur::getWaffenName() -> std::string
{
	return std::string(typeid(*this->getWaffe()).name()).substr(6, std::string::npos);
}
