package main.IWaffenverhalten;

public abstract class IWaffenverhalten {
    public void benutzeWaffe(int anzahl)
    {
        draw();
        for (int i = 0; i < anzahl; i++) {
            prepare();
            aim();
            strike();
        }
        holster();
    }

    public abstract void draw();
    public abstract void prepare();
    public abstract void strike();
    public abstract void aim();
    public abstract void holster();
}
