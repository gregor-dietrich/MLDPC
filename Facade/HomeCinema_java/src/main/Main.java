package main;

public class Main {

    public static void main(String[] args) {
        final var facade = new HomeCinema();

        facade.playMovie("Avengers: Infinity War");
        facade.stopMovie();

        facade.playCD("The Best of Led Zeppelin");
        facade.stopCD();

        facade.playRadio(106.4);
        facade.stopRadio();
    }
}
