#include <iostream>

#include "Pizza.h"

Pizza::Pizza(ADough* dough, ACheese* cheese)
{
	this->set_dough(dough);
	this->set_cheese(cheese);
	this->set_prepared(false);
	this->set_baked(false);
	this->set_cut(false);
}

Pizza::~Pizza()
{
	for (const auto topping : this->toppings_)
		delete topping;
	delete this->cheese_;
	delete this->dough_;
}

auto Pizza::prepare() -> void
{
	if (!this->is_prepared()) {
		this->set_prepared(true);
		std::cout << "Preparing...\n";
	}
}

auto Pizza::bake() -> void
{
	if (this->is_prepared() && !this->is_baked()) {
		this->set_baked(true);
		std::cout << "Baking...\n";
	}
}

auto Pizza::cut() -> void
{
	if (this->is_prepared() && this->is_baked() && !this->is_cut()) {
		this->set_cut(true);
		std::cout << "Cutting...\n";
	}
}

auto Pizza::is_prepared() -> bool
{
	return this->is_prepared_;
}

auto Pizza::is_baked() -> bool
{
	return this->is_baked_;
}

auto Pizza::is_cut() -> bool
{
	return this->is_cut_;
}

auto Pizza::get_cheese() -> ACheese*
{
	return this->cheese_;
}

auto Pizza::get_dough() -> ADough*
{
	return this->dough_;
}

auto Pizza::get_toppings() -> std::vector<ATopping*>
{
	return this->toppings_;
}

auto Pizza::add_topping(ATopping* topping) -> bool
{
	if (this->is_prepared() && !this->is_baked()) {
		this->toppings_.push_back(topping);
		std::cout << "Added: " << topping->get_class_name() << "\n";
		return true;
	}
	return false;
}

auto Pizza::remove_topping(ATopping* topping) -> bool
{
	if (this->is_prepared() && !this->is_baked())
	{
		for (const auto _topping : this->toppings_)
		{
			if (_topping == topping) {
				delete _topping;
				return true;
			}
		}
	}
	return false;
}

auto Pizza::set_prepared(bool is_prepared) -> void
{
	this->is_prepared_ = is_prepared;
}

auto Pizza::set_baked(bool is_baked) -> void
{
	this->is_baked_ = is_baked;
}

auto Pizza::set_cut(bool is_cut) -> void
{
	this->is_cut_ = is_cut;
}

auto Pizza::set_cheese(ACheese* cheese) -> void
{
	this->cheese_ = cheese;
}

auto Pizza::set_dough(ADough* dough) -> void
{
	this->dough_ = dough;
}
