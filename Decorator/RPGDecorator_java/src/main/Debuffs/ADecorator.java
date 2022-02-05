package main.Debuffs;

import main.Classes.ACharacter;
import main.Game;

public abstract class ADecorator extends ACharacter {
    private ACharacter pObj;

    public ADecorator(final ACharacter pObj) {
        this.setPObj(pObj);
    }

    @Override
    public abstract void move(final Game.directions direction, final int steps);

    @Override
    public abstract void speak(final String text);

    protected final ACharacter getPObj() {
        return pObj;
    }

    private void setPObj(final ACharacter pObj) {
        this.pObj = pObj;
    }

    @Override
    public int getVitality() {
        return this.getPObj() != null ? this.getPObj().getVitality() : -1;
    }

    @Override
    public void setVitality(final int vitality) {
        if (this.getPObj() != null)
            this.getPObj().setVitality(vitality);
    }

    @Override
    public int getStrength() {
        return this.getPObj() != null ? this.getPObj().getStrength() : -1;
    }

    @Override
    public void setStrength(final int strength) {
        if (this.getPObj() != null)
            this.getPObj().setStrength(strength);
    }

    @Override
    public int getEndurance() {
        return this.getPObj() != null ? this.getPObj().getEndurance() : -1;
    }

    @Override
    public void setEndurance(final int endurance) {
        if (this.getPObj() != null)
            this.getPObj().setEndurance(endurance);
    }

    @Override
    public int getIntelligence() {
        return this.getPObj() != null ? this.getPObj().getIntelligence() : -1;
    }

    @Override
    public void setIntelligence(final int intelligence) {
        if (this.getPObj() != null)
            this.getPObj().setIntelligence(intelligence);
    }

    @Override
    public int getMaxMoveDistance() {
        return this.getPObj() != null ? this.getPObj().getMaxMoveDistance() : -1;
    }
}
