package main.Debuffs;

import main.Classes.ACharacter;
import main.Game;

public abstract class ADecorator extends ACharacter {
    private ACharacter pObj;

    public ADecorator(final ACharacter pObj) {
        this.setPObj(pObj);
    }

    @Override
    public void move(final Game.directions direction, final int steps) {
        this.getPObj().move(direction, steps);
    }

    @Override
    public void speak(final String text) {
        this.getPObj().speak(text);
    }

    protected ACharacter getPObj() {
        return pObj;
    }

    private void setPObj(final ACharacter pObj) {
        this.pObj = pObj;
    }
}
