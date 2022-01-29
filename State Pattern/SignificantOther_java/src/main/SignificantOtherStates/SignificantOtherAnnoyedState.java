package main.SignificantOtherStates;

public final class SignificantOtherAnnoyedState implements ISignificantOtherState {
    @Override
    public ISignificantOtherState annoy() {
        System.out.println("Your significant other is already annoyed.");
        return this;
    }

    @Override
    public ISignificantOtherState kiss() {
        System.out.println("Your significant other is in a neutral mood.");
        return new SignificantOtherNeutralState();
    }

    @Override
    public ISignificantOtherState talk() {
        System.out.println("Your significant other ignores you.");
        return this;
    }
}
