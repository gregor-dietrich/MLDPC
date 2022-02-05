#include "Unsterblicher.h"

#include <stdexcept>

Unsterblicher* Unsterblicher::instance_ = nullptr;

Unsterblicher::Unsterblicher()
{
	this->set_anzahlLeben(100);
	this->set_geburtsjahr(1900);
}

auto Unsterblicher::get_instance() -> Unsterblicher*
{
	if (!instance_)
		instance_ = new Unsterblicher;
	return instance_;
}

auto Unsterblicher::destroy() -> void
{
	delete instance_;
	instance_ = nullptr;
}

auto Unsterblicher::die() -> void
{
	if (this->get_anzahlLeben() > 0)
		this->set_anzahlLeben(this->get_anzahlLeben() - 1);
	else
		throw std::runtime_error("Alle Leben aufgebraucht!");
}

auto Unsterblicher::get_geburtsjahr() const -> int
{
	return this->geburtsjahr_;
}

auto Unsterblicher::get_anzahlLeben() const -> int
{
	return this->anzahl_leben_;
}

auto Unsterblicher::set_geburtsjahr(const int& geburtsjahr) -> void
{
	this->geburtsjahr_ = geburtsjahr;
}

auto Unsterblicher::set_anzahlLeben(const int& anzahlLeben) -> void
{
	this->anzahl_leben_ = anzahlLeben;
}
