#pragma once
class IPerson
{
public:
	virtual ~IPerson() = default;

	virtual auto getSubordinateCount() const -> unsigned int = 0;
	virtual auto toString() const -> std::string = 0;
};
