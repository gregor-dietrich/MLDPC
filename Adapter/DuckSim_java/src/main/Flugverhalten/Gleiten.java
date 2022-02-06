package main.Flugverhalten;

public final class Gleiten implements IFlugverhalten {
    @Override
    public void fliegen() {
        System.out.println("Ich gleite dahin!");
    }
}
