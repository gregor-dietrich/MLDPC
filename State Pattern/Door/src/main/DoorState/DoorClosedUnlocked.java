package main.DoorState;

import main.Key;

public final class DoorClosedUnlocked implements IDoorState {
    @Override
    public IDoorState open() {
        return new DoorOpenUnlocked();
    }

    @Override
    public IDoorState close() {
        return this;
    }

    @Override
    public IDoorState lock(Key key) {
        return new DoorClosedLocked();
    }

    @Override
    public IDoorState unlock(Key key) {
        return this;
    }
}
