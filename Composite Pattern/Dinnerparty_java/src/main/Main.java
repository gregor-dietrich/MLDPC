package main;

import main.Ressourcen.Composites.AComposite;
import main.Ressourcen.IValuable;
import main.Ressourcen.Composites.DinnerSets.BirthdayDinner;
import main.Ressourcen.Composites.DinnerSets.CandlelightDinner;

import java.awt.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class Main {
    private static String getClassName(final Object obj) {
        var name = obj.getClass().getName().split("\\.");
        return name[name.length - 1];
    }

    public static void main(String[] args) {
        final ArrayList<AComposite> sets = new ArrayList<>();
        //final ArrayList<IValuable> sets = new ArrayList<>();
        sets.add(new BirthdayDinner());
        sets.add(new CandlelightDinner());

        sets.forEach(set -> {
            System.out.println(getClassName(set));
            System.out.println("> Sum: " + set.getPrice());
            System.out.println("> Components:");
            //((AComposite) set).getComponents().forEach(component -> {
            set.getComponents().forEach(component -> {
                System.out.println(">> " + getClassName(component) + " (" + component.getPrice() + ")");
                if (component instanceof AComposite) {
                    System.out.println(">>> Sub-Components:");
                    for (var subcomponent : ((AComposite) component).getComponents())
                        System.out.println(">>>> " + getClassName(subcomponent) + " (" + subcomponent.getPrice() + ")");
                    System.out.println();
                }
            });
            System.out.println("\n");
        });
    }
}
