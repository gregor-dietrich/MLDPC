#include <iostream>

#include "Manager.h"
#include "Subordinate.h"

auto main() -> int
{
	const auto ceo = new Manager;
	for (int i = 0; i < 3; i++) {
		const auto manager = new Manager;
		for (int j = 0; j < (i + 2); j++)
			manager->hireSubordinate(new Subordinate);
		ceo->hireSubordinate(manager);
	}
	
	std::cout << ceo->toString();
}
