#pragma once
#include <vector>

#include "Ingredient.h"

class Pizza : public AObject
{
public:
	Pizza(ADough* dough, ACheese* cheese);
	~Pizza() override;

	virtual auto prepare() -> void final;
	virtual auto bake() -> void final;
	virtual auto cut() -> void final;

	virtual auto is_prepared() -> bool final;
	virtual auto is_baked() -> bool final;
	virtual auto is_cut() -> bool final;
	virtual auto get_cheese() -> ACheese* final;
	virtual auto get_dough() -> ADough* final;
	virtual auto get_toppings() -> std::vector<ATopping*> final;

	virtual auto add_topping(ATopping* topping) -> bool final;
	virtual auto remove_topping(ATopping* topping) -> bool final;
private:
	bool is_prepared_;
	bool is_baked_;
	bool is_cut_;
	ACheese* cheese_;
	ADough* dough_;
	std::vector<ATopping*> toppings_;

	auto set_prepared(bool is_prepared_) -> void;
	auto set_baked(bool is_baked_) -> void;
	auto set_cut(bool is_cut_) -> void;
	auto set_cheese(ACheese* cheese) -> void;
	auto set_dough(ADough* dough) -> void;
};
