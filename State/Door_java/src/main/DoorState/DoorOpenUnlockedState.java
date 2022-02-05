package main.DoorState;

import main.Key;

public final class DoorOpenUnlockedState implements IDoorState {
    @Override
    public IDoorState open() {
        return this;
    }

    @Override
    public IDoorState close() {
        return new DoorClosedUnlockedState();
    }

    @Override
    public IDoorState lock(Key key) {
        return new DoorOpenLockedState();
    }

    @Override
    public IDoorState unlock(Key key) {
        return this;
    }
}
