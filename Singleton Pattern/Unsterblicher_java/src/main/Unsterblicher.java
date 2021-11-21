package main;

public final class Unsterblicher {
    private static Unsterblicher instance;
    private int geburtsjahr;
    private int anzahlLeben;

    private Unsterblicher() {}

    public static Unsterblicher getInstance() {
        if (instance == null)
            instance = new Unsterblicher();
        return instance;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public int getAnzahlLeben() {
        return anzahlLeben;
    }

    public void setAnzahlLeben(int anzahlLeben) {
        this.anzahlLeben = anzahlLeben;
    }
}
