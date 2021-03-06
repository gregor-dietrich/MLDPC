package main;

import main.Lego.ILego;
import main.Lego.LegoComposition;
import main.Lego.LegoPiece;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // required for Variants 1 & 2
        final ArrayList<ILego> components = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            final var rngComposition = new LegoComposition();
            for (int j = 0; j < 100; j++)
                rngComposition.addPiece(new LegoPiece("grey", 1, 1));
            components.add(rngComposition);
        }

        // Variant 1
        final var legoDeathStar = new LegoComposition(components);

        /* Variant 2
        final var legoDeathStar = new LegoComposition();
        for (final var component : components)
            legoDeathStar.addPiece(component);
        */

        /* Variant 3
        final var legoDeathStar = new LegoComposition();
        for (int i = 0; i < 100; i++) {
            final var rngComposition = new LegoComposition();
            for (int j = 0; j < 100; j++)
                rngComposition.addPiece(new LegoPiece("grey", 1, 1));
            legoDeathStar.addPiece(LegoComposition);
        }
        */

        // Output
        System.out.print(legoDeathStar.getPrice());
    }
}
