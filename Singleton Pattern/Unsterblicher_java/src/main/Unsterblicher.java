package main;

public final class Unsterblicher {
    private int geburtsjahr;
    private int anzahlLeben;

    private Unsterblicher() {}

    private static class Holder {
        private static final Unsterblicher INSTANCE = new Unsterblicher();
    }

    public static Unsterblicher getInstance() {
        return Holder.INSTANCE;
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
