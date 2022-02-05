from typing import Type

from IWaffenverhalten import IWaffenverhalten
from Spielfigur import ASpielfigur


class Koenigin(ASpielfigur.ASpielfigur):
    def __init__(self, wv: Type[IWaffenverhalten]):
        super(Koenigin, self).__init__(wv)
