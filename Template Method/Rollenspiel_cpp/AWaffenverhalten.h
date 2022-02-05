#pragma once
class AWaffenverhalten
{
public:
	virtual ~AWaffenverhalten() = default;
	virtual auto benutzeWaffe(unsigned const int& anzahl) -> void final;
protected:
	virtual auto draw() -> void = 0;
	virtual auto prepare() -> void = 0;
	virtual auto strike() -> void = 0;
	virtual auto aim() -> void = 0;
	virtual auto holster() -> void = 0;
};

class Axtschlagen : public AWaffenverhalten
{
protected:
	auto draw() -> void override;
	auto prepare() -> void override;
	auto strike() -> void override;
	auto aim() -> void override;
	auto holster() -> void override;
};

class Bogenschiessen : public AWaffenverhalten
{
protected:
	auto draw() -> void override;
	auto prepare() -> void override;
	auto strike() -> void override;
	auto aim() -> void override;
	auto holster() -> void override;
};

class Messerstechen : public AWaffenverhalten
{
protected:
	auto draw() -> void override;
	auto prepare() -> void override;
	auto strike() -> void override;
	auto aim() -> void override;
	auto holster() -> void override;
};

class Schwertschwingen : public AWaffenverhalten
{
protected:
	auto draw() -> void override;
	auto prepare() -> void override;
	auto strike() -> void override;
	auto aim() -> void override;
	auto holster() -> void override;
};
