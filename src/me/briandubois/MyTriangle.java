package me.briandubois;

import me.briandubois.Point;

/**
 * @author Brian DuBois
 */
public class MyTriangle {
    private Point v1 = new Point();
    private Point v2 = new Point();
    private Point v3 = new Point();
    private double[] dists = new double[3];

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1.setLocation(x1, y1);
        v2.setLocation(x2, y2);
        v3.setLocation(x3, y3);
    }

    public MyTriangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "Triangle @ (" + v1.getX() + "," + v1.getY() + ")," + "(" + v2.getX() + "," + v2.getY() + ")," + "(" + v3.getX() + "," + v3.getY() + ")";
    }

    public double getPerimeter() {
        double perimeter = 0;

        dists[0] = Point.getDistance(v1, v2);
        dists[1] = Point.getDistance(v1, v3);
        dists[2] = Point.getDistance(v2, v3);

        perimeter = dists[0] + dists[1] + dists[2];
        return perimeter;
    }

    public void printType() {
        if ((dists[0] == dists[1]) && (dists[0] == dists[2]) && (dists[1] == dists[2])) {
            System.out.println("It is equalateral.");
        } else if ((dists[0] == dists[1]) || (dists[0] == dists[2]) || (dists[1] == dists[2])) {
            System.out.println("It is isosceles.");
        } else
            System.out.println("It is scalene.");
    }
}