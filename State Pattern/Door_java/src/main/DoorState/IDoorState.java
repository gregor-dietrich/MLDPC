package main.DoorState;

import main.Key;

public interface IDoorState {
    IDoorState open();
    IDoorState close();
    IDoorState lock(final Key key);
    IDoorState unlock(final Key key);
}
