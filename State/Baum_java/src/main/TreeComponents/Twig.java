package main.TreeComponents;

import main.TreeComponents.LeafStates.LeafGreenHealthyState;
import main.TreeComponents.LeafStates.LeafGreenSickState;
import main.TreeComponents.LeafStates.LeafYellowHealthyState;
import main.TreeComponents.LeafStates.LeafYellowSickState;

import java.util.ArrayList;
import java.util.Random;

public final class Twig implements ITreeComponent {
    private final ArrayList<Leaf> leaves;

    public Twig() {
        this.leaves = new ArrayList<>();
        final var rand = new Random();
        for (int i = 0; i < rand.nextInt(10) + 1; i++)
            this.addLeaf(new Leaf());
    }

    @Override
    public void applyWind(final int windIntensity) {
        final var removalList = new ArrayList<Leaf>();
        leaves.forEach(leaf -> {
            if (leaf.getCurrentState() instanceof LeafGreenHealthyState && windIntensity > 2
                    || (leaf.getCurrentState() instanceof LeafGreenSickState
                    || leaf.getCurrentState() instanceof LeafYellowHealthyState) && windIntensity > 1
                    || leaf.getCurrentState() instanceof LeafYellowSickState && windIntensity > 0) {
                System.out.println(this + " lost " + leaf + ".");
                removalList.add(leaf);
            } else
                leaf.applyWind(windIntensity);
        });
        for (final var item : removalList)
            this.removeLeaf(item);
    }

    @Override
    public int getContactSurface() {
        return leaves.stream().mapToInt(Leaf::getContactSurface).sum();
    }

    public void addLeaf(final Leaf leaf) {
        this.leaves.add(leaf);
    }

    private void removeLeaf(final Leaf leaf) {
        this.leaves.remove(leaf);
    }
}
