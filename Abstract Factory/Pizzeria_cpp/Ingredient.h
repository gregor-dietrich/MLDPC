#pragma once
#include "AObject.h"

class AIngredient : public AObject {};

class ACheese : public AIngredient {};
class ADough : public AIngredient {};
class ATopping : public AIngredient {};

class MozzarellaCheese : public ACheese {};
class PlasticCheese : public ACheese {};

class ThickCrustDough : public ADough {};
class ThinCrustDough : public ADough {};

class Ham : public ATopping {};
class Mushrooms : public ATopping {};
class Pineapple : public ATopping {};
class Salami : public ATopping {};
class Tuna : public ATopping {};
