package main.IFlugverhalten;

public class Fluegelschlagen implements IFlugverhalten
{
    @Override
    public void fliegen()
    {
        System.out.println("Ich fliege mit meinen Fluegeln!");
    }
}
