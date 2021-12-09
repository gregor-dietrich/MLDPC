package main;

public abstract class AComponent {
    private double price;
    private String description;

    public double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final var name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
}
