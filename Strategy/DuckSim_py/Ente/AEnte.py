import abc
from typing import Type

from IFlugverhalten import IFlugverhalten
from IQuakverhalten import IQuakverhalten


class AEnte(metaclass=abc.ABCMeta):
    @classmethod
    def __init__(self, fv: Type[IFlugverhalten], qv: Type[IQuakverhalten]):
        self.flugEigenschaft = None
        self.quakEigenschaft = None
        self.setFlugverhalten(fv)
        self.setQuakverhalten(qv)

    @classmethod
    def __subclasshook__(cls, subclass) -> bool:
        return hasattr(subclass, "anzeigen") and callable(subclass.anzeigen or NotImplemented)

    @abc.abstractmethod
    def anzeigen(self) -> None:
        print("Ich bin eine Ente vom Typ: ", end="")

    def schwimmen(self) -> None:
        print("%s schwimmt." % self.getClassName())

    @classmethod
    def flugAusfuehren(self) -> None:
        self.getFlugverhalten().fliegen()

    @classmethod
    def setFlugverhalten(self, fv: Type[IFlugverhalten]) -> None:
        if fv is not None:
            self.flugEigenschaft = fv
        else:
            raise ValueError

    @classmethod
    def getFlugverhalten(self) -> Type[IFlugverhalten]:
        return self.flugEigenschaft

    @classmethod
    def quakAusfuehren(self) -> None:
        self.getQuakverhalten().quaken()

    @classmethod
    def setQuakverhalten(self, qv: Type[IQuakverhalten]) -> None:
        if qv is not None:
            self.quakEigenschaft = qv
        else:
            raise ValueError

    @classmethod
    def getQuakverhalten(self) -> Type[IQuakverhalten]:
        return self.quakEigenschaft

    def getClassName(self) -> str:
        return self.__class__.__name__
