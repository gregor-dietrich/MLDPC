package main;

public final class Unsterblicher {
    private static final Unsterblicher INSTANCE = new Unsterblicher();
    private int geburtsjahr;
    private int anzahlLeben;

    private Unsterblicher() {}

    public static Unsterblicher getInstance() {
        return INSTANCE;
    }

    synchronized public int getGeburtsjahr() {
        return geburtsjahr;
    }

    synchronized public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    synchronized public int getAnzahlLeben() {
        return anzahlLeben;
    }

    synchronized public void setAnzahlLeben(int anzahlLeben) {
        this.anzahlLeben = anzahlLeben;
    }
}
