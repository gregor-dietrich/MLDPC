package main;

import main.CarFactory.ACarFactory;

public class Main {

    public static void main(String[] args) {
        final var vendor = new CarVendor();
        vendor.orderCar(CarVendor.carType.KOMBI, ACarFactory.carColor.RED);
        vendor.orderCar(CarVendor.carType.LIMO, ACarFactory.carColor.BLACK);

        vendor.showCars();

        final var myCar = vendor.sellCar(0);
        System.out.println("My Car: " + myCar);
        myCar.display();

        vendor.showCars();
    }
}
