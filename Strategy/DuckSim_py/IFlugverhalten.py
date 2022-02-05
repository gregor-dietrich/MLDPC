import abc


class IFlugverhalten(metaclass=abc.ABCMeta):
    @classmethod
    def __subclasshook__(cls, subclass) -> bool:
        return hasattr(subclass, "fliegen") and callable(subclass.fliegen or NotImplemented)

    @abc.abstractmethod
    def fliegen() -> None:
        raise NotImplementedError


class Duesenantriebsfliegen(IFlugverhalten):
    def fliegen() -> None:
        print("Ich benutze einen Duesenantrieb!")


class Fluegelschlagen(IFlugverhalten):
    def fliegen() -> None:
        print("Ich fliege mit meinen Fluegeln!")


class Gleiten(IFlugverhalten):
    def fliegen() -> None:
        print("Ich gleite dahin!")


class NichtFliegen(IFlugverhalten):
    def fliegen() -> None:
        print("Ich kann nicht fliegen!")
