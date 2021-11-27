package main.Waffenverhalten;

public final class Schwertschwingen extends AWaffenverhalten {
    @Override
    protected void draw() {
        System.out.println("Ich ziehe mein Schwert!");
    }

    @Override
    protected void prepare() {
        System.out.println("Ich hole zum Schlag aus!");
    }

    @Override
    protected void strike() {
        System.out.println("Ich schwinge mein Schwert!");
    }

    @Override
    protected void aim() {
        System.out.println("Ich ziele mit meinem Schwert!");
    }

    @Override
    protected void holster() {
        System.out.println("Ich stecke mein Schwert weg!");
    }
}
