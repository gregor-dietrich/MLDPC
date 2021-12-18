package main;

public abstract class ADecorator extends Character {
    private Character pObj;

    public ADecorator(final Character pObj) {
        this.setPObj(pObj);
    }

    protected Character getPObj() {
        return pObj;
    }

    private void setPObj(final Character pObj) {
        this.pObj = pObj;
    }

    public final int getVitality() {
        return this.getPObj().getVitality();
    }

    public final int getStrength() {
        return this.getPObj().getStrength();
    }

    public final int getEndurance() {
        return this.getPObj().getEndurance();
    }

    public final int getIntelligence() {
        return this.getPObj().getIntelligence();
    }
}
