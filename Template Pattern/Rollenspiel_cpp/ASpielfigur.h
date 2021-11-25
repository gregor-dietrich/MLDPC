#pragma once
#include <string>

#include "AWaffenverhalten.h"

class ASpielfigur
{
public:
	explicit ASpielfigur(AWaffenverhalten* wv);
	virtual ~ASpielfigur();

	virtual auto anzeigen() -> void final;
	virtual auto kaempfen(unsigned const int& anzahl) -> void final;

	virtual auto set_waffe(AWaffenverhalten* wv) -> void final;
private:
	AWaffenverhalten* wv_;

	virtual auto get_waffe() -> AWaffenverhalten*;
	virtual auto get_class_name() -> std::string;
};

class Koenig : public ASpielfigur { public: explicit Koenig(AWaffenverhalten* wv) : ASpielfigur(wv) {} };
class Koenigin : public ASpielfigur { public: explicit Koenigin(AWaffenverhalten* wv) : ASpielfigur(wv) {} };
class Ritter : public ASpielfigur { public: explicit Ritter(AWaffenverhalten* wv) : ASpielfigur(wv) {} };
class Troll : public ASpielfigur { public: explicit Troll(AWaffenverhalten* wv) : ASpielfigur(wv) {} };
