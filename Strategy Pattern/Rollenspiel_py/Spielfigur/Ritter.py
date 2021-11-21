from typing import Type

from IWaffenverhalten import IWaffenverhalten
from Spielfigur import ASpielfigur


class Ritter(ASpielfigur.ASpielfigur):
    def __init__(self, wv: Type[IWaffenverhalten]):
        super(Ritter, self).__init__(wv)
