package main.Ente;

import main.IFlugverhalten.IFlugverhalten;
import main.IQuakverhalten.IQuakverhalten;

public class Entenattrappe extends Ente
{
    public Entenattrappe(IFlugverhalten fv, IQuakverhalten qv) throws Throwable
    {
        super(fv, qv);
    }

    @Override
    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Entenattrappe");
    }
}
