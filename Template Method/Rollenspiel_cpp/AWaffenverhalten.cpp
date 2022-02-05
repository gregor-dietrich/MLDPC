#include "AWaffenverhalten.h"

#include <iostream>

auto AWaffenverhalten::benutzeWaffe(unsigned const int& anzahl) -> void
{
	this->draw();
    for (unsigned int i = 0; i < anzahl; i++) {
        this->prepare();
        this->aim();
        this->strike();
    }
    this->holster();
}

auto Axtschlagen::draw() -> void
{ std::cout << "Ich ziehe meine Axt!\n"; }

auto Axtschlagen::prepare() -> void
{}

auto Axtschlagen::strike() -> void
{ std::cout << "Ich schlage mit meiner Axt!\n"; }

auto Axtschlagen::aim() -> void
{ std::cout << "Ich ziele mit meiner Axt!\n"; }

auto Axtschlagen::holster() -> void
{ std::cout << "Ich stecke meine Axt weg!\n"; }

auto Bogenschiessen::draw() -> void
{ std::cout << "Ich ziehe meinen Bogen!\n"; }

auto Bogenschiessen::prepare() -> void
{ std::cout << "Ich lege meinen Pfeil an!\n"; }

auto Bogenschiessen::strike() -> void
{ std::cout << "Ich schiesse mit meinem Bogen!\n"; }

auto Bogenschiessen::aim() -> void
{ std::cout << "Ich ziele mit meinem Bogen!\n"; }

auto Bogenschiessen::holster() -> void
{ std::cout << "Ich stecke meinen Bogen weg!\n"; }

auto Messerstechen::draw() -> void
{ std::cout << "Ich ziehe mein Messer!\n"; }

auto Messerstechen::prepare() -> void
{}

auto Messerstechen::strike() -> void
{ std::cout << "Ich steche mit meinem Messer!\n"; }

auto Messerstechen::aim() -> void
{ std::cout << "Ich ziele mit meinem Messer!\n"; }

auto Messerstechen::holster() -> void
{ std::cout << "Ich stecke mein Messer weg!\n"; }

auto Schwertschwingen::draw() -> void
{ std::cout << "Ich ziehe mein Schwert!\n"; }

auto Schwertschwingen::prepare() -> void
{}

auto Schwertschwingen::strike() -> void
{ std::cout << "Ich schwinge mein Schwert!\n"; }

auto Schwertschwingen::aim() -> void
{ std::cout << "Ich ziele mit meinem Schwert!\n"; }

auto Schwertschwingen::holster() -> void
{ std::cout << "Ich stecke mein Schwert weg!\n"; }