#pragma once
#include <vector>

#include "ILego.h"
class LegoComposition final : public ILego
{
public:
	LegoComposition() = default;
	~LegoComposition() override;
	LegoComposition(std::vector<ILego*> pieces);
	LegoComposition(const std::vector<ILego*>* pieces);

	auto getPrice() const -> double override;

	auto addPiece(ILego* p) -> void;
	auto removePiece(const ILego* p) const -> bool;
	auto getPieces() const -> std::vector<ILego*>;
private:
	std::vector<ILego*> _pieces;
};
