package main.Classes;

public final class Ranger extends ACharacter {
    public Ranger() {
        this(0, 0, 0, 0);
    }

    public Ranger(final int vitality, final int strength, final int endurance, final int intelligence) {
        super(vitality, strength, endurance, intelligence);
    }

    @Override
    public int getMaxMoveDistance() {
        return super.getMaxMoveDistance() * 2;
    }

}
