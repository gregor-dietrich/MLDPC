package main;

import main.DoorState.*;

public class Main {
    public static void main(String[] args) {
        final var door = new Door();
        final var key = new Key();
        // DoorClosedUnlockedState
        if (!(door.getCurrentState() instanceof DoorClosedUnlockedState)) throw new AssertionError();
        door.close(); // Nothing happened
        door.unlock(key); // Nothing happened
        door.lock(key); // Door locked
        // DoorClosedLockedState
        if (!(door.getCurrentState() instanceof DoorClosedLockedState)) throw new AssertionError();
        door.lock(key); // Nothing happened
        door.close(); // Nothing happened
        door.open(); // Nothing happened
        door.unlock(key); // Door unlocked
        // DoorClosedUnlockedState
        if (!(door.getCurrentState() instanceof DoorClosedUnlockedState)) throw new AssertionError();
        door.open(); // Door opened
        // DoorOpenUnlockedState
        if (!(door.getCurrentState() instanceof DoorOpenUnlockedState)) throw new AssertionError();
        door.open(); // Nothing happened
        door.unlock(key); // Nothing happened
        door.lock(key); // Door locked
        // DoorOpenLockedState
        if (!(door.getCurrentState() instanceof DoorOpenLockedState)) throw new AssertionError();
        door.lock(key); // Nothing happened
        door.open(); // Nothing happened
        door.close(); // Nothing happened
        door.unlock(key); // Door unlocked
        // DoorOpenUnlockedState
        if (!(door.getCurrentState() instanceof DoorOpenUnlockedState)) throw new AssertionError();
        door.close(); // Door closed
        // DoorClosedUnlockedState
        if (!(door.getCurrentState() instanceof DoorClosedUnlockedState)) throw new AssertionError();
    }
}
