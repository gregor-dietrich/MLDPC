package main;

import main.Car;
import main.CarFactory;

public class Main {
    public static void main(String[] args) {
        // Factories instanziieren
        var kombiFactory = new CarFactory(CarFactory.carType.KOMBI);
        var limoFactory = new CarFactory(CarFactory.carType.LIMO);

        // Einen blauen Kombi bauen
        Car blueKombi = kombiFactory.orderCar(CarFactory.carColor.BLUE);

        // Eine rote Limousine bauen
        Car redLimo = limoFactory.orderCar(CarFactory.carColor.RED);
    }
}
