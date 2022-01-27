package main.DoorState;

import main.Key;

public final class DoorOpenUnlocked implements IDoorState {
    @Override
    public IDoorState open() {
        return this;
    }

    @Override
    public IDoorState close() {
        return new DoorClosedUnlocked();
    }

    @Override
    public IDoorState lock(Key key) {
        return new DoorOpenLocked();
    }

    @Override
    public IDoorState unlock(Key key) {
        return this;
    }
}
