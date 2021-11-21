package main.IWaffenverhalten;

public class Bogenschiessen extends IWaffenverhalten
{
    @Override
    public void draw() { System.out.println("Ich ziehe meinen Bogen!"); }

    @Override
    public void prepare() { System.out.println("Ich lege meinen Pfeil an!"); }

    @Override
    public void strike()
    {
        System.out.println("Ich schiesse mit meinem Bogen!");
    }

    @Override
    public void aim() { System.out.println("Ich ziele mit meinem Bogen!"); }

    @Override
    public void holster() { System.out.println("Ich stecke meinen Bogen weg!"); }
}
