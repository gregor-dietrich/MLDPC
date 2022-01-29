package main.VendingMachineStates;

import main.Coin;

public final class WaitingForOrderState implements IVendingMachineState {
    @Override
    public IVendingMachineState restock() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public IVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public IVendingMachineState returnCoin() {
        System.out.println("Coin returned.");
        return new WaitingForCoinState();
    }

    @Override
    public IVendingMachineState orderProduct() {
        System.out.println("Product ordered.");
        return new WaitingForCoinState();
    }
}
