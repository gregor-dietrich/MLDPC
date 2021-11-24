#pragma once
#include <vector>

#include "Pizza.h"

class APizzeria
{
public:
	enum class pizza_type { FUNGHI, HAWAII, MARGHERITA, SALAMI, TONNO };

	virtual ~APizzeria();
	virtual auto get_class_name() -> std::string final;
	
	virtual auto order_pizza(const pizza_type& type) -> APizza* final;
protected:
	virtual auto create_pizza(const pizza_type& type) -> APizza* = 0;
private:
	std::vector<APizza*> pizzen_;
};

class PizzeriaAmerika : public APizzeria
{
	auto create_pizza(const pizza_type& type) -> APizza* override;
};

class PizzeriaItalia : public APizzeria
{
	auto create_pizza(const pizza_type& type) -> APizza* override;
};
