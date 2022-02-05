package main.Abteilung;

import java.util.ArrayList;

public final class Manager implements IPerson {
    private final ArrayList<IPerson> subordinates;
    private String name;

    public Manager() {
        this(new ArrayList<>());
    }

    public Manager(final ArrayList<IPerson> subordinates) {
        this.setName("N/A");
        this.subordinates = subordinates;
    }

    @Override
    public int getSubordinateCount() {
        int count = 0;
        for (var subordinate : subordinates) {
            count = subordinate instanceof Manager ? count + 1 : count;
            /* line above is equivalent to:
            if (subordinate instanceof Manager)
                count += 1;
            */
            count += subordinate.getSubordinateCount();
        }
        return count;
    }

    @Override
    public String toString() {
        var list = new StringBuilder();
        // list.append(super.toString() + " - Subordinates (" + this.getSubordinateCount() + "):\n");
        list.append(this.getName() + " - Subordinates (" + this.getSubordinateCount() + "):\n");
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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
