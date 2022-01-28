package main;

import main.VendingMachineStates.AVendingMachineState;
import main.VendingMachineStates.MachineEmptyState;

public final class VendingMachine {
    private AVendingMachineState currentState;
    private int stock;

    public VendingMachine() {
        this.setStock(0);
        this.currentState = new MachineEmptyState(this);
    }

    public void restock() {
        System.out.println("Attempting to restock...");
        this.currentState = currentState.restock();
    }

    public void insertCoin() {
        System.out.println("Attempting to insert coin...");
        this.currentState = currentState.insertCoin();
    }

    public void returnCoin() {
        System.out.println("Attempting to return coin...");
        this.currentState = currentState.returnCoin();
    }

    public void orderProduct() {
        System.out.println("Attempting to order product ...");
        this.currentState = currentState.orderProduct();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public AVendingMachineState getCurrentState() {
        return this.currentState;
    }
}
