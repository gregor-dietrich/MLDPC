package main;

import main.SignificantOtherStates.SignificantOtherAnnoyedState;
import main.SignificantOtherStates.SignificantOtherHappyState;
import main.SignificantOtherStates.SignificantOtherNeutralState;

public class StateMachineTest {

    public static void main(String[] args) {
        final var significantOther = new SignificantOther();
        // SignificantOtherHappyState
        if (!(significantOther.getCurrentState() instanceof SignificantOtherHappyState)) throw new AssertionError();
        significantOther.talk();
        significantOther.annoy();
        // SignificantOtherAnnoyedState
        if (!(significantOther.getCurrentState() instanceof SignificantOtherAnnoyedState)) throw new AssertionError();
        significantOther.talk();
        significantOther.kiss();
        // SignificantOtherNeutralState
        if (!(significantOther.getCurrentState() instanceof SignificantOtherNeutralState)) throw new AssertionError();
        significantOther.talk();
        significantOther.annoy();
        // SignificantOtherAnnoyedState
        if (!(significantOther.getCurrentState() instanceof SignificantOtherAnnoyedState)) throw new AssertionError();
        significantOther.kiss();
        // SignificantOtherNeutralState
        if (!(significantOther.getCurrentState() instanceof SignificantOtherNeutralState)) throw new AssertionError();
        significantOther.kiss();
        // SignificantOtherHappyState
        if (!(significantOther.getCurrentState() instanceof SignificantOtherHappyState)) throw new AssertionError();
        significantOther.talk();
    }
}
