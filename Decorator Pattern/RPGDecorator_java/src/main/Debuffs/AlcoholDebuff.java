package main.Debuffs;

import main.Classes.ACharacter;
import main.Game;

public final class AlcoholDebuff extends ADecorator {
    public AlcoholDebuff(final ACharacter pObj) {
        super(pObj);
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        this.getPObj().move(direction, steps / 2);
    }

    @Override
    public void speak(final String text) {
        this.getPObj().speak(text.substring(1, text.length() - 1));
    }
}
