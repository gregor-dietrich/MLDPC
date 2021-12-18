package main.Debuffs;

import main.ADecorator;
import main.Character;
import main.Game;

public final class AlcoholDebuff extends ADecorator {
    public AlcoholDebuff(final Character pObj) {
        super(pObj);
    }

    @Override
    public int getMaxMoveDistance() {
        return this.getPObj().getMaxMoveDistance() / 2;
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        super.move(direction, steps);
    }

    @Override
    public void speak(final String text) {
        this.getPObj().speak(text.substring(1, text.length() - 1));
    }
}
