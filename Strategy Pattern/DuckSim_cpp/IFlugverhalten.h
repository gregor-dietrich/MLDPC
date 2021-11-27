#pragma once
class IFlugverhalten
{
public:
	virtual auto fliegen() -> void = 0;
};

class NichtFliegen : public IFlugverhalten
{
public:
	auto fliegen() -> void override
	{
		std::cout << "Ich kann nicht fliegen!\n";
	}
};

class Fluegelschlagen : public IFlugverhalten
{
public:
	auto fliegen() -> void override
	{
		std::cout << "Ich fliege mit meinen Fluegeln!\n";
	}
};

class Gleiten : public IFlugverhalten
{
public:
	auto fliegen() -> void override
	{
		std::cout << "Ich gleite dahin!\n";
	}
};

class Duesenantriebsfliegen : public IFlugverhalten
{
public:
	auto fliegen() -> void override
	{
		std::cout << "Ich benutze einen Duesenantrieb!\n";
	}
};
