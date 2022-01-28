package main;

import main.DoorState.*;

import java.util.Objects;

public final class Door {
    private IDoorState currentState;

    public Door() {
        this(new DoorClosedUnlockedState());
    }

    public Door(final IDoorState defaultState) {
        this.currentState = defaultState;
    }

    public boolean open() {
        final var oldState = this.currentState;
        this.currentState = currentState.open();
        final var result = !Objects.equals(this.currentState, oldState);
        System.out.println(result ? "Door opened" : "Nothing happened");
        return result;
    }

    public boolean close() {
        final var oldState = this.currentState;
        this.currentState = currentState.close();
        final var result = !Objects.equals(this.currentState, oldState);
        System.out.println(result ? "Door closed" : "Nothing happened");
        return result;
    }

    public boolean lock(final Key key) {
        final var oldState = this.currentState;
        this.currentState = currentState.lock(key);
        final var result = !Objects.equals(this.currentState, oldState);
        System.out.println(result ? "Door locked" : "Nothing happened");
        return result;
    }

    public boolean unlock(final Key key) {
        final var oldState = this.currentState;
        this.currentState = currentState.unlock(key);
        final var result = !Objects.equals(this.currentState, oldState);
        System.out.println(result ? "Door unlocked" : "Nothing happened");
        return result;
    }
}
