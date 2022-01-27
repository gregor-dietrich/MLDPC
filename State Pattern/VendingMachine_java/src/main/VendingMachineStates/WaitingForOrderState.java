package main.VendingMachineStates;

import main.VendingMachine;

public class WaitingForOrderState extends AVendingMachineState {
    public WaitingForOrderState(final VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public AVendingMachineState fillInventory() {
        return this;
    }

    @Override
    public AVendingMachineState insertCoin() {
        return this;
    }

    @Override
    public AVendingMachineState returnCoin() {
        return new WaitingForCoinState(this.vendingMachine);
    }

    @Override
    public AVendingMachineState orderProduct() {
        this.vendingMachine.setStock(this.vendingMachine.getStock() - 1);
        return this.vendingMachine.getStock() > 0 ?
                new WaitingForCoinState(this.vendingMachine) : new MachineEmptyState(this.vendingMachine);
    }
}
