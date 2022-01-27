package main.DoorState;

import main.Key;

public final class DoorClosedLocked implements IDoorState {
    @Override
    public IDoorState open() {
        return this;
    }

    @Override
    public IDoorState close() {
        return this;
    }

    @Override
    public IDoorState lock(Key key) {
        return this;
    }

    @Override
    public IDoorState unlock(Key key) {
        return new DoorClosedUnlocked();
    }
}
