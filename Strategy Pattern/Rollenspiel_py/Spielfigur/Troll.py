from typing import Type

from IWaffenverhalten import IWaffenverhalten
from Spielfigur import ASpielfigur


class Troll(ASpielfigur.ASpielfigur):
    def __init__(self, wv: Type[IWaffenverhalten]):
        super(Troll, self).__init__(wv)
