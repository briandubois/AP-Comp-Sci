package me.briandubois;

import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter your first number:");
        Double numberOne = kboard.nextDouble();
        System.out.print("Enter your next number:");
        Double numberTwo = kboard.nextDouble();
        System.out.print("Enter your last number:");
        Double numberThree = kboard.nextDouble();
        System.out.println("Your average is:");
        System.out.println((numberOne + numberTwo + numberThree) / 3);
    }
}