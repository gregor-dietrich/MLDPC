package main.Lego;

public final class LegoPiece implements ILego {
    private double price;
    private int size;
    private String color;

    public LegoPiece() {
        this.setColor("");
        this.setPrice(0);
        this.setSize(0);
    }

    public LegoPiece(final String color, final double price, final int size) {
        this.setColor(color);
        this.setPrice(price);
        this.setSize(size);
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}
