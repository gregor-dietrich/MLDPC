#pragma once
#include "Ingredient.h"

class IngredientFactory : public AObject
{
public:
	virtual auto create_cheese() -> ACheese* = 0;
	virtual auto create_dough() -> ADough* = 0;
};

class AmericanIngredientFactory : public IngredientFactory
{
public:
	auto create_cheese() -> ACheese* override { return new PlasticCheese; }
	auto create_dough() -> ADough* override { return new ThickCrustDough; }
};

class ItalianIngredientFactory : public IngredientFactory
{
public:
	auto create_cheese() -> ACheese* override { return new MozzarellaCheese; }
	auto create_dough() -> ADough* override { return new ThinCrustDough; }
};
