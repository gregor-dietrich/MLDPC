package main.VendingMachineStates;

import main.Coin;
import main.VendingMachine;

public class WaitingForOrderState extends AVendingMachineState {
    public WaitingForOrderState(final VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public AVendingMachineState restock() {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public AVendingMachineState insertCoin(final Coin coin) {
        System.out.println("Nothing happened.");
        return this;
    }

    @Override
    public AVendingMachineState returnCoin() {
        System.out.println("Coin returned.");
        return new WaitingForCoinState(this.vendingMachine);
    }

    @Override
    public AVendingMachineState orderProduct() {
        System.out.println("Product ordered.");
        this.vendingMachine.setStock(this.vendingMachine.getStock() - 1);
        return this.vendingMachine.getStock() > 0 ?
                new WaitingForCoinState(this.vendingMachine) : new MachineEmptyState(this.vendingMachine);
    }
}
