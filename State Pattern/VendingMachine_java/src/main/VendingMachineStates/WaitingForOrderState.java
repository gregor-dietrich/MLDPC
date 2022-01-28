package main.VendingMachineStates;

import main.Coin;

public class WaitingForOrderState implements AVendingMachineState {
    @Override
    public AVendingMachineState restock() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public AVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public AVendingMachineState returnCoin() {
        System.out.println("Coin returned.");
        return new WaitingForCoinState();
    }

    @Override
    public AVendingMachineState orderProduct() {
        System.out.println("Product ordered.");
        return new WaitingForCoinState();
    }
}
