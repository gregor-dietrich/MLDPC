#include <iostream>

#include "Pizzeria.h"

APizzeria::~APizzeria()
{
	for (const auto pizza : this->pizzen_)
		delete pizza;
}

auto APizzeria::get_class_name() -> std::string
{
	auto name = std::string(typeid(*this).name()).substr(6, std::string::npos);
	return name;
}

auto APizzeria::order_pizza(const pizza_type& type) -> APizza*
{
	std::cout << "Ordered item #" << (static_cast<int>(type) + 1) << " from " << this->get_class_name() << "\n";
	const auto pizza = this->create_pizza(type);
	pizza->prepare();
	pizza->bake();
	pizza->cut();
	this->pizzen_.push_back(pizza);
	std::cout << pizza->get_class_name() << " has been finished!\n\n";
	return pizza;
}

auto PizzeriaAmerika::create_pizza(const pizza_type& type) -> APizza*
{
	APizza* pizza = nullptr;
	switch (type)
	{
	case pizza_type::FUNGHI:
		pizza = new AmericanFunghi();
		break;
	case pizza_type::HAWAII:
		pizza = new AmericanHawaii();
		break;
	case pizza_type::MARGHERITA:
		pizza = new AmericanMargherita();
		break;
	case pizza_type::SALAMI:
		pizza = new AmericanSalami();
		break;
	case pizza_type::TONNO:
		pizza = new AmericanTonno();
		break;
	}
	return pizza;
}

auto PizzeriaItalia::create_pizza(const pizza_type& type) -> APizza*
{
	APizza* pizza = nullptr;
	switch (type)
	{
	case pizza_type::FUNGHI:
		pizza = new ItalianFunghi();
		break;
	case pizza_type::HAWAII:
		pizza = new ItalianHawaii();
		break;
	case pizza_type::MARGHERITA:
		pizza = new ItalianMargherita();
		break;
	case pizza_type::SALAMI:
		pizza = new ItalianSalami();
		break;
	case pizza_type::TONNO:
		pizza = new ItalianTonno();
		break;
	}
	return pizza;
}
