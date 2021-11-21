#pragma once

#include <iostream>

class IWaffenverhalten
{
public:
	virtual void benutzeWaffe()	= 0;
};

class Axtschlagen : public IWaffenverhalten
{
public:
	void benutzeWaffe() override
	{
		std::cout << "Ich schlage mit meiner Axt!\n";
	}
};

class Schwertschwingen : public IWaffenverhalten
{
public:
	void benutzeWaffe() override
	{
		std::cout << "Ich schwinge mein Schwert!\n";
	}
};

class Bogenschiessen : public IWaffenverhalten
{
public:
	void benutzeWaffe() override
	{
		std::cout << "Ich schiesse mit meinem Bogen!\n";
	}
};

class Messerstechen : public IWaffenverhalten
{
public:
	void benutzeWaffe() override
	{
		std::cout << "Ich steche mit meinem Messer!\n";
	}
};
