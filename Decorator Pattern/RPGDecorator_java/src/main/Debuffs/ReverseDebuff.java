package main.Debuffs;

import main.ADecorator;
import main.Character;
import main.Game;

public final class ReverseDebuff extends ADecorator {
    public ReverseDebuff(final Character pObj) {
        super(pObj);
    }

    @Override
    public int getMaxMoveDistance() {
        return this.getPObj().getMaxMoveDistance();
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        switch (direction) {
            case NORTH -> super.move(Game.directions.SOUTH, steps);
            case EAST -> super.move(Game.directions.WEST, steps);
            case SOUTH -> super.move(Game.directions.NORTH, steps);
            case WEST -> super.move(Game.directions.EAST, steps);
        }
    }

    @Override
    public void speak(final String text) {
        final var oldText = text.toCharArray();
        final var newText = new StringBuilder();
        for (int i = oldText.length - 1; i >= 0; i--)
            newText.append(oldText[i]);
        this.getPObj().speak(newText.toString());
    }
}
