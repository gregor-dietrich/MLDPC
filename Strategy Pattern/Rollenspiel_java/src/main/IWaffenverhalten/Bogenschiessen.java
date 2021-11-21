package main.IWaffenverhalten;

public class Bogenschiessen implements IWaffenverhalten
{
    @Override
    public void benutzeWaffe()
    {
        System.out.println("Ich schiesse mit meinem Bogen!");
    }
}
