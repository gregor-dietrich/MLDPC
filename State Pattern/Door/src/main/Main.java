package main;

public class Main {
    public static void main(String[] args) {
        final var door = new Door();
        final var key = new Key();
        door.unlock(key);
        door.lock(key);
        door.open();
        door.unlock(key);
        door.open();
        door.lock(key);
        door.close();
        door.close();
        door.lock(key);
    }
}
