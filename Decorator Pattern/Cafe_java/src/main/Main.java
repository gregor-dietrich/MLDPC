package main;

import main.Beverages.DecaffeinatedBlend;
import main.Beverages.EspressoBlend;
import main.Beverages.ProprietaryBlend;
import main.Ingredients.Milk;
import main.Ingredients.Sugar;

public class Main {

    public static void main(String[] args) {
        final var justPlainCoffee = new ProprietaryBlend();
        final var espressoWithMilk = new Milk(new EspressoBlend());
        final var decafWithMilkAndSugar = new Sugar(new Milk(new DecaffeinatedBlend()));
        System.out.println(justPlainCoffee);
        System.out.println(justPlainCoffee.getPrice());
        System.out.println(espressoWithMilk);
        System.out.println(espressoWithMilk.getPrice());
        System.out.println(decafWithMilkAndSugar);
        System.out.println(decafWithMilkAndSugar.getPrice());
    }
}
