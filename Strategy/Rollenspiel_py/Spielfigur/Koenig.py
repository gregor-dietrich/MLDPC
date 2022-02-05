from typing import Type

from IWaffenverhalten import IWaffenverhalten
from Spielfigur import ASpielfigur


class Koenig(ASpielfigur.ASpielfigur):
    def __init__(self, wv: Type[IWaffenverhalten]):
        super(Koenig, self).__init__(wv)
