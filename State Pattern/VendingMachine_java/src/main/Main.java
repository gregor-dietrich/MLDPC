package main;

public class Main {

    public static void main(String[] args) {
        final var vendingMachine = new VendingMachine();
        // MachineEmptyState
        vendingMachine.orderProduct(); // Nothing happened
        vendingMachine.returnCoin(); // Nothing happened
        vendingMachine.insertCoin(); // Nothing happened
        vendingMachine.restock(); // Restocked machine
        // WaitingForCoinState
        vendingMachine.restock(); // Nothing happened
        vendingMachine.orderProduct(); // Nothing happened
        vendingMachine.returnCoin(); // Nothing happened
        vendingMachine.insertCoin(); // Coin inserted
        // WaitingForOrderState
        vendingMachine.insertCoin(); // Nothing happened
        vendingMachine.restock(); // Nothing happened
        vendingMachine.returnCoin(); // Coin returned
        // WaitingForCoinState
        vendingMachine.insertCoin(); // Coin inserted
        // WaitingForOrderState
        vendingMachine.orderProduct(); // Product ordered
        System.out.println(vendingMachine.getStock()); // 99
        vendingMachine.restock(); // Nothing happened
        while (vendingMachine.getStock() > 0) {
            vendingMachine.insertCoin();
            vendingMachine.orderProduct();
        }
        // MachineEmptyState
        vendingMachine.insertCoin(); // Nothing happened
        vendingMachine.orderProduct(); // Nothing happened
        vendingMachine.returnCoin(); // Nothing happened
        vendingMachine.restock(); // Restocked machine
        // WaitingForCoinState
    }
}
