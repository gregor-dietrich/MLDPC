package main.subject;

import main.observer.IObserver;

import java.util.ArrayList;

public abstract class ASubject<T> {
    private ArrayList<IObserver<T>> observerList;

    public ASubject() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(IObserver<T> ob)
    {
        observerList.add(ob);
    }

    public void deleteObserver(IObserver<T> ob)
    {
        observerList.remove(ob);
    }

    protected void notifyObservers() {
        for (var ob: observerList)
            ob.update(getType());
    }

    protected abstract T getType();
}
