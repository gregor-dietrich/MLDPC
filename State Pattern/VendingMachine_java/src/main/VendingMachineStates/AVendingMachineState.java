package main.VendingMachineStates;

import main.VendingMachine;

public abstract class AVendingMachineState {
    protected VendingMachine vendingMachine;

    public AVendingMachineState(final VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract AVendingMachineState restock();

    public abstract AVendingMachineState insertCoin();

    public abstract AVendingMachineState returnCoin();

    public abstract AVendingMachineState orderProduct();
}
