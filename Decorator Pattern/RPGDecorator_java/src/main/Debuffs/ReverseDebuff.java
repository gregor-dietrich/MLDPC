package main.Debuffs;

import main.Classes.ACharacter;
import main.Game;

public final class ReverseDebuff extends ADecorator {
    public ReverseDebuff(final ACharacter pObj) {
        super(pObj);
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        var newDirection = direction;
        switch (direction) {
            case NORTH -> newDirection = Game.directions.SOUTH;
            case EAST -> newDirection = Game.directions.WEST;
            case SOUTH -> newDirection = Game.directions.NORTH;
            case WEST -> newDirection = Game.directions.EAST;
        }
        this.getPObj().move(newDirection, steps);
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
