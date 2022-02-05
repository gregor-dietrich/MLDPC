package main.Waffenverhalten;

public final class Axtschlagen implements IWaffenverhalten {
    @Override
    public void benutzeWaffe() {
        System.out.println("Ich schlage mit meiner Axt!");
    }
}
