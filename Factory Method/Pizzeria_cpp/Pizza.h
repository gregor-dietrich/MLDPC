#pragma once
#include <string>

class APizza
{
public:
	virtual ~APizza() = default;
	virtual auto get_class_name() -> std::string final;

	virtual auto prepare() -> void final;
	virtual auto bake() -> void final;
	virtual auto cut() -> void final;

	virtual auto is_prepared() -> bool final;
	virtual auto is_baked() -> bool final;
	virtual auto is_cut() -> bool final;
protected:
	APizza();
private:
	bool is_prepared_;
	bool is_baked_;
	bool is_cut_;

	auto set_prepared(bool is_prepared) -> void;
	auto set_baked(bool is_baked) -> void;
	auto set_cut(bool is_cut) -> void;
};

class AmericanFunghi : public APizza
{
};

class AmericanHawaii : public APizza
{
};

class AmericanMargherita : public APizza
{
};

class AmericanSalami : public APizza
{
};

class AmericanTonno : public APizza
{
};

class ItalianFunghi : public APizza
{
};

class ItalianHawaii : public APizza
{
};

class ItalianMargherita : public APizza
{
};

class ItalianSalami : public APizza
{
};

class ItalianTonno : public APizza
{
};
