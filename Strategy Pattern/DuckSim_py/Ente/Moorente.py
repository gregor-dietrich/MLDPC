from typing import Type

from IFlugverhalten import IFlugverhalten
from IQuakverhalten import IQuakverhalten
from Ente import AEnte


class Moorente(AEnte.AEnte):
    def __init__(self, fv: Type[IFlugverhalten], qv: Type[IQuakverhalten]):
        super(Moorente, self).__init__(fv, qv)

    def anzeigen(self) -> None:
        super().anzeigen()
        print("Moorente")
