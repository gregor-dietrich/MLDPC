package main.IFlugverhalten;

public class Duesenantriebsfliegen implements IFlugverhalten
{
    @Override
    public void fliegen()
    {
        System.out.println("Ich benutze einen Duesenantrieb!");
    }
}
