package main.subject;

import main.observer.IObserver;

import java.util.ArrayList;

public abstract class ASubject<T> {
    private final ArrayList<IObserver<T>> observerList;

    public ASubject() {
        this.observerList = new ArrayList<>();
    }

    public final void addObserver(final IObserver<T> ob) {
        observerList.add(ob);
    }

    public final void deleteObserver(final IObserver<T> ob) {
        observerList.remove(ob);
    }

    protected final void notifyObservers() {
        for (final var ob : observerList)
            ob.update(getType());
    }

    protected abstract T getType();
}
