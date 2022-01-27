package main;

import main.VendingMachineStates.AVendingMachineState;
import main.VendingMachineStates.MachineEmptyState;

public final class VendingMachine {
    private AVendingMachineState currentState;
    private int stock;

    public VendingMachine(int stock) {
        this.setStock(0);
        this.currentState = new MachineEmptyState(this);
    }

    public void fillInventory() {
        this.currentState = currentState.fillInventory();
    }

    public void insertCoin() {
        this.currentState = currentState.insertCoin();
    }

    public void returnCoin() {
        this.currentState = currentState.returnCoin();
    }

    public void pullLever() {
        this.currentState = currentState.orderProduct();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
