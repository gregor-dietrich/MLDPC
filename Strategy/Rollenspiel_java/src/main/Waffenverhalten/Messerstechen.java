package main.Waffenverhalten;

public final class Messerstechen implements IWaffenverhalten {
    @Override
    public void benutzeWaffe() {
        System.out.println("Ich steche mit meinem Messer!");
    }
}
