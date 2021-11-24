#pragma once
#include "IngredientFactory.h"
#include "Pizza.h"

class Pizzeria : public AObject
{
public:
	enum class pizza_type { FUNGHI, HAWAII, MARGHERITA, PROSCIUTTO, SALAMI, SPECIALE, TONNO };

	explicit Pizzeria(IngredientFactory* ingredient_factory);
	~Pizzeria() override;
	virtual auto get_ingredient_factory() -> IngredientFactory* final;
	
	virtual auto order_pizza(const pizza_type& type) -> Pizza* final;
protected:
	virtual auto create_pizza(const pizza_type& type) -> Pizza*;
private:
	std::vector<Pizza*> pizzen_;
	IngredientFactory* ingredient_factory_;

	auto set_ingredient_factory(IngredientFactory* ingredient_factory) -> void;
};
