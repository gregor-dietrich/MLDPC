package main.Waffenverhalten;

public final class Bogenschiessen extends AWaffenverhalten {
    @Override
    protected void draw() {
        System.out.println("Ich ziehe meinen Bogen!");
    }

    @Override
    protected void prepare() {
        System.out.println("Ich lege meinen Pfeil an!");
    }

    @Override
    protected void strike() {
        System.out.println("Ich schiesse mit meinem Bogen!");
    }

    @Override
    protected void aim() {
        System.out.println("Ich ziele mit meinem Bogen!");
    }

    @Override
    protected void holster() {
        System.out.println("Ich stecke meinen Bogen weg!");
    }
}
