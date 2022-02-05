package main.SignificantOtherStates;

public final class SignificantOtherNeutralState implements ISignificantOtherState {
    @Override
    public ISignificantOtherState annoy() {
        System.out.println("Your significant other is annoyed.");
        return new SignificantOtherAnnoyedState();
    }

    @Override
    public ISignificantOtherState kiss() {
        System.out.println("Your significant other is in a happy mood.");
        return new SignificantOtherHappyState();
    }

    @Override
    public ISignificantOtherState talk() {
        System.out.println("Your significant other replies.");
        return this;
    }
}
