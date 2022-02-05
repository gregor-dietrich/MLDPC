#include <iostream>

#include "LegoComposition.h"
#include "LegoPiece.h"

auto main() -> int
{
	const auto legoDeathStar = new LegoComposition();
	for (int i = 0; i < 100; i++) {
		const auto rngComposition = new LegoComposition();
        for (int j = 0; j < 100; j++)
            rngComposition->addPiece(new LegoPiece("grey", 1, 1));
        legoDeathStar->addPiece(rngComposition);
    }

	std::cout << legoDeathStar->getPrice();
}
