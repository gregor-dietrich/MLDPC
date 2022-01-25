package main.Ressourcen.Composites;

public abstract class AComplexComposite extends AComposite {
    protected abstract double getPersonnelCost();

    protected final double getMaterialCost() {
        return super.getPrice();
    }

    @Override
    public final double getPrice() {
        return this.getPersonnelCost() + this.getMaterialCost();
    }
}
