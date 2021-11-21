package main.IWaffenverhalten;

public class Schwertschwingen extends IWaffenverhalten
{
    @Override
    public void draw() { System.out.println("Ich ziehe mein Schwert!"); }

    @Override
    public void prepare() { }

    @Override
    public void strike()
    {
        System.out.println("Ich schwinge mein Schwert!");
    }

    @Override
    public void aim() { System.out.println("Ich ziele mit meinem Schwert!"); }

    @Override
    public void holster() { System.out.println("Ich stecke mein Schwert weg!"); }
}
