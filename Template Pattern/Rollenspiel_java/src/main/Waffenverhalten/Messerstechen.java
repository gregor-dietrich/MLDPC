package main.Waffenverhalten;

public final class Messerstechen extends AWaffenverhalten {
    @Override
    protected void draw() {
        System.out.println("Ich ziehe mein Messer!");
    }

    @Override
    protected void prepare() {
        System.out.println("Ich mache mich bereit!");
    }

    @Override
    protected void strike() {
        System.out.println("Ich steche mit meinem Messer!");
    }

    @Override
    protected void aim() {
        System.out.println("Ich ziele mit meinem Messer!");
    }

    @Override
    protected void holster() {
        System.out.println("Ich stecke mein Messer weg!");
    }
}
