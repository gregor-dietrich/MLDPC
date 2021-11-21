import abc


class IWaffenverhalten(metaclass=abc.ABCMeta):
    @classmethod
    def __subclasshook__(cls, subclass) -> bool:
        return hasattr(subclass, "benutzeWaffe") and callable(subclass.benutzeWaffe or NotImplemented)

    @abc.abstractmethod
    def benutzeWaffe() -> None:
        raise NotImplementedError


class Axtschlagen(IWaffenverhalten):
    def benutzeWaffe() -> None:
        print("Ich schlage mit meiner Axt!")


class Bogenschiessen(IWaffenverhalten):
    def benutzeWaffe() -> None:
        print("Ich schiesse mit meinem Bogen!")


class Messerstechen(IWaffenverhalten):
    def benutzeWaffe() -> None:
        print("Ich steche mit meinem Messer!")


class Schwertschwingen(IWaffenverhalten):
    def benutzeWaffe() -> None:
        print("Ich schwinge mein Schwert!")
