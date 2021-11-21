package main.Ente;

import main.IFlugverhalten.IFlugverhalten;
import main.IQuakverhalten.IQuakverhalten;

public class Gummiente extends Ente
{
    public Gummiente(IFlugverhalten fv, IQuakverhalten qv) throws Throwable
    {
        super(fv, qv);
    }

    @Override
    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Gummiente");
    }
}
