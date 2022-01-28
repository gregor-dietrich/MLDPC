package main.VendingMachineStates;

import main.Coin;

public class WaitingForCoinState implements IVendingMachineState {
    @Override
    public IVendingMachineState restock() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public IVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Coin inserted.");
        return new WaitingForOrderState();
    }

    @Override
    public IVendingMachineState returnCoin() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public IVendingMachineState orderProduct() {
        System.out.println("Nothing happened.");
        return this;
    }
}
