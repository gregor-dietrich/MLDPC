#include "Manager.h"

Manager::~Manager()
{
	for (const auto subordinate : this->getSubordinates())
		delete subordinate;
}

Manager::Manager(std::vector<IPerson*> subordinates) : _subordinates(std::move(subordinates)) {}

Manager::Manager(const std::vector<IPerson*>* subordinates) : _subordinates(*subordinates) {}

auto Manager::toString() const -> std::string
{
	std::stringstream ret;
	ret << this << " Subordinates (" << this->getSubordinateCount() << "):\n";
	for (const auto& subordinate : this->getSubordinates()) {
		ret << subordinate->toString() << "\n";
	}
	return ret.str();
}

auto Manager::getSubordinateCount() const -> unsigned int
{
	unsigned int count = 0;
	for (const auto& subordinate : this->getSubordinates()) {
		if (auto m = dynamic_cast<Manager*>(subordinate))
			count++;
		if (subordinate != nullptr)
			count += subordinate->getSubordinateCount();
	}
	return count;
}

auto Manager::hireSubordinate(IPerson* s) -> void
{
	this->_subordinates.emplace_back(s);
}

auto Manager::fireSubordinate(const IPerson* s) const -> bool
{
	const auto pos = std::find(this->getSubordinates().begin(), this->getSubordinates().end(), s);
	if (pos != this->getSubordinates().end()) {
		this->getSubordinates().erase(pos);
		return true;
	}
	return false;
}

auto Manager::getSubordinates() const -> std::vector<IPerson*>
{
	return this->_subordinates;
}
