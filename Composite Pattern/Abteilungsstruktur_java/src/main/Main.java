package main;

import main.Abteilung.IPerson;
import main.Abteilung.Manager;
import main.Abteilung.Subordinate;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // required for Variants 1 & 2
        final ArrayList<IPerson> departmentHeads = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            final var manager = new Manager();
            manager.setName("Manager #" + (i + 1));
            for (int j = 0; j < (i + 2); j++)
                manager.addSubordinate(new Subordinate());
            departmentHeads.add(manager);
        }

        // Variant 1
        final var ceo = new Manager(departmentHeads);

        /* Variant 2
        final var ceo = new Manager();
        for (final var dh : departmentHeads)
            ceo.addSubordinate(dh);
        */

        /* Variant 3
        final var ceo = new Manager();
        for (int i = 0; i < 3; i++) {
            final var manager = new Manager();
            manager.setName("Manager #" + (i + 1));
            for (int j = 0; j < (i + 2); j++)
                manager.addSubordinate(new Subordinate());
            ceo.addSubordinate(manager);
        }
        */

        ceo.setName("CEO");

        // Output (implicit call -> ceo.toString())
        System.out.print(ceo);
    }
}
