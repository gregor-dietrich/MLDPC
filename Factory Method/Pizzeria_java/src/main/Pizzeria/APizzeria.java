package main.Pizzeria;

import main.Pizzeria.Pizza.APizza;

public abstract class APizzeria {
    private String className;
    protected abstract APizza createPizza(pizzaType type);

    public final APizza orderPizza(pizzaType type) {
        System.out.println("Ordering " + type + " from " + this.getPizzeriaName());
        APizza pizza = this.createPizza(type);
        System.out.println(pizza.getPizzaName() + " has been finished!");
        System.out.println();
        return pizza;
    }

    public enum pizzaType {FUNGHI, HAWAII, MARGHERITA, SALAMI, TONNO}

    public String getPizzeriaName() {
        if (this.getClassName() == null) {
            var name = this.getClass().getName().split("\\.");
            this.setClassName(name[name.length - 1]);
        }
        return this.getClassName();
    }

    private String getClassName() {
        return className;
    }

    private void setClassName(String className) {
        this.className = className;
    }
}
