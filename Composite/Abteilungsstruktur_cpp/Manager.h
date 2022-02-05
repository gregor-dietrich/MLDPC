#pragma once

#include <sstream>
#include <vector>

#include "IPerson.h"
class Manager final : public IPerson
{
public:
	Manager() = default;
	~Manager() override;
	Manager(std::vector<IPerson*> subordinates);
	Manager(const std::vector<IPerson*>* subordinates);
	auto toString() const -> std::string override;
	auto getSubordinateCount() const -> unsigned int override;

	auto hireSubordinate(IPerson* s) -> void;
	auto fireSubordinate(const IPerson* s) const -> bool;
	auto getSubordinates() const -> std::vector<IPerson*>;
private:
	std::vector<IPerson*> _subordinates;
};
