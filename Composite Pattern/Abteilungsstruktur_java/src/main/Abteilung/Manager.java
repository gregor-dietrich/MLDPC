package main.Abteilung;

import java.util.ArrayList;

public final class Manager implements IPerson {
    private final ArrayList<IPerson> subordinates;

    public Manager() {
        this.subordinates = new ArrayList<>();
    }

    public Manager(final ArrayList<IPerson> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public int getSubordinateCount() {
        return this.getSubordinates().size();
    }

    @Override
    public String toString() {
        var list = new StringBuilder();
        list.append(super.toString() + " - Subordinates:\n");
        for (var m : subordinates) {
            list.append(m.toString());
            if (subordinates.indexOf(m) != (subordinates.size() - 1))
                list.append("\n");
        }
        list.append("\n");
        return list.toString();
    }

    public boolean addSubordinate(final IPerson p) {
        return this.getSubordinates().add(p);
    }

    public boolean removeSubordinate(final IPerson p) {
        return this.getSubordinates().remove(p);
    }

    public ArrayList<IPerson> getSubordinates() {
        return subordinates;
    }
}
