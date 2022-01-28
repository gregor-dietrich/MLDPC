package main.VendingMachineStates;

import main.VendingMachine;

public class MachineEmptyState extends AVendingMachineState {
    public MachineEmptyState(final VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public AVendingMachineState restock() {
        System.out.println("Restocked machine.");
        this.vendingMachine.setStock(100);
        return new WaitingForCoinState(this.vendingMachine);
    }

    @Override
    public AVendingMachineState insertCoin() {
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
