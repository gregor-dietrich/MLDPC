package main.IWaffenverhalten;

public class Axtschlagen extends IWaffenverhalten
{
    @Override
    public void draw() { System.out.println("Ich ziehe meine Axt!"); }

    @Override
    public void prepare() { }

    @Override
    public void strike()
    {
        System.out.println("Ich schlage mit meiner Axt!");
    }

    @Override
    public void aim() { System.out.println("Ich ziele mit meiner Axt!"); }

    @Override
    public void holster() { System.out.println("Ich stecke meine Axt weg!"); }
}
