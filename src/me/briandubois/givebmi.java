package me.briandubois;//Brian DuBois

import java.util.Scanner;

public class givebmi {

    //Data
    private double h;

    private double w;

    //Constructors
    public givebmi() {
        h = 0;
        w = 0;
    }

    public givebmi(double a, double b) {
        h = a;
        w = b;
    }

    //Setter, Getter Methods
    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public void Set(double a, double b) {
        h = a;
        w = b;
    }

    public double getBMI() {
        return (((w) / (h * h)) * 703);
    }

    //Main method
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        givebmi a1 = new givebmi(5, 370);
        givebmi a2 = new givebmi(70, 140);

        // Getting the BMI
        System.out.print("Enter your height (in inches):");
        double Height = kboard.nextDouble();
        System.out.print("Enter your weight (in pounds):");
        double Weight = kboard.nextDouble();
        a1.Set(Height, Weight);

        System.out.println("You have entered: " + a1.getH() + " inches, and " + a1.getW() + " pounds");

        System.out.println("Your BMI is: " + a1.getBMI());

        if (a1.getBMI() >= 30.0) {
            System.out.println("You are obese, get a trainer.");
        } else if (a1.getBMI() >= 25.0) {
            System.out.println("You are overweight, eat healthier.");
        } else if (a1.getBMI() >= 18.5) {
            System.out.println("You are average weight. Go you!");
        } else {
            System.out.println("You are underweight. Eat more butter!.");
        }
    }
}
