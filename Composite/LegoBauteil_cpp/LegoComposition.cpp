#include "LegoComposition.h"

LegoComposition::~LegoComposition()
{
	for (const auto piece : this->getPieces())
		delete piece;
}

LegoComposition::LegoComposition(std::vector<ILego*> pieces) : _pieces(std::move(pieces)) {}

LegoComposition::LegoComposition(const std::vector<ILego*>* pieces) : _pieces(*pieces) {}

auto LegoComposition::getPrice() const -> double
{
	double price = 0;
	for (const auto& piece : this->getPieces())
		if (piece != nullptr)
			price += piece->getPrice();
	return price;
}

auto LegoComposition::addPiece(ILego* p) -> void
{
	this->_pieces.emplace_back(p);
}

auto LegoComposition::removePiece(const ILego* p) const -> bool
{
	const auto pos = std::find(this->getPieces().begin(), this->getPieces().end(), p);
	if (pos != this->getPieces().end()) {
		this->getPieces().erase(pos);
		return true;
	}
	return false;
}

auto LegoComposition::getPieces() const -> std::vector<ILego*>
{
	return this->_pieces;
}
