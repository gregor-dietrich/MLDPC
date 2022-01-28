package main.VendingMachineStates;

import main.Coin;

public class WaitingForCoinState implements AVendingMachineState {
    @Override
    public AVendingMachineState restock() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public AVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Coin inserted.");
        return new WaitingForOrderState();
    }

    @Override
    public AVendingMachineState returnCoin() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public AVendingMachineState orderProduct() {
        System.out.println("Nothing happened.");
        return this;
    }
}
