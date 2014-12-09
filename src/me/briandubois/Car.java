package me.briandubois;//Brian DuBois

public class Car {
    //Data
    private String model;
    private double position;
    private double totalDistance;
    private boolean isBroken;

    //Contructors
    public Car() {
        model = " ";
        position = 0;
        totalDistance = 0;
        isBroken = false;
    }

    public Car(String a, double b) {
        model = a;
        position = b;
        totalDistance = 0;
        isBroken = false;
    }

    public Car(String a, double b, double c, boolean d) {
        model = a;
        position = b;
        totalDistance = c;
        isBroken = d;
    }

    //Main Methods
    public double getPosition() {
        return position;
    }

    public String getModel() {
        return model;
    }

    public double gettotalDistance() {
        return totalDistance;
    }

    public boolean getisBroken() {
        return isBroken;
    }

    public void drive(double d) {
        if (getisBroken() == false) {
            position += d;
            if (d < 0) {
                d *= -1;
            } else {
                d = d;
            }
            totalDistance += d;
        } else {
            System.out.println("Your " + getModel() + " is broken, it can't drive.");
        }
    }
}