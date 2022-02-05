package main.VendingMachineStates;

import main.Coin;

public interface IVendingMachineState {
    IVendingMachineState restock();

    IVendingMachineState insertCoin(final Coin coin);

    IVendingMachineState returnCoin();

    IVendingMachineState orderProduct();
}
