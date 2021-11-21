package main.IWaffenverhalten;

public class Messerstechen extends IWaffenverhalten
{
    @Override
    public void draw() { System.out.println("Ich ziehe mein Messer!"); }

    @Override
    public void prepare() { }

    @Override
    public void strike()
    {
        System.out.println("Ich steche mit meinem Messer!");
    }

    @Override
    public void aim() { System.out.println("Ich ziele mit meinem Messer!"); }

    @Override
    public void holster() { System.out.println("Ich stecke mein Messer weg!"); }
}
