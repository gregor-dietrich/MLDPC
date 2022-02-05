package main.SimpleShape;

import main.I2DShape;

public final class Circle implements I2DShape {
    private double radius;

    public Circle(final double radius) {
        this.setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        if (radius <= 0) throw new IllegalArgumentException();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with given radius: " + radius + "\nArea: " + this.getArea() + "\nPerimeter: "
                + this.getPerimeter();
    }
}
