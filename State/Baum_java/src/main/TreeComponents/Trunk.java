package main.TreeComponents;

import java.util.ArrayList;
import java.util.Random;

public final class Trunk implements ITreeComponent {
    private final ArrayList<Branch> branches;

    public Trunk() {
        this.branches = new ArrayList<>();
        final var rand = new Random();
        for (int i = 0; i < rand.nextInt(10) + 1; i++)
            this.addBranch(new Branch());
    }

    @Override
    public void applyWind(final int windIntensity) {
        final var removalList = new ArrayList<Branch>();
        branches.forEach(branch -> {
            if (branch.getContactSurface() > 300 && windIntensity > 2
                    || branch.getContactSurface() > 200 && windIntensity > 1
                    || branch.getContactSurface() > 100 && windIntensity > 0) {
                System.out.println(this + " lost " + branch + ".");
                removalList.add(branch);
            } else
                branch.applyWind(windIntensity);
        });
        for (final var item : removalList)
            this.removeBranch(item);
    }

    @Override
    public int getContactSurface() {
        return branches.stream().mapToInt(Branch::getContactSurface).sum();
    }

    public void addBranch(final Branch branch) {
        this.branches.add(branch);
    }

    private void removeBranch(final Branch branch) {
        this.branches.remove(branch);
    }
}
