#pragma once
#include "Waffenverhalten.h"

class Spielfigur
{
public:
	explicit Spielfigur(Waffenverhalten *wv);
	virtual ~Spielfigur();

	virtual auto anzeigen() -> void final;	
	virtual auto kaempfen() -> void final;
	virtual auto setWaffe(Waffenverhalten* wv) -> void final;
protected:
	virtual auto getWaffe() -> Waffenverhalten* final;
	virtual auto getClassName() -> std::string final;
	virtual auto getWaffenName() -> std::string final;
private:
	Waffenverhalten* waffe{};
};

class Koenig final : public Spielfigur { public: explicit Koenig(Waffenverhalten *wv) : Spielfigur(wv) {} };
class Koenigin final : public Spielfigur { public: explicit Koenigin(Waffenverhalten *wv) : Spielfigur(wv) {} };
class Ritter final : public Spielfigur { public: explicit Ritter(Waffenverhalten *wv) : Spielfigur(wv) {} };
class Troll final : public Spielfigur { public: explicit Troll(Waffenverhalten *wv) : Spielfigur(wv) {} };
