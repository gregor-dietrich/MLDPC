package main;

import java.util.ArrayList;

public abstract class ASubject {
    private ArrayList<IObserver> observerList = new ArrayList<>();
    private boolean changedFlag = false;

    public void setChanged(boolean newChanged) { this.changedFlag = newChanged; }

    public void addObserver(IObserver ob)
    {
        observerList.add(ob);
    }

    public void deleteObserver(IObserver ob)
    {
        observerList.remove(ob);
    }

    protected void notifyObservers() {
        if (!changedFlag)
            return;
        for (var ob: observerList)
        {
            ob.update(this);
        }
        this.setChanged(false);
    }
}
