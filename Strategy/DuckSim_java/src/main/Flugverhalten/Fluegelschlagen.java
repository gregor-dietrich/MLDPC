package main.Flugverhalten;

public final class Fluegelschlagen implements IFlugverhalten {
    @Override
    public void fliegen() {
        System.out.println("Ich fliege mit meinen Fluegeln!");
    }
}
