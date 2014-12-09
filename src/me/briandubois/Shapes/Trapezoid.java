package me.briandubois.Shapes;

import me.briandubois.Shapes.Quadrilateral;

/**
 * @author Brian DuBois
 */
public class Trapezoid extends Quadrilateral {
    public Trapezoid(double x, double y, double s, double t, double a, double b, double n, double m) {
        super(x, y, s, t, a, b, n, m);
    }

    public double getArea() {
        return (((topR.getX() - topL.getX()) + (botR.getX() - botL.getX()) / 2) * (topL.getY() - botL.getY()));
    }

    public String toString() {
        return "Shape: Trapezoid, Area: " + getArea();
    }
}