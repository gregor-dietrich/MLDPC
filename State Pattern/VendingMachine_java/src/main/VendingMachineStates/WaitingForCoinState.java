package main.VendingMachineStates;

import main.Coin;
import main.VendingMachine;

public class WaitingForCoinState extends AVendingMachineState {
    public WaitingForCoinState(final VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public AVendingMachineState restock() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public AVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Coin inserted.");
        return new WaitingForOrderState(this.vendingMachine);
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
