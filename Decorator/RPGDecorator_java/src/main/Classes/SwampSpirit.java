package main.Classes;

public final class SwampSpirit extends ACharacter {
    public SwampSpirit() {
        this(0, 0, 0, 0);
    }

    public SwampSpirit(final int vitality, final int strength, final int endurance, final int intelligence) {
        super(vitality, strength, endurance, intelligence);
    }

    @Override
    public int getMaxMoveDistance() {
        return super.getMaxMoveDistance() / 2;
    }

    @Override
    public void speak(final String text) {
        System.out.println(this + " sings: \"" + text + "\"");
    }
}
