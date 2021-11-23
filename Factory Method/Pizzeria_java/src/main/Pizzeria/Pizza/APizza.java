package main.Pizzeria.Pizza;

public abstract class APizza {
    private String className;
    private boolean prepared;
    private boolean baked;
    private boolean cut;

    public APizza() {
        this.setPrepared(false);
        this.setBaked(false);
        this.setCut(false);
    }

    public final void prepare() {
        if (!this.isPrepared()) {
            this.setPrepared(true);
            System.out.println("Preparing " + this.getPizzaName() + "...");
        }
    }

    public final void bake() {
        if (this.isPrepared() && !this.isBaked()) {
            this.setBaked(true);
            System.out.println("Baking " + this.getPizzaName() + "...");
        }
    }

    public final void cut() {
        if (this.isPrepared() && this.isBaked() && !this.isCut()) {
            this.setCut(true);
            System.out.println("Cutting " + this.getPizzaName() + "...");
        }
    }

    public final boolean isPrepared() {
        return prepared;
    }

    private void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public final boolean isBaked() {
        return baked;
    }

    private void setBaked(boolean baked) {
        this.baked = baked;
    }

    public final boolean isCut() {
        return cut;
    }

    private void setCut(boolean cut) {
        this.cut = cut;
    }

    public String getPizzaName() {
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
