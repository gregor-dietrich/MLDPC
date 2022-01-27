package main;

import main.DoorState.*;

import java.util.Objects;

public final class Door {
    private IDoorState currentState;

    public Door() {
        this(new DoorClosedUnlocked());
    }

    public Door(final IDoorState defaultState) {
        this.currentState = defaultState;
    }

    public boolean open() {
        this.currentState = currentState.open();
        final var result = checkCurrentState("Open");
        System.out.println(result ? "Door is open" : "Failed to open");
        return result;
    }

    public boolean close() {
        this.currentState = currentState.close();
        final var result = checkCurrentState("Closed");
        System.out.println(result ? "Door is closed" : "Failed to close");
        return result;
    }

    public boolean lock(final Key key) {
        this.currentState = currentState.lock(key);
        final var result = checkCurrentState("Locked");
        System.out.println(result ? "Door is locked" : "Failed to lock");
        return result;
    }

    public boolean unlock(final Key key) {
        this.currentState = currentState.unlock(key);
        final var result = checkCurrentState("Unlocked");
        System.out.println(result ? "Door is unlocked" : "Failed to unlock");
        return result;
    }

    private boolean checkCurrentState(final String desiredState) {
        return switch (desiredState) {
            case "Open" -> currentState instanceof DoorOpenUnlocked || currentState instanceof DoorOpenLocked;
            case "Closed" -> currentState instanceof DoorClosedUnlocked || currentState instanceof DoorClosedLocked;
            case "Locked" -> currentState instanceof DoorOpenLocked || currentState instanceof DoorClosedLocked;
            case "Unlocked" -> currentState instanceof DoorOpenUnlocked || currentState instanceof DoorClosedUnlocked;
            default -> throw new IllegalStateException("Unexpected value: " + desiredState);
        };
    }
}
