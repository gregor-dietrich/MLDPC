#include <iostream>

#include "ASpielfigur.h"

ASpielfigur::ASpielfigur(AWaffenverhalten* wv)
{
	this->set_waffe(wv);
}

ASpielfigur::~ASpielfigur()
{
	delete this->wv_;
}

auto ASpielfigur::anzeigen() -> void
{
	std::cout << "Ich bin eine Spielfigur vom Typ: " << this->get_class_name() << "\n";
}

auto ASpielfigur::kaempfen(unsigned const int& anzahl) -> void
{
	this->get_waffe()->benutzeWaffe(anzahl);
}

auto ASpielfigur::set_waffe(AWaffenverhalten* wv) -> void
{
	delete this->wv_;
	this->wv_ = wv;
}

auto ASpielfigur::get_waffe() -> AWaffenverhalten*
{
	return this->wv_;
}

auto ASpielfigur::get_class_name() -> std::string
{
	return std::string(typeid(*this).name()).substr(6, std::string::npos);
}
