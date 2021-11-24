#include <iostream>

#include "Pizza.h"

APizza::APizza()
{
	this->set_prepared(false);
	this->set_baked(false);
	this->set_cut(false);
}

auto APizza::prepare() -> void
{
	if (!this->is_prepared()) {
		this->set_prepared(true);
		std::cout << "Preparing " << this->get_class_name() << "...\n";
	}
}

auto APizza::bake() -> void
{
	if (this->is_prepared() && !this->is_baked()) {
		this->set_baked(true);
		std::cout << "Baking " << this->get_class_name() << "...\n";
	}
}

auto APizza::cut() -> void
{
	if (this->is_prepared() && this->is_baked() && !this->is_cut()) {
		this->set_cut(true);
		std::cout << "Cutting " << this->get_class_name() << "...\n";
	}
}

auto APizza::get_class_name() -> std::string
{
	auto name = std::string(typeid(*this).name()).substr(6, std::string::npos);
	return name;
}

auto APizza::is_prepared() -> bool
{
	return this->is_prepared_;
}

auto APizza::is_baked() -> bool
{
	return this->is_baked_;
}

auto APizza::is_cut() -> bool
{
	return this->is_cut_;
}

auto APizza::set_prepared(bool is_prepared) -> void
{
	this->is_prepared_ = is_prepared;
}

auto APizza::set_baked(bool is_baked) -> void
{
	this->is_baked_ = is_baked;
}

auto APizza::set_cut(bool is_cut) -> void
{
	this->is_cut_ = is_cut;
}
