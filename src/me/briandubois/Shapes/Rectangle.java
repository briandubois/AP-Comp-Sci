package me.briandubois.Shapes;

import me.briandubois.Shapes.Parallelogram;

/**
 * @author Brian DuBois
 */
public class Rectangle extends Parallelogram {
    public Rectangle(double x, double y, double s, double t, double a, double b, double n, double m) {
        super(x, y, s, t, a, b, n, m);
    }

    public String toString() {
        return "Shape: Rectangle, Area: " + getArea();
    }
}