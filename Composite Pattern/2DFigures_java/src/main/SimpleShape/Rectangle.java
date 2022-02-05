package main.SimpleShape;

import main.I2DShape;

public final class Rectangle implements I2DShape {
    private double aLength;
    private double bLength;

    public Rectangle(final double aLength, final double bLength) {
        this.setaLength(aLength);
        this.setbLength(bLength);
    }

    @Override
    public double getArea() {
        return aLength * bLength;
    }

    @Override
    public double getPerimeter() {
        return 2 * (aLength + bLength);
    }

    public boolean isSquare() {
        return aLength == bLength;
    }

    public double getaLength() {
        return aLength;
    }

    public void setaLength(final double aLength) {
        if (aLength <= 0) throw new IllegalArgumentException();
        this.aLength = aLength;
    }

    public double getbLength() {
        return bLength;
    }

    public void setbLength(final double bLength) {
        if (bLength <= 0) throw new IllegalArgumentException();
        this.bLength = bLength;
    }

    @Override
    public String toString() {
        return "Rectangle with given sides a: " + aLength + ", b: " + bLength + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter() + "\nSquare: " + (this.isSquare() ? "yes" : "no");
    }
}
