package me.briandubois;// Brian DuBois

public class ThePoint {
    //data

    private double x;

    private double y;

    //contstructors

    public ThePoint() {
        x = 0;
        y = 0;
    }

    public ThePoint(double a, double b) {
        x = a;
        y = b;
    }

    //methods

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setLocation(double a, double b) {
        x = a;
        y = b;
    }

    public void translate(double a, double b) {
        x += a;
        y += b;
    }

    public double dist() {
        return Math.sqrt((x * x) + (y * y));
    }
}
