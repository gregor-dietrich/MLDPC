package main.Ente;

import main.IFlugverhalten.IFlugverhalten;
import main.IQuakverhalten.IQuakverhalten;

public class Stockente extends Ente
{
    public Stockente(IFlugverhalten fv, IQuakverhalten qv) throws Throwable
    {
        super(fv, qv);
    }

    @Override
    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Stockente");
    }
}
