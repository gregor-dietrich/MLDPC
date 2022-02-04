package main;

import main.VendingMachineStates.IVendingMachineState;
import main.VendingMachineStates.MachineEmptyState;
import main.VendingMachineStates.WaitingForOrderState;

public final class VendingMachine {
    private IVendingMachineState currentState;
    private int stock;

    public VendingMachine() {
        this.setStock(0);
        this.currentState = new MachineEmptyState();
    }

    public void restock() {
        System.out.println("Attempting to restock...");
        if (this.getStock() <= 0 && this.currentState instanceof MachineEmptyState)
            this.setStock(100);
        this.currentState = currentState.restock();
    }

    public void insertCoin(final Coin coin) {
        System.out.println("Attempting to insert coin...");
        this.currentState = currentState.insertCoin(coin);
    }

    public void returnCoin() {
        System.out.println("Attempting to return coin...");
        this.currentState = currentState.returnCoin();
    }

    public void orderProduct() {
        System.out.println("Attempting to order product ...");
        if (this.getStock() > 0 && this.currentState instanceof WaitingForOrderState)
            this.setStock(this.getStock() - 1);
        this.currentState = currentState.orderProduct();
        this.currentState = this.getStock() > 0 ? this.currentState : new MachineEmptyState();
    }

    public int getStock() {
        return stock;
    }

    private void setStock(final int stock) {
        this.stock = Math.max(stock, 0);
    }

    public IVendingMachineState getCurrentState() {
        return this.currentState;
    }
}
