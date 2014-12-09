package me.briandubois;

import java.util.Scanner;

public class AverageSimple {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter your numbers:");
        Double numberS = kboard.nextDouble() + kboard.nextDouble() + kboard.nextDouble();
        System.out.println("Your average is:" + numberS / 3);
        //Delete the kboard.close if needed
        kboard.close();
    }
}