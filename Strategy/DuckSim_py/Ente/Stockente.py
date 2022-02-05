from typing import Type

from IFlugverhalten import IFlugverhalten
from IQuakverhalten import IQuakverhalten
from Ente import AEnte


class Stockente(AEnte.AEnte):
    def __init__(self, fv: Type[IFlugverhalten], qv: Type[IQuakverhalten]):
        super(Stockente, self).__init__(fv, qv)

    def anzeigen(self) -> None:
        super().anzeigen()
        print("Stockente")
