#pragma once
class IQuakverhalten
{
public:
	virtual auto quaken() -> void = 0;
};

class Quaken : public IQuakverhalten
{
public:
	auto quaken() -> void override
	{
		std::cout << "Quak!\n";
	}
};

class Quietschen : public IQuakverhalten
{
public:
	auto quaken() -> void override
	{
		std::cout << "Quietsch!\n";
	}
};

class Still : public IQuakverhalten
{
public:
	auto quaken() -> void override
	{
		std::cout << "Ich bin still!\n";
	}
};
