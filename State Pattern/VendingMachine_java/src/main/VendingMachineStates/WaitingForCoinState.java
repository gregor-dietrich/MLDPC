package main.VendingMachineStates;

import main.VendingMachine;

public class WaitingForCoinState extends AVendingMachineState {
    public WaitingForCoinState(final VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public AVendingMachineState fillInventory() {
        return this;
    }

    @Override
    public AVendingMachineState insertCoin() {
        return new WaitingForOrderState(this.vendingMachine);
    }

    @Override
    public AVendingMachineState returnCoin() {
        return this;
    }

    @Override
    public AVendingMachineState orderProduct() {
        return this;
    }
}
