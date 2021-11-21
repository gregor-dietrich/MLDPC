package main.IWaffenverhalten;

public class Messerstechen implements IWaffenverhalten
{
    @Override
    public void benutzeWaffe()
    {
        System.out.println("Ich steche mit meinem Messer!");
    }
}
