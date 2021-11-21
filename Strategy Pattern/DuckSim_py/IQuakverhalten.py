import abc


class IQuakverhalten(metaclass=abc.ABCMeta):
    @classmethod
    def __subclasshook__(cls, subclass) -> bool:
        return hasattr(subclass, "quaken") and callable(subclass.quaken or NotImplemented)

    @abc.abstractmethod
    def quaken() -> None:
        raise NotImplementedError


class Quaken(IQuakverhalten):
    def quaken() -> None:
        print("Quak!")


class Quietschen(IQuakverhalten):
    def quaken() -> None:
        print("Quietsch!")


class Still(IQuakverhalten):
    def quaken() -> None:
        print("Ich bin still!!")
