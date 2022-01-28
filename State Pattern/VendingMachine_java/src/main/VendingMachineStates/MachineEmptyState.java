package main.VendingMachineStates;

import main.Coin;

public class MachineEmptyState implements AVendingMachineState {
    @Override
    public AVendingMachineState restock() {
        System.out.println("Restocked machine.");
        return new WaitingForCoinState();
    }

    @Override
    public AVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Nothing happened.");
        return this;
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
