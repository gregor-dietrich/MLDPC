package main;

public final class Unsterblicher {
    private static Unsterblicher instance;
    private int geburtsjahr;
    private int anzahlLeben;

    private Unsterblicher() {}

    synchronized public static Unsterblicher getInstance() {
        if (instance == null)
            instance = new Unsterblicher();
        return instance;
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
