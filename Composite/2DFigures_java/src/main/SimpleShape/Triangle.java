package main.SimpleShape;

import main.I2DShape;

public final class Triangle implements I2DShape {
    private double aLength;
    private double bLength;
    private double cLength;

    public Triangle(final double aLength, final double bLength, final double cLength) {
        if (!isValid(aLength, bLength, cLength)) throw new IllegalArgumentException();
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }

    public Triangle(final double legLength, final double baseLength) {
        this(legLength, legLength, baseLength);
    }

    public Triangle(final double sideLength) {
        this(sideLength, sideLength);
    }

    public static boolean isValid(final double aLength, final double bLength, final double cLength) {
        if (aLength <= 0 || bLength <= 0 || cLength <= 0) return false;
        return aLength + bLength > cLength && bLength + cLength > aLength && cLength + aLength > bLength;
    }

    @Override
    public double getArea() {
        final var s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - aLength) *  (s - bLength) *  (s - cLength));
    }

    @Override
    public double getPerimeter() {
        return aLength + bLength + cLength;
    }

    public double getHeight() {
        return 2 * this.getArea() / this.getHypotenuse();
    }

    public double getHypotenuse() {
        return Math.max(aLength, Math.max(bLength, cLength));
    }

    public boolean isRightAngled() {
        final double hypotenuse = this.getHypotenuse();
        final double leg, otherLeg;
        if (hypotenuse == aLength) {
            leg = bLength;
            otherLeg = cLength;
        }
        else if (hypotenuse == bLength) {
            leg = aLength;
            otherLeg = cLength;
        }
        else {
            leg = aLength;
            otherLeg = bLength;
        }
        return Math.pow(leg, 2) + Math.pow(otherLeg, 2) == Math.pow(hypotenuse, 2);
    }

    public double getaLength() {
        return aLength;
    }

    public void setaLength(final double aLength) {
        if (aLength <= 0) throw new IllegalArgumentException();
        if (isValid(aLength, bLength, cLength))
            this.aLength = aLength;
        else
            System.out.println("Error: New length incompatible with other lengths' values.");
    }

    public double getbLength() {
        return bLength;
    }

    public void setbLength(final double bLength) {
        if (bLength <= 0) throw new IllegalArgumentException();
        if (isValid(aLength, bLength, cLength))
            this.bLength = bLength;
        else
            System.out.println("Error: New length incompatible with other lengths' values.");
    }

    public double getcLength() {
        return cLength;
    }

    public void setcLength(final double cLength) {
        if (cLength <= 0) throw new IllegalArgumentException();
        if (isValid(aLength, bLength, cLength))
            this.cLength = cLength;
        else
            System.out.println("Error: New length incompatible with other lengths' values.");
    }

    @Override
    public String toString() {
        return "Triangle with given sides a: " + aLength + ", b: " + bLength + ", c: " + cLength + "\nArea: "
                + this.getArea() + "\nPerimeter: " + this.getPerimeter() + "\nHeight: " + this.getHeight()
                + "\nHypotenuse: " + this.getHypotenuse() + "\nRight-angled: " + (this.isRightAngled() ? "yes" : "no");
    }
}
