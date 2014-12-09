package me.briandubois.Shapes;

import me.briandubois.Shapes.Quadrilateral;

/**
 * @author Brian DuBois
 */
public class Parallelogram extends Quadrilateral {
    public Parallelogram(double x, double y, double s, double t, double a, double b, double n, double m) {
        super(x, y, s, t, a, b, n, m);
    }

    public String toString() {
        return "Shape: Parallelogram, Area: " + getArea();
    }
}