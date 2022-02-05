#include <iostream>

#include "Unsterblicher.h"

auto main() -> int
{
    const auto a_singleton = Unsterblicher::get_instance();
    const auto b_singleton = Unsterblicher::get_instance();

	try {
		for (unsigned short i = 0; i < 10; i++)
			a_singleton->die();
		for (unsigned short i = 0; i < 15; i++)
			b_singleton->die();
	} catch(const std::bad_exception& e)
	{
		std::cerr << "ERROR: " << e.what() << "\n";
		Unsterblicher::destroy();
		return EXIT_FAILURE;
	}

	a_singleton->set_geburtsjahr(1700);
	b_singleton->set_geburtsjahr(1800);

	if (a_singleton->get_geburtsjahr() == b_singleton->get_geburtsjahr() 
		&& a_singleton->get_anzahlLeben() == b_singleton->get_anzahlLeben())
	{
		std::cout << "Es kann nur einen geben.\n";
		std::cout << Unsterblicher::get_instance()->get_anzahlLeben() << "\n";
		Unsterblicher::destroy();
		std::cout << Unsterblicher::get_instance()->get_anzahlLeben() << "\n";

		return EXIT_SUCCESS;
	}
	std::cout << "Fehler!\n";
	Unsterblicher::destroy();
	return EXIT_FAILURE;
}
