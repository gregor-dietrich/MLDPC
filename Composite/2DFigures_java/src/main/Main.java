package main;

import main.ComplexShape.Star;
import main.ComplexShape.StickFigure;
import main.SimpleShape.Circle;
import main.SimpleShape.Polygon;
import main.SimpleShape.Rectangle;
import main.SimpleShape.Triangle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final var shapes = new ArrayList<I2DShape>();
        shapes.add(new Triangle(3, 4, 5));
        shapes.add(new Triangle(2, 1));
        shapes.add(new Triangle(1));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Rectangle(4, 4));
        shapes.add(new Circle(1));
        shapes.add(new Circle(5));
        shapes.add(new Polygon(3, 1));
        shapes.add(new Polygon(4, 4));
        shapes.add(new Polygon(5, 8));
        shapes.add(new Star(5, 1));
        shapes.add(new Star(6, 1));
        shapes.add(new StickFigure(1));

        shapes.stream().map(shape -> shape + "\n").forEach(System.out::println);
    }
}
