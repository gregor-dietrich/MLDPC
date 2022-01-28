package main.VendingMachineStates;

import main.Coin;

public interface AVendingMachineState {
    AVendingMachineState restock();

    AVendingMachineState insertCoin(final Coin coin);

    AVendingMachineState returnCoin();

    AVendingMachineState orderProduct();
}
