package main.Waffenverhalten;

public abstract class AWaffenverhalten {
    public final void benutzeWaffe(final int anzahl) {
        draw();
        for (int i = 0; i < anzahl; i++) {
            prepare();
            aim();
            strike();
        }
        holster();
    }

    protected abstract void draw();

    protected abstract void prepare();

    protected abstract void strike();

    protected abstract void aim();

    protected abstract void holster();
}
