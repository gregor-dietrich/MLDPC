#pragma once
class ILego
{
public:
	virtual ~ILego() = default;

	virtual auto getPrice() const -> double = 0;
};
