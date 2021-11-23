package main.Pizzeria.Pizza;

import main.Pizzeria.Pizza.Cheese.ACheese;
import main.Pizzeria.Pizza.Dough.ADough;
import main.Pizzeria.Pizza.Toppings.ATopping;

import java.util.ArrayList;

public final class Pizza {
    private boolean prepared;
    private boolean baked;
    private boolean cut;

    private ADough dough;
    private ACheese cheese;
    private ArrayList<ATopping> toppings;

    public Pizza(ADough dough, ACheese cheese) {
        this.setDough(dough);
        this.setCheese(cheese);
        this.toppings = new ArrayList<>();
        this.setPrepared(false);
        this.setBaked(false);
        this.setCut(false);
    }

    public void prepare() {
        if (!this.isPrepared()) {
            this.setPrepared(true);
            System.out.println("Preparing...");
        }
    }

    public void bake() {
        if (this.isPrepared() && !this.isBaked()) {
            this.setBaked(true);
            System.out.println("Baking...");
        }
    }

    public void cut() {
        if (this.isPrepared() && this.isBaked() && !this.isCut()) {
            this.setCut(true);
            System.out.println("Cutting...");
        }
    }

    public boolean isPrepared() {
        return prepared;
    }

    private void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public boolean isBaked() {
        return baked;
    }

    private void setBaked(boolean baked) {
        this.baked = baked;
    }

    public boolean isCut() {
        return cut;
    }

    private void setCut(boolean cut) {
        this.cut = cut;
    }

    public ADough getDough() {
        return dough;
    }

    private void setDough(ADough dough) {
        if (dough != null)
            this.dough = dough;
        else
            throw new IllegalStateException("Parameter dough must not be null.");
    }

    public ACheese getCheese() {
        return cheese;
    }

    private void setCheese(ACheese cheese) {
        if (cheese != null)
            this.cheese = cheese;
        else
            throw new IllegalStateException("Parameter cheese must not be null.");
    }

    public ArrayList<ATopping> getToppings() {
        return toppings;
    }

    public void addTopping(ATopping topping) {
        if (this.isPrepared() && !this.isBaked())
            if (topping != null)
                if (this.toppings.add(topping))
                    System.out.println("Added: " + topping.getClassName());
            else
                throw new IllegalStateException("Parameter topping must not be null.");
    }

    public void removeTopping(ATopping topping) {
        if (this.isPrepared() && !this.isBaked())
            if (topping != null)
                if (this.toppings.remove(topping))
                    System.out.println("Removed: " + topping.getClassName());
            else
                throw new IllegalStateException("Parameter topping must not be null.");
    }

    public void display() {
        System.out.println("Pizza Ingredients:");
        System.out.println("Dough: " + this.getDough().getClassName());
        System.out.println("Cheese: " + this.getCheese().getClassName());
        System.out.println("Toppings: " + this.getToppings());
    }
}
