package main.ComplexShape;

import main.I2DShape;
import main.SimpleShape.Polygon;
import main.SimpleShape.Triangle;

public final class Star implements I2DShape {
    private double innerSideLength;
    private int points;
    private Triangle triangle;
    private Polygon pentagon;

    public Star(final int points, final double innerSideLength) {
        if (points < 3 || innerSideLength <= 0) throw new IllegalArgumentException();
        this.points = points;
        this.innerSideLength = innerSideLength;
        this.triangle = new Triangle(innerSideLength * 1.5, innerSideLength * 1.5, innerSideLength);
        this.pentagon = new Polygon(points, innerSideLength);
    }

    @Override
    public double getArea() {
        return points * triangle.getArea() + pentagon.getArea() ;
    }

    @Override
    public double getPerimeter() {
        return points * triangle.getPerimeter() - pentagon.getPerimeter();
    }

    public double getInnerSideLength() {
        return innerSideLength;
    }

    public void setInnerSideLength(final double innerSideLength) {
        if (innerSideLength <= 0) throw new IllegalArgumentException();
        this.innerSideLength = innerSideLength;
        this.triangle = new Triangle(innerSideLength * 1.5, innerSideLength * 1.5, innerSideLength);
        this.pentagon = new Polygon(points, innerSideLength);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(final int points) {
        if (points < 3) throw new IllegalArgumentException();
        this.points = points;
        this.pentagon = new Polygon(points, innerSideLength);
    }

    @Override
    public String toString() {
        return points + "-pointed Star with given inner side length: " + innerSideLength + "\nArea: "
                + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
}
