package main;

import main.Beverages.DecaffeinatedBlend;
import main.Beverages.EspressoBlend;
import main.Beverages.ProprietaryBlend;
import main.Ingredients.Milk;
import main.Ingredients.Sugar;

public class Main {

    public static void main(String[] args) {
        var justCoffee = new ProprietaryBlend();
        var withMilk = new Milk(new EspressoBlend());
        var andSugar = new Sugar(new Milk(new DecaffeinatedBlend()));
        System.out.println(justCoffee);
        System.out.println(justCoffee.getPrice());
        System.out.println(withMilk);
        System.out.println(withMilk.getPrice());
        System.out.println(andSugar);
        System.out.println(andSugar.getPrice());
    }
}
