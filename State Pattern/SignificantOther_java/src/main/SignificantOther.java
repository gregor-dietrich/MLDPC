package main;

import main.SignificantOtherStates.ISignificantOtherState;
import main.SignificantOtherStates.SignificantOtherHappyState;

public final class SignificantOther {
    private ISignificantOtherState currentState;

    SignificantOther() {
        this.currentState = new SignificantOtherHappyState();
        System.out.println("Your significant other is in a happy mood.");
    }

    public void annoy() {
        System.out.println("Annoying your significant other...");
        this.currentState = currentState.annoy();
    }

    public void kiss() {
        System.out.println("Kissing your significant other...");
        this.currentState = currentState.kiss();
    }

    public void talk() {
        System.out.println("Talking to your significant other...");
        this.currentState = currentState.talk();
    }

    public ISignificantOtherState getCurrentState() {
        return currentState;
    }
}
