#include <iostream>

#include "Pizzeria.h"

Pizzeria::Pizzeria(IngredientFactory* ingredient_factory)
{
	this->set_ingredient_factory(ingredient_factory);
}

Pizzeria::~Pizzeria()
{
	delete this->ingredient_factory_;
	for (const auto pizza : this->pizzen_)
		delete pizza;
}

auto Pizzeria::order_pizza(const pizza_type& type) -> Pizza*
{
	std::cout << "Ordered item #" << (static_cast<int>(type) + 1) << " (using " << this->get_ingredient_factory()->
		get_class_name() << ")\n";
	const auto pizza = this->create_pizza(type);
	this->pizzen_.push_back(pizza);
	std::cout << "Pizza has been finished!\n\n";
	return pizza;
}

auto Pizzeria::create_pizza(const pizza_type& type) -> Pizza*
{
	auto pizza = new Pizza(this->get_ingredient_factory()->create_dough(),
							this->get_ingredient_factory()->create_cheese());
	pizza->prepare();
	std::cout << "Prepared: " << pizza->get_dough()->get_class_name() << ", " << pizza->get_cheese()->get_class_name()
		<< "\n";
	switch (type)
	{
	case pizza_type::FUNGHI:
		pizza->add_topping(new Mushrooms);
		break;
	case pizza_type::HAWAII: 
		pizza->add_topping(new Ham);
		pizza->add_topping(new Pineapple);
		break;
	case pizza_type::MARGHERITA:
		break;
	case pizza_type::PROSCIUTTO: 
		pizza->add_topping(new Ham);
		break;
	case pizza_type::SALAMI: 
		pizza->add_topping(new Salami);
		break;
	case pizza_type::SPECIALE: 
		pizza->add_topping(new Ham);
		pizza->add_topping(new Salami);
		break;
	case pizza_type::TONNO: 
		pizza->add_topping(new Tuna);
		break;
	}
	pizza->bake();
	pizza->cut();
	return pizza;
}

auto Pizzeria::set_ingredient_factory(IngredientFactory* ingredient_factory) -> void
{
	this->ingredient_factory_ = ingredient_factory;
}

auto Pizzeria::get_ingredient_factory() -> IngredientFactory*
{
	return this->ingredient_factory_;
}
