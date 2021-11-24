#pragma once
#include <string>

#include <vcruntime_typeinfo.h>

class AObject
{
public:
	virtual ~AObject() = default;

	virtual auto get_class_name() -> std::string final
	{
		return this->get_name();
	}
protected:
	AObject() = default;
private:
	std::string name_;

	virtual auto set_name(const std::string& name) -> void
	{
		this->name_ = name;
	}

	virtual auto get_name() -> std::string
	{
		if (this->name_.empty())
			this->set_name(std::string(typeid(*this).name()).substr(6, std::string::npos));
		return this->name_;
	}
};

