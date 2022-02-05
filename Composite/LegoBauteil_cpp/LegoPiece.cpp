#include "LegoPiece.h"

LegoPiece::LegoPiece()
{
	this->setColor("");
	this->setPrice(0);
	this->setSize(0);
}

LegoPiece::LegoPiece(const std::string& color, const double& price, const int& size)
{
	this->setColor(color);
	this->setPrice(price);
	this->setSize(size);
}

auto LegoPiece::getPrice() const -> double
{
	return this->_price;
}

auto LegoPiece::getColor() const -> std::string
{
	return this->_color;
}

auto LegoPiece::getSize() const -> int
{
	return this->_size;
}

auto LegoPiece::setPrice(const double& price) -> void
{
	this->_price = price;
}

auto LegoPiece::setColor(const std::string& color) -> void
{
	this->_color = color;
}

auto LegoPiece::setSize(const int& size) -> void
{
	this->_size = size;
}
