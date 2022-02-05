package main.ComplexShape;

import main.I2DShape;
import main.SimpleShape.Circle;
import main.SimpleShape.Rectangle;

public final class StickFigure implements I2DShape {
    private double scale;
    private Circle head;
    private Circle body;
    private Rectangle limb;
    private Rectangle neck;

    public StickFigure(final double scale) {
        this.setScale(scale);
    }

    @Override
    public double getArea() {
        return head.getArea() + body.getArea() + neck.getArea() + 4 * limb.getArea();
    }

    @Override
    public double getPerimeter() {
        return head.getPerimeter() + body.getPerimeter() + neck.getPerimeter() + 4 * (limb.getPerimeter() - scale / 2);
    }

    public double getScale() {
        return scale;
    }

    public void setScale(final double scale) {
        if (scale <= 0) throw new IllegalArgumentException();
        this.scale = scale;
        this.head = new Circle(scale * 1.3);
        this.body = new Circle(scale * 2);
        this.neck = new Rectangle(scale, scale);
        this.limb = new Rectangle(scale / 2, scale * 4);
    }

    @Override
    public String toString() {
        return "Stick Figure with scale: " + scale + "\nArea: " + this.getArea() + "\nPerimeter: "
                + this.getPerimeter();
    }
}
