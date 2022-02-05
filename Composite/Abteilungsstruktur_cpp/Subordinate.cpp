#include "Subordinate.h"

auto Subordinate::getSubordinateCount() const -> unsigned int
{
	return 1;
}

auto Subordinate::toString() const -> std::string
{
	std::stringstream ret;
	ret << this;
	return ret.str();
}
