package main;

public class Main {
    public static void main(String[] args) {
        final var first = Unsterblicher.getInstance();
        final var second = Unsterblicher.getInstance();

        if (first == second)
            System.out.println("Es kann nur einen geben.");
    }
}
