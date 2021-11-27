package main;

public class Main {
    public static void main(String[] args) {
        // Factories instanziieren
        final var kombiFactory = new CarFactory(CarFactory.carType.KOMBI);
        final var limoFactory = new CarFactory(CarFactory.carType.LIMO);

        // Einen blauen Kombi bauen
        final Car blueKombi = kombiFactory.orderCar(CarFactory.carColor.BLUE);

        // Eine rote Limousine bauen
        final Car redLimo = limoFactory.orderCar(CarFactory.carColor.RED);
    }
}
