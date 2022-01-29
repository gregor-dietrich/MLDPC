package main.SignificantOtherStates;

public final class SignificantOtherHappyState implements ISignificantOtherState {
    @Override
    public ISignificantOtherState annoy() {
        System.out.println("Your significant other is annoyed.");
        return new SignificantOtherAnnoyedState();
    }

    @Override
    public ISignificantOtherState kiss() {
        System.out.println("Your significant other is already in a happy mood.");
        return this;
    }

    @Override
    public ISignificantOtherState talk() {
        System.out.println("Your significant other replies and giggles.");
        return this;
    }
}
