package main.SimpleShape;

import main.I2DShape;

public final class Polygon implements I2DShape {
    private double sideLength;
    private int edges;

    public Polygon(final int edges, final double sideLength) {
        this.setEdges(edges);
        this.setSideLength(sideLength);
    }

    @Override
    public double getArea() {
        final var triangle = new Triangle(this.getOuterRadius(), this.getOuterRadius(), sideLength);
        return edges * triangle.getArea();
    }

    @Override
    public double getPerimeter() {
        return edges * sideLength;
    }

    public double getInnerRadius() {
        return (sideLength / 2) * (1 / Math.tan(Math.PI / edges));
    }

    public double getOuterRadius() {
        return (sideLength / 2) * (1 / Math.sin(Math.PI / edges));
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(final double sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException();
        this.sideLength = sideLength;
    }

    public int getEdges() {
        return edges;
    }

    public void setEdges(final int edges) {
        if (edges < 3) throw new IllegalArgumentException();
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "Polygon with " + edges + " edges and given side length: " + sideLength + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter();
    }
}
