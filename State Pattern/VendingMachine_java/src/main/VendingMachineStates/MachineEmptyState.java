package main.VendingMachineStates;

import main.VendingMachine;

public class MachineEmptyState extends AVendingMachineState {
    public MachineEmptyState(final VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public AVendingMachineState fillInventory() {
        return new WaitingForCoinState(this.vendingMachine);
    }

    @Override
    public AVendingMachineState insertCoin() {
        return this;
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
