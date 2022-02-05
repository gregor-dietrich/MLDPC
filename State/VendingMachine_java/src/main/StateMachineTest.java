package main;

import main.VendingMachineStates.MachineEmptyState;
import main.VendingMachineStates.WaitingForCoinState;
import main.VendingMachineStates.WaitingForOrderState;

public class StateMachineTest {

    public static void main(String[] args) {
        final var vendingMachine = new VendingMachine();
        // MachineEmptyState
        if (!(vendingMachine.getCurrentState() instanceof MachineEmptyState)) throw new AssertionError();
        vendingMachine.orderProduct(); // Nothing happened
        vendingMachine.returnCoin(); // Nothing happened
        vendingMachine.insertCoin(new Coin()); // Nothing happened
        vendingMachine.restock(); // Restocked machine
        // WaitingForCoinState
        if (!(vendingMachine.getCurrentState() instanceof WaitingForCoinState)) throw new AssertionError();
        vendingMachine.restock(); // Nothing happened
        vendingMachine.orderProduct(); // Nothing happened
        vendingMachine.returnCoin(); // Nothing happened
        vendingMachine.insertCoin(new Coin()); // Coin inserted
        // WaitingForOrderState
        if (!(vendingMachine.getCurrentState() instanceof WaitingForOrderState)) throw new AssertionError();
        vendingMachine.insertCoin(new Coin()); // Nothing happened
        vendingMachine.restock(); // Nothing happened
        vendingMachine.returnCoin(); // Coin returned
        // WaitingForCoinState
        if (!(vendingMachine.getCurrentState() instanceof WaitingForCoinState)) throw new AssertionError();
        vendingMachine.insertCoin(new Coin()); // Coin inserted
        // WaitingForOrderState
        if (!(vendingMachine.getCurrentState() instanceof WaitingForOrderState)) throw new AssertionError();
        vendingMachine.orderProduct(); // Product ordered
        System.out.println(vendingMachine.getStock()); // 99
        vendingMachine.restock(); // Nothing happened
        while (vendingMachine.getStock() > 0) {
            vendingMachine.insertCoin(new Coin());
            // WaitingForOrderState
            if (!(vendingMachine.getCurrentState() instanceof WaitingForOrderState)) throw new AssertionError();
            vendingMachine.orderProduct();
            // WaitingForCoinState || MachineEmptyState
            if (!(vendingMachine.getCurrentState() instanceof WaitingForCoinState)
                    && !(vendingMachine.getCurrentState() instanceof MachineEmptyState)) throw new AssertionError();
        }
        // MachineEmptyState
        if (!(vendingMachine.getCurrentState() instanceof MachineEmptyState)) throw new AssertionError();
        vendingMachine.insertCoin(new Coin()); // Nothing happened
        vendingMachine.orderProduct(); // Nothing happened
        vendingMachine.returnCoin(); // Nothing happened
        vendingMachine.restock(); // Restocked machine
        // WaitingForCoinState
        if (!(vendingMachine.getCurrentState() instanceof WaitingForCoinState)) throw new AssertionError();
    }
}
