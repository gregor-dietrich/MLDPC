package main;

public class Main {
    public static void main(String[] args) {
        var first = Unsterblicher.getInstance();
        var second = Unsterblicher.getInstance();

        if (first == second)
            System.out.println("Es kann nur einen geben.");
    }
}
