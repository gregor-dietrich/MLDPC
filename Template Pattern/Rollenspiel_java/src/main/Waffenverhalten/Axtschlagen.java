package main.Waffenverhalten;

public final class Axtschlagen extends AWaffenverhalten {
    @Override
    protected void draw() {
        System.out.println("Ich ziehe meine Axt!");
    }

    @Override
    protected void prepare() {
        System.out.println("Ich hebe meine Axt hoch!");
    }

    @Override
    protected void strike() {
        System.out.println("Ich schlage mit meiner Axt!");
    }

    @Override
    protected void aim() {
        System.out.println("Ich ziele mit meiner Axt!");
    }

    @Override
    protected void holster() {
        System.out.println("Ich stecke meine Axt weg!");
    }
}
