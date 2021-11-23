package main.Pizzeria.Pizza;

public class AIngredient {
    private String className;

    public String getClassName() {
        if (this.getName() == null) {
            var name = this.getClass().getName().split("\\.");
            this.setName(name[name.length - 1]);
        }
        return this.getName();
    }

    private String getName() {
        return className;
    }

    private void setName(String className) {
        this.className = className;
    }
}
