package main.DoorState;

import main.Key;

public final class DoorClosedUnlockedState implements IDoorState {
    @Override
    public IDoorState open() {
        return new DoorOpenUnlockedState();
    }

    @Override
    public IDoorState close() {
        return this;
    }

    @Override
    public IDoorState lock(Key key) {
        return new DoorClosedLockedState();
    }

    @Override
    public IDoorState unlock(Key key) {
        return this;
    }
}
