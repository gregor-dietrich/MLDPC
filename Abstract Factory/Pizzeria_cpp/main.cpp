#include <iostream>
#include <vector>

#include "Pizzeria.h"

auto main() -> int
{
	const std::vector<Pizzeria*> pizzerien =
	{
		new Pizzeria(new AmericanIngredientFactory),
		new Pizzeria(new ItalianIngredientFactory)
	};

	for (const auto pizzeria : pizzerien)
	{
		const std::vector<Pizza*> pizzen =
		{
			pizzeria->order_pizza(Pizzeria::pizza_type::FUNGHI),
			pizzeria->order_pizza(Pizzeria::pizza_type::HAWAII),
			pizzeria->order_pizza(Pizzeria::pizza_type::MARGHERITA),
			pizzeria->order_pizza(Pizzeria::pizza_type::PROSCIUTTO),
			pizzeria->order_pizza(Pizzeria::pizza_type::SALAMI),
			pizzeria->order_pizza(Pizzeria::pizza_type::SPECIALE),
			pizzeria->order_pizza(Pizzeria::pizza_type::TONNO)
		};
	}

	for (const auto pizzeria : pizzerien)
		delete pizzeria;

	return EXIT_SUCCESS;
}
