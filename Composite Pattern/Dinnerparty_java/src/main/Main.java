package main;

import main.Ressourcen.Composites.AComposite;
import main.Ressourcen.Composites.DinnerSets.BirthdayDinner;
import main.Ressourcen.Composites.DinnerSets.CandlelightDinner;
import main.Ressourcen.IValuable;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final var df = new DecimalFormat("#.##");
        final ArrayList<IValuable> sets = new ArrayList<>();
        sets.add(new BirthdayDinner());
        sets.add(new CandlelightDinner());

        sets.forEach(set -> {
            display(set, df);
            System.out.println("\n");
        });
    }

    private static String getClassName(final Object obj) {
        var name = obj.getClass().getName().split("\\.");
        return name[name.length - 1];
    }

    private static void display(final IValuable item, final DecimalFormat df) {
        System.out.println("Item: " + getClassName(item));
        System.out.println("Price: " + df.format(item.getPrice()));
        if (item instanceof AComposite) {
            System.out.println("Components of " + getClassName(item) + ":");
            ((AComposite) item).getComponents().forEach(component -> display(component, df));
        }
    }
}
