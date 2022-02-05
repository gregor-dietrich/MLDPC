package main.Flugverhalten;

public final class NichtFliegen implements IFlugverhalten {
    @Override
    public void fliegen() {
        System.out.println("Ich kann nicht fliegen!");
    }
}
