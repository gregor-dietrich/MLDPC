package main.Classes;

import main.ADecorator;
import main.Character;
import main.Game;

public final class Ranger extends ADecorator {
    public Ranger(final Character pObj) {
        super(pObj);
    }

    @Override
    public int getMaxMoveDistance() {
        return this.getPObj().getEndurance() * 2;
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        super.move(direction, steps);
    }

    @Override
    public void speak(final String text) {
        this.getPObj().speak(text);
    }
}
