#pragma once
class Unsterblicher final
{
public:
	static auto get_instance() -> Unsterblicher*;
	static auto destroy() -> void;

	auto die() -> void;

	auto get_geburtsjahr() const -> int;
	auto get_anzahlLeben() const -> int;
	auto set_geburtsjahr(const int& geburtsjahr) -> void;
	auto set_anzahlLeben(const int& anzahlLeben) -> void;
private:
	static Unsterblicher* instance_;
	int geburtsjahr_{};
	int anzahl_leben_{};
	
	Unsterblicher();
	~Unsterblicher() = default;
	Unsterblicher(const Unsterblicher&) = default;
};
