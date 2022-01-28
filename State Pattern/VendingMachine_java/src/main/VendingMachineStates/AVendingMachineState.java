package main.VendingMachineStates;

import main.Coin;
import main.VendingMachine;

public abstract class AVendingMachineState {
    protected VendingMachine vendingMachine;

    public AVendingMachineState(final VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract AVendingMachineState restock();

    public abstract AVendingMachineState insertCoin(final Coin coin);

    public abstract AVendingMachineState returnCoin();

    public abstract AVendingMachineState orderProduct();
}
