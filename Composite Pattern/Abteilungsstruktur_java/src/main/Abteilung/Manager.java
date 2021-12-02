package main.Abteilung;

import java.util.ArrayList;

public final class Manager extends APerson {
    private final ArrayList<APerson> mitarbeiter;

    public Manager() {
        this.mitarbeiter = new ArrayList<>();
    }

    public Manager(ArrayList<APerson> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    @Override
    public int getAnzahlMitarbeiter() {
        return this.getMitarbeiter().size();
    }

    @Override
    public String toString() {
        var list = new StringBuilder();
        for (var m : mitarbeiter) {
            list.append(m.getClass().getName());
            if (mitarbeiter.indexOf(m) != (mitarbeiter.size() - 1))
                list.append(", ");
        }
        return list.toString();
    }

    public boolean addMitarbeiter(Mitarbeiter piece) {
        return this.getMitarbeiter().add(piece);
    }

    private boolean removeMitarbeiter(Mitarbeiter piece) {
        return this.getMitarbeiter().remove(piece);
    }

    public ArrayList<APerson> getMitarbeiter() {
        return mitarbeiter;
    }
}
