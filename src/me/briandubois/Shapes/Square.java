package me.briandubois.Shapes;

import me.briandubois.Shapes.Rectangle;

/**
 * @author Brian DuBois
 */
public class Square extends Rectangle {
    public Square(double x, double y, double s, double t, double a, double b, double n, double m) {
        super(x, y, s, t, a, b, n, m);
    }

    public String toString() {
        return "Shape: Square, Area: " + getArea();
    }
}