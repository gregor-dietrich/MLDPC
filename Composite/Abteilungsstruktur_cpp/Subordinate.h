#pragma once

#include <sstream>

#include "IPerson.h"
class Subordinate final : public IPerson
{
public:
	auto getSubordinateCount() const -> unsigned int override;
	auto toString() const -> std::string override;
};
