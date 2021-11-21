#pragma once
class IFlugverhalten
{
public:
	virtual void fliegen() = 0;
};

class NichtFliegen : public IFlugverhalten
{
public:
	void fliegen() override
	{
		std::cout << "Ich kann nicht fliegen!\n";
	}
};

class Fluegelschlagen : public IFlugverhalten
{
public:
	void fliegen() override
	{
		std::cout << "Ich fliege mit meinen Fluegeln!\n";
	}
};

class Gleiten : public IFlugverhalten
{
public:
	void fliegen() override
	{
		std::cout << "Ich gleite dahin!\n";
	}
};

class Duesenantriebsfliegen : public IFlugverhalten
{
public:
	void fliegen() override
	{
		std::cout << "Ich benutze einen Duesenantrieb!\n";
	}
};
