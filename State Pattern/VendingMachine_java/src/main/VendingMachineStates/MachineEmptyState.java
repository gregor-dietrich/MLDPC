package main.VendingMachineStates;

import main.Coin;

public class MachineEmptyState implements IVendingMachineState {
    @Override
    public IVendingMachineState restock() {
        System.out.println("Restocked machine.");
        return new WaitingForCoinState();
    }

    @Override
    public IVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Nothing happened.");
        return this;
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
