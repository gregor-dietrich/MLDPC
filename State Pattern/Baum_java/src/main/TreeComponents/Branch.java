package main.TreeComponents;

import java.util.ArrayList;
import java.util.Random;

public final class Branch implements ITreeComponent {
    private final ArrayList<Twig> twigs;

    public Branch() {
        this.twigs = new ArrayList<>();
        final var rand = new Random();
        for (int i = 0; i < rand.nextInt(10) + 1; i++)
            this.addTwig(new Twig());
    }

    @Override
    public void applyWind(final int windIntensity) {
        final var removalList = new ArrayList<Twig>();
        twigs.forEach(twig -> {
            if (twig.getContactSurface() > 75 && windIntensity > 2
                    || twig.getContactSurface() > 50 && windIntensity > 1
                    || twig.getContactSurface() > 25 && windIntensity > 0) {
                System.out.println(this + " lost " + twig + ".");
                removalList.add(twig);
            } else
                twig.applyWind(windIntensity);
        });
        for (final var item : removalList)
            this.removeTwig(item);
    }

    @Override
    public int getContactSurface() {
        return twigs.stream().mapToInt(Twig::getContactSurface).sum();
    }

    public void addTwig(final Twig twig) {
        this.twigs.add(twig);
    }

    private void removeTwig(final Twig twig) {
        this.twigs.remove(twig);
    }
}
