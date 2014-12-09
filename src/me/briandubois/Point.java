package me.briandubois;

public class Point {
    private double x; //instance variables, instance fields
    private double y;

    //constructors

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double a, double b) {
        x = a;
        y = b;
    }

    //methods (accessors

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //mutators

    public void changeX(double a) {
        x = a;
    }

    public void changeY(double a) {
        y = a;
    }

    public void setLocation(double a, double b) {
        x = a;
        y = b;
    }

    public static double getDistance(Point a, Point b) {
        return Math.sqrt(((a.getX() * b.getX()) * (a.getX() * b.getX())) + ((a.getY() * b.getY()) * (a.getY() * b.getY())));
    }
}