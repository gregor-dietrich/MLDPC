#pragma once
#include <iostream>

class Waffenverhalten
{
public:
	virtual ~Waffenverhalten() = default;
	virtual auto benutzeWaffe() -> void = 0;
};

class Axtschlagen final : public Waffenverhalten
{ public: auto benutzeWaffe() -> void override { std::cout << "Ich schlage mit meiner Axt!\n"; } };

class Schwertschwingen final : public Waffenverhalten
{ public: auto benutzeWaffe() -> void override { std::cout << "Ich schwinge mein Schwert!\n"; } };

class Bogenschiessen final : public Waffenverhalten
{ public: auto benutzeWaffe() -> void override { std::cout << "Ich schiesse mit meinem Bogen!\n"; } };

class Messerstechen final : public Waffenverhalten
{ public: auto benutzeWaffe() -> void override { std::cout << "Ich steche mit meinem Messer!\n"; } };
