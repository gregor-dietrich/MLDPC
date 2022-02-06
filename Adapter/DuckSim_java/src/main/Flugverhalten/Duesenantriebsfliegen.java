package main.Flugverhalten;

public final class Duesenantriebsfliegen implements IFlugverhalten {
    @Override
    public void fliegen() {
        System.out.println("Ich benutze einen Duesenantrieb!");
    }
}
