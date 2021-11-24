#include <iostream>
#include <vector>

#include "Pizzeria.h"

auto main() -> int
{
	const std::vector<APizzeria*> pizzerien =
	{
		new PizzeriaItalia(),
		new PizzeriaAmerika()
	};

	for (const auto pizzeria : pizzerien)
	{
		const std::vector<APizza*> pizzen =
		{
			pizzeria->order_pizza(APizzeria::pizza_type::FUNGHI),
			pizzeria->order_pizza(APizzeria::pizza_type::HAWAII),
			pizzeria->order_pizza(APizzeria::pizza_type::MARGHERITA),
			pizzeria->order_pizza(APizzeria::pizza_type::SALAMI),
			pizzeria->order_pizza(APizzeria::pizza_type::TONNO)
		};
	}

	for (const auto pizzeria : pizzerien)
		delete pizzeria;

	return EXIT_SUCCESS;
}
