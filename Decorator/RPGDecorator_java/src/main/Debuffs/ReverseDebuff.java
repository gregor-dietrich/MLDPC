package main.Debuffs;

import main.Classes.ACharacter;
import main.Game;

public final class ReverseDebuff extends ADecorator {
    public ReverseDebuff(final ACharacter pObj) {
        super(pObj);
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        switch (direction) {
            case NORTH -> this.getPObj().move(Game.directions.SOUTH, steps);
            case EAST -> this.getPObj().move(Game.directions.WEST, steps);
            case SOUTH -> this.getPObj().move(Game.directions.NORTH, steps);
            case WEST -> this.getPObj().move(Game.directions.EAST, steps);
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
