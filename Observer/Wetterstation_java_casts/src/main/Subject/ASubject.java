package main.Subject;

import main.Observer.IObserver;

import java.util.ArrayList;

public abstract class ASubject {
    private final ArrayList<IObserver> observerList = new ArrayList<>();
    private boolean changedFlag = false;

    public final void setChanged(final boolean newChanged) {
        this.changedFlag = newChanged;
    }

    public final void addObserver(final IObserver ob) {
        observerList.add(ob);
    }

    public final void deleteObserver(final IObserver ob) {
        observerList.remove(ob);
    }

    protected final void notifyObservers() {
        if (!changedFlag)
            return;
        for (final var ob : observerList)
            ob.update(this);
        this.setChanged(false);
    }
}
