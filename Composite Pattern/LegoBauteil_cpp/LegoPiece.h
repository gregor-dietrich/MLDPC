#pragma once
#include <string>

#include "ILego.h"
class LegoPiece final : public ILego
{
public:
	LegoPiece();
	LegoPiece(const std::string& color, const double& price, const int& size);
	
	auto getPrice() const -> double override;
	auto getColor() const -> std::string;
	auto getSize() const -> int;

	auto setPrice(const double& price) -> void;
	auto setColor(const std::string& color) -> void;
	auto setSize(const int& size) -> void;
private:
	std::string _color;
	double _price{};
	int _size{};
};

