import abc
from typing import Type

from IWaffenverhalten import IWaffenverhalten


class ASpielfigur(metaclass=abc.ABCMeta):
    def __init__(self, wv: Type[IWaffenverhalten]):
        self.waffe = None
        self.setWaffe(wv)

    def anzeigen(self) -> None:
        print("Ich bin eine Spielfigur vom Typ %s und ich benutze %s." % (self.getClassName(), self.getWaffenName()))

    def kaempfen(self) -> None:
        self.getWaffe().benutzeWaffe()

    def setWaffe(self, wv: Type[IWaffenverhalten]) -> None:
        if wv is not None:
            self.waffe = wv
        else:
            raise ValueError

    def getWaffe(self) -> Type[IWaffenverhalten]:
        return self.waffe

    def getClassName(self) -> str:
        return self.__class__.__name__

    def getWaffenName(self) -> str:
        return str(self.getWaffe()).split(".")[-1][:-2]
