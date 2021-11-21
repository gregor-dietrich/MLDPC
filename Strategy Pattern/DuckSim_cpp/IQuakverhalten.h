#pragma once
class IQuakverhalten
{
public:
	virtual void quaken() = 0;
};

class Quaken : public IQuakverhalten
{
public:
	void quaken() override
	{
		std::cout << "Quak!\n";
	}
};

class Quietschen : public IQuakverhalten
{
public:
	void quaken() override
	{
		std::cout << "Quietsch!\n";
	}
};

class Still : public IQuakverhalten
{
public:
	void quaken() override
	{
		std::cout << "Ich bin still!\n";
	}
};
