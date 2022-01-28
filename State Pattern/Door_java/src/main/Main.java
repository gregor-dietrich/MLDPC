package main;

public class Main {
    public static void main(String[] args) {
        final var door = new Door();
        final var key = new Key();
        // DoorClosedUnlockedState
        door.close(); // Nothing happened
        door.unlock(key); // Nothing happened
        door.lock(key); // Door locked
        // DoorClosedLockedState
        door.lock(key); // Nothing happened
        door.close(); // Nothing happened
        door.open(); // Nothing happened
        door.unlock(key); // Door unlocked
        // DoorClosedUnlockedState
        door.open(); // Door opened
        // DoorOpenUnlockedState
        door.open(); // Nothing happened
        door.unlock(key); // Nothing happened
        door.lock(key); // Door locked
        // DoorOpenLockedState
        door.lock(key); // Nothing happened
        door.open(); // Nothing happened
        door.close(); // Nothing happened
        door.unlock(key); // Door unlocked
        // DoorOpenUnlockedState
        door.close(); // Door closed
        // DoorClosedUnlockedState
        // all states tested
    }
}
