package main.Pizzeria;

import main.Pizzeria.Pizza.APizza;

public abstract class APizzeria {
    private String className;

    protected abstract APizza createPizza(final pizzaType type);

    public final APizza orderPizza(final pizzaType type) {
        System.out.println("Ordering " + type + " from " + this.getPizzeriaName());
        final var pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        System.out.println(pizza.getPizzaName() + " has been finished!");
        System.out.println();
        return pizza;
    }

    public final String getPizzeriaName() {
        if (this.getClassName() == null) {
            final var name = this.getClass().getName().split("\\.");
            this.setClassName(name[name.length - 1]);
        }
        return this.getClassName();
    }

    private String getClassName() {
        return className;
    }

    private void setClassName(final String className) {
        this.className = className;
    }

    public enum pizzaType {FUNGHI, HAWAII, MARGHERITA, SALAMI, TONNO}
}
