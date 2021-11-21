package main.IFlugverhalten;

public class Gleiten implements IFlugverhalten
{
    @Override
    public void fliegen()
    {
        System.out.println("Ich gleite dahin!");
    }
}
