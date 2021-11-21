package main;

import main.CarFactory.ACarFactory;
import main.CarFactory.Car;
import main.CarFactory.KombiCarFactory;
import main.CarFactory.LimoCarFactory;

import java.util.ArrayList;

public class CarVendor {
    private final ArrayList<Car> cars = new ArrayList<>();
    private final ArrayList<ACarFactory> factories = new ArrayList<>();

    public enum carType { KOMBI, LIMO }

    public CarVendor() {
        this.factories.add(new KombiCarFactory());
        this.factories.add(new LimoCarFactory());
    }

    public void orderCar(final carType t, ACarFactory.carColor color) {
        System.out.println("Car has been ordered...");
        var door = factories.get(t.ordinal()).createDoor(color);
        var hood = factories.get(t.ordinal()).createHood(color);
        var lid = factories.get(t.ordinal()).createLid(color);
        var wing = factories.get(t.ordinal()).createWing(color);
        System.out.println("Parts have been built...");
        this.cars.add(new Car(door, hood, lid, wing));
        System.out.println("Car has been assembled.");
        System.out.println();
    }

    public Car sellCar(final int index) {
        var car = this.cars.get(index);
        this.cars.remove(index);
        System.out.println("Car has been sold: " + car);
        System.out.println();
        return car;
    }

    public void showCars() {
        System.out.println("Vendor has " + cars.size() + " car(s) in stock.");
        for (var car : this.cars) {
            System.out.println("Vendor Car #" + (cars.indexOf(car) + 1) + ": " + car);
            car.display();
        }
    }
}
