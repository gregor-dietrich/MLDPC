package main.Classes;

import main.ADecorator;
import main.Character;
import main.Game;

public final class SwampSpirit extends ADecorator {
    public SwampSpirit(final Character pObj) {
        super(pObj);
    }

    @Override
    public int getMaxMoveDistance() {
        return this.getPObj().getEndurance() / 2;
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        super.move(direction, steps);
    }

    @Override
    public void speak(final String text) {
        System.out.println(this + " sings: \"" + text + "\"");
    }
}
