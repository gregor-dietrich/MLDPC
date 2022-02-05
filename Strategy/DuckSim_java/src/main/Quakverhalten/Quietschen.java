package main.Quakverhalten;

public final class Quietschen implements IQuakverhalten {
    @Override
    public void quaken() {
        System.out.println("Quietsch!");
    }
}
