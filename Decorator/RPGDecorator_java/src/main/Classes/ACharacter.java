package main.Classes;

import main.Game;

public abstract class ACharacter {
    private int vitality;
    private int strength;
    private int endurance;
    private int intelligence;

    public ACharacter() {
        this(0, 0, 0, 0);
    }

    public ACharacter(final int vitality, final int strength, final int endurance, final int intelligence) {
        this.setVitality(vitality);
        this.setStrength(strength);
        this.setEndurance(endurance);
        this.setIntelligence(intelligence);
    }

    protected static int clampStat(final int min, final int max, final int n) {
        if (n <= min)
            return min;
        else if (n >= max)
            return max;
        return n;
    }

    public void move(final Game.directions direction, final int steps) {
        if (steps > 0)
            System.out.println(this + " is moving " + clampStat(1, this.getMaxMoveDistance(), steps)
                    + " steps to the " + direction.toString());
    }

    public void speak(final String text) {
        System.out.println(this + " says: \"" + text + "\"");
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(final int vitality) {
        this.vitality = clampStat(0, 10, vitality);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(final int strength) {
        this.strength = clampStat(0, 10, strength);
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(final int endurance) {
        this.endurance = clampStat(0, 10, endurance);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(final int intelligence) {
        this.intelligence = clampStat(0, 10, intelligence);
    }

    public int getMaxMoveDistance() {
        return this.getEndurance();
    }

    @Override
    public final String toString() {
        final var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
}
