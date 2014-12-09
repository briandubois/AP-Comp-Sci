package me.briandubois.Shapes;

import me.briandubois.Point;

/**
 * @author Brian DuBois
 */
public class Quadrilateral {
    protected Point topL = new Point(0, 0);
    protected Point topR = new Point(0, 0);
    protected Point botL = new Point(0, 0);
    protected Point botR = new Point(0, 0);

    public Quadrilateral(double x, double y, double s, double t, double a, double b, double n, double m) {
        topL.setLocation(x, y);
        topR.setLocation(s, t);
        botL.setLocation(a, b);
        botR.setLocation(n, m);
    }

    public double getArea() {
        return ((botR.getX() - botL.getX()) * (topL.getY() - botL.getY()));
    }
}